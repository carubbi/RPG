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

| Pares | Turma teórica | Turma prática |
| --- | --- | --- |
| 09/19 | segunda-feira | quarta-feira |
| 16/17 | terça-feira | quinta-feira |
| 30/31 | terça-feira | quinta-feira |
| 62/63 | segunda-feira | quarta-feira |

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
- checkpoints e desenvolvimento dos trabalhos;
- apresentações e feedback.

As aulas práticas não serão convertidas em aulas teóricas para compensar feriados.

## 4. Tratamento dos feriados e alinhamento

Não haverá reposição, compensação de carga horária nem criação de encontros. Cada feriado será registrado como **“feriado — sem aula”** e contará conforme as regras institucionais.

O cronograma será alinhado por **semana acadêmica**, e não apenas pela sequência individual de datas. Um conteúdo novo somente avançará quando todas as turmas tiverem oportunidade equivalente de iniciá-lo na mesma semana.

### 4.1 Semanas que exigem tratamento específico

| Semana | Situação | Tratamento |
| --- | --- | --- |
| 07 a 10/09 | Segunda-feira, 07/09, é feriado; terça-feira é letiva | A terça-feira será revisão formativa, sem conteúdo novo. Quartas e quintas terão a mesma prática de consolidação. |
| 12 a 15/10 | Segunda-feira, 12/10, e terça-feira, 13/10, são feriados | Não haverá encontro teórico. Quartas e quintas manterão a mesma prática baseada em conteúdo já ensinado. |
| 02 a 05/11 | Segunda-feira, 02/11, é feriado; terça-feira é letiva | A terça-feira será revisão formativa, sem conteúdo novo. Quartas e quintas terão a mesma prática de consolidação. |
| 07 a 09/12 | O semestre termina na quarta-feira, 09/12 | Segunda e terça terão o mesmo fechamento teórico. A quarta-feira será dedicada ao feedback da AV3 e encerramento, sem conteúdo novo. |

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

### 5.2 Unidade II — Resolver problemas com grafos conexos

Referência institucional: **22 horas**.

Progressão:

1. busca em profundidade;
2. busca em largura e caminhos mínimos sem pesos;
3. avaliação AV1, após fundamentos, representações e buscas;
4. componentes conexas, ciclos e conectividade;
5. dígrafos, ordenação topológica e componentes fortemente conexas;
6. caminhos, trilhas, circuitos e grafos eulerianos;
7. problemas hamiltonianos, caixeiro viajante e carteiro chinês;
8. introdução a coloração, emparelhamento e isomorfismo;
9. avaliação AV2.

Os trabalhos da Unidade II serão selecionados como exercícios, checkpoints ou entregas. O cronograma não transformará automaticamente todos os seis trabalhos existentes em avaliações obrigatórias.

### 5.3 Unidade III — Otimizar grafos ponderados

Referência institucional: **38 horas**.

Progressão:

1. grafos ponderados e modelagem de problemas de otimização;
2. árvores geradoras mínimas com Kruskal, Prim e Union-Find;
3. caminhos mínimos com Dijkstra;
4. pesos negativos e Bellman-Ford;
5. caminhos mínimos entre todos os pares e Floyd-Warshall;
6. redes de fluxo, grafo residual e Ford-Fulkerson;
7. desenvolvimento, checkpoint e apresentação dos trabalhos;
8. AV3 e feedback.

Os três trabalhos existentes da Unidade III serão integrados ao cronograma como trilhas de projeto sobre árvore geradora mínima, caminhos mínimos e fluxo máximo.

## 6. Avaliações

O cronograma respeitará a metodologia do projeto de ensino:

- **AT:** questões teóricas objetivas, com ponderação de 20%;
- **AP:** codificação em Java ou Python, com ponderação de 80%;
- **AV1:** fundamentos, tipos, representações e buscas;
- **AV2:** grafos dirigidos e não dirigidos, conectividade e problemas clássicos;
- **AV3:** otimização em grafos ponderados, trabalhos e apresentações.

As avaliações serão posicionadas antes dos prazos institucionais:

- registro da AV1 até 21/09;
- registro da AV2 até 10/11;
- aplicação e feedback da AV3 entre 03 e 09/12;
- registro da AV3 até 11/12.

As datas específicas serão escolhidas de modo que todos os pares de turmas realizem avaliações equivalentes na mesma semana acadêmica.

## 7. Estrutura do cronograma final

O documento final conterá:

1. identificação e critérios de elaboração;
2. quadro das turmas;
3. princípios de alinhamento e tratamento dos feriados;
4. uma tabela cronológica para cada unidade;
5. em cada linha, semana, datas, tipo de turma, conteúdo, recursos e produto/evidência;
6. quadro consolidado de avaliações e entregas;
7. referências curriculares e bibliográficas.

As tabelas agruparão datas equivalentes de segunda/terça e quarta/quinta para evitar quatro cronogramas redundantes. Diferenças reais de calendário serão indicadas em linhas próprias.

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
- não incluir reposições ou compensações;
- manter todas as turmas alinhadas por semana acadêmica;
- não avançar conteúdo nas terças-feiras de 08/09 e 03/11;
- associar cada prática a conteúdo teórico já apresentado;
- cobrir as três unidades, os algoritmos disponíveis, os datasets e os trabalhos selecionados;
- posicionar AV1, AV2 e AV3 dentro dos prazos acadêmicos;
- distinguir carga horária institucional de encontros efetivamente realizados.
