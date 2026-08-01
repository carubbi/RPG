# Títulos das semanas do cronograma da T290 — Plano de Implementação

> **For agentic workers:** REQUIRED SUB-SKILL: Use superpowers:subagent-driven-development (recommended) or superpowers:executing-plans to implement this plan task-by-task. Steps use checkbox (`- [ ]`) syntax for tracking.

**Goal:** Acrescentar títulos temáticos aos 19 cabeçalhos semanais do cronograma sem alterar datas ou conteúdos.

**Architecture:** A alteração será restrita aos cabeçalhos `#### Semana`. Cada cabeçalho receberá o título aprovado entre o número da semana e o período, seguido de verificações estruturais e comparação do conteúdo não relacionado aos cabeçalhos.

**Tech Stack:** Markdown, Ruby, `rg` e Git.

## Global Constraints

- Modificar somente `mat/ensino/cronograma_2026_2.md`.
- Usar o formato `Semana N — título — período`.
- Preservar a numeração e os períodos das 19 semanas.
- Não modificar o conteúdo interno das semanas.
- Não introduzir tabelas.

---

### Task 1: Acrescentar os títulos aos 19 cabeçalhos

**Files:**
- Modify: `mat/ensino/cronograma_2026_2.md`
- Reference: `docs/superpowers/specs/2026-08-01-titulos-semanas-cronograma-design.md`

**Interfaces:**
- Consumes: os 19 títulos aprovados e os períodos existentes no cronograma.
- Produces: 19 cabeçalhos no formato `Semana N — título — período`.

- [ ] **Step 1: Verificar que os títulos ainda não foram aplicados**

Run:

```bash
ruby -KU -E UTF-8:UTF-8 -e '
s=File.read("mat/ensino/cronograma_2026_2.md", encoding:"UTF-8")
expected=[
"#### Semana 1 — Fundamentos e modelagem de grafos — 03–06/08",
"#### Semana 2 — Tipos de grafos e decisões de modelagem — 10–13/08",
"#### Semana 3 — Representação computacional de grafos — 17–20/08",
"#### Semana 4 — Busca em profundidade — 24–27/08",
"#### Semana 5 — Busca em largura — 31/08–03/09",
"#### Semana 6 — Síntese da Unidade I e apresentação do T1 — 07–10/09",
"#### Semana 7 — AT1 e modelagem inicial do T2 — 14–17/09",
"#### Semana 8 — Percursos e conectividade — 21–24/09",
"#### Semana 9 — Dígrafos, ordenação e problemas clássicos — 28/09–01/10",
"#### Semana 10 — Síntese da Unidade II e apresentação do T2 — 05–08/10",
"#### Semana 11 — Modelagem de grafos ponderados — 12–15/10",
"#### Semana 12 — AT2 e representação inicial do T3 — 19–22/10",
"#### Semana 13 — Árvores geradoras mínimas — 26–29/10",
"#### Semana 14 — Consolidação de árvores geradoras mínimas — 02–05/11",
"#### Semana 15 — Caminhos mínimos com Dijkstra — 09–12/11",
"#### Semana 16 — Fluxo máximo em redes — 16–19/11",
"#### Semana 17 — Caminhos mínimos com Bellman–Ford — 23–26/11",
"#### Semana 18 — Caminhos mínimos com Floyd–Warshall e apresentação do T3 — 30/11–03/12",
"#### Semana 19 — AT3 e apresentação do T3 — 07–09/12"
]
abort("TÍTULOS JÁ APLICADOS") if expected.all?{|line| s.lines.map(&:chomp).include?(line)}
puts "BASELINE_SEM_TITULOS_OK"
'
```

Expected: `BASELINE_SEM_TITULOS_OK`.

- [ ] **Step 2: Substituir exclusivamente os cabeçalhos**

Aplicar estas substituições:

```markdown
#### Semana 1 — Fundamentos e modelagem de grafos — 03–06/08
#### Semana 2 — Tipos de grafos e decisões de modelagem — 10–13/08
#### Semana 3 — Representação computacional de grafos — 17–20/08
#### Semana 4 — Busca em profundidade — 24–27/08
#### Semana 5 — Busca em largura — 31/08–03/09
#### Semana 6 — Síntese da Unidade I e apresentação do T1 — 07–10/09
#### Semana 7 — AT1 e modelagem inicial do T2 — 14–17/09
#### Semana 8 — Percursos e conectividade — 21–24/09
#### Semana 9 — Dígrafos, ordenação e problemas clássicos — 28/09–01/10
#### Semana 10 — Síntese da Unidade II e apresentação do T2 — 05–08/10
#### Semana 11 — Modelagem de grafos ponderados — 12–15/10
#### Semana 12 — AT2 e representação inicial do T3 — 19–22/10
#### Semana 13 — Árvores geradoras mínimas — 26–29/10
#### Semana 14 — Consolidação de árvores geradoras mínimas — 02–05/11
#### Semana 15 — Caminhos mínimos com Dijkstra — 09–12/11
#### Semana 16 — Fluxo máximo em redes — 16–19/11
#### Semana 17 — Caminhos mínimos com Bellman–Ford — 23–26/11
#### Semana 18 — Caminhos mínimos com Floyd–Warshall e apresentação do T3 — 30/11–03/12
#### Semana 19 — AT3 e apresentação do T3 — 07–09/12
```

- [ ] **Step 3: Verificar títulos, numeração e períodos**

Run:

```bash
ruby -KU -E UTF-8:UTF-8 -e '
s=File.read("mat/ensino/cronograma_2026_2.md", encoding:"UTF-8")
expected=[
"#### Semana 1 — Fundamentos e modelagem de grafos — 03–06/08",
"#### Semana 2 — Tipos de grafos e decisões de modelagem — 10–13/08",
"#### Semana 3 — Representação computacional de grafos — 17–20/08",
"#### Semana 4 — Busca em profundidade — 24–27/08",
"#### Semana 5 — Busca em largura — 31/08–03/09",
"#### Semana 6 — Síntese da Unidade I e apresentação do T1 — 07–10/09",
"#### Semana 7 — AT1 e modelagem inicial do T2 — 14–17/09",
"#### Semana 8 — Percursos e conectividade — 21–24/09",
"#### Semana 9 — Dígrafos, ordenação e problemas clássicos — 28/09–01/10",
"#### Semana 10 — Síntese da Unidade II e apresentação do T2 — 05–08/10",
"#### Semana 11 — Modelagem de grafos ponderados — 12–15/10",
"#### Semana 12 — AT2 e representação inicial do T3 — 19–22/10",
"#### Semana 13 — Árvores geradoras mínimas — 26–29/10",
"#### Semana 14 — Consolidação de árvores geradoras mínimas — 02–05/11",
"#### Semana 15 — Caminhos mínimos com Dijkstra — 09–12/11",
"#### Semana 16 — Fluxo máximo em redes — 16–19/11",
"#### Semana 17 — Caminhos mínimos com Bellman–Ford — 23–26/11",
"#### Semana 18 — Caminhos mínimos com Floyd–Warshall e apresentação do T3 — 30/11–03/12",
"#### Semana 19 — AT3 e apresentação do T3 — 07–09/12"
]
actual=s.lines.grep(/^#### Semana /).map(&:chomp)
abort("CABEÇALHOS DIVERGENTES") unless actual==expected
puts "TITULOS_E_PERIODOS_OK"
'
```

Expected: `TITULOS_E_PERIODOS_OK`.

- [ ] **Step 4: Verificar que somente os cabeçalhos mudaram**

Run:

```bash
ruby -KU -E UTF-8:UTF-8 -e '
require "open3"
old,st=Open3.capture2("git","show","HEAD:mat/ensino/cronograma_2026_2.md")
abort("FALHA AO LER HEAD") unless st.success?
new=File.read("mat/ensino/cronograma_2026_2.md", encoding:"UTF-8")
strip=lambda{|text| text.lines.reject{|line| line.start_with?("#### Semana ")}.join}
abort("CONTEÚDO INTERNO ALTERADO") unless strip.call(old)==strip.call(new)
abort("TABELA INTRODUZIDA") if new.lines.any?{|line|line.start_with?("|")}
puts "SOMENTE_CABECALHOS_OK"
'
git diff --check -- mat/ensino/cronograma_2026_2.md
```

Expected: `SOMENTE_CABECALHOS_OK` e nenhuma saída de `git diff --check`.

- [ ] **Step 5: Commit**

```bash
git add mat/ensino/cronograma_2026_2.md
git commit -m "docs: nomeia semanas do cronograma"
```
