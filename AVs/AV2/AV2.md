# Questões AV2

## Orientações importantes

- A prova é **individual**. Qualquer forma de cola, consulta indevida ou comunicação com outro aluno caracteriza irregularidade.
- A prova possui duração de **1 hora e 40 minutos**, ou **100 minutos**.
- **Celulares não podem ser utilizados** durante a avaliação.
- O celular deve permanecer **guardado na bolsa/mochila** ou **sobre a mesa do professor**, conforme orientação dada em sala.
- É permitido o uso de **folhas soltas para rascunho**, **lápis ou caneta** e **calculadora**.
- Será tolerado atraso de até **5 minutos** em relação ao prazo final da prova, apenas como oportunidade para o aluno concluir e enviar a tentativa.
- Após o prazo regular, **não será possível alterar as alternativas já marcadas**; use esse tempo extra apenas para envio da prova.
- Leia cada questão com atenção antes de responder.
- Em cada questão, será permitida a marcação de **apenas uma alternativa**.
- Em várias questões, a **ordem dos elementos apresentados no enunciado** faz parte da resolução e deve ser respeitada.


## Busca, Percursos e Conectividade

### Questão 1 (0,25 ponto)
#### Nome da Questão
Execução de BFS e níveis de alcance

#### Contexto da Questão
A busca em largura percorre um grafo por camadas a partir de um vértice inicial. Em grafos não ponderados, essa ordem de exploração permite identificar níveis, alcançabilidade e distâncias mínimas em número de arestas.

#### Enunciado
Considere o grafo não dirigido `G`, representado pela lista de adjacência a seguir. A BFS deve iniciar no vértice `0`, e os vizinhos devem ser examinados em ordem crescente.

```text
0: 5, 6
1: 4
2: 5, 6, 9
3: 7, 8
4: 1, 6, 9
5: 0, 2
6: 0, 2, 4
7: 3, 8
8: 3, 7
9: 2, 4
```

Analise as afirmações:

I. A ordem de descoberta dos vértices alcançáveis a partir de `0` é `0, 5, 6, 2, 4, 9, 1`.

II. O vértice `9` está no nível `2` da BFS iniciada em `0`.

III. Os vértices `3`, `7` e `8` não são alcançáveis a partir de `0`.

IV. Usando lista de adjacência, a BFS examina vértices e arestas em tempo `O(|V| + |E|)`.

É correto o que se afirma em:

#### Alternativas de Resposta
a) I, apenas.<br>
b) II, apenas.<br>
c) I e III, apenas.<br>
d) II e IV, apenas.<br>
e) I, III e IV, apenas.<br>

#### Resposta Correta
e) I, III e IV, apenas.

#### Feedback Geral
A BFS iniciada em `0` descobre primeiro `5` e `6`; depois alcança `2` e `4`; em seguida `9`; por fim `1`. Os vértices `3`, `7` e `8` formam outra componente e não são alcançados. O vértice `9` fica no nível `3`, não no nível `2`.

#### Feedback por Alternativa
- a) Incorreta. A afirmação I é verdadeira, mas III e IV também são verdadeiras.<br>
- b) Incorreta. A afirmação II é falsa, pois `9` está no nível `3`.<br>
- c) Incorreta. I e III são verdadeiras, mas IV também é verdadeira.<br>
- d) Incorreta. IV é verdadeira, mas II é falsa.<br>
- e) Correta. I, III e IV descrevem corretamente a BFS e sua complexidade com lista de adjacência.<br>

### Questão 2 (0,25 ponto)
#### Nome da Questão
Execução de DFS e pilha de recursão

#### Contexto da Questão
A busca em profundidade explora um ramo do grafo antes de retroceder para alternativas pendentes. A pilha de recursão, ou uma pilha explícita, representa o caminho ativo dessa exploração.

#### Enunciado
Considere o grafo direcionado `G`, representado pela lista de adjacência a seguir. A DFS deve iniciar no vértice `0`, e os vizinhos de saída devem ser examinados em ordem crescente.

```text
0: 5, 6
1: 4
2: 6, 9
3: 7, 8
4: 9
5: 2
6: 4
7: 8
8:
9:
```

Analise as afirmações:

I. Uma ordem de descoberta produzida pela DFS a partir de `0` é `0, 5, 2, 6, 4, 9`.

II. A pilha de recursão da DFS representa o caminho ativo da exploração; neste grafo, ao descobrir `4`, a pilha contém `0, 5, 2, 6, 4`.

III. A DFS iniciada em `0` descobre `8`, pois existe o arco `7 -> 8`.

IV. Com lista de adjacência, a DFS tem complexidade `O(|V| + |E|)`.

É correto o que se afirma em:

#### Alternativas de Resposta
a) I e II, apenas.<br>
b) II e III, apenas.<br>
c) I, II e IV, apenas.<br>
d) I, III e IV, apenas.<br>
e) I, II, III e IV.<br>

#### Resposta Correta
c) I, II e IV, apenas.

#### Feedback Geral
Com vizinhos em ordem crescente, a DFS iniciada em `0` segue `0 -> 5 -> 2 -> 6 -> 4 -> 9`. A pilha de recursão acompanha exatamente esse caminho ativo. O arco `7 -> 8` não torna `8` alcançável a partir de `0`, pois `7` também não é alcançado nessa busca.

#### Feedback por Alternativa
- a) Incorreta. I e II são verdadeiras, mas IV também é verdadeira.<br>
- b) Incorreta. II é verdadeira, mas III é falsa.<br>
- c) Correta. I, II e IV descrevem corretamente a execução e a complexidade da DFS.<br>
- d) Incorreta. I e IV são verdadeiras, mas III é falsa.<br>
- e) Incorreta. A afirmação III é falsa.<br>

### Questão 3 (0,30 ponto)
#### Nome da Questão
Trilhas, caminhos e ciclos em grafos

#### Contexto da Questão
Classificar percursos exige distinguir restrições sobre vértices e restrições sobre arestas. Passeios podem repetir elementos, trilhas não repetem arestas, caminhos não repetem vértices e ciclos são caminhos fechados.

#### Enunciado
Considere o grafo não dirigido e ponderado `G` representado pela lista de adjacência a seguir. Para classificar os percursos, considere a existência das arestas; os pesos são informados apenas para manter a representação fiel à figura.

```text
1: 2(2), 3(4), 4(1)
2: 1(2), 3(7), 4(3), 7(3)
3: 1(4), 2(7), 5(9), 6(3), 7(9)
4: 1(1), 2(3), 8(1), 9(7)
5: 3(9), 6(1)
6: 3(3), 5(1), 7(2), 10(8)
7: 2(3), 3(9), 6(2), 8(1), 11(1), 12(8)
8: 4(1), 7(1), 9(4), 12(4)
9: 4(7), 8(4)
10: 6(8), 11(1), 13(3)
11: 7(1), 10(1), 12(5), 14(8)
12: 7(8), 8(4), 11(5), 15(2)
13: 10(3), 14(2)
14: 11(8), 13(2), 15(2)
15: 12(2), 14(2)
```

Analise as afirmações:

I. A sequência `5-6-7-3-2-7` é uma trilha de comprimento 5, mas não é um caminho.

II. A sequência `1-2-7-3-1` é um ciclo de comprimento 4.

III. A sequência `1-2-7-3-2` é um caminho válido em `G` de comprimento 4.

IV. A sequência `9-4-8-12-15` é um caminho de comprimento 4.

É correto o que se afirma em:

#### Alternativas de Resposta
a) I e II, apenas.<br>
b) I e III, apenas.<br>
c) II e IV, apenas.<br>
d) I, II e IV, apenas.<br>
e) I, II, III e IV.<br>

#### Resposta Correta
d) I, II e IV, apenas.

#### Feedback Geral
A sequência I não repete arestas, mas repete o vértice `7`, portanto é trilha e não caminho. A sequência II fecha um ciclo válido. A sequência III repete o vértice `2`, então não é caminho. A sequência IV usa arestas existentes e não repete vértices.

#### Feedback por Alternativa
- a) Incorreta. I e II são verdadeiras, mas IV também é verdadeira.<br>
- b) Incorreta. I é verdadeira, mas III é falsa.<br>
- c) Incorreta. II e IV são verdadeiras, mas I também é verdadeira.<br>
- d) Correta. I, II e IV são verdadeiras; III é falsa porque repete vértice.<br>
- e) Incorreta. A afirmação III é falsa.<br>

### Questão 4 (0,30 ponto)
#### Nome da Questão
Pontes e componentes aresta-conexas

#### Contexto da Questão
Pontes são arestas cuja remoção aumenta o número de componentes conexas. Ciclos e caminhos alternativos são a principal evidência de que uma aresta não é ponte.

#### Enunciado
Considere o grafo não dirigido `G`, adaptado do exercício Sedgewick 18.34, representado pela lista de adjacência a seguir.

```text
0: 5, 6
1: 4
2: 5, 6, 9
3: 7, 8
4: 1, 6, 9
5: 0, 2
6: 0, 2, 4
7: 3, 8
8: 3, 7
9: 2, 4
```

Analise as afirmações:

I. A aresta `1-4` é uma ponte, pois sua remoção isola `1` da componente alcançável por DFS a partir de `4`.

II. A aresta `3-7` é uma ponte, pois uma DFS iniciada em `3` pode visitar `7` antes de `8`.

III. Os vértices `3`, `7` e `8` pertencem a uma componente aresta-conexa sem pontes internas, pois a DFS identifica o ciclo `3-7-8-3`.

IV. No subgrafo induzido por `{0, 2, 4, 5, 6, 9}`, nenhuma aresta é ponte, pois a DFS encontra ciclos e caminhos alternativos.

É correto o que se afirma em:

#### Alternativas de Resposta
a) I e II, apenas.<br>
b) I e III, apenas.<br>
c) II e IV, apenas.<br>
d) I, III e IV, apenas.<br>
e) I, II, III e IV.<br>

#### Resposta Correta
d) I, III e IV, apenas.

#### Feedback Geral
A aresta `1-4` é ponte porque `1` fica isolado se ela for removida. A aresta `3-7` não é ponte, pois há caminho alternativo por `3-8-7`. O triângulo `3-7-8-3` não possui pontes internas, e o subgrafo com `{0, 2, 4, 5, 6, 9}` também possui ciclos que evitam pontes.

#### Feedback por Alternativa
- a) Incorreta. I é verdadeira, mas II é falsa.<br>
- b) Incorreta. I e III são verdadeiras, mas IV também é verdadeira.<br>
- c) Incorreta. IV é verdadeira, mas II é falsa.<br>
- d) Correta. I, III e IV identificam corretamente as pontes e os ciclos.<br>
- e) Incorreta. A afirmação II é falsa.<br>

## Eulerização e Circuitos

### Questão 5 (0,30 ponto)
#### Nome da Questão
Critérios para trilhas e circuitos eulerianos

#### Contexto da Questão
Em grafos não dirigidos conectados, a existência de trilha ou circuito euleriano depende da paridade dos graus dos vértices. Dois vértices ímpares permitem uma trilha aberta; todos os graus pares permitem circuito.

#### Enunciado
Considere uma versão modificada do grafo clássico das Pontes de Königsberg. Os vértices `N`, `S`, `C` e `L` representam regiões de terra, e uma ponte adicional foi acrescentada entre `N` e `S`. Repetições na lista de adjacência indicam pontes paralelas.

Grafo `K'`:

```text
N: C, C, L, S
S: C, C, L, N
C: N, N, S, S, L
L: N, S, C
```

Analise as afirmações:

I. O grafo `K'` possui uma trilha euleriana aberta, por exemplo `C-N-C-S-N-L-S-C-L`.

II. O grafo `K'` possui circuito euleriano, pois é conexo.

III. Se a ponte adicional entre `N` e `S` fosse removida, o grafo voltaria a ter quatro vértices de grau ímpar, inviabilizando trilha e circuito euleriano.

IV. Em `K'`, qualquer trilha euleriana deve começar em `C` e terminar em `L`, ou vice-versa.

É correto o que se afirma em:

#### Alternativas de Resposta
a) I e II, apenas.<br>
b) II e III, apenas.<br>
c) I, II e IV, apenas.<br>
d) I, III e IV, apenas.<br>
e) I, II, III e IV.<br>

#### Resposta Correta
d) I, III e IV, apenas.

#### Feedback Geral
No grafo `K'`, os vértices `C` e `L` têm grau ímpar, enquanto `N` e `S` têm grau par. Portanto, há trilha euleriana aberta com extremidades `C` e `L`, mas não há circuito euleriano. Sem a ponte adicional, os quatro vértices teriam grau ímpar.

#### Feedback por Alternativa
- a) Incorreta. I é verdadeira, mas II é falsa.<br>
- b) Incorreta. III é verdadeira, mas II é falsa.<br>
- c) Incorreta. I e IV são verdadeiras, mas II é falsa.<br>
- d) Correta. I, III e IV seguem dos graus dos vértices.<br>
- e) Incorreta. A afirmação II é falsa.<br>

### Questão 6 (0,35 ponto)
#### Nome da Questão
Eulerização e construção de circuitos eulerianos

#### Contexto da Questão
Hierholzer e Fleury constroem percursos eulerianos, mas dependem das condições de existência da trilha ou circuito. Eulerizar um grafo altera graus por meio da duplicação de arestas ou caminhos.

#### Enunciado
Considere os algoritmos de Hierholzer e Fleury para construir trilhas ou circuitos eulerianos em grafos não dirigidos como os grafos `G2` e `G4` abaixo, representados por listas de adjacência.

Grafo `G2`:

```text
0: 1, 2, 3, 3
1: 0, 3
2: 0, 5
3: 0, 0, 1, 6
4: 7, 8
5: 2, 8, 8, 9
6: 3, 7, 9
7: 4, 6
8: 4, 5, 5, 8, 8
9: 5, 6
```

Grafo `G4`:

```text
0: 2, 5, 8
1: 4, 5, 6
2: 0, 6, 8
3: 6, 7, 9
4: 1, 5, 7
5: 0, 1, 4
6: 1, 2, 3
7: 3, 4, 9
8: 0, 2, 9
9: 3, 7, 8
```

Analise as afirmações:

I. Em `G2`, Fleury pode construir um circuito euleriano iniciado em `6`.

II. Eulerizando `G2` com a aresta `6-8`, Hierholzer pode construir o circuito `6-3-0-1-3-0-2-5-8-8-4-7-6-9-5-8-6`.

III. Hierholzer executa em `O(V + E)`, enquanto Fleury pode chegar a `O(E(V + E))` quando testa pontes no grafo residual a cada escolha.

IV. Aplicado a `G4`, o procedimento pode construir uma trilha euleriana aberta se escolher corretamente o vértice inicial, pois a conectividade é suficiente.

É correto o que se afirma em:

#### Alternativas de Resposta
a) I e II, apenas.<br>
b) II e III, apenas.<br>
c) I, II e III, apenas.<br>
d) I, III e IV, apenas.<br>
e) I, II, III e IV.<br>

#### Resposta Correta
b) II e III, apenas.

#### Feedback Geral
Em `G2`, os vértices `6` e `8` são ímpares, então o grafo original não tem circuito euleriano. Ao adicionar a aresta `6-8`, os graus ficam pares e o circuito indicado passa a ser possível. Em `G4`, a conectividade sozinha não basta: os graus também precisam satisfazer o critério euleriano.

#### Feedback por Alternativa
- a) Incorreta. II é verdadeira, mas I é falsa.<br>
- b) Correta. II e III descrevem corretamente a eulerização e a diferença de custo entre os algoritmos.<br>
- c) Incorreta. I é falsa porque `G2` não possui circuito euleriano antes da eulerização.<br>
- d) Incorreta. I e IV são falsas.<br>
- e) Incorreta. I e IV são falsas.<br>

## Hamilton, Tours e Otimização

### Questão 7 (0,35 ponto)
#### Nome da Questão
Ciclos hamiltonianos e critérios suficientes

#### Contexto da Questão
Grafos hamiltonianos tratam de visitar vértices, não arestas. Um ciclo hamiltoniano passa por todos os vértices exatamente uma vez e retorna ao início.

#### Enunciado
Considere o grafo não dirigido `G`, representado pela lista de adjacência a seguir. Admita custo unitário para cada aresta.

```text
0: 1, 3, 4, 5, 8, 9
1: 0, 2, 3, 4
2: 1, 4, 5, 6, 9
3: 0, 1, 4, 6, 7
4: 0, 1, 2, 3, 5, 6, 9
5: 0, 2, 4, 6
6: 2, 3, 4, 5, 9
7: 3, 8, 9
8: 0, 7
9: 0, 2, 4, 6, 7
```

Analise as afirmações:

I. A sequência `0-1-2-5-4-3-6-9-7-8-0` é um ciclo hamiltoniano de `G`, com custo total `10`.

II. Os teoremas de Dirac e Ore não garantem que `G` seja hamiltoniano, pois `d(8) = 2 < 5` e `d(1) + d(8) = 6 < 10` para os vértices não adjacentes `1` e `8`.

III. Vértices pendentes, com `d(v) = 1`, e vértices de articulação impedem a existência de ciclo hamiltoniano.

IV. Como o vértice `8` tem grau `2`, ele não pode pertencer a nenhum ciclo hamiltoniano.

É correto o que se afirma em:

#### Alternativas de Resposta
a) I e II, apenas.<br>
b) II e III, apenas.<br>
c) I, II e III, apenas.<br>
d) III e IV, apenas.<br>
e) I, II, III e IV.<br>

#### Resposta Correta
c) I, II e III, apenas.

#### Feedback Geral
A sequência dada visita todos os 10 vértices uma vez e retorna a `0`, usando arestas existentes. Dirac e Ore não garantem o resultado nesse grafo, mas a sequência prova que ele é hamiltoniano. Grau `2` não impede participação em ciclo hamiltoniano; nele, o vértice usa exatamente suas duas arestas incidentes no ciclo.

#### Feedback por Alternativa
- a) Incorreta. I e II são verdadeiras, mas III também é verdadeira.<br>
- b) Incorreta. II e III são verdadeiras, mas I também é verdadeira.<br>
- c) Correta. I, II e III são verdadeiras; IV é falsa.<br>
- d) Incorreta. III é verdadeira, mas IV é falsa.<br>
- e) Incorreta. A afirmação IV é falsa.<br>

### Questão 8 (0,35 ponto)
#### Nome da Questão
Heurísticas de inserção no TSP

#### Contexto da Questão
O TSP busca um ciclo hamiltoniano de menor custo em um grafo ponderado. Heurísticas de inserção constroem tours incrementais, escolhendo vértices e posições segundo critérios locais.

#### Enunciado
Considere o grafo completo não dirigido e ponderado `G`, representado pela matriz de custos a seguir. A entrada na linha `i` e coluna `j` indica o custo da aresta entre `i` e `j`.

|   | 1 | 2 | 3 | 4 | 5 | 6 |
|---|---:|---:|---:|---:|---:|---:|
| 1 | - | 2 | 10 | 1 | 8 | 25 |
| 2 | 2 | - | 15 | 8 | 1 | 4 |
| 3 | 10 | 15 | - | 14 | 16 | 5 |
| 4 | 1 | 8 | 14 | - | 7 | 3 |
| 5 | 8 | 1 | 16 | 7 | - | 20 |
| 6 | 25 | 4 | 5 | 3 | 20 | - |

Use como ciclo parcial inicial `1-4-2-1`. Considere as heurísticas de inserção para construir um tour no TSP.

Analise as afirmações:

I. O custo do ciclo parcial inicial `1-4-2-1` é `11`.

II. Pela heurística `nearest insertion`, entre os vértices ainda não inseridos `{3, 5, 6}`, o primeiro vértice escolhido é `5`, pois sua menor distância até o ciclo é `1`.

III. Ao inserir o vértice `5` no ciclo `1-4-2-1`, a melhor posição é entre `1` e `4`, com aumento de custo `14`.

IV. Pela heurística `smallest insertion`, entre os vértices ainda não inseridos `{3, 5, 6}`, o primeiro vértice escolhido é `6`, pois sua melhor inserção tem aumento de custo `-1`.

É correto o que se afirma em:

#### Alternativas de Resposta
a) I e II, apenas.<br>
b) I e III, apenas.<br>
c) II e IV, apenas.<br>
d) I, II e IV, apenas.<br>
e) I, II, III e IV.<br>

#### Resposta Correta
d) I, II e IV, apenas.

#### Feedback Geral
O ciclo inicial custa `1 + 8 + 2 = 11`. Pela nearest insertion, o vértice `5` é escolhido porque está a distância `1` do ciclo. Porém, sua melhor inserção não é entre `1` e `4`; entre `4` e `2`, o aumento é `7 + 1 - 8 = 0`. Pela smallest insertion, o vértice `6` tem aumento mínimo `3 + 4 - 8 = -1`.

#### Feedback por Alternativa
- a) Incorreta. I e II são verdadeiras, mas IV também é verdadeira.<br>
- b) Incorreta. I é verdadeira, mas III é falsa.<br>
- c) Incorreta. II e IV são verdadeiras, mas I também é verdadeira.<br>
- d) Correta. I, II e IV são verdadeiras; III é falsa.<br>
- e) Incorreta. A afirmação III é falsa.<br>

## Carteiro Chinês

### Questão 9 (0,50 ponto)
#### Nome da Questão
Carteiro chinês e eulerização ótima

#### Contexto da Questão
No carteiro chinês não dirigido, o objetivo é percorrer todas as arestas com custo mínimo. Quando há exatamente dois vértices de grau ímpar, a eulerização ótima duplica um menor caminho entre eles.

#### Enunciado
Considere o grafo não dirigido e ponderado `G` representado pela lista de adjacência a seguir:

```text
a: b(1), c(2), d(4)
b: a(1), c(3), d(2), e(4)
c: a(2), b(3), d(2), f(4)
d: a(4), b(2), c(2), e(3), f(2), g(4)
e: b(4), d(3), f(3), g(2)
f: c(4), d(2), e(3), g(1)
g: d(4), e(2), f(1)
```

Analise as afirmações:

I. Como os únicos vértices de grau ímpar são `a` e `g`, a eulerização ótima deve duplicar um menor caminho entre eles, como `a-b-d-f-g`.

II. Como a soma dos pesos das arestas de `G` é `37`, esse é o custo mínimo do percurso do carteiro chinês.

III. O menor caminho entre os vértices ímpares é `a-d-g`, com custo `8`.

IV. Duplicar as arestas do caminho `a-b-d-f-g` euleriza `G`, permitindo um circuito euleriano no multigrafo resultante com custo total `43`.

É correto o que se afirma em:

#### Alternativas de Resposta
a) I e II, apenas.<br>
b) I e IV, apenas.<br>
c) I, II e IV, apenas.<br>
d) II, III e IV, apenas.<br>
e) I, II, III e IV.<br>

#### Resposta Correta
b) I e IV, apenas.

#### Feedback Geral
Os únicos vértices ímpares são `a` e `g`. O caminho `a-b-d-f-g` tem custo `6`, menor que `a-d-g`, que custa `8`. Assim, o custo ótimo é a soma original `37` mais a duplicação de custo `6`, totalizando `43`.

#### Feedback por Alternativa
- a) Incorreta. I é verdadeira, mas II é falsa.<br>
- b) Correta. I e IV descrevem corretamente a eulerização ótima e o custo total.<br>
- c) Incorreta. II é falsa porque `37` é apenas a soma original, sem a duplicação necessária.<br>
- d) Incorreta. II e III são falsas.<br>
- e) Incorreta. II e III são falsas.<br>

## Modelagem Estrutural de Grafos

### Questão 10 (0,40 ponto)
#### Nome da Questão
Coloração gulosa e número cromático

#### Contexto da Questão
Coloração de vértices modela problemas de incompatibilidade. Em uma heurística gulosa sequencial, a ordem de processamento dos vértices influencia diretamente a cor atribuída a cada um.

#### Enunciado
Em um conto sobre Noé, uma arca deve alojar os animais `Cão`, `Gato`, `Leão`, `Porco`, `Rato`, `Sabiá`, `Tatu` e `Zebra`. Animais incompatíveis não podem ficar na mesma baia. A matriz de adjacência abaixo representa essas incompatibilidades. Considerando que os espaços da arca estão lotados, Noé deve determinar o número mínimo de divisões, ou baias, necessário para alojar esses animais.

|       | Cão | Gato | Leão | Porco | Rato | Sabiá | Tatu | Zebra |
|-------|----:|-----:|-----:|------:|-----:|------:|-----:|------:|
| Cão   | 0 | 1 | 1 | 0 | 1 | 1 | 1 | 0 |
| Gato  | 1 | 0 | 1 | 1 | 1 | 0 | 1 | 0 |
| Leão  | 1 | 1 | 0 | 1 | 1 | 0 | 0 | 1 |
| Porco | 0 | 1 | 1 | 0 | 0 | 1 | 0 | 1 |
| Rato  | 1 | 1 | 1 | 0 | 0 | 1 | 1 | 0 |
| Sabiá | 1 | 0 | 0 | 1 | 1 | 0 | 1 | 1 |
| Tatu  | 1 | 1 | 0 | 0 | 1 | 1 | 0 | 0 |
| Zebra | 0 | 0 | 1 | 1 | 0 | 1 | 0 | 0 |

A partir da matriz, modele o grafo de incompatibilidades e aplique a versão gulosa sequencial, processando os vértices em ordem decrescente de grau. Em caso de empate, use a ordem alfabética.

Analise as afirmações:

I. A ordem de processamento pela heurística gulosa é `Cão, Gato, Leão, Rato, Sabiá, Porco, Tatu, Zebra`.

II. A heurística produz a coloração `C1 = {Cão, Porco}`, `C2 = {Gato, Sabiá}`, `C3 = {Leão, Tatu}` e `C4 = {Rato, Zebra}`.

III. Como `Cão`, `Gato`, `Leão` e `Rato` são dois a dois incompatíveis, o número cromático do grafo de incompatibilidades é `4`.

IV. A existência da coloração exibida no item II mostra que quatro baias são suficientes para alojar os animais.

É correto o que se afirma em:

#### Alternativas de Resposta
a) I e II, apenas.<br>
b) II e III, apenas.<br>
c) I, II e IV, apenas.<br>
d) I, III e IV, apenas.<br>
e) I, II, III e IV.<br>

#### Resposta Correta
c) I, II e IV, apenas.

#### Feedback Geral
A ordem por grau decrescente com desempate alfabético é a indicada em I. A coloração gulosa exibida em II é válida e mostra que quatro baias bastam. A presença de uma clique com quatro vértices mostra que são necessárias pelo menos quatro cores, mas, isoladamente, não prova a igualdade sem combinar com uma coloração válida com quatro cores.

#### Feedback por Alternativa
- a) Incorreta. I e II são verdadeiras, mas IV também é verdadeira.<br>
- b) Incorreta. II é verdadeira, mas III é tratada como falsa pela justificativa incompleta da igualdade do número cromático.<br>
- c) Correta. I, II e IV são verdadeiras; III não justifica sozinha que o número cromático seja exatamente `4`.<br>
- d) Incorreta. I e IV são verdadeiras, mas III é falsa no contexto da justificativa apresentada.<br>
- e) Incorreta. A afirmação III é falsa no contexto da justificativa apresentada.<br>

### Questão 11 (0,30 ponto)
#### Nome da Questão
Isomorfismo de árvores por invariantes

#### Contexto da Questão
Isomorfismo preserva adjacências e estrutura, não apenas aparência visual ou sequência de graus. Em árvores, centros, folhas e padrões locais de vizinhança ajudam a identificar diferenças estruturais.

#### Enunciado
Considere as árvores não dirigidas `T_A` e `T_B` representadas pelas listas de adjacência a seguir:

```text
T_A
1: 2, 3, 4
2: 1, 5, 6
3: 1, 7
4: 1, 8
5: 2
6: 2
7: 3
8: 4

T_B
1: 2, 3, 4
2: 1, 5, 6
3: 1, 7
4: 1
5: 2, 8
6: 2
7: 3
8: 5
```

Analise as afirmações:

I. Pela poda iterativa das folhas, ambas as árvores `T_A` e `T_B` têm centro único no vértice `1`.

II. As duas árvores possuem a mesma sequência de graus, `3, 3, 2, 2, 1, 1, 1, 1`, mas isso não garante isomorfismo.

III. A correspondência identidade `1->1`, `2->2`, ..., `8->8` é um isomorfismo entre `T_A` e `T_B`.

IV. As árvores não são isomorfas, pois em `T_A` os vértices de grau 3 têm quantidades de vizinhos de grau 2 iguais a `2` e `0`, enquanto em `T_B` essas quantidades são `1` e `1`.

É correto o que se afirma em:

#### Alternativas de Resposta
a) II e IV, apenas.<br>
b) I e III, apenas.<br>
c) I, II e IV, apenas.<br>
d) II, III e IV, apenas.<br>
e) I, II, III e IV.<br>

#### Resposta Correta
a) II e IV, apenas.

#### Feedback Geral
As árvores têm a mesma sequência de graus, mas isso não basta para isomorfismo. Em `T_A`, os vértices de grau `3` têm perfis locais diferentes dos vértices de grau `3` em `T_B`. Além disso, `T_B` não tem centro único em `1`, e a identidade não preserva todas as adjacências.

#### Feedback por Alternativa
- a) Correta. II e IV identificam corretamente o limite da sequência de graus e um invariante que distingue as árvores.<br>
- b) Incorreta. I e III são falsas.<br>
- c) Incorreta. II e IV são verdadeiras, mas I é falsa.<br>
- d) Incorreta. II e IV são verdadeiras, mas III é falsa.<br>
- e) Incorreta. I e III são falsas.<br>

### Questão 12 (0,35 ponto)
#### Nome da Questão
Emparelhamento bipartido e caminhos de aumento

#### Contexto da Questão
Emparelhamentos selecionam arestas sem compartilhar vértices. Caminhos de aumento permitem ampliar um emparelhamento quando começam e terminam em vértices não saturados e alternam arestas fora e dentro do emparelhamento.

#### Enunciado
Suponha que há seis estudantes, cada um precisando de emprego, e seis empresas, cada uma precisando contratar um estudante. As duas listas abaixo, uma organizada por estudante e outra por empresa, indicam ofertas de trabalho com interesse mútuo entre estudantes e empresas. Deseja-se saber se é possível emparelhar estudantes e empresas de modo que todo estudante obtenha um emprego e toda vaga seja preenchida; caso isso não seja possível, deseja-se determinar o número máximo de vagas que podem ser preenchidas.

```text
Por estudante:
Alice: Adobe, Apple, HP
Bob: Adobe, Apple, Yahoo
Carol: HP, IBM, Sun
Dave: Adobe, Apple
Eliza: IBM, Sun, Yahoo
Frank: HP, Sun, Yahoo

Por empresa:
Adobe: Alice, Bob, Dave
Apple: Alice, Bob, Dave
HP: Alice, Carol, Frank
IBM: Carol, Eliza
Sun: Carol, Eliza, Frank
Yahoo: Bob, Eliza, Frank
```

Considere o emparelhamento `M0 = {Alice-Adobe, Bob-Apple, Carol-IBM, Eliza-Sun}`. Analise as afirmações:

I. `M0` tem tamanho `4`; nele, `Dave`, `Frank`, `HP` e `Yahoo` são vértices não saturados.

II. O caminho `Dave-Adobe-Alice-HP` é um caminho de aumento em relação a `M0`.

III. Pela ideia do Teorema de Berge, a existência do caminho do item II mostra que `M0` já é um emparelhamento máximo.

IV. Ao aumentar `M0` pelo caminho `Dave-Adobe-Alice-HP`, obtém-se um emparelhamento de tamanho `5`, no qual `Frank` e `Yahoo` permanecem não saturados.

É correto o que se afirma em:

#### Alternativas de Resposta
a) I e II, apenas.<br>
b) I e III, apenas.<br>
c) II e III, apenas.<br>
d) I, II e IV, apenas.<br>
e) I, II, III e IV.<br>

#### Resposta Correta
d) I, II e IV, apenas.

#### Feedback Geral
O emparelhamento inicial tem quatro arestas e deixa `Dave`, `Frank`, `HP` e `Yahoo` não saturados. O caminho `Dave-Adobe-Alice-HP` alterna arestas fora e dentro de `M0`, começando e terminando em vértices não saturados. Portanto, ele aumenta o emparelhamento para tamanho `5`, mostrando que `M0` não era máximo.

#### Feedback por Alternativa
- a) Incorreta. I e II são verdadeiras, mas IV também é verdadeira.<br>
- b) Incorreta. I é verdadeira, mas III é falsa.<br>
- c) Incorreta. II é verdadeira, mas III é falsa.<br>
- d) Correta. I, II e IV descrevem corretamente o emparelhamento e o caminho de aumento.<br>
- e) Incorreta. A afirmação III é falsa.<br>
