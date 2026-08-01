# Matrizes Curriculares Detalhadas Implementation Plan

> **For agentic workers:** REQUIRED SUB-SKILL: Use superpowers:subagent-driven-development (recommended) or superpowers:executing-plans to implement this plan task-by-task. Steps use checkbox (`- [ ]`) syntax for tracking.

**Goal:** Gerar duas matrizes curriculares detalhadas em Markdown, com ementas e programas, a partir das páginas oficiais da Unifor.

**Architecture:** Baixar os HTMLs oficiais para arquivos temporários, transformá-los em uma estrutura intermediária validável e renderizar dois documentos Markdown. O extrator temporário separará disciplinas obrigatórias e optativas e descartará os blocos de professores e bibliografias antes da renderização.

**Tech Stack:** Python 3 com biblioteca padrão (`html.parser`, `dataclasses`, `pathlib`, `re`), Markdown e comandos de validação `rg`/`git diff --check`.

## Global Constraints

- Criar `plan/matriz_curricular_engenharia_computacao.md`.
- Criar `plan/matriz_curricular_ciencia_computacao.md`.
- Usar somente listas e títulos Markdown; não usar tabelas.
- Preservar código, nome, modalidade, créditos, ementa, unidades, objetivos e conteúdos publicados.
- Excluir professores, perfis, currículos Lattes e bibliografias.
- Não inferir carga horária nem completar informação ausente por presunção.
- Registrar fonte oficial e data de acesso de 01/08/2026.
- Preservar a ordem publicada de semestres, disciplinas, unidades, objetivos e conteúdos.

---

### Task 1: Extrator temporário e testes estruturais

**Files:**
- Create: `/private/tmp/extract_unifor_curricula.py`
- Create: `/private/tmp/test_extract_unifor_curricula.py`
- Read: `/private/tmp/unifor-eng-comp.html`
- Read: `/private/tmp/unifor-ciencia-comp.html`

**Interfaces:**
- Consumes: HTML completo das duas páginas oficiais.
- Produces: `parse_curriculum(html: str) -> Curriculum`.
- Produces: `render_curriculum(title: str, source_url: str, curriculum: Curriculum) -> str`.
- `Curriculum.required` deve ser `list[Semester]`.
- `Curriculum.optatives` deve ser `list[Subject]`.
- `Subject` deve conter `code`, `name`, `mode`, `credits`, `syllabus` e `program_units`.
- `ProgramUnit` deve conter `title`, `objectives` e `contents`.

- [ ] **Step 1: Escrever testes de contagem e estrutura**

Criar testes com `unittest` que verifiquem:

```python
EXPECTED_ENGINEERING = {
    1: 5, 2: 5, 3: 6, 4: 5, 5: 6,
    6: 5, 7: 8, 8: 5, 9: 7, 10: 5,
}
EXPECTED_COMPUTER_SCIENCE = {
    1: 6, 2: 5, 3: 7, 4: 5,
    5: 7, 6: 6, 7: 7, 8: 6,
}

self.assertEqual(
    {semester.number: len(semester.subjects) for semester in engineering.required},
    EXPECTED_ENGINEERING,
)
self.assertEqual(len(engineering.optatives), 30)
self.assertEqual(
    {semester.number: len(semester.subjects) for semester in computer_science.required},
    EXPECTED_COMPUTER_SCIENCE,
)
self.assertEqual(len(computer_science.optatives), 31)
```

Adicionar testes que exijam código, nome, créditos e ementa não vazios quando publicados e que confirmem a ausência de `Professores:`, `Bibliografia:`, `currículo lattes` e linhas iniciadas por `|` no Markdown renderizado.

- [ ] **Step 2: Executar os testes para comprovar a falha inicial**

Run:

```bash
python3 -m unittest -v /private/tmp/test_extract_unifor_curricula.py
```

Expected: `ModuleNotFoundError` para `extract_unifor_curricula`.

- [ ] **Step 3: Implementar o parser HTML**

Implementar `HTMLParser` com estado explícito para:

- detectar `Semestre N`;
- detectar componentes obrigatórios por `subject_h_N_M`;
- detectar optativos por `subject_h_optatives_M`;
- capturar o texto do acionador da disciplina;
- capturar `Créditos`, `Ementa` e `Programa`;
- dentro de `Programa`, separar títulos `UNIDADE`, parágrafos de objetivos e itens de conteúdo;
- ignorar qualquer conteúdo entre o título `Professores:` e `Ementa:`;
- encerrar a captura da disciplina antes de `Bibliografia:`.

Normalizar entidades HTML, espaços repetidos e quebras de linha, sem reescrever o conteúdo acadêmico.

- [ ] **Step 4: Implementar o renderizador em listas**

Renderizar cada disciplina desta forma:

```markdown
### T946 — Exper desafios em engenharia

- **Modalidade:** Presencial
- **Créditos:** 3.1
- **Ementa:** Contribuição da engenharia para a sociedade. [...]
- **Programa:**
  - **UNIDADE I — Contribuição da engenharia para a sociedade**
    - **Objetivos:**
      - Explicar a importância [...]
    - **Conteúdos:**
      - 01.01 — A ciência na engenharia.
```

Quando a fonte não publicar ementa ou programa, usar respectivamente:

```markdown
- **Ementa:** não disponibilizada na página consultada.
- **Programa:** não disponibilizado na página consultada.
```

- [ ] **Step 5: Executar os testes**

Run:

```bash
python3 -m unittest -v /private/tmp/test_extract_unifor_curricula.py
```

Expected: todos os testes com `OK`.

---

### Task 2: Gerar as duas matrizes curriculares

**Files:**
- Create: `plan/matriz_curricular_engenharia_computacao.md`
- Create: `plan/matriz_curricular_ciencia_computacao.md`
- Read: `/private/tmp/extract_unifor_curricula.py`

**Interfaces:**
- Consumes: `parse_curriculum` e `render_curriculum` da Task 1.
- Produces: dois documentos Markdown em UTF-8.

- [ ] **Step 1: Gerar Engenharia da Computação**

Run:

```bash
python3 /private/tmp/extract_unifor_curricula.py \
  --input /private/tmp/unifor-eng-comp.html \
  --title "Engenharia da Computação" \
  --source "https://unifor.br/web/graduacao/engenharia-da-computacao" \
  --output plan/matriz_curricular_engenharia_computacao.md
```

Expected: arquivo com dez seções de semestre, 57 disciplinas obrigatórias e 30 optativas.

- [ ] **Step 2: Gerar Ciência da Computação**

Run:

```bash
python3 /private/tmp/extract_unifor_curricula.py \
  --input /private/tmp/unifor-ciencia-comp.html \
  --title "Ciência da Computação" \
  --source "https://unifor.br/web/graduacao/ciencia-da-computacao" \
  --output plan/matriz_curricular_ciencia_computacao.md
```

Expected: arquivo com oito seções de semestre, 49 disciplinas obrigatórias e 31 optativas.

- [ ] **Step 3: Inspecionar amostras**

Conferir no HTML e no Markdown:

- primeira e última disciplina obrigatória de cada curso;
- primeira e última optativa de cada curso;
- ao menos uma disciplina com múltiplas unidades de programa;
- código, modalidade, créditos, ementa, objetivos e conteúdos.

---

### Task 3: Validar os artefatos finais

**Files:**
- Validate: `plan/matriz_curricular_engenharia_computacao.md`
- Validate: `plan/matriz_curricular_ciencia_computacao.md`

**Interfaces:**
- Consumes: os dois Markdown gerados na Task 2.
- Produces: evidência de completude, exclusões e integridade Markdown.

- [ ] **Step 1: Reexecutar a suíte do extrator**

Run:

```bash
python3 -m unittest -v /private/tmp/test_extract_unifor_curricula.py
```

Expected: todos os testes com `OK`.

- [ ] **Step 2: Verificar conteúdo proibido e tabelas**

Run:

```bash
if rg -ni 'Professores:|Bibliografia:|currículo lattes|^\\|' \
  plan/matriz_curricular_engenharia_computacao.md \
  plan/matriz_curricular_ciencia_computacao.md; then
  exit 1
fi
```

Expected: nenhuma ocorrência e código de saída `0`.

- [ ] **Step 3: Verificar semestres e disciplinas**

Run:

```bash
test "$(rg -c '^## [0-9]+º semestre$' plan/matriz_curricular_engenharia_computacao.md)" = 10
test "$(rg -c '^## [0-9]+º semestre$' plan/matriz_curricular_ciencia_computacao.md)" = 8
test "$(rg -c '^### [A-Z][A-Z0-9]+ — ' plan/matriz_curricular_engenharia_computacao.md)" = 87
test "$(rg -c '^### [A-Z][A-Z0-9]+ — ' plan/matriz_curricular_ciencia_computacao.md)" = 80
```

Expected: todos os comandos com código de saída `0`.

- [ ] **Step 4: Verificar whitespace e estado do repositório**

Run:

```bash
git diff --check -- \
  plan/matriz_curricular_engenharia_computacao.md \
  plan/matriz_curricular_ciencia_computacao.md
git status --short
```

Expected: nenhuma falha de whitespace; somente os dois artefatos devem pertencer ao escopo desta implementação.
