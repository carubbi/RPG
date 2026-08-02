# Goldbarg - Capítulo 7 - Exercício 11

## Enunciado de referência

Ver: `../../goldbarg.md`, Capítulo 7 - Exercício no 11.

## Resolução extraída do livro

Fonte: `livros/Goldbarg2012.pdf`, página 700.

```text
Exercício no 11
Considere a classe de grafos bipartidos G = (N,M), N = A  B, A  B = , A = {a1,...,an}, B = {b1,...,bn},
M = {(ai,bj) | i ≠ j}.
Os graus de todos os vértices são iguais a n–1. Portanto, o algoritmo de Welsh e Powell pode ser aplicado a G
considerando a sequência: a1, b1, a2, b2, a3, b3,..., an, bn. Neste caso, a coloração produzida pelo algoritmo atribui
cor i a cada par de vértices ai, bi, como ilustrado na fi gura abaixo, produzindo uma coloração de G com n cores.
Portanto,
, mostrando que a heurística de Welsh e Powell tem
desempenho arbitrariamente ruim. Esta classe de grafos foi sugerida por Johnson (1973).
```

![Resolução](<imgs/cap7_ex11_sol_p700_1.png>)
