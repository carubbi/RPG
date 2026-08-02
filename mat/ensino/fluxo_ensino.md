# Fluxo de ensino

## Princípios gerais

- Cada unidade terá uma única avaliação prática.
- Cada grupo resolverá apenas um problema por avaliação prática.
- O T1 terá aproximadamente dez problemas distintos, desenvolvidos por quatro marcos comuns.
- O T2 terá dez problemas distribuídos entre três bancos temáticos.
- A Unidade III terá dez problemas em cada classe de otimização; aproximadamente dez problemas serão selecionados e atribuídos aos grupos em cada oferta.
- Nenhum acompanhamento exigirá conceitos-base ainda não ensinados.
- Os problemas poderão exigir integração, transferência e descoberta de estratégias a partir desses conhecimentos.
- Os algoritmos serão apresentados por construção guiada e disponibilizados como implementações de referência; os grupos deverão compreendê-los, rastreá-los, integrá-los e adaptá-los, sem implementação integral a partir do zero.
- A adaptação somente será exigida quando houver implementação de referência na linguagem escolhida; na ausência dela, o professor deverá fornecê-la antes do respectivo acompanhamento ou restringir a atribuição.
- Cada acompanhamento produzirá evidência verificável de modelagem, fundamentação, execução, adaptação, integração, teste ou análise.
- O resultado `Accepted` comprovará a correção computacional, mas não substituirá a aferição de modelagem, fundamentação teórica, correção e complexidade.

## Disponibilidade das implementações de referência

- **Python e Java:** representações básicas; DFS; BFS; componentes e ciclos; MST; Dijkstra; Bellman-Ford.
- **Somente Java no repositório atual:** pontes; articulações; percursos eulerianos; bipartição; emparelhamento; isomorfismo de árvores; fluxo máximo; Floyd-Warshall.
- Problemas desses últimos conteúdos somente poderão usar Python após o fornecimento da referência equivalente.

# Unidade I — Modelar e representar problemas com grafos

## Turma teórica

- Semana 1: apresentação da disciplina; problemas motivadores; conceitos iniciais e definições.
- Modelagem e representação computacional.
- Tipos de grafos e respectivas modelagens computacionais.
- Medidas estruturais e topológicas previstas no projeto de ensino.

## Turma prática

- Lançamento do T1, distribuição dos problemas e modelagem inicial após os conceitos fundamentais.
- Construção ou adaptação de `Graph`, `Digraph` ou representação implícita após o ensino de representação computacional, com referência nas bases `algs4-java` e `algs4-py`.
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

- Matriz, lista de adjacência ou representação implícita.
- Leitura da entrada e construção do grafo.
- Medidas estruturais da Unidade I pertinentes ao problema.
- Validação da representação com a instância pequena.

### Marco 3 — Aplicação básica de DFS

- Execução manual.
- Estados de visita, árvore de busca e tempos.
- Alcançabilidade e predecessores.
- Aplicabilidade ao problema e adaptação parcial quando pertinente.

### Marco 4 — Aplicação básica de BFS e conclusão

- Execução manual.
- Níveis, distâncias e predecessores.
- Comparação entre DFS e BFS; escolha justificada.
- Adaptação, integração, testes, complexidade, submissão e ensaio.

## Delimitação do T1

- Todos os problemas exigirão ao menos uma aplicação básica de DFS ou BFS.
- O uso das duas buscas somente será exigido quando pertinente.
- A solução completa somente será exigida depois do ensino de DFS/BFS.
- Contagem operacional de regiões alcançáveis será admissível sem formalização de componentes conexas.
- Percursos, conectividade e propriedades estruturais formais permanecerão no T2.
- A seleção equilibrará modelagem, adaptação, testes e dificuldade global.

# Unidade II — Resolver problemas com grafos conexos

## Turma teórica

- Busca em profundidade: estados de visita e tempos de descoberta e término; busca em largura.
- Tratamento formal da conectividade em grafos dirigidos e não dirigidos.
- Tratamento formal de passeios, trilhas, caminhos, ciclos, circuitos e tours.
- Grafos eulerianos: condições de existência, Fleury e Hierholzer.
- Grafos hamiltonianos: condições necessárias e reconhecimento de casos simples.
- Cortes em vértices e arestas: árvore DFS, arestas de retorno, menor descoberta alcançável, pontes, vértices de articulação e caso da raiz.
- Coloração: 2-coloração por DFS/BFS, coloração gulosa, número cromático e delimitação do cálculo exato.
- Emparelhamento: vértices livres, caminhos alternantes e aumentantes e emparelhamento máximo.
- Isomorfismo: invariantes estruturais, codificação canônica de árvores por DFS em pós-ordem e delimitação do caso geral.

## Turma prática

- Conclusão, apresentação e avaliação do T1 após o ensino de DFS/BFS.
- Lançamento do T2, distribuição dos problemas e recuperação explícita dos conhecimentos de DFS/BFS.
- Acompanhamento progressivo da conectividade e das propriedades pertinentes aos problemas.
- Adaptação, integração, testes, análise de complexidade e preparação da apresentação.
- Apresentação final do T2.

## Bancos temáticos do T2

O T2 constitui uma única AP com dez problemas no total.

### [Buscas e conectividade](../trabalhos/T2.md#problemas)

- Aplicações mais complexas de DFS/BFS.
- Componentes conexas.
- Pontes, vértices de articulação e critérios de conectividade.
- **Aprofundamentos restritos aos exercícios:** grafo reverso, conectividade forte, Kosaraju e Tarjan para SCC.

### [Percursos e estruturas de ordem](../trabalhos/T2.md#problemas)

- Ciclos dirigidos.
- Caminhos e circuitos eulerianos.
- Reconhecimento de propriedades de passeios, trilhas, caminhos, ciclos, circuitos e tours.
- Modelagem e reconhecimento de estruturas hamiltonianas, sem exigir solução geral do problema hamiltoniano.
- **Aprofundamento restrito aos exercícios:** ordenação topológica.

### [Relações estruturais](../trabalhos/T2.md#problemas)

- Bipartição e coloração.
- Emparelhamento.
- Isomorfismo de árvores.
- Isomorfismo geral apenas no plano conceitual.

## Progressão do T2

- O T2 terá quatro marcos comuns: problema e conhecimento prévio; propriedade estrutural; adaptação e testes; relação estrutural e conclusão.
- O primeiro acompanhamento verificará modelagem, representação e participação de DFS/BFS na solução.
- Os conceitos-base de conectividade e das propriedades específicas somente serão exigidos depois das aulas teóricas correspondentes.
- Os aprofundamentos restritos aos exercícios poderão exigir integração, transferência e descoberta de estratégias a partir desses conceitos-base.
- Ordenação topológica, SCC, Kosaraju e Tarjan para SCC não integrarão a AT2.
- Os problemas de relações estruturais terão dificuldade moderada porque seus conteúdos aparecem mais tarde na unidade.
- Problemas hamiltonianos gerais, caixeiro viajante exato, carteiro chinês completo e isomorfismo geral não serão exigidos como solução computacional nesta AP.

# Unidade III — Otimizar grafos ponderados

## Turma teórica

- Problema da árvore geradora mínima: Kruskal, Prim e Union-Find.
- Problema do caminho mínimo: relaxamento; Dijkstra; Bellman-Ford; Floyd-Warshall por atualização da matriz com vértices intermediários.
- Problema do fluxo máximo: capacidade residual; caminhos aumentantes; Ford-Fulkerson; Edmonds-Karp por BFS.

## Turma prática

- Lançamento do T3, apresentação das classes de otimização e distribuição dos problemas selecionados.
- Acompanhamento progressivo conforme cada família algorítmica for ensinada.
- Execução manual, escolha do algoritmo, adaptação, integração, testes e análise de complexidade.
- Submissão na plataforma, preparação e apresentação final do T3.

## Classes de otimização do T3

O T3 constitui uma única AP. Cada classe manterá um banco com dez problemas, totalizando trinta opções. Em cada oferta, aproximadamente dez problemas serão selecionados e distribuídos entre os grupos.

### [Árvore geradora mínima](../trabalhos/T3.md#árvore-geradora-mínima)

- Modelagem de grafos ponderados.
- Kruskal, Prim e Union-Find.
- Propriedade do corte, existência de MST e variações compatíveis.

### [Caminhos mínimos](../trabalhos/T3.md#caminhos-mínimos)

- Relaxamento e reconstrução de caminhos.
- Dijkstra e restrição de pesos não negativos.
- Bellman-Ford e detecção de ciclos negativos.
- Floyd-Warshall como conteúdo da AT ou de atividade dirigida, sem obrigação de integrar o banco prático.

### [Fluxo máximo](../trabalhos/T3.md#fluxo-máximo)

- Modelagem de redes, capacidades e conservação.
- Grafo residual, caminhos aumentantes e gargalos.
- Ford-Fulkerson; Edmonds-Karp como seleção de caminhos aumentantes por BFS.
- Corte mínimo e reduções diretas para emparelhamento.

## Progressão do T3

- Cada grupo iniciará pela formulação e representação do problema atribuído.
- A adaptação específica da classe somente será exigida depois do ensino do algoritmo correspondente.
- `FlowEdge` e `FlowNetwork` somente serão apresentados após os conceitos fundamentais de fluxo máximo.
- Os grupos cujo conteúdo algorítmico ainda não foi ensinado continuarão produzindo evidências comuns de modelagem, representação e comparação de objetivos.
- A seleção dos problemas de cada oferta deverá equilibrar dificuldade, carga de adaptação e profundidade teórica.
