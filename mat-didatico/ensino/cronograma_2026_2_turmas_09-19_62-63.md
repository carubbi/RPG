# Cronograma discente — T290 — turmas 09/19 e 62/63 — 2026.2

> Versão para as turmas de segunda-feira e quarta-feira, derivada do cronograma docente.

## 1. Identificação

- **Disciplina:** T290 — Resolução de Problemas com Grafos.
- **Carga horária institucional:** 72 horas.
- **Período letivo:** 03/08/2026 a 09/12/2026.
- **Projeto de ensino:** [proj_ensino_2026.md](proj_ensino_2026.md).
- **Implementações Java:** [implementacoes_algs4_java.md](implementacoes_algs4_java.md).
- **Calendário acadêmico:** [calendario_2026_2.md](calendario_2026_2.md).
- **Turmas e horários:** [turmas_2026_2.md](turmas_2026_2.md).

## 2. Organização das turmas

### Turma 09/19

- **Aula teórica:** Turma 09 — segunda-feira, 21h às 22h40, sala C27.
- **Aula prática:** Turma 19 — quarta-feira, 21h às 22h40, sala C27.

### Turma 62/63

- **Aula teórica:** Turma 62 — segunda-feira, 17h20 às 19h, sala C34.
- **Aula prática:** Turma 63 — quarta-feira, 17h20 às 19h, sala T05.

### Aula teórica

**Objetivo:** construir conceitos, modelar problemas, analisar correção e complexidade, comparar códigos em Python e Java e realizar as ATs.

### Aula prática

**Objetivo:** desenvolver os trabalhos T1–T3 por meio de práticas computacionais e acompanhamentos que atestem os conhecimentos ensinados, além de realizar as apresentações das APs.

## 3. Orientações gerais

- Não haverá reposição, compensação de carga horária nem criação de encontros externos. Os feriados serão registrados por data e denominação oficial como “feriado — sem aula”.
- Quando um feriado afetar a aula teórica, a aula prática poderá assumir formato integrado, com aproximadamente 40 minutos de síntese conceitual e 60 minutos de acompanhamento reduzido. Trata-se de uma adequação do encontro regular, sem aula adicional e sem concentração de conteúdo complexo.
- Os datasets grandes não integram o repositório e devem ser obtidos conforme as [instruções de download](../../dataset/README.md).
- Python e Java serão alternativas equivalentes. A adaptação somente será exigida quando houver implementação de referência na linguagem escolhida.
- Os algoritmos serão apresentados por construção guiada e disponibilizados como implementações de referência. Os grupos deverão compreender, rastrear, integrar e adaptar essas implementações ao problema atribuído; não será exigida implementação integral a partir do zero.

## 4. Cronograma por unidade

### Unidade I — Modelar e representar problemas com grafos (12h)

#### Semana 1 — Apresentação da disciplina e fundamentos de grafos — 03–06/08

- **Datas:** aula teórica em 03/08 (seg.); aula prática, excepcionalmente em formato teórico, em 05/08 (qua.).
- **Aula teórica — apresentação e motivação:** disciplina; objetivos; metodologia; avaliações; Pontes de Königsberg; rotas; redes; alocação; identificação de entidades e relações; modelagem inicial de problemas como grafos.
- **Aula prática — conceitos iniciais:** grafo `G = (V, E)`; vértice; aresta; ordem; tamanho; densidade em grafos simples não orientados; grau; adjacência; incidência; ponte; subgrafo; ciclo.
- **Projeto de ensino:** 01.01 — Teoria dos grafos; 01.02 — Tipos de grafos (parcial: subgrafo e ciclo).
- **Recursos:**
  - **Material didático:** [A1 — Conceitos iniciais](../aulas/A1_Conceitos_Iniciais.pdf).
- **Produto formativo:** exercícios conceituais; modelagens; cálculos estruturais.

#### Semana 2 — Tipos de grafos e modelagem do T1 — 10–13/08

- **Datas:** teórica em 10/08 (seg.); prática em 12/08 (qua.).
- **Aula teórica — tipos e propriedades de grafos:** grafos rotulados; grafos simples; multigrafos; grafos não orientados; dígrafos; dígrafos acíclicos (DAGs); grafos ponderados; grafos regulares; grafos completos; grafos bipartidos; grafos planares; grafos conexos; orientação; laços; arestas paralelas; pesos; rótulos; partições.
- **Aula prática — modelagem inicial do T1:** lançamento; atribuição dos problemas; preparação do ambiente Python/Java; orientação do marco 1.
- **Acompanhamento 1 — Modelagem (1,0 ponto):** entrada; saída; restrições; vértices; arestas; tipo do grafo; instância pequena; resultado esperado; hipótese inicial justificada; validação oral e registro no repositório.
- **Projeto de ensino:** 01.01 — Teoria dos grafos (aplicação); 01.02 — Tipos de grafos.
- **Recursos:**
  - **Material didático:** [A2 — Tipos e representação computacional](../aulas/A2_Tipos_Representação_Computacional_.pdf).
  - **Dados:** [`tinyG.txt`](../../dataset/tinyG.txt), [`tinyDG.txt`](../../dataset/tinyDG.txt) e [`cavalo_3x3.txt`](../../dataset/cavalo_3x3.txt).
- **Produto/evidência:** ficha de modelagem; classificação justificada; instância pequena.

#### Semana 3 — Representações computacionais no T1 — 17–20/08

- **Datas:** teórica em 17/08 (seg.); prática em 19/08 (qua.).
- **Aula teórica — representações computacionais:** matriz de adjacência; matriz de incidência; lista de adjacência; lista de incidência; custos de espaço; inserção de arestas; consulta de adjacência e incidência; percurso de vizinhança; adequação ao tipo e à densidade do grafo.
- **Aula prática — representação computacional do T1:** `Graph`, `Digraph` ou representação implícita; geração de instâncias com `GraphGenerator` e `DigraphGenerator`; Python ou Java; orientação do marco 2.
- **Acompanhamento 2 — Representação computacional (1,0 ponto):** entrada processada; grafo construído; medidas pertinentes; instância pequena validada; custo e escolha da representação justificados; validação oral e registro no repositório.
- **Projeto de ensino:** 01.02 — Tipos de grafos (aplicação); 01.03 — Representação computacional.
- **Recursos:**
  - **Material didático:** [A2 — Tipos e representação computacional](../aulas/A2_Tipos_Representação_Computacional_.pdf).
  - **Estruturas de dados:** [`Bag`](../../algs4-py/algs4/bag.py), [`Bag.java`](../../algs4-java/algs4/Bag.java), [`Stack.java`](../../algs4-java/algs4/Stack.java), [`ST`](../../algs4-py/algs4/st.py), [`ST.java`](../../algs4-java/algs4/ST.java) e [`SET.java`](../../algs4-java/algs4/SET.java).
  - **Estruturas e representações:** [`Graph`](../../algs4-py/algs4/graph.py), [`Graph.java`](../../algs4-java/algs4/Graph.java), [`Digraph`](../../algs4-py/algs4/digraph.py), [`Digraph.java`](../../algs4-java/algs4/Digraph.java), [`SymbolGraph`](../../algs4-py/algs4/symbol_graph.py), [`SymbolGraph.java`](../../algs4-java/algs4/SymbolGraph.java) e [`SymbolDigraph.java`](../../algs4-java/algs4/SymbolDigraph.java).
  - **Geradores:** [`GraphGenerator.java`](../../algs4-java/algs4/GraphGenerator.java), [`DigraphGenerator.java`](../../algs4-java/algs4/DigraphGenerator.java) e [`StdRandom.java`](../../algs4-java/algs4/StdRandom.java).
  - **Dados:** [`tobe.txt`](../../dataset/tobe.txt), [`tinyST.txt`](../../dataset/tinyST.txt), [`routes.txt`](../../dataset/routes.txt), [`airports.txt`](../../dataset/airports.txt), [`movies.txt`](../../dataset/movies.txt), [`tinyG.txt`](../../dataset/tinyG.txt), [`mediumG.txt`](../../dataset/mediumG.txt), [`largeG.txt`](https://algs4.cs.princeton.edu/41graph/largeG.txt), [`tinyDG.txt`](../../dataset/tinyDG.txt), [`mediumDG.txt`](../../dataset/mediumDG.txt) e [`largeDG.txt`](https://algs4.cs.princeton.edu/42digraph/largeDG.txt).
- **Produto/evidência:** entrada processada; representação construída; medidas pertinentes; validação; justificativa por `V`, `E`, orientação, pesos, rótulos e restrições.

### Unidade II — Resolver problemas com grafos conexos (22h)

#### Semana 4 — Busca em profundidade e aplicação no T1 — 24–27/08

- **Datas:** teórica em 24/08 (seg.); prática em 26/08 (qua.).
- **Aula teórica — busca em profundidade:** busca em profundidade; estados de visita; árvore de busca; tempo de descoberta; tempo de término; classificação de arestas; alcançabilidade; predecessores; caminhos; invariantes; correção; complexidade .
- **Aula prática — aplicação de DFS no T1:** execução guiada; aplicação ao problema; orientação do marco 3.
- **Acompanhamento 3 — Aplicação básica de DFS (1,0 ponto):** execução manual; estados de visita; árvore de busca; tempos de descoberta e término; alcançabilidade; predecessores; aplicabilidade; adaptação parcial quando pertinente; validação oral e registro no repositório.
- **Projeto de ensino:** 02.01 — Algoritmos de busca (busca em profundidade).
- **Recursos:**
  - **Estruturas de dados:** [`Bag.java`](../../algs4-java/algs4/Bag.java), [`Queue.java`](../../algs4-java/algs4/Queue.java) e [`Stack.java`](../../algs4-java/algs4/Stack.java).
  - **Algoritmos:** [`DepthFirstSearch`](../../algs4-py/algs4/depth_first_search.py), [`DepthFirstPaths`](../../algs4-py/algs4/depth_first_paths.py), [`DepthFirstSearch.java`](../../algs4-java/algs4/DepthFirstSearch.java), [`DepthFirstPaths.java`](../../algs4-java/algs4/DepthFirstPaths.java), [`NonrecursiveDFS.java`](../../algs4-java/algs4/NonrecursiveDFS.java), [`DirectedDFS.java`](../../algs4-java/algs4/DirectedDFS.java), [`DepthFirstDirectedPaths.java`](../../algs4-java/algs4/DepthFirstDirectedPaths.java), [`NonrecursiveDirectedDFS.java`](../../algs4-java/algs4/NonrecursiveDirectedDFS.java) e [`DepthFirstOrder.java`](../../algs4-java/algs4/DepthFirstOrder.java).
  - **Dados:** [`tobe.txt`](../../dataset/tobe.txt), [`tinyG.txt`](../../dataset/tinyG.txt), [`tinyCG.txt`](../../dataset/tinyCG.txt), [`mediumG.txt`](../../dataset/mediumG.txt), [`largeG.txt`](https://algs4.cs.princeton.edu/41graph/largeG.txt), [`tinyDG.txt`](../../dataset/tinyDG.txt), [`mediumDG.txt`](../../dataset/mediumDG.txt), [`largeDG.txt`](https://algs4.cs.princeton.edu/42digraph/largeDG.txt) e [`tinyDAG.txt`](../../dataset/tinyDAG.txt).
- **Produto/evidência:** rastreamento manual; aplicabilidade da DFS; adaptação parcial quando pertinente; correção; complexidade.

#### Semana 5 — Busca em largura, revisão teórica e conclusão do T1 — 31/08–03/09

- **Datas:** teórica em 31/08 (seg.); prática em 02/09 (qua.).
- **Aula teórica — busca em largura:** busca em largura; fronteiras; árvore BFS; níveis; predecessores; distância; reconstrução de caminhos; caminho mínimo em grafos sem pesos; comparação com DFS; correção; complexidade.
- **Aula prática — aplicação de BFS e conclusão do T1 (70 minutos):** execução guiada; comparação com DFS; orientação do marco 4.
- **Aula prática — revisão teórica (30 minutos):** fundamentos, modelagem e medidas estruturais; tipos e propriedades de grafos; representações computacionais; DFS e BFS; alcançabilidade e caminhos básicos; correção e complexidade; dúvidas.
- **Acompanhamento 4 — Aplicação básica de BFS e conclusão (1,0 ponto):** execução manual; níveis; distâncias; predecessores; escolha justificada entre DFS e BFS; adaptação; integração; testes; complexidade; submissão; ensaio; validação oral e registro no repositório.
- **Projeto de ensino:** 01.01 — Teoria dos grafos (revisão); 01.02 — Tipos de grafos (revisão); 01.03 — Representação computacional (revisão); 02.01 — Algoritmos de busca (busca em largura e revisão).
- **Recursos:**
  - **Estruturas de dados:** `collections.deque`, [`Queue.java`](../../algs4-java/algs4/Queue.java) e [`Stack.java`](../../algs4-java/algs4/Stack.java).
  - **Algoritmos:** [`BreadthFirstPaths`](../../algs4-py/algs4/breadth_first_paths.py), [`BreadthFirstPaths.java`](../../algs4-java/algs4/BreadthFirstPaths.java) e [`BreadthFirstDirectedPaths.java`](../../algs4-java/algs4/BreadthFirstDirectedPaths.java).
  - **Aplicação:** [`DegreesOfSeparation.java`](../../algs4-java/algs4/DegreesOfSeparation.java).
  - **Dados:** [`tobe.txt`](../../dataset/tobe.txt), [`tinyG.txt`](../../dataset/tinyG.txt), [`tinyCG.txt`](../../dataset/tinyCG.txt), [`mediumG.txt`](../../dataset/mediumG.txt), [`largeG.txt`](https://algs4.cs.princeton.edu/41graph/largeG.txt), [`tinyDG.txt`](../../dataset/tinyDG.txt), [`mediumDG.txt`](../../dataset/mediumDG.txt), [`largeDG.txt`](https://algs4.cs.princeton.edu/42digraph/largeDG.txt), [`routes.txt`](../../dataset/routes.txt) e [`movies.txt`](../../dataset/movies.txt).
- **Produto/evidência:** solução testada; estratégia justificada; `Accepted`; correção; complexidade; apresentação.

#### Semana 6 — Feriado e apresentação do T1 — 07–09/09

- **Datas:** **07/09 — Dia da Independência do Brasil — feriado, sem aula**; apresentação em 09/09 (qua.).
- **Aula teórica — feriado:** sem encontro; revisão teórica realizada ao final da prática da Semana 5.
- **Aula prática — apresentação da AP1:** apresentações do T1; aproximadamente dez grupos; avaliação; devolutiva.
- **Projeto de ensino:** 01.01 — Teoria dos grafos (síntese realizada na Semana 5); 01.02 — Tipos de grafos (síntese realizada na Semana 5); 01.03 — Representação computacional (síntese realizada na Semana 5); 02.01 — Algoritmos de busca (apresentação).
- **Recursos:**
  - **Apresentação e avaliação:** [template institucional](../trabalhos/template/template_UNIFOR.pptx); repositórios; apresentações; rubrica da AP1.
- **Produto/evidência:** apresentação; avaliação da AP1; repositório congelado; devolutiva.

#### Semana 7 — AT1 e modelagem inicial do T2 — 14–17/09

- **Datas:** AT1 em 14/09 (seg.); prática em 16/09 (qua.).
- **Aula teórica — AT1:** dez questões objetivas estilo ENADE; AVA/Moodle; fundamentos; tipos; representações; DFS; BFS; encontro integral; liberação posterior da nota e das justificativas.
- **Aula prática — modelagem inicial do T2:** bancos temáticos; atribuição do problema; orientação do marco 1.
- **Acompanhamento 1 — Problema e conhecimento prévio (evidência pontuada):** entrada; saída; restrições; vértices; arestas; tipo do grafo; participação de DFS/BFS; instância pequena; validação oral e registro no repositório.
- **Projeto de ensino:** 01.01 — Teoria dos grafos (avaliação); 01.02 — Tipos de grafos (avaliação); 01.03 — Representação computacional (avaliação); 02.01 — Algoritmos de busca (avaliação e aplicação).
- **Recursos:**
  - **Algoritmos:** DFS e BFS.
  - **Dados:** datasets da Unidade II.
- **Produto/evidência:** registro da AT1; ficha inicial do T2; instância pequena.

#### Semana 8 — Formalização de percursos e conectividade no T2 — 21–24/09

- **Datas:** teórica em 21/09 (seg.); prática em 23/09 (qua.).
- **Aula teórica — formalização de percursos e conectividade:** passeio; trilha; caminho; ciclo; circuito; tour; componentes conexas; identificação de componentes e ciclos por DFS; árvore DFS; tempos de descoberta; arestas de retorno; menor tempo de descoberta alcançável; critérios de ponte e articulação; caso da raiz; rastreamento e análise das implementações; correção; complexidade.
- **Aula prática — aplicação de conectividade no T2:** conectividade; propriedade pertinente ao problema; execução manual; adaptação e testes; orientação do marco 2.
- **Acompanhamento 2 — Propriedade estrutural (evidência pontuada):** propriedade; critério algorítmico; execução manual; estado adicional à DFS/BFS; validação oral e registro no repositório.
- **Projeto de ensino:** 02.01 — Algoritmos de busca (aplicação); 02.02 — Grafos não dirigidos e dirigidos (percursos, componentes conexos e cortes).
- **Recursos:**
  - **Estruturas de dados:** [`Bag`](../../algs4-py/algs4/bag.py), [`Queue.java`](../../algs4-java/algs4/Queue.java) e [`Stack.java`](../../algs4-java/algs4/Stack.java).
  - **Algoritmos:** [`CC`](../../algs4-py/algs4/cc.py), [`Cycle`](../../algs4-py/algs4/cycle.py), [`CC.java`](../../algs4-java/algs4/CC.java), [`Cycle.java`](../../algs4-java/algs4/Cycle.java), [`DirectedCycle.java`](../../algs4-java/algs4/DirectedCycle.java), [`Bridge.java`](../../algs4-java/algs4/Bridge.java), [`Biconnected.java`](../../algs4-java/algs4/Biconnected.java) e [`TransitiveClosure.java`](../../algs4-java/algs4/TransitiveClosure.java).
  - **Geradores:** [`GraphGenerator.java`](../../algs4-java/algs4/GraphGenerator.java) e [`DigraphGenerator.java`](../../algs4-java/algs4/DigraphGenerator.java).
  - **Dados:** [`tobe.txt`](../../dataset/tobe.txt), [`tinyG.txt`](../../dataset/tinyG.txt), [`mediumG.txt`](../../dataset/mediumG.txt), [`largeG.txt`](https://algs4.cs.princeton.edu/41graph/largeG.txt), [`tinyDG.txt`](../../dataset/tinyDG.txt) e [`tinyDAG.txt`](../../dataset/tinyDAG.txt).
- **Produto/evidência:** critério estrutural; execução na instância pequena.

#### Semana 9 — Grafos eulerianos e hamiltonianos no T2 — 28/09–01/10

- **Datas:** teórica em 28/09 (seg.); prática em 30/09 (qua.).
- **Aula teórica — grafos eulerianos, hamiltonianos e problemas clássicos:** caminhos e circuitos eulerianos; condições de existência por graus e conectividade; Fleury; Hierholzer; comparação de complexidade; grafos hamiltonianos; condições necessárias; reconhecimento de casos simples; caixeiro viajante e carteiro chinês: modelagem e delimitação da solução exata.
- **Aula prática — aplicação de propriedades no T2:** construção guiada com Fleury e Hierholzer; propriedade pertinente; execução manual; adaptação; testes; orientação do marco 3.
- **Acompanhamento 3 — Adaptação e testes (evidência pontuada):** implementação de referência; alterações justificadas; propriedade estrutural; execução manual; solução; testes positivo, negativo e limite; complexidade; validação oral e registro no repositório.
- **Projeto de ensino:** 02.02 — Grafos não dirigidos e dirigidos (grafos eulerianos e hamiltonianos; caixeiro viajante; carteiro chinês).
- **Recursos:**
  - **Estruturas de dados:** [`Queue.java`](../../algs4-java/algs4/Queue.java) e [`Stack.java`](../../algs4-java/algs4/Stack.java).
  - **Algoritmos:** [`Bridge.java`](../../algs4-java/algs4/Bridge.java), [`EulerianCycle.java`](../../algs4-java/algs4/EulerianCycle.java), [`EulerianPath.java`](../../algs4-java/algs4/EulerianPath.java), [`DirectedEulerianCycle.java`](../../algs4-java/algs4/DirectedEulerianCycle.java) e [`DirectedEulerianPath.java`](../../algs4-java/algs4/DirectedEulerianPath.java).
  - **Dados:** [`tobe.txt`](../../dataset/tobe.txt), [`tinyG.txt`](../../dataset/tinyG.txt), [`mediumG.txt`](../../dataset/mediumG.txt), [`largeG.txt`](https://algs4.cs.princeton.edu/41graph/largeG.txt) e [`tinyDG.txt`](../../dataset/tinyDG.txt).
- **Produto/evidência:** propriedade aplicada; solução testada; complexidade.

#### Semana 10 — Coloração, emparelhamento e isomorfismo no T2 — 05–08/10

- **Datas:** teórica em 05/10 (seg.); prática em 07/10 (qua.).
- **Aula teórica — coloração, emparelhamento e isomorfismo:** coloração própria; 2-coloração por DFS/BFS; coloração gulosa; número cromático; delimitação do cálculo exato; emparelhamento; vértices livres; caminhos alternantes e aumentantes; emparelhamento máximo; isomorfismo; invariantes estruturais; codificação canônica de árvores por DFS em pós-ordem; delimitação do isomorfismo geral.
- **Aula prática — aplicação de relações estruturais no T2:** propriedade pertinente; modelagem; critério; instância pequena; execução manual; impacto na solução; adaptação ou justificativa de não aplicabilidade; conclusão e ensaio.
- **Acompanhamento 4 — Relação estrutural e conclusão (evidência pontuada):** propriedade; correspondência com o problema; critério; instância ou contraexemplo; impacto algorítmico; adaptação; testes; validação oral e registro no repositório.
- **Projeto de ensino:** 02.03 — Introdução aos problemas clássicos.
- **Recursos:**
  - **Estruturas de dados:** [`Queue.java`](../../algs4-java/algs4/Queue.java) e [`Stack.java`](../../algs4-java/algs4/Stack.java).
  - **Algoritmos:** [`Bipartite.java`](../../algs4-java/algs4/Bipartite.java), [`BipartiteX.java`](../../algs4-java/algs4/BipartiteX.java) e [`BipartiteMatching.java`](../../algs4-java/algs4/BipartiteMatching.java).
  - **Dados:** [`tobe.txt`](../../dataset/tobe.txt), [`tinyG.txt`](../../dataset/tinyG.txt), [`mediumG.txt`](../../dataset/mediumG.txt) e [`largeG.txt`](https://algs4.cs.princeton.edu/41graph/largeG.txt).
- **Produto/evidência:** relação estrutural analisada; solução testada; `Accepted`; complexidade; ensaio.

#### Semana 11 — Apresentação do T2 — 12–15/10

- **Datas:** **12/10 — Dia de Nossa Senhora Aparecida — feriado, sem aula**; apresentação em 14/10 (qua.).
- **Aula teórica — feriados:** sem encontro.
- **Aula prática — apresentação da AP2:** apresentações do T2; aproximadamente dez grupos; avaliação; devolutiva.
- **Projeto de ensino:** 02.01 — Algoritmos de busca (síntese); 02.02 — Grafos não dirigidos e dirigidos (síntese); 02.03 — Introdução aos problemas clássicos (síntese).
- **Recursos:**
  - **Apresentação e avaliação:** repositórios; apresentações; rubrica da AP2.
- **Produto/evidência:** apresentação; avaliação da AP2; repositório congelado.

### Unidade III — Otimizar grafos ponderados (38h)

#### Semana 12 — MST, formulação do T3 e revisão da AT2 — 19–22/10

- **Datas:** teórica em 19/10 (seg.); prática em 21/10 (qua.).
- **Aula teórica — árvores geradoras mínimas:** propriedade do corte; Kruskal; Prim; Union-Find; correção; complexidade; execução guiada.
- **Aula prática — formulação de MST e revisão da AT2:** 40 minutos para objetivo, entrada, saída, restrições, vértices, arestas, pesos e instância pequena do problema de MST; 60 minutos para revisão de buscas, conectividade, percursos, problemas clássicos, correção e complexidade.
- **Acompanhamento — Formulação e modelagem de MST (evidência pontuada):** problema atribuído; objetivo; entrada; saída; restrições; modelo ponderado; instância pequena; validação oral e registro no repositório de MST.
- **Projeto de ensino:** 02.01 — Algoritmos de busca (revisão); 02.02 — Grafos não dirigidos e dirigidos (revisão); 02.03 — Introdução aos problemas clássicos (revisão); 03.01 — Problema da árvore de cobertura mínima.
- **Recursos:**
  - **Estruturas de dados:** [`Bag.java`](../../algs4-java/algs4/Bag.java) e [`Stack.java`](../../algs4-java/algs4/Stack.java).
  - **Estruturas e representações:** [`Edge.java`](../../algs4-java/algs4/Edge.java), [`DirectedEdge.java`](../../algs4-java/algs4/DirectedEdge.java), [`EdgeWeightedGraph.java`](../../algs4-java/algs4/EdgeWeightedGraph.java) e [`EdgeWeightedDigraph.java`](../../algs4-java/algs4/EdgeWeightedDigraph.java).
  - **Dados:** [`tobe.txt`](../../dataset/tobe.txt), [`tinyEWG.txt`](../../dataset/tinyEWG.txt), [`mediumEWG.txt`](../../dataset/mediumEWG.txt), [`largeEWG.txt`](https://algs4.cs.princeton.edu/43mst/largeEWG.txt), [`tinyEWD.txt`](../../dataset/tinyEWD.txt), [`mediumEWD.txt`](../../dataset/mediumEWD.txt) e [`largeEWD.txt`](https://algs4.cs.princeton.edu/44sp/largeEWD.txt).
- **Produto/evidência:** formulação e modelagem de MST; instância pequena; revisão da AT2.

#### Semana 13 — AT2 e apresentação de MST — 26–29/10

- **Datas:** AT2 em 26/10 (seg.); apresentação em 28/10 (qua.).
- **Aula teórica — AT2:** dez questões objetivas estilo ENADE; AVA/Moodle; conectividade; grafos dirigidos e não dirigidos; problemas clássicos; encontro integral; liberação posterior da nota e das justificativas.
- **Aula prática — apresentação e entrega de MST em 28/10:** encontro integral destinado às apresentações; envio do link do repositório de MST no AVA/Moodle até 23h59.
- **Avaliação da entrega de MST:** formulação; modelagem; algoritmo; complexidade; testes; `Accepted`; organização e reprodutibilidade do repositório; comunicação.
- **Projeto de ensino:** 02.01 — Algoritmos de busca (avaliação); 02.02 — Grafos não dirigidos e dirigidos (avaliação); 02.03 — Introdução aos problemas clássicos (avaliação); 03.01 — Problema da árvore de cobertura mínima (aplicação).
- **Recursos:**
  - **Estruturas de dados:** [`Bag`](../../algs4-py/algs4/bag.py), [`Bag.java`](../../algs4-java/algs4/Bag.java) e [`Stack.java`](../../algs4-java/algs4/Stack.java).
  - **Estruturas e representações:** [`Edge.java`](../../algs4-java/algs4/Edge.java), [`DirectedEdge.java`](../../algs4-java/algs4/DirectedEdge.java), [`EdgeWeightedGraph`](../../algs4-py/algs4/edge_weighted_graph.py), [`EdgeWeightedGraph.java`](../../algs4-java/algs4/EdgeWeightedGraph.java), [`EdgeWeightedDigraph`](../../algs4-py/algs4/edge_weighted_digraph.py) e [`EdgeWeightedDigraph.java`](../../algs4-java/algs4/EdgeWeightedDigraph.java).
  - **Dados:** [`tobe.txt`](../../dataset/tobe.txt), [`tinyEWG.txt`](../../dataset/tinyEWG.txt), [`mediumEWG.txt`](../../dataset/mediumEWG.txt), [`largeEWG.txt`](https://algs4.cs.princeton.edu/43mst/largeEWG.txt), [`tinyEWD.txt`](../../dataset/tinyEWD.txt), [`mediumEWD.txt`](../../dataset/mediumEWD.txt) e [`largeEWD.txt`](https://algs4.cs.princeton.edu/44sp/largeEWD.txt).
- **Produto/evidência:** registro da AT2; apresentação de MST; primeiro repositório entregue.

#### Semana 14 — Feriado, devolutiva de MST e preparação para caminhos mínimos — 02–05/11

- **Datas:** **02/11 — Dia de Finados — feriado, sem aula**; prática integrada em 04/11 (qua.).
- **Aula teórica — feriado:** sem encontro.
- **Aula prática — devolutiva de MST e preparação para caminhos mínimos:** análise dos resultados da primeira entrega; distinção entre custo de conexão global e custo de uma rota; preparação dos ambientes e repositórios da segunda entrega.
- **Projeto de ensino:** 03.01 — Problema da árvore de cobertura mínima (devolutiva); 03.02 — Problema do caminho mínimo (preparação).
- **Recursos:**
  - **Estruturas de dados:** `collections.deque`, [`MinPQ`](../../algs4-py/algs4/min_pq.py), [`MinPQ.java`](../../algs4-java/algs4/MinPQ.java), [`IndexMinPQ`](../../algs4-py/algs4/index_min_pq.py), [`IndexMinPQ.java`](../../algs4-java/algs4/IndexMinPQ.java), [`Queue.java`](../../algs4-java/algs4/Queue.java), [`UF`](../../algs4-py/algs4/uf.py) e [`UF.java`](../../algs4-java/algs4/UF.java).
  - **Algoritmos:** [`KruskalMST`](../../algs4-py/algs4/kruskal_mst.py), [`KruskalMST.java`](../../algs4-java/algs4/KruskalMST.java), [`PrimMST`](../../algs4-py/algs4/prim_mst.py), [`PrimMST.java`](../../algs4-java/algs4/PrimMST.java) e [`LazyPrimMST.java`](../../algs4-java/algs4/LazyPrimMST.java).
  - **Dados:** [`tobe.txt`](../../dataset/tobe.txt), [`tinyEWG.txt`](../../dataset/tinyEWG.txt), [`mediumEWG.txt`](../../dataset/mediumEWG.txt), [`largeEWG.txt`](https://algs4.cs.princeton.edu/43mst/largeEWG.txt), [`tinyUF.txt`](../../dataset/tinyUF.txt), [`mediumUF.txt`](../../dataset/mediumUF.txt), [`largeUF.txt`](https://algs4.cs.princeton.edu/15uf/largeUF.txt) e [`tinyPQ.txt`](../../dataset/tinyPQ.txt).
- **Produto/evidência:** devolutiva de MST; preparação do repositório de caminho mínimo.

#### Semana 15 — Dijkstra e formulação de caminhos mínimos — 09–12/11

- **Datas:** teórica em 09/11 (seg.); prática em 11/11 (qua.).
- **Aula teórica — caminhos mínimos com Dijkstra:** origem; destino; minimização da soma dos pesos; caminho e custo; relaxamento; Dijkstra; fila de prioridade indexada; pesos não negativos; correção; complexidade.
- **Aula prática — formulação e modelagem de caminho mínimo:** objetivo; origem e destino; entrada; saída; restrições; direção; pesos; instância pequena; entrada e saída esperada; escolha preliminar da representação.
- **Acompanhamento — Formulação e modelagem de caminho mínimo (evidência pontuada):** problema atribuído; modelo; instância pequena; condição de aplicabilidade; validação oral e registro no repositório de caminho mínimo.
- **Projeto de ensino:** 03.02 — Problema do caminho mínimo (Dijkstra e aplicação).
- **Recursos:**
  - **Estruturas de dados:** [`IndexMinPQ`](../../algs4-py/algs4/index_min_pq.py), [`IndexMinPQ.java`](../../algs4-java/algs4/IndexMinPQ.java) e [`Stack.java`](../../algs4-java/algs4/Stack.java).
  - **Algoritmos:** [`DijkstraSP`](../../algs4-py/algs4/dijkstra_sp.py), [`DijkstraSP.java`](../../algs4-java/algs4/DijkstraSP.java) e [`DijkstraUndirectedSP.java`](../../algs4-java/algs4/DijkstraUndirectedSP.java).
  - **Dados:** [`tobe.txt`](../../dataset/tobe.txt), [`tinyEWD.txt`](../../dataset/tinyEWD.txt), [`mediumEWD.txt`](../../dataset/mediumEWD.txt), [`largeEWD.txt`](https://algs4.cs.princeton.edu/44sp/largeEWD.txt), [`tinyEWG.txt`](../../dataset/tinyEWG.txt), [`mediumEWG.txt`](../../dataset/mediumEWG.txt) e [`largeEWG.txt`](https://algs4.cs.princeton.edu/43mst/largeEWG.txt).
- **Produto/evidência:** formulação e modelagem de caminho mínimo; instância pequena; representação validada.

#### Semana 16 — Aprofundamento e apresentação de caminhos mínimos — 16–19/11

- **Datas:** teórica em 16/11 (seg.); prática em 18/11 (qua.).
- **Aula teórica — Bellman–Ford e Floyd–Warshall:** pesos negativos; relaxamento repetido; detecção de ciclos negativos; caminhos mínimos entre todos os pares; atualização da matriz de distâncias; correção; complexidade; comparação com Dijkstra.
- **Aula prática — apresentação e entrega de caminho mínimo em 18/11:** encontro integral destinado às apresentações; envio do link do repositório de caminho mínimo no AVA/Moodle até 23h59.
- **Avaliação da entrega de caminho mínimo:** formulação; modelagem; algoritmo; complexidade; testes; `Accepted`; organização e reprodutibilidade do repositório; comunicação.
- **Projeto de ensino:** 03.02 — Problema do caminho mínimo (Bellman–Ford, Floyd–Warshall e aplicação).
- **Recursos:**
  - **Estruturas de dados:** `collections.deque`, [`IndexMinPQ.java`](../../algs4-java/algs4/IndexMinPQ.java), [`Queue.java`](../../algs4-java/algs4/Queue.java) e [`Stack.java`](../../algs4-java/algs4/Stack.java).
  - **Estruturas e representações:** [`EdgeWeightedDigraph`](../../algs4-py/algs4/edge_weighted_digraph.py), [`EdgeWeightedDigraph.java`](../../algs4-java/algs4/EdgeWeightedDigraph.java), [`DirectedEdge`](../../algs4-py/algs4/directed_edge.py), [`DirectedEdge.java`](../../algs4-java/algs4/DirectedEdge.java) e [`AdjMatrixEdgeWeightedDigraph.java`](../../algs4-java/algs4/AdjMatrixEdgeWeightedDigraph.java).
  - **Algoritmos:** [`BellmanFordSP`](../../algs4-py/algs4/bellman_ford_sp.py), [`BellmanFordSP.java`](../../algs4-java/algs4/BellmanFordSP.java), [`FloydWarshall.java`](../../algs4-java/algs4/FloydWarshall.java) e [`DijkstraAllPairsSP.java`](../../algs4-java/algs4/DijkstraAllPairsSP.java).
  - **Dados:** [`tinyEWDn.txt`](../../dataset/tinyEWDn.txt), [`tinyEWDnc.txt`](../../dataset/tinyEWDnc.txt) e [`tinyEWD.txt`](../../dataset/tinyEWD.txt).
- **Produto/evidência:** apresentação de caminho mínimo; segundo repositório entregue.

#### Semana 17 — Fluxo máximo e formulação da terceira entrega — 23–26/11

- **Datas:** teórica em 23/11 (seg.); prática em 25/11 (qua.).
- **Aula teórica — fluxo máximo em redes:** fonte; sorvedouro; capacidade; conservação; rede residual; caminhos aumentantes; gargalo; corte mínimo; Ford-Fulkerson; Edmonds-Karp; correção; complexidade.
- **Aula prática — formulação e modelagem de fluxo máximo:** objetivo; fonte; sorvedouro; capacidades; conservação; instância pequena; entrada e saída esperada; representação da rede.
- **Acompanhamento — Formulação e modelagem de fluxo máximo (evidência pontuada):** problema atribuído; modelo da rede; instância pequena; validação oral e registro no repositório de fluxo máximo.
- **Projeto de ensino:** 03.03 — Problema do fluxo máximo em redes.
- **Recursos:**
  - **Estruturas de dados:** [`Bag.java`](../../algs4-java/algs4/Bag.java) e [`Queue.java`](../../algs4-java/algs4/Queue.java).
  - **Estruturas e representações:** [`FlowEdge.java`](../../algs4-java/algs4/FlowEdge.java) e [`FlowNetwork.java`](../../algs4-java/algs4/FlowNetwork.java).
  - **Algoritmos:** [`FordFulkerson.java`](../../algs4-java/algs4/FordFulkerson.java).
  - **Dados:** [`tinyFN.txt`](../../dataset/tinyFN.txt).
- **Produto/evidência:** formulação e modelagem de fluxo máximo; instância pequena; rede validada.

#### Semana 18 — Revisão para a AT3 e apresentação de fluxo máximo — 30/11–02/12

- **Datas:** teórica em 30/11 (seg.); prática em 02/12 (qua.).
- **Aula teórica — revisão teórica para a AT3:** MST; propriedade do corte; Kruskal; Prim; caminhos mínimos; relaxamento; Dijkstra; Bellman-Ford; Floyd-Warshall; fluxo máximo; Ford-Fulkerson; aplicabilidade; correção; complexidade; dúvidas.
- **Aula prática — apresentação e entrega de fluxo máximo em 02/12:** encontro integral destinado às apresentações; envio do link do repositório de fluxo máximo no AVA/Moodle até 23h59.
- **Projeto de ensino:** 03.01 — Problema da árvore de cobertura mínima (síntese); 03.02 — Problema do caminho mínimo (síntese); 03.03 — Problema do fluxo máximo em redes (síntese).
- **Recursos:**
  - **Apresentação:** repositórios de fluxo máximo; resultados; evidências de submissão.
- **Produto/evidência:** apresentação de fluxo máximo; terceiro repositório entregue; AP3 concluída.

#### Semana 19 — AT3, devolutiva da AP3 e encerramento — 07–09/12

- **Datas:** AT3 em 07/12 (seg.); devolutiva e encerramento em 09/12 (qua.).
- **Aula teórica — AT3:** dez questões objetivas estilo ENADE; AVA/Moodle; MST; caminhos mínimos; fluxo máximo; encontro integral; liberação posterior da nota e das justificativas.
- **Aula prática — devolutiva da AP3 em 09/12:** devolutiva das três entregas; síntese comparativa; encerramento.
- **Projeto de ensino:** 03.01 — Problema da árvore de cobertura mínima (avaliação); 03.02 — Problema do caminho mínimo (avaliação); 03.03 — Problema do fluxo máximo em redes (avaliação).
- **Recursos:**
  - **Apresentação e avaliação:** repositórios; apresentações; rubrica comum.
- **Produto/evidência:** registro da AT3; devolutiva da AP3; encerramento.

## 5. Avaliações e entregas

### Regras gerais

- A AP será composta pelo acompanhamento processual e pelas apresentações previstas em T1, T2 ou T3. Na semana 1, o encontro de quarta-feira será teórico e não integrará a AP1. Os encontros práticos oferecidos de 12/08 em diante e anteriores à respectiva apresentação produzirão evidência verificável.
- Nenhum acompanhamento exigirá conceitos-base ainda não ensinados. Os problemas poderão exigir integração, transferência e descoberta de estratégias a partir desses conhecimentos.
- Cada apresentação ocupará um encontro prático integral. Para aproximadamente dez grupos, serão usados 10 minutos de abertura, dez ciclos de até 5 minutos de apresentação e 1 minuto de transição, 20 minutos de avaliação e devolutiva e 10 minutos de contingência. Os materiais deverão estar previamente carregados.
- Cada AT ocupará um encontro teórico integral e terá dez questões objetivas contextualizadas no estilo ENADE, aplicadas no AVA/Moodle. A nota e as justificativas serão liberadas somente após o encerramento.
- No T3, cada uma das três apresentações ocupará um encontro prático integral e encerrará a entrega da classe correspondente.

### AV1

- **AP1/T1:** acompanhamentos de 12/08 a 02/09; apresentação em 09/09.
- **AT1:** 14/09; encontro teórico integral; dez questões objetivas estilo ENADE no AVA/Moodle.
- **Composição:** AT 70% + AP 30%.
- **Conteúdo:** fundamentos, modelagem, medidas estruturais, tipos, representações, DFS, BFS, alcançabilidade e caminhos básicos.
- **Registro:** até 21/09.

### AV2

- **AP2/T2:** acompanhamentos em 16/09, 23/09, 30/09 e 07/10; apresentação em 14/10.
- **AT2:** 26/10; encontro teórico integral; dez questões objetivas estilo ENADE no AVA/Moodle.
- **Composição:** AT 70% + AP 30%.
- **Conteúdo:** grafos dirigidos e não dirigidos, conectividade e problemas clássicos.
- **Registro:** até 10/11.

### AV3

- **AP3/T3:** formulações em 21/10, 11/11 e 25/11; apresentações e entregas em 28/10, 18/11 e 02/12; devolutiva em 09/12.
- **AT3:** 07/12; encontro teórico integral; dez questões objetivas estilo ENADE no AVA/Moodle.
- **Composição:** AT 70% + AP 30%.
- **Conteúdo:** árvore geradora mínima, caminhos mínimos e fluxo máximo.
- **Janela institucional:** 03 a 09/12; registro até 11/12.

### Janelas institucionais de segunda chamada

- **AV1:** 22 a 28/09; lançamento da nota até 30/09.
- **AV2:** 11 a 17/11; lançamento da nota até 19/11.
- **AV3:** 03 a 09/12, incluindo aplicação, segunda chamada e feedback.

As janelas de segunda chamada não substituem automaticamente encontros regulares; local, horário e estudantes convocados seguirão a orientação institucional.

## 6. Uso dos trabalhos

### T1 — DFS/BFS

**Enunciado:** [T1 — Modelagem, representação e DFS/BFS](../trabalhos/T1.md).

**Função:** AP1 transversal com aproximadamente dez problemas distintos, desenvolvidos por quatro marcos comuns de modelagem, representação computacional e aplicação básica de DFS/BFS.

### T2 — conectividade e problemas clássicos

**Enunciado:** [T2 — Conectividade e propriedades estruturais](../trabalhos/T2.md).

**Função:** AP2 processual com dez problemas distribuídos entre três grupos: buscas e conectividade, percursos e estruturas de ordem e relações estruturais.

### T3 — otimização

**Enunciado:** [T3 — Otimização em grafos](../trabalhos/T3.md).

**Função:** AP3 processual composta por três problemas por grupo, três repositórios independentes e três apresentações integrais: MST, caminhos mínimos e fluxo máximo.

Os demais trabalhos da Unidade II serão usados como materiais complementares e não constituirão entregas avaliativas adicionais.

## 7. Referências curriculares

- SEDGEWICK, Robert; WAYNE, Kevin. *Algorithms, 4th Edition*. Capítulo 4: grafos não dirigidos, dígrafos, MST e caminhos mínimos. Disponível em: <https://algs4.cs.princeton.edu/home/>.
- MIT OpenCourseWare. *6.006 Introduction to Algorithms*. Progressão de BFS/DFS para caminhos mínimos. Disponível em: <https://ocw.mit.edu/courses/6-006-introduction-to-algorithms-fall-2011/pages/calendar>.
- Stanford University. *CS161 — Design and Analysis of Algorithms*. Progressão de buscas e SCC para caminhos mínimos, MST e fluxo máximo. Disponível em: <https://web.stanford.edu/class/archive/cs/cs161/cs161.1182/schedule.html>.
- Bibliografia completa: [Projeto de ensino da T290](proj_ensino_2026.md#6-bibliografia).
