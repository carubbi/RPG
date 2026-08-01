# Dependências pedagógicas e dificuldade dos exercícios

## Objetivo

Alinhar `fluxo_ensino.md`, `cronograma_2026_2.md` e os trabalhos T1–T3 à seguinte regra: as aulas teóricas fornecem os conceitos-base previstos no projeto de ensino; os exercícios podem exigir transferência, combinação e descoberta de estratégias a partir dessa base.

Esta especificação corresponde à primeira revisão. A conversão do cronograma para redação integralmente pontuada, sintética e não narrativa será executada em uma segunda revisão.

## Hierarquia curricular

- `proj_ensino_2026.md` define o conteúdo das aulas teóricas e das ATs.
- `fluxo_ensino.md` define a progressão e as dependências.
- Os exercícios das APs podem aprofundar a base teórica sem transformar o aprofundamento em conteúdo obrigatório das aulas teóricas ou das ATs.
- Nenhum exercício poderá depender de conceito-base ausente; a solução completa não precisa ter sido demonstrada em aula.

## Delimitação da Unidade II

As aulas teóricas permanecerão restritas ao projeto de ensino. Tempos de descoberta e término serão ensinados como fundamentos de DFS. Valores `low` serão ensinados no contexto curricular de cortes em vértices e arestas.

Ordenação topológica, componentes fortemente conexas, Kosaraju e Tarjan para SCC ficarão restritos aos exercícios do T2. Grafo reverso será tratado como operação derivada da modelagem de dígrafos. Esses aprofundamentos não integrarão a AT2.

O cronograma não apresentará ordenação topológica, SCC, Kosaraju ou Tarjan para SCC como conteúdo da turma teórica. Os respectivos exercícios serão mantidos e sinalizados como desafios avançados.

## Correções de progressão

### T1

- Manter modelagem e medidas antes de representação computacional.
- Manter `Graph` e `Digraph` somente depois da aula de representação.
- Ensinar estados de visita e tempos de descoberta e término na aula de DFS.
- Ajustar o objetivo geral do T1 para exigir DFS/BFS quando aplicável, preservando as soluções estruturais das trilhas A e B.

### T2

- Manter os exercícios de ordenação topológica e SCC como desafios derivados de DFS em dígrafos.
- Manter `Checkposts`.
- Não inserir esses aprofundamentos no conteúdo teórico ou na AT2.
- Manter cortes em vértices e arestas na teoria, incluindo árvore DFS, tempos de descoberta e valores `low`.
- Interpretar a regra de conhecimento prévio como disponibilidade dos conceitos-base, não como demonstração prévia da solução do exercício.

### T3

- Incluir representação de pesos e capacidades na síntese da semana 11.
- Limitar o marco 2 comum à representação e à validação da instância.
- Exigir escolha algorítmica e implementação conforme cada família for ensinada: MST na semana 13, caminhos mínimos na semana 15 e fluxo na semana 16.
- Manter testes e submissão como marcos comuns posteriores.
- Na semana 14, usar formato integrado apenas na quarta-feira; a quinta-feira terá acompanhamento prático integral porque a teoria ocorreu na terça-feira.

## Convenção de dificuldade

O símbolo `*` identificará desafios avançados em todos os bancos T1, T2 e T3.

> `*` **Desafio avançado:** exige maior transferência de conhecimentos, combinação de conceitos ou carga de implementação, sem depender de conteúdo-base ausente.

O símbolo será acrescentado ao título do problema. Cada banco conterá a legenda. Problemas sem asterisco continuarão sendo avaliativos e poderão ter dificuldade intermediária; o símbolo diferencia apenas os casos de maior carga relativa.

## Exercícios avançados

### T1

- UVA 11387 — The 3-Regular Graph
- CSES — Labyrinth
- UVA 336 — A Node Too Far

### T2

- CSES — Flight Routes Check
- Codeforces 427C — Checkposts
- UVA 796 — Critical Links
- Codeforces 510C — Fox And Names
- Kattis — Eulerian Path
- Kattis — Paintball
- CSES — Tree Isomorphism I

### T3 — Árvore geradora mínima

- Kattis — Treehouses
- Kattis — Arctic Network
- UVA 1235 — Anti Brute Force Lock
- UVA 11228 — Transportation System
- UVA 10600 — ACM Contest and Blackout

### T3 — Caminhos mínimos

- UVA 11833 — Route Change
- Codeforces 449B — Jzzhu and Cities
- CSES — Flight Discount
- UVA 12047 — Highest Paid Toll
- UVA 12144 — Almost Shortest Path
- CSES — Flight Routes

### T3 — Fluxo máximo

- CSES — Police Chase
- CSES — School Dance
- CSES — Distinct Routes
- UVA 10080 — Gopher II
- UVA 259 — Software Allocation
- UVA 10092 — The Problem with the Problem Setter
- Kattis — Waif Until Dark

## Arquivos afetados

- `mat/ensino/fluxo_ensino.md`
- `mat/ensino/cronograma_2026_2.md`
- `trabalhos/und1/T1.md`
- `trabalhos/und1/trilhas/*.md`
- `trabalhos/und2/T2/T2.md`
- `trabalhos/und2/T2/trilhas/*.md`
- `trabalhos/und3/README.md`
- `trabalhos/und3/T1/T1.md`
- `trabalhos/und3/T2/T2.md`
- `trabalhos/und3/T3/T3.md`

O projeto de ensino não será alterado.

## Verificação

- Confirmar que os conteúdos teóricos e as ATs não listam ordenação topológica, SCC, Kosaraju ou Tarjan para SCC.
- Confirmar que os exercícios correspondentes permanecem nos bancos do T2.
- Confirmar tempos de descoberta e término na aula de DFS.
- Confirmar que a quinta-feira da semana 14 não está marcada como prática integrada.
- Confirmar a correspondência entre os marcos do T3 e a semana de ensino de cada família algorítmica.
- Confirmar a legenda em todos os bancos e os 28 exercícios avançados previstos nesta especificação.
- Confirmar que nenhum arquivo fora do escopo foi modificado.
- Executar `git diff --check`.
