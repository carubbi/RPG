# Goldbarg - Capítulo 7 - Exercício 1

## Enunciado de referência

Ver: `../../goldbarg.md`, Capítulo 7 - Exercício no 1.

## Resolução extraída do livro

Fonte: `livros/Goldbarg2012.pdf`, página 695-697.

```text
Exercício no 1
Um dos algoritmos mais simples para a solução heurística do problema da coloração é proposta por Welsh
& Powell (1967), constituindo-se, basicamente, em um algoritmo guloso baseado na coloração dos vértices
do grafo em conformidade com o grau desses vértices. O algoritmo é apresentado no quadro Welsh & Po-
well. O funcionamento do algoritmo é exemplifi cado no mesmo grafo do exemplo do algoritmo DSATUR,
Figura 7.34.
Ler G = (N, M)
C1 = ... = Cn = 
Ordenar os vértices {x1, ..., xn} de modo que d(xi) ≥ d(xi + 1)
Para i ← até n faça
k ← min { j | Γ (xi)  Cj = }
Ck = Ck  { xi }
Fim_para
A
Welsh & Powell (1967)
Heurístico
A complexidade do algoritmo
de Welsh & Powell é pela veri-
ficação das cores dos vértices
adjacentes ao vértice que deverá
ser ordenado.
O(n2)
(1) Ordenação inicial e coloração do primeiro vértice
(2) Coloração do segundo vértice
Figura 2 da solução do exercício 1: Passos do algoritmo
Observa-se que o algoritmo depende da ordenação inicial, e pode haver mais de uma ordenação válida para a
instância. No caso seria também possível uma ordenação como: x9, x5, x2, x1, x4, x7, x3, x8, x6, x10.
66  Gráﬁ cos
(3) Coloração do terceiro vértice
(4) Coloração do quarto vértice
(5) Coloração do quinto vértice
(6) Coloração do sexto vértice
(7) Coloração do sétimo vértice
(8) Coloração fi nal
Figura 3 da solução do exercício 1: Passos do algoritmo
```

![Resolução](<imgs/cap7_ex01_sol_p695_1.png>)

![Resolução](<imgs/cap7_ex01_sol_p696_2.png>)

![Resolução](<imgs/cap7_ex01_sol_p697_3.png>)
