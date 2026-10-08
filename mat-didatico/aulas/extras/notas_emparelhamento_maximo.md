# Emparelhamento máximo em grafos bipartidos

Um **grafo bipartido** tem duas partes de vértices, `L` e `R`, e cada aresta liga uma parte à outra. O problema de emparelhamento máximo consiste em escolher a maior quantidade possível de arestas sem que duas delas compartilhem um vértice.

Neste exemplo, os sufixos `L` e `R` indicam a parte de cada vértice. Todas as seis arestas do grafo aparecem no desenho:

```text
       1L-----2R
      /         \
    3R           3L
      \         /
       2L-----1R
```

Vamos calcular um emparelhamento com as classes `HopcroftKarp` e `BipartiteMatching` do algs4. As duas chegam ao tamanho máximo, mas organizam de modo diferente as buscas pelos caminhos aumentantes.

## 1. Grafo de referência

Considere as partes `L = {1L, 2L, 3L}` e `R = {1R, 2R, 3R}`. Os seis vértices são distintos, mesmo quando têm o mesmo número. As arestas do exemplo são:

```text
1L—2R   1L—3R
2L—1R   2L—3R
3L—1R   3L—2R
```

Na ordem de exame usada adiante, as listas de adjacência dos dois lados são:

```text
1L: 2R, 3R      1R: 2L, 3L
2L: 1R, 3R      2R: 1L, 3L
3L: 1R, 2R      3R: 1L, 2L
```

O grafo é bipartido porque todas as arestas vão de `L` a `R`. A ausência de arestas como `1L—1R` é apenas uma escolha deste exemplo. Uma aresta desse tipo também seria válida em um grafo bipartido.

Um **emparelhamento** `M` é um conjunto de arestas sem vértices em comum. Cada vértice pode pertencer, portanto, a no máximo uma aresta de `M`. Um vértice é **livre** quando não participa de `M` e **saturado** quando participa.

## 2. Como aumentar um emparelhamento

Um **caminho alternante** intercala arestas fora de `M` e arestas de `M`. Quando começa e termina em vértices livres, é um **caminho aumentante**. Ao trocar as arestas escolhidas pelas não escolhidas nesse caminho, `|M|` aumenta em um.

Na ordem de adjacência indicada acima, os dois primeiros aumentos escolhem:

```text
M = {}

1R → 2L             M = {2L—1R}                    |M| = 1
2R → 1L             M = {2L—1R, 1L—2R}            |M| = 2
```

Agora `3R` está livre. Seu vizinho `1L` já está emparelhado com `2R`. A busca pode atravessar esse par ocupado em sentido inverso e continuar até `3L`, que também está livre:

```text
3R --[fora de M]--> 1L --[em M]--> 2R --[fora de M]--> 3L
```

A aresta central `1L—2R` pertence a `M`. As outras duas ainda não foram escolhidas.

Ao inverter o caminho, retiramos `1L—2R` e acrescentamos `1L—3R` e `3L—2R`:

```text
Antes:   M = {2L—1R, 1L—2R}                    |M| = 2
Depois:  M = {2L—1R, 1L—3R, 3L—2R}             |M| = 3
```

O vértice `1L` deixa de ser emparelhado com `2R` e passa a ser emparelhado com `3R`. Assim, `2R` pode ser emparelhado com `3L`. **A troca de um par provisório permite acrescentar mais um par sem repetir vértices.**

## 3. Como as duas classes encontram os aumentos

Para reproduzir a ordem dos rastreios, numere os vértices como `1L=0`, `2L=1`, `3L=2`, `1R=3`, `2R=4` e `3R=5`. Nessa numeração, `BipartiteX` atribui ao lado `R` a cor usada pelas duas classes para iniciar as buscas. Elas começam pelos vértices livres de `R` e percorrem o caminho aumentante em direção aos vértices livres de `L`.

No `Graph` do algs4, cada lista de adjacência é percorrida na ordem inversa à inserção. O trecho abaixo constrói exatamente as listas mostradas acima:

```java
Graph G = new Graph(6);
G.addEdge(1, 5); // 2L—3R
G.addEdge(2, 4); // 3L—2R
G.addEdge(0, 5); // 1L—3R
G.addEdge(2, 3); // 3L—1R
G.addEdge(0, 4); // 1L—2R
G.addEdge(1, 3); // 2L—1R

HopcroftKarp hk = new HopcroftKarp(G);
BipartiteMatching bm = new BipartiteMatching(G);
```

### `BipartiteMatching`: uma BFS por aumento

[`BipartiteMatching.java`](../../../algs4-java/algs4/BipartiteMatching.java) faz uma **BFS** que termina ao encontrar um caminho aumentante. A classe usa `edgeTo` para reconstruir o caminho, atualiza os pares em `mate` e inicia outra BFS. Nesta instância, as buscas produzem:

| Busca | Caminho encontrado        | Tamanho de `M` |
| ----- | ------------------------- | -------------- |
| 1     | `1R → 2L`                 | 1              |
| 2     | `2R → 1L`                 | 2              |
| 3     | `3R → 1L → 2R → 3L`       | 3              |
| 4     | nenhum caminho aumentante | 3              |

Na terceira BFS, `edgeTo` registra a passagem de `1L` para `2R` pela aresta que já pertence a `M`. Essa aresta sai do emparelhamento quando o caminho é invertido.

### `HopcroftKarp`: buscas por fases

[`HopcroftKarp.java`](../../../algs4-java/algs4/HopcroftKarp.java) usa uma **BFS** para definir os níveis dos caminhos aumentantes mais curtos. Depois, faz buscas em profundidade (**DFS**) que seguem esses níveis. Vários caminhos podem ser aumentados antes de uma nova BFS. Esse conjunto de aumentos forma uma **fase**.

| Fase | Caminhos usados                               | Tamanho de `M` |
| ---- | --------------------------------------------- | -------------- |
| 1    | `1R → 2L` e `2R → 1L`, ambos de comprimento 1 | 2              |
| 2    | `3R → 1L → 2R → 3L`, de comprimento 3         | 3              |

Depois da segunda fase, não resta vértice livre em `R`. A próxima BFS não encontra caminho aumentante.

**As duas classes chegam ao mesmo emparelhamento neste rastreio.** `BipartiteMatching` procura um caminho por BFS. `HopcroftKarp` procura vários caminhos mais curtos por fase. Uma ordem diferente de exame das arestas pode produzir outro emparelhamento máximo igualmente válido.

Para um grafo com `V` vértices e `E` arestas, o custo no pior caso é `O((V + E)V)` para `BipartiteMatching` e `O((V + E)√V)` para `HopcroftKarp`.

## 4. Máximo não significa necessariamente perfeito

Um emparelhamento é **máximo** quando não existe outro com mais arestas. O critério de parada é a ausência de caminhos aumentantes. Um emparelhamento é **perfeito** quando todos os vértices estão saturados.

Neste grafo, `|M| = 3` cobre os seis vértices. Assim, o emparelhamento é **máximo e perfeito**. Seus pares finais são:

```text
1L—3R
2L—1R
3L—2R
```

Em outro grafo, as buscas podem terminar sem caminho aumentante e ainda deixar vértices livres. Nesse caso, o emparelhamento é máximo, mas não perfeito. Por exemplo, se `3L` fosse isolado, nenhum emparelhamento poderia cobrir todos os vértices, embora ainda existisse um emparelhamento máximo.

As duas classes oferecem `size()` para consultar `|M|`, `mate(v)` para consultar o parceiro de um vértice e `isPerfect()` para verificar se todos os vértices foram emparelhados. Neste grafo, `size() == 3` e `isPerfect()` retorna `true`.

## Referências

- [HopcroftKarp.java](../../../algs4-java/algs4/HopcroftKarp.java) e [BipartiteMatching.java](../../../algs4-java/algs4/BipartiteMatching.java), implementações do algs4.
- [Graph.java](../../../algs4-java/algs4/Graph.java) e [BipartiteX.java](../../../algs4-java/algs4/BipartiteX.java), grafo e verificação da bipartição usados pelas classes.
