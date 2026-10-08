# Vértices de articulação com `Biconnected.java`

Um **vértice de articulação** é aquele cuja remoção, junto com suas arestas, aumenta o número de componentes conexas do grafo. A classe [`Biconnected.java`](../../../algs4-java/algs4/Biconnected.java) identifica esses vértices por busca em profundidade (**DFS**), usando `preorder` e `low`.

Vamos usar o mesmo grafo de referência das [notas sobre pontes](notas_pontes.md). Assim, podemos observar como a remoção de um **vértice** difere da remoção de uma **aresta**.

## 1. Grafo de referência e árvore DFS

```text
0: 1
1: 0, 2, 3
2: 1, 3
3: 1, 2
```

```text
0
|
1
|\
| \
2--3
```

Considere a ordem de descoberta `0 → 1 → 2 → 3`. As arestas da árvore DFS são `0—1`, `1—2` e `2—3`. A aresta `3—1` liga `3` ao ancestral `1` e é uma **aresta de retorno**:

A árvore da DFS e a aresta de retorno:

```text
A = aresta da árvore
R = aresta de retorno

0
│ A
└── 1◀───────────┐
    │ A          │
    └── 2        │ R
        │ A      │
        └── 3 ───┘
```

O **pai** de `2` na árvore é `1`, e `3` é descendente de `1`. Essas relações dependem da DFS. Elas não são propriedades fixas do grafo original.

## 2. Valores de `preorder` e `low`

`preorder[v]` registra a ordem em que a DFS descobre `v`. É o mesmo valor chamado `pre[v]` nas notas sobre pontes.

`low[v]` é o menor valor entre `preorder[v]` e os valores `preorder` dos ancestrais alcançados por uma aresta de retorno que sai de `v` ou de seus descendentes. A aresta pela qual a DFS chegou a `v` não conta como retorno. Inicialmente, `low[v] = preorder[v]`.

```text
v             0   1   2   3
preorder[v]   0   1   2   3
```

Ao examinar `3—1`, a DFS reduz `low[3]` a `preorder[1] = 1`. Na volta da recursão, esse valor é propagado aos pais:

```text
3 examina 3—1:      low[3] = min(preorder[3], preorder[1]) = min(3, 1) = 1
3 retorna para 2:   low[2] = min(preorder[2], low[3])      = min(2, 1) = 1
2 retorna para 1:   low[1] = min(preorder[1], low[2])      = min(1, 1) = 1
1 retorna para 0:   low[0] = min(preorder[0], low[1])      = min(0, 1) = 0
```

| Vértice | Pai na DFS | `preorder` | `low` |
| ------- | ---------- | ---------- | ----- |
| `0`     | raiz       | 0          | 0     |
| `1`     | `0`        | 1          | 1     |
| `2`     | `1`        | 2          | 1     |
| `3`     | `2`        | 3          | 1     |

## 3. Teste para um vértice que não é raiz

Considere um vértice `v` e um filho `w` na árvore DFS. Depois que a busca termina de explorar a subárvore de `w`, `Biconnected.java` testa:

```text
low[w] >= preorder[v]
```

Se o teste é verdadeiro, a subárvore de `w` não alcança nenhum **ancestral de `v`** por outro caminho. Ela pode alcançar o próprio `v`, mas isso não resolve a separação quando **`v` é removido**. Nesse caso, `v` é um vértice de articulação.

Para `v = 1` e seu filho `w = 2`:

```text
low[2] >= preorder[1]
1 >= 1              VERDADEIRO
```

O retorno `3—1` explica a **igualdade**. A subárvore de `2` consegue voltar até `1`, mas não consegue alcançar `0` sem passar por `1`. Remover `1` deixa `0` separado do par `2—3`. Portanto, **`1` é um vértice de articulação**.

Para `v = 2` e seu filho `w = 3`:

```text
low[3] >= preorder[2]
1 >= 2              FALSO
```

A aresta `3—1` permite à subárvore de `3` alcançar `1`, que é ancestral de `2`. Mesmo após remover `2`, `3` continua ligado a `1` e a `0`. Logo, **`2` não é articulação**. O vértice `3` não tem filho DFS e também não é articulação.

## 4. Teste especial para a raiz

A raiz não tem pai nem ancestral acima dela. Por isso, `Biconnected.java` usa outra regra: a raiz é articulação somente quando possui **mais de um filho na árvore DFS**.

```text
children > 1
```

Neste exemplo, `0` tem apenas um filho DFS, o vértice `1`. Remover `0` deixa o ciclo `1—2—3—1` conectado. Portanto, **`0` não é articulação**.

Aplicar à raiz o teste dos vértices comuns daria `low[1] >= preorder[0]`, isto é, `1 >= 0`, um resultado verdadeiro que **não** indica articulação. Essa é a razão do tratamento especial no código.

| Vértice | Teste decisivo                     | Articulação? |
| ------- | ---------------------------------- | ------------ |
| `0`     | raiz com 1 filho DFS               | Não          |
| `1`     | `low[2] >= preorder[1]` → `1 >= 1` | **Sim**      |
| `2`     | `low[3] >= preorder[2]` → `1 >= 2` | Não          |
| `3`     | sem filhos DFS                     | Não          |

**`1` é o único vértice de articulação deste grafo.** A classe guarda um marcador booleano por vértice, de modo que um vértice entra uma única vez na contagem, mesmo se vários filhos satisfizerem o teste.

## 5. Relação com as pontes

No mesmo grafo, `0—1` é uma **ponte**, mas `0` não é vértice de articulação. Retirar a aresta separa `0` dos demais. Retirar o vértice `0` deixa `1`, `2` e `3` conectados.

Já `1—2` **não é ponte**, pois o caminho `1 → 3 → 2` substitui essa aresta. Mesmo assim, `1` é articulação: ao remover o vértice, desaparecem também suas ligações com `0`, `2` e `3`.

Essa diferença aparece nas comparações. A condição de ponte é `low[w] > preorder[v]`. Para articulação de um vértice não raiz, a condição é `low[w] >= preorder[v]`. A igualdade `low[2] = preorder[1]` protege a aresta `1—2`, mas não protege o vértice `1`.

## 6. Consulta com `Biconnected.java`

As arestas podem ser inseridas nesta ordem para reproduzir a DFS usada no texto. A classe `Graph` percorre a lista de adjacência na ordem inversa à inserção:

```java
Graph graph = new Graph(4);
graph.addEdge(0, 1);
graph.addEdge(1, 3);
graph.addEdge(1, 2);
graph.addEdge(2, 3);

Biconnected biconnected = new Biconnected(graph);
for (int v = 0; v < graph.V(); v++) {
    if (biconnected.isArticulation(v)) {
        System.out.println(v);
    }
}
// Saída: 1
```

`isArticulation(v)` informa se `v` foi marcado como articulação. O construtor percorre todas as componentes do grafo, iniciando uma nova DFS quando encontra um vértice ainda não visitado.
