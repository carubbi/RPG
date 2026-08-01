# T1 — Trilha C: buscas simples com DFS/BFS

Esta trilha reúne quatro problemas de exploração, componentes, níveis, predecessores e caminhos mínimos em grafos sem pesos.

## Problema G — CSES Counting Rooms

- **Link oficial:** <https://cses.fi/problemset/task/1192>.
- **Modelagem esperada:** grafo implícito cujos vértices são células livres e cujas arestas ligam vizinhos ortogonais.
- **Conhecimento teórico aferido:** modelagem de grade, adjacência, componentes conexas e árvore de busca.
- **Dependência teórica:** cada sala corresponde exatamente a uma componente de células livres.
- **Evidência de acompanhamento:** converter uma grade pequena em grafo, executar uma busca e identificar suas componentes.
- **Estratégia esperada:** iniciar DFS ou BFS em cada célula livre ainda não visitada.
- **Complexidade esperada:** `O(NM)` no tempo e `O(NM)` para grade e marcação.
- **Casos especiais:** nenhuma célula livre, uma única sala e várias regiões isoladas.
- **Atalhos não aceitos:** biblioteca de rotulação de componentes ou processamento de imagens.

## Problema H — CSES Labyrinth

- **Link oficial:** <https://cses.fi/problemset/task/1193>.
- **Modelagem esperada:** grafo implícito não ponderado sobre as células transitáveis do labirinto.
- **Conhecimento teórico aferido:** BFS, níveis, distância, predecessor, alcançabilidade e reconstrução de caminho.
- **Dependência teórica:** somente BFS garante o caminho com menor quantidade de movimentos no grafo sem pesos.
- **Evidência de acompanhamento:** rastrear fila, níveis e predecessores até reconstruir uma solução pequena.
- **Estratégia esperada:** BFS a partir de `A`, armazenando movimento ou predecessor de cada célula.
- **Complexidade esperada:** `O(NM)` no tempo e `O(NM)` de memória.
- **Casos especiais:** destino adjacente, destino inalcançável e múltiplos caminhos mínimos.
- **Atalhos não aceitos:** algoritmo pronto de labirinto ou DFS apresentada como garantia de caminho mínimo.

## Problema I — CSES Message Route

- **Link oficial:** <https://cses.fi/problemset/task/1667>.
- **Modelagem esperada:** grafo simples não dirigido e não ponderado de computadores e conexões.
- **Conhecimento teórico aferido:** BFS, distância em número de arestas, predecessores, alcançabilidade e caminho simples.
- **Dependência teórica:** a rota com menos computadores é obtida pela árvore BFS iniciada no computador 1.
- **Evidência de acompanhamento:** construir a lista de adjacência, rastrear níveis e reconstruir uma rota da amostra.
- **Estratégia esperada:** BFS com vetor de predecessores e reconstrução a partir do vértice `V`.
- **Complexidade esperada:** `O(V + E)` no tempo e `O(V + E)` de memória.
- **Casos especiais:** conexão direta, destino inalcançável e várias rotas mínimas.
- **Atalhos não aceitos:** algoritmo de caminhos ponderados ou biblioteca externa de grafos.

## Problema J — UVA 336 A Node Too Far

- **Link oficial:** <https://onlinejudge.org/external/3/336.pdf>.
- **Modelagem esperada:** grafo não dirigido com rótulos arbitrários e consultas de alcance limitado por TTL.
- **Conhecimento teórico aferido:** mapeamento de rótulos, BFS, níveis, distância e alcançabilidade limitada.
- **Dependência teórica:** somente vértices com distância não superior ao TTL podem ser alcançados na consulta.
- **Evidência de acompanhamento:** mapear os rótulos, executar a BFS por níveis e separar alcançáveis e não alcançáveis.
- **Estratégia esperada:** BFS limitada por profundidade para cada consulta.
- **Complexidade esperada:** `O(V + E)` por consulta no pior caso e `O(V + E)` de memória.
- **Casos especiais:** origem ausente do grafo, TTL zero, grafo desconectado e TTL maior que o diâmetro da componente.
- **Atalhos não aceitos:** comparar rótulos numericamente como se representassem distância ou usar biblioteca pronta de menor caminho.
