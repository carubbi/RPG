# Fluxo de ensino

## Princípios gerais

- Cada unidade terá uma única avaliação prática, organizada em três trilhas.
- Cada grupo resolverá apenas um problema por avaliação prática.
- As Unidades I e II terão dez problemas no total, distribuídos entre as três trilhas.
- A Unidade III terá dez problemas em cada trilha; aproximadamente dez problemas serão selecionados e atribuídos aos grupos em cada oferta.
- Cada acompanhamento deverá aferir um conhecimento previamente ensinado por meio de evidência verificável.
- O resultado `Accepted` comprovará a correção computacional, mas não substituirá a aferição de modelagem, fundamentação teórica, correção e complexidade.

# Unidade I — Modelar e representar problemas com grafos

## Turma teórica

- Apresentação da disciplina e introdução a grafos por meio de casos práticos.
- Introdução à teoria dos grafos.
- Modelagem e representação computacional.
- Tipos de grafos e respectivas modelagens computacionais.
- Medidas estruturais e tipológicas previstas no projeto de ensino.

## Turma prática

- Prática não computacional sobre as Pontes de Königsberg.
- Implementação das estruturas `Graph` e `Digraph`, com referência nas bases `algs4-java` e `algs4-py`.
- Lançamento do T1, distribuição dos problemas e modelagem inicial.
- Acompanhamento progressivo das trilhas conforme os conteúdos teóricos ensinados.
- Apresentação final do T1.

## Trilhas do T1

O T1 constitui uma única AP com dez problemas no total.

### Trilha A — Modelagem de grafos simples e medidas estruturais

- Modelagem de relações não dirigidas.
- Ordem, tamanho, densidade e sequência de graus.
- Adjacência, incidência, regularidade, completude e conectividade.
- Classificação dos tipos de grafos previstos no projeto de ensino.

### Trilha B — Modelagem de dígrafos e medidas estruturais

- Modelagem de relações orientadas.
- Ordem, tamanho, densidade e graus de entrada e saída.
- Adjacência, incidência, fontes, sorvedouros e simetria.
- Direção das arestas e alcançabilidade elementar.

### Trilha C — Buscas simples com DFS/BFS

- Exploração e alcançabilidade.
- Componentes e árvores de busca.
- Níveis, predecessores e reconstrução de caminhos.
- Caminho mínimo em grafos sem pesos.

## Progressão do T1

- As trilhas A e B serão desenvolvidas durante as aulas de modelagem, tipos e representações.
- A Trilha C somente exigirá DFS/BFS depois que essas buscas forem ensinadas no início da Unidade II.
- Antes do ensino de DFS/BFS, os grupos da Trilha C apresentarão apenas evidências de compreensão, modelagem e representação.
- Todos os grupos deverão classificar uma sequência relevante como passeio, trilha, caminho ou ciclo e justificar quando alguma dessas estruturas não puder ocorrer.

# Unidade II — Resolver problemas com grafos conexos

## Turma teórica

- Busca em profundidade e busca em largura.
- Conectividade em grafos dirigidos e não dirigidos.
- Passeios, trilhas, caminhos, ciclos, circuitos e tours.
- Grafos eulerianos e hamiltonianos.
- Ordenação topológica e componentes fortemente conexas.
- Introdução aos problemas de coloração, emparelhamento e isomorfismo.

## Turma prática

- Conclusão, apresentação e avaliação do T1 após o ensino de DFS/BFS.
- Lançamento do T2, distribuição dos problemas e recuperação explícita dos conhecimentos de DFS/BFS.
- Acompanhamento progressivo da conectividade e das propriedades específicas das trilhas.
- Implementação, testes, análise de complexidade e preparação da apresentação.
- Apresentação final do T2.

## Trilhas do T2

O T2 constitui uma única AP com dez problemas no total.

### Trilha A — Buscas e conectividade

- Aplicações mais complexas de DFS/BFS.
- Componentes conexas e fortemente conexas.
- Pontes, vértices de articulação e critérios de conectividade.

### Trilha B — Percursos e estruturas de ordem

- Ciclos dirigidos e ordenação topológica.
- Caminhos e circuitos eulerianos.
- Reconhecimento de propriedades de passeios, trilhas, caminhos, ciclos, circuitos e tours.
- Modelagem e reconhecimento de estruturas hamiltonianas, sem exigir solução geral do problema hamiltoniano.

### Trilha C — Relações estruturais

- Bipartição e coloração.
- Emparelhamento.
- Isomorfismo de árvores.
- Isomorfismo geral apenas no plano conceitual.

## Progressão do T2

- O primeiro acompanhamento verificará modelagem, representação e participação de DFS/BFS na solução.
- Conectividade e propriedades específicas somente serão exigidas depois das aulas teóricas correspondentes.
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

### Trilha A — Árvore geradora mínima

- Modelagem de grafos ponderados.
- Kruskal, Prim e Union-Find.
- Propriedade do corte, existência de MST e variações compatíveis.

### Trilha B — Caminhos mínimos

- Relaxamento e reconstrução de caminhos.
- Dijkstra e restrição de pesos não negativos.
- Bellman-Ford e detecção de ciclos negativos.
- Floyd-Warshall como conteúdo da AT ou de atividade dirigida, sem obrigação de integrar o banco prático.

### Trilha C — Fluxo máximo

- Modelagem de redes, capacidades e conservação.
- Grafo residual, caminhos aumentantes e gargalos.
- Ford-Fulkerson e Edmonds-Karp.
- Corte mínimo e reduções diretas para emparelhamento.

## Progressão do T3

- Cada grupo iniciará pela formulação e representação do problema atribuído.
- A implementação específica da trilha somente será exigida depois do ensino do algoritmo correspondente.
- Grupos de trilhas ainda não ensinadas continuarão produzindo evidências comuns de modelagem, representação e comparação de objetivos.
- A seleção dos problemas de cada oferta deverá equilibrar dificuldade, carga de implementação e profundidade teórica.
