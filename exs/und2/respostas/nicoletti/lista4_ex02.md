# 4ª Lista - Exercício 2

## 1. Tipo de questão

Questão teórica de prova sobre árvores e grafos bipartidos.

## 2. Estratégia de resolução

Queremos provar que toda árvore com pelo menos dois vértices é bipartida.

A estratégia será escolher um vértice qualquer como raiz $r$ e separar os demais vértices conforme a paridade da distância até $r$:

- em $X$, colocamos os vértices a distância par de $r$;
- em $Y$, colocamos os vértices a distância ímpar de $r$.

Depois mostramos que toda aresta da árvore liga um vértice de $X$ a um vértice de $Y$. Isso prova que a árvore é bipartida.

## 3. Resolução detalhada

Seja $T$ uma árvore com pelo menos dois vértices.

Escolha um vértice qualquer $r\in V(T)$.

Como $T$ é uma árvore, $T$ é conectado. Portanto, para todo vértice $v\in V(T)$, existe caminho de $r$ até $v$, e a distância $d(r,v)$ está bem definida.

Defina:

$$
X=\{v\in V(T)\mid d(r,v)\text{ é par}\}
$$

e

$$
Y=\{v\in V(T)\mid d(r,v)\text{ é ímpar}\}.
$$

Claramente, todo vértice de $T$ pertence a exatamente um dos conjuntos $X$ ou $Y$, pois toda distância inteira é par ou ímpar, nunca as duas coisas ao mesmo tempo.

Agora precisamos mostrar que não existe aresta ligando dois vértices dentro de $X$ nem dois vértices dentro de $Y$.

Seja $uv$ uma aresta qualquer de $T$.

Como $T$ é uma árvore, existe um único caminho simples entre $r$ e qualquer vértice. Em particular, existe um único caminho de $r$ até $u$ e um único caminho de $r$ até $v$.

Como $u$ e $v$ são adjacentes, as distâncias $d(r,u)$ e $d(r,v)$ não podem diferir por mais de $1$. De fato, se existe um caminho de $r$ até $u$, então podemos seguir a aresta $uv$ e obter um caminho de $r$ até $v$ com uma aresta a mais. Portanto:

$$
d(r,v)\leq d(r,u)+1.
$$

Pelo mesmo raciocínio:

$$
d(r,u)\leq d(r,v)+1.
$$

Logo:

$$
|d(r,u)-d(r,v)|\leq 1.
$$

Agora precisamos excluir o caso em que:

$$
d(r,u)=d(r,v).
$$

Se $d(r,u)=d(r,v)$, então o caminho de $r$ até $u$, a aresta $uv$ e o caminho de $v$ de volta até $r$ formariam um ciclo em $T$.

Isso é impossível, pois $T$ é uma árvore e, portanto, não possui ciclos.

Assim, as distâncias não são iguais. Como elas diferem por no máximo $1$, concluímos que:

$$
|d(r,u)-d(r,v)|=1.
$$

Logo, uma das distâncias $d(r,u)$ e $d(r,v)$ é par, e a outra é ímpar.

Portanto, uma extremidade da aresta $uv$ pertence a $X$ e a outra pertence a $Y$.

Como $uv$ era uma aresta qualquer, toda aresta de $T$ liga um vértice de $X$ a um vértice de $Y$.

Assim, não há arestas dentro de $X$ nem dentro de $Y$.

Portanto, $T$ é bipartida.

## 4. Resposta final

Toda árvore com pelo menos dois vértices é bipartida.

Uma bipartição pode ser obtida escolhendo uma raiz $r$ e definindo:

$$
X=\{v\in V(T)\mid d(r,v)\text{ é par}\}
$$

e

$$
Y=\{v\in V(T)\mid d(r,v)\text{ é ímpar}\}.
$$

Toda aresta liga um vértice de $X$ a um vértice de $Y$.

## 5. Comentários didáticos

A teoria subjacente é a relação entre árvores, caminhos únicos e bipartição.

Uma árvore é um grafo conectado sem ciclos. O fato de não haver ciclos implica que entre dois vértices existe exatamente um caminho simples. Essa propriedade permite usar distâncias a partir de uma raiz sem ambiguidade.

A ideia da prova é “colorir” os vértices por níveis: nível $0$, nível $2$, nível $4$ e assim por diante ficam em uma parte; nível $1$, nível $3$, nível $5$ e assim por diante ficam na outra.

Uma aresta em uma árvore sempre liga níveis consecutivos. Se houvesse uma aresta ligando dois vértices do mesmo nível, ou dois vértices cuja distância à raiz tivesse a mesma paridade, seria possível formar um ciclo, contradizendo o fato de o grafo ser uma árvore.

Um erro comum é tentar desenhar apenas alguns exemplos de árvores e concluir a propriedade visualmente. Exemplos ajudam a entender, mas a prova precisa funcionar para qualquer árvore.

Outro erro comum é esquecer que a escolha da raiz é arbitrária. Diferentes escolhas de raiz podem produzir bipartições com os lados trocados ou organizados de outra forma, mas todas são válidas.
