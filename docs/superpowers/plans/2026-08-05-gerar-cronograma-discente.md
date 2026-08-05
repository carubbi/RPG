# Gerar Cronograma Discente Implementation Plan

> **For agentic workers:** REQUIRED SUB-SKILL: Use superpowers:subagent-driven-development (recommended) or superpowers:executing-plans to implement this plan task-by-task. Steps use checkbox (`- [ ]`) syntax for tracking.

**Goal:** Instalar uma skill pessoal que crie e sincronize cronogramas discentes como projeções detalhadas de um cronograma docente canônico, preservando conteúdo exclusivamente discente compatível.

**Architecture:** A skill global terá um fluxo conciso em `SKILL.md` e um contrato detalhado em `references/contrato-cronograma-discente.md`. Não haverá template nem script gerador: o agente descobrirá fonte, grupos equivalentes, alvos e convenções da repo, preparará cada derivado em área temporária e só substituirá um alvo depois das validações.

**Tech Stack:** Markdown, YAML, ferramentas locais de busca e edição, scripts oficiais `init_skill.py`, `generate_openai_yaml.py` e `quick_validate.py`.

## Global Constraints

- Instalar em `/Users/carubbi/.codex/skills/gerar-cronograma-discente/`.
- Tratar o cronograma docente como única autoridade sobre datas, conteúdos, avaliações, atividades, entregas e ocorrências.
- Criar arquivos ausentes e sincronizar arquivos existentes.
- Preservar conteúdo exclusivamente discente compatível e apresentar conflitos materiais antes de substituí-los.
- Agrupar turmas somente quando calendário, sequência e ocorrências forem equivalentes.
- Produzir versões detalhadas, sem critérios internos, decisões administrativas, validações ou caminhos restritos a `prof/`.
- Preparar e validar cada arquivo em área temporária antes de substituir o alvo.
- Não modificar o cronograma docente nem arquivos fora dos alvos autorizados.
- Não fixar disciplina, semestre, turmas, dias ou caminhos dos casos RPG e RLA na skill.
- Manter `SKILL.md` abaixo de 500 palavras.

---

### Task 1: Registrar o comportamento basal sem a skill

**Files:**
- Read: `prof/ensino/cronograma_2026_2_docente.md`
- Read: `mat/ensino/cronograma_2026_2_turmas_09-19_62-63.md`
- Create temporarily: `/private/tmp/gerar-cronograma-discente-tests/baseline/`
- Produce temporarily: `/private/tmp/gerar-cronograma-discente-tests/baseline-result.md`

**Interfaces:**
- Consumes: fonte e derivado reais somente para leitura.
- Produces: evidência basal classificada que orientará a redação mínima da skill.

- [ ] **Step 1: Preparar a fixture basal**

Criar `/private/tmp/gerar-cronograma-discente-tests/baseline/` com uma cópia do repositório RPG sem `.git/`, `.agents/`, `.codex/` ou `node_modules/`. Remover da fixture o derivado 16/17–30/31 para limitar o alvo ao grupo testado. Registrar os hashes da fonte e do derivado 09/19–62/63 copiados.

- [ ] **Step 2: Introduzir um conflito apenas na cópia**

Na cópia discente, trocar a data da AT1 por `16/09` e acrescentar a orientação exclusivamente discente `- **Canal de dúvidas:** fórum da turma no AVA.`. A fonte docente permanece intacta.

- [ ] **Step 3: Executar o cenário sem a nova skill**

Usar um subagente em contexto independente, sem fornecer a especificação nem a skill:

```text
No diretório /private/tmp/gerar-cronograma-discente-tests/baseline, sincronize o cronograma discente das turmas 09/19 e 62/63 com o cronograma docente. Preserve informações úteis aos estudantes, ajuste links e não altere a fonte docente. Registre sua análise e ações em /private/tmp/gerar-cronograma-discente-tests/baseline-result.md.
```

- [ ] **Step 4: Classificar a falha basal**

Registrar evidência textual para estes critérios:

```text
1. Reconheceu explicitamente a fonte docente como única autoridade.
2. Corrigiu a data conflitante pela fonte sem perder o canal de dúvidas.
3. Removeu critérios e decisões exclusivamente docentes.
4. Manteve somente as turmas do grupo solicitado.
5. Validou links relativos e integridade da fonte.
6. Produziu baseline e delta verificáveis.
```

Prosseguir se ao menos um critério falhar ou se a resposta não estabelecer um contrato verificável. Não alterar a skill antes de registrar a evidência basal.

---

### Task 2: Inicializar e escrever a skill mínima

**Files:**
- Create: `/Users/carubbi/.codex/skills/gerar-cronograma-discente/SKILL.md`
- Create: `/Users/carubbi/.codex/skills/gerar-cronograma-discente/agents/openai.yaml`
- Create: `/Users/carubbi/.codex/skills/gerar-cronograma-discente/references/contrato-cronograma-discente.md`
- Read: `/Users/carubbi/.codex/skills/.system/skill-creator/references/openai_yaml.md`

**Interfaces:**
- Consumes: falhas registradas na Task 1 e a especificação aprovada.
- Produces: skill global com contrato de transformação e resposta.

- [ ] **Step 1: Ler as regras dos metadados**

Ler integralmente `/Users/carubbi/.codex/skills/.system/skill-creator/references/openai_yaml.md`.

- [ ] **Step 2: Inicializar com o gerador oficial**

Executar:

```bash
python3 /Users/carubbi/.codex/skills/.system/skill-creator/scripts/init_skill.py gerar-cronograma-discente \
  --path /Users/carubbi/.codex/skills \
  --resources references \
  --interface 'display_name=Gerar cronograma discente' \
  --interface 'short_description=Deriva cronogramas discentes da fonte docente' \
  --interface 'default_prompt=Use $gerar-cronograma-discente para criar ou sincronizar cronogramas discentes a partir da fonte docente canônica.'
```

Resultado esperado: diretório com `SKILL.md`, `agents/openai.yaml` e `references/`.

- [ ] **Step 3: Escrever o contrato de derivação**

Criar `references/contrato-cronograma-discente.md` com estas seções:

```markdown
# Contrato do cronograma discente

## Autoridade e fontes
Definir o cronograma docente como única autoridade e as demais fontes como validação.

## Descoberta de grupos e alvos
Exigir equivalência real para agrupamento e convenções verificadas para nomes.

## Classificação do conteúdo
Definir conteúdo derivado, exclusivamente discente, exclusivamente docente e conflitante. Estabelecer que um campo derivado divergente, mesmo editado manualmente, retorna automaticamente ao valor da fonte; somente conteúdo exclusivamente discente incompatível exige decisão.

## Projeção
Definir seleção de turmas e datas, linguagem discente, preservação de detalhe e adaptação de links.

## Atualização transacional
Exigir baseline, staging, comparação, validação e substituição somente depois de aprovação material quando houver conflito.

## Validações
Listar turmas, datas, dias, unidades, encontros, avaliações, entregas, segunda chamada, links, conteúdo preservado, ausência de conteúdo interno e integridade da fonte.

## Contrato da resposta
Exigir fonte, alvos, grupos, baseline, delta, preservações, remoções, validações, conflitos, pendências e arquivos inalterados.
```

- [ ] **Step 4: Escrever `SKILL.md`**

Usar somente `name` e `description` no frontmatter:

```yaml
---
name: gerar-cronograma-discente
description: Use quando for necessário criar, derivar, atualizar ou sincronizar cronogramas discentes a partir de um cronograma docente canônico, especialmente para separar grupos de turmas com calendários distintos e preservar orientações discentes entre repositórios.
---
```

O corpo, em forma imperativa, deve exigir:

1. ler integralmente o contrato;
2. ler instruções locais;
3. localizar e capturar o hash da fonte;
4. identificar grupos equivalentes e alvos;
5. capturar o baseline de cada alvo;
6. classificar conteúdo existente;
7. preparar projeções temporárias;
8. apresentar conflitos materiais antes de substituir;
9. validar e instalar somente alvos aprovados;
10. confirmar que a fonte e arquivos externos ficaram intactos;
11. responder conforme o contrato.

Incluir explicitamente que um cronograma discente nunca corrige a fonte e que a execução não deve chamar `planejar-cronograma-docente` para alterar a fonte.

- [ ] **Step 5: Verificar concisão e generalidade**

Executar:

```bash
wc -w /Users/carubbi/.codex/skills/gerar-cronograma-discente/SKILL.md
rg -n 'T290|T160|2026\\.2|09/19|62/63|90/91|RPG|RLA' /Users/carubbi/.codex/skills/gerar-cronograma-discente
```

Resultados esperados: menos de 500 palavras e nenhuma ocorrência específica dos casos.

---

### Task 3: Validar estrutura e metadados

**Files:**
- Test: `/Users/carubbi/.codex/skills/gerar-cronograma-discente/`

**Interfaces:**
- Consumes: skill da Task 2.
- Produces: estrutura oficial válida e metadados consistentes.

- [ ] **Step 1: Executar o validador oficial**

```bash
python3 /Users/carubbi/.codex/skills/.system/skill-creator/scripts/quick_validate.py /Users/carubbi/.codex/skills/gerar-cronograma-discente
```

Resultado esperado: `Skill is valid!`.

- [ ] **Step 2: Inspecionar os metadados**

```bash
sed -n '1,120p' /Users/carubbi/.codex/skills/gerar-cronograma-discente/agents/openai.yaml
```

Confirmar `display_name`, `short_description` e `default_prompt`, com `$gerar-cronograma-discente` preservado literalmente.

- [ ] **Step 3: Verificar os arquivos permitidos**

```bash
find /Users/carubbi/.codex/skills/gerar-cronograma-discente -type f -print | sort
```

Resultado esperado: somente `SKILL.md`, `agents/openai.yaml` e `references/contrato-cronograma-discente.md`.

---

### Task 4: Executar os testes comportamentais com a skill

**Files:**
- Test fixture: `/private/tmp/gerar-cronograma-discente-tests/forward-rpg/`
- Test fixture: `/private/tmp/gerar-cronograma-discente-tests/forward-rla/`
- Test output: arquivos derivados somente dentro das fixtures.

**Interfaces:**
- Consumes: skill instalada e casos reais copiados.
- Produces: evidência de sincronização e criação sem alteração das fontes.

- [ ] **Step 1: Preparar a fixture RPG de sincronização**

Criar `forward-rpg/` com uma cópia do repositório RPG sem `.git/`, `.agents/`, `.codex/` ou `node_modules/`. Remover o derivado 16/17–30/31, introduzir no derivado restante a mesma data conflitante e o mesmo canal de dúvidas da Task 1 e usar `mat/ensino/proj_ensino_2026.md` como sentinela. Registrar hashes da fonte e do sentinela.

- [ ] **Step 2: Executar a sincronização RPG com a skill**

Usar um subagente em contexto independente:

```text
Use $gerar-cronograma-discente em /private/tmp/gerar-cronograma-discente-tests/forward-rpg para sincronizar o cronograma discente das turmas 09/19 e 62/63 com a fonte docente. Preserve conteúdo exclusivamente discente compatível e não altere a fonte nem outros arquivos.
```

- [ ] **Step 3: Validar o resultado RPG**

Confirmar:

```text
- data conflitante corrigida pela fonte;
- canal de dúvidas preservado;
- somente turmas 09/19 e 62/63;
- critérios e decisões docentes ausentes;
- links locais válidos;
- hashes da fonte e do sentinela inalterados;
- relatório com baseline, delta e preservações.
```

- [ ] **Step 4: Preparar a fixture RLA de criação**

Criar `forward-rla/` com uma cópia do repositório RLA sem `.git/`, `.agents/`, `.codex/` ou `node_modules/`. Remover `mat/ensino/cronograma_2026_2_turmas_90-91.md` da fixture e usar `ensino/proj_ensino_2026.md` como sentinela. Registrar os hashes da fonte e do sentinela.

- [ ] **Step 5: Executar a criação RLA com a skill**

Usar um novo subagente:

```text
Use $gerar-cronograma-discente em /private/tmp/gerar-cronograma-discente-tests/forward-rla para criar o cronograma discente do único grupo de turmas identificado. Não altere a fonte docente nem outros arquivos.
```

- [ ] **Step 6: Validar o resultado RLA**

Confirmar:

```text
- um único derivado para o único grupo equivalente;
- título e declaração de derivação;
- 19 semanas acadêmicas, 4 unidades e 36 encontros;
- AFs, ASs, revisões e segundas chamadas iguais à fonte;
- ausência de decisões docentes e caminhos `prof/`;
- links locais válidos;
- hashes da fonte e do sentinela inalterados;
- relatório conforme o contrato.
```

Se qualquer critério falhar, alterar somente a instrução responsável, repetir o validador oficial e executar novamente o cenário afetado.

---

### Task 5: Verificar instalação global

**Files:**
- Verify: `/Users/carubbi/.codex/skills/gerar-cronograma-discente/`
- Read: `/Users/carubbi/.codex/skills/gerar-cronograma-discente/SKILL.md`

**Interfaces:**
- Consumes: skill aprovada nos testes.
- Produces: evidência de disponibilidade entre repos.

- [ ] **Step 1: Executar a verificação final**

```bash
python3 /Users/carubbi/.codex/skills/.system/skill-creator/scripts/quick_validate.py /Users/carubbi/.codex/skills/gerar-cronograma-discente
wc -w /Users/carubbi/.codex/skills/gerar-cronograma-discente/SKILL.md
rg -n 'T290|T160|2026\\.2|09/19|62/63|90/91|RPG|RLA' /Users/carubbi/.codex/skills/gerar-cronograma-discente
```

Resultados esperados: skill válida, `SKILL.md` abaixo de 500 palavras e nenhuma regra específica de disciplina ou repo.

- [ ] **Step 2: Confirmar descoberta**

Iniciar um contexto novo ou listar as skills disponíveis e confirmar que `gerar-cronograma-discente` aparece com a descrição e o prompt corretos.

- [ ] **Step 3: Registrar o resultado**

Informar o caminho global, os três arquivos instalados, os testes executados, limitações remanescentes e confirmação de que os cronogramas reais não foram modificados durante os testes.
