# 3ª Lista - Exercício 11

## 1. Tipo de questão

Questão de modelagem e prova de impossibilidade usando graus de vértices.

## 2. Estratégia de resolução

Modelamos o grupo de pessoas por um grafo simples não dirigido:

- cada pessoa é representada por um vértice;
- duas pessoas são ligadas por uma aresta quando uma conhece a outra.

Como o enunciado diz que cada pessoa conhece exatamente três outras pessoas, cada vértice teria grau $3$. Assim, o grafo teria $7$ vértices, todos de grau $3$.

Usaremos o resultado sobre soma dos graus apresentado por Nicoletti: a soma dos graus dos vértices é igual ao dobro do número de arestas. Portanto, essa soma precisa ser um número par.

## 3. Resolução detalhada

Suponha, por contradição, que exista um grupo de sete pessoas tal que cada pessoa conheça exatamente três outras pessoas no grupo.

Construímos um grafo $G$ da seguinte forma:

$$
V(G)=\{\text{pessoas do grupo}\}.
$$

Como há sete pessoas, temos:

$$
|V(G)|=7.
$$

Ligamos dois vértices por uma aresta quando as duas pessoas correspondentes se conhecem.

Como cada pessoa conhece exatamente três outras pessoas, cada vértice tem grau $3$. Portanto:

$$
\deg(v)=3
$$

para todo $v\in V(G)$.

A soma dos graus seria:

$$
\sum_{v\in V(G)}\deg(v)=7\cdot 3=21.
$$

Por outro lado, pelo resultado sobre soma dos graus:

$$
\sum_{v\in V(G)}\deg(v)=2|E(G)|.
$$

Logo, a soma dos graus deve ser um número par, pois é o dobro do número de arestas.

Mas encontramos soma dos graus igual a $21$, que é ímpar. Isso é impossível.

Portanto, não é possível ter um grupo de sete pessoas em que cada pessoa conheça exatamente três outras pessoas do grupo.

## 4. Resposta final

Não é possível. Se houvesse tal grupo, o grafo correspondente teria $7$ vértices, todos de grau $3$, e a soma dos graus seria:

$$
7\cdot 3=21.
$$

Mas a soma dos graus de um grafo deve ser igual a $2|E(G)|$, portanto deve ser par. Contradição.

## 5. Comentários didáticos

A teoria subjacente é a mesma do exercício anterior: a soma dos graus de todos os vértices de um grafo é igual a duas vezes o número de arestas.

O exercício pode ser visto como um caso particular de um fato mais geral: em qualquer grafo, o número de vértices de grau ímpar deve ser par. Aqui, todos os $7$ vértices teriam grau $3$, que é ímpar. Isso daria uma quantidade ímpar de vértices de grau ímpar, o que não pode acontecer.

A modelagem é essencial. O grupo de pessoas é transformado em grafo: pessoas viram vértices e relações de conhecimento viram arestas. Como o enunciado está em contexto de grafos não dirigidos, interpretamos “conhecer” como relação mútua: se uma pessoa conhece outra, a ligação conta para as duas.

Um erro comum é tentar listar manualmente quem conhece quem. Esse caminho tende a ficar confuso. A soma dos graus resolve o problema de forma direta, porque mostra que a condição já é impossível antes de qualquer tentativa de construção.

Outro cuidado é perceber que a contradição não vem do número $3$ isoladamente. Existem grafos em que todos os vértices têm grau $3$, mas eles precisam ter número par de vértices. O problema aqui é combinar grau $3$ com exatamente $7$ pessoas.
