# Cronograma discente — T290 — turmas 16/17 e 30/31 — 2026.2

> Versão para as turmas de terça-feira e quinta-feira, derivada do cronograma docente.

## 1. Identificação

- **Disciplina:** T290 — Resolução de Problemas com Grafos.
- **Carga horária institucional:** 72 horas.
- **Período letivo:** 03/08/2026 a 09/12/2026.
- **Projeto de ensino:** [proj_ensino_2026.md](proj_ensino_2026.md).
- **Implementações Java:** [implementacoes_algs4_java.md](implementacoes_algs4_java.md).
- **Calendário acadêmico:** [calendario_2026_2.md](calendario_2026_2.md).
- **Turmas e horários:** [turmas_2026_2.md](turmas_2026_2.md).

## 2. Organização das turmas

### Turma 16/17

- **Aula teórica:** Turma 16 — terça-feira, 19h às 20h40, sala D26.
- **Aula prática:** Turma 17 — quinta-feira, 19h às 20h40, sala D22.

### Turma 30/31

- **Aula teórica:** Turma 30 — terça-feira, 21h às 22h40, sala C29.
- **Aula prática:** Turma 31 — quinta-feira, 21h às 22h40, sala C29.

### Aula teórica

**Objetivo:** construir conceitos, modelar problemas, analisar correção e complexidade, comparar códigos em Python e Java e realizar as ATs.

### Aula prática

**Objetivo:** desenvolver os trabalhos T1–T3 por meio de práticas computacionais e acompanhamentos que atestem os conhecimentos ensinados, além de realizar as apresentações das APs.

## 3. Critérios de planejamento

- O cronograma será alinhado por semana acadêmica para as turmas de terça/quinta.
- As cargas de 12, 22 e 38 horas das unidades são referências institucionais; o planejamento usa os encontros efetivamente oferecidos pelo calendário.
- Não haverá reposição, compensação de carga horária nem criação de encontros externos.
- Cada feriado que afete um encontro será registrado por data e denominação oficial como “feriado — sem aula”.
- Os datasets grandes não integram o repositório e devem ser obtidos conforme as [instruções de download](../../dataset/README.md).
- Quando o encontro teórico for cancelado por feriado, a prática poderá assumir formato integrado, com aproximadamente 40 minutos de síntese de um conceito central e 60 minutos de acompanhamento reduzido. Isso não constitui reposição e não poderá concentrar conteúdo complexo.
- Python e Java serão alternativas equivalentes. A lógica algorítmica será ensinada uma vez, com comparação pontual das APIs e convenções. A adaptação somente será exigida quando a implementação de referência estiver disponível na linguagem escolhida.
- Os algoritmos serão apresentados por construção guiada e disponibilizados como implementações de referência. Os grupos deverão compreender, rastrear, integrar e adaptar essas implementações ao problema atribuído, justificando as alterações; não será exigida implementação integral a partir do zero.
- A AP será composta pelo acompanhamento processual e pela apresentação de T1, T2 ou T3. Na semana 1, o encontro de quinta-feira será teórico e não integrará a AP1. Os encontros práticos oferecidos de 13/08 em diante e anteriores à apresentação produzirão evidência verificável.
- Nenhum acompanhamento exigirá conceitos-base ainda não ensinados. Os problemas poderão exigir integração, transferência e descoberta de estratégias a partir desses conhecimentos. Cada acompanhamento produzirá evidência verificável de modelagem, execução manual, representação, adaptação, integração, teste, análise de complexidade ou diagnóstico.
- Cada apresentação ocupará um encontro prático integral. Para aproximadamente dez grupos, serão usados 10 minutos de abertura, dez ciclos de até 5 minutos de apresentação e 1 minuto de transição, 20 minutos de avaliação e devolutiva e 10 minutos de contingência. Os materiais deverão estar previamente carregados.
- Cada AT ocupará um encontro teórico integral e terá dez questões objetivas contextualizadas no estilo ENADE, aplicadas no AVA/Moodle. A nota e as justificativas serão liberadas somente após o encerramento.
- Cada apresentação antecederá a AT.

## 4. Cronograma por unidade

### Unidade I — Modelar e representar problemas com grafos (12h)

#### Semana 1 — Apresentação da disciplina e fundamentos de grafos — 03–06/08

- **Datas:** aula teórica em 04/08 (ter.); aula prática, excepcionalmente em formato teórico, em 06/08 (qui.).
- **Aula teórica — apresentação e motivação:** disciplina; objetivos; metodologia; avaliações; Pontes de Königsberg; rotas; redes; alocação; identificação de entidades e relações; modelagem inicial de problemas como grafos.
- **Aula prática — conceitos iniciais:** grafo `G = (V, E)`; vértice; aresta; ordem; tamanho; densidade em grafos simples não orientados; grau; adjacência; incidência; ponte; subgrafo; ciclo.
- **Projeto de ensino:** 01.01 — Teoria dos grafos; 01.02 — Tipos de grafos (parcial: subgrafo e ciclo).
- **Recursos:**
  - **Material didático:** [A1 — Conceitos iniciais](../aulas/A1_Conceitos_Iniciais.pdf).
- **Produto formativo:** exercícios conceituais; modelagens; cálculos estruturais.

#### Semana 2 — Tipos de grafos e modelagem do T1 — 10–13/08

- **Datas:** teórica em 11/08 (ter.); prática em 13/08 (qui.).
- **Aula teórica — tipos e propriedades de grafos:** grafos rotulados; grafos simples; multigrafos; grafos não orientados; dígrafos; dígrafos acíclicos (DAGs); grafos ponderados; grafos regulares; grafos completos; grafos bipartidos; grafos planares; grafos conexos; orientação; laços; arestas paralelas; pesos; rótulos; partições.
- **Aula prática — modelagem inicial do T1:** lançamento; atribuição dos problemas; preparação do ambiente Python/Java; orientação do marco 1.
- **Acompanhamento 1 — Modelagem (1,0 ponto):** entrada; saída; restrições; vértices; arestas; tipo do grafo; instância pequena; resultado esperado; hipótese inicial justificada; validação oral e registro no repositório.
- **Projeto de ensino:** 01.01 — Teoria dos grafos (aplicação); 01.02 — Tipos de grafos.
- **Recursos:**
  - **Material didático:** [A2 — Tipos e representação computacional](../aulas/A2_Tipos_Representação_Computacional_.pdf).
  - **Dados:** [`tinyG.txt`](../../dataset/tinyG.txt), [`tinyDG.txt`](../../dataset/tinyDG.txt) e [`cavalo_3x3.txt`](../../dataset/cavalo_3x3.txt).
- **Produto/evidência:** ficha de modelagem; classificação justificada; instância pequena.

#### Semana 3 — Representações computacionais no T1 — 17–20/08

- **Datas:** teórica em 18/08 (ter.); prática em 20/08 (qui.).
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

- **Datas:** teórica em 25/08 (ter.); prática em 27/08 (qui.).
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

- **Datas:** teórica em 01/09 (ter.); prática em 03/09 (qui.).
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

#### Semana 6 — Revisão teórica para a AT1 e apresentação do T1 — 07–10/09

- **Datas:** teórica em 08/09 (ter.); apresentação em 10/09 (qui.).
- **Aula teórica — revisão teórica para a AT1:** fundamentos, modelagem e medidas estruturais; tipos e propriedades de grafos; representações computacionais; DFS e BFS; alcançabilidade e caminhos básicos; correção e complexidade; dúvidas.
- **Aula prática — apresentação da AP1:** apresentações do T1; aproximadamente dez grupos; avaliação; devolutiva.
- **Projeto de ensino:** 01.01 — Teoria dos grafos (revisão); 01.02 — Tipos de grafos (revisão); 01.03 — Representação computacional (revisão); 02.01 — Algoritmos de busca (revisão).
- **Recursos:**
  - **Apresentação e avaliação:** [template institucional](../../trabalhos/template/template_UNIFOR.pptx); repositórios; apresentações; rubrica da AP1.
- **Produto/evidência:** apresentação; avaliação da AP1; repositório congelado; devolutiva.

#### Semana 7 — AT1 e modelagem inicial do T2 — 14–17/09

- **Datas:** AT1 em 15/09 (ter.); prática em 17/09 (qui.).
- **Aula teórica — AT1:** dez questões objetivas estilo ENADE; AVA/Moodle; fundamentos; tipos; representações; DFS; BFS; encontro integral; liberação posterior da nota e das justificativas.
- **Aula prática — modelagem inicial do T2:** bancos temáticos; atribuição do problema; orientação do marco 1.
- **Acompanhamento 1 — Problema e conhecimento prévio (evidência pontuada):** entrada; saída; restrições; vértices; arestas; tipo do grafo; participação de DFS/BFS; instância pequena; validação oral e registro no repositório.
- **Projeto de ensino:** 01.01 — Teoria dos grafos (avaliação); 01.02 — Tipos de grafos (avaliação); 01.03 — Representação computacional (avaliação); 02.01 — Algoritmos de busca (avaliação e aplicação).
- **Recursos:**
  - **Algoritmos:** DFS e BFS.
  - **Dados:** datasets da Unidade II.
- **Produto/evidência:** registro da AT1; ficha inicial do T2; instância pequena.

#### Semana 8 — Formalização de percursos e conectividade no T2 — 21–24/09

- **Datas:** teórica em 22/09 (ter.); prática em 24/09 (qui.).
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

- **Datas:** teórica em 29/09 (ter.); prática em 01/10 (qui.).
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

- **Datas:** teórica em 06/10 (ter.); prática em 08/10 (qui.).
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

- **Datas:** **13/10 — antecipação do Dia do Professor — feriado estudantil, sem aula**; apresentação em 15/10 (qui.).
- **Aula teórica — feriados:** sem encontro.
- **Aula prática — apresentação da AP2:** apresentações do T2; aproximadamente dez grupos; avaliação; devolutiva.
- **Projeto de ensino:** 02.01 — Algoritmos de busca (síntese); 02.02 — Grafos não dirigidos e dirigidos (síntese); 02.03 — Introdução aos problemas clássicos (síntese).
- **Recursos:**
  - **Apresentação e avaliação:** repositórios; apresentações; rubrica da AP2.
- **Produto/evidência:** apresentação; avaliação da AP2; repositório congelado.

### Unidade III — Otimizar grafos ponderados (38h)

#### Semana 12 — Revisão teórica para a AT2 e início do T3 — 19–22/10

- **Datas:** teórica em 20/10 (ter.); prática em 22/10 (qui.).
- **Aula teórica — revisão teórica para a AT2:** buscas; percursos; conectividade; componentes; cortes; grafos eulerianos e hamiltonianos; problemas clássicos; coloração; emparelhamento; isomorfismo; correção; complexidade; dúvidas.
- **Aula prática — formulação e representação preliminar do T3:** classes de otimização; seleção e atribuição dos problemas; objetivo; entrada; saída; restrições; vértices; arestas; direção; pesos ou capacidades; classe preliminar de otimização; orientação do marco 1.
- **Acompanhamento 1 — Formulação e representação preliminar (evidência pontuada):** problema atribuído; objetivo; entrada; saída; restrições; modelo do grafo; pesos ou capacidades; classe preliminar; instância pequena; validação oral e registro no repositório.
- **Projeto de ensino:** 02.01 — Algoritmos de busca (revisão); 02.02 — Grafos não dirigidos e dirigidos (revisão); 02.03 — Introdução aos problemas clássicos (revisão); 03.01 — Problema da árvore de cobertura mínima (modelagem preliminar); 03.02 — Problema do caminho mínimo (modelagem preliminar); 03.03 — Problema do fluxo máximo em redes (modelagem preliminar).
- **Recursos:**
  - **Estruturas de dados:** [`Bag.java`](../../algs4-java/algs4/Bag.java) e [`Stack.java`](../../algs4-java/algs4/Stack.java).
  - **Estruturas e representações:** [`Edge.java`](../../algs4-java/algs4/Edge.java), [`DirectedEdge.java`](../../algs4-java/algs4/DirectedEdge.java), [`EdgeWeightedGraph.java`](../../algs4-java/algs4/EdgeWeightedGraph.java) e [`EdgeWeightedDigraph.java`](../../algs4-java/algs4/EdgeWeightedDigraph.java).
  - **Dados:** [`tobe.txt`](../../dataset/tobe.txt), [`tinyEWG.txt`](../../dataset/tinyEWG.txt), [`mediumEWG.txt`](../../dataset/mediumEWG.txt), [`largeEWG.txt`](https://algs4.cs.princeton.edu/43mst/largeEWG.txt), [`tinyEWD.txt`](../../dataset/tinyEWD.txt), [`mediumEWD.txt`](../../dataset/mediumEWD.txt) e [`largeEWD.txt`](https://algs4.cs.princeton.edu/44sp/largeEWD.txt).
- **Produto/evidência:** revisão da Unidade II; problema atribuído; formulação; representação preliminar; instância pequena.

#### Semana 13 — AT2 e introdução a MST no T3 — 26–29/10

- **Datas:** AT2 em 27/10 (ter.); prática integrada em 29/10 (qui.).
- **Aula teórica — AT2:** dez questões objetivas estilo ENADE; AVA/Moodle; conectividade; grafos dirigidos e não dirigidos; problemas clássicos; encontro integral; liberação posterior da nota e das justificativas.
- **Aula prática — introdução a MST e representação do T3:** 40 minutos: conexão global de custo mínimo; árvore geradora; peso total; distinção entre MST e caminhos mínimos; 60 minutos: representação computacional; instância pequena; entrada e saída esperada; orientação do marco 2.
- **Acompanhamento 2 — Representação e validação (evidência pontuada):** representação computacional; instância pequena; entrada e saída esperada; classe de otimização; validação oral e registro no repositório.
- **Projeto de ensino:** 02.01 — Algoritmos de busca (avaliação); 02.02 — Grafos não dirigidos e dirigidos (avaliação); 02.03 — Introdução aos problemas clássicos (avaliação); 03.01 — Problema da árvore de cobertura mínima (introdução); 03.02 — Problema do caminho mínimo (representação preliminar); 03.03 — Problema do fluxo máximo em redes (representação preliminar).
- **Recursos:**
  - **Estruturas de dados:** [`Bag`](../../algs4-py/algs4/bag.py), [`Bag.java`](../../algs4-java/algs4/Bag.java) e [`Stack.java`](../../algs4-java/algs4/Stack.java).
  - **Estruturas e representações:** [`Edge.java`](../../algs4-java/algs4/Edge.java), [`DirectedEdge.java`](../../algs4-java/algs4/DirectedEdge.java), [`EdgeWeightedGraph`](../../algs4-py/algs4/edge_weighted_graph.py), [`EdgeWeightedGraph.java`](../../algs4-java/algs4/EdgeWeightedGraph.java), [`EdgeWeightedDigraph`](../../algs4-py/algs4/edge_weighted_digraph.py) e [`EdgeWeightedDigraph.java`](../../algs4-java/algs4/EdgeWeightedDigraph.java).
  - **Dados:** [`tobe.txt`](../../dataset/tobe.txt), [`tinyEWG.txt`](../../dataset/tinyEWG.txt), [`mediumEWG.txt`](../../dataset/mediumEWG.txt), [`largeEWG.txt`](https://algs4.cs.princeton.edu/43mst/largeEWG.txt), [`tinyEWD.txt`](../../dataset/tinyEWD.txt), [`mediumEWD.txt`](../../dataset/mediumEWD.txt) e [`largeEWD.txt`](https://algs4.cs.princeton.edu/44sp/largeEWD.txt).
- **Produto/evidência:** registro da AT2; representação computacional validada; classe de otimização reconhecida.

#### Semana 14 — Árvores geradoras mínimas e desenvolvimento do T3 — 02–05/11

- **Datas:** teórica em 03/11 (ter.); prática em 05/11 (qui.).
- **Aula teórica — árvores geradoras mínimas:** 60 minutos: propriedade do corte; Kruskal; Prim; Union-Find; correção; complexidade; 40 minutos: execução guiada.
- **Aula prática — aplicação de MST no T3:** execução manual; escolha algorítmica; adaptação parcial; testes; diagnóstico.
- **Acompanhamento 3 — Escolha do algoritmo de MST (evidência pontuada):** algoritmo; aplicabilidade; propriedade central; execução manual; complexidade; validação oral e registro no repositório.
- **Projeto de ensino:** 03.01 — Problema da árvore de cobertura mínima.
- **Recursos:**
  - **Estruturas de dados:** `collections.deque`, [`MinPQ`](../../algs4-py/algs4/min_pq.py), [`MinPQ.java`](../../algs4-java/algs4/MinPQ.java), [`IndexMinPQ`](../../algs4-py/algs4/index_min_pq.py), [`IndexMinPQ.java`](../../algs4-java/algs4/IndexMinPQ.java), [`Queue.java`](../../algs4-java/algs4/Queue.java), [`UF`](../../algs4-py/algs4/uf.py) e [`UF.java`](../../algs4-java/algs4/UF.java).
  - **Algoritmos:** [`KruskalMST`](../../algs4-py/algs4/kruskal_mst.py), [`KruskalMST.java`](../../algs4-java/algs4/KruskalMST.java), [`PrimMST`](../../algs4-py/algs4/prim_mst.py), [`PrimMST.java`](../../algs4-java/algs4/PrimMST.java) e [`LazyPrimMST.java`](../../algs4-java/algs4/LazyPrimMST.java).
  - **Dados:** [`tobe.txt`](../../dataset/tobe.txt), [`tinyEWG.txt`](../../dataset/tinyEWG.txt), [`mediumEWG.txt`](../../dataset/mediumEWG.txt), [`largeEWG.txt`](https://algs4.cs.princeton.edu/43mst/largeEWG.txt), [`tinyUF.txt`](../../dataset/tinyUF.txt), [`mediumUF.txt`](../../dataset/mediumUF.txt), [`largeUF.txt`](https://algs4.cs.princeton.edu/15uf/largeUF.txt) e [`tinyPQ.txt`](../../dataset/tinyPQ.txt).
- **Produto/evidência:** escolha algorítmica; execução manual; árvore e custo validados; adaptação parcial.

#### Semana 15 — Dijkstra e caminhos mínimos no T3 — 09–12/11

- **Datas:** teórica em 10/11 (ter.); prática em 12/11 (qui.).
- **Aula teórica — caminhos mínimos com Dijkstra:** origem; destino; minimização da soma dos pesos; caminho e custo; relaxamento; Dijkstra; fila de prioridade indexada; pesos não negativos; correção; complexidade.
- **Aula prática — Dijkstra e conclusão de MST no T3:** relaxações; rastreamento; adaptação de MST; orientação dos marcos 3 e 4 de caminhos mínimos; comparação de objetivos com fluxo máximo.
- **Acompanhamento 4 — Adaptação e integração de MST (evidência pontuada):** implementação de referência; alterações justificadas; dependências; execução reproduzível; testes; validação oral e registro no repositório.
- **Acompanhamento 3 — Escolha do algoritmo de caminhos mínimos (evidência pontuada):** algoritmo; aplicabilidade; relaxamento; complexidade; validação oral e registro no repositório.
- **Acompanhamento 4 — Adaptação e integração de caminhos mínimos (evidência pontuada):** implementação de referência; alterações justificadas; dependências; execução reproduzível; validação oral e registro no repositório.
- **Projeto de ensino:** 03.01 — Problema da árvore de cobertura mínima (aplicação); 03.02 — Problema do caminho mínimo (Dijkstra).
- **Recursos:**
  - **Estruturas de dados:** [`IndexMinPQ`](../../algs4-py/algs4/index_min_pq.py), [`IndexMinPQ.java`](../../algs4-java/algs4/IndexMinPQ.java) e [`Stack.java`](../../algs4-java/algs4/Stack.java).
  - **Algoritmos:** [`DijkstraSP`](../../algs4-py/algs4/dijkstra_sp.py), [`DijkstraSP.java`](../../algs4-java/algs4/DijkstraSP.java) e [`DijkstraUndirectedSP.java`](../../algs4-java/algs4/DijkstraUndirectedSP.java).
  - **Dados:** [`tobe.txt`](../../dataset/tobe.txt), [`tinyEWD.txt`](../../dataset/tinyEWD.txt), [`mediumEWD.txt`](../../dataset/mediumEWD.txt), [`largeEWD.txt`](https://algs4.cs.princeton.edu/44sp/largeEWD.txt), [`tinyEWG.txt`](../../dataset/tinyEWG.txt), [`mediumEWG.txt`](../../dataset/mediumEWG.txt) e [`largeEWG.txt`](https://algs4.cs.princeton.edu/43mst/largeEWG.txt).
- **Produto/evidência:** MST: adaptação e testes; caminhos mínimos: escolha algorítmica, relaxamentos, adaptação parcial e condição de aplicabilidade; fluxo máximo: comparação de objetivos.

#### Semana 16 — Fluxo máximo e redes no T3 — 16–19/11

- **Datas:** teórica em 17/11 (ter.); prática em 19/11 (qui.).
- **Aula teórica — fluxo máximo em redes:** fonte; sorvedouro; capacidade; conservação; maximização do fluxo; capacidade residual; arestas residuais diretas e reversas; caminhos aumentantes; gargalo; atualização do fluxo; corte mínimo; Ford-Fulkerson; Edmonds-Karp por BFS; correção; complexidade.
- **Aula prática — aplicação de fluxo máximo no T3:** construção da rede com `FlowEdge` e `FlowNetwork`; caminhos aumentantes; gargalos; atualização do fluxo; execução manual; orientação dos marcos 3 e 4 de fluxo máximo; comparação de objetivos com MST e caminhos mínimos.
- **Acompanhamento 3 — Escolha do algoritmo de fluxo máximo (evidência pontuada):** algoritmo; aplicabilidade; operação central; complexidade; validação oral e registro no repositório.
- **Acompanhamento 4 — Adaptação e integração de fluxo máximo (evidência pontuada):** implementação de referência; alterações justificadas; rede residual; execução reproduzível; validação oral e registro no repositório.
- **Projeto de ensino:** 03.03 — Problema do fluxo máximo em redes (Ford-Fulkerson).
- **Recursos:**
  - **Estruturas de dados:** [`Bag.java`](../../algs4-java/algs4/Bag.java) e [`Queue.java`](../../algs4-java/algs4/Queue.java).
  - **Estruturas e representações:** [`FlowEdge.java`](../../algs4-java/algs4/FlowEdge.java) e [`FlowNetwork.java`](../../algs4-java/algs4/FlowNetwork.java).
  - **Algoritmos:** [`FordFulkerson.java`](../../algs4-java/algs4/FordFulkerson.java).
  - **Dados:** [`tobe.txt`](../../dataset/tobe.txt) e [`tinyFN.txt`](../../dataset/tinyFN.txt).
- **Produto/evidência:** fluxo máximo: escolha algorítmica, caminhos aumentantes, gargalos, fluxo parcial e rede residual; MST e caminhos mínimos: comparação de objetivos; acompanhamento.

#### Semana 17 — Bellman–Ford, Floyd–Warshall e validação do T3 — 23–26/11

- **Datas:** teórica em 24/11 (ter.); prática em 26/11 (qui.).
- **Aula teórica — caminhos mínimos com Bellman–Ford e Floyd–Warshall:** 50 minutos: pesos negativos; relaxamento repetido; Bellman-Ford; detecção de ciclos negativos; 40 minutos: caminhos mínimos entre todos os pares; vértices intermediários; atualização da matriz de distâncias; Floyd-Warshall; ciclo negativo pela diagonal; 10 minutos: comparação com Dijkstra.
- **Aula prática — validação do T3:** testes; diagnóstico; orientação do marco 5.
- **Acompanhamento 5 — Testes e análise (evidência pontuada):** instância pequena; casos-limite; impossibilidade quando aplicável; diagnóstico; complexidade; validação oral e registro no repositório.
- **Acompanhamento 6 — Submissão e comunicação (evidência pontuada):** `Accepted`; `README.md`; evidência da submissão; organização do repositório; ensaio; validação oral e registro no repositório.
- **Projeto de ensino:** 03.02 — Problema do caminho mínimo (Bellman-Ford e Floyd-Warshall); 03.03 — Problema do fluxo máximo em redes (aplicação).
- **Recursos:**
  - **Estruturas de dados:** `collections.deque`, [`Bag`](../../algs4-py/algs4/bag.py), [`Bag.java`](../../algs4-java/algs4/Bag.java), [`IndexMinPQ.java`](../../algs4-java/algs4/IndexMinPQ.java), [`Queue.java`](../../algs4-java/algs4/Queue.java) e [`Stack.java`](../../algs4-java/algs4/Stack.java).
  - **Estruturas e representações:** [`EdgeWeightedDigraph`](../../algs4-py/algs4/edge_weighted_digraph.py), [`EdgeWeightedDigraph.java`](../../algs4-java/algs4/EdgeWeightedDigraph.java), [`DirectedEdge`](../../algs4-py/algs4/directed_edge.py), [`DirectedEdge.java`](../../algs4-java/algs4/DirectedEdge.java) e [`AdjMatrixEdgeWeightedDigraph.java`](../../algs4-java/algs4/AdjMatrixEdgeWeightedDigraph.java).
  - **Algoritmos:** [`BellmanFordSP`](../../algs4-py/algs4/bellman_ford_sp.py), [`BellmanFordSP.java`](../../algs4-java/algs4/BellmanFordSP.java), [`EdgeWeightedDirectedCycle.java`](../../algs4-java/algs4/EdgeWeightedDirectedCycle.java), [`FloydWarshall.java`](../../algs4-java/algs4/FloydWarshall.java) e [`DijkstraAllPairsSP.java`](../../algs4-java/algs4/DijkstraAllPairsSP.java).
  - **Dados:** [`tobe.txt`](../../dataset/tobe.txt), [`tinyEWDn.txt`](../../dataset/tinyEWDn.txt), [`tinyEWDnc.txt`](../../dataset/tinyEWDnc.txt), [`tinyEWD.txt`](../../dataset/tinyEWD.txt), [`mediumEWD.txt`](../../dataset/mediumEWD.txt) e [`largeEWD.txt`](https://algs4.cs.princeton.edu/44sp/largeEWD.txt).
- **Produto/evidência:** conjunto de testes; diagnóstico de divergências; comparação entre algoritmos; complexidade revisada.

#### Semana 18 — Revisão teórica para a AT3 e apresentação do T3 — 30/11–03/12

- **Datas:** teórica em 01/12 (ter.); prática em 03/12 (qui.).
- **Aula teórica — revisão teórica para a AT3:** MST; propriedade do corte; Kruskal; Prim; caminhos mínimos; relaxamento; Dijkstra; Bellman-Ford; Floyd-Warshall; fluxo máximo; Ford-Fulkerson; aplicabilidade; correção; complexidade; dúvidas.
- **Aula prática — apresentação da AP3 em 03/12:** apresentações; avaliação; devolutiva; encontro integral.
- **Projeto de ensino:** 03.01 — Problema da árvore de cobertura mínima (síntese); 03.02 — Problema do caminho mínimo (síntese); 03.03 — Problema do fluxo máximo em redes (síntese).
- **Recursos:**
  - **Apresentação:** repositórios e apresentações.
- **Produto/evidência:** síntese comparativa; repositórios congelados; avaliação da AP3.

#### Semana 19 — AT3 — 08/12

- **Datas:** AT3 em 08/12 (ter.); não há encontro de quinta-feira dentro do período letivo.
- **Aula teórica — AT3:** dez questões objetivas estilo ENADE; AVA/Moodle; MST; caminhos mínimos; fluxo máximo; encontro integral; liberação posterior da nota e das justificativas.
- **Projeto de ensino:** 03.01 — Problema da árvore de cobertura mínima (avaliação); 03.02 — Problema do caminho mínimo (avaliação); 03.03 — Problema do fluxo máximo em redes (avaliação).
- **Recursos:**
  - **Apresentação e avaliação:** repositórios; apresentações; rubrica comum.
- **Produto/evidência:** registro da AT3; encerramento.

## 5. Avaliações e entregas

### AV1

- **AP1/T1:** acompanhamentos de 13/08 a 03/09; apresentação em 10/09.
- **AT1:** 15/09; encontro teórico integral; dez questões objetivas estilo ENADE no AVA/Moodle.
- **Composição:** AT 70% + AP 30%.
- **Conteúdo:** fundamentos, modelagem, medidas estruturais, tipos, representações, DFS, BFS, alcançabilidade e caminhos básicos.
- **Registro:** até 21/09.

### AV2

- **AP2/T2:** acompanhamentos em 17/09, 24/09, 01/10 e 08/10; apresentação em 15/10.
- **AT2:** 27/10; encontro teórico integral; dez questões objetivas estilo ENADE no AVA/Moodle.
- **Composição:** AT 70% + AP 30%.
- **Conteúdo:** grafos dirigidos e não dirigidos, conectividade e problemas clássicos.
- **Registro:** até 10/11.

### AV3

- **AP3/T3:** acompanhamentos de 22/10 a 26/11; apresentação em 03/12.
- **AT3:** 08/12; encontro teórico integral; dez questões objetivas estilo ENADE no AVA/Moodle.
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

**Função:** AP1 transversal com aproximadamente dez problemas distintos, desenvolvidos por quatro marcos comuns de modelagem, representação computacional e aplicação básica de DFS/BFS.

### T2 — conectividade e problemas clássicos

**Função:** AP2 processual com dez problemas distribuídos entre três grupos: buscas e conectividade, percursos e estruturas de ordem e relações estruturais.

### T3 — otimização

**Função:** AP3 processual com três classes de otimização e dez opções por grupo: MST, caminhos mínimos e fluxo máximo; aproximadamente dez problemas serão selecionados por oferta.

Os demais trabalhos da Unidade II serão usados como materiais complementares e não constituirão entregas avaliativas adicionais.

## 7. Referências curriculares

- SEDGEWICK, Robert; WAYNE, Kevin. *Algorithms, 4th Edition*. Capítulo 4: grafos não dirigidos, dígrafos, MST e caminhos mínimos. Disponível em: <https://algs4.cs.princeton.edu/home/>.
- MIT OpenCourseWare. *6.006 Introduction to Algorithms*. Progressão de BFS/DFS para caminhos mínimos. Disponível em: <https://ocw.mit.edu/courses/6-006-introduction-to-algorithms-fall-2011/pages/calendar>.
- Stanford University. *CS161 — Design and Analysis of Algorithms*. Progressão de buscas e SCC para caminhos mínimos, MST e fluxo máximo. Disponível em: <https://web.stanford.edu/class/archive/cs/cs161/cs161.1182/schedule.html>.
- Bibliografia completa: [Projeto de ensino da T290](proj_ensino_2026.md#6-bibliografia).
