# Planejar Cronograma Docente Implementation Plan

> **For agentic workers:** REQUIRED SUB-SKILL: Use superpowers:subagent-driven-development (recommended) or superpowers:executing-plans to implement this plan task-by-task. Steps use checkbox (`- [ ]`) syntax for tracking.

**Goal:** Instalar uma skill pessoal que elabore ou atualize o cronograma docente como fonte canônica dos cronogramas discentes, valide sua consistência e indique quais versões discentes precisam ser sincronizadas sem editá-las.

**Architecture:** A skill terá um fluxo principal conciso em `SKILL.md` e um contrato detalhado em `references/contrato-cronograma.md`. Não haverá template rígido nem script gerador: o agente descobrirá as convenções e fontes do repositório antes de editar. O caso T290/2026.2 será usado somente nos testes comportamentais.

**Tech Stack:** Markdown, YAML, ferramentas locais de busca e edição, scripts oficiais `init_skill.py` e `quick_validate.py`.

## Global Constraints

- Instalar em `~/.codex/skills/planejar-cronograma-docente/` para reutilização entre repositórios.
- Não fixar disciplina, semestre, dias, turmas, avaliações ou caminhos do RPG na skill.
- Tratar o cronograma docente como fonte canônica dos cronogramas discentes.
- Não criar nem modificar cronogramas discentes.
- Não inventar dados institucionais ausentes; pedir somente os dados essenciais que não possam ser inferidos com segurança.
- Preservar alterações manuais não relacionadas ao atualizar um arquivo existente.
- Manter `SKILL.md` abaixo de 500 palavras e carregar a referência detalhada somente quando a skill for usada.

---

### Task 1: Registrar o comportamento basal sem a skill

**Files:**
- Read: `prof/ensino/cronograma_2026_2_docente.md`
- Read: `mat/ensino/cronograma_2026_2_turmas_09-19_62-63.md`
- Read: `mat/ensino/cronograma_2026_2_turmas_16-17_30-31.md`
- Read: `mat/ensino/calendario_2026_2.md`
- Read: `mat/ensino/proj_ensino_2026.md`
- Test artifact: `/private/tmp/planejar-cronograma-docente-baseline.md`

**Interfaces:**
- Consumes: repositório RPG sem acesso à nova skill.
- Produces: evidência basal classificada pelos cinco riscos definidos na especificação.

- [ ] **Step 1: Executar um cenário basal em contexto independente**

Usar um agente sem a nova skill e pedir somente análise, sem edição:

```text
No repositório atual, explique como você criaria ou atualizaria prof/ensino/cronograma_2026_2_docente.md para que seja a fonte dos cronogramas discentes. Indique fontes, validações, arquivos afetados e ações que executaria. Não modifique arquivos.
```

- [ ] **Step 2: Classificar a resposta basal**

Registrar `sim`, `não` e uma evidência textual para cada ocorrência:

```text
1. Fixa indevidamente T290 ou 2026.2 como regra geral.
2. Usa um cronograma discente como autoridade em vez de consultar fontes institucionais.
3. Omite calendário, feriados, avaliações ou pré-requisitos pedagógicos.
4. Propõe editar os cronogramas discentes dentro da mesma operação.
5. Não declara o cronograma docente como fonte canônica.
```

- [ ] **Step 3: Confirmar a necessidade da skill**

Prosseguir somente se pelo menos um risco aparecer ou se a resposta variar de modo que não ofereça contrato verificável. Se nenhum risco aparecer, acrescentar ao cenário a atualização de uma disciplina hipotética em outro repositório e repetir, para testar generalização em vez de forçar uma falha artificial no caso RPG.

---

### Task 2: Inicializar a skill e escrever o contrato reutilizável

**Files:**
- Create: `~/.codex/skills/planejar-cronograma-docente/SKILL.md`
- Create: `~/.codex/skills/planejar-cronograma-docente/agents/openai.yaml`
- Create: `~/.codex/skills/planejar-cronograma-docente/references/contrato-cronograma.md`

**Interfaces:**
- Consumes: riscos observados no teste basal e a especificação aprovada.
- Produces: estrutura oficial da skill e contrato detalhado usado pelo fluxo principal.

- [ ] **Step 1: Inicializar com o gerador oficial**

Executar:

```bash
python3 /Users/carubbi/.codex/skills/.system/skill-creator/scripts/init_skill.py planejar-cronograma-docente \
  --path /Users/carubbi/.codex/skills \
  --resources references \
  --interface 'display_name=Planejar cronograma docente' \
  --interface 'short_description=Planeja a fonte dos cronogramas discentes' \
  --interface 'default_prompt=Use $planejar-cronograma-docente para elaborar a fonte canônica dos cronogramas discentes.'
```

Resultado esperado: diretório criado com `SKILL.md`, `agents/openai.yaml` e `references/`.

- [ ] **Step 2: Escrever a referência estrutural**

Substituir `references/contrato-cronograma.md` por um contrato com estas seções e exigências exatas:

```markdown
# Contrato do cronograma docente

## Fontes a localizar
Instruções locais; calendário acadêmico; projeto ou plano de ensino; turmas, horários e salas; ementa ou matriz; avaliações; trabalhos; materiais; cronograma docente anterior; cronogramas discentes cuja fonte declarada seja o cronograma docente.

## Autoridade e conflitos
Separar fatos institucionais, decisões pedagógicas e convenções editoriais. Priorizar fontes institucionais explícitas e expor conflitos sem decidir silenciosamente.

## Conteúdo mínimo
Identificação; organização de todas as turmas; critérios de planejamento; sequência por unidade, semana ou encontro; datas e ocorrências; teoria e prática; atividades e evidências; recursos; avaliações e entregas; exceções justificadas.

## Validações
Conferir dias da semana, período letivo, ocorrências oficiais, pré-requisitos, equivalência formativa, distribuição das avaliações, antecedência entre ensino e cobrança, coerência com o projeto de ensino, referências de arquivos e preservação de decisões justificadas.

## Impacto discente
Identificar, somente para leitura, os cronogramas discentes alimentados pela fonte. Informar quais documentos e aspectos precisam de sincronização. Nunca os editar.

## Contrato da resposta
Informar caminho editado, fontes consultadas, decisões e exceções, validações, problemas restantes, cronogramas discentes a sincronizar e dados pendentes sem fonte confiável.
```

- [ ] **Step 3: Verificar que a referência não contém regras específicas de T290**

Executar:

```bash
rg -n 'T290|2026\.2|09/19|16/17|30/31|62/63|RPG' /Users/carubbi/.codex/skills/planejar-cronograma-docente
```

Resultado esperado: nenhuma ocorrência.

---

### Task 3: Escrever o fluxo operacional da skill

**Files:**
- Modify: `~/.codex/skills/planejar-cronograma-docente/SKILL.md`
- Verify: `~/.codex/skills/planejar-cronograma-docente/agents/openai.yaml`
- Read: `~/.codex/skills/planejar-cronograma-docente/references/contrato-cronograma.md`

**Interfaces:**
- Consumes: contrato estrutural da Task 2.
- Produces: comportamento acionável e mecanismo de descoberta da skill.

- [ ] **Step 1: Escrever o frontmatter**

Usar somente os campos permitidos:

```yaml
---
name: planejar-cronograma-docente
description: Use quando for necessário criar, revisar ou atualizar um cronograma docente que funcione como fonte canônica de cronogramas discentes, especialmente ao conciliar calendário acadêmico, turmas, conteúdos, atividades, avaliações, feriados e diferentes dias de aula entre disciplinas ou repositórios.
---
```

- [ ] **Step 2: Escrever o fluxo principal em forma imperativa**

O corpo deve exigir, nesta ordem:

1. ler integralmente `references/contrato-cronograma.md`;
2. inspecionar instruções e fontes do repositório antes de propor ou editar;
3. determinar o arquivo-alvo pelo pedido ou por convenção verificada;
4. separar fatos institucionais, decisões pedagógicas e forma editorial;
5. pedir uma informação por vez somente quando faltar dado essencial;
6. apresentar conflitos ou decisões pedagógicas materiais antes de incorporá-los;
7. elaborar ou atualizar apenas a fonte canônica, preservando mudanças não relacionadas;
8. validar o resultado conforme o contrato;
9. identificar os cronogramas discentes alimentados pela fonte e relatar a sincronização necessária sem editá-los;
10. entregar a resposta no contrato definido pela referência.

Incluir dois guardrails explícitos: não usar cronograma discente como autoridade para fatos institucionais e não converter esta skill em geradora de cronogramas discentes.

- [ ] **Step 3: Verificar concisão e metadados**

Executar:

```bash
wc -w /Users/carubbi/.codex/skills/planejar-cronograma-docente/SKILL.md
sed -n '1,120p' /Users/carubbi/.codex/skills/planejar-cronograma-docente/agents/openai.yaml
```

Resultados esperados: menos de 500 palavras; strings YAML entre aspas; `default_prompt` menciona `$planejar-cronograma-docente`.

---

### Task 4: Validar estrutura e comportamento

**Files:**
- Test: `~/.codex/skills/planejar-cronograma-docente/`
- Test fixture root: `/private/tmp/planejar-cronograma-docente-forward/`
- Test artifact: `/private/tmp/planejar-cronograma-docente-forward-result.md`

**Interfaces:**
- Consumes: skill completa das Tasks 2 e 3.
- Produces: validação oficial e evidência de que a skill corrige os riscos basais sem editar os cronogramas discentes.

- [ ] **Step 1: Executar o validador oficial**

```bash
python3 /Users/carubbi/.codex/skills/.system/skill-creator/scripts/quick_validate.py /Users/carubbi/.codex/skills/planejar-cronograma-docente
```

Resultado esperado: `Skill is valid!`.

- [ ] **Step 2: Preparar uma cópia temporária do caso de referência**

Copiar para `/private/tmp/planejar-cronograma-docente-forward/` somente `prof/ensino/`, `mat/ensino/`, `mat/trabalhos/`, `mat/aulas/` e `dataset/README.md`. Registrar hashes dos dois cronogramas discentes antes do teste.

- [ ] **Step 3: Executar o cenário com a skill em contexto independente**

Usar este pedido:

```text
Use $planejar-cronograma-docente em /private/tmp/planejar-cronograma-docente-forward para revisar a fonte canônica prof/ensino/cronograma_2026_2_docente.md. Verifique fontes, coerência e impacto nos cronogramas discentes. Corrija somente problemas comprovados na fonte canônica; não altere os cronogramas discentes.
```

- [ ] **Step 4: Avaliar o resultado comportamental**

Confirmar os cinco critérios:

```text
1. Consultou fontes institucionais e pedagógicas antes de editar.
2. Declarou o cronograma docente como fonte canônica.
3. Verificou datas, ocorrências, avaliações e pré-requisitos.
4. Não modificou os hashes dos cronogramas discentes.
5. Informou quais cronogramas discentes precisam de sincronização e por quê.
```

Se algum critério falhar, ajustar somente a instrução responsável no `SKILL.md` ou no contrato e repetir os Steps 1, 3 e 4.

- [ ] **Step 5: Executar a verificação final**

```bash
python3 /Users/carubbi/.codex/skills/.system/skill-creator/scripts/quick_validate.py /Users/carubbi/.codex/skills/planejar-cronograma-docente
rg -n 'T290|2026\.2|09/19|16/17|30/31|62/63|RPG' /Users/carubbi/.codex/skills/planejar-cronograma-docente
wc -w /Users/carubbi/.codex/skills/planejar-cronograma-docente/SKILL.md
```

Resultados esperados: skill válida; nenhuma regra específica do caso de referência; `SKILL.md` abaixo de 500 palavras.
