# 3ª Lista - Exercício 17

## 1. Tipo de questão

Questão teórica direta sobre distância em grafo completo.

## 2. Estratégia de resolução

Usaremos a definição de grafo completo. No grafo $K_n$, todo par de vértices distintos é ligado por uma aresta.

Assim, se $u$ e $v$ são vértices distintos de $K_n$, então:

$$
d(u,v)=1.
$$

O diâmetro é a maior distância entre dois vértices do grafo. Portanto, para $n\geq 2$, essa maior distância será $1$.

## 3. Resolução detalhada

Considere o grafo completo $K_n$.

Por definição, em $K_n$ todos os pares de vértices distintos são adjacentes. Logo, para quaisquer dois vértices distintos $u,v\in V(K_n)$, existe a aresta $uv$.

Portanto:

$$
d(u,v)=1.
$$

Como isso vale para todo par de vértices distintos, nenhuma distância entre vértices distintos pode ser maior que $1$.

Além disso, se $n\geq 2$, existem pelo menos dois vértices distintos em $K_n$. Então existe pelo menos um par $u,v$ com:

$$
d(u,v)=1.
$$

Assim, a maior distância entre dois vértices distintos é $1$.

Logo:

$$
\operatorname{diâmetro}(K_n)=1,\quad n\geq 2.
$$

No caso especial $K_1$, há apenas um vértice. Não há par de vértices distintos. Pela convenção usual, a maior distância a partir do único vértice até ele mesmo é $0$, e portanto:

$$
\operatorname{diâmetro}(K_1)=0.
$$

## 4. Resposta final

Para $n\geq 2$:

$$
\operatorname{diâmetro}(K_n)=1.
$$

No caso especial $n=1$:

$$
\operatorname{diâmetro}(K_1)=0.
$$

## 5. Comentários didáticos

A teoria subjacente é a definição de grafo completo. Um grafo completo $K_n$ é aquele em que todo par de vértices distintos está ligado por uma aresta.

Como distância é o comprimento do menor caminho entre dois vértices, se dois vértices já são adjacentes, a distância entre eles é $1$.

Por isso, $K_n$ com $n\geq 2$ tem o menor diâmetro possível para um grafo com pelo menos dois vértices: diâmetro $1$.

Um erro comum é responder que o diâmetro é $n-1$, confundindo $K_n$ com o caminho $P_n$. No caminho $P_n$, os vértices extremos ficam a distância $n-1$. No grafo completo $K_n$, todos os vértices estão diretamente ligados.

Outro cuidado é o caso $K_1$. Muitos enunciados assumem implicitamente $n\geq 2$. Se essa hipótese não for dita, é melhor registrar que $K_1$ tem diâmetro $0$ pela convenção usual.
