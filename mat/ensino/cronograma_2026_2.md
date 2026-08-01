# Cronograma da disciplina T290 — 2026.2

## 1. Identificação

- **Disciplina:** T290 — Resolução de Problemas com Grafos.
- **Carga horária institucional:** 72 horas.
- **Período letivo:** 03/08/2026 a 09/12/2026.
- **Projeto de ensino:** [proj_ensino_2026.md](proj_ensino_2026.md).
- **Calendário acadêmico:** [calendario_2026_2.md](calendario_2026_2.md).
- **Turmas e horários:** [turmas_2026_2.md](turmas_2026_2.md).

## 2. Organização das turmas

| Par | Turma teórica | Turma prática |
| --- | --- | --- |
| 09/19 | Turma 09 — segunda-feira, 21h às 22h40, sala C27 | Turma 19 — quarta-feira, 21h às 22h40, sala C27 |
| 16/17 | Turma 16 — terça-feira, 19h às 20h40, sala D26 | Turma 17 — quinta-feira, 19h às 20h40, sala D22 |
| 30/31 | Turma 30 — terça-feira, 21h às 22h40, sala C29 | Turma 31 — quinta-feira, 21h às 22h40, sala C29 |
| 62/63 | Turma 62 — segunda-feira, 17h20 às 19h, sala C34 | Turma 63 — quarta-feira, 17h20 às 19h, sala T05 |

### Turma teórica

**Objetivo:** dedicar os encontros à construção dos conceitos, modelagem, análise de correção e complexidade, apresentação comparativa de códigos em Python e Java, revisões e avaliações.

### Turma prática

**Objetivo:** dedicar os encontros às práticas computacionais dos conceitos ensinados, leitura de datasets, implementação, testes, interpretação dos resultados, desenvolvimento e apresentação dos trabalhos.

## 3. Critérios de planejamento

- O cronograma é alinhado por semana acadêmica: turmas equivalentes iniciam cada conteúdo novo na mesma semana.
- As cargas de 12, 22 e 38 horas das unidades são referências institucionais; o planejamento trabalha com os encontros efetivamente oferecidos pelo calendário.
- Não haverá reposição, compensação de carga horária ou criação de encontros externos.
- Cada feriado é identificado por data e denominação oficial, com a indicação de que não haverá aula.
- Nas semanas em que um encontro teórico for cancelado por feriado, as práticas equivalentes de quarta e quinta-feira poderão assumir formato integrado: aproximadamente 40 minutos de síntese de um conceito central e 60 minutos de prática reduzida.
- O encontro integrado é uma recuperação pedagógica sintética dentro do horário regular, não uma reposição institucional; não incluirá avaliação somativa nem concentrará conteúdos complexos.
- Python e Java são alternativas equivalentes de implementação. A lógica algorítmica será ensinada uma vez, com comparação pontual das APIs e convenções das duas linguagens.
- Cada prática produzirá uma evidência verificável: saída de programa, teste, arquivo de entrada, análise curta, commit, checkpoint ou apresentação.

## 4. Cronograma por unidade

## Unidade I — Modelar e representar problemas com grafos

**Referência institucional:** 12 horas.

| Semana | Datas | Turma teórica | Turma prática | Recursos | Produto/evidência |
| ---: | --- | --- | --- | --- | --- |
| 1<br>03–06/08 | Teórica: 03/08 (seg.) e 04/08 (ter.); prática: 05/08 (qua.) e 06/08 (qui.) | Apresentação da disciplina; problemas de Königsberg, rotas e redes; modelagem por vértices e arestas; ordem, tamanho e densidade. | Preparação do ambiente Python/Java; leitura do formato `algs4`; execução e inspeção de um primeiro grafo. | [`Graph`](../../algs4-py/algs4/graph.py), [`Graph.java`](../../algs4-java/algs4/Graph.java), [`tinyG.txt`](../../dataset/tinyG.txt). | Ambiente validado, grafo carregado e lista de adjacência interpretada. |
| 2<br>10–13/08 | Teórica: 10/08 (seg.) e 11/08 (ter.); prática: 12/08 (qua.) e 13/08 (qui.) | Vértice, aresta, adjacência, incidência, grau, ponte, subgrafo e ciclo; grafos simples, multigrafos, regulares, completos, bipartidos, planares e conexos. | Classificação contrastante de grafos; cálculo de ordem, tamanho, densidade e graus; identificação computacional e manual de propriedades. | [`tinyG.txt`](../../dataset/tinyG.txt), [`tinyDG.txt`](../../dataset/tinyDG.txt), [`cavalo_3x3.txt`](../../dataset/cavalo_3x3.txt). | Tabela de classificação com justificativas e métricas calculadas. |
| 3<br>17–20/08 | Teórica: 17/08 (seg.) e 18/08 (ter.); prática: 19/08 (qua.) e 20/08 (qui.) | Grafos rotulados, não orientados, dígrafos e grafos ponderados; matrizes de adjacência e incidência; listas de adjacência e incidência; custos de espaço. | Construção do mesmo problema com lista e matriz; uso de `Graph`, `Digraph`, `SymbolGraph` e `SymbolDigraph`; modelagem inicial de uma rede real. | [`Digraph`](../../algs4-py/algs4/digraph.py), [`SymbolGraph`](../../algs4-py/algs4/symbol_graph.py), [`routes.txt`](../../dataset/routes.txt), [T1 da Unidade I](../../trabalhos/und1/T1.md). | Representação documentada, arquivo de entrada válido e justificativa da estrutura escolhida. |

## Unidade II — Resolver problemas com grafos conexos

**Referência institucional:** 22 horas.

| Semana | Datas | Turma teórica | Turma prática | Recursos | Produto/evidência |
| ---: | --- | --- | --- | --- | --- |
| 4<br>24–27/08 | Teórica: 24/08 (seg.) e 25/08 (ter.); prática: 26/08 (qua.) e 27/08 (qui.) | Busca em profundidade: invariantes, árvore de busca, alcançabilidade, caminhos e complexidade `O(V + E)`. | Execução, rastreamento e modificação de DFS; modelagem dos estados do Nordeste e análise de conectividade. | [`DepthFirstSearch`](../../algs4-py/algs4/depth_first_search.py), [`DepthFirstPaths`](../../algs4-py/algs4/depth_first_paths.py), [Trabalho U2-T1](../../trabalhos/und2/T1/T1.md). | Ordem de visita, caminho reconstruído, análise de complexidade e commit do laboratório. |
| 5<br>31/08–03/09 | Teórica: 31/08 (seg.) e 01/09 (ter.); prática: 02/09 (qua.) e 03/09 (qui.) | Busca em largura: fronteiras, árvore BFS, distância e caminho mínimo em grafos sem pesos; comparação com DFS. | Comparação experimental de BFS e DFS em `tinyG.txt` e `mediumG.txt`; interpretação de ordem de visita, distâncias e caminhos. | [`BreadthFirstPaths`](../../algs4-py/algs4/breadth_first_paths.py), [`tinyG.txt`](../../dataset/tinyG.txt), [`mediumG.txt`](../../dataset/mediumG.txt). | Quadro comparativo BFS × DFS com saídas e justificativa de escolha. |
| 6<br>07–10/09 | Teórica: **07/09 — Dia da Independência do Brasil — feriado, sem aula**; 08/09 (ter.): revisão formativa, sem conteúdo novo. Prática integrada: 09/09 (qua.) e 10/09 (qui.) | Revisão de representação, DFS, BFS, alcançabilidade e caminhos; exercícios conceituais equivalentes para as turmas de terça-feira. | **Encontro integrado:** 40 min de síntese de BFS/DFS e 60 min de prática reduzida sobre escolha da busca, caminho e conectividade; sem avaliação somativa. | Algoritmos de DFS/BFS e [Trabalho U2-T1](../../trabalhos/und2/T1/T1.md). | Solução reduzida de um caso e justificativa do algoritmo selecionado. |
| 7<br>14–17/09 | Teórica/avaliação: 14/09 (seg.) e 15/09 (ter.); prática: 16/09 (qua.) e 17/09 (qui.) | **AV1:** AT objetiva e AP individual de codificação sobre fundamentos, tipos, representações, DFS e BFS. | Correção comentada, diagnóstico de dificuldades e refatoração guiada de uma solução equivalente, sem alteração da nota. | Projeto de ensino, códigos Python/Java e datasets da Unidade I/início da Unidade II. | Registro da AV1 e plano individual de correção de lacunas. |
| 8<br>21–24/09 | Teórica: 21/09 (seg.) e 22/09 (ter.); prática: 23/09 (qua.) e 24/09 (qui.) | Passeio, trilha, caminho, ciclo, circuito e tour; componentes conexas, pontes, vértices e arestas de corte; critérios de conectividade. | Componentes e ciclos no grafo do cavalo; testes com casos conexos e desconexos; identificação de pontes e cortes. | [`CC`](../../algs4-py/algs4/cc.py), [`Cycle`](../../algs4-py/algs4/cycle.py), [Trabalho U2-T2](../../trabalhos/und2/T2/T2.md). | Componentes, ciclo encontrado e análise dos casos-limite. |
| 9<br>28/09–01/10 | Teórica: 28/09 (seg.) e 29/09 (ter.); prática: 30/09 (qua.) e 01/10 (qui.) | Dígrafos, ciclos dirigidos, ordenação topológica e componentes fortemente conexas; panorama comparativo de Euler/Hamilton, carteiro chinês, caixeiro viajante, coloração, emparelhamento e isomorfismo. | Estações práticas com trabalhos selecionados: circuito euleriano, heurísticas para TSP, DSatur ou isomorfismo em árvores; os grupos implementam uma estação, não todas. | [`tinyDG.txt`](../../dataset/tinyDG.txt), [`Topological`](../../algs4-py/algs4/topological.py), [`KosarajuSCC`](../../algs4-py/algs4/kosaraju_scc.py), [U2-T3](../../trabalhos/und2/T3/T3.md), [U2-T4](../../trabalhos/und2/T4/T4.md), [U2-T5](../../trabalhos/und2/T5/T5.md), [U2-T6](../../trabalhos/und2/T6/T6.md). | Solução ou protótipo da estação e explicação de modelagem, correção esperada e complexidade. |
| 10<br>05–08/10 | Teórica/avaliação: 05/10 (seg.) e 06/10 (ter.); prática: 07/10 (qua.) e 08/10 (qui.) | **AV2:** AT objetiva e AP individual de codificação sobre conectividade, grafos dirigidos/não dirigidos e problemas clássicos. | Apresentações curtas dos trabalhos selecionados da Unidade II e feedback por critérios comuns. | Trabalhos U2-T2 a U2-T6 e rubrica de modelagem, algoritmo, complexidade e comunicação. | Registro da AV2, repositório do trabalho e apresentação curta. |

## Unidade III — Otimizar grafos ponderados

**Referência institucional:** 38 horas.

| Semana | Datas | Turma teórica | Turma prática | Recursos | Produto/evidência |
| ---: | --- | --- | --- | --- | --- |
| 11<br>12–15/10 | Teórica: **12/10 — Dia de Nossa Senhora Aparecida — feriado, sem aula**; **13/10 — antecipação do Dia do Professor — feriado estudantil, sem aula**. Prática integrada: 14/10 (qua.) e 15/10 (qui.) | Não haverá encontro teórico. | **Encontro integrado:** 40 min sobre representação de grafos ponderados e formulação de objetivo/restrições; 60 min para carregar, validar e inspecionar um grafo ponderado; sem avaliação somativa. | [`EdgeWeightedGraph`](../../algs4-py/algs4/edge_weighted_graph.py), [`EdgeWeightedDigraph`](../../algs4-py/algs4/edge_weighted_digraph.py), [`tinyEWG.txt`](../../dataset/tinyEWG.txt), [`tinyEWD.txt`](../../dataset/tinyEWD.txt). | Arquivo carregado, pesos validados e formulação do problema de otimização. |
| 12<br>19–22/10 | Teórica: 19/10 (seg.) e 20/10 (ter.); prática: 21/10 (qua.) e 22/10 (qui.) | Árvore geradora mínima; propriedade do corte; algoritmos de Kruskal e Prim; Union-Find; correção e complexidade. | Execução comparativa de Kruskal, Prim e Lazy Prim; início da trilha de projeto de MST. | [`KruskalMST`](../../algs4-py/algs4/kruskal_mst.py), [`PrimMST`](../../algs4-py/algs4/prim_mst.py), [`UF`](../../algs4-py/algs4/uf.py), [Trabalho U3-T1](../../trabalhos/und3/T1/T1.md). | MST, custo total, comparação entre algoritmos e modelagem do problema atribuído. |
| 13<br>26–29/10 | Teórica: 26/10 (seg.) e 27/10 (ter.); prática: 28/10 (qua.) e 29/10 (qui.) | Caminhos mínimos; relaxamento; algoritmo de Dijkstra; fila de prioridade indexada; restrição de pesos não negativos; correção e complexidade. | Rastreamento das relaxações; comparação de caminhos; início da trilha de projeto de caminhos mínimos. | [`DijkstraSP`](../../algs4-py/algs4/dijkstra_sp.py), [`IndexMinPQ`](../../algs4-py/algs4/index_min_pq.py), [`tinyEWD.txt`](../../dataset/tinyEWD.txt), [Trabalho U3-T2](../../trabalhos/und3/T2/T2.md). | Árvore de caminhos mínimos, distâncias, caminho reconstruído e caso de teste. |
| 14<br>02–05/11 | Teórica: **02/11 — Dia de Finados — feriado, sem aula**; 03/11 (ter.): revisão formativa, sem conteúdo novo. Prática integrada: 04/11 (qua.) e 05/11 (qui.) | Revisão de modelagem, relaxamento, condição de pesos e complexidade de Dijkstra; exercícios conceituais equivalentes para as turmas de terça-feira. | **Encontro integrado:** 40 min de síntese de Dijkstra e 60 min de prática reduzida com modelagem e depuração; sem avaliação somativa. | `DijkstraSP`, `IndexMinPQ`, `tinyEWD.txt` e problemas selecionados do Trabalho U3-T2. | Diagnóstico de uma solução incorreta e teste que evidencia a correção. |
| 15<br>09–12/11 | Teórica: 09/11 (seg.) e 10/11 (ter.); prática: 11/11 (qua.) e 12/11 (qui.) | Pesos negativos, relaxamento repetido, Bellman-Ford e detecção de ciclos negativos; comparação com Dijkstra. | Execução em grafos com e sem ciclo negativo; interpretação das condições de aplicabilidade. | [`BellmanFordSP`](../../algs4-py/algs4/bellman_ford_sp.py), [`tinyEWDn.txt`](../../dataset/tinyEWDn.txt), [`tinyEWDnc.txt`](../../dataset/tinyEWDnc.txt). | Matriz de decisão Dijkstra × Bellman-Ford e evidência de ciclo negativo. |
| 16<br>16–19/11 | Teórica: 16/11 (seg.) e 17/11 (ter.); prática: 18/11 (qua.) e 19/11 (qui.) | Caminhos mínimos entre todos os pares; Floyd-Warshall; programação dinâmica; comparação de custos e cenários de uso. | Implementação/execução orientada de Floyd-Warshall em Java e comparação com múltiplas execuções de caminhos de fonte única. | [`FloydWarshall.java`](../../algs4-java/algs4/FloydWarshall.java), [`tinyEWD.txt`](../../dataset/tinyEWD.txt). | Matriz de distâncias e justificativa da escolha do algoritmo. |
| 17<br>23–26/11 | Teórica: 23/11 (seg.) e 24/11 (ter.); prática: 25/11 (qua.) e 26/11 (qui.) | Redes de fluxo; capacidade, conservação, grafo residual, caminhos aumentantes, corte mínimo e Ford-Fulkerson; correção e complexidade. | Rastreamento de caminhos aumentantes e gargalos; início/conclusão da trilha de fluxo máximo. | [`FlowNetwork.java`](../../algs4-java/algs4/FlowNetwork.java), [`FordFulkerson.java`](../../algs4-java/algs4/FordFulkerson.java), [`tinyFN.txt`](../../dataset/tinyFN.txt), [Trabalho U3-T3](../../trabalhos/und3/T3/T3.md). | Tabela de aumentos, fluxo final, corte associado e checkpoint do projeto. |
| 18<br>30/11–03/12 | Teórica: 30/11 (seg.) e 01/12 (ter.); prática: 02/12 (qua.) e 03/12 (qui.) | Síntese comparativa de MST, caminhos mínimos e fluxo; seleção de algoritmos; complexidade, casos especiais e comunicação científica. | 02/12: ensaio e verificação final das turmas de quarta-feira. 03/12: apresentação da AP/AV3 das turmas de quinta-feira, com a mesma rubrica prevista para 09/12. | Trabalhos [U3-T1](../../trabalhos/und3/T1/T1.md), [U3-T2](../../trabalhos/und3/T2/T2.md) e [U3-T3](../../trabalhos/und3/T3/T3.md). | Repositório, evidências de execução, apresentação e avaliação pelos critérios comuns. |
| 19<br>07–09/12 | Teórica: 07/12 (seg.) e 08/12 (ter.); prática: 09/12 (qua.); não há encontro equivalente de quinta-feira dentro do período letivo. | AT/AV3, síntese final e feedback conceitual. | 09/12: apresentação da AP/AV3 das turmas de quarta-feira, feedback final e encerramento; as turmas de quinta-feira realizaram a apresentação em 03/12. | Rubrica comum da AV3, repositórios e apresentações das três trilhas. | Registro da AV3, feedback final e encerramento da disciplina. |

## 5. Avaliações e entregas

| Avaliação | Datas | Composição | Conteúdo e produto |
| --- | --- | --- | --- |
| AV1 | 14–17/09; registro até 21/09 | AT objetiva (20%) + AP individual de codificação (80%) | Fundamentos, tipos, representações, DFS e BFS; correção formativa na prática seguinte. |
| AV2 | 05–08/10; registro até 10/11 | AT objetiva (20%) + AP individual de codificação (80%) | Grafos dirigidos e não dirigidos, conectividade e problemas clássicos; apresentação curta dos trabalhos selecionados. |
| AV3 | 03–09/12; registro até 11/12 | AT (20%) + AP por trabalho científico e apresentação (80%) | Uma trilha por grupo: MST, caminhos mínimos ou fluxo máximo; repositório, evidências, análise e apresentação. |

Os encontros integrados de 09–10/09, 14–15/10 e 04–05/11 não contêm avaliação somativa.

## 6. Uso dos trabalhos

| Material | Função no cronograma |
| --- | --- |
| [T1 da Unidade I](../../trabalhos/und1/T1.md) | Referência longitudinal para modelagem e análise de redes reais; não é comprimido em uma única entrega introdutória. |
| [U2-T1](../../trabalhos/und2/T1/T1.md) e [U2-T2](../../trabalhos/und2/T2/T2.md) | Laboratórios guiados de buscas, conectividade, distância e ciclos. |
| [U2-T3](../../trabalhos/und2/T3/T3.md) a [U2-T6](../../trabalhos/und2/T6/T6.md) | Estações selecionadas sobre Euler/carteiro chinês, TSP, coloração e isomorfismo; cada grupo trabalha em uma estação. |
| [U3-T1](../../trabalhos/und3/T1/T1.md), [U3-T2](../../trabalhos/und3/T2/T2.md) e [U3-T3](../../trabalhos/und3/T3/T3.md) | Trilhas alternativas da AV3 sobre MST, caminhos mínimos e fluxo máximo; cada grupo desenvolve uma trilha. |

## 7. Referências curriculares

- SEDGEWICK, Robert; WAYNE, Kevin. *Algorithms, 4th Edition*. Capítulo 4: grafos não dirigidos, dígrafos, MST e caminhos mínimos. Disponível em: <https://algs4.cs.princeton.edu/home/>.
- MIT OpenCourseWare. *6.006 Introduction to Algorithms*. Progressão de BFS/DFS para caminhos mínimos. Disponível em: <https://ocw.mit.edu/courses/6-006-introduction-to-algorithms-fall-2011/pages/calendar>.
- Stanford University. *CS161 — Design and Analysis of Algorithms*. Progressão de buscas e SCC para caminhos mínimos, MST e fluxo máximo. Disponível em: <https://web.stanford.edu/class/archive/cs/cs161/cs161.1182/schedule.html>.
- Bibliografia completa da disciplina: [Projeto de ensino da T290](proj_ensino_2026.md#6-bibliografia).
