# algs4-java

Cópia local do código Java de apoio de *Algorithms, 4th Edition*, de Robert Sedgewick e Kevin Wayne.

**Fonte:** [kevin-wayne/algs4.git](https://github.com/kevin-wayne/algs4.git).

## Objetivo

Este diretório mantém a base Java usada como referência para estudo, comparação de implementações e consulta de algoritmos clássicos do livro.

Diferentemente de `algs4-py`, que foi reduzido ao subconjunto de grafos usado na disciplina, `algs4-java` preserva uma coleção bem mais ampla de classes.

## Estrutura

O código-fonte está concentrado em:

- `algs4/`: subconjunto da disciplina reempacotado em `package algs4`

### Estruturas de dados

- [`Bag`](./algs4/Bag.java)
- [`Queue`](./algs4/Queue.java)
- [`Stack`](./algs4/Stack.java)
- [`ST`](./algs4/ST.java)
- [`SET`](./algs4/SET.java)
- [`MinPQ`](./algs4/MinPQ.java)
- [`IndexMinPQ`](./algs4/IndexMinPQ.java)
- [`IndexMaxPQ`](./algs4/IndexMaxPQ.java)
- [`UF`](./algs4/UF.java)

### Utilitários

- [`In`](./algs4/In.java)
- [`StdIn`](./algs4/StdIn.java)
- [`StdOut`](./algs4/StdOut.java)
- [`StdRandom`](./algs4/StdRandom.java)

### Geradores

- [`GraphGenerator`](./algs4/GraphGenerator.java)
- [`DigraphGenerator`](./algs4/DigraphGenerator.java)

### Grafos não direcionados

- [`Graph`](./algs4/Graph.java)
- [`SymbolGraph`](./algs4/SymbolGraph.java)
- [`DepthFirstSearch`](./algs4/DepthFirstSearch.java)
- [`DepthFirstPaths`](./algs4/DepthFirstPaths.java)
- [`NonrecursiveDFS`](./algs4/NonrecursiveDFS.java)
- [`BreadthFirstPaths`](./algs4/BreadthFirstPaths.java)
- [`CC`](./algs4/CC.java)
- [`Cycle`](./algs4/Cycle.java)
- [`Bridge`](./algs4/Bridge.java)
- [`Biconnected`](./algs4/Biconnected.java)
- [`Bipartite`](./algs4/Bipartite.java)
- [`BipartiteX`](./algs4/BipartiteX.java)
- [`EulerianCycle`](./algs4/EulerianCycle.java)
- [`EulerianPath`](./algs4/EulerianPath.java)
- [`DegreesOfSeparation`](./algs4/DegreesOfSeparation.java)
- [`BipartiteMatching`](./algs4/BipartiteMatching.java)
- [`HopcroftKarp`](./algs4/HopcroftKarp.java)
- [`AssignmentProblem`](./algs4/AssignmentProblem.java)

### Grafos direcionados

- [`Digraph`](./algs4/Digraph.java)
- [`SymbolDigraph`](./algs4/SymbolDigraph.java)
- [`DirectedDFS`](./algs4/DirectedDFS.java)
- [`DepthFirstDirectedPaths`](./algs4/DepthFirstDirectedPaths.java)
- [`NonrecursiveDirectedDFS`](./algs4/NonrecursiveDirectedDFS.java)
- [`BreadthFirstDirectedPaths`](./algs4/BreadthFirstDirectedPaths.java)
- [`DepthFirstOrder`](./algs4/DepthFirstOrder.java)
- [`DirectedCycle`](./algs4/DirectedCycle.java)
- [`DirectedCycleX`](./algs4/DirectedCycleX.java)
- [`Topological`](./algs4/Topological.java)
- [`TopologicalX`](./algs4/TopologicalX.java)
- [`KosarajuSharirSCC`](./algs4/KosarajuSharirSCC.java)
- [`TarjanSCC`](./algs4/TarjanSCC.java)
- [`GabowSCC`](./algs4/GabowSCC.java)
- [`TransitiveClosure`](./algs4/TransitiveClosure.java)
- [`DirectedEulerianCycle`](./algs4/DirectedEulerianCycle.java)
- [`DirectedEulerianPath`](./algs4/DirectedEulerianPath.java)

### Árvores geradoras mínimas (MST)

- [`Edge`](./algs4/Edge.java)
- [`EdgeWeightedGraph`](./algs4/EdgeWeightedGraph.java)
- [`LazyPrimMST`](./algs4/LazyPrimMST.java)
- [`PrimMST`](./algs4/PrimMST.java)
- [`KruskalMST`](./algs4/KruskalMST.java)
- [`BoruvkaMST`](./algs4/BoruvkaMST.java)

### Caminhos mínimos

- [`DirectedEdge`](./algs4/DirectedEdge.java)
- [`EdgeWeightedDigraph`](./algs4/EdgeWeightedDigraph.java)
- [`AdjMatrixEdgeWeightedDigraph`](./algs4/AdjMatrixEdgeWeightedDigraph.java)
- [`EdgeWeightedDirectedCycle`](./algs4/EdgeWeightedDirectedCycle.java)
- [`DijkstraSP`](./algs4/DijkstraSP.java)
- [`DijkstraUndirectedSP`](./algs4/DijkstraUndirectedSP.java)
- [`DijkstraAllPairsSP`](./algs4/DijkstraAllPairsSP.java)
- [`AcyclicSP`](./algs4/AcyclicSP.java)
- [`AcyclicLP`](./algs4/AcyclicLP.java)
- [`BellmanFordSP`](./algs4/BellmanFordSP.java)
- [`FloydWarshall`](./algs4/FloydWarshall.java)
- [`Arbitrage`](./algs4/Arbitrage.java)
- [`CPM`](./algs4/CPM.java)

### Fluxo máximo

- [`FlowEdge`](./algs4/FlowEdge.java)
- [`FlowNetwork`](./algs4/FlowNetwork.java)
- [`FordFulkerson`](./algs4/FordFulkerson.java)
- [`GlobalMincut`](./algs4/GlobalMincut.java)

## Pontes e vértices de articulação

- [`Bridge`](./algs4/Bridge.java): identifica e imprime pontes e calcula a quantidade de componentes após removê-las.
- [`Biconnected`](./algs4/Biconnected.java): identifica vértices de articulação.
- **Precondição:** grafo simples não orientado.
- **Complexidade:** `O(V + E)` em tempo e `O(V)` em espaço adicional.

As classes são adaptações para `package algs4` das implementações [`Bridge.java`](https://algs4.cs.princeton.edu/41graph/Bridge.java.html) e [`Biconnected.java`](https://algs4.cs.princeton.edu/41graph/Biconnected.java.html), publicadas como material complementar da Seção 4.1. O teste local está em [`tests/BridgeBiconnectedTest.java`](./tests/BridgeBiconnectedTest.java).

## Escopo no projeto

Neste repositório, `algs4-java` funciona como base Java simplificada para a disciplina. O uso principal é:

- executar um subconjunto local em `algs4/`
- comparar com o subconjunto Python em `algs4-py`
- reutilizar ideias, nomes e convenções do livro em exercícios e aulas

Ele não substitui o material de exercícios em `exs/`.

## Como executar

O fluxo prático de compilação e execução está em [guia_pratico.md](./guia_pratico.md).

## Observações

- Este diretório contém um subconjunto adaptado do código de Kevin Wayne e Robert Sedgewick.
- O conteúdo foi reduzido ao que é importante para a disciplina e ajustado para rodar com `package algs4`.
- Se o objetivo for executar exemplos do subconjunto Python do projeto, use [algs4-py/README.md](../algs4-py/README.md) e [algs4-py/guia_pratico.md](../algs4-py/guia_pratico.md).

## Licença

Conforme o projeto original, este código é distribuído sob GPLv3.
