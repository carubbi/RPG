# T2 — Banco de problemas: relações estruturais

Este banco reúne três problemas de bipartição, emparelhamento e isomorfismo de árvores. Como esses conteúdos aparecem mais tarde na unidade, os acompanhamentos iniciais ficarão restritos aos conhecimentos já ensinados.

`*` **Desafio avançado:** exige maior transferência de conhecimentos, combinação de conceitos ou carga de adaptação, sem depender de conteúdo-base ausente.

## Problema H — CSES Building Teams

- **Link oficial:** <https://cses.fi/problemset/task/1668>.
- **Modelagem esperada:** grafo simples não dirigido de estudantes e relações de amizade.
- **Conhecimento teórico aferido:** bipartição, 2-coloração, componentes e ciclo ímpar.
- **Dependência teórica:** a divisão existe exatamente quando cada componente é bipartida; uma aresta entre vértices da mesma cor fornece a contradição.
- **Evidência de acompanhamento:** colorir manualmente as componentes e reconstruir um conflito em uma instância com ciclo ímpar.
- **Estratégia esperada:** DFS ou BFS de 2-coloração iniciada em cada componente.
- **Complexidade esperada:** `O(V + E)` no tempo e `O(V + E)` de memória.
- **Casos especiais:** vértices isolados, várias componentes, ciclo par e ciclo ímpar.
- **Atalhos não aceitos:** atribuição gulosa sem propagação pelas arestas ou biblioteca pronta de bipartição.

## Problema I* — Kattis Paintball

- **Link oficial:** <https://open.kattis.com/problems/paintball>.
- **Modelagem esperada:** grafo bipartido formado por uma cópia dos jogadores como atiradores e outra como alvos.
- **Conhecimento teórico aferido:** redução para bipartição, emparelhamento, caminho aumentante e correspondência perfeita.
- **Dependência teórica:** cada atirador e cada alvo só podem participar uma vez; isso é exatamente uma correspondência perfeita entre as duas cópias.
- **Evidência de acompanhamento:** construir o grafo bipartido, executar duas tentativas de aumento e explicar uma instância impossível.
- **Estratégia esperada:** algoritmo de caminhos aumentantes com DFS, mantendo a correspondência do lado dos alvos.
- **Complexidade esperada:** `O(VE)` com a versão incremental por DFS e `O(V + E)` de memória.
- **Casos especiais:** jogador sem alvo possível, escolhas concorrentes pelo mesmo alvo e correspondência perfeita com múltiplas soluções.
- **Atalhos não aceitos:** escolher alvos gulosamente sem remanejamento ou usar biblioteca pronta de matching.

## Problema J* — CSES Tree Isomorphism I

- **Link oficial:** <https://cses.fi/problemset/task/1700>.
- **Material de apoio:** [projeto-base de isomorfismo de árvores](../../T6/README.md).
- **Modelagem esperada:** comparação estrutural de duas árvores enraizadas, independente dos rótulos.
- **Conhecimento teórico aferido:** árvore enraizada, subárvore, isomorfismo, invariantes insuficientes e codificação canônica.
- **Dependência teórica:** graus e tamanhos iguais não garantem isomorfismo; as assinaturas dos filhos precisam ser combinadas independentemente da ordem.
- **Evidência de acompanhamento:** apresentar um contraexemplo para sequência de graus, codificar manualmente duas árvores pequenas e comparar suas raízes.
- **Estratégia esperada:** DFS pós-ordem, ordenação ou compressão das assinaturas dos filhos e comparação dos identificadores das raízes.
- **Complexidade esperada:** `O(V log V)` com ordenação explícita das assinaturas ou `O(V)` esperado com compressão apropriada.
- **Casos especiais:** árvores de dois vértices, caminhos, estrelas, filhos em ordens diferentes e estruturas com a mesma sequência de graus.
- **Atalhos não aceitos:** comparar rótulos, ordem de leitura, desenho ou apenas sequência de graus.

O Problema J possui maior carga algorítmica que os demais problemas do banco. Sua atribuição deverá considerar o domínio demonstrado pelo grupo, e o projeto-base será usado como andaime conceitual e estrutural, não como solução a ser copiada sem compreensão.
