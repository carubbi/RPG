# Revisão das semanas 1 a 6 do cronograma da T290 — Plano de Implementação

> **For agentic workers:** REQUIRED SUB-SKILL: Use superpowers:subagent-driven-development (recommended) or superpowers:executing-plans to implement this plan task-by-task. Steps use checkbox (`- [ ]`) syntax for tracking.

**Goal:** Alinhar as semanas 1 a 6 do cronograma ao conteúdo completo do projeto de ensino e à progressão didática do fluxo de ensino.

**Architecture:** O projeto de ensino será usado como fonte normativa dos conteúdos 01.01, 01.02, 01.03 e 02.01. O fluxo de ensino orientará a sequência entre conceitos, modelagem, representação, implementação de `Graph` e `Digraph`, desenvolvimento do T1 e buscas, sem alterar a estrutura restante do cronograma.

**Tech Stack:** Markdown, `rg`, Ruby e Git.

## Global Constraints

- Modificar somente `mat/ensino/cronograma_2026_2.md`.
- Não alterar datas, feriados, avaliações ou apresentações.
- Não criar reposições nem encontros externos.
- Manter a equivalência entre as turmas de segunda/quarta e terça/quinta.
- Não exigir, nos acompanhamentos, conhecimentos ainda não ensinados.
- Manter o T1 transversal entre a Unidade I e o início da Unidade II.
- Manter as ATs em encontros teóricos integrais e as apresentações das APs em encontros práticos integrais.
- Não introduzir tabelas.
- Tratar `mat/ensino/proj_ensino_2026.md` como referência normativa e `mat/ensino/fluxo_ensino.md` como orientação didática.

---

### Task 1: Corrigir a progressão curricular das semanas 1 a 3

**Files:**
- Modify: `mat/ensino/cronograma_2026_2.md:62-84`
- Reference: `mat/ensino/proj_ensino_2026.md:24-35`
- Reference: `mat/ensino/fluxo_ensino.md`

**Interfaces:**
- Consumes: conteúdos 01.01, 01.02 e 01.03 do projeto de ensino e práticas previstas para a Unidade I no fluxo.
- Produces: três semanas completas que habilitam o ensino de DFS na semana 4 e o desenvolvimento posterior do T1.

- [ ] **Step 1: Executar a verificação curricular inicial**

Run:

```bash
ruby -E UTF-8:UTF-8 -e '
s=File.read("mat/ensino/cronograma_2026_2.md", encoding:"UTF-8")
u=s[/#### Semana 1.*?(?=### Unidade II)/m]
checks={
  "Pontes de Königsberg na prática"=>/Turma prática[^\n]*Pontes de Königsberg/,
  "implementação de Graph e Digraph"=>/implementação[^\n]*`Graph`[^\n]*`Digraph`/,
  "modelagem de tipos"=>/tipos de grafos e respectivas modelagens|decisões de modelagem/,
  "matrizes e listas"=>/matrizes de adjacência e incidência[^\n]*listas de adjacência e incidência/
}
missing=checks.reject{|_,re| u.match?(re)}.keys
abort("AUSENTES: "+missing.join("; ")) unless missing.empty?
puts "UNIDADE_I_OK"
'
```

Expected: FAIL, identificando a ausência da prática de Königsberg, da implementação explícita de `Graph`/`Digraph` e da associação entre tipos e decisões de modelagem.

- [ ] **Step 2: Substituir o conteúdo da Semana 1**

Preservar o título e as datas e usar:

```markdown
- **Turma teórica:** apresentação da disciplina; problemas das Pontes de Königsberg, rotas e redes; transformação de entidades em vértices e relações em arestas; vértice, aresta, ordem, tamanho, densidade, grau, adjacência e incidência.
- **Turma prática — acompanhamento T1, marco 1 comum:** prática não computacional das Pontes de Königsberg; preparação do ambiente Python/Java; apresentação das três trilhas e atribuição dos problemas; interpretação de entrada, saída e restrições; primeira modelagem dos vértices e das arestas.
- **Recursos:** [T1 — DFS/BFS](../../trabalhos/und1/T1.md), [`Graph`](../../algs4-py/algs4/graph.py), [`Graph.java`](../../algs4-java/algs4/Graph.java), [`tinyG.txt`](../../dataset/tinyG.txt) e material para a prática das Pontes de Königsberg.
- **Produto/evidência:** ambiente validado, resumo do problema, modelo inicial e cálculos de ordem, tamanho, densidade e graus em uma instância pequena.
```

- [ ] **Step 3: Substituir o conteúdo da Semana 2**

Preservar o título e as datas e usar:

```markdown
- **Turma teórica:** ponte, subgrafo e ciclo; grafos rotulados, simples, multigrafos, não orientados, dígrafos e ponderados; grafos regulares, completos, bipartidos, planares e conexos; introdução às diferenças entre passeio, trilha e caminho. Para cada tipo, serão explicitadas as decisões de modelagem pertinentes: orientação para relações assimétricas, multiplicidade de arestas, pesos como atributos, associação entre rótulos e índices e partições em grafos bipartidos. Regularidade, completude, planaridade e conectividade serão tratadas como propriedades, não como estruturas de dados distintas.
- **Turma prática — acompanhamento T1, conclusão do marco 1:** implementação das APIs fundamentais de `Graph` e `Digraph` em Python ou Java, incluindo inserção de arestas, consulta de adjacência e cálculo de graus, ordem, tamanho e densidade; classificação justificada do grafo atribuído. A Trilha A enfatiza grafos simples e propriedades estruturais; a Trilha B, direção, graus de entrada e saída, fontes e sorvedouros; a Trilha C permanece em modelagem e representação.
- **Recursos:** [T1 — DFS/BFS](../../trabalhos/und1/T1.md), [`Graph`](../../algs4-py/algs4/graph.py), [`Graph.java`](../../algs4-java/algs4/Graph.java), [`Digraph`](../../algs4-py/algs4/digraph.py), [`Digraph.java`](../../algs4-java/algs4/Digraph.java), [`tinyG.txt`](../../dataset/tinyG.txt), [`tinyDG.txt`](../../dataset/tinyDG.txt) e [`cavalo_3x3.txt`](../../dataset/cavalo_3x3.txt).
- **Produto/evidência:** estruturas mínimas `Graph` e `Digraph` funcionando, classificação justificada e instância pequena documentada.
```

- [ ] **Step 4: Substituir o conteúdo da Semana 3**

Preservar o título e as datas e usar:

```markdown
- **Turma teórica:** representação computacional por matrizes de adjacência e incidência e por listas de adjacência e incidência; codificação de grafos simples, multigrafos, dígrafos, grafos rotulados e ponderados; comparação de custos de espaço e das operações de inserção, consulta e percurso.
- **Turma prática — acompanhamento T1, marco 2 comum:** conclusão de `Graph` e `Digraph`; leitura dos datasets; escolha e implementação da representação do problema; comparação entre matriz e lista; validação por instância pequena. As trilhas A e B explicitam como direção, multiplicidade, rótulos ou propriedades afetam a codificação; a Trilha C justifica lista de adjacência ou vizinhança implícita.
- **Recursos:** [T1 — DFS/BFS](../../trabalhos/und1/T1.md), [`Graph`](../../algs4-py/algs4/graph.py), [`Digraph`](../../algs4-py/algs4/digraph.py), [`SymbolGraph`](../../algs4-py/algs4/symbol_graph.py), [`routes.txt`](../../dataset/routes.txt), [`tinyG.txt`](../../dataset/tinyG.txt) e [`tinyDG.txt`](../../dataset/tinyDG.txt).
- **Produto/evidência:** representação documentada, entrada processada corretamente e escolha justificada em função de `V`, `E`, orientação, pesos, rótulos e restrições.
```

- [ ] **Step 5: Reexecutar a verificação curricular**

Run:

```bash
ruby -E UTF-8:UTF-8 -e '
s=File.read("mat/ensino/cronograma_2026_2.md", encoding:"UTF-8")
u=s[/#### Semana 1.*?(?=### Unidade II)/m]
checks={
  "Pontes de Königsberg na prática"=>/Turma prática[^\n]*Pontes de Königsberg/,
  "implementação de Graph e Digraph"=>/implementação[^\n]*`Graph`[^\n]*`Digraph`/,
  "modelagem de tipos"=>/decisões de modelagem/,
  "matrizes e listas"=>/matrizes de adjacência e incidência[^\n]*listas de adjacência e incidência/
}
missing=checks.reject{|_,re| u.match?(re)}.keys
abort("AUSENTES: "+missing.join("; ")) unless missing.empty?
puts "UNIDADE_I_OK"
'
```

Expected: `UNIDADE_I_OK`.

- [ ] **Step 6: Commit**

```bash
git add mat/ensino/cronograma_2026_2.md
git commit -m "docs: completa modelagem e representação na Unidade I"
```

---

### Task 2: Ajustar a continuidade do T1 nas semanas 4 a 6

**Files:**
- Modify: `mat/ensino/cronograma_2026_2.md:90-112`
- Reference: `mat/ensino/proj_ensino_2026.md:36-51`
- Reference: `mat/ensino/fluxo_ensino.md`
- Reference: `trabalhos/und1/T1.md`

**Interfaces:**
- Consumes: modelagem, tipos, estruturas `Graph`/`Digraph` e representações concluídas nas semanas 1 a 3.
- Produces: progressão completa por DFS e BFS, conclusão cumulativa do T1 e apresentação da AP1.

- [ ] **Step 1: Preservar e tornar explícita a dependência da Semana 4**

Manter datas e recursos da semana 4 e ajustar conteúdo e evidência para:

```markdown
- **Turma teórica:** busca em profundidade; árvore de busca, alcançabilidade, predecessores, caminhos, invariantes, correção e complexidade `O(V + E)`, aplicados às representações construídas na Unidade I.
- **Turma prática — acompanhamento T1, marco 3:** execução manual de DFS por todos os grupos; identificação de componentes ou alcançabilidade; classificação de uma sequência relevante como passeio, trilha, caminho ou ciclo; a Trilha C implementa a busca no problema, enquanto as trilhas A e B a implementam quando necessária ou justificam por que uma estratégia estrutural é suficiente.
- **Recursos:** [T1 — DFS/BFS](../../trabalhos/und1/T1.md), [`DepthFirstSearch`](../../algs4-py/algs4/depth_first_search.py) e [`DepthFirstPaths`](../../algs4-py/algs4/depth_first_paths.py).
- **Produto/evidência:** rastreamento manual, identificação do papel da DFS, implementação parcial e análise inicial de correção e complexidade.
```

- [ ] **Step 2: Explicitar o caráter cumulativo da Semana 5**

Manter datas e recursos da semana 5 e ajustar conteúdo e evidência para:

```markdown
- **Turma teórica:** busca em largura; fronteiras, árvore BFS, níveis, predecessores, distância, reconstrução de caminhos e caminho mínimo em grafos sem pesos; comparação com DFS; correção e complexidade `O(V + E)`.
- **Turma prática — acompanhamento T1, marcos 4 e 5:** execução manual de BFS; decisão fundamentada entre estratégia estrutural, DFS ou BFS; distinção entre ordem de visita e caminho reconstruído; conclusão cumulativa da implementação e dos testes iniciados nos encontros anteriores; submissão, análise de complexidade e ensaio. O encontro não concentrará a construção integral da solução.
- **Recursos:** [T1 — DFS/BFS](../../trabalhos/und1/T1.md), [`BreadthFirstPaths`](../../algs4-py/algs4/breadth_first_paths.py), [`tinyG.txt`](../../dataset/tinyG.txt) e [`mediumG.txt`](../../dataset/mediumG.txt).
- **Produto/evidência:** solução testada, estratégia justificada, evidência do `Accepted`, análise de correção e complexidade e apresentação preparada.
```

- [ ] **Step 3: Ampliar a síntese da Semana 6 sem introduzir conteúdo novo**

Preservar datas, feriado, apresentação e recursos da semana 6 e ajustar a teoria para:

```markdown
- **Turma teórica:** revisão formativa de modelagem, tipos de grafos, representações computacionais, DFS, BFS, alcançabilidade e caminhos, sem conteúdo novo e sem avaliação somativa.
```

Manter a apresentação prática integral e usar como produto/evidência:

```markdown
- **Produto/evidência:** apresentação e avaliação da AP1, repositório congelado e devolutiva.
```

- [ ] **Step 4: Verificar a sequência das semanas 4 a 6**

Run:

```bash
ruby -E UTF-8:UTF-8 -e '
s=File.read("mat/ensino/cronograma_2026_2.md", encoding:"UTF-8")
u=s[/#### Semana 4.*?(?=#### Semana 7)/m]
checks={
  "DFS"=>/Semana 4.*busca em profundidade.*O\\(V \\+ E\\)/m,
  "BFS"=>/Semana 5.*busca em largura.*caminho mínimo em grafos sem pesos/m,
  "trabalho cumulativo"=>/conclusão cumulativa/,
  "feriado de 07-09"=>/07\\/09 — Dia da Independência do Brasil — feriado, sem aula/,
  "revisão completa"=>/revisão formativa de modelagem, tipos de grafos, representações computacionais, DFS, BFS/,
  "apresentação integral"=>/Turma prática — apresentação da AP1.*encontro integral/m
}
missing=checks.reject{|_,re| u.match?(re)}.keys
abort("AUSENTES: "+missing.join("; ")) unless missing.empty?
puts "CONTINUIDADE_T1_OK"
'
```

Expected: `CONTINUIDADE_T1_OK`.

- [ ] **Step 5: Commit**

```bash
git add mat/ensino/cronograma_2026_2.md
git commit -m "docs: alinha buscas e conclusão do T1"
```

---

### Task 3: Auditar completude, datas e formato

**Files:**
- Verify: `mat/ensino/cronograma_2026_2.md`
- Reference: `mat/ensino/proj_ensino_2026.md`
- Reference: `mat/ensino/fluxo_ensino.md`

**Interfaces:**
- Consumes: cronograma revisado nas Tasks 1 e 2.
- Produces: evidência de que o documento respeita a especificação sem regressões de datas ou formato.

- [ ] **Step 1: Verificar todos os conceitos curriculares da Unidade I**

Run:

```bash
ruby -E UTF-8:UTF-8 -e '
s=File.read("mat/ensino/cronograma_2026_2.md", encoding:"UTF-8")
u=s[/### Unidade I.*?(?=### Unidade II)/m]
terms=%w[vértice aresta ordem tamanho densidade grau ponte adjacência incidência rotulados simples multigrafos dígrafos ponderados regulares completos bipartidos planares conexos subgrafo ciclo]
terms += ["matrizes de adjacência", "matrizes de incidência", "listas de adjacência", "listas de incidência"]
missing=terms.reject{|term| u.downcase.include?(term.downcase)}
abort("CONTEÚDOS AUSENTES: "+missing.join(", ")) unless missing.empty?
puts "COMPLETUDE_CURRICULAR_OK"
'
```

Expected: `COMPLETUDE_CURRICULAR_OK`.

- [ ] **Step 2: Verificar datas, feriado, avaliações e ausência de tabelas**

Run:

```bash
ruby -E UTF-8:UTF-8 -e '
s=File.read("mat/ensino/cronograma_2026_2.md", encoding:"UTF-8")
abort("semanas") unless s.scan(/^#### Semana /).size == 19
abort("feriado") unless s.include?("07/09 — Dia da Independência do Brasil — feriado, sem aula")
abort("AP1") unless s.include?("apresentações em 09/09 (qua.) e 10/09 (qui.)")
abort("AT1") unless s.include?("AT1 em 14/09 (seg.) e 15/09 (ter.)")
abort("tabela") if s.lines.any?{|line| line.start_with?("|")}
puts "DATAS_E_FORMATO_OK"
'
git diff --check
```

Expected: `DATAS_E_FORMATO_OK` e nenhuma saída de `git diff --check`.

- [ ] **Step 3: Verificar links locais do cronograma**

Run:

```bash
ruby -E UTF-8:UTF-8 -e '
f="mat/ensino/cronograma_2026_2.md"
bad=[]
File.read(f, encoding:"UTF-8").scan(/\[[^\]]+\]\(([^)#]+)(?:#[^)]+)?\)/).flatten.each do |path|
  next if path.match?(%r{\Ahttps?://})
  bad << path unless File.exist?(File.expand_path(path, File.dirname(f)))
end
abort("LINKS INVÁLIDOS: "+bad.join(", ")) unless bad.empty?
puts "LINKS_LOCAIS_OK"
'
```

Expected: `LINKS_LOCAIS_OK`.

- [ ] **Step 4: Confirmar que somente o arquivo aprovado foi alterado pelo plano**

Run:

```bash
git diff --name-only HEAD~2..HEAD
```

Expected: somente `mat/ensino/cronograma_2026_2.md`.

- [ ] **Step 5: Registrar o resultado da auditoria**

Informar na entrega final os resultados de `COMPLETUDE_CURRICULAR_OK`, `DATAS_E_FORMATO_OK` e `LINKS_LOCAIS_OK`. Não modificar outros arquivos para registrar os resultados.
