# Fluxo de ensino

## Princípios gerais

- Cada unidade terá uma única avaliação prática.
- Cada grupo resolverá apenas um problema por avaliação prática.
- O T1 terá aproximadamente dez problemas distintos, desenvolvidos por quatro marcos comuns.
- O T2 terá dez problemas no total, distribuídos entre três trilhas.
- A Unidade III terá dez problemas em cada trilha; aproximadamente dez problemas serão selecionados e atribuídos aos grupos em cada oferta.
- Nenhum acompanhamento exigirá conceitos-base ainda não ensinados.
- Os problemas poderão exigir integração, transferência e descoberta de estratégias a partir desses conhecimentos.
- Cada acompanhamento produzirá evidência verificável de modelagem, fundamentação, execução, implementação, teste ou análise.
- O resultado `Accepted` comprovará a correção computacional, mas não substituirá a aferição de modelagem, fundamentação teórica, correção e complexidade.

# Unidade I — Modelar e representar problemas com grafos

## Turma teórica

- Semana 1: apresentação da disciplina; problemas motivadores; conceitos iniciais e definições.
- Modelagem e representação computacional.
- Tipos de grafos e respectivas modelagens computacionais.
- Medidas estruturais e topológicas previstas no projeto de ensino.

## Turma prática

- Lançamento do T1, distribuição dos problemas e modelagem inicial após os conceitos fundamentais.
- Implementação de `Graph`, `Digraph` ou vizinhança implícita após o ensino de representação computacional, com referência nas bases `algs4-java` e `algs4-py`.
- Acompanhamento progressivo dos quatro marcos conforme os conteúdos teóricos ensinados.
- Apresentação final do T1.

## Marcos do T1

O T1 constitui uma única AP com aproximadamente dez problemas distintos. Cada grupo resolverá um problema que exija modelagem, representação computacional e aplicação básica de ao menos uma busca, com escolha justificada entre DFS e BFS.

### Marco 1 — Modelagem

- Enunciado, entrada, saída e restrições.
- Vértices, arestas e tipo do grafo.
- Instância pequena e resultado esperado.
- Hipótese inicial de solução, sem exigir DFS/BFS antes do ensino.

### Marco 2 — Representação computacional

- Matriz, lista de adjacência ou vizinhança implícita.
- Leitura da entrada e construção do grafo.
- Medidas estruturais da Unidade I pertinentes ao problema.
- Validação da representação com a instância pequena.

### Marco 3 — Aplicação básica de DFS

- Execução manual.
- Estados de visita, árvore de busca e tempos.
- Alcançabilidade e predecessores.
- Aplicabilidade ao problema e implementação parcial quando pertinente.

### Marco 4 — Aplicação básica de BFS e conclusão

- Execução manual.
- Níveis, distâncias e predecessores.
- Comparação entre DFS e BFS; escolha justificada.
- Implementação, testes, complexidade, submissão e ensaio.

## Delimitação do T1

- Todos os problemas exigirão ao menos uma aplicação básica de DFS ou BFS.
- O uso das duas buscas somente será exigido quando pertinente.
- A solução completa somente será exigida depois do ensino de DFS/BFS.
- Contagem operacional de regiões alcançáveis será admissível sem formalização de componentes conexas.
- Percursos, conectividade e propriedades estruturais formais permanecerão no T2.
- A seleção equilibrará modelagem, implementação, testes e dificuldade global.

# Unidade II — Resolver problemas com grafos conexos

## Turma teórica

- Busca em profundidade: estados de visita e tempos de descoberta e término; busca em largura.
- Tratamento formal da conectividade em grafos dirigidos e não dirigidos.
- Tratamento formal de passeios, trilhas, caminhos, ciclos, circuitos e tours.
- Grafos eulerianos e hamiltonianos.
- Cortes em vértices e arestas: árvore DFS, valores `low`, pontes e vértices de articulação.
- Introdução aos problemas de coloração, emparelhamento e isomorfismo.

## Turma prática

- Conclusão, apresentação e avaliação do T1 após o ensino de DFS/BFS.
- Lançamento do T2, distribuição dos problemas e recuperação explícita dos conhecimentos de DFS/BFS.
- Acompanhamento progressivo da conectividade e das propriedades específicas das trilhas.
- Implementação, testes, análise de complexidade e preparação da apresentação.
- Apresentação final do T2.

## Trilhas do T2

O T2 constitui uma única AP com dez problemas no total.

### [Trilha A — Buscas e conectividade](../../trabalhos/und2/T2/trilhas/trilha-a-conectividade.md)

- Aplicações mais complexas de DFS/BFS.
- Componentes conexas.
- Pontes, vértices de articulação e critérios de conectividade.
- **Aprofundamentos restritos aos exercícios:** grafo reverso, conectividade forte, Kosaraju e Tarjan para SCC.

### [Trilha B — Percursos e estruturas de ordem](../../trabalhos/und2/T2/trilhas/trilha-b-percursos.md)

- Ciclos dirigidos.
- Caminhos e circuitos eulerianos.
- Reconhecimento de propriedades de passeios, trilhas, caminhos, ciclos, circuitos e tours.
- Modelagem e reconhecimento de estruturas hamiltonianas, sem exigir solução geral do problema hamiltoniano.
- **Aprofundamento restrito aos exercícios:** ordenação topológica.

### [Trilha C — Relações estruturais](../../trabalhos/und2/T2/trilhas/trilha-c-relacoes-estruturais.md)

- Bipartição e coloração.
- Emparelhamento.
- Isomorfismo de árvores.
- Isomorfismo geral apenas no plano conceitual.

## Progressão do T2

- O primeiro acompanhamento verificará modelagem, representação e participação de DFS/BFS na solução.
- Os conceitos-base de conectividade e das propriedades específicas somente serão exigidos depois das aulas teóricas correspondentes.
- Os aprofundamentos restritos aos exercícios poderão exigir integração, transferência e descoberta de estratégias a partir desses conceitos-base.
- Ordenação topológica, SCC, Kosaraju e Tarjan para SCC não integrarão a AT2.
- Os problemas da Trilha C terão dificuldade moderada porque seus conteúdos aparecem mais tarde na unidade.
- Problemas hamiltonianos gerais, caixeiro viajante exato, carteiro chinês completo e isomorfismo geral não serão exigidos como implementação nesta AP.

# Unidade III — Otimizar grafos ponderados

## Turma teórica

- Problema da árvore geradora mínima: Kruskal, Prim e Union-Find.
- Problema do caminho mínimo: Dijkstra, Bellman-Ford e Floyd-Warshall.
- Problema do fluxo máximo: conceitos fundamentais, Ford-Fulkerson e Edmonds-Karp.

## Turma prática

- Lançamento do T3, apresentação das trilhas e distribuição dos problemas selecionados.
- Acompanhamento progressivo conforme cada família algorítmica for ensinada.
- Execução manual, escolha do algoritmo, implementação, testes e análise de complexidade.
- Submissão na plataforma, preparação e apresentação final do T3.

## Trilhas do T3

O T3 constitui uma única AP. Cada trilha manterá um banco com dez problemas, totalizando trinta opções. Em cada oferta, aproximadamente dez problemas serão selecionados e distribuídos entre os grupos.

### [Trilha A — Árvore geradora mínima](../../trabalhos/und3/T1/T1.md)

- Modelagem de grafos ponderados.
- Kruskal, Prim e Union-Find.
- Propriedade do corte, existência de MST e variações compatíveis.

### [Trilha B — Caminhos mínimos](../../trabalhos/und3/T2/T2.md)

- Relaxamento e reconstrução de caminhos.
- Dijkstra e restrição de pesos não negativos.
- Bellman-Ford e detecção de ciclos negativos.
- Floyd-Warshall como conteúdo da AT ou de atividade dirigida, sem obrigação de integrar o banco prático.

### [Trilha C — Fluxo máximo](../../trabalhos/und3/T3/T3.md)

- Modelagem de redes, capacidades e conservação.
- Grafo residual, caminhos aumentantes e gargalos.
- Ford-Fulkerson e Edmonds-Karp.
- Corte mínimo e reduções diretas para emparelhamento.

## Progressão do T3

- Cada grupo iniciará pela formulação e representação do problema atribuído.
- A implementação específica da trilha somente será exigida depois do ensino do algoritmo correspondente.
- Grupos de trilhas ainda não ensinadas continuarão produzindo evidências comuns de modelagem, representação e comparação de objetivos.
- A seleção dos problemas de cada oferta deverá equilibrar dificuldade, carga de implementação e profundidade teórica.
