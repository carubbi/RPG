# AV2 - Questões ENADE em Construção

Base: [`selecao_exercicios_por_assunto.md`](selecao_exercicios_por_assunto.md).

Regra de representação: todo grafo usado nas questões deve aparecer como lista de adjacência, exceto instâncias completas ponderadas de TSP, que podem aparecer como matriz de custos. Quando a fonte original depender de figura, a representação convertida deve ser conferida antes da adaptação final.

## Questões prontas ou com conversão conferida

### Questão 1 - Busca em largura - BFS

Considere o grafo não dirigido `G`, representado pela lista de adjacência a seguir. A BFS deve iniciar no vértice `0`, e os vizinhos devem ser examinados em ordem crescente.

```text
0: 5, 6
1: 4
2: 5, 6, 9
3: 7, 8
4: 1, 6, 9
5: 0, 2
6: 0, 2, 4
7: 3, 8
8: 3, 7
9: 2, 4
```

Analise as afirmações:

I. A ordem de descoberta dos vértices alcançáveis a partir de `0` é `0, 5, 6, 2, 4, 9, 1`.

II. O vértice `9` está no nível `2` da BFS iniciada em `0`.

III. Os vértices `3`, `7` e `8` não são alcançáveis a partir de `0`.

IV. Usando lista de adjacência, a BFS examina vértices e arestas em tempo `O(|V| + |E|)`.

É correto o que se afirma em:

A. I, apenas.
B. II, apenas.
C. I e III, apenas.
D. II e IV, apenas.
E. I, III e IV, apenas.

### Questão 2 - Busca em profundidade - DFS

Considere o grafo direcionado `G`, representado pela lista de adjacência a seguir. A DFS deve iniciar no vértice `0`, e os vizinhos de saída devem ser examinados em ordem crescente.

```text
0: 5, 6
1: 4
2: 6, 9
3: 7, 8
4: 9
5: 2
6: 4
7: 8
8:
9:
```

Analise as afirmações:

I. Uma ordem de descoberta produzida pela DFS a partir de `0` é `0, 5, 2, 6, 4, 9`.

II. A pilha de recursão da DFS representa o caminho ativo da exploração; neste grafo, ao descobrir `4`, a pilha contém `0, 5, 2, 6, 4`.

III. A DFS iniciada em `0` descobre `8`, pois existe o arco `7 -> 8`.

IV. Com lista de adjacência, a DFS tem complexidade `O(|V| + |E|)`.

É correto o que se afirma em:

A. I e II, apenas.
B. II e III, apenas.
C. I, II e IV, apenas.
D. I, III e IV, apenas.
E. I, II, III e IV.

### Questão 3 - Classificação de Percursos em Grafos

- Exercício-base: Goldbarg Cap. 1, Ex. 1, usando o grafo 2 da figura.
- Status: lista de adjacência ponderada conferida conforme a figura.

Considere o grafo não dirigido e ponderado `G` representado pela lista de adjacência a seguir. Para classificar os percursos, considere a existência das arestas; os pesos são informados apenas para manter a representação fiel à figura.

```text
1: 2(2), 3(4), 4(1)
2: 1(2), 3(7), 4(3), 7(3)
3: 1(4), 2(7), 5(9), 6(3), 7(9)
4: 1(1), 2(3), 8(1), 9(7)
5: 3(9), 6(1)
6: 3(3), 5(1), 7(2), 10(8)
7: 2(3), 3(9), 6(2), 8(1), 11(1), 12(8)
8: 4(1), 7(1), 9(4), 12(4)
9: 4(7), 8(4)
10: 6(8), 11(1), 13(3)
11: 7(1), 10(1), 12(5), 14(8)
12: 7(8), 8(4), 11(5), 15(2)
13: 10(3), 14(2)
14: 11(8), 13(2), 15(2)
15: 12(2), 14(2)
```

Analise as afirmações:

I. A sequência `5-6-7-3-2-7` é uma trilha de comprimento 5, mas não é um caminho.

II. A sequência `1-2-7-3-1` é um ciclo de comprimento 4.

III. A sequência `1-2-7-3-2` é um caminho válido em `G` de comprimento 4.

IV. A sequência `9-4-8-12-15` é um caminho de comprimento 4.

É correto o que se afirma em:

A. I e II, apenas.
B. I e III, apenas.
C. II e IV, apenas.
D. I, II e IV, apenas.
E. I, II, III e IV.

### Questão 4 - Componentes Conexas, Pontes e Componentes Aresta-Conexas

Considere o grafo não dirigido `G`, adaptado do exercício Sedgewick 18.34, representado pela lista de adjacência a seguir.

```text
0: 5, 6
1: 4
2: 5, 6, 9
3: 7, 8
4: 1, 6, 9
5: 0, 2
6: 0, 2, 4
7: 3, 8
8: 3, 7
9: 2, 4
```

Analise as afirmações:

I. A aresta `1-4` é uma ponte, pois sua remoção isola `1` da componente alcançável por DFS a partir de `4`.

II. A aresta `3-7` é uma ponte, pois uma DFS iniciada em `3` pode visitar `7` antes de `8`.

III. Os vértices `3`, `7` e `8` pertencem a uma componente aresta-conexa sem pontes internas, pois a DFS identifica o ciclo `3-7-8-3`.

IV. No subgrafo induzido por `{0, 2, 4, 5, 6, 9}`, nenhuma aresta é ponte, pois a DFS encontra ciclos e caminhos alternativos.

É correto o que se afirma em:

A. I e II, apenas.
B. I e III, apenas.
C. II e IV, apenas.
D. I, III e IV, apenas.
E. I, II, III e IV.


### Questão 5 - Grafos Eulerianos

Considere uma versão modificada do grafo clássico das Pontes de Königsberg. Os vértices `N`, `S`, `C` e `L` representam regiões de terra, e uma ponte adicional foi acrescentada entre `N` e `S`. Repetições na lista de adjacência indicam pontes paralelas.

Grafo `K'`:

```text
N: C, C, L, S
S: C, C, L, N
C: N, N, S, S, L
L: N, S, C
```

Analise as afirmações:

I. O grafo `K'` possui uma trilha euleriana aberta, por exemplo `C-N-C-S-N-L-S-C-L`.

II. O grafo `K'` possui circuito euleriano, pois é conexo.

III. Se a ponte adicional entre `N` e `S` fosse removida, o grafo voltaria a ter quatro vértices de grau ímpar, inviabilizando trilha e circuito euleriano.

IV. Em `K'`, qualquer trilha euleriana deve começar em `C` e terminar em `L`, ou vice-versa.

É correto o que se afirma em:

A. I e II, apenas.
B. II e III, apenas.
C. I, II e IV, apenas.
D. I, III e IV, apenas.
E. I, II, III e IV.


### Questão 6 - Algoritmos Para Caminho/Circuito Euleriano

Considere os algoritmos de Hierholzer e Fleury para construir trilhas ou circuitos eulerianos em grafos não dirigidos como os grafos `G2` e `G4` abaixo, representados por listas de adjacência.

Grafo `G2`:

```text
0: 1, 2, 3, 3
1: 0, 3
2: 0, 5
3: 0, 0, 1, 6
4: 7, 8
5: 2, 8, 8, 9
6: 3, 7, 9
7: 4, 6
8: 4, 5, 5, 8, 8
9: 5, 6
```

Grafo `G4`:

```text
0: 2, 5, 8
1: 4, 5, 6
2: 0, 6, 8
3: 6, 7, 9
4: 1, 5, 7
5: 0, 1, 4
6: 1, 2, 3
7: 3, 4, 9
8: 0, 2, 9
9: 3, 7, 8
```

Analise as afirmações:

I. Em `G2`, Fleury pode construir um circuito euleriano iniciado em `6`.

II. Eulerizando `G2` com a aresta `6-8`, Hierholzer pode construir o circuito `6-3-0-1-3-0-2-5-8-8-4-7-6-9-5-8-6`.

III. Hierholzer executa em `O(V + E)`, enquanto Fleury pode chegar a `O(E(V + E))` quando testa pontes no grafo residual a cada escolha.

IV. Aplicado a `G4`, o procedimento pode construir uma trilha euleriana aberta se escolher corretamente o vértice inicial, pois a conectividade é suficiente.

É correto o que se afirma em:

A. I e II, apenas.
B. II e III, apenas.
C. I, II e III, apenas.
D. I, III e IV, apenas.
E. I, II, III e IV.


### Questão 7 - Grafos Hamiltonianos

Considere o grafo não dirigido `G`, representado pela lista de adjacência a seguir. Admita custo unitário para cada aresta.

```text
0: 1, 3, 4, 5, 8, 9
1: 0, 2, 3, 4
2: 1, 4, 5, 6, 9
3: 0, 1, 4, 6, 7
4: 0, 1, 2, 3, 5, 6, 9
5: 0, 2, 4, 6
6: 2, 3, 4, 5, 9
7: 3, 8, 9
8: 0, 7
9: 0, 2, 4, 6, 7
```

Analise as afirmações:

I. A sequência `0-1-2-5-4-3-6-9-7-8-0` é um ciclo hamiltoniano de `G`, com custo total `10`.

II. Os teoremas de Dirac e Ore não garantem que `G` seja hamiltoniano, pois `d(8) = 2 < 5` e `d(1) + d(8) = 6 < 10` para os vértices não adjacentes `1` e `8`.

III. Vértices pendentes, com `d(v) = 1`, e vértices de articulação impedem a existência de ciclo hamiltoniano.

IV. Como o vértice `8` tem grau `2`, ele não pode pertencer a nenhum ciclo hamiltoniano.

É correto o que se afirma em:

A. I e II, apenas.
B. II e III, apenas.
C. I, II e III, apenas.
D. III e IV, apenas.
E. I, II, III e IV.

### Questão 8 - Problema do Caixeiro-Viajante - TSP

Considere o grafo completo não dirigido e ponderado `G`, representado pela matriz de custos a seguir. A entrada na linha `i` e coluna `j` indica o custo da aresta entre `i` e `j`.

|   | 1 | 2 | 3 | 4 | 5 | 6 |
|---|---:|---:|---:|---:|---:|---:|
| 1 | - | 2 | 10 | 1 | 8 | 25 |
| 2 | 2 | - | 15 | 8 | 1 | 4 |
| 3 | 10 | 15 | - | 14 | 16 | 5 |
| 4 | 1 | 8 | 14 | - | 7 | 3 |
| 5 | 8 | 1 | 16 | 7 | - | 20 |
| 6 | 25 | 4 | 5 | 3 | 20 | - |

Use como ciclo parcial inicial `1-4-2-1`. Considere as heurísticas de inserção para construir um tour no TSP.

Analise as afirmações:

I. O custo do ciclo parcial inicial `1-4-2-1` é `11`.

II. Pela heurística `nearest insertion`, entre os vértices ainda não inseridos `{3, 5, 6}`, o primeiro vértice escolhido é `5`, pois sua menor distância até o ciclo é `1`.

III. Ao inserir o vértice `5` no ciclo `1-4-2-1`, a melhor posição é entre `1` e `4`, com aumento de custo `14`.

IV. Pela heurística `smallest insertion`, entre os vértices ainda não inseridos `{3, 5, 6}`, o primeiro vértice escolhido é `6`, pois sua melhor inserção tem aumento de custo `-1`.

É correto o que se afirma em:

A. I e II, apenas.
B. I e III, apenas.
C. II e IV, apenas.
D. I, II e IV, apenas.
E. I, II, III e IV.

### Questão 9 - Problema do Carteiro Chinês

Considere o grafo não dirigido e ponderado `G` representado pela lista de adjacência a seguir:

```text
a: b(1), c(2), d(4)
b: a(1), c(3), d(2), e(4)
c: a(2), b(3), d(2), f(4)
d: a(4), b(2), c(2), e(3), f(2), g(4)
e: b(4), d(3), f(3), g(2)
f: c(4), d(2), e(3), g(1)
g: d(4), e(2), f(1)
```

Analise as afirmações:

I. Como os únicos vértices de grau ímpar são `a` e `g`, a eulerização ótima deve duplicar um menor caminho entre eles, como `a-b-d-f-g`.

II. Como a soma dos pesos das arestas de `G` é `37`, esse é o custo mínimo do percurso do carteiro chinês.

III. O menor caminho entre os vértices ímpares é `a-d-g`, com custo `8`.

IV. Duplicar as arestas do caminho `a-b-d-f-g` euleriza `G`, permitindo um circuito euleriano no multigrafo resultante com custo total `43`.

É correto o que se afirma em:

A. I e II, apenas.
B. I e IV, apenas.
C. I, II e IV, apenas.
D. II, III e IV, apenas.
E. I, II, III e IV.

### Questão 10 - Coloração de grafos

Em um conto sobre Noé, uma arca deve alojar os animais `Cão`, `Gato`, `Leão`, `Porco`, `Rato`, `Sabiá`, `Tatu` e `Zebra`. Animais incompatíveis não podem ficar na mesma baia. A matriz de adjacência abaixo representa essas incompatibilidades. Considerando que os espaços da arca estão lotados, Noé deve determinar o número mínimo de divisões, ou baias, necessário para alojar esses animais.

|       | Cão | Gato | Leão | Porco | Rato | Sabiá | Tatu | Zebra |
|-------|----:|-----:|-----:|------:|-----:|------:|-----:|------:|
| Cão   | 0 | 1 | 1 | 0 | 1 | 1 | 1 | 0 |
| Gato  | 1 | 0 | 1 | 1 | 1 | 0 | 1 | 0 |
| Leão  | 1 | 1 | 0 | 1 | 1 | 0 | 0 | 1 |
| Porco | 0 | 1 | 1 | 0 | 0 | 1 | 0 | 1 |
| Rato  | 1 | 1 | 1 | 0 | 0 | 1 | 1 | 0 |
| Sabiá | 1 | 0 | 0 | 1 | 1 | 0 | 1 | 1 |
| Tatu  | 1 | 1 | 0 | 0 | 1 | 1 | 0 | 0 |
| Zebra | 0 | 0 | 1 | 1 | 0 | 1 | 0 | 0 |

A partir da matriz, modele o grafo de incompatibilidades e aplique a versão gulosa sequencial, processando os vértices em ordem decrescente de grau. Em caso de empate, use a ordem alfabética.

Analise as afirmações:

I. A ordem de processamento pela heurística gulosa é `Cão, Gato, Leão, Rato, Sabiá, Porco, Tatu, Zebra`.

II. A heurística produz a coloração `C1 = {Cão, Porco}`, `C2 = {Gato, Sabiá}`, `C3 = {Leão, Tatu}` e `C4 = {Rato, Zebra}`.

III. Como `Cão`, `Gato`, `Leão` e `Rato` são dois a dois incompatíveis, o índice cromático do grafo de incompatibilidades é `4`.

IV. A existência da coloração exibida no item II mostra que quatro baias são suficientes para alojar os animais.

É correto o que se afirma em:

A. I e II, apenas.
B. II e III, apenas.
C. I, II e IV, apenas.
D. I, III e IV, apenas.
E. I, II, III e IV.

## Conferências pendentes antes da adaptação final

### Questão 11 - Isomorfismo

Considere as árvores não dirigidas `T_A` e `T_B` representadas pelas listas de adjacência a seguir:

```text
T_A
1: 2, 3, 4
2: 1, 5, 6
3: 1, 7
4: 1, 8
5: 2
6: 2
7: 3
8: 4

T_B
1: 2, 3, 4
2: 1, 5, 6
3: 1, 7
4: 1
5: 2, 8
6: 2
7: 3
8: 5
```

Analise as afirmações:

I. Pela poda iterativa das folhas, ambas as árvores `T_A` e `T_B` têm centro único no vértice `1`.

II. As duas árvores possuem a mesma sequência de graus, `3, 3, 2, 2, 1, 1, 1, 1`, mas isso não garante isomorfismo.

III. A correspondência identidade `1->1`, `2->2`, ..., `8->8` é um isomorfismo entre `T_A` e `T_B`.

IV. As árvores não são isomorfas, pois em `T_A` os vértices de grau 3 têm quantidades de vizinhos de grau 2 iguais a `2` e `0`, enquanto em `T_B` essas quantidades são `1` e `1`.

É correto o que se afirma em:

A. II e IV, apenas.
B. I e III, apenas.
C. I, II e IV, apenas.
D. II, III e IV, apenas.
E. I, II, III e IV.

### Questão 12 - Emparelhamento em Grafos

Suponha que há seis estudantes, cada um precisando de emprego, e seis empresas, cada uma precisando contratar um estudante. As duas listas abaixo, uma organizada por estudante e outra por empresa, indicam ofertas de trabalho com interesse mútuo entre estudantes e empresas. Deseja-se saber se é possível emparelhar estudantes e empresas de modo que todo estudante obtenha um emprego e toda vaga seja preenchida; caso isso não seja possível, deseja-se determinar o número máximo de vagas que podem ser preenchidas.

```text
Por estudante:
Alice: Adobe, Apple, HP
Bob: Adobe, Apple, Yahoo
Carol: HP, IBM, Sun
Dave: Adobe, Apple
Eliza: IBM, Sun, Yahoo
Frank: HP, Sun, Yahoo

Por empresa:
Adobe: Alice, Bob, Dave
Apple: Alice, Bob, Dave
HP: Alice, Carol, Frank
IBM: Carol, Eliza
Sun: Carol, Eliza, Frank
Yahoo: Bob, Eliza, Frank
```

Considere o emparelhamento `M0 = {Alice-Adobe, Bob-Apple, Carol-IBM, Eliza-Sun}`. Analise as afirmações:

I. `M0` tem tamanho `4`; nele, `Dave`, `Frank`, `HP` e `Yahoo` são vértices não saturados.

II. O caminho `Dave-Adobe-Alice-HP` é um caminho de aumento em relação a `M0`.

III. Pela ideia do Teorema de Berge, a existência do caminho do item II mostra que `M0` já é um emparelhamento máximo.

IV. Ao aumentar `M0` pelo caminho `Dave-Adobe-Alice-HP`, obtém-se um emparelhamento de tamanho `5`, no qual `Frank` e `Yahoo` permanecem não saturados.

É correto o que se afirma em:

A. I e II, apenas.
B. I e III, apenas.
C. II e III, apenas.
D. I, II e IV, apenas.
E. I, II, III e IV.
