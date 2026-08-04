# Desenho da skill `planejar-cronograma-docente`

## Objetivo

Criar uma skill pessoal e reutilizável entre disciplinas e repositórios para elaborar ou atualizar o cronograma docente como fonte canônica dos cronogramas discentes.

A skill deve trabalhar com o contexto encontrado no repositório em uso. Disciplina, período letivo, turmas, horários, calendário, projeto de ensino, avaliações e caminhos não podem ser fixados a T290 ou a 2026.2.

## Localização

A skill será instalada em `~/.codex/skills/planejar-cronograma-docente/`, para ficar disponível em diferentes repositórios.

O repositório RPG fornecerá o caso de referência inicial:

- fonte canônica: `prof/ensino/cronograma_2026_2_docente.md`;
- cronogramas discentes alimentados pela fonte:
  - `mat/ensino/cronograma_2026_2_turmas_09-19_62-63.md`;
  - `mat/ensino/cronograma_2026_2_turmas_16-17_30-31.md`.

Esses caminhos ilustram uma convenção local e não constituem nomes universais.

## Responsabilidade

A skill deve:

1. localizar as fontes institucionais e pedagógicas disponíveis no repositório;
2. determinar o caminho do cronograma docente pelo pedido do usuário ou pelas convenções locais;
3. elaborar ou atualizar o cronograma docente;
4. tratá-lo explicitamente como fonte canônica dos cronogramas discentes;
5. validar coerência pedagógica, temporal, avaliativa e documental;
6. identificar quais cronogramas discentes precisam ser sincronizados após a alteração;
7. relatar essa necessidade sem criar ou modificar cronogramas discentes.

A skill não deve:

- pressupor disciplina, semestre, dias, turmas ou estrutura de diretórios;
- inventar dados institucionais ausentes;
- compensar feriados ou alterar carga horária sem base documental;
- sobrescrever cronogramas discentes;
- apresentar os cronogramas discentes como documentos independentes ou apenas relacionados: eles têm o cronograma docente como fonte.

## Descoberta de contexto

A execução deve começar pela inspeção do repositório. A skill deve procurar, conforme existirem:

- instruções locais, como `AGENTS.md`;
- calendário acadêmico;
- projeto ou plano de ensino;
- turmas, horários e salas;
- matriz ou ementa;
- regras de avaliação;
- trabalhos, atividades e materiais didáticos;
- cronograma docente anterior ou do período corrente;
- cronogramas discentes cuja fonte declarada seja o cronograma docente.

Quando houver conflito, a skill deve expor a divergência e priorizar fontes institucionais explícitas. Não deve escolher silenciosamente uma versão.

Dados essenciais que não possam ser inferidos com segurança devem ser solicitados ao usuário, uma questão por vez.

## Estrutura do cronograma docente

A estrutura final deve adaptar-se às convenções do repositório, mas precisa representar:

- identificação da disciplina e do período;
- organização de todas as turmas e encontros;
- critérios de planejamento;
- cronograma por unidade, semana ou encontro;
- datas e ocorrências acadêmicas;
- conteúdos teóricos e práticos;
- atividades, acompanhamentos e evidências;
- recursos e referências;
- avaliações, entregas e janelas institucionais;
- decisões excepcionais e suas justificativas.

O conteúdo comum às turmas deve aparecer uma vez na fonte canônica. Diferenças entre grupos de turmas devem ser registradas de forma explícita, sem produzir prematuramente as versões discentes.

## Regras de planejamento

A skill deve verificar, no mínimo:

- correspondência entre datas e dias da semana;
- limites do período letivo;
- feriados, recessos e demais ocorrências oficiais;
- sequência de pré-requisitos entre conteúdos e atividades;
- equivalência formativa entre turmas;
- distribuição de unidades e avaliações;
- antecedência entre ensino, acompanhamento e cobrança;
- coerência entre projeto de ensino, cronograma e materiais;
- existência dos arquivos referenciados ou indicação clara de recursos externos;
- preservação de decisões justificadas já presentes no cronograma.

Mudanças de conteúdo não podem ser usadas para mascarar conflitos de calendário. Exceções devem ficar visíveis e fundamentadas.

## Atualização de arquivo existente

Ao atualizar um cronograma, a skill deve preservar decisões válidas e alterações manuais não relacionadas. Antes de editar, deve comparar o arquivo com as fontes atuais e separar:

- fatos institucionais;
- decisões pedagógicas;
- convenções de apresentação;
- inconsistências ou dados desatualizados.

A edição deve ser mínima em relação ao objetivo solicitado, mas completa quanto às dependências afetadas.

## Relação com os cronogramas discentes

Depois de elaborar ou atualizar a fonte canônica, a skill deve identificar os cronogramas discentes alimentados por ela. A identificação pode usar declarações no próprio documento, links, nomes de arquivo e convenções verificadas no repositório.

O resultado deve informar:

- quais cronogramas discentes foram identificados;
- quais aspectos da fonte mudaram e exigem sincronização;
- se não foi possível determinar com segurança todos os documentos alimentados pela fonte.

Essa etapa é somente leitura. A geração ou sincronização pertence a uma futura skill `gerar-cronogramas-discentes`.

## Saída da skill

A resposta final deve apresentar:

- caminho do cronograma docente criado ou atualizado;
- fontes consultadas;
- principais decisões e exceções;
- validações executadas e problemas restantes;
- cronogramas discentes que precisam ser sincronizados;
- dados que permaneceram pendentes por falta de fonte confiável.

## Recursos da skill

A implementação inicial deve ser concisa:

- `SKILL.md` com o fluxo, regras e contrato de saída;
- `agents/openai.yaml` com metadados de interface;
- referência curta com o contrato estrutural e a lista de validações, caso isso mantenha o arquivo principal enxuto.

Não será incluído um template rígido do cronograma, pois a estrutura varia entre disciplinas e repositórios. Scripts somente serão adicionados se o teste basal demonstrar repetição mecânica que justifique automatização.

## Validação da skill

Antes da implementação, um teste basal deve mostrar como um agente sem a skill trata o caso de referência. O teste deve observar especialmente:

- fixação indevida em T290 ou 2026.2;
- uso de apenas um cronograma discente como fonte;
- omissão de calendário, feriados, avaliações ou pré-requisitos;
- edição indevida dos cronogramas discentes;
- falha em declarar o cronograma docente como fonte canônica.

Depois da implementação, o mesmo cenário deve demonstrar que a skill:

- descobre as fontes antes de planejar;
- separa fatos de decisões pedagógicas;
- mantém a autoridade do cronograma docente;
- valida o arquivo produzido;
- indica a necessidade de sincronização sem editar os cronogramas discentes.

Além do teste comportamental, a estrutura da skill deve passar pelo validador oficial de skills.
