# Especificação do cronograma da T290 — 2026.2

## 1. Objetivo

Gerar o cronograma acadêmico da disciplina **T290 — Resolução de Problemas com Grafos** para o semestre 2026.2, organizado por unidade e por encontro, com datas específicas para todos os pares de turmas.

O cronograma deve articular:

- o projeto de ensino localizado em `mat/ensino/proj_ensino_2026.md`;
- o calendário acadêmico de `mat/ensino/calendario_2026_2.md`;
- as turmas e os horários de `mat/ensino/turmas_2026_2.md`;
- os datasets disponíveis em `dataset/`;
- os algoritmos disponíveis em `algs4-py/` e `algs4-java/`;
- os trabalhos existentes em `trabalhos/`.

O artefato final será `mat/ensino/cronograma_2026_2.md`.

## 2. Escopo das turmas

O cronograma abrangerá os quatro pares de turmas:

- **09/19:** turma teórica na segunda-feira e turma prática na quarta-feira;
- **16/17:** turma teórica na terça-feira e turma prática na quinta-feira;
- **30/31:** turma teórica na terça-feira e turma prática na quinta-feira;
- **62/63:** turma teórica na segunda-feira e turma prática na quarta-feira.

As turmas 16 e 30 compartilharão o mesmo planejamento teórico. As turmas 17 e 31 compartilharão o mesmo planejamento prático. O mesmo conteúdo será usado nos pares 09/19 e 62/63, respeitados os respectivos horários e salas.

## 3. Organização pedagógica

### 3.1 Turma teórica

Os encontros teóricos serão dedicados a:

- motivação e modelagem dos problemas;
- conceitos e propriedades de grafos;
- apresentação e análise dos algoritmos;
- análise de correção e complexidade;
- demonstrações de código em Python e Java;
- revisões e avaliações teóricas ou práticas individuais, quando previstas.

Python e Java serão alternativas equivalentes. As aulas não duplicarão a explicação de um algoritmo apenas para ensinar a mesma lógica nas duas linguagens.

### 3.2 Turma prática

Os encontros práticos serão dedicados a:

- execução e modificação de programas;
- leitura e interpretação dos datasets;
- modelagem computacional;
- testes e comparação de resultados;
- acompanhamento processual e desenvolvimento dos trabalhos;
- apresentações e feedback.

Em cada ciclo avaliativo, todos os encontros práticos oferecidos antes da apresentação serão encontros de acompanhamento da AP. A única exceção será o encontro integral reservado às apresentações. A regra aplica-se às turmas de quarta-feira e, de modo equivalente, às turmas de quinta-feira.

Cada acompanhamento deverá atestar um conhecimento previamente construído na aula teórica correspondente. Não bastará registrar presença ou progresso genérico: o grupo produzirá uma evidência verificável, como modelagem do problema, representação escolhida, execução manual, implementação parcial, testes, análise de complexidade ou diagnóstico de erro.

As aulas práticas terão predominância computacional e não serão utilizadas como reposição automática de aulas teóricas canceladas por feriados. Nas semanas em que um encontro teórico não ocorrer por causa de feriado, a aula prática poderá assumir excepcionalmente formato integrado, com aproximadamente 40 minutos de síntese teórica e 60 minutos de prática computacional reduzida, sem reposição ou acréscimo de carga horária. Esse formato constitui recuperação pedagógica sintética dentro do encontro regular, não reposição institucional.

O formato integrado obedecerá aos seguintes limites:

- será aplicado de forma equivalente às turmas de quarta e quinta-feira;
- abordará no máximo um conceito teórico central;
- não incluirá avaliação somativa;
- terá produto prático reduzido e explicitamente definido;
- não será usado para concentrar algoritmos novos ou conteúdos complexos que exijam demonstração, análise de correção ou discussão extensa.

## 4. Tratamento dos feriados e alinhamento

Não haverá reposição, compensação de carga horária nem criação de encontros. Cada feriado será registrado com data, denominação oficial e indicação de que não haverá aula, por exemplo: **“07/09 — Dia da Independência do Brasil — feriado, sem aula”**. O registro contará conforme as regras institucionais.

O cronograma será alinhado por **semana acadêmica**, e não apenas pela sequência individual de datas. Um conteúdo novo somente avançará quando todas as turmas tiverem oportunidade equivalente de iniciá-lo na mesma semana.

### 4.1 Semanas que exigem tratamento específico

- **07 a 10/09:** segunda-feira, 07/09, Dia da Independência do Brasil — feriado, sem aula. A terça-feira será revisão formativa, sem conteúdo novo. Os encontros de 09 e 10/09 serão integralmente reservados às apresentações do T1, cujo conteúdo já terá sido ensinado; não constituirão reposição nem encontro integrado.
- **12 a 15/10:** segunda-feira, 12/10, Dia de Nossa Senhora Aparecida — feriado, sem aula; terça-feira, 13/10, antecipação do Dia do Professor — feriado estudantil, sem aula. Quartas e quintas terão encontro integrado equivalente sobre representação de grafos ponderados, com prática reduzida.
- **02 a 05/11:** segunda-feira, 02/11, Dia de Finados — feriado, sem aula. A terça-feira será revisão formativa, sem conteúdo novo. Quartas e quintas terão encontro integrado equivalente para consolidação conceitual e computacional de Dijkstra.
- **03 a 09/12:** período institucional da AV3. As turmas de quinta-feira apresentarão o T3 em 03/12, antes da AT3 de 08/12. As turmas de segunda-feira realizarão a AT3 em 07/12 e, excepcionalmente, as turmas de quarta-feira apresentarão o T3 em 09/12, após a AT3. Essa inversão é necessária porque não existe outro encontro regular de quarta-feira dentro da janela institucional.

As terças-feiras de 08/09 e 03/11 não serão usadas para avaliações somativas que não possam ser aplicadas de modo equivalente às turmas de segunda-feira.

## 5. Unidades e progressão

### 5.1 Unidade I — Modelar e representar problemas com grafos

Referência institucional: **12 horas**.

Progressão:

1. problemas motivadores e vocabulário fundamental;
2. tipos e propriedades de grafos;
3. representações computacionais;
4. leitura de datasets e uso inicial de `Graph` e `Digraph`;
5. modelagem de uma rede real;
6. síntese da modelagem e transição para algoritmos de busca.

O T1 será transversal entre a Unidade I e o início da Unidade II. Terá como tema exploração, alcançabilidade e reconhecimento de passeios, trilhas, caminhos e ciclos em grafos não ponderados. Cada grupo resolverá um problema básico de plataforma de programação competitiva que exija modelagem, representação e uso explícito de DFS, BFS ou ambas. Os primeiros acompanhamentos tratarão modelagem e representação; os últimos incorporarão as buscas somente depois de ensinadas. As noções básicas de passeio, trilha, caminho e ciclo serão introduzidas antes da apresentação do T1 e aprofundadas na Unidade II.

### 5.2 Unidade II — Resolver problemas com grafos conexos

Referência institucional: **22 horas**.

Progressão:

1. busca em profundidade;
2. busca em largura e caminhos mínimos sem pesos;
3. acompanhamento e apresentação do T1, após fundamentos, representações e buscas;
4. avaliação teórica da AV1, depois da apresentação do T1;
5. componentes conexas, ciclos e conectividade;
6. dígrafos, ordenação topológica e componentes fortemente conexas;
7. caminhos, trilhas, circuitos e grafos eulerianos;
8. problemas hamiltonianos, caixeiro viajante e carteiro chinês;
9. introdução a coloração, emparelhamento e isomorfismo;
10. acompanhamento e apresentação do T2;
11. avaliação teórica da AV2, depois da apresentação do T2.

O T2 terá como tema aplicações mais complexas de DFS/BFS, conectividade e propriedades de grafos dirigidos e não dirigidos. Os problemas dos grupos poderão envolver componentes conexas, ciclos, ordenação topológica, componentes fortemente conexas, bipartição, pontes, vértices de articulação, Euler/Hamilton, coloração, emparelhamento ou isomorfismo. Todos os problemas deverão reutilizar DFS/BFS ou outro conhecimento estrutural da Unidade II e exigir justificativa do critério algorítmico.

Os trabalhos existentes da Unidade II poderão fornecer problemas e exercícios para os grupos, mas não serão automaticamente transformados em entregas adicionais.

### 5.3 Unidade III — Otimizar grafos ponderados

Referência institucional: **38 horas**.

Progressão:

1. grafos ponderados e modelagem de problemas de otimização;
2. árvores geradoras mínimas com Kruskal, Prim e Union-Find;
3. caminhos mínimos com Dijkstra;
4. pesos negativos e Bellman-Ford;
5. caminhos mínimos entre todos os pares e Floyd-Warshall;
6. redes de fluxo, grafo residual e Ford-Fulkerson;
7. acompanhamento processual e apresentação do T3;
8. AV3 e feedback.

O T3 terá como tema otimização em grafos ponderados e redes. Os grupos serão distribuídos entre três trilhas equivalentes: árvore geradora mínima, caminhos mínimos e fluxo máximo. Os atuais trabalhos `trabalhos/und3/T1/T1.md`, `trabalhos/und3/T2/T2.md` e `trabalhos/und3/T3/T3.md` serão aproveitados como bancos de problemas dessas trilhas, e não como três avaliações separadas.

Os problemas de T1, T2 e T3 serão selecionados de plataformas com submissão verificável, como UVA/Online Judge, Kattis, Codeforces, CSES e equivalentes. A seleção deverá controlar a progressão de dificuldade: problemas básicos no T1, problemas estruturais mais complexos no T2 e problemas de otimização no T3.

## 6. Avaliações

O projeto de ensino e o cronograma deverão adotar a mesma metodologia:

- **AT:** ocupará um encontro teórico inteiro e será composta por dez questões objetivas no estilo ENADE, aplicadas no AVA/Moodle, com nota e justificativa das respostas disponibilizadas somente após o encerramento;
- **AP:** será composta pelo acompanhamento processual do trabalho e por sua apresentação, com implementação em Python ou Java;
- **AV1:** combinará a AT sobre fundamentos, tipos, representações e buscas com a AP correspondente ao T1;
- **AV2:** combinará a AT sobre grafos dirigidos e não dirigidos, conectividade e problemas clássicos com a AP correspondente ao T2;
- **AV3:** combinará a AT sobre otimização em grafos ponderados com a AP correspondente ao T3.

Em cada ciclo, a apresentação da AP ocorrerá em um encontro prático integral e não compartilhará o mesmo encontro com a AT. A apresentação antecederá a AT sempre que houver encontro prático regular dentro da janela institucional. Na AV3 das turmas de quarta-feira, a apresentação ocorrerá excepcionalmente em 09/12, após a AT3 de 07/12, porque a janela da AV3 começa em 03/12 e não existe outro encontro regular de quarta-feira no período.

Para uma turma com aproximadamente dez grupos, o encontro de apresentação terá 10 minutos de abertura, dez ciclos de até 5 minutos de exposição e 1 minuto de transição, 20 minutos de avaliação e devolutiva e 10 minutos de contingência. Os materiais deverão estar previamente carregados para que a transição não ultrapasse 1 minuto.

O texto atual do projeto de ensino que define as APs de AV1 e AV2 como implementações individuais em sala, sem consulta, deverá ser revisto. Essa redação é incompatível com a AP processual em grupo aprovada nesta especificação.

As avaliações serão posicionadas antes dos prazos institucionais:

- apresentação do T1 em 09–10/09 e AT1 em 14–15/09, com registro da AV1 até 21/09;
- apresentação do T2 em 07–08/10 e AT2 em 19–20/10, após os feriados de 12–13/10 e antes do registro da AV2 em 10/11;
- apresentação do T3 em 03/12 para as turmas de quinta-feira, AT3 em 07–08/12 e apresentação do T3 em 09/12 para as turmas de quarta-feira, todas dentro do período de aplicação e feedback da AV3;
- registro da AV3 até 11/12.

As datas específicas serão escolhidas de modo que todos os pares de turmas realizem avaliações equivalentes na mesma semana acadêmica.

## 7. Estrutura do cronograma final

O documento final conterá:

1. identificação e critérios de elaboração;
2. descrição das turmas;
3. princípios de alinhamento e tratamento dos feriados;
4. cronologia por unidade, sem tabelas;
5. em cada semana, datas, turma teórica, turma prática, recursos e produto/evidência;
6. consolidação das avaliações e entregas;
7. referências curriculares e bibliográficas.

As seções semanais agruparão datas equivalentes de segunda/terça e quarta/quinta para evitar quatro cronogramas redundantes. Diferenças reais de calendário serão indicadas em itens próprios.

## 8. Referências curriculares externas

A progressão foi confrontada com currículos oficiais:

- Princeton, *Algorithms, 4th Edition*, capítulo de grafos: <https://algs4.cs.princeton.edu/home/>;
- MIT OpenCourseWare, 6.006 *Introduction to Algorithms*: <https://ocw.mit.edu/courses/6-006-introduction-to-algorithms-fall-2011/pages/calendar>;
- Stanford, CS161 *Design and Analysis of Algorithms*: <https://web.stanford.edu/class/archive/cs/cs161/cs161.1182/schedule.html>.

Essas referências sustentam a progressão de representações e buscas para conectividade, caminhos mínimos, árvores geradoras mínimas e fluxo. A organização final, entretanto, preservará as três unidades e os conteúdos obrigatórios do projeto de ensino da T290.

## 9. Critérios de aceitação

O cronograma estará correto quando:

- incluir todas as datas letivas entre 03/08 e 09/12;
- registrar explicitamente os feriados relevantes;
- manter separadas as funções das turmas teóricas e práticas;
- não incluir reposições externas nem compensações de carga horária;
- manter todas as turmas alinhadas por semana acadêmica;
- não avançar conteúdo nas terças-feiras de 08/09 e 03/11;
- associar cada prática a conteúdo teórico já apresentado ou sintetizado no bloco inicial do próprio encontro integrado;
- usar todos os encontros práticos oferecidos antes de cada apresentação para acompanhamento verificável da AP;
- reservar um encontro prático integral para a apresentação de cada AP e posicioná-lo antes da respectiva AT, exceto na AV3 das turmas de quarta-feira, cuja apresentação ocorrerá em 09/12 após a AT3;
- definir T1 como DFS/BFS, T2 como conectividade e problemas clássicos e T3 como otimização em três trilhas;
- selecionar problemas de plataformas como UVA, Kattis, Codeforces, CSES ou equivalentes, com dificuldade crescente entre T1, T2 e T3;
- cobrir as três unidades, os algoritmos disponíveis, os datasets e os trabalhos selecionados;
- registrar que cada AT ocupa um encontro teórico integral e contém dez questões objetivas no estilo ENADE no AVA/Moodle;
- posicionar AV1, AV2 e AV3 dentro dos prazos acadêmicos;
- distinguir carga horária institucional de encontros efetivamente realizados.
