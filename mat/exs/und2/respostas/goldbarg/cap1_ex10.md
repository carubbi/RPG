# Goldbarg - Capítulo 1 - Exercício 10

## Enunciado de referência

Ver: `../../goldbarg.md`, Capítulo 1 - Exercício no 10.

## Resolução extraída do livro

Fonte: `livros/Goldbarg2012.pdf`, página 635-636.

```text
Exercício no 10
O algoritmo para identifi car se G é conexo usará uma variação do algoritmo de busca em profundidade, como
mostrado através dos pseudo-códigos e_conexo( ) e busca_prof( ). O procedimento é iniciado pelo algoritmo
e_conexo( ), que recebe como parâmetro de entrada o grafo G. Um vetor de rótulos para os vértices é defi nido
como marca[ ]. No começo todos os vértices recebem rótulo 0 (linhas 1-3). O percurso em profundidade
é implementado no algoritmo busca_prof( ), que recebe um vértice como parâmetro de entrada. O percurso
no grafo pode iniciar em qualquer um de seus vértices. No caso, ele é iniciado no vértice 1 com a chamada
busca_prof(1). Cada vez que um vértice v é alcançado pela primeira vez na busca, marca[v] muda para 1 e o
procedimento de busca é chamado recursivamente para cada um dos vértices não marcados adjacentes a v.
Quando o algoritmo retorna da chamada de busca_prof(1), verifi ca-se se marca[v] é igual a 1 para todos os
vértices do grafo. Se, pelo menos, um dos vértices do grafo não estiver marcado, então o grafo não é conexo.

O laço entre as linhas 1-3 tem complexidade (n) e o laço entre as linhas 6-10 tem complexidade O(n). Se
o grafo é conexo, então o algoritmo busca_prof( ) é chamado exatamente n vezes. Caso contrário o proce-
dimento é chamado, no máximo, n-1 vezes. Isto acontece porque cada chamada do procedimento bus-
6  Gráﬁ cos
ca_prof( ) ocorre somente se o vértice v passado como parâmetro tiver marca[v] = 0. A marca do vértice é
trocada para 1 no primeiro passo do algoritmo busca_prof( ) e não é restabelecida para 0 em qualquer ponto
dos algoritmos. Se o grafo G for representado através de uma lista de adjacências, então o laço entre as linhas
2-6 do algoritmo busca_prof( ) é executado |lista_adj[i]| vezes para cada vértice i, 1 ≤ i ≤ n, ou seja, o laço
é executado grau de i vezes. Como tem-se que
, então o algoritmo para verifi car se um grafo é
conexo, utilizando
a estrutura de dados de lista de adjacências, tem complexidade O(n+m).
Ler G = (N,M)
Início
Para i ← 1 até |N| Faça
marca [i] ← 0
Fim_para
a ← 1
Para i ← 1 até |N| Faça
Se (marca [i] = 0) então
a ← 0
i ← |N| + 1
Fim _se
Fim_para
Se (a) então
Escreva "G é conexo"
Senão
Escreva "G não é conexo"
Fim
A
e_conexo
busca_prof(i)
Início
marca [v] ← 1
Para todo v  lista_adj[i ] Faça
Se (marca[v] = 0) então
busca_prof(i )
Fim_se
Fim_para
Fim
A
busca-prof(I )
```

![Resolução](<imgs/cap1_ex10_sol_p635_1.png>)

![Resolução](<imgs/cap1_ex10_sol_p636_2.png>)
