# Fluxo de ensino

## Princípios gerais

- Cada unidade terá uma única avaliação prática.
- Cada grupo resolverá apenas um problema por avaliação prática.
- O T1 terá aproximadamente dez problemas distintos, desenvolvidos por quatro marcos comuns.
- O T2 terá dez problemas distribuídos entre três bancos temáticos.
- A Unidade III terá um banco de trinta problemas, dez em cada classe de otimização; um problema será selecionado e atribuído a cada grupo em cada oferta.
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

## Ensino dos algoritmos

O ensino avançará a cada encontro, tanto nas aulas teóricas quanto nas práticas, conforme a sequência abaixo. Todos os algoritmos da Unidade III serão ensinados antes do lançamento e de qualquer marco do T3.

| Tema e conteúdos | Turmas de segunda e quarta | Turmas de terça e quinta |
| --- | --- | --- |
| Árvore geradora mínima: Kruskal e Union-Find | 19/10 | 20/10 |
| Árvore geradora mínima: Prim | 21/10 | 22/10 |
| Caminhos mínimos: relaxamento e Dijkstra | 28/10 | 29/10 |
| Caminhos mínimos: Bellman-Ford e Floyd-Warshall por atualização da matriz com vértices intermediários | 04/11 | 03/11 |
| Fundamentos de fluxo máximo: capacidades, conservação, rede residual e caminhos aumentantes | 09/11 | 05/11 |
| Fluxo máximo: Ford-Fulkerson, incluindo a busca por BFS na implementação de referência | 11/11 | 10/11 |

A AT2 ocorrerá em 26/10, para as turmas de segunda e quarta, e em 27/10, para as turmas de terça e quinta. Em 02/11, não haverá aula devido ao feriado de Finados. Em 12/11, não haverá aula nas turmas de terça e quinta devido à inauguração do Museu da Unifor.

A revisão e a AT3 abrangerão todos esses conteúdos, independentemente da classe de problema atribuída ao grupo.

## Desenvolvimento e avaliação do T3

O acompanhamento avançará tanto nos encontros teóricos quanto nos práticos, começando em 16/11, para as turmas de segunda e quarta, ou em 17/11, para as turmas de terça e quinta. As evidências também serão produzidas entre as aulas.

| Etapa | Turmas de segunda e quarta | Turmas de terça e quinta |
| --- | --- | --- |
| Lançamento, distribuição balanceada dos problemas e marcos 1 e 2 | 16/11 | 17/11 |
| Marco 3: escolha do algoritmo | 18/11 | 19/11 |
| Marco 4: adaptação e integração | 23/11 | 24/11 |
| Marco 5: testes e análise | 25/11, com orientação do marco 6 | 26/11 |
| Revisão para a AT3 e acompanhamento do marco 6 | 30/11 | 01/12 |
| Conclusão do marco 6, apresentação final e entrega até 23h59 | 02/12 | 03/12 |
| AT3 | 07/12 | 08/12 |
| Devolutiva da AP3 e encerramento | 09/12 | Não se aplica |

Cada grupo terá um único repositório público e autocontido e realizará uma única apresentação de até 5 minutos. O `Accepted` e a conclusão do marco 6 serão exigidos até a apresentação final; o link do repositório deverá ser enviado ao AVA/Moodle até 23h59 desse mesmo dia. A orientação do marco 6 e seu acompanhamento no encontro compartilhado com a revisão para a AT3, em 30/11 ou 01/12, não anteciparão esse prazo.

A AP3 manterá 4,0 pontos pelo acompanhamento dos seis marcos, 2,0 pontos pela solução adaptada com `Accepted` e pelo repositório e 4,0 pontos pela apresentação. A AV3 manterá a ponderação de 70% para a AT3 e 30% para a AP3. As regras detalhadas constam no [T3](../trabalhos/T3.md).

## Classes de otimização do T3

O T3 constitui uma única AP. Cada classe manterá um banco com dez problemas, totalizando trinta opções. Cada grupo receberá um único problema de uma das classes, e a quantidade de grupos entre as classes deverá diferir no máximo em um. Para dez grupos, uma distribuição possível será 4/3/3 entre MST, caminhos mínimos e fluxo máximo.

Antes da distribuição, os problemas deverão ser selecionados comparando esforço total, dificuldade de modelagem, carga de adaptação, conceitos necessários e testes, além da disponibilidade de implementação de referência na linguagem escolhida. A seleção deverá equilibrar dificuldade e carga entre os grupos.

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

Os seis marcos serão comuns a todos os grupos e aplicados ao único problema atribuído:

1. Formulação: problema, entrada, saída, restrições, modelagem e instância pequena.
2. Representação e validação: estrutura computacional, instância representada e resultado esperado.
3. Escolha do algoritmo: justificativa, condições de aplicabilidade, operação ou propriedade central e complexidade.
4. Adaptação e integração: implementação de referência, alterações justificadas, dependências e execução reproduzível.
5. Testes e análise: instância pequena, casos-limite, diagnóstico de divergências e complexidade de tempo e memória.
6. Submissão e comunicação: `Accepted`, `README.md`, evidência da submissão e preparação da apresentação.

- Os marcos 1 e 2 começarão em 16/11 ou 17/11, somente após o ensino completo das três famílias algorítmicas; o marco 3 será acompanhado em 18/11 ou 19/11.
- `FlowEdge` e `FlowNetwork` serão apresentados após os conceitos fundamentais de fluxo máximo, durante o ensino da família e antes do lançamento do T3.
- Os grupos manterão evidências progressivas no repositório durante os encontros teóricos e práticos de acompanhamento e entre as aulas. O marco 6 será acompanhado junto da revisão para a AT3 em 30/11 ou 01/12 e concluído até a apresentação final.

