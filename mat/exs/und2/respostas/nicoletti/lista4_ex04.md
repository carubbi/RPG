# 4ª Lista - Exercício 4

## 1. Leitura do grafo

Questão com grafo representado por imagem.

![Grafo do exercício 4](imgs/lista4_ex04.png)

Como a figura não rotula os vértices, foi adotada a rotulação por faixas horizontais: primeiro os vértices da faixa superior, da esquerda para a direita; depois os vértices das faixas abaixo, também da esquerda para a direita.

Vértices:

$$
V(G)=\{v_1,v_2,v_3,v_4,v_5,v_6,v_7,v_8,v_9,v_{10},v_{11},v_{12}\}.
$$

Lista de adjacência proposta:

```text
v1: v5(e3)
v2: v3(e8) v6(e6) v12(e9)
v3: v2(e8) v7(e11) v12(e10)
v4: v4(e1) v5(e2)
v5: v1(e3) v4(e2) v6(e5) v10(e4)
v6: v2(e6) v5(e5) v11(e7)
v7: v3(e11) v8(e13) v12(e12)
v8: v7(e13)
v9: v9(e14)
v10: v5(e4)
v11: v6(e7)
v12: v2(e9) v3(e10) v7(e12)
```

## 2. Estratégia de resolução

Uma ponte é uma aresta cuja remoção aumenta o número de componentes conexas do grafo.

Para encontrar as pontes, usaremos dois critérios:

- laços não são pontes, pois não ajudam a conectar vértices distintos;
- arestas que pertencem a algum ciclo não são pontes, pois o ciclo fornece um caminho alternativo entre suas extremidades.

Assim, vamos separar as arestas que estão em ciclos das arestas que são o único acesso a alguma parte do grafo.

## 3. Resolução detalhada

### Arestas que não são pontes

Os laços $e_1$ e $e_{14}$ não são pontes.

De fato:

- $e_1$ é um laço em $v_4$;
- $e_{14}$ é um laço em $v_9$.

Remover um laço não separa nenhum vértice de outro, pois um laço começa e termina no mesmo vértice.

Agora analisemos os ciclos da parte central direita do grafo.

Pela lista de adjacência, temos o ciclo:

$$
v_2,v_3,v_{12},v_2.
$$

Esse ciclo usa as arestas:

$$
e_8,\ e_{10},\ e_9.
$$

Logo, $e_8$, $e_9$ e $e_{10}$ não são pontes.

Também temos o ciclo:

$$
v_3,v_7,v_{12},v_3.
$$

Esse ciclo usa as arestas:

$$
e_{11},\ e_{12},\ e_{10}.
$$

Logo, $e_{11}$, $e_{12}$ e, novamente, $e_{10}$ não são pontes.

Portanto, as arestas:

$$
e_1,\ e_8,\ e_9,\ e_{10},\ e_{11},\ e_{12},\ e_{14}
$$

não são pontes.

### Arestas que são pontes

Agora verificamos as demais arestas.

#### Aresta $e_2$

A aresta $e_2$ liga $v_4$ a $v_5$.

O vértice $v_4$ possui apenas o laço $e_1$ e a aresta $e_2$ para se ligar ao restante do grafo. Se $e_2$ for removida, $v_4$ fica separado dos demais vértices.

Logo, $e_2$ é ponte.

#### Aresta $e_3$

A aresta $e_3$ liga $v_1$ a $v_5$.

O vértice $v_1$ só se conecta ao restante do grafo por $e_3$. Se $e_3$ for removida, $v_1$ fica isolado.

Logo, $e_3$ é ponte.

#### Aresta $e_4$

A aresta $e_4$ liga $v_5$ a $v_{10}$.

O vértice $v_{10}$ só se conecta ao restante do grafo por $e_4$. Se $e_4$ for removida, $v_{10}$ fica isolado.

Logo, $e_4$ é ponte.

#### Aresta $e_5$

A aresta $e_5$ liga $v_5$ a $v_6$.

Essa aresta é a única ligação entre a parte esquerda do grafo, que contém $v_1$, $v_4$, $v_5$ e $v_{10}$, e a parte direita do grafo, que contém $v_2$, $v_3$, $v_6$, $v_7$, $v_8$, $v_{11}$ e $v_{12}$.

Se $e_5$ for removida, essas duas partes ficam desconectadas.

Logo, $e_5$ é ponte.

#### Aresta $e_6$

A aresta $e_6$ liga $v_6$ a $v_2$.

Ela é a única ligação entre $v_6$ e a subestrutura cíclica formada por $v_2$, $v_3$, $v_7$ e $v_{12}$. Se $e_6$ for removida, não há outro caminho de $v_6$ até essa subestrutura.

Logo, $e_6$ é ponte.

#### Aresta $e_7$

A aresta $e_7$ liga $v_6$ a $v_{11}$.

O vértice $v_{11}$ só se conecta ao restante do grafo por $e_7$. Se $e_7$ for removida, $v_{11}$ fica isolado.

Logo, $e_7$ é ponte.

#### Aresta $e_{13}$

A aresta $e_{13}$ liga $v_7$ a $v_8$.

O vértice $v_8$ só se conecta ao restante do grafo por $e_{13}$. Se $e_{13}$ for removida, $v_8$ fica isolado.

Logo, $e_{13}$ é ponte.

Portanto, as pontes são:

$$
e_2,\ e_3,\ e_4,\ e_5,\ e_6,\ e_7,\ e_{13}.
$$

## 4. Resposta final

As pontes do grafo são:

$$
\boxed{e_2,\ e_3,\ e_4,\ e_5,\ e_6,\ e_7,\ e_{13}}.
$$

## 5. Comentários didáticos

A teoria subjacente é a noção de ponte. Uma aresta é ponte quando sua remoção aumenta o número de componentes conexas do grafo.

Uma forma prática de encontrar pontes é observar quais arestas pertencem a ciclos. Se uma aresta está em um ciclo, ela não é ponte, pois existe um caminho alternativo entre suas extremidades pelo restante do ciclo.

Neste grafo, as arestas $e_8$, $e_9$, $e_{10}$, $e_{11}$ e $e_{12}$ pertencem a ciclos, portanto não são pontes.

Laços também não são pontes. Um laço liga um vértice a ele mesmo; removê-lo não separa componentes. Por isso, $e_1$ e $e_{14}$ não são pontes.

As pontes aparecem nas partes “penduradas” do grafo ou nas ligações únicas entre blocos. Por exemplo, $e_5$ é ponte porque é a única ligação entre a parte esquerda e a parte direita do grafo.

Um erro comum é marcar como ponte toda aresta que parece visualmente estreita ou externa. O critério correto não é a aparência do desenho, mas o efeito da remoção da aresta sobre a conectividade.

Outro erro comum é considerar laços como pontes. Laços nunca são pontes em grafos não dirigidos, pois não conectam dois vértices distintos.
