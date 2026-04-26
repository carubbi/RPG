# 3ª Lista - Exercício 4

## 1. Leitura do grafo

![Grafo do exercício 4](../../imgs/nicoletti_lista3_ex4.png)

A figura deste exercício não traz rótulos nos vértices. Para tornar a solução verificável, adotamos a rotulação por faixas horizontais: primeiro da esquerda para a direita na linha superior; depois repetimos o mesmo critério nas linhas abaixo, de cima para baixo.

Vértices:
$V = \{v_1, v_2, v_3, v_4, v_5, v_6, v_7, v_8, v_9, v_{10}, v_{11}, v_{12}, v_{13}\}$

Lista de adjacência proposta:

```text
v1: v2
v2: v1 v3 v9
v3: v2 v7 v10
v4: v5 v7 v11
v5: v4 v6 v12
v6: v5 v8 v13
v7: v3 v4 v10 v11
v8: v6 v13
v9: v2 v10
v10: v3 v7 v9
v11: v4 v7
v12: v5
v13: v6 v8
```

## 2. Estratégia de resolução

Usaremos as definições de Nicoletti:

- passeio: sequência finita que alterna vértices e arestas, podendo repetir vértices e arestas;
- trilha: passeio no qual nenhuma aresta aparece mais de uma vez;
- caminho: trilha na qual nenhum vértice aparece mais de uma vez, exceto no caso fechado, quando o primeiro e o último vértices podem coincidir;
- ciclo: caminho fechado.

Nos itens (a), (b) e (c), basta construir exemplos. Nos itens (d) e (e), é preciso analisar a estrutura do grafo.

## 3. Resolução detalhada

### (a) Passeio fechado de comprimento $6$

Um exemplo é:

$$
v_2, v_3, v_{10}, v_3, v_2, v_1, v_2.
$$

Esse passeio tem comprimento $6$, pois usa seis arestas:

$$
v_2v_3,\ v_3v_{10},\ v_{10}v_3,\ v_3v_2,\ v_2v_1,\ v_1v_2.
$$

Ele é fechado, pois começa e termina em $v_2$.

Ele **não** é uma trilha, pois repete arestas: por exemplo, a aresta $v_2v_3$ aparece duas vezes, assim como $v_1v_2$.

### (b) Passeio aberto de comprimento $12$

Um exemplo é:

$$
v_1, v_2, v_9, v_{10}, v_3, v_7, v_{11}, v_4, v_5, v_6, v_{13}, v_8, v_6.
$$

Esse passeio tem comprimento $12$, pois a sequência tem $13$ vértices. Ele é aberto, pois começa em $v_1$ e termina em $v_6$.

Ele **não** é um caminho, pois o vértice $v_6$ aparece duas vezes.

### (c) Trilha fechada de comprimento $6$

Um exemplo é:

$$
v_3, v_{10}, v_7, v_{11}, v_4, v_7, v_3.
$$

As arestas usadas são:

$$
v_3v_{10},\ v_{10}v_7,\ v_7v_{11},\ v_{11}v_4,\ v_4v_7,\ v_7v_3.
$$

Nenhuma aresta é repetida, então a sequência é uma trilha. Ela é fechada porque começa e termina em $v_3$.

Ela **não** é um ciclo, pois o vértice $v_7$ aparece no meio da sequência mais de uma vez.

### (d) Comprimento do mais longo ciclo em $G$

O ciclo mais longo tem comprimento $5$. Um exemplo é:

$$
v_2, v_9, v_{10}, v_7, v_3, v_2.
$$

Esse ciclo usa as arestas:

$$
v_2v_9,\ v_9v_{10},\ v_{10}v_7,\ v_7v_3,\ v_3v_2.
$$

Não é possível obter ciclo maior porque as partes à esquerda e à direita têm vértices pendentes ou articulações que não podem pertencer a um ciclo maior. Em particular:

- $v_1$ e $v_{12}$ são vértices pendentes e não podem pertencer a ciclo;
- a região triangular $v_6,v_8,v_{13}$ só se conecta ao restante do grafo por $v_6$, então não pode ser combinada com ciclos do lado esquerdo sem repetir $v_6$;
- o maior bloco cíclico do lado esquerdo contém o ciclo de comprimento $5$ exibido acima.

### (e) Comprimento do caminho mais longo em $G$

O caminho mais longo tem comprimento $11$. Um exemplo é:

$$
v_1, v_2, v_9, v_{10}, v_3, v_7, v_{11}, v_4, v_5, v_6, v_{13}, v_8.
$$

Esse caminho passa por $12$ vértices distintos, portanto tem comprimento $11$.

Há dois caminhos desse comprimento, se caminhos reversos forem considerados o mesmo caminho:

1. $v_1, v_2, v_9, v_{10}, v_3, v_7, v_{11}, v_4, v_5, v_6, v_{13}, v_8$.
2. $v_1, v_2, v_9, v_{10}, v_3, v_7, v_{11}, v_4, v_5, v_6, v_8, v_{13}$.

Se a orientação da sequência for contada, isto é, se o caminho e seu reverso forem considerados diferentes, então há $4$ sequências.

## 4. Resposta final

- (a) Um passeio fechado de comprimento $6$ é $v_2,v_3,v_{10},v_3,v_2,v_1,v_2$; ele não é trilha.
- (b) Um passeio aberto de comprimento $12$ é $v_1,v_2,v_9,v_{10},v_3,v_7,v_{11},v_4,v_5,v_6,v_{13},v_8,v_6$; ele não é caminho.
- (c) Uma trilha fechada de comprimento $6$ é $v_3,v_{10},v_7,v_{11},v_4,v_7,v_3$; ela não é ciclo.
- (d) O mais longo ciclo tem comprimento $5$.
- (e) O caminho mais longo tem comprimento $11$; há $2$ caminhos desse comprimento, ou $4$ se os reversos forem contados separadamente.

## 5. Comentários didáticos

O ponto central é separar comprimento de quantidade de vértices. Uma sequência com $k+1$ vértices consecutivos tem comprimento $k$, pois o comprimento é contado pelo número de arestas percorridas.

Outro erro comum é achar que todo passeio fechado é ciclo. Isso é falso. Para ser ciclo, além de ser fechado, a sequência não pode repetir vértices intermediários. No item (c), a trilha fechada repete $v_7$, por isso não é ciclo.

No item (e), os vértices pendentes ajudam a raciocinar sobre o caminho mais longo: um caminho simples pode começar ou terminar em um vértice pendente, mas não pode passar por ele no meio, pois isso exigiria sair pela mesma aresta pela qual entrou.
