# 5ª Lista - Exercício 4

## 1. Tipo de questão

Questão teórica sobre grafos bipartidos completos e ciclos hamiltonianos.

## 2. Estratégia de resolução

Queremos decidir quando o grafo bipartido completo $K_{m,n}$ é hamiltoniano.

Em um grafo bipartido, todo ciclo alterna entre as duas partes da bipartição. Portanto, qualquer ciclo usa a mesma quantidade de vértices em cada parte.

Como um ciclo hamiltoniano precisa usar todos os vértices, $K_{m,n}$ só pode ser hamiltoniano se:

$$
m=n.
$$

Depois mostraremos que, se $m=n\geq 2$, então é possível construir explicitamente um ciclo hamiltoniano.

## 3. Resolução detalhada

Considere o grafo bipartido completo $K_{m,n}$ com bipartição:

$$
X=\{x_1,x_2,\ldots,x_m\}
$$

e

$$
Y=\{y_1,y_2,\ldots,y_n\}.
$$

Por ser bipartido completo, todo vértice de $X$ é adjacente a todo vértice de $Y$, e não há arestas entre dois vértices de $X$ nem entre dois vértices de $Y$.

### Condição necessária

Suponha que $K_{m,n}$ seja hamiltoniano.

Então existe um ciclo hamiltoniano que passa por todos os vértices de $K_{m,n}$.

Como o grafo é bipartido, esse ciclo precisa alternar entre vértices de $X$ e vértices de $Y$:

$$
X,Y,X,Y,\ldots
$$

Logo, qualquer ciclo em $K_{m,n}$ usa a mesma quantidade de vértices em $X$ e em $Y$.

Mas, se o ciclo é hamiltoniano, ele usa todos os vértices do grafo. Portanto, ele usa todos os $m$ vértices de $X$ e todos os $n$ vértices de $Y$.

Assim, necessariamente:

$$
m=n.
$$

Além disso, precisamos ter pelo menos dois vértices em cada parte. Se $m=n=1$, então $K_{1,1}$ tem apenas uma aresta e não possui ciclo.

Portanto, uma condição necessária é:

$$
m=n\geq 2.
$$

### Condição suficiente

Agora suponha que:

$$
m=n\geq 2.
$$

Escreva:

$$
X=\{x_1,x_2,\ldots,x_n\}
$$

e

$$
Y=\{y_1,y_2,\ldots,y_n\}.
$$

Como o grafo é bipartido completo, todo vértice $x_i$ é adjacente a todo vértice $y_j$.

Então a sequência:

$$
x_1,y_1,x_2,y_2,\ldots,x_n,y_n,x_1
$$

é um ciclo.

De fato:

- cada aresta $x_i y_i$ existe;
- cada aresta $y_i x_{i+1}$ existe, para $1\leq i<n$;
- a aresta $y_n x_1$ também existe.

Todas essas arestas existem porque cada vértice de $X$ é adjacente a cada vértice de $Y$.

Além disso, a sequência passa exatamente uma vez por todos os vértices de $X$ e todos os vértices de $Y$, e depois retorna ao vértice inicial.

Logo, essa sequência é um ciclo hamiltoniano.

Portanto, se $m=n\geq 2$, então $K_{m,n}$ é hamiltoniano.

Concluímos:

$$
K_{m,n}\text{ é hamiltoniano se, e somente se, }m=n\geq 2.
$$

## 4. Resposta final

O grafo completo bipartido $K_{m,n}$ é hamiltoniano exatamente quando:

$$
m=n\geq 2.
$$

Nesse caso, um ciclo hamiltoniano é:

$$
x_1,y_1,x_2,y_2,\ldots,x_n,y_n,x_1.
$$

Se $m\neq n$, o grafo não é hamiltoniano, pois todo ciclo em grafo bipartido alterna entre as duas partes e, portanto, usa a mesma quantidade de vértices em cada parte.

## 5. Comentários didáticos

A teoria subjacente é a relação entre ciclos e bipartição.

Em grafos bipartidos, não existem arestas dentro da mesma parte. Por isso, ao percorrer um ciclo, somos obrigados a alternar entre as partes $X$ e $Y$.

Essa alternância implica que todo ciclo em grafo bipartido tem comprimento par e usa a mesma quantidade de vértices de cada parte.

Por isso, $K_{2,3}$, por exemplo, não pode ser hamiltoniano: um ciclo hamiltoniano teria que usar $2$ vértices de uma parte e $3$ da outra, o que é impossível em um ciclo alternado.

Já $K_{3,3}$ é hamiltoniano. Um exemplo é:

$$
x_1,y_1,x_2,y_2,x_3,y_3,x_1.
$$

Um erro comum é pensar que todo grafo bipartido completo é hamiltoniano porque tem muitas arestas. A quantidade de arestas ajuda, mas a bipartição impõe uma restrição forte: os dois lados precisam ter o mesmo tamanho.

Outro erro comum é esquecer o caso $K_{1,1}$. Embora $m=n=1$, o grafo tem apenas dois vértices e uma aresta, portanto não possui ciclo hamiltoniano.
