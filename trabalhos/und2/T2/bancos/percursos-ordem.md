# T2 — Banco de problemas: percursos e estruturas de ordem

Este banco reúne três problemas de ciclos dirigidos, ordenação topológica e percurso euleriano.

`*` **Desafio avançado:** exige maior transferência de conhecimentos, combinação de conceitos ou carga de adaptação, sem depender de conteúdo-base ausente.

## Problema E — CSES Round Trip II

- **Link oficial:** <https://cses.fi/problemset/task/1678>.
- **Modelagem esperada:** dígrafo de cidades e voos unidirecionais.
- **Conhecimento teórico aferido:** DFS, estados de visita, aresta de retorno, ciclo dirigido e reconstrução por predecessores.
- **Dependência teórica:** somente uma aresta para um vértice ativo na pilha de recursão caracteriza o ciclo dirigido usado na reconstrução.
- **Evidência de acompanhamento:** rastrear cores e predecessores em uma instância com ciclo e outra acíclica.
- **Estratégia esperada:** DFS com três estados e reconstrução ao encontrar uma aresta para vértice ativo.
- **Complexidade esperada:** `O(V + E)` no tempo e `O(V + E)` de memória.
- **Casos especiais:** dígrafo acíclico, ciclo envolvendo a raiz da DFS e componentes desconectadas.
- **Atalhos não aceitos:** tratar qualquer aresta para vértice visitado como ciclo ou ignorar sua orientação.

## Problema F* — Codeforces 510C Fox And Names

- **Link oficial:** <https://codeforces.com/problemset/problem/510/C>.
- **Modelagem esperada:** dígrafo de precedências entre letras derivado do primeiro caractere diferente em nomes consecutivos.
- **Conhecimento teórico aferido:** modelagem de precedências, DAG, ciclo dirigido, ordenação topológica e condição de prefixo.
- **Dependência teórica:** cada comparação válida gera uma restrição dirigida; um ciclo ou um prefixo inválido torna o alfabeto impossível.
- **Evidência de acompanhamento:** derivar manualmente as arestas, detectar um caso de prefixo inválido e produzir uma ordem topológica.
- **Estratégia esperada:** construir o dígrafo de 26 letras e aplicar DFS topológica ou algoritmo de Kahn.
- **Complexidade esperada:** `O(S + A + R)`, em que `S` é o total de caracteres, `A = 26` e `R` é a quantidade de restrições.
- **Casos especiais:** nenhuma restrição, restrições repetidas, ciclo e palavra anterior que contém a seguinte como prefixo próprio.
- **Atalhos não aceitos:** ordenar letras por frequência ou comparar caracteres além do primeiro ponto de diferença.

## Problema G* — Kattis Eulerian Path

- **Link oficial:** <https://open.kattis.com/problems/eulerianpath>.
- **Modelagem esperada:** dígrafo no qual cada aresta deve ser utilizada exatamente uma vez.
- **Conhecimento teórico aferido:** graus de entrada e saída, conectividade relevante, caminho e circuito euleriano e método de Hierholzer.
- **Dependência teórica:** a existência depende do balanço dos graus e do pertencimento das arestas a uma única região percorrível; a construção deve consumir cada aresta uma vez.
- **Evidência de acompanhamento:** calcular os balanços, escolher início e fim e executar manualmente o empilhamento e a remoção das arestas.
- **Estratégia esperada:** validar os graus, executar Hierholzer e confirmar que o percurso contém `E + 1` vértices.
- **Complexidade esperada:** `O(V + E)` no tempo e `O(V + E)` de memória.
- **Casos especiais:** circuito euleriano, caminho aberto, vértice sem arestas e arestas em componentes incompatíveis.
- **Atalhos não aceitos:** reutilizar arestas, ordenar o percurso depois de construído ou aceitar percurso com menos de `E` arestas.
