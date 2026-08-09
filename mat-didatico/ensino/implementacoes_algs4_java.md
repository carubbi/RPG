# Implementações Java por semana

## Critério

- Cada classe de `algs4-java/algs4` recebe uma primeira semana de uso ou uma justificativa de exclusão.
- A presença como recurso não implica implementação integral em aula.
- Implementações complementares servem para comparação, teste ou aprofundamento após o conteúdo-base.
- Ordenação topológica e componentes fortemente conexas permanecem restritas aos exercícios do T2.

## Semana 3 — Representações computacionais

- [`Bag.java`](../../algs4-java/algs4/Bag.java): estrutura usada nas listas de adjacência.
- [`Graph.java`](../../algs4-java/algs4/Graph.java): grafo não orientado por lista de adjacência.
- [`Digraph.java`](../../algs4-java/algs4/Digraph.java): dígrafo por lista de adjacência.
- [`GraphGenerator.java`](../../algs4-java/algs4/GraphGenerator.java): geração de grafos para validação.
- [`DigraphGenerator.java`](../../algs4-java/algs4/DigraphGenerator.java): geração de dígrafos para validação.
- [`SymbolGraph.java`](../../algs4-java/algs4/SymbolGraph.java): vértices identificados por símbolos.
- [`SymbolDigraph.java`](../../algs4-java/algs4/SymbolDigraph.java): dígrafos com vértices identificados por símbolos.
- [`ST.java`](../../algs4-java/algs4/ST.java): mapeamento entre símbolos e índices.
- [`SET.java`](../../algs4-java/algs4/SET.java): apoio à geração de grafos simples.

## Semana 4 — Busca em profundidade

- [`DepthFirstSearch.java`](../../algs4-java/algs4/DepthFirstSearch.java): DFS recursiva em grafo não orientado.
- [`DepthFirstPaths.java`](../../algs4-java/algs4/DepthFirstPaths.java): caminhos e predecessores por DFS.
- [`NonrecursiveDFS.java`](../../algs4-java/algs4/NonrecursiveDFS.java): DFS iterativa em grafo não orientado.
- [`DirectedDFS.java`](../../algs4-java/algs4/DirectedDFS.java): alcançabilidade por DFS em dígrafo.
- [`DepthFirstDirectedPaths.java`](../../algs4-java/algs4/DepthFirstDirectedPaths.java): caminhos por DFS em dígrafo.
- [`NonrecursiveDirectedDFS.java`](../../algs4-java/algs4/NonrecursiveDirectedDFS.java): DFS iterativa em dígrafo.
- [`DepthFirstOrder.java`](../../algs4-java/algs4/DepthFirstOrder.java): ordens de pré e pós-visita.
- [`Stack.java`](../../algs4-java/algs4/Stack.java): pilha explícita e reconstrução de caminhos.

## Semana 5 — Busca em largura

- [`BreadthFirstPaths.java`](../../algs4-java/algs4/BreadthFirstPaths.java): BFS, distâncias e caminhos em grafo não orientado.
- [`BreadthFirstDirectedPaths.java`](../../algs4-java/algs4/BreadthFirstDirectedPaths.java): BFS, distâncias e caminhos em dígrafo.
- [`Queue.java`](../../algs4-java/algs4/Queue.java): fila usada pela BFS.
- [`DegreesOfSeparation.java`](../../algs4-java/algs4/DegreesOfSeparation.java): aplicação contextual de BFS.

## Semana 8 — Percursos e conectividade

- [`CC.java`](../../algs4-java/algs4/CC.java): componentes conexas.
- [`Cycle.java`](../../algs4-java/algs4/Cycle.java): ciclos em grafos não orientados.
- [`DirectedCycle.java`](../../algs4-java/algs4/DirectedCycle.java): ciclos em dígrafos.
- [`Bridge.java`](../../algs4-java/algs4/Bridge.java): pontes.
- [`Biconnected.java`](../../algs4-java/algs4/Biconnected.java): vértices de articulação.
- [`TransitiveClosure.java`](../../algs4-java/algs4/TransitiveClosure.java): alcançabilidade entre pares em dígrafos.

## Semana 9 — Grafos eulerianos

- [`Bridge.java`](../../algs4-java/algs4/Bridge.java): identificação de pontes usada na construção guiada de Fleury.
- [`EulerianCycle.java`](../../algs4-java/algs4/EulerianCycle.java): ciclo euleriano por construção equivalente à de Hierholzer.
- [`EulerianPath.java`](../../algs4-java/algs4/EulerianPath.java): caminho euleriano por construção equivalente à de Hierholzer.
- [`DirectedEulerianCycle.java`](../../algs4-java/algs4/DirectedEulerianCycle.java): ciclo euleriano em dígrafo.
- [`DirectedEulerianPath.java`](../../algs4-java/algs4/DirectedEulerianPath.java): caminho euleriano em dígrafo.

## Semana 10 — Coloração e emparelhamento

- [`Bipartite.java`](../../algs4-java/algs4/Bipartite.java): bipartição por DFS.
- [`BipartiteX.java`](../../algs4-java/algs4/BipartiteX.java): bipartição por BFS.
- [`BipartiteMatching.java`](../../algs4-java/algs4/BipartiteMatching.java): emparelhamento máximo por caminhos alternantes e aumentantes.

## Semanas 12 e 13 — Representações ponderadas

- [`Edge.java`](../../algs4-java/algs4/Edge.java): aresta não orientada ponderada.
- [`DirectedEdge.java`](../../algs4-java/algs4/DirectedEdge.java): aresta orientada ponderada.
- [`EdgeWeightedGraph.java`](../../algs4-java/algs4/EdgeWeightedGraph.java): grafo não orientado ponderado.
- [`EdgeWeightedDigraph.java`](../../algs4-java/algs4/EdgeWeightedDigraph.java): dígrafo ponderado.

## Semanas 14 e 15 — Árvores geradoras mínimas

- [`KruskalMST.java`](../../algs4-java/algs4/KruskalMST.java): algoritmo de Kruskal.
- [`PrimMST.java`](../../algs4-java/algs4/PrimMST.java): versão ávida de Prim.
- [`LazyPrimMST.java`](../../algs4-java/algs4/LazyPrimMST.java): versão preguiçosa de Prim.
- [`UF.java`](../../algs4-java/algs4/UF.java): Union-Find.
- [`MinPQ.java`](../../algs4-java/algs4/MinPQ.java): fila de prioridade usada por Kruskal e Prim preguiçoso.
- [`IndexMinPQ.java`](../../algs4-java/algs4/IndexMinPQ.java): fila de prioridade indexada usada por Prim.

## Semana 15 — Dijkstra

- [`DijkstraSP.java`](../../algs4-java/algs4/DijkstraSP.java): Dijkstra em dígrafo ponderado.
- [`DijkstraUndirectedSP.java`](../../algs4-java/algs4/DijkstraUndirectedSP.java): Dijkstra em grafo não orientado ponderado.

## Semana 16 — Fluxo máximo

- [`FlowEdge.java`](../../algs4-java/algs4/FlowEdge.java): capacidade, fluxo e capacidade residual.
- [`FlowNetwork.java`](../../algs4-java/algs4/FlowNetwork.java): representação da rede de fluxo.
- [`FordFulkerson.java`](../../algs4-java/algs4/FordFulkerson.java): Ford-Fulkerson com caminhos aumentantes selecionados por BFS, correspondente a Edmonds-Karp.

## Semana 17 — Bellman–Ford e Floyd–Warshall

- [`BellmanFordSP.java`](../../algs4-java/algs4/BellmanFordSP.java): caminhos mínimos com pesos negativos.
- [`EdgeWeightedDirectedCycle.java`](../../algs4-java/algs4/EdgeWeightedDirectedCycle.java): ciclo em dígrafo ponderado.
- [`FloydWarshall.java`](../../algs4-java/algs4/FloydWarshall.java): atualização da matriz de distâncias por vértices intermediários.
- [`AdjMatrixEdgeWeightedDigraph.java`](../../algs4-java/algs4/AdjMatrixEdgeWeightedDigraph.java): matriz de adjacência ponderada usada por Floyd–Warshall.
- [`DijkstraAllPairsSP.java`](../../algs4-java/algs4/DijkstraAllPairsSP.java): comparação com repetição de Dijkstra.

## Restritas aos exercícios do T2

- [`KosarajuSharirSCC.java`](../../algs4-java/algs4/KosarajuSharirSCC.java), [`TarjanSCC.java`](../../algs4-java/algs4/TarjanSCC.java) e [`GabowSCC.java`](../../algs4-java/algs4/GabowSCC.java): componentes fortemente conexas.
- [`Topological.java`](../../algs4-java/algs4/Topological.java) e [`TopologicalX.java`](../../algs4-java/algs4/TopologicalX.java): ordenação topológica.
- [`DirectedCycleX.java`](../../algs4-java/algs4/DirectedCycleX.java): detecção alternativa de ciclos dirigida à ordenação topológica.

## Emparelhamento — aprofundamento não obrigatório

- [`HopcroftKarp.java`](../../algs4-java/algs4/HopcroftKarp.java): algoritmo além da introdução prevista no projeto de ensino.

## Fora do escopo regular

- [`AcyclicSP.java`](../../algs4-java/algs4/AcyclicSP.java), [`AcyclicLP.java`](../../algs4-java/algs4/AcyclicLP.java) e [`CPM.java`](../../algs4-java/algs4/CPM.java): caminhos e escalonamento em DAGs.
- [`Arbitrage.java`](../../algs4-java/algs4/Arbitrage.java): aplicação financeira de Bellman–Ford.
- [`AssignmentProblem.java`](../../algs4-java/algs4/AssignmentProblem.java): problema de atribuição.
- [`BoruvkaMST.java`](../../algs4-java/algs4/BoruvkaMST.java): algoritmo de Borůvka.
- [`GlobalMincut.java`](../../algs4-java/algs4/GlobalMincut.java): corte mínimo global.
- [`IndexMaxPQ.java`](../../algs4-java/algs4/IndexMaxPQ.java): fila de prioridade máxima sem uso curricular direto.

## Infraestrutura transversal

- [`In.java`](../../algs4-java/algs4/In.java), [`StdIn.java`](../../algs4-java/algs4/StdIn.java) e [`StdOut.java`](../../algs4-java/algs4/StdOut.java): entrada e saída.
- [`StdRandom.java`](../../algs4-java/algs4/StdRandom.java): geração aleatória usada por clientes de teste.
