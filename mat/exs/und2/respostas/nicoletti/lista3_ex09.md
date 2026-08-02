# 3ª Lista - Exercício 9

## 1. Tipo de questão

Questão mista: cálculo de raio e diâmetro em grafos já representados anteriormente, seguido de prova teórica sobre raio e diâmetro.

## 2. Estratégia de resolução

Para o item (a), usamos as listas de adjacência já aprovadas nos exercícios 1, 4 e 7. Para cada vértice $v$, calculamos sua excentricidade:

$$
\operatorname{exc}(v)=\max\{d(u,v)\mid u\in V,\ u\neq v\}.
$$

Depois:

$$
\operatorname{raio}(G)=\min\{\operatorname{exc}(v)\mid v\in V\}
$$

e

$$
\operatorname{diâmetro}(G)=\max\{\operatorname{exc}(v)\mid v\in V\}.
$$

Para o item (b), usamos um vértice central $c$, isto é, um vértice com excentricidade igual ao raio. A desigualdade triangular aplicada a $u,c,v$ mostra que qualquer distância $d(u,v)$ é no máximo $2\operatorname{raio}(G)$.

Para o item (c), usamos a definição de diâmetro: se o diâmetro é $1$, então todo par de vértices distintos está ligado por uma aresta.

## 3. Resolução detalhada

### (a) Raio e diâmetro dos grafos dos exercícios 1, 4 e 7

Como o Exercício 1 contém seis grafos, calculamos separadamente os grafos (a), (b), (c), (d), (e) e (f).

| Grafo | Excentricidades | Raio | Diâmetro | Centro |
|---|---|---:|---:|---|
| Exercício 1(a) | $\operatorname{exc}(v_1)=3$, $\operatorname{exc}(v_2)=3$, $\operatorname{exc}(v_3)=2$, $\operatorname{exc}(v_4)=2$, $\operatorname{exc}(v_5)=2$, $\operatorname{exc}(v_6)=3$, $\operatorname{exc}(v_7)=3$ | $2$ | $3$ | $\{v_3,v_4,v_5\}$ |
| Exercício 1(b) | $\operatorname{exc}(v_1)=3$, $\operatorname{exc}(v_2)=2$, $\operatorname{exc}(v_3)=2$, $\operatorname{exc}(v_4)=3$, $\operatorname{exc}(v_5)=3$, $\operatorname{exc}(v_6)=3$, $\operatorname{exc}(v_7)=2$, $\operatorname{exc}(v_8)=3$ | $2$ | $3$ | $\{v_2,v_3,v_7\}$ |
| Exercício 1(c) | $\operatorname{exc}(v_1)=3$, $\operatorname{exc}(v_2)=3$, $\operatorname{exc}(v_3)=4$, $\operatorname{exc}(v_4)=2$, $\operatorname{exc}(v_5)=3$, $\operatorname{exc}(v_6)=4$, $\operatorname{exc}(v_7)=3$ | $2$ | $4$ | $\{v_4\}$ |
| Exercício 1(d) | $\operatorname{exc}(v_1)=4$, $\operatorname{exc}(v_2)=3$, $\operatorname{exc}(v_3)=4$, $\operatorname{exc}(v_4)=4$, $\operatorname{exc}(v_5)=3$, $\operatorname{exc}(v_6)=2$, $\operatorname{exc}(v_7)=3$, $\operatorname{exc}(v_8)=4$, $\operatorname{exc}(v_9)=4$, $\operatorname{exc}(v_{10})=4$ | $2$ | $4$ | $\{v_6\}$ |
| Exercício 1(e) | $\operatorname{exc}(v_1)=4$, $\operatorname{exc}(v_2)=3$, $\operatorname{exc}(v_3)=3$, $\operatorname{exc}(v_4)=4$, $\operatorname{exc}(v_5)=4$, $\operatorname{exc}(v_6)=4$, $\operatorname{exc}(v_7)=4$, $\operatorname{exc}(v_8)=4$, $\operatorname{exc}(v_9)=3$, $\operatorname{exc}(v_{10})=3$ | $3$ | $4$ | $\{v_2,v_3,v_9,v_{10}\}$ |
| Exercício 1(f) | $\operatorname{exc}(v_1)=2$, $\operatorname{exc}(v_2)=2$, $\operatorname{exc}(v_3)=1$, $\operatorname{exc}(v_4)=2$, $\operatorname{exc}(v_5)=2$, $\operatorname{exc}(v_6)=2$, $\operatorname{exc}(v_7)=2$ | $1$ | $2$ | $\{v_3\}$ |
| Exercício 4 | $\operatorname{exc}(v_1)=7$, $\operatorname{exc}(v_2)=6$, $\operatorname{exc}(v_3)=5$, $\operatorname{exc}(v_4)=4$, $\operatorname{exc}(v_5)=5$, $\operatorname{exc}(v_6)=6$, $\operatorname{exc}(v_7)=4$, $\operatorname{exc}(v_8)=7$, $\operatorname{exc}(v_9)=6$, $\operatorname{exc}(v_{10})=5$, $\operatorname{exc}(v_{11})=4$, $\operatorname{exc}(v_{12})=6$, $\operatorname{exc}(v_{13})=7$ | $4$ | $7$ | $\{v_4,v_7,v_{11}\}$ |
| Exercício 7 | $\operatorname{exc}(v_i)=2$ para todo $i\in\{1,\ldots,10\}$ | $2$ | $2$ | $V(G)$ |

Logo, os raios e diâmetros são:

| Grafo | Raio | Diâmetro |
|---|---:|---:|
| Exercício 1(a) | $2$ | $3$ |
| Exercício 1(b) | $2$ | $3$ |
| Exercício 1(c) | $2$ | $4$ |
| Exercício 1(d) | $2$ | $4$ |
| Exercício 1(e) | $3$ | $4$ |
| Exercício 1(f) | $1$ | $2$ |
| Exercício 4 | $4$ | $7$ |
| Exercício 7 | $2$ | $2$ |

### (b) Prova de que $\operatorname{raio}(G)\leq \operatorname{diâmetro}(G)\leq 2\operatorname{raio}(G)$

Seja $G$ um grafo conectado.

Pelas definições:

$$
\operatorname{raio}(G)=\min\{\operatorname{exc}(v)\mid v\in V(G)\}
$$

e

$$
\operatorname{diâmetro}(G)=\max\{\operatorname{exc}(v)\mid v\in V(G)\}.
$$

Como o mínimo de um conjunto de números é sempre menor ou igual ao máximo desse mesmo conjunto, temos:

$$
\operatorname{raio}(G)\leq \operatorname{diâmetro}(G).
$$

Agora provemos que:

$$
\operatorname{diâmetro}(G)\leq 2\operatorname{raio}(G).
$$

Seja $c$ um vértice central de $G$. Então:

$$
\operatorname{exc}(c)=\operatorname{raio}(G).
$$

Para quaisquer vértices $u,v\in V(G)$, pela desigualdade triangular:

$$
d(u,v)\leq d(u,c)+d(c,v).
$$

Como $c$ tem excentricidade igual ao raio:

$$
d(u,c)\leq \operatorname{raio}(G)
\quad \text{e} \quad
d(c,v)\leq \operatorname{raio}(G).
$$

Logo:

$$
d(u,v)\leq 2\operatorname{raio}(G).
$$

Como o diâmetro é a maior distância entre dois vértices de $G$, concluímos:

$$
\operatorname{diâmetro}(G)\leq 2\operatorname{raio}(G).
$$

Portanto:

$$
\operatorname{raio}(G)\leq \operatorname{diâmetro}(G)\leq 2\operatorname{raio}(G).
$$

### (c) Quais grafos simples têm diâmetro $1$?

Um grafo simples tem diâmetro $1$ quando a maior distância entre dois vértices distintos é $1$.

Isso significa que todo par de vértices distintos está ligado por uma aresta. Mas essa é exatamente a definição de grafo completo.

Portanto, os grafos simples com diâmetro $1$ são os grafos completos $K_n$, com $n\geq 2$.

## 4. Resposta final

- Os raios e diâmetros dos grafos do item (a) estão na tabela acima.
- Para todo grafo conectado $G$:

$$
\operatorname{raio}(G)\leq \operatorname{diâmetro}(G)\leq 2\operatorname{raio}(G).
$$

- Os grafos simples com diâmetro $1$ são exatamente os grafos completos $K_n$, com $n\geq 2$.

## 5. Comentários didáticos

A teoria subjacente é a noção de excentricidade. A excentricidade de um vértice mede a maior distância desse vértice até qualquer outro vértice do grafo. O raio é a menor dessas excentricidades; o diâmetro é a maior.

Intuitivamente, o raio mede a distância máxima a partir de um vértice “bem central”. Já o diâmetro mede a maior distância que aparece no grafo inteiro.

No item (b), a ideia central é usar um vértice central $c$ como intermediário. Todo vértice está a distância no máximo $\operatorname{raio}(G)$ de $c$. Portanto, para ir de $u$ até $v$, podemos passar por $c$ e percorrer no máximo:

$$
\operatorname{raio}(G)+\operatorname{raio}(G)=2\operatorname{raio}(G).
$$

Um erro comum é pensar que diâmetro $1$ significa “grafo conectado”. Isso é falso. Grafo conectado exige apenas que exista algum caminho entre quaisquer dois vértices. Diâmetro $1$ exige muito mais: todo par de vértices distintos deve estar ligado por uma aresta direta.
