# Semana 1 teórica e precedência da representação computacional — Plano de Implementação

> **For agentic workers:** REQUIRED SUB-SKILL: Use superpowers:subagent-driven-development (recommended) or superpowers:executing-plans to implement this plan task-by-task. Steps use checkbox (`- [ ]`) syntax for tracking.

**Goal:** Tornar os dois encontros da semana 1 teóricos e impedir qualquer implementação antes do ensino de representação computacional.

**Architecture:** O cronograma será reorganizado nas semanas 1 a 3, mantendo as semanas 4 a 6 e as datas avaliativas. O fluxo receberá somente os ajustes necessários para refletir a exceção teórica, a remoção da prática não computacional e a precedência da representação.

**Tech Stack:** Markdown, Ruby, `rg` e Git.

## Global Constraints

- Redação tópica, concisa e objetiva.
- Ausência de explicações narrativas nos encontros.
- Ausência de tabelas.
- Preservar o título local `Semana 2 — Tipos e propriedades de grafos`.
- Preservar a expressão local `Medidas estruturais e topológicas`.
- Não modificar o projeto de ensino, os PDFs ou os trabalhos.
- Preservar semanas 4 a 19, datas, feriados, AP1 e AT1.
- Preservar alterações locais não relacionadas.

---

### Task 1: Reorganizar as semanas 1 a 3 do cronograma

**Files:**
- Modify: `mat/ensino/cronograma_2026_2.md`
- Reference: `mat/ensino/proj_ensino_2026.md`
- Reference: `docs/superpowers/specs/2026-08-01-semana-1-teorica-e-representacao-design.md`

**Interfaces:**
- Consumes: conteúdos 01.01, 01.02 e 01.03 e a exceção aprovada para a semana 1.
- Produces: progressão conceitos → tipos/modelagem → representação → implementação.

- [ ] **Step 1: Confirmar e registrar o estado local relevante**

Run:

```bash
rg -q '^#### Semana 2 — Tipos e propriedades de grafos — 10–13/08$' mat/ensino/cronograma_2026_2.md
git diff -- mat/ensino/cronograma_2026_2.md
```

Expected: o título local aparece e o diff inicial contém somente sua alteração em relação ao último commit.

- [ ] **Step 2: Executar a verificação inicial da progressão**

Run:

```bash
ruby -KU -E UTF-8:UTF-8 -e '
s=File.read("mat/ensino/cronograma_2026_2.md", encoding:"UTF-8")
w1=s[/#### Semana 1.*?(?=#### Semana 2)/m]
w2=s[/#### Semana 2.*?(?=#### Semana 3)/m]
w3=s[/#### Semana 3.*?(?=### Unidade II)/m]
checks={
  "sem prática na semana 1"=>!w1.include?("Turma prática"),
  "dois encontros teóricos"=>w1.include?("Segundo encontro teórico"),
  "sem implementação na semana 2"=>!w2.match?(/implementação|`Graph`|`Digraph`/),
  "implementação na semana 3"=>w3.match?(/implementação.*`Graph`.*`Digraph`/),
  "AP1 inicia em 12–13/08"=>s.include?("acompanhamentos de 12–13/08")
}
missing=checks.reject{|_,ok|ok}.keys
abort("AUSENTES: "+missing.join("; ")) unless missing.empty?
puts "PROGRESSAO_INICIAL_OK"
'
```

Expected: FAIL no estado inicial.

- [ ] **Step 3: Registrar a exceção nos critérios de planejamento**

Substituir o critério geral da AP por:

```markdown
- A AP será composta pelo acompanhamento processual e pela apresentação de T1, T2 ou T3. Na semana 1, os encontros de quarta/quinta serão teóricos e não integrarão a AP1. Os encontros práticos oferecidos de 12–13/08 em diante e anteriores à apresentação produzirão evidência verificável.
```

- [ ] **Step 4: Substituir o conteúdo da semana 1**

Manter o título aprovado e usar:

```markdown
#### Semana 1 — Fundamentos e modelagem de grafos — 03–06/08

- **Datas:** primeiro encontro teórico em 03/08 (seg.) e 04/08 (ter.); segundo encontro teórico excepcional em 05/08 (qua.) e 06/08 (qui.).
- **Primeiro encontro teórico — apresentação e motivação:** disciplina; objetivos; metodologia; avaliações; Pontes de Königsberg; rotas; redes; alocação; entidades; relações; vértices; arestas.
- **Segundo encontro teórico — conceitos iniciais:** grafo `G = (V, E)`; vértice; aresta; ordem; tamanho; densidade em grafos simples não orientados; grau; adjacência; incidência; ponte; subgrafo; ciclo.
- **Recursos:** [A1 — Conceitos iniciais](../aulas/A1_Conceitos_Iniciais.pdf).
- **Produto formativo:** exercícios conceituais; modelagens; cálculos estruturais.
```

- [ ] **Step 5: Substituir o conteúdo da semana 2**

Manter o título local e usar:

```markdown
#### Semana 2 — Tipos e propriedades de grafos — 10–13/08

- **Datas:** teórica em 10/08 (seg.) e 11/08 (ter.); prática em 12/08 (qua.) e 13/08 (qui.).
- **Turma teórica:** grafos rotulados; grafos simples; multigrafos; grafos não orientados; dígrafos; grafos ponderados; grafos regulares; grafos completos; grafos bipartidos; grafos planares; grafos conexos; orientação; laços; arestas paralelas; pesos; rótulos; partições; passeio; trilha; caminho.
- **Turma prática — acompanhamento T1, marco 1:** lançamento do T1; apresentação das trilhas; atribuição dos problemas; preparação do ambiente Python/Java; entrada; saída; restrições; vértices; arestas; classificação do grafo; ordem; tamanho; densidade; graus; instância pequena; resposta esperada.
- **Recursos:** [T1 — DFS/BFS](../../trabalhos/und1/T1.md), [A2 — Tipos e representação computacional](../aulas/A2_Tipos_Representação_Computacional_.pdf), [`tinyG.txt`](../../dataset/tinyG.txt), [`tinyDG.txt`](../../dataset/tinyDG.txt) e [`cavalo_3x3.txt`](../../dataset/cavalo_3x3.txt).
- **Produto/evidência:** ficha de modelagem; classificação justificada; instância pequena.
```

- [ ] **Step 6: Substituir o conteúdo da semana 3**

Manter o título aprovado e usar:

```markdown
#### Semana 3 — Representação computacional de grafos — 17–20/08

- **Datas:** teórica em 17/08 (seg.) e 18/08 (ter.); prática em 19/08 (qua.) e 20/08 (qui.).
- **Turma teórica:** matriz de adjacência; matriz de incidência; lista de adjacência; lista de incidência; custos de espaço; inserção de arestas; consulta de adjacência e incidência; percurso de vizinhança; adequação ao tipo e à densidade do grafo.
- **Turma prática — acompanhamento T1, marco 2:** implementação de `Graph` e `Digraph`; listas de adjacência; Python ou Java; inserção e consulta de arestas; leitura dos datasets; representação do problema; validação por instância pequena; custo de espaço e das operações.
- **Recursos:** [T1 — DFS/BFS](../../trabalhos/und1/T1.md), [A2 — Tipos e representação computacional](../aulas/A2_Tipos_Representação_Computacional_.pdf), [`Graph`](../../algs4-py/algs4/graph.py), [`Graph.java`](../../algs4-java/algs4/Graph.java), [`Digraph`](../../algs4-py/algs4/digraph.py), [`Digraph.java`](../../algs4-java/algs4/Digraph.java), [`SymbolGraph`](../../algs4-py/algs4/symbol_graph.py), [`routes.txt`](../../dataset/routes.txt), [`tinyG.txt`](../../dataset/tinyG.txt) e [`tinyDG.txt`](../../dataset/tinyDG.txt).
- **Produto/evidência:** estruturas `Graph` e `Digraph`; entrada processada; representação documentada; escolha justificada em função de `V`, `E`, orientação, pesos, rótulos e restrições.
```

- [ ] **Step 7: Atualizar o período da AP1**

Substituir:

```markdown
- **AP1/T1:** acompanhamentos de 05–06/08 a 02–03/09; apresentações em 09–10/09.
```

por:

```markdown
- **AP1/T1:** acompanhamentos de 12–13/08 a 02–03/09; apresentações em 09–10/09.
```

- [ ] **Step 8: Verificar a progressão e a redação do cronograma**

Run:

```bash
ruby -KU -E UTF-8:UTF-8 -e '
s=File.read("mat/ensino/cronograma_2026_2.md", encoding:"UTF-8")
w1=s[/#### Semana 1.*?(?=#### Semana 2)/m]
w2=s[/#### Semana 2.*?(?=#### Semana 3)/m]
w3=s[/#### Semana 3.*?(?=### Unidade II)/m]
checks={
  "sem prática na semana 1"=>!w1.include?("Turma prática"),
  "dois encontros teóricos"=>w1.include?("Segundo encontro teórico"),
  "Königsberg somente motivador"=>w1.match?(/Primeiro encontro teórico.*Pontes de Königsberg/m),
  "sem implementação na semana 2"=>!w2.match?(/implementação|`Graph`|`Digraph`/),
  "implementação na semana 3"=>w3.match?(/implementação de `Graph` e `Digraph`/),
  "AP1 inicia em 12–13/08"=>s.include?("acompanhamentos de 12–13/08"),
  "título local preservado"=>s.include?("Semana 2 — Tipos e propriedades de grafos")
}
missing=checks.reject{|_,ok|ok}.keys
abort("AUSENTES: "+missing.join("; ")) unless missing.empty?
abort("TABELA INTRODUZIDA") if s.lines.any?{|line|line.start_with?("|")}
puts "CRONOGRAMA_INICIAL_OK"
'
git diff --check -- mat/ensino/cronograma_2026_2.md
```

Expected: `CRONOGRAMA_INICIAL_OK` e nenhuma saída de `git diff --check`.

- [ ] **Step 9: Commit**

```bash
git add mat/ensino/cronograma_2026_2.md
git commit -m "docs: torna semana inicial integralmente teórica"
```

---

### Task 2: Sincronizar o fluxo de ensino

**Files:**
- Modify: `mat/ensino/fluxo_ensino.md`
- Reference: `docs/superpowers/specs/2026-08-01-semana-1-teorica-e-representacao-design.md`

**Interfaces:**
- Consumes: progressão aprovada e cronograma atualizado na Task 1.
- Produces: fluxo sem prática de Königsberg e sem implementação anterior à representação.

- [ ] **Step 1: Confirmar a alteração local do fluxo**

Run:

```bash
rg -q 'Medidas estruturais e topológicas' mat/ensino/fluxo_ensino.md
git diff -- mat/ensino/fluxo_ensino.md
```

Expected: a expressão local aparece e o diff inicial contém sua alteração em relação ao último commit.

- [ ] **Step 2: Atualizar a turma teórica da Unidade I**

Usar:

```markdown
## Turma teórica

- Semana 1: apresentação da disciplina; problemas motivadores; conceitos iniciais e definições.
- Modelagem e representação computacional.
- Tipos de grafos e respectivas modelagens computacionais.
- Medidas estruturais e topológicas previstas no projeto de ensino.
```

- [ ] **Step 3: Atualizar a turma prática da Unidade I**

Usar:

```markdown
## Turma prática

- Lançamento do T1, distribuição dos problemas e modelagem inicial após os conceitos fundamentais.
- Implementação das estruturas `Graph` e `Digraph` após o ensino de representação computacional, com referência nas bases `algs4-java` e `algs4-py`.
- Acompanhamento progressivo das trilhas conforme os conteúdos teóricos ensinados.
- Apresentação final do T1.
```

- [ ] **Step 4: Verificar a sincronização**

Run:

```bash
ruby -KU -E UTF-8:UTF-8 -e '
s=File.read("mat/ensino/fluxo_ensino.md", encoding:"UTF-8")
checks={
  "sem prática não computacional"=>!s.include?("Prática não computacional"),
  "semana 1 teórica"=>s.include?("Semana 1: apresentação da disciplina; problemas motivadores; conceitos iniciais e definições."),
  "implementação após representação"=>s.include?("`Graph` e `Digraph` após o ensino de representação computacional"),
  "topológicas preservado"=>s.include?("Medidas estruturais e topológicas")
}
missing=checks.reject{|_,ok|ok}.keys
abort("AUSENTES: "+missing.join("; ")) unless missing.empty?
abort("TABELA INTRODUZIDA") if s.lines.any?{|line|line.start_with?("|")}
puts "FLUXO_SINCRONIZADO_OK"
'
git diff --check -- mat/ensino/fluxo_ensino.md
```

Expected: `FLUXO_SINCRONIZADO_OK` e nenhuma saída de `git diff --check`.

- [ ] **Step 5: Commit**

```bash
git add mat/ensino/fluxo_ensino.md
git commit -m "docs: sincroniza fluxo da Unidade I"
```

---

### Task 3: Auditar escopo, links e preservação

**Files:**
- Verify: `mat/ensino/cronograma_2026_2.md`
- Verify: `mat/ensino/fluxo_ensino.md`

**Interfaces:**
- Consumes: documentos atualizados nas Tasks 1 e 2.
- Produces: evidência de completude, consistência documental e preservação do restante do semestre.

- [ ] **Step 1: Verificar links locais**

Run:

```bash
ruby -KU -E UTF-8:UTF-8 -e '
bad=[]
ARGV.each do |f|
  File.read(f, encoding:"UTF-8").scan(/\[[^\]]+\]\(([^)#]+)(?:#[^)]+)?\)/).flatten.each do |path|
    next if path.match?(%r{\Ahttps?://})
    bad << "#{f}: #{path}" unless File.exist?(File.expand_path(path, File.dirname(f)))
  end
end
abort("LINKS INVÁLIDOS:\n"+bad.join("\n")) unless bad.empty?
puts "LINKS_LOCAIS_OK"
' mat/ensino/cronograma_2026_2.md mat/ensino/fluxo_ensino.md
```

Expected: `LINKS_LOCAIS_OK`.

- [ ] **Step 2: Verificar datas e semanas preservadas**

Run:

```bash
ruby -KU -E UTF-8:UTF-8 -e '
s=File.read("mat/ensino/cronograma_2026_2.md", encoding:"UTF-8")
abort("SEMANAS") unless s.scan(/^#### Semana /).size==19
abort("AP1") unless s.include?("apresentações em 09/09 (qua.) e 10/09 (qui.)")
abort("AT1") unless s.include?("AT1 em 14/09 (seg.) e 15/09 (ter.)")
abort("FERIADO") unless s.include?("07/09 — Dia da Independência do Brasil — feriado, sem aula")
abort("SEMANA 4") unless s.include?("Semana 4 — Busca em profundidade — 24–27/08")
abort("SEMANA 19") unless s.include?("Semana 19 — AT3 e apresentação do T3 — 07–09/12")
puts "DATAS_E_SEMANAS_OK"
'
```

Expected: `DATAS_E_SEMANAS_OK`.

- [ ] **Step 3: Verificar o escopo dos dois commits**

Run:

```bash
git diff --name-only HEAD~2..HEAD
git show --check --oneline --stat HEAD~1
git show --check --oneline --stat HEAD
```

Expected: somente `mat/ensino/cronograma_2026_2.md` e `mat/ensino/fluxo_ensino.md`, sem erros de whitespace.

- [ ] **Step 4: Informar os resultados**

Registrar na entrega final: `CRONOGRAMA_INICIAL_OK`, `FLUXO_SINCRONIZADO_OK`, `LINKS_LOCAIS_OK` e `DATAS_E_SEMANAS_OK`. Não modificar outros arquivos para registrar a auditoria.
