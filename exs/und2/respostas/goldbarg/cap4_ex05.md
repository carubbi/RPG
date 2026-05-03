# Goldbarg - Capítulo 4 - Exercício 5

## Enunciado de referência

Ver: `../../goldbarg.md`, Capítulo 4 - Exercício no 5.

## Resolução extraída do livro

Fonte: `livros/Goldbarg2012.pdf`, página 663-664.

```text
Exercício no 5
O algoritmo de Hierholzer pode ser implementado em O(m) se listas duplamente encadeadas forem utilizadas:
– Na implementação da lista de adjacência de cada vértice.
– Para implementar as cadeias C e H.
– Para implementar uma lista L que contém os vértices de C com grau maior que zero no grafo reduzido.
(1) Grafo G
(2) Lista de adjacência de G
Figura 1 do exercício 5: Representação do grafo para o algoritmo de Hierholzer
O grafo é representado por uma lista de adjacência onde o i-ésimo elemento do vetor possui 3 campos:
um ponteiro para a lista de adjacência do vértice i, p1i, um ponteiro para a primeira ocorrência do vértice i na
cadeia C, p2i, e um ponteiro para a ocorrência do vértice i na lista L, p3i. Inicialmente, p2i e p3i estão aterrados
para todo i = 1,...,n. Na lista de cada vértice v, apontada por p1v, a aresta (v,w) é representada por um ele-
mento com 3 campos: a identifi cação do vértice terminal w e dois ponteiros, um para o elemento anterior e
outro para o elemento seguinte da lista. Se o grafo é não direcionado, cada elemento da lista do vértice v tem
mais um campo: um ponteiro para o elemento correspondente a v na lista de w. Isso faz com que a aresta
seja removida de forma efi ciente nas listas de v e w quando (v,w) for inserida na cadeia. A representação é
ilustrada na Figura 1(2) para o grafo da Figura 1(1). A Figura 2(1) mostra uma cadeia inicial C = {1, 2, 3} e a
estrutura de dados resultante antes da entrada na primeira iteração do laço.
(1) Cadeia C
(2) Estruturas de dados auxiliares
Figura 2 do exercício 5: Representação após a primeira iteração do algoritmo de Hierholzer
34  Gráﬁ cos
O primeiro vértice de L é escolhido para começar a cadeia H em cada iteração do algoritmo. Este vértice é recu-
perado em tempo constante. A união das cadeias no passo 6 do algoritmo também é feita em tempo constante.
Suponha que o vértice x é o primeiro vértice da lista H. Se p2x está aterrado, então H é incluída no fi nal da lista C,
caso contrário, a lista H substitui a primeira ocorrência de x em C. Quando um vértice v tiver seu grau diminuído
para zero, durante a execução do algoritmo, a remoção deste vértice da lista L é feita em tempo constante, bastan-
do acessar a ocorrência de v em L através do ponteiro p3v. Cada aresta é removida uma vez e, em cada iteração do
laço, pelo menos duas arestas são removidas. Portanto, o algoritmo tem complexidade O(m).
```

![Resolução](<imgs/cap4_ex05_sol_p663_1.png>)

![Resolução](<imgs/cap4_ex05_sol_p664_2.png>)
