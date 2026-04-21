# Como Executar os Exemplos em Java

Este arquivo complementa o [README.md](./README.md) com a forma prática de compilar e executar o subconjunto de `algs4-java`, reempacotado em `package algs4`.

## Diretório de trabalho

Execute os comandos a partir da pasta `algs4-java`:

```sh
cd algs4-java
```

Os exemplos abaixo assumem que os arquivos de entrada estão em `../dataset/`.

## Regra prática

As classes deste subconjunto usam `package algs4`, então o ponto importante é compilar com `-d` e executar com `-cp`.

Para evitar gerar arquivos compilados dentro do repositório, use um diretório temporário:

```sh
mkdir -p /tmp/algs4-java-classes
javac -d /tmp/algs4-java-classes algs4/*.java
```

Para simplificar os exemplos, você pode definir:

```sh
CP=/tmp/algs4-java-classes
```

## Exemplos que recebem arquivo como argumento

```sh
java -cp "$CP" algs4.Graph ../dataset/tinyG.txt
java -cp "$CP" algs4.Digraph ../dataset/tinyDG.txt
java -cp "$CP" algs4.DepthFirstSearch ../dataset/tinyG.txt 0
java -cp "$CP" algs4.BreadthFirstPaths ../dataset/tinyCG.txt 0
java -cp "$CP" algs4.DepthFirstPaths ../dataset/tinyCG.txt 0
java -cp "$CP" algs4.Cycle ../dataset/tinyG.txt
java -cp "$CP" algs4.CC ../dataset/tinyG.txt
java -cp "$CP" algs4.DirectedDFS ../dataset/tinyDG.txt 1
java -cp "$CP" algs4.DirectedCycle ../dataset/tinyDG.txt
java -cp "$CP" algs4.DepthFirstOrder ../dataset/tinyDAG.txt
java -cp "$CP" algs4.Topological ../dataset/jobs.txt /
java -cp "$CP" algs4.KosarajuSharirSCC ../dataset/tinyDG.txt

java -cp "$CP" algs4.EdgeWeightedGraph ../dataset/tinyEWG.txt
java -cp "$CP" algs4.EdgeWeightedDigraph ../dataset/tinyEWD.txt
java -cp "$CP" algs4.LazyPrimMST ../dataset/tinyEWG.txt
java -cp "$CP" algs4.PrimMST ../dataset/tinyEWG.txt
java -cp "$CP" algs4.KruskalMST ../dataset/tinyEWG.txt
java -cp "$CP" algs4.DijkstraSP ../dataset/tinyEWD.txt 0
java -cp "$CP" algs4.BellmanFordSP ../dataset/tinyEWDn.txt 0
java -cp "$CP" algs4.AcyclicSP ../dataset/tinyEWDAG.txt 5
```

## Exemplos com entrada padrão

Para `SymbolGraph`, `SymbolDigraph` e `DegreesOfSeparation`, além dos argumentos de linha de comando, você fornece consultas pela entrada padrão.

### SymbolGraph

```sh
printf 'JFK\nLAX\n' | java -cp "$CP" algs4.SymbolGraph ../dataset/routes.txt ' '
```

### SymbolDigraph

```sh
printf 'JFK\nATL\n' | java -cp "$CP" algs4.SymbolDigraph ../dataset/routes.txt ' '
```

### DegreesOfSeparation

```sh
printf 'LAS\nDFW\n' | java -cp "$CP" algs4.DegreesOfSeparation ../dataset/routes.txt ' ' JFK
```

## Observações

- O comando de compilação acima foi validado localmente com `javac` e `java`.
- Os exemplos usam `../dataset/`, então o diretório corrente deve ser `algs4-java`.
- `AcyclicSP.java` traz um cabeçalho de execução inconsistente no comentário inicial; na prática, o uso correto neste repositório é com arquivo e vértice-fonte, como no exemplo acima.
- Se você preferir não usar `/tmp`, pode trocar `"/tmp/algs4-java-classes"` por outro diretório de saída compilada.
