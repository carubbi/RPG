# 3ª Lista - Exercício 20

## 1. Tipo de questão

Questão teórica de prova sobre conectividade, componentes e número mínimo de arestas.

## 2. Estratégia de resolução

Queremos provar que todo grafo conectado com $n$ vértices tem pelo menos $n-1$ arestas.

A ideia é acompanhar o número de componentes conexas. Se começamos com $n$ vértices isolados e nenhuma aresta, temos $n$ componentes. Cada aresta adicionada pode reduzir o número de componentes em no máximo $1$, pois uma aresta liga apenas dois vértices.

Para o grafo se tornar conectado, deve haver apenas uma componente. Portanto, precisamos reduzir o número de componentes de $n$ para $1$, isto é, reduzir $n-1$ componentes. Isso exige pelo menos $n-1$ arestas.

## 3. Resolução detalhada

Seja $G$ um grafo conectado com $n$ vértices.

Queremos mostrar que:

$$
|E(G)|\geq n-1.
$$

Imagine inicialmente o conjunto de vértices de $G$ sem nenhuma aresta. Nesse momento, cada vértice é uma componente conexa isolada.

Assim, temos:

$$
n
$$

componentes conexas.

Agora pense em inserir as arestas de $G$ uma a uma.

Ao inserir uma aresta, há duas possibilidades:

- a aresta liga dois vértices que já estão na mesma componente;
- a aresta liga dois vértices que estão em componentes diferentes.

No primeiro caso, o número de componentes não diminui. A aresta apenas cria uma ligação extra dentro de uma componente que já era conexa.

No segundo caso, a aresta une duas componentes em uma só. Portanto, o número de componentes diminui exatamente $1$.

Assim, cada aresta pode diminuir o número de componentes em no máximo $1$.

Como $G$ é conectado, ao final o grafo tem exatamente uma componente conexa.

Portanto, o número de componentes precisa cair de $n$ para $1$.

A redução total necessária é:

$$
n-1.
$$

Como cada aresta reduz o número de componentes em no máximo $1$, são necessárias pelo menos $n-1$ arestas.

Logo:

$$
|E(G)|\geq n-1.
$$

Isso prova o teorema.

## 4. Resposta final

Qualquer grafo conectado com $n$ vértices tem pelo menos:

$$
n-1
$$

arestas.

Ou seja:

$$
|E(G)|\geq n-1.
$$

## 5. Comentários didáticos

A teoria subjacente é a noção de componente conexa. Uma componente conexa é uma parte maximal do grafo em que todos os vértices estão ligados por caminhos.

Um grafo conectado tem exatamente uma componente conexa. Já um grafo com $n$ vértices e nenhuma aresta tem $n$ componentes, pois cada vértice fica isolado.

A prova usa a ideia de que uma aresta só pode unir, no máximo, duas componentes. Portanto, uma única aresta não consegue reduzir o número de componentes em mais de $1$.

Esse resultado também está ligado às árvores. Uma árvore com $n$ vértices tem exatamente $n-1$ arestas. Assim, árvores são os grafos conectados com o menor número possível de arestas.

Um erro comum é pensar que a prova depende do grafo ser simples. A ideia principal vale para grafos finitos não dirigidos em geral: laços não ajudam a conectar componentes diferentes, e arestas paralelas extras também não reduzem mais componentes depois que os extremos já estão conectados.

Outro erro comum é confundir “pelo menos $n-1$ arestas” com “exatamente $n-1$ arestas”. Grafos conectados podem ter mais que $n-1$ arestas. O teorema diz apenas que não podem ter menos.
