# 3ª Lista - Exercício 10

## 1. Tipo de questão

Questão teórica de prova de impossibilidade usando graus de vértices.

## 2. Estratégia de resolução

Usaremos o resultado sobre soma dos graus apresentado por Nicoletti: como cada aresta contribui com dois graus, a soma dos graus de todos os vértices é igual ao dobro do número de arestas. Esse resultado também é conhecido como lema do aperto de mãos.

Como o enunciado exige $12$ vértices e $28$ arestas, qualquer grafo que satisfizesse essas condições teria soma dos graus igual a:

$$
2|E(G)|=2\cdot 28=56.
$$

Em cada item, mostraremos que as restrições impostas aos graus tornam impossível obter soma total $56$.

## 3. Resolução detalhada

Seja $G$ um grafo simples com $12$ vértices e $28$ arestas.

Pelo resultado sobre soma dos graus:

$$
\sum_{v\in V(G)} \deg(v)=2|E(G)|.
$$

Como $|E(G)|=28$, temos:

$$
\sum_{v\in V(G)} \deg(v)=56.
$$

Portanto, qualquer uma das condições propostas nos itens (a) e (b) precisaria produzir soma dos graus igual a $56$.

### (a) Grau de cada vértice igual a $3$ ou $4$

Se cada vértice tem grau $3$ ou $4$, então o maior grau possível de um vértice é $4$.

Como o grafo tem $12$ vértices, a maior soma de graus possível seria:

$$
12\cdot 4=48.
$$

Mas, para um grafo com $28$ arestas, a soma dos graus deveria ser $56$.

Temos então uma contradição:

$$
56>48.
$$

Logo, não existe grafo simples com $12$ vértices e $28$ arestas no qual todo vértice tenha grau $3$ ou $4$.

### (b) Grau de cada vértice igual a $3$ ou $6$

Se cada vértice tem grau $3$ ou $6$, então cada grau é múltiplo de $3$.

Assim, a soma dos graus também deveria ser múltiplo de $3$.

Mas a soma dos graus deveria ser:

$$
56.
$$

Como $56$ não é múltiplo de $3$, isso é impossível.

De forma equivalente, se $x$ for o número de vértices de grau $3$, então $12-x$ será o número de vértices de grau $6$. A soma dos graus seria:

$$
3x+6(12-x).
$$

Simplificando:

$$
3x+72-6x=72-3x.
$$

Para que o grafo tivesse $28$ arestas, precisaríamos de:

$$
72-3x=56.
$$

Logo:

$$
3x=16.
$$

Isso exigiria:

$$
x=\frac{16}{3},
$$

o que é impossível, pois $x$ deve ser um número inteiro de vértices.

Logo, não existe grafo simples com $12$ vértices e $28$ arestas no qual todo vértice tenha grau $3$ ou $6$.

## 4. Resposta final

Não existe tal grafo em nenhum dos dois casos:

- no item (a), graus apenas $3$ ou $4$ dão soma máxima $48$, mas seriam necessários $56$;
- no item (b), graus apenas $3$ ou $6$ dariam soma múltipla de $3$, mas seriam necessários $56$.

## 5. Comentários didáticos

A teoria subjacente é o resultado sobre soma dos graus apresentado por Nicoletti. Esse resultado diz que, ao somar os graus de todos os vértices de um grafo, cada aresta é contada duas vezes: uma em cada extremidade. Por isso:

$$
\sum_{v\in V(G)} \deg(v)=2|E(G)|.
$$

No item (a), a impossibilidade é por limite máximo. Se todos os $12$ vértices tivessem o maior grau permitido, que é $4$, a soma dos graus ainda seria apenas $48$. Portanto, não há como alcançar as $28$ arestas, pois $28$ arestas exigem soma de graus $56$.

No item (b), a impossibilidade é aritmética. Como os graus permitidos são $3$ e $6$, qualquer soma de graus será múltipla de $3$. Porém $56$ não é múltiplo de $3$.

Um erro comum é tentar desenhar o grafo antes de verificar a soma dos graus. Aqui, a verificação numérica já prova que o desenho é impossível. Esse tipo de teste deve ser feito antes de qualquer tentativa de construção.

Outro ponto importante é que a prova não depende de conhecer a forma do grafo. Ela usa apenas três informações do enunciado: número de vértices, número de arestas e graus permitidos.
