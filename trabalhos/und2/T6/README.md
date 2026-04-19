# T6 - Identificacao de Isomorfismo em Arvores

Implementacao em **Java** da base inicial do Trabalho Pratico 6 da disciplina
**Resolucao de Problemas com Grafos**.

## Estrutura

```text
T6/
├── README.md
├── T6.md
├── dados/
│   ├── invalid-ciclo3.txt
│   ├── iso-path4-a.txt
│   ├── iso-path4-b.txt
│   ├── nao-iso-estrela5.txt
│   ├── nao-iso-path5.txt
│   ├── unico-centro-a.txt
│   └── unico-centro-b.txt
├── imgs/
│   └── UNIFOR_logo1b.png
├── refs/
│   └── youtube_vides.md
└── src/
    ├── Bag.java
    ├── Graph.java
    ├── In.java
    ├── Main.java
    ├── Stack.java
    ├── StdIn.java
    ├── StdOut.java
    └── TreeIsomorphism.java
```

## Compilacao

No diretorio `src`, execute:

```bash
javac Main.java TreeIsomorphism.java Graph.java Bag.java Stack.java In.java StdIn.java StdOut.java
```

## Execucao

Fixtures de teste:

```bash
java Main ../dados/iso-path4-a.txt ../dados/iso-path4-b.txt
java Main ../dados/nao-iso-path5.txt ../dados/nao-iso-estrela5.txt
java Main ../dados/unico-centro-a.txt ../dados/unico-centro-b.txt
java Main ../dados/invalid-ciclo3.txt ../dados/iso-path4-a.txt
```

## Video

Link do video explicativo: PREENCHER
