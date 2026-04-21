# algs4-java

Cópia local do código Java de apoio de *Algorithms, 4th Edition*, de Robert Sedgewick e Kevin Wayne.

## Objetivo

Este diretório mantém a base Java usada como referência para estudo, comparação de implementações e consulta de algoritmos clássicos do livro.

Diferentemente de `algs4-py`, que foi reduzido ao subconjunto de grafos usado na disciplina, `algs4-java` preserva uma coleção bem mais ampla de classes.

## Estrutura

O código-fonte está concentrado em:

- `algs4/`: subconjunto da disciplina reempacotado em `package algs4`

Há material para vários tópicos, incluindo:

- estruturas fundamentais (`Bag`, `Stack`, `Queue`, `UF`, `ST`)
- grafos e digrafos (`Graph`, `Digraph`, `CC`, `DepthFirstSearch`, `BreadthFirstPaths`, `Topological`, `KosarajuSharirSCC`)
- grafos ponderados e caminhos mínimos (`Edge`, `DirectedEdge`, `EdgeWeightedGraph`, `EdgeWeightedDigraph`, `DijkstraSP`, `BellmanFordSP`, `AcyclicSP`)
- árvores geradoras mínimas (`LazyPrimMST`, `PrimMST`, `KruskalMST`)
- fluxos, strings, ordenação, geometria e outros tópicos do livro

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
