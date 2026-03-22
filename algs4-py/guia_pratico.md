# Como Executar os Exemplos

Este arquivo complementa o [README.md](/Users/carubbi/Documents/aulas/T290/algs4-py/README.md) com a forma correta de executar os exemplos do subconjunto de grafos deste repositório.

## Diretório de trabalho

Execute os comandos a partir da pasta `algs4-py`:

```sh
cd algs4-py
```

Os exemplos abaixo assumem que os arquivos de entrada estão em `../dataset/`.

## Regra prática

Neste pacote, todos os exemplos recebem arquivo como argumento.

Exemplo simples:

```sh
python3 -m algs4.graph ../dataset/tinyG.txt
```

Exemplo com arquivo principal e arquivo de consultas:

```sh
python3 -m algs4.degrees_of_separation ../dataset/routes.txt ' ' JFK ../dataset/airports.txt
```

## Exemplos que recebem arquivo como argumento

```sh
python3 -m algs4.graph ../dataset/tinyG.txt
python3 -m algs4.digraph ../dataset/tinyDG.txt
python3 -m algs4.depth_first_search ../dataset/tinyG.txt 0
python3 -m algs4.breadth_first_paths ../dataset/tinyCG.txt 0
python3 -m algs4.depth_first_paths ../dataset/tinyCG.txt 0
python3 -m algs4.cycle ../dataset/tinyG.txt
python3 -m algs4.cc ../dataset/tinyG.txt
python3 -m algs4.directed_dfs ../dataset/tinyDG.txt 1
python3 -m algs4.directed_cycle ../dataset/tinyDG.txt
python3 -m algs4.depth_first_order ../dataset/tinyDAG.txt
python3 -m algs4.topological ../dataset/jobs.txt /
python3 -m algs4.kosaraju_scc ../dataset/tinyDG.txt

python3 -m algs4.edge_weighted_graph ../dataset/tinyEWG.txt
python3 -m algs4.edge_weighted_digraph ../dataset/tinyEWD.txt
python3 -m algs4.lazy_prim_mst ../dataset/tinyEWG.txt
python3 -m algs4.prim_mst ../dataset/tinyEWG.txt
python3 -m algs4.kruskal_mst ../dataset/tinyEWG.txt
python3 -m algs4.dijkstra_sp ../dataset/tinyEWD.txt 0
python3 -m algs4.edge_weighted_directed_cycle 5 5 1
```

## Exemplos com múltiplos arquivos

```sh
python3 -m algs4.degrees_of_separation ../dataset/routes.txt ' ' JFK ../dataset/airports.txt
python3 -m algs4.symbol_graph ../dataset/routes.txt ' ' ../dataset/airports.txt
python3 -m algs4.symbol_digraph ../dataset/routes.txt ' ' ../dataset/airports.txt
```

## Observações

- Este pacote foi reduzido ao subconjunto de grafos do projeto original. Classes de ordenação, compressão, strings e outras estruturas fora desse escopo foram removidas.
- Os exemplos documentados aqui foram padronizados para receber arquivos como argumento, inclusive nos casos de consulta sobre `routes.txt`.
- Execute os comandos a partir de `algs4-py` para que `../dataset/...` funcione.
- O subconjunto de grafos foi validado com 22 exemplos de CLI presentes no repositório.
