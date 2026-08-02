# Fluxo de ensino

## Princípios gerais

- Cada unidade terá uma única avaliação prática, organizada em três trilhas.
- Cada grupo resolverá apenas um problema por avaliação prática.
- As Unidades I e II terão dez problemas no total, distribuídos entre as três trilhas.
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
- Implementação das estruturas `Graph` e `Digraph` após o ensino de representação computacional, com referência nas bases `algs4-java` e `algs4-py`.
- Acompanhamento progressivo das trilhas conforme os conteúdos teóricos ensinados.
- Apresentação final do T1.

## Trilhas do T1

O T1 constitui uma única AP com dez problemas no total.

### [Trilha A — Modelagem de grafos simples e medidas estruturais](../../trabalhos/und1/trilhas/trilha-a-grafos-simples.md)

- Modelagem de relações não dirigidas.
- Ordem, tamanho, densidade e sequência de graus.
- Adjacência, incidência, regularidade e completude.
- Classificação dos tipos de grafos previstos no projeto de ensino.

### [Trilha B — Modelagem de dígrafos e medidas estruturais](../../trabalhos/und1/trilhas/trilha-b-digrafos.md)

- Modelagem de relações orientadas.
- Ordem, tamanho, densidade e graus de entrada e saída.
- Adjacência, incidência, fontes, sorvedouros e simetria.
- Direção das arestas e vizinhança orientada.

### [Trilha C — Buscas simples com DFS/BFS](../../trabalhos/und1/trilhas/trilha-c-buscas.md)

- Exploração e alcançabilidade.
- Estados de visita e árvores de busca.
- Níveis, predecessores e reconstrução de caminhos.
- Caminho mínimo em grafos sem pesos.

## Progressão do T1

- As trilhas A e B serão desenvolvidas durante as aulas de modelagem, tipos e representações.
- A Trilha C somente exigirá DFS/BFS depois que essas buscas forem ensinadas no início da Unidade II.
- Antes do ensino de DFS/BFS, os grupos da Trilha C apresentarão apenas evidências de compreensão, modelagem e representação.
- Os grupos deverão interpretar ordem de exploração, alcançabilidade, níveis e predecessores quando aplicáveis.

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
