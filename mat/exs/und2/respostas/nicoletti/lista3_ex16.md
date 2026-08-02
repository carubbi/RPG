# 3ª Lista - Exercício 16

## 1. Leitura do grafo

Questão com grafo representado por imagem.

![Grafo do exercício 16](imgs/lista3_ex16.png)

Vértices:

$$
V(G)=\{v_1,v_2,v_3,v_4,v_5,v_6,v_7\}.
$$

Lista de adjacência proposta:

```text
v1: v2 v3 v4 v5
v2: v1 v3 v4 v5
v3: v1 v2 v4 v6
v4: v1 v2 v3 v5 v6 v7
v5: v1 v2 v4 v7
v6: v3 v4
v7: v4 v5
```

## 2. Estratégia de resolução

O diâmetro de um grafo conectado é a maior distância entre dois vértices do grafo.

Para encontrá-lo, calculamos as distâncias mínimas a partir de cada vértice. Como o grafo tem muitas arestas, a suspeita inicial é que o diâmetro seja pequeno. Precisamos verificar se todo par de vértices está a distância no máximo $2$ e se existe pelo menos um par que não esteja a distância $1$.

## 3. Resolução detalhada

Pela lista de adjacência, algumas distâncias são imediatamente iguais a $1$: são justamente as distâncias entre vértices adjacentes.

Precisamos verificar as distâncias entre pares que não aparecem diretamente na lista de adjacência.

### Distâncias a partir de $v_1$

O vértice $v_1$ é adjacente a:

$$
v_2,\ v_3,\ v_4,\ v_5.
$$

Logo:

$$
d(v_1,v_2)=d(v_1,v_3)=d(v_1,v_4)=d(v_1,v_5)=1.
$$

Os vértices restantes são $v_6$ e $v_7$.

Como $v_1$ é adjacente a $v_4$, e $v_4$ é adjacente a $v_6$ e $v_7$, temos:

$$
d(v_1,v_6)=2
\quad\text{e}\quad
d(v_1,v_7)=2.
$$

Portanto, a maior distância a partir de $v_1$ é $2$.

### Distâncias a partir de $v_2$

O vértice $v_2$ é adjacente a:

$$
v_1,\ v_3,\ v_4,\ v_5.
$$

Logo, esses vértices estão a distância $1$ de $v_2$.

Além disso:

$$
v_2,v_4,v_6
$$

é um caminho de $v_2$ até $v_6$, e

$$
v_2,v_4,v_7
$$

é um caminho de $v_2$ até $v_7$.

Assim:

$$
d(v_2,v_6)=2
\quad\text{e}\quad
d(v_2,v_7)=2.
$$

Portanto, a maior distância a partir de $v_2$ é $2$.

### Distâncias a partir de $v_3$

O vértice $v_3$ é adjacente a:

$$
v_1,\ v_2,\ v_4,\ v_6.
$$

Logo, esses vértices estão a distância $1$ de $v_3$.

Os vértices restantes são $v_5$ e $v_7$.

Como:

$$
v_3,v_4,v_5
$$

e

$$
v_3,v_4,v_7
$$

são caminhos de comprimento $2$, temos:

$$
d(v_3,v_5)=2
\quad\text{e}\quad
d(v_3,v_7)=2.
$$

Portanto, a maior distância a partir de $v_3$ é $2$.

### Distâncias a partir de $v_4$

O vértice $v_4$ é adjacente a todos os demais vértices:

$$
v_1,\ v_2,\ v_3,\ v_5,\ v_6,\ v_7.
$$

Logo, a maior distância a partir de $v_4$ é $1$.

### Distâncias a partir de $v_5$

O vértice $v_5$ é adjacente a:

$$
v_1,\ v_2,\ v_4,\ v_7.
$$

Logo, esses vértices estão a distância $1$ de $v_5$.

Os vértices restantes são $v_3$ e $v_6$.

Como:

$$
v_5,v_4,v_3
$$

e

$$
v_5,v_4,v_6
$$

são caminhos de comprimento $2$, temos:

$$
d(v_5,v_3)=2
\quad\text{e}\quad
d(v_5,v_6)=2.
$$

Portanto, a maior distância a partir de $v_5$ é $2$.

### Distâncias a partir de $v_6$

O vértice $v_6$ é adjacente a:

$$
v_3,\ v_4.
$$

Logo:

$$
d(v_6,v_3)=d(v_6,v_4)=1.
$$

Os demais vértices estão a distância $2$, pois:

$$
v_6,v_4,v_1,\quad
v_6,v_4,v_2,\quad
v_6,v_4,v_5,\quad
v_6,v_4,v_7
$$

são caminhos de comprimento $2$.

Portanto, a maior distância a partir de $v_6$ é $2$.

### Distâncias a partir de $v_7$

O vértice $v_7$ é adjacente a:

$$
v_4,\ v_5.
$$

Logo:

$$
d(v_7,v_4)=d(v_7,v_5)=1.
$$

Os demais vértices estão a distância $2$, pois:

$$
v_7,v_4,v_1,\quad
v_7,v_4,v_2,\quad
v_7,v_4,v_3,\quad
v_7,v_4,v_6
$$

são caminhos de comprimento $2$.

Portanto, a maior distância a partir de $v_7$ é $2$.

Reunindo as maiores distâncias:

| Vértice | Maior distância a partir do vértice |
|---|---:|
| $v_1$ | $2$ |
| $v_2$ | $2$ |
| $v_3$ | $2$ |
| $v_4$ | $1$ |
| $v_5$ | $2$ |
| $v_6$ | $2$ |
| $v_7$ | $2$ |

A maior dessas distâncias é $2$. Portanto:

$$
\operatorname{diâmetro}(G)=2.
$$

## 4. Resposta final

O diâmetro do grafo é:

$$
\operatorname{diâmetro}(G)=2.
$$

## 5. Comentários didáticos

A teoria subjacente é a definição de distância e diâmetro. A distância $d(u,v)$ é o comprimento do menor caminho entre $u$ e $v$. O diâmetro de um grafo conectado é a maior distância entre quaisquer dois vértices.

Neste exercício, o vértice $v_4$ tem papel central, pois é adjacente a todos os demais vértices. Isso garante que qualquer vértice pode chegar a qualquer outro passando por $v_4$ em no máximo dois passos.

O diâmetro não é $1$, porque o grafo não é completo. Por exemplo, $v_6$ não é adjacente a $v_7$. Assim, $d(v_6,v_7)\neq 1$. Como existe o caminho $v_6,v_4,v_7$, temos $d(v_6,v_7)=2$.

Um erro comum é calcular apenas algumas distâncias e concluir o diâmetro sem verificar todos os tipos de pares. A forma segura é identificar um vértice central, como $v_4$, e depois confirmar que os pares não adjacentes têm caminho de comprimento $2$.

Outro cuidado é que múltiplos desenhos de arestas ou curvas na figura não alteram a distância quando ligam o mesmo par de vértices. Para calcular o diâmetro, o que importa é se existe ou não uma ligação direta entre dois vértices.
