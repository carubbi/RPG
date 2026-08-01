# Trilhas avaliativas da T290 — especificação

## Objetivo

Organizar cada AP da disciplina em três trilhas alinhadas ao desenvolvimento teórico, mantendo uma única avaliação por unidade. A trilha define a família do problema atribuído ao grupo; não constitui uma avaliação independente.

## Princípios comuns

- A disciplina manterá três trabalhos avaliativos: T1/AP1, T2/AP2 e T3/AP3.
- Cada grupo resolverá somente um problema na AP da unidade.
- A AT verificará a abrangência conceitual da unidade; a AP verificará a aplicação aprofundada em uma trilha.
- Todos os grupos produzirão evidências comuns de modelagem, representação, execução manual, correção, complexidade e testes.
- Nenhum acompanhamento exigirá conteúdo que ainda não tenha sido ensinado.
- Os problemas serão provenientes de plataformas com submissão verificável, como UVA/Online Judge, Kattis, Codeforces, CSES ou equivalentes.
- O resultado `Accepted` comprovará a correção computacional, mas não substituirá a aferição do conhecimento teórico.
- Python e Java permanecerão alternativas equivalentes.
- Haverá aproximadamente dez grupos por turma.

## Critérios de seleção dos problemas

Um problema somente integrará uma trilha quando:

- depender efetivamente do conhecimento teórico que a trilha pretende aferir;
- puder ser resolvido com os algoritmos e estruturas ensinados até o momento de sua cobrança;
- admitir implementação em Python ou Java sem biblioteca externa que resolva o núcleo do problema;
- possuir restrições que exijam uma estratégia algorítmica adequada, sem permitir que força bruta trivial descaracterize o objetivo;
- permitir a construção de uma instância pequena para modelagem e execução manual;
- permitir a análise de correção, complexidade e casos especiais;
- apresentar enunciado, entrada e saída suficientemente objetivos;
- oferecer submissão verificável na plataforma original;
- possuir dificuldade compatível com o estágio da disciplina e com os demais problemas da mesma AP.

Cada entrada do banco deverá registrar:

- nome e link oficial do problema;
- plataforma;
- trilha;
- conhecimento teórico aferido;
- razão pela qual a solução depende desse conhecimento;
- evidência exigida no acompanhamento;
- algoritmo ou estratégia esperada;
- complexidade esperada;
- casos especiais relevantes;
- atalhos ou bibliotecas que não serão aceitos.

## Unidade I — T1/AP1

A Unidade I terá dez problemas no total, distribuídos em três trilhas. A distribuição inicial será de três problemas na Trilha A, três na Trilha B e quatro na Trilha C.

### Trilha A — Modelagem de grafos simples e medidas estruturais

Aferirá modelagem de problemas como grafos simples não dirigidos e o cálculo ou interpretação de ordem, tamanho, densidade, graus, adjacência, incidência, regularidade, completude, conectividade e demais tipos previstos no projeto de ensino.

### Trilha B — Modelagem de dígrafos e medidas estruturais

Aferirá modelagem de relações orientadas, graus de entrada e saída, fontes, sorvedouros, densidade, adjacência, incidência, simetria, direção das arestas e alcançabilidade elementar.

### Trilha C — Buscas simples com DFS/BFS

Aferirá exploração, alcançabilidade, componentes, níveis, predecessores, reconstrução de caminhos e caminhos mínimos em grafos sem pesos.

### Progressão didática

O T1 será transversal entre a Unidade I e o início da Unidade II. As trilhas A e B serão desenvolvidas a partir das aulas de modelagem, tipos e representações. A Trilha C somente exigirá DFS/BFS depois que essas buscas forem ensinadas. Antes disso, seus grupos poderão produzir apenas evidências de compreensão do enunciado, modelagem e representação.

Passeio, trilha, caminho e ciclo serão conhecimentos comuns. Cada grupo deverá classificar uma sequência relevante de sua solução e justificar quando alguma dessas estruturas não puder ocorrer no grafo modelado.

## Unidade II — T2/AP2

A Unidade II terá dez problemas no total, distribuídos em três trilhas. A distribuição inicial será de quatro problemas na Trilha A, três na Trilha B e três na Trilha C.

### Trilha A — Buscas e conectividade

Aferirá aplicações mais complexas de DFS/BFS, componentes conexas, componentes fortemente conexas, pontes, vértices de articulação e critérios de conectividade.

### Trilha B — Percursos e estruturas de ordem

Aferirá ciclos dirigidos, ordenação topológica, caminhos e circuitos eulerianos e reconhecimento de propriedades associadas a passeios, trilhas, caminhos, ciclos, circuitos e tours.

Problemas hamiltonianos gerais, caixeiro viajante exato e carteiro chinês completo não serão exigidos como implementação nesta AP, pois sua complexidade ultrapassa o aprofundamento previsto. Eles poderão ser tratados por modelagem, reconhecimento ou exercício dirigido.

### Trilha C — Relações estruturais

Aferirá bipartição, coloração, emparelhamento e isomorfismo de árvores. Isomorfismo geral permanecerá no plano conceitual.

### Progressão didática

O primeiro acompanhamento verificará modelagem, representação e participação de DFS/BFS. Os acompanhamentos seguintes acrescentarão conectividade e a propriedade específica da trilha somente depois da respectiva aula teórica. Problemas pertencentes à Trilha C deverão ter dificuldade moderada, pois esses conteúdos aparecem mais tarde no desenvolvimento da unidade.

## Unidade III — T3/AP3

A Unidade III constitui a exceção quantitativa: cada uma de suas três trilhas manterá um banco com dez problemas, totalizando trinta opções. Em cada oferta, aproximadamente dez problemas serão selecionados desses bancos e atribuídos aos grupos.

### Trilha A — Árvore geradora mínima

Aferirá modelagem de grafos ponderados, Kruskal, Prim, Union-Find/DSU, propriedade do corte, existência de MST e variações compatíveis com o conteúdo.

### Trilha B — Caminhos mínimos

Aferirá relaxamento, Dijkstra, Bellman-Ford, reconstrução de caminhos, restrições de pesos e variações compatíveis com algoritmos de fonte única. Floyd-Warshall poderá ser aferido na AT e em atividades dirigidas, sem obrigação de compor o banco prático.

### Trilha C — Fluxo máximo

Aferirá modelagem de redes, capacidades, conservação, grafo residual, caminhos aumentantes, Ford-Fulkerson, Edmonds-Karp, corte mínimo e reduções diretas para emparelhamento.

### Curadoria por oferta

A existência de trinta opções não autoriza distribuição aleatória. Antes de cada oferta, o professor selecionará aproximadamente dez problemas com dificuldade e carga comparáveis, registrará a distribuição dos grupos e evitará algoritmos não ensinados como requisito central.

## Organização documental

Os documentos principais de T1, T2 e T3 concentrarão regras comuns, acompanhamento, entrega, apresentação, rubrica e distribuição efetiva dos grupos.

Os arquivos das trilhas funcionarão somente como bancos de problemas e requisitos específicos. Eles não declararão nota própria, apresentação adicional ou avaliação independente.

A nomenclatura deverá distinguir claramente:

- T1, T2 e T3 como trabalhos avaliativos da disciplina;
- Trilha A, Trilha B e Trilha C como famílias internas de problemas;
- problema atribuído como a única implementação exigida de cada grupo por AP.

Os materiais históricos da Unidade II poderão ser reaproveitados como referência, projeto-base ou exercício complementar, mas não integrarão automaticamente a AP2. Cada material deverá passar pelos critérios de seleção desta especificação.

## Integração ao cronograma

- Todo encontro prático oferecido antes da apresentação continuará sendo acompanhamento processual.
- Cada evidência deverá aferir conhecimento previamente ensinado.
- A apresentação continuará ocupando um encontro prático integral para aproximadamente dez grupos.
- A adoção das trilhas não criará novas avaliações, apresentações, reposições ou encontros externos.
- O cronograma deverá explicitar, em cada acompanhamento, a evidência comum e a diferenciação aplicável às trilhas.

## Verificação de implementação

A reorganização estará concluída quando:

- T1, T2 e T3 forem descritos inequivocamente como três APs, cada uma com três trilhas;
- T1 e T2 tiverem exatamente dez problemas no total;
- cada trilha da Unidade III tiver exatamente dez problemas;
- cada problema possuir vínculo explícito com o conhecimento teórico aferido;
- nenhum banco interno declarar avaliação ou pontuação independente;
- projeto de ensino, fluxo, cronograma e trabalhos usarem nomenclatura e regras compatíveis;
- links locais e links oficiais das plataformas estiverem válidos;
- os documentos modificados não utilizarem tabelas Markdown.
