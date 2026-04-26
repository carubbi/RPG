# 3ª Lista - Exercício 18

## 1. Tipo de questão

Questão teórica de prova sobre relação de equivalência e conectividade em grafos.

## 2. Estratégia de resolução

Queremos provar que a relação $R$ definida em $V(G)$ por

$$
vRw \quad \text{se, e somente se, existe um caminho de } v \text{ para } w
$$

é uma relação de equivalência.

Para isso, precisamos verificar três propriedades:

- reflexividade: todo vértice se relaciona consigo mesmo;
- simetria: se $v$ se relaciona com $w$, então $w$ se relaciona com $v$;
- transitividade: se $u$ se relaciona com $v$ e $v$ se relaciona com $w$, então $u$ se relaciona com $w$.

Assumimos aqui o contexto usual de grafos não dirigidos. Em grafos dirigidos, a propriedade simétrica não vale necessariamente.

## 3. Resolução detalhada

Seja $G$ um grafo não dirigido, e seja $V(G)$ seu conjunto de vértices.

A relação $R$ é definida por:

$$
vRw \iff \text{existe um caminho de } v \text{ até } w.
$$

Vamos verificar as três propriedades.

### Reflexividade

Precisamos mostrar que, para todo $v\in V(G)$,

$$
vRv.
$$

De fato, todo vértice $v$ está conectado a si mesmo pelo caminho trivial:

$$
v.
$$

Esse caminho tem comprimento $0$.

Logo, existe um caminho de $v$ até $v$, e portanto:

$$
vRv.
$$

Assim, $R$ é reflexiva.

### Simetria

Precisamos mostrar que, para quaisquer $v,w\in V(G)$, se

$$
vRw,
$$

então

$$
wRv.
$$

Suponha que $vRw$. Então existe um caminho de $v$ até $w$.

Escreva esse caminho como:

$$
v=x_0,x_1,x_2,\ldots,x_k=w.
$$

Como o grafo é não dirigido, cada aresta pode ser percorrida nos dois sentidos. Portanto, podemos percorrer o mesmo caminho ao contrário:

$$
w=x_k,x_{k-1},\ldots,x_2,x_1,x_0=v.
$$

Esse é um caminho de $w$ até $v$.

Logo:

$$
wRv.
$$

Assim, $R$ é simétrica.

### Transitividade

Precisamos mostrar que, para quaisquer $u,v,w\in V(G)$, se

$$
uRv
$$

e

$$
vRw,
$$

então

$$
uRw.
$$

Suponha que $uRv$ e $vRw$.

Então existe um caminho de $u$ até $v$:

$$
u=x_0,x_1,\ldots,x_r=v
$$

e existe um caminho de $v$ até $w$:

$$
v=y_0,y_1,\ldots,y_s=w.
$$

Ao percorrer primeiro o caminho de $u$ até $v$ e depois o caminho de $v$ até $w$, obtemos um passeio de $u$ até $w$:

$$
u=x_0,x_1,\ldots,x_r=v=y_0,y_1,\ldots,y_s=w.
$$

Esse passeio pode repetir vértices. Porém, se existe um passeio de $u$ até $w$, então existe também um caminho de $u$ até $w$, removendo eventuais repetições.

Logo, existe um caminho de $u$ até $w$.

Portanto:

$$
uRw.
$$

Assim, $R$ é transitiva.

Como $R$ é reflexiva, simétrica e transitiva, concluímos que $R$ é uma relação de equivalência em $V(G)$.

## 4. Resposta final

A relação $R$ é uma relação de equivalência em $V(G)$, pois:

- é reflexiva: todo vértice tem caminho trivial até si mesmo;
- é simétrica: em grafo não dirigido, todo caminho pode ser percorrido no sentido inverso;
- é transitiva: caminhos podem ser concatenados, produzindo um passeio do qual se obtém um caminho.

## 5. Comentários didáticos

A teoria subjacente é a conexão entre componentes conexos e relações de equivalência.

A relação $R$ separa os vértices do grafo em classes: dois vértices ficam na mesma classe quando existe caminho entre eles. Essas classes são exatamente as componentes conexas do grafo.

A reflexividade usa o caminho trivial, isto é, o caminho de comprimento $0$ de um vértice até ele mesmo.

A simetria depende do grafo ser não dirigido. Se o grafo fosse dirigido, poderia existir caminho de $v$ para $w$ sem existir caminho de $w$ para $v$.

A transitividade usa concatenação de caminhos. A concatenação pode gerar um passeio com vértices repetidos, mas isso não é problema: de um passeio entre dois vértices podemos extrair um caminho entre esses mesmos vértices.

Um erro comum é afirmar a transitividade dizendo apenas “junta os caminhos”, sem notar que a junção pode repetir vértices. O argumento correto é: a junção gera um passeio, e a existência de passeio garante a existência de caminho.
