# T1 — Trilha B: dígrafos e medidas estruturais

Esta trilha reúne três problemas sobre relações orientadas, graus de entrada e saída, fontes, sorvedouros e alcançabilidade.

`*` **Desafio avançado:** exige maior transferência de conhecimentos, combinação de conceitos ou carga de implementação, sem depender de conteúdo-base ausente.

## Problema D — Codeforces 115A Party

- **Link oficial:** <https://codeforces.com/problemset/problem/115/A>.
- **Modelagem esperada:** floresta dirigida com arestas do gerente para seus subordinados.
- **Conhecimento teórico aferido:** ordem, tamanho, graus de entrada e saída, fontes, folhas, floresta dirigida e profundidade.
- **Dependência teórica:** a resposta corresponde à maior profundidade da hierarquia; inverter as arestas altera a interpretação de fonte, predecessor e profundidade.
- **Evidência de acompanhamento:** construir o dígrafo da amostra, calcular graus, identificar raízes e rastrear a cadeia de maior profundidade.
- **Estratégia esperada:** DFS a partir das raízes ou percurso das cadeias de gerência com memorização.
- **Complexidade esperada:** `O(V + E)` no tempo e `O(V + E)` na representação explícita.
- **Casos especiais:** todos os empregados sem gerente, uma única cadeia e várias árvores.
- **Atalhos não aceitos:** inferir a resposta apenas pela quantidade de raízes ou usar biblioteca de árvores.

## Problema E — Codeforces 500A New Year Transportation

- **Link oficial:** <https://codeforces.com/problemset/problem/500/A>.
- **Modelagem esperada:** dígrafo acíclico implícito em que cada posição, exceto a última, possui uma aresta de avanço.
- **Conhecimento teórico aferido:** orientação, graus de entrada e saída, fonte, sorvedouro, caminho dirigido e alcançabilidade.
- **Dependência teórica:** os portais são unidirecionais; tratar as ligações como não dirigidas produz respostas incorretas.
- **Evidência de acompanhamento:** materializar as arestas de uma instância, calcular os graus e classificar a sequência percorrida.
- **Estratégia esperada:** seguir as arestas a partir do vértice 1 ou executar DFS no dígrafo implícito.
- **Complexidade esperada:** `O(V)` no tempo e `O(V)` para a entrada, sem necessidade de construir listas explícitas.
- **Casos especiais:** destino alcançado diretamente, salto que ultrapassa o destino sem visitá-lo e destino na última posição.
- **Atalhos não aceitos:** busca bidirecional ou decisão baseada somente na posição numérica do destino.

## Problema F — UVA 280 Vertex

- **Link oficial:** <https://onlinejudge.org/external/2/280.pdf>.
- **Modelagem esperada:** dígrafo arbitrário fornecido por listas de sucessores e consultado a partir de diferentes origens.
- **Conhecimento teórico aferido:** graus de entrada e saída, adjacência orientada, fonte, sorvedouro, passeio dirigido e alcançabilidade.
- **Dependência teórica:** cada consulta exige respeitar a direção das arestas e a definição específica de alcançabilidade do enunciado.
- **Evidência de acompanhamento:** calcular as medidas do dígrafo, executar manualmente uma consulta e explicar se a origem alcança a si mesma.
- **Estratégia esperada:** DFS ou BFS independente para cada origem consultada.
- **Complexidade esperada:** `O(Q(V + E))` no pior caso e `O(V + E)` de memória.
- **Casos especiais:** origem sem saída, laço alcançável por ciclo, vértices isolados e múltiplas consultas.
- **Atalhos não aceitos:** ignorar a orientação ou marcar a origem como alcançável sem percorrer uma aresta.
