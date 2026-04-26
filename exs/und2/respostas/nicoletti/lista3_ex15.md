# 3ª Lista - Exercício 15

## 1. Tipo de questão

Questão teórica de prova sobre conectividade, ciclos e remoção de arestas.

## 2. Estratégia de resolução

Queremos provar que, se uma aresta $e$ pertence a um ciclo, então remover $e$ não desconecta o grafo.

A ideia é simples: se $e=uv$ está em um ciclo, então existe outro caminho de $u$ até $v$ usando as demais arestas desse ciclo. Portanto, mesmo após remover $e$, os extremos $u$ e $v$ continuam conectados.

Como $G$ é conectado, quaisquer dois vértices $x$ e $y$ têm um caminho entre si em $G$. Se esse caminho não usa $e$, ele continua existindo após a remoção. Se usa $e$, substituímos o trecho $u,v$ pelo outro caminho entre $u$ e $v$ contido no ciclo.

## 3. Resolução detalhada

Seja $G$ um grafo conectado, e seja $e$ uma aresta de $G$ que faz parte de um ciclo.

Escreva:

$$
e=uv.
$$

Como $e$ faz parte de um ciclo, existe um ciclo da forma:

$$
u,v,w_1,w_2,\ldots,w_k,u.
$$

Nesse ciclo, a aresta $uv$ é a aresta $e$. Se removermos essa aresta, ainda sobra o caminho:

$$
u,w_k,w_{k-1},\ldots,w_2,w_1,v.
$$

Esse caminho liga $u$ a $v$ sem usar a aresta $e$.

Agora precisamos mostrar que $G-e$ continua conectado.

Tome dois vértices quaisquer $x,y\in V(G)$. Como $G$ é conectado, existe um caminho de $x$ até $y$ em $G$.

Há dois casos.

### Caso 1: o caminho de $x$ até $y$ não usa $e$

Se o caminho não usa $e$, então todas as suas arestas continuam presentes em $G-e$.

Logo, $x$ e $y$ continuam conectados em $G-e$.

### Caso 2: o caminho de $x$ até $y$ usa $e$

Se o caminho usa $e=uv$, então, em algum ponto, ele passa diretamente de $u$ para $v$ ou de $v$ para $u$.

Mas acabamos de mostrar que existe outro caminho entre $u$ e $v$ que não usa $e$, formado pelo restante do ciclo.

Portanto, substituímos no caminho original o trecho que usa $e$ por esse outro caminho entre $u$ e $v$.

O resultado é um passeio de $x$ até $y$ em $G-e$.

Como de todo passeio entre dois vértices podemos extrair um caminho entre esses mesmos vértices, existe um caminho de $x$ até $y$ em $G-e$.

Assim, $x$ e $y$ continuam conectados em $G-e$.

Como $x$ e $y$ foram escolhidos arbitrariamente, quaisquer dois vértices de $G-e$ estão conectados. Portanto, $G-e$ é conectado.

## 4. Resposta final

Se a aresta $e=uv$ pertence a um ciclo, então o restante desse ciclo fornece um caminho de $u$ até $v$ que não usa $e$.

Assim, ao remover $e$, qualquer caminho que passava por $e$ pode ser substituído por um caminho alternativo pelo ciclo. Portanto, $G-e$ continua conectado.

## 5. Comentários didáticos

A teoria subjacente é a relação entre ciclos e pontes. Uma ponte é uma aresta cuja remoção desconecta o grafo. O exercício mostra uma propriedade fundamental: uma aresta que pertence a um ciclo não é ponte.

Intuitivamente, uma aresta em ciclo tem uma rota alternativa. Se a aresta $uv$ é removida, ainda é possível ir de $u$ até $v$ pelo outro lado do ciclo.

O ponto delicado da prova é não verificar apenas os extremos $u$ e $v$ da aresta removida. Precisamos garantir que quaisquer dois vértices $x$ e $y$ do grafo continuam conectados. Fazemos isso tomando um caminho qualquer de $x$ até $y$ em $G$ e observando que, se ele usa $e$, podemos substituir $e$ pelo restante do ciclo.

Um erro comum é dizer apenas “como está em um ciclo, não desconecta” sem justificar a substituição do caminho. A justificativa completa exige explicar por que todos os pares de vértices continuam conectados após a remoção.

Esse exercício complementa o Exercício 14: lá usamos um grafo sem ciclos, no qual todas as arestas eram pontes; aqui vemos que uma aresta em ciclo nunca é ponte.
