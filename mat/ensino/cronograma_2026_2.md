# Cronograma da disciplina T290 — 2026.2

## 1. Identificação

- **Disciplina:** T290 — Resolução de Problemas com Grafos.
- **Carga horária institucional:** 72 horas.
- **Período letivo:** 03/08/2026 a 09/12/2026.
- **Projeto de ensino:** [proj_ensino_2026.md](proj_ensino_2026.md).
- **Calendário acadêmico:** [calendario_2026_2.md](calendario_2026_2.md).
- **Turmas e horários:** [turmas_2026_2.md](turmas_2026_2.md).

## 2. Organização das turmas

### Par 09/19

- **Turma teórica:** Turma 09 — segunda-feira, 21h às 22h40, sala C27.
- **Turma prática:** Turma 19 — quarta-feira, 21h às 22h40, sala C27.

### Par 16/17

- **Turma teórica:** Turma 16 — terça-feira, 19h às 20h40, sala D26.
- **Turma prática:** Turma 17 — quinta-feira, 19h às 20h40, sala D22.

### Par 30/31

- **Turma teórica:** Turma 30 — terça-feira, 21h às 22h40, sala C29.
- **Turma prática:** Turma 31 — quinta-feira, 21h às 22h40, sala C29.

### Par 62/63

- **Turma teórica:** Turma 62 — segunda-feira, 17h20 às 19h, sala C34.
- **Turma prática:** Turma 63 — quarta-feira, 17h20 às 19h, sala T05.

### Turma teórica

**Objetivo:** construir conceitos, modelar problemas, analisar correção e complexidade, comparar códigos em Python e Java e realizar as ATs.

### Turma prática

**Objetivo:** desenvolver os trabalhos T1–T3 por meio de práticas computacionais e acompanhamentos que atestem os conhecimentos ensinados, além de realizar as apresentações das APs.

## 3. Critérios de planejamento

- O cronograma será alinhado por semana acadêmica, mantendo equivalência entre as turmas de segunda/quarta e terça/quinta.
- As cargas de 12, 22 e 38 horas das unidades são referências institucionais; o planejamento usa os encontros efetivamente oferecidos pelo calendário.
- Não haverá reposição, compensação de carga horária nem criação de encontros externos.
- Cada feriado que afete um encontro será registrado por data e denominação oficial como “feriado — sem aula”.
- Quando o encontro teórico for cancelado por feriado, a prática poderá assumir formato integrado, com aproximadamente 40 minutos de síntese de um conceito central e 60 minutos de acompanhamento reduzido. Isso não constitui reposição e não poderá concentrar conteúdo complexo.
- Python e Java serão alternativas equivalentes. A lógica algorítmica será ensinada uma vez, com comparação pontual das APIs e convenções.
- A AP será composta pelo acompanhamento processual e pela apresentação de T1, T2 ou T3. Todo encontro prático oferecido antes da apresentação será acompanhamento e produzirá evidência verificável.
- Cada acompanhamento deverá atestar conhecimento previamente ensinado por meio de modelagem, execução manual, representação, implementação parcial, teste, análise de complexidade ou diagnóstico.
- Cada apresentação ocupará um encontro prático integral. Para aproximadamente dez grupos, serão usados 10 minutos de abertura, dez ciclos de até 5 minutos de apresentação e 1 minuto de transição, 20 minutos de avaliação e devolutiva e 10 minutos de contingência. Os materiais deverão estar previamente carregados.
- Cada AT ocupará um encontro teórico integral e terá dez questões objetivas contextualizadas no estilo ENADE, aplicadas no AVA/Moodle. A nota e as justificativas serão liberadas somente após o encerramento.
- A apresentação antecederá a AT, exceto na AV3 das turmas de quarta-feira, cuja apresentação ocorrerá em 09/12 após a AT3 por causa da janela institucional de 03 a 09/12.

## 4. Cronograma por unidade

### Unidade I — Modelar e representar problemas com grafos

**Referência institucional:** 12 horas.

#### Semana 1 — 03–06/08

- **Datas:** teórica em 03/08 (seg.) e 04/08 (ter.); prática em 05/08 (qua.) e 06/08 (qui.).
- **Turma teórica:** apresentação da disciplina; problemas das Pontes de Königsberg, rotas e redes; transformação de entidades em vértices e relações em arestas; vértice, aresta, ordem, tamanho, densidade, grau, adjacência e incidência.
- **Turma prática — acompanhamento T1, marco 1 comum:** prática não computacional das Pontes de Königsberg; preparação do ambiente Python/Java; apresentação das três trilhas e atribuição dos problemas; interpretação de entrada, saída e restrições; primeira modelagem dos vértices e das arestas.
- **Recursos:** [T1 — DFS/BFS](../../trabalhos/und1/T1.md), [`Graph`](../../algs4-py/algs4/graph.py), [`Graph.java`](../../algs4-java/algs4/Graph.java), [`tinyG.txt`](../../dataset/tinyG.txt) e material para a prática das Pontes de Königsberg.
- **Produto/evidência:** ambiente validado, resumo do problema, modelo inicial e cálculos de ordem, tamanho, densidade e graus em uma instância pequena.

#### Semana 2 — 10–13/08

- **Datas:** teórica em 10/08 (seg.) e 11/08 (ter.); prática em 12/08 (qua.) e 13/08 (qui.).
- **Turma teórica:** ponte, subgrafo e ciclo; grafos rotulados, simples, multigrafos, não orientados, dígrafos e ponderados; grafos regulares, completos, bipartidos, planares e conexos; introdução às diferenças entre passeio, trilha e caminho. Para cada tipo, serão explicitadas as decisões de modelagem pertinentes: orientação para relações assimétricas, multiplicidade de arestas, pesos como atributos, associação entre rótulos e índices e partições em grafos bipartidos. Regularidade, completude, planaridade e conectividade serão tratadas como propriedades, não como estruturas de dados distintas.
- **Turma prática — acompanhamento T1, conclusão do marco 1:** implementação das APIs fundamentais de `Graph` e `Digraph` em Python ou Java, incluindo inserção de arestas, consulta de adjacência e cálculo de graus, ordem, tamanho e densidade; classificação justificada do grafo atribuído. A Trilha A enfatiza grafos simples e propriedades estruturais; a Trilha B, direção, graus de entrada e saída, fontes e sorvedouros; a Trilha C permanece em modelagem e representação.
- **Recursos:** [T1 — DFS/BFS](../../trabalhos/und1/T1.md), [`Graph`](../../algs4-py/algs4/graph.py), [`Graph.java`](../../algs4-java/algs4/Graph.java), [`Digraph`](../../algs4-py/algs4/digraph.py), [`Digraph.java`](../../algs4-java/algs4/Digraph.java), [`tinyG.txt`](../../dataset/tinyG.txt), [`tinyDG.txt`](../../dataset/tinyDG.txt) e [`cavalo_3x3.txt`](../../dataset/cavalo_3x3.txt).
- **Produto/evidência:** estruturas mínimas `Graph` e `Digraph` funcionando, classificação justificada e instância pequena documentada.

#### Semana 3 — 17–20/08

- **Datas:** teórica em 17/08 (seg.) e 18/08 (ter.); prática em 19/08 (qua.) e 20/08 (qui.).
- **Turma teórica:** representação computacional por matrizes de adjacência e incidência e por listas de adjacência e incidência; codificação de grafos simples, multigrafos, dígrafos, grafos rotulados e ponderados; comparação de custos de espaço e das operações de inserção, consulta e percurso.
- **Turma prática — acompanhamento T1, marco 2 comum:** conclusão de `Graph` e `Digraph`; leitura dos datasets; escolha e implementação da representação do problema; comparação entre matriz e lista; validação por instância pequena. As trilhas A e B explicitam como direção, multiplicidade, rótulos ou propriedades afetam a codificação; a Trilha C justifica lista de adjacência ou vizinhança implícita.
- **Recursos:** [T1 — DFS/BFS](../../trabalhos/und1/T1.md), [`Graph`](../../algs4-py/algs4/graph.py), [`Digraph`](../../algs4-py/algs4/digraph.py), [`SymbolGraph`](../../algs4-py/algs4/symbol_graph.py), [`routes.txt`](../../dataset/routes.txt), [`tinyG.txt`](../../dataset/tinyG.txt) e [`tinyDG.txt`](../../dataset/tinyDG.txt).
- **Produto/evidência:** representação documentada, entrada processada corretamente e escolha justificada em função de `V`, `E`, orientação, pesos, rótulos e restrições.

### Unidade II — Resolver problemas com grafos conexos

**Referência institucional:** 22 horas.

#### Semana 4 — 24–27/08

- **Datas:** teórica em 24/08 (seg.) e 25/08 (ter.); prática em 26/08 (qua.) e 27/08 (qui.).
- **Turma teórica:** busca em profundidade; árvore de busca, alcançabilidade, predecessores, caminhos, invariantes, correção e complexidade `O(V + E)`, aplicados às representações construídas na Unidade I.
- **Turma prática — acompanhamento T1, marco 3:** execução manual de DFS por todos os grupos; identificação de componentes ou alcançabilidade; classificação de uma sequência relevante como passeio, trilha, caminho ou ciclo; a Trilha C implementa a busca no problema, enquanto as trilhas A e B a implementam quando necessária ou justificam por que uma estratégia estrutural é suficiente.
- **Recursos:** [T1 — DFS/BFS](../../trabalhos/und1/T1.md), [`DepthFirstSearch`](../../algs4-py/algs4/depth_first_search.py) e [`DepthFirstPaths`](../../algs4-py/algs4/depth_first_paths.py).
- **Produto/evidência:** rastreamento manual, identificação do papel da DFS, implementação parcial e análise inicial de correção e complexidade.

#### Semana 5 — 31/08–03/09

- **Datas:** teórica em 31/08 (seg.) e 01/09 (ter.); prática em 02/09 (qua.) e 03/09 (qui.).
- **Turma teórica:** busca em largura; fronteiras, árvore BFS, níveis, predecessores, distância, reconstrução de caminhos e caminho mínimo em grafos sem pesos; comparação com DFS; correção e complexidade `O(V + E)`.
- **Turma prática — acompanhamento T1, marcos 4 e 5:** execução manual de BFS; decisão fundamentada entre estratégia estrutural, DFS ou BFS; distinção entre ordem de visita e caminho reconstruído; conclusão cumulativa da implementação e dos testes iniciados nos encontros anteriores; submissão, análise de complexidade e ensaio. O encontro não concentrará a construção integral da solução.
- **Recursos:** [T1 — DFS/BFS](../../trabalhos/und1/T1.md), [`BreadthFirstPaths`](../../algs4-py/algs4/breadth_first_paths.py), [`tinyG.txt`](../../dataset/tinyG.txt) e [`mediumG.txt`](../../dataset/mediumG.txt).
- **Produto/evidência:** solução testada, estratégia justificada, evidência do `Accepted`, análise de correção e complexidade e apresentação preparada.

#### Semana 6 — 07–10/09

- **Datas:** **07/09 — Dia da Independência do Brasil — feriado, sem aula**; teórica em 08/09 (ter.); apresentações em 09/09 (qua.) e 10/09 (qui.).
- **Turma teórica:** revisão formativa de modelagem, tipos de grafos, representações computacionais, DFS, BFS, alcançabilidade e caminhos, sem conteúdo novo e sem avaliação somativa.
- **Turma prática — apresentação da AP1:** encontro integral para apresentação do T1 pelos aproximadamente dez grupos, avaliação pelos critérios comuns e devolutiva.
- **Recursos:** repositórios, apresentações e rubrica do [T1](../../trabalhos/und1/T1.md).
- **Produto/evidência:** apresentação e avaliação da AP1, repositório congelado e devolutiva.

#### Semana 7 — 14–17/09

- **Datas:** AT1 em 14/09 (seg.) e 15/09 (ter.); prática em 16/09 (qua.) e 17/09 (qui.).
- **Turma teórica — AT1:** encontro integral com dez questões objetivas estilo ENADE no AVA/Moodle sobre fundamentos, tipos, representações, DFS e BFS; nota e justificativas após o encerramento.
- **Turma prática — acompanhamento T2, marco 1 comum:** apresentação das três trilhas; atribuição do problema; interpretação, modelagem e identificação de como DFS/BFS participa da solução, sem exigir a propriedade específica ainda não ensinada.
- **Recursos:** [T2 — conectividade e problemas clássicos](../../trabalhos/und2/T2/T2.md), algoritmos de DFS/BFS e datasets da Unidade II.
- **Produto/evidência:** registro da AT1 e ficha inicial do T2 com instância pequena.

#### Semana 8 — 21–24/09

- **Datas:** teórica em 21/09 (seg.) e 22/09 (ter.); prática em 23/09 (qua.) e 24/09 (qui.).
- **Turma teórica:** passeio, trilha, caminho, ciclo, circuito e tour; componentes conexas; pontes, vértices de articulação e critérios de conectividade.
- **Turma prática — acompanhamento T2, marco 2:** evidência comum de conectividade e execução manual de DFS/BFS. A Trilha A aplica componentes, pontes ou articulações; a Trilha B aplica ciclos ou condição euleriana quando já ensinada; a Trilha C permanece em bipartição e modelagem até o ensino dos demais conteúdos.
- **Recursos:** [T2 — conectividade e problemas clássicos](../../trabalhos/und2/T2/T2.md), [`CC`](../../algs4-py/algs4/cc.py) e [`Cycle`](../../algs4-py/algs4/cycle.py).
- **Produto/evidência:** critério estrutural explicado e executado na instância pequena.

#### Semana 9 — 28/09–01/10

- **Datas:** teórica em 28/09 (seg.) e 29/09 (ter.); prática em 30/09 (qua.) e 01/10 (qui.).
- **Turma teórica:** dígrafos, ciclos dirigidos, ordenação topológica e componentes fortemente conexas; panorama de Euler/Hamilton, carteiro chinês, caixeiro viajante, coloração, emparelhamento e isomorfismo. Os problemas do panorama serão tratados por reconhecimento e modelagem, sem exigir implementação integral de todos os algoritmos.
- **Turma prática — acompanhamento T2, marco 3 por trilha:** implementação do critério de conectividade, percurso/ordem ou relação estrutural; execução manual da propriedade específica após seu ensino; testes positivo, negativo e limite; `Accepted`, complexidade e ensaio.
- **Recursos:** [T2 — conectividade e problemas clássicos](../../trabalhos/und2/T2/T2.md), [`tinyDG.txt`](../../dataset/tinyDG.txt), [`Topological`](../../algs4-py/algs4/topological.py) e [`KosarajuSCC`](../../algs4-py/algs4/kosaraju_scc.py).
- **Produto/evidência:** solução testada, evidência do `Accepted`, análise de complexidade e apresentação preparada.

#### Semana 10 — 05–08/10

- **Datas:** teórica em 05/10 (seg.) e 06/10 (ter.); apresentações em 07/10 (qua.) e 08/10 (qui.).
- **Turma teórica:** síntese da Unidade II; comparação de propriedades e algoritmos; análise de correção, complexidade e casos especiais; preparação conceitual para AT2.
- **Turma prática — apresentação da AP2:** encontro integral para apresentação do T2 pelos aproximadamente dez grupos, avaliação pelos critérios comuns e devolutiva.
- **Recursos:** repositórios, apresentações e rubrica do [T2](../../trabalhos/und2/T2/T2.md).
- **Produto/evidência:** apresentação, avaliação da AP2 e repositório congelado.

### Unidade III — Otimizar grafos ponderados

**Referência institucional:** 38 horas.

#### Semana 11 — 12–15/10

- **Datas:** **12/10 — Dia de Nossa Senhora Aparecida — feriado, sem aula**; **13/10 — antecipação do Dia do Professor — feriado estudantil, sem aula**; prática integrada em 14/10 (qua.) e 15/10 (qui.).
- **Turma teórica:** não haverá encontro teórico.
- **Turma prática integrada — acompanhamento T3, marco 1 comum:** 40 minutos de síntese sobre grafos ponderados, objetivo e restrições; 60 minutos para apresentação dos três bancos, seleção de aproximadamente dez problemas, atribuição e modelagem inicial.
- **Recursos:** [T3 — otimização](../../trabalhos/und3/README.md), [`EdgeWeightedGraph`](../../algs4-py/algs4/edge_weighted_graph.py), [`EdgeWeightedDigraph`](../../algs4-py/algs4/edge_weighted_digraph.py), [`tinyEWG.txt`](../../dataset/tinyEWG.txt) e [`tinyEWD.txt`](../../dataset/tinyEWD.txt).
- **Produto/evidência:** formulação do objetivo, vértices, arestas, pesos ou capacidades e instância pequena.

#### Semana 12 — 19–22/10

- **Datas:** AT2 em 19/10 (seg.) e 20/10 (ter.); prática em 21/10 (qua.) e 22/10 (qui.).
- **Turma teórica — AT2:** encontro integral com dez questões objetivas estilo ENADE no AVA/Moodle sobre conectividade, grafos dirigidos/não dirigidos e problemas clássicos; nota e justificativas após o encerramento.
- **Turma prática — acompanhamento T3, marco 2 comum:** validação da entrada, saída, representação e instância manual; identificação preliminar da classe de otimização, sem exigir o algoritmo específico da trilha antes de seu ensino.
- **Recursos:** [T3 — otimização](../../trabalhos/und3/README.md), grafos ponderados e datasets da Unidade III.
- **Produto/evidência:** registro da AT2 e representação computacional validada no repositório.

#### Semana 13 — 26–29/10

- **Datas:** teórica em 26/10 (seg.) e 27/10 (ter.); prática em 28/10 (qua.) e 29/10 (qui.).
- **Turma teórica:** árvore geradora mínima; propriedade do corte; Kruskal, Prim e Union-Find; correção e complexidade.
- **Turma prática — acompanhamento T3, marco 3:** execução comparativa de Kruskal e Prim; a Trilha A aplica o algoritmo ao problema; as trilhas B e C registram a diferença entre seu objetivo e uma MST e continuam a representação.
- **Recursos:** [T3 — otimização](../../trabalhos/und3/README.md), [`KruskalMST`](../../algs4-py/algs4/kruskal_mst.py), [`PrimMST`](../../algs4-py/algs4/prim_mst.py), [`UF`](../../algs4-py/algs4/uf.py) e [banco MST](../../trabalhos/und3/T1/T1.md).
- **Produto/evidência:** decisão algorítmica justificada; para a trilha MST, árvore e custo validados.

#### Semana 14 — 02–05/11

- **Datas:** **02/11 — Dia de Finados — feriado, sem aula**; teórica em 03/11 (ter.); prática integrada em 04/11 (qua.) e 05/11 (qui.).
- **Turma teórica:** revisão formativa de grafos ponderados e MST, sem conteúdo novo.
- **Turma prática integrada — acompanhamento T3:** 40 minutos de síntese sobre propriedade do corte e Union-Find; 60 minutos para execução manual, implementação parcial e diagnóstico do projeto.
- **Recursos:** algoritmos de MST, [`tinyEWG.txt`](../../dataset/tinyEWG.txt) e [T3](../../trabalhos/und3/README.md).
- **Produto/evidência:** execução manual revisada, implementação parcial ou diagnóstico registrado.

#### Semana 15 — 09–12/11

- **Datas:** teórica em 09/11 (seg.) e 10/11 (ter.); prática em 11/11 (qua.) e 12/11 (qui.).
- **Turma teórica:** caminhos mínimos, relaxamento, Dijkstra, fila de prioridade indexada, restrição de pesos não negativos, correção e complexidade.
- **Turma prática — acompanhamento T3, marco 4:** rastreamento das relaxações; a Trilha B implementa a variação de caminhos mínimos; as trilhas A e C registram a diferença entre seus objetivos e caminho mínimo.
- **Recursos:** [T3 — otimização](../../trabalhos/und3/README.md), [`DijkstraSP`](../../algs4-py/algs4/dijkstra_sp.py), [`IndexMinPQ`](../../algs4-py/algs4/index_min_pq.py), [`tinyEWD.txt`](../../dataset/tinyEWD.txt) e [banco de caminhos mínimos](../../trabalhos/und3/T2/T2.md).
- **Produto/evidência:** relaxações rastreadas, implementação parcial e condição de aplicabilidade justificada.

#### Semana 16 — 16–19/11

- **Datas:** teórica em 16/11 (seg.) e 17/11 (ter.); prática em 18/11 (qua.) e 19/11 (qui.).
- **Turma teórica:** redes de fluxo; capacidade, conservação, grafo residual, caminhos aumentantes, corte mínimo e Ford-Fulkerson/Edmonds-Karp; correção e complexidade.
- **Turma prática — acompanhamento T3, marco 4:** execução manual de caminhos aumentantes e gargalos; a Trilha C implementa a rede residual; as trilhas A e B comparam objetivo, restrições e condições de aplicabilidade.
- **Recursos:** [T3 — otimização](../../trabalhos/und3/README.md), [`FlowNetwork.java`](../../algs4-java/algs4/FlowNetwork.java), [`FordFulkerson.java`](../../algs4-java/algs4/FordFulkerson.java), [`tinyFN.txt`](../../dataset/tinyFN.txt) e [banco de fluxo](../../trabalhos/und3/T3/T3.md).
- **Produto/evidência:** caminhos aumentantes, gargalos, fluxo parcial e implementação da rede residual.

#### Semana 17 — 23–26/11

- **Datas:** teórica em 23/11 (seg.) e 24/11 (ter.); prática em 25/11 (qua.) e 26/11 (qui.).
- **Turma teórica:** pesos negativos, relaxamento repetido, Bellman-Ford e detecção de ciclos negativos; comparação com Dijkstra.
- **Turma prática — acompanhamento T3, marco 5:** testes de correção e casos-limite; diagnóstico de pesos negativos quando aplicável; segundo acompanhamento da trilha de fluxo; revisão de complexidade.
- **Recursos:** [T3 — otimização](../../trabalhos/und3/README.md), [`BellmanFordSP`](../../algs4-py/algs4/bellman_ford_sp.py), [`tinyEWDn.txt`](../../dataset/tinyEWDn.txt) e [`tinyEWDnc.txt`](../../dataset/tinyEWDnc.txt).
- **Produto/evidência:** conjunto de testes, diagnóstico de divergências e análise revisada de complexidade.

#### Semana 18 — 30/11–03/12

- **Datas:** teórica em 30/11 (seg.) e 01/12 (ter.); prática em 02/12 (qua.) e 03/12 (qui.).
- **Turma teórica:** caminhos mínimos entre todos os pares; Floyd-Warshall; programação dinâmica; comparação com algoritmos de fonte única; síntese das classes de otimização.
- **Turma prática em 02/12 — acompanhamento T3, marco 6:** verificação final, `Accepted`, organização do repositório e ensaio das turmas de quarta-feira; a defesa avaliativa deverá respeitar o início da janela da AV3.
- **Turma prática em 03/12 — apresentação da AP3:** encontro integral para apresentação das turmas de quinta-feira, avaliação e devolutiva.
- **Recursos:** [T3 — otimização](../../trabalhos/und3/README.md), [`FloydWarshall.java`](../../algs4-java/algs4/FloydWarshall.java), repositórios e apresentações.
- **Produto/evidência:** matriz de distâncias e síntese comparativa; repositórios congelados; avaliação da AP3 das turmas de quinta-feira.

#### Semana 19 — 07–09/12

- **Datas:** AT3 em 07/12 (seg.) e 08/12 (ter.); apresentação em 09/12 (qua.); não há encontro de quinta-feira dentro do período letivo.
- **Turma teórica — AT3:** encontro integral com dez questões objetivas estilo ENADE no AVA/Moodle sobre MST, caminhos mínimos e fluxo máximo; nota e justificativas após o encerramento.
- **Turma prática em 09/12 — apresentação excepcional da AP3:** encontro integral para apresentação das turmas de quarta-feira, após a AT3 por imposição da janela institucional; avaliação, devolutiva e encerramento.
- **Recursos:** [T3 — otimização](../../trabalhos/und3/README.md), repositórios, apresentações e rubrica comum.
- **Produto/evidência:** registro da AT3, avaliação da AP3 das turmas de quarta-feira e encerramento.

## 5. Avaliações e entregas

### AV1

- **AP1/T1:** acompanhamentos de 05–06/08 a 02–03/09; apresentações em 09–10/09.
- **AT1:** 14–15/09; encontro teórico integral; dez questões objetivas estilo ENADE no AVA/Moodle.
- **Composição:** AT 20% + AP 80%.
- **Conteúdo:** fundamentos, tipos, representações, DFS, BFS, alcançabilidade e reconhecimento básico de passeio, trilha, caminho e ciclo.
- **Registro:** até 21/09.

### AV2

- **AP2/T2:** acompanhamentos em 16–17/09, 23–24/09 e 30/09–01/10; apresentações em 07–08/10.
- **AT2:** 19–20/10; encontro teórico integral; dez questões objetivas estilo ENADE no AVA/Moodle.
- **Composição:** AT 20% + AP 80%.
- **Conteúdo:** grafos dirigidos e não dirigidos, conectividade e problemas clássicos.
- **Registro:** até 10/11.

### AV3

- **AP3/T3:** acompanhamentos de 14–15/10 a 25–26/11; acompanhamento final das turmas de quarta-feira em 02/12; apresentações das turmas de quinta-feira em 03/12 e das turmas de quarta-feira em 09/12.
- **AT3:** 07–08/12; encontro teórico integral; dez questões objetivas estilo ENADE no AVA/Moodle.
- **Composição:** AT 20% + AP 80%.
- **Conteúdo:** árvore geradora mínima, caminhos mínimos e fluxo máximo.
- **Janela institucional:** 03 a 09/12; registro até 11/12.

### Janelas institucionais de segunda chamada

- **AV1:** 22 a 28/09; lançamento da nota até 30/09.
- **AV2:** 11 a 17/11; lançamento da nota até 19/11.
- **AV3:** 03 a 09/12, incluindo aplicação, segunda chamada e feedback.

As janelas de segunda chamada não substituem automaticamente encontros regulares; local, horário e estudantes convocados seguirão a orientação institucional.

## 6. Uso dos trabalhos

### [T1 — DFS/BFS](../../trabalhos/und1/T1.md)

**Função:** AP1 transversal com dez problemas distribuídos entre [grafos simples](../../trabalhos/und1/trilhas/trilha-a-grafos-simples.md), [dígrafos](../../trabalhos/und1/trilhas/trilha-b-digrafos.md) e [buscas simples](../../trabalhos/und1/trilhas/trilha-c-buscas.md).

### [T2 — conectividade e problemas clássicos](../../trabalhos/und2/T2/T2.md)

**Função:** AP2 processual com dez problemas distribuídos entre [buscas e conectividade](../../trabalhos/und2/T2/trilhas/trilha-a-conectividade.md), [percursos e estruturas de ordem](../../trabalhos/und2/T2/trilhas/trilha-b-percursos.md) e [relações estruturais](../../trabalhos/und2/T2/trilhas/trilha-c-relacoes-estruturais.md).

### [T3 — otimização](../../trabalhos/und3/README.md)

**Função:** AP3 processual com dez opções em cada banco de [MST](../../trabalhos/und3/T1/T1.md), [caminhos mínimos](../../trabalhos/und3/T2/T2.md) e [fluxo máximo](../../trabalhos/und3/T3/T3.md); aproximadamente dez problemas serão selecionados por oferta.

Os demais trabalhos da Unidade II serão usados como materiais complementares e não constituirão entregas avaliativas adicionais.

## 7. Referências curriculares

- SEDGEWICK, Robert; WAYNE, Kevin. *Algorithms, 4th Edition*. Capítulo 4: grafos não dirigidos, dígrafos, MST e caminhos mínimos. Disponível em: <https://algs4.cs.princeton.edu/home/>.
- MIT OpenCourseWare. *6.006 Introduction to Algorithms*. Progressão de BFS/DFS para caminhos mínimos. Disponível em: <https://ocw.mit.edu/courses/6-006-introduction-to-algorithms-fall-2011/pages/calendar>.
- Stanford University. *CS161 — Design and Analysis of Algorithms*. Progressão de buscas e SCC para caminhos mínimos, MST e fluxo máximo. Disponível em: <https://web.stanford.edu/class/archive/cs/cs161/cs161.1182/schedule.html>.
- Bibliografia completa: [Projeto de ensino da T290](proj_ensino_2026.md#6-bibliografia).
