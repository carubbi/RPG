# Desenho da skill `gerar-cronograma-discente`

## Objetivo

Criar uma skill pessoal e reutilizável entre disciplinas e repositórios para gerar cronogramas discentes a partir de um cronograma docente canônico. A skill deve criar arquivos ausentes e sincronizar arquivos existentes sem transformar a versão discente em uma segunda fonte de verdade.

## Localização

A skill será instalada em `~/.codex/skills/gerar-cronograma-discente/`.

O repositório RPG fornecerá o caso de referência inicial:

- fonte canônica: `prof/ensino/cronograma_2026_2_docente.md`;
- derivado de referência: `mat/ensino/cronograma_2026_2_turmas_09-19_62-63.md`;
- outro grupo derivado: `mat/ensino/cronograma_2026_2_turmas_16-17_30-31.md`.

Esses caminhos e identificadores não serão fixados na skill. Eles servem apenas para especificação e testes.

## Autoridade documental

O cronograma docente é a única autoridade sobre datas, conteúdos, avaliações, atividades, entregas e ocorrências. Projeto de ensino, calendário, turmas e horários podem validar a derivação, mas não podem ser usados para alterar silenciosamente a fonte durante a geração.

Um cronograma discente existente pode fornecer conteúdo exclusivamente discente, mas nunca corrigir ou substituir a autoridade da fonte docente.

## Fluxo operacional

1. Ler as instruções locais da repo-alvo.
2. Localizar o cronograma docente pelo caminho informado ou por convenção comprovada.
3. Confirmar que ele se declara fonte canônica.
4. Identificar as turmas e agrupá-las por equivalência real de calendário, sequência e ocorrências.
5. Localizar cronogramas discentes existentes vinculados à fonte.
6. Determinar os arquivos-alvo pelo pedido ou pelas convenções verificadas; solicitar o caminho somente se persistir ambiguidade.
7. Preparar em área temporária uma projeção discente para cada grupo.
8. Comparar cada projeção com o arquivo existente, quando houver.
9. Validar a projeção e somente então criar ou substituir o alvo.
10. Relatar arquivos, grupos, deltas, preservações, validações, conflitos e pendências.

## Agrupamento de turmas

Turmas somente poderão compartilhar um cronograma discente quando forem equivalentes quanto a dias de aula, sequência pedagógica, avaliações, entregas e ocorrências que afetem encontros.

A proximidade de horários ou a existência de conteúdo comum não comprova equivalência. Quando grupos tiverem datas ou exceções diferentes, deverão receber arquivos distintos.

## Projeção discente

A versão discente será detalhada. Ela manterá:

- identificação, período, turmas, horários e salas do grupo;
- unidades, semanas ou encontros;
- conteúdos teóricos e práticos;
- atividades, acompanhamentos e evidências;
- avaliações, composições, entregas, revisões e segundas chamadas;
- recursos e links úteis;
- orientações necessárias ao estudante.

A transformação deverá:

- ajustar título e declaração de derivação;
- selecionar somente as turmas do grupo;
- converter datas combinadas da fonte em datas específicas do grupo;
- preservar diferenças legítimas causadas pelo calendário;
- converter critérios pertinentes em orientações discentes;
- adaptar links relativos ao diretório do arquivo-alvo;
- remover conteúdo exclusivamente docente;
- não criar conteúdo pedagógico ausente na fonte.

## Classificação do conteúdo

### Conteúdo derivado

Identificação, turmas, datas, unidades, aulas, avaliações, entregas, recursos e evidências. Deve corresponder à fonte e ser atualizado quando ela mudar.

### Conteúdo exclusivamente discente

Orientações de acesso, instruções de submissão, links diretos para enunciados e explicações úteis aos estudantes. Deve ser preservado quando compatível com a fonte.

### Conteúdo exclusivamente docente

Critérios de planejamento, justificativas internas, decisões administrativas, notas de validação e informações restritas. Não deve ser publicado.

### Conteúdo conflitante

Informação manual discente que contradiga a fonte quanto a datas, avaliações, conteúdos ou ocorrências. Não deve ser preservada nem substituída silenciosamente. A skill deve apresentar o conflito e solicitar decisão antes de uma substituição material.

## Atualização segura

Cada arquivo será atualizado de forma transacional:

1. capturar existência, conteúdo ou hash e estado de versionamento do alvo;
2. gerar uma versão temporária;
3. comparar o delta com a fonte e o baseline;
4. validar o arquivo temporário;
5. substituir somente o alvo validado.

Se uma validação falhar, o arquivo afetado não será substituído. Alterações manuais não relacionadas e arquivos não autorizados devem permanecer intactos.

## Validações

Para cada derivado, conferir:

- presença exclusiva das turmas do grupo;
- correspondência de datas e dias da semana;
- equivalência de unidades, aulas, avaliações, entregas e segunda chamada;
- preservação de diferenças legítimas entre grupos;
- ausência de seções internas, notas docentes e caminhos restritos a `prof/`;
- validade dos links relativos;
- preservação do conteúdo exclusivamente discente compatível;
- inexistência de conteúdo pedagógico inventado;
- ausência de alterações fora do alvo;
- integridade do cronograma docente.

## Falhas e conflitos

Dados essenciais sem fonte confiável devem permanecer pendentes. A skill pedirá uma única informação por vez somente quando a ausência impedir a derivação.

Conflitos materiais entre conteúdo manual e fonte docente devem ser apresentados antes de qualquer substituição destrutiva. Uma falha em um grupo não autoriza publicar uma versão parcial ou inválida daquele arquivo.

## Contrato da resposta

A resposta final informará:

- fonte docente utilizada;
- cronogramas discentes criados ou sincronizados;
- grupos de turmas representados;
- baseline e delta de cada alvo;
- conteúdo discente preservado;
- conteúdo docente removido;
- validações executadas;
- conflitos, problemas e dados pendentes;
- arquivos que permaneceram inalterados.

## Estrutura da skill

A implementação inicial terá:

- `SKILL.md` com o fluxo essencial;
- `agents/openai.yaml` com metadados de interface;
- `references/contrato-cronograma-discente.md` com transformação, validação e resposta.

Não haverá template rígido, pois nomes, estruturas e agrupamentos variam entre repos. Scripts somente serão adicionados se os testes demonstrarem uma transformação mecânica estável que não elimine o julgamento necessário.

## Testes

Antes da implementação, um cenário basal sem a skill deverá operar sobre uma cópia temporária do caso RPG e revelar falhas naturais, como copiar a fonte sem adaptação, tratar o discente como autoridade, perder conteúdo discente ou publicar informações internas.

Depois da implementação, o mesmo cenário deverá demonstrar que a skill:

- encontra e respeita a fonte canônica;
- identifica o grupo 09/19 e 62/63;
- deriva datas e conteúdo corretos;
- preserva conteúdo discente compatível;
- remove conteúdo exclusivamente docente;
- adapta links relativos;
- não modifica o cronograma docente;
- não altera arquivos fora do alvo;
- entrega um relatório verificável.

Além do teste comportamental, a estrutura deverá passar pelo validador oficial de skills. Todos os testes de escrita ocorrerão em cópias temporárias, nunca nos cronogramas reais.
