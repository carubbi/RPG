[![PyPI version](https://badge.fury.io/py/algs4.svg)](https://badge.fury.io/py/algs4)

## Overview

This repository contains a reduced Python subset of the algorithms from
<a href = "http://amzn.to/13VNJi7">Algorithms, 4th Edition</a> by Robert Sedgewick and Kevin Wayne,
focused on graph algorithms.

## Goals

Provide a compact package for teaching graph algorithms in Python, keeping the code close enough to the book to support classroom use.

## Practical Guide

Execution examples are documented in [guia_pratico.md](guia_pratico.md).

## Index

* 4 GRAPHS
  * Graph
    * [Bag](algs4/bag.py)
    * [Graph](algs4/graph.py)
    * [DepthFirstSearch](algs4/depth_first_search.py)
    * [DepthFirstPaths](algs4/depth_first_paths.py)
    * [BreadthFirstPaths](algs4/breadth_first_paths.py)
    * [CC](algs4/cc.py)
    * [Cycle](algs4/cycle.py)
    * [SymbolGraph](algs4/symbol_graph.py)
    * [DegreesOfSeparation](algs4/degrees_of_separation.py)
  * Digraph
    * [Digraph](algs4/digraph.py)
    * [DirectedDFS](algs4/directed_dfs.py)
    * [DirectedCycle](algs4/directed_cycle.py)
    * [DepthFirstOrder](algs4/depth_first_order.py)
    * [Topological](algs4/topological.py)
    * [KosarajuSCC](algs4/kosaraju_scc.py)
  * MST
    * [UnionFind](algs4/uf.py)
    * [MinPQ](algs4/min_pq.py)
    * [IndexMinPQ](algs4/index_min_pq.py)
    * [EdgeWeightedGraph](algs4/edge_weighted_graph.py)
    * [LazyPrimMST](algs4/lazy_prim_mst.py)
    * [PrimMST](algs4/prim_mst.py)
    * [KruskalMST](algs4/kruskal_mst.py)
  * Shortest Paths
    * [EdgeWeightedDigraph](algs4/edge_weighted_digraph.py)
    * [DijkstraSP](algs4/dijkstra_sp.py)
    * [AcyclicSP](algs4/acyclic_sp.py)
    * [BellmanFordSP](algs4/bellman_ford_sp.py)

## License

This code is released under MIT.
