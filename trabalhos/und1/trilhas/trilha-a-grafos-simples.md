# T1 — Trilha A: grafos simples e medidas estruturais

Esta trilha reúne três problemas sobre modelagem de relações não dirigidas, representação e interpretação de medidas estruturais. A busca somente poderá ser exigida depois de ensinada.

`*` **Desafio avançado:** exige maior transferência de conhecimentos, combinação de conceitos ou carga de implementação, sem depender de conteúdo-base ausente.

## Problema A — Kattis Weak Vertices

- **Link oficial:** <https://open.kattis.com/problems/weakvertices>.
- **Modelagem esperada:** grafo simples não dirigido representado por matriz de adjacência.
- **Conhecimento teórico aferido:** ordem, tamanho, grau, adjacência, simetria da matriz, triângulo, subgrafo e vértice pertencente ou não a um ciclo de comprimento três.
- **Dependência teórica:** reconhecer um vértice fraco exige interpretar corretamente duas adjacências incidentes e a aresta entre os respectivos vizinhos.
- **Evidência de acompanhamento:** calcular ordem, tamanho, densidade e sequência de graus de uma instância; identificar manualmente um triângulo e um vértice fraco.
- **Estratégia esperada:** examinar, para cada vértice, pares distintos de vizinhos e verificar a adjacência entre eles.
- **Complexidade esperada:** `O(V³)` no limite simples da matriz e `O(V²)` de memória.
- **Casos especiais:** grafo sem arestas, grafo completo, vértice isolado e vértice pertencente a mais de um triângulo.
- **Atalhos não aceitos:** biblioteca externa de grafos ou detecção pronta de cliques.

## Problema B* — UVA 11387 The 3-Regular Graph

- **Link oficial:** <https://onlinejudge.org/external/113/11387.pdf>.
- **Modelagem esperada:** construção de um grafo simples não dirigido e 3-regular com a ordem informada.
- **Conhecimento teórico aferido:** regularidade, grau, ordem, tamanho, grafo simples e lema do aperto de mãos.
- **Dependência teórica:** a decisão de possibilidade decorre de `3V = 2E`; a construção deve impedir laços e arestas paralelas e garantir grau três em todos os vértices.
- **Evidência de acompanhamento:** justificar os valores impossíveis, calcular `E = 3V/2` e construir manualmente uma instância válida pequena.
- **Estratégia esperada:** para ordem par admissível, construir um ciclo e acrescentar um emparelhamento entre vértices opostos; rejeitar ordens que não admitem grafo simples 3-regular.
- **Complexidade esperada:** `O(V + E)` para produzir a construção e `O(E)` para armazená-la.
- **Casos especiais:** ordens ímpares, `V < 4` e a instância `V = 4`.
- **Atalhos não aceitos:** gerar arestas aleatórias até encontrar uma solução ou usar gerador pronto de grafos regulares.

## Problema C — Kattis Reachable Roads

- **Link oficial:** <https://open.kattis.com/problems/reachableroads>.
- **Modelagem esperada:** grafo simples não dirigido no qual cidades são vértices e estradas existentes são arestas.
- **Conhecimento teórico aferido:** ordem, tamanho, densidade, graus, componentes conexas e quantidade mínima de arestas para tornar o grafo conexo.
- **Dependência teórica:** se o grafo possui `C` componentes, são necessárias e suficientes `C - 1` novas arestas; a solução deve explicar essa relação.
- **Evidência de acompanhamento:** calcular as medidas de uma instância, identificar manualmente suas componentes e justificar o limite `C - 1`.
- **Estratégia esperada:** contar componentes por DFS ou BFS depois do ensino das buscas.
- **Complexidade esperada:** `O(V + E)` no tempo e `O(V + E)` na representação por listas de adjacência.
- **Casos especiais:** grafo já conexo, ausência de estradas e vértices isolados.
- **Atalhos não aceitos:** estrutura pronta de componentes ou biblioteca externa de grafos.
