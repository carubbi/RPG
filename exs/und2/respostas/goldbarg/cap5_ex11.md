# Goldbarg - Capítulo 5 - Exercício 11

## Enunciado de referência

Ver: `../../goldbarg.md`, Capítulo 5 - Exercício no 11.

## Resolução extraída do livro

Fonte: `livros/Goldbarg2012.pdf`, página 683.

```text
Exercício no 11
Suponha que o número de matchings perfeitos em um grafo K2n é dado pela função f(n). Se n = 1, então
f(1) = 1. Suponha que n = 2, então o grafo é o K4. O grau de cada vértice v do K4 é 3. Cada aresta incidente em
v entrará em 1 matching perfeito com os outros 2n – 2 vértices restantes do grafo. Portanto, f(2) = 3. De uma
forma geral, o número de matchings perfeitos em um grafo K2n é 2n – 1 (grau de cada vértice) vezes o número
de matchings perfeitos no grafo restante, o qual é completo e possui 2n – 2 vértices. Portanto, de modo geral,
f(n) = (2n – 1)f(n–1).
Temos, então, que f(n) = 1 3 5 7 ... (2n–1).
Assim,
Portanto, em um grafo K2n existem
matchings perfeitos.
```

![Resolução](<imgs/cap5_ex11_sol_p683_1.png>)
