# T2 — Trilha A: buscas e conectividade

Esta trilha reúne quatro problemas que aprofundam DFS/BFS por meio de conectividade forte, pontes e vértices de articulação.

## Problema A — CSES Flight Routes Check

- **Link oficial:** <https://cses.fi/problemset/task/1682>.
- **Modelagem esperada:** dígrafo de cidades e voos unidirecionais.
- **Conhecimento teórico aferido:** alcançabilidade, conectividade forte, grafo reverso e contraexemplo.
- **Dependência teórica:** verificar somente os vértices alcançáveis a partir de uma origem não garante o caminho de volta exigido pela conectividade forte.
- **Evidência de acompanhamento:** executar buscas no grafo e no reverso, explicar o critério e produzir manualmente um par não alcançável.
- **Estratégia esperada:** DFS/BFS a partir de um vértice no grafo original e no grafo reverso.
- **Complexidade esperada:** `O(V + E)` no tempo e `O(V + E)` de memória.
- **Casos especiais:** um vértice, grafo fortemente conexo e componente fonte ou sorvedouro na condensação.
- **Atalhos não aceitos:** testar todos os pares ou ignorar a direção dos voos.

## Problema B — Codeforces 427C Checkposts

- **Link oficial:** <https://codeforces.com/problemset/problem/427/C>.
- **Modelagem esperada:** dígrafo de cruzamentos com custo associado a cada vértice.
- **Conhecimento teórico aferido:** componentes fortemente conexas, condensação, agregação por componente e contagem modular.
- **Dependência teórica:** um posto escolhido em uma SCC protege toda a componente por alcançabilidade mútua; componentes distintas exigem escolhas independentes.
- **Evidência de acompanhamento:** decompor uma instância em SCCs, indicar o menor custo e contar quantos vértices atingem esse mínimo em cada componente.
- **Estratégia esperada:** Kosaraju ou Tarjan seguido de agregação dos custos mínimos.
- **Complexidade esperada:** `O(V + E)` para as SCCs e `O(V)` para a agregação.
- **Casos especiais:** custo zero, empates dentro de uma SCC, vértice isolado e dígrafo inteiro fortemente conexo.
- **Atalhos não aceitos:** biblioteca pronta de SCC ou seleção global dos menores custos sem decomposição.

## Problema C — UVA 315 Network

- **Link oficial:** <https://onlinejudge.org/external/3/315.pdf>.
- **Modelagem esperada:** grafo não dirigido de centrais telefônicas e cabos.
- **Conhecimento teórico aferido:** árvore DFS, tempo de descoberta, menor ancestral alcançável e vértice de articulação.
- **Dependência teórica:** remover um vértice crítico separa subárvores que não possuem retorno a um ancestral adequado.
- **Evidência de acompanhamento:** construir a árvore DFS, calcular `disc` e `low` e aplicar separadamente os critérios da raiz e dos demais vértices.
- **Estratégia esperada:** DFS de Tarjan para contar vértices de articulação.
- **Complexidade esperada:** `O(V + E)` no tempo e `O(V + E)` de memória.
- **Casos especiais:** raiz com um único filho, ciclo, árvore e grafo com um único vértice.
- **Atalhos não aceitos:** remover cada vértice e repetir uma busca como solução final ou usar função pronta de articulação.

## Problema D — UVA 796 Critical Links

- **Link oficial:** <https://onlinejudge.org/external/7/796.pdf>.
- **Modelagem esperada:** grafo não dirigido, possivelmente desconexo, de servidores e ligações.
- **Conhecimento teórico aferido:** floresta DFS, tempo de descoberta, menor ancestral alcançável e ponte.
- **Dependência teórica:** uma aresta de árvore `(u,v)` é ponte quando a subárvore de `v` não alcança `u` nem algum ancestral de `u`.
- **Evidência de acompanhamento:** calcular `disc` e `low`, distinguir aresta de árvore e retorno e justificar cada ponte da instância.
- **Estratégia esperada:** DFS de Tarjan em todas as componentes e ordenação da saída.
- **Complexidade esperada:** `O(V + E)` antes da ordenação e `O(B log B)` para ordenar as `B` pontes.
- **Casos especiais:** grafo vazio, componentes isoladas, ciclo e aresta apresentada nos dois sentidos.
- **Atalhos não aceitos:** remover cada aresta e repetir busca como solução final ou duplicar pontes na saída.
