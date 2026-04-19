# T5 - Coloracao de Grafos com DSatur

Implementacao em **Java** da base inicial do Trabalho Pratico 5 da disciplina
**Resolucao de Problemas com Grafos**.

## Estrutura

```text
T5/
├── README.md
├── T5.md
├── dados/
│   ├── brasil.txt
│   ├── teste-caminho4.txt
│   ├── teste-ciclo4.txt
│   ├── teste-ciclo5.txt
│   └── teste-triangulo.txt
└── src/
    ├── Bag.java
    ├── Graph.java
    ├── GraphColoringDSatur.java
    ├── In.java
    ├── Main.java
    ├── Stack.java
    ├── StdIn.java
    └── StdOut.java
```

## Compilacao

No diretorio `src`, execute:

```bash
javac Main.java GraphColoringDSatur.java Graph.java Bag.java Stack.java In.java StdIn.java StdOut.java
```

## Execucao

Entrada oficial:

```bash
java Main ../dados/brasil.txt
```

Fixtures de teste:

```bash
java Main ../dados/teste-triangulo.txt
java Main ../dados/teste-caminho4.txt
java Main ../dados/teste-ciclo4.txt
java Main ../dados/teste-ciclo5.txt
```

## Video

Link do video explicativo: PREENCHER
