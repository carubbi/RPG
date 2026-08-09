# 5ª Lista - Exercício 3

## 1. Tipo de questão

Questão teórica sobre grafos completos e ciclos hamiltonianos.

## 2. Estratégia de resolução

Queremos decidir se o grafo completo $K_n$ é hamiltoniano.

Em $K_n$, todo par de vértices distintos é adjacente. Portanto, se escolhermos uma ordem qualquer para os $n$ vértices, todos os pares consecutivos nessa ordem estarão ligados por arestas. Além disso, o último vértice também estará ligado ao primeiro.

Assim, para $n\geq 3$, basta listar os vértices em qualquer ordem e fechar o ciclo.

## 3. Resolução detalhada

Considere:

$$
V(K_n)=\{v_1,v_2,\ldots,v_n\}.
$$

Como $K_n$ é completo, quaisquer dois vértices distintos são adjacentes.

Suponha primeiro que:

$$
n\geq 3.
$$

Então a sequência:

$$
v_1,v_2,v_3,\ldots,v_n,v_1
$$

é um ciclo.

De fato:

- $v_1$ é adjacente a $v_2$;
- $v_2$ é adjacente a $v_3$;
- em geral, $v_i$ é adjacente a $v_{i+1}$ para $1\leq i<n$;
- $v_n$ é adjacente a $v_1$.

Todas essas adjacências existem porque o grafo é completo.

Além disso, antes de retornar a $v_1$, a sequência passa exatamente uma vez por todos os vértices:

$$
v_1,v_2,\ldots,v_n.
$$

Portanto, para $n\geq 3$, $K_n$ é hamiltoniano.

Agora consideremos os casos pequenos.

O grafo $K_1$ tem apenas um vértice. Não é possível formar um ciclo hamiltoniano na definição usual, pois um ciclo precisa de pelo menos $3$ vértices.

O grafo $K_2$ tem dois vértices ligados por uma única aresta. Também não há ciclo, pois seria necessário retornar ao vértice inicial sem repetir aresta e sem repetir vértices intermediários.

Logo, na definição usual de ciclo em grafos simples:

$$
K_n \text{ é hamiltoniano se, e somente se, } n\geq 3.
$$

## 4. Resposta final

Sim, para $n\geq 3$, o grafo completo $K_n$ é hamiltoniano.

Um ciclo hamiltoniano é:

$$
v_1,v_2,\ldots,v_n,v_1.
$$

Nos casos $K_1$ e $K_2$, não há ciclo hamiltoniano na definição usual, pois não há ciclo com menos de $3$ vértices.

## 5. Comentários didáticos

A teoria subjacente é a definição de grafo completo. Em $K_n$, todo par de vértices distintos está ligado por uma aresta.

Essa propriedade torna a construção de um ciclo hamiltoniano direta: qualquer ordenação dos vértices serve. Não precisamos procurar uma ordem especial, porque todas as adjacências possíveis estão disponíveis.

Também podemos justificar a existência pelo Teorema de Dirac. Para $K_n$, todo vértice tem grau:

$$
\deg(v)=n-1.
$$

Se $n\geq 3$, então:

$$
n-1\geq \frac n2.
$$

Logo, Dirac garante que $K_n$ é hamiltoniano para $n\geq 3$.

O Teorema de Ore também se aplica de modo trivial: em $K_n$ não existem pares de vértices não adjacentes. Assim, a condição de Ore é satisfeita vacuamente.

Um erro comum é esquecer os casos $K_1$ e $K_2$. O enunciado geralmente pretende $n\geq 3$, mas, se isso não for dito, é melhor explicitar a exceção.

Outro erro comum é confundir caminho hamiltoniano com ciclo hamiltoniano. Em $K_2$, existe caminho hamiltoniano, mas não ciclo hamiltoniano.
