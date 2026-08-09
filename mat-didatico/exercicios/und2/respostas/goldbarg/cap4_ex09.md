# Goldbarg - Capítulo 4 - Exercício 9

## Enunciado de referência

Ver: `../../goldbarg.md`, Capítulo 4 - Exercício no 9.

## Resolução extraída do livro

Fonte: `livros/Goldbarg2012.pdf`, página 665-666.

```text
Exercício no 9
Se existe caminho hamiltoniano em G, então existem vértices s e t tal que é possível construir um caminho
de s até t, passando por todos os demais vértices de G. Como G é acíclico, G possui pelo menos um vértice
com grau interno igual a 0, chamado
de fonte. Se G possuir mais de uma
fonte, G não possui caminho hamil-
toniano, pois não é possível construir
um caminho entre as duas fontes.
De modo análogo, para que G pos-
sua caminho hamiltoniano, G deve
possuir apenas um vértice com
grau externo 0, chamado de sumi-
douro. O subgrafo induzido de G
pela remoção da fonte (do sumidou-
ro) deve possuir a mesma proprie-
dade, ou seja, possuir apenas uma
fonte (um sumidouro).
Baseado no que foi anteriormente
exposto, é possível construir um al-
goritmo que, iterativamente, retire
a fonte s do grafo corrente e veri-
fi que se resta apenas um vértice v
com grau de entrada 0. Se existir
mais de um vértice nesta condição,
o algoritmo termina emitindo uma
mensagem de que o grafo não pos-
sui caminho hamiltoniano. Caso
contrário, v é assumido como a fonte
na próxima iteração do algoritmo. A
variável c guarda o número de fontes
Ler G = (N,M)
c ← conta_fonte(G)
Se c = 1 então
s ← fonte(G)
Caminho ← {s}
Fim_se
Enquanto (c = 1) e (s ≠ nulo) Faça
c ← 0

Para todo v  Γ+(s) Faça
grau_int(v) ← grau_int(v) – 1
Se grau_int(v) = 0 então
fonte ← v
c ← c + 1
Fim_se
Se c = 1 então
s ← fonte
Caminho ← Caminho  {s}
Fim_se
Fim_para
Se |Γ+(s)| = 0 então s ← nulo
Fim_enquanto
Se (c > 1) então
Escreva “Não existe caminho hamiltoniano”
Senão
Escreva Caminho
A
Caminho Hamiltoniano
36  Gráﬁ cos
do grafo. O valor de c para o grafo inicial pode ser
calculado durante a leitura do grafo, bem como
a defi nição do único vértice fonte, caso ele exista.
Para fi ns didáticos, estes passos estão descritos
no algoritmo fora do procedimento de leitura. O
procedimento conta_fonte( ) retorna o número de
fontes no grafo G. Caso c = 1, o algoritmo iden-
tifi ca a fonte s, a qual é incluída como o primeiro
vértice do caminho hamiltoniano, representado
na variável Caminho. O laço principal será repetido enquanto a condição de fonte única for verdadeira e ainda
existir vértice para ser incluído no caminho. A remoção da fonte acarreta a diminuição do grau interno de
todo os seus sucessores de uma unidade. Caso o grau interno de algum dos sucessores se torne 0, este vértice
é assumido como a fonte da próxima iteração. Se isto ocorrer para mais de um vértice, então o algoritmo ter-
mina. A nova fonte é incluída na solução.
Se o grafo for representado através de uma lista de adja-
cências, o algoritmo é desenvolvido em O(m).
Complexidade
O(m)
Figura 1 do exercício 7: Complexidade do Algoritmo
```

![Resolução](<imgs/cap4_ex09_sol_p665_1.png>)

![Resolução](<imgs/cap4_ex09_sol_p666_2.png>)
