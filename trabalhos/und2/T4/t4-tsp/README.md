<img src="imgs/UNIFOR_logo1b.png" width="400">

# T4 - Problema do Caixeiro Viajante (PCV) com Heurísticas de Inserção

Material base do Trabalho Pratico 4 sobre o **Traveling Salesman Problem**
(TSP), com foco exclusivo nas heuristicas de insercao.

O projeto foi preparado para que o aluno concentre a implementacao em:

- `insertNearest(Point p)`
- `insertSmallest(Point p)`

O restante do fluxo ja vem pronto:

- leitura de arquivo;
- classe `Point`;
- estrutura base de `Tour`;
- `Main.java`;
- visualizacao com base em `TSPVisualizer.java`.

## Bases oficiais

- `algs4-kw` para Java
- `algs4-py` para Python

O projeto ja inclui localmente as classes necessarias para leitura, modelagem,
execucao e visualizacao.

## Estrutura

```text
t4-tsp/
├── README.md
├── T4.md
├── dados/
│   ├── tsp10-nearest.txt
│   ├── tsp10-optimal.txt
│   ├── tsp10-smallest.txt
│   ├── tsp10.txt
│   └── usa13509.txt
└── src/
    ├── Main.java
    ├── In.java
    ├── Point.java
    ├── StdDraw.java
    ├── StdIn.java
    ├── StdOut.java
    ├── Tour.java
    └── TSPVisualizer.java
```

## O que o aluno deve implementar

No arquivo `src/Tour.java`, completar:

- `insertNearest(Point p)`
- `insertSmallest(Point p)`

Os metodos atualmente lancam `UnsupportedOperationException` com mensagem de
`TODO`.

## Formato da entrada

```text
largura altura
x0 y0
x1 y1
...
```

Cada linha apos as dimensoes representa uma cidade no plano cartesiano.

## Entrada de exemplo

O arquivo de exemplo a ser usado na explicacao e na depuracao e:

- `dados/tsp10.txt`

Esse arquivo foi escolhido como exemplo porque o projeto inclui respostas de
referencia para depuracao das duas heuristicas:

- `dados/tsp10-nearest.txt`
- `dados/tsp10-smallest.txt`
- `dados/tsp10-optimal.txt`

## Entrada oficial

O arquivo principal para a execucao e a apresentacao do trabalho e:

- `dados/usa13509.txt`

Use `dados/tsp10.txt` para depuracao das heuristicas e `dados/usa13509.txt`
para a execucao e a apresentacao final do projeto.

## Compilacao e execucao

No diretorio `src`, execute:

```bash
javac Main.java Point.java Tour.java TSPVisualizer.java In.java StdIn.java StdOut.java StdDraw.java
java Main ../dados/usa13509.txt
```

Para abrir apenas o visualizador:

```bash
java TSPVisualizer ../dados/tsp10.txt
```
