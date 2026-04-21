# algs4-py

Subconjunto em Python dos algoritmos de grafos de *Algorithms, 4th Edition*, de Robert Sedgewick e Kevin Wayne.

## Objetivo

Este diretório mantém apenas o recorte usado na disciplina, com foco em:

- grafos não direcionados
- grafos direcionados
- árvores geradoras mínimas
- caminhos mínimos

A intenção aqui não é reproduzir o projeto completo do livro, mas ter uma base pequena e utilizável em aula.

## Estrutura

Os módulos estão em `algs4/`.

### Grafos não direcionados

- [Bag](./algs4/bag.py)
- [Graph](./algs4/graph.py)
- [DepthFirstSearch](./algs4/depth_first_search.py)
- [DepthFirstPaths](./algs4/depth_first_paths.py)
- [BreadthFirstPaths](./algs4/breadth_first_paths.py)
- [CC](./algs4/cc.py)
- [Cycle](./algs4/cycle.py)
- [SymbolGraph](./algs4/symbol_graph.py)
- [DegreesOfSeparation](./algs4/degrees_of_separation.py)

### Grafos direcionados

- [Digraph](./algs4/digraph.py)
- [DirectedDFS](./algs4/directed_dfs.py)
- [DirectedCycle](./algs4/directed_cycle.py)
- [DepthFirstOrder](./algs4/depth_first_order.py)
- [Topological](./algs4/topological.py)
- [KosarajuSCC](./algs4/kosaraju_scc.py)
- [SymbolDigraph](./algs4/symbol_digraph.py)

### Grafos ponderados e MST

- [Edge](./algs4/edge.py)
- [EdgeWeightedGraph](./algs4/edge_weighted_graph.py)
- [UnionFind](./algs4/uf.py)
- [MinPQ](./algs4/min_pq.py)
- [IndexMinPQ](./algs4/index_min_pq.py)
- [LazyPrimMST](./algs4/lazy_prim_mst.py)
- [PrimMST](./algs4/prim_mst.py)
- [KruskalMST](./algs4/kruskal_mst.py)

### Caminhos mínimos

- [DirectedEdge](./algs4/directed_edge.py)
- [EdgeWeightedDigraph](./algs4/edge_weighted_digraph.py)
- [EdgeWeightedDirectedCycle](./algs4/edge_weighted_directed_cycle.py)
- [DijkstraSP](./algs4/dijkstra_sp.py)
- [AcyclicSP](./algs4/acyclic_sp.py)
- [BellmanFordSP](./algs4/bellman_ford_sp.py)

### Apoio

- [ST](./algs4/st.py)

## Como executar

Os exemplos devem ser executados a partir da pasta `algs4-py`:

```sh
cd algs4-py
```

Exemplo:

```sh
python3 -m algs4.graph ../dataset/tinyG.txt
```

O guia com comandos práticos está em [guia_pratico.md](./guia_pratico.md).

## Observações

- Este pacote foi reduzido ao subconjunto de grafos do projeto original.
- Os exemplos documentados assumem arquivos de entrada em `../dataset/`.
- O foco aqui é uso didático local no repositório, não distribuição como pacote independente.

## Licença

Código sob licença MIT.
