# Trilhas avaliativas da T290 — plano de implementação

> **For agentic workers:** REQUIRED SUB-SKILL: Use superpowers:subagent-driven-development (recommended) or superpowers:executing-plans to implement this plan task-by-task. Steps use checkbox (`- [ ]`) syntax for tracking.

**Goal:** Reorganizar T1, T2 e T3 como avaliações práticas únicas compostas por três trilhas, com problemas de juiz que afiram explicitamente os conhecimentos teóricos.

**Architecture:** Cada trabalho terá um documento principal com regras comuns e arquivos menores dedicados aos bancos das trilhas. T1 e T2 terão dez problemas no total; T3 manterá dez problemas em cada trilha e selecionará aproximadamente dez por oferta.

**Tech Stack:** Markdown, links oficiais de UVA/Online Judge, Kattis, Codeforces e CSES, implementações de referência em Python e Java.

## Global Constraints

- Não criar avaliações ou apresentações adicionais.
- Não usar tabelas Markdown nos documentos criados ou modificados.
- Cada grupo resolverá somente um problema por AP.
- Todo problema deverá registrar conhecimento aferido, dependência teórica, evidência de acompanhamento, estratégia esperada, complexidade e casos especiais.
- Nenhum acompanhamento poderá exigir conteúdo ainda não ensinado.
- O `Accepted` não substituirá a demonstração de conhecimento teórico.
- Preservar arquivos e alterações do usuário fora do escopo.
- Validar todos os links de problemas em páginas oficiais antes da inclusão definitiva.

---

### Task 1: Reorganizar T1 em três trilhas

**Files:**
- Modify: `trabalhos/und1/T1.md`
- Create: `trabalhos/und1/trilhas/trilha-a-grafos-simples.md`
- Create: `trabalhos/und1/trilhas/trilha-b-digrafos.md`
- Create: `trabalhos/und1/trilhas/trilha-c-buscas.md`

**Interfaces:**
- Consumes: regras comuns de AP1 já presentes em `trabalhos/und1/T1.md`.
- Produces: documento principal da AP1 e três bancos com exatamente dez problemas no total.

- [ ] **Step 1: Verificar os dez candidatos nas páginas oficiais**

Validar existência, submissão ativa, entrada, saída, restrições e compatibilidade com Python/Java:

- Trilha A: Kattis Weak Vertices, UVA 11387 The 3-Regular Graph e Kattis Reachable Roads.
- Trilha B: Codeforces 115A Party, Codeforces 500A New Year Transportation e UVA 280 Vertex.
- Trilha C: CSES Counting Rooms, CSES Labyrinth, CSES Message Route e UVA 336 A Node Too Far.

Rejeitar candidato cuja solução central dependa de conteúdo posterior à trilha. Substituição somente poderá ocorrer por problema oficial que afira o mesmo resultado de aprendizagem e tenha dificuldade equivalente.

- [ ] **Step 2: Criar os três bancos da Unidade I**

Em cada problema, registrar:

- grupo e link oficial;
- modelagem esperada;
- medidas ou propriedades que deverão ser calculadas;
- conhecimento teórico aferido;
- razão pela qual esse conhecimento é necessário;
- evidência que o grupo apresentará no acompanhamento;
- DFS/BFS esperada, quando aplicável;
- complexidade e casos especiais esperados;
- bibliotecas ou atalhos proibidos.

- [ ] **Step 3: Transformar `T1.md` no documento principal**

Remover a lista única de problemas e substituí-la por links para as três trilhas. Manter objetivo, cinco marcos, entrega, apresentação e rubrica comuns. Explicitar a distribuição 3/3/4 e que a Trilha C somente exige DFS/BFS depois das aulas correspondentes.

- [ ] **Step 4: Validar T1**

Run:

```bash
test "$(rg '^## Problema ' trabalhos/und1/trilhas/*.md | wc -l | tr -d ' ')" -eq 10
test "$(rg -l '^## Problema ' trabalhos/und1/trilhas/*.md | wc -l | tr -d ' ')" -eq 3
! rg '^\|' trabalhos/und1/T1.md trabalhos/und1/trilhas
git diff --check -- trabalhos/und1
```

Expected: dez problemas distribuídos em três arquivos, nenhuma tabela e nenhuma falha de whitespace.

- [ ] **Step 5: Commit**

```bash
git add trabalhos/und1/T1.md trabalhos/und1/trilhas
git commit -m "docs: organiza T1 em trilhas avaliativas"
```

### Task 2: Reorganizar T2 em três trilhas

**Files:**
- Modify: `trabalhos/und2/T2/T2.md`
- Create: `trabalhos/und2/T2/trilhas/trilha-a-conectividade.md`
- Create: `trabalhos/und2/T2/trilhas/trilha-b-percursos.md`
- Create: `trabalhos/und2/T2/trilhas/trilha-c-relacoes-estruturais.md`

**Interfaces:**
- Consumes: regras comuns de AP2 e materiais históricos de `trabalhos/und2/T1` a `trabalhos/und2/T6`.
- Produces: documento principal da AP2 e três bancos com exatamente dez problemas no total.

- [ ] **Step 1: Verificar os dez candidatos nas páginas oficiais**

Validar:

- Trilha A: CSES Flight Routes Check, Codeforces 427C Checkposts, UVA 315 Network e UVA 796 Critical Links.
- Trilha B: CSES Round Trip II, Codeforces 510C Fox And Names e Kattis Eulerian Path.
- Trilha C: CSES Building Teams, Kattis Paintball e CSES Tree Isomorphism I.

Confirmar que os problemas da Trilha C podem ser acompanhados com dificuldade moderada. O material histórico poderá apoiar explicações e casos de teste, mas não substituirá o problema oficial nem criará entrega adicional.

- [ ] **Step 2: Criar os três bancos da Unidade II**

Para cada problema, registrar o critério estrutural esperado, o estado adicional mantido pela DFS/BFS ou pelo algoritmo específico, a execução manual exigida, a complexidade e os casos positivo, negativo e limite.

- [ ] **Step 3: Transformar `T2.md` no documento principal**

Manter três marcos comuns, entrega, apresentação e rubrica. Substituir a lista única por links para as trilhas e registrar a distribuição 4/3/3. Deixar explícito que Hamilton geral, TSP exato, carteiro chinês completo e isomorfismo geral não compõem a implementação obrigatória.

- [ ] **Step 4: Validar T2**

Run:

```bash
test "$(rg '^## Problema ' trabalhos/und2/T2/trilhas/*.md | wc -l | tr -d ' ')" -eq 10
test "$(rg -l '^## Problema ' trabalhos/und2/T2/trilhas/*.md | wc -l | tr -d ' ')" -eq 3
! rg '^\|' trabalhos/und2/T2/T2.md trabalhos/und2/T2/trilhas
git diff --check -- trabalhos/und2/T2
```

Expected: dez problemas, três trilhas, ausência de tabelas e Markdown consistente.

- [ ] **Step 5: Commit**

```bash
git add trabalhos/und2/T2/T2.md trabalhos/und2/T2/trilhas
git commit -m "docs: organiza T2 em trilhas avaliativas"
```

### Task 3: Converter os trabalhos internos da Unidade III em bancos de trilha

**Files:**
- Modify: `trabalhos/und3/README.md`
- Modify: `trabalhos/und3/T1/T1.md`
- Modify: `trabalhos/und3/T2/T2.md`
- Modify: `trabalhos/und3/T3/T3.md`

**Interfaces:**
- Consumes: bancos existentes de MST, Dijkstra e fluxo.
- Produces: uma AP3 com três bancos de exatamente dez problemas, sem pontuação ou apresentação independente nos bancos.

- [ ] **Step 1: Verificar os trinta problemas nas páginas oficiais**

Manter os dez problemas atuais de MST após verificar links e compatibilidade.

Manter os dez primeiros problemas do banco de caminhos mínimos e excluir Codeforces 715B Complete The Graph, pois exige manipulação de pesos e raciocínio além do núcleo previsto.

No banco de fluxo, excluir Codeforces 498C Array and Operations, pois a redução por fatoração acrescenta complexidade externa desnecessária. Manter os outros dez candidatos, incluindo Kattis Waif Until Dark.

- [ ] **Step 2: Reescrever os bancos como documentos especializados**

Alterar os títulos internos para:

- `Banco da Trilha A — Árvore geradora mínima`;
- `Banco da Trilha B — Caminhos mínimos`;
- `Banco da Trilha C — Fluxo máximo`.

Remover valores próprios, rubricas locais, apresentações adicionais e regras duplicadas. Manter requisitos específicos de modelagem e implementação. Converter tabelas existentes em listas.

Para cada problema, acrescentar conhecimento teórico aferido, dependência teórica, evidência de acompanhamento, estratégia esperada, complexidade e casos especiais, seguindo o mesmo padrão de T1 e T2.

- [ ] **Step 3: Atualizar o documento principal da AP3**

Explicitar trinta opções, dez por trilha, e seleção de aproximadamente dez problemas por oferta. Manter os seis marcos comuns, a única entrega, a única apresentação e a rubrica da AP3.

- [ ] **Step 4: Validar a Unidade III**

Run:

```bash
test "$(rg -c '^[0-9]+\\. \\*\\*Grupo ' trabalhos/und3/T1/T1.md)" -eq 10
test "$(rg -c '^[0-9]+\\. \\*\\*Grupo ' trabalhos/und3/T2/T2.md)" -eq 10
test "$(rg -c '^[0-9]+\\. \\*\\*Grupo ' trabalhos/und3/T3/T3.md)" -eq 10
! rg 'Esta atividade vale|## Pontuação|^\|' trabalhos/und3/README.md trabalhos/und3/T1/T1.md trabalhos/und3/T2/T2.md trabalhos/und3/T3/T3.md
git diff --check -- trabalhos/und3
```

Expected: dez problemas em cada banco, nenhuma avaliação independente e nenhuma tabela.

- [ ] **Step 5: Commit**

```bash
git add trabalhos/und3/README.md trabalhos/und3/T1/T1.md trabalhos/und3/T2/T2.md trabalhos/und3/T3/T3.md
git commit -m "docs: consolida bancos das trilhas da Unidade III"
```

### Task 4: Integrar as trilhas aos documentos de ensino

**Files:**
- Modify: `mat/ensino/proj_ensino_2026.md`
- Modify: `mat/ensino/cronograma_2026_2.md`
- Modify: `mat/ensino/fluxo_ensino.md`

**Interfaces:**
- Consumes: documentos principais e bancos concluídos nas Tasks 1–3.
- Produces: projeto, cronograma e fluxo com nomenclatura e progressão compatíveis.

- [ ] **Step 1: Atualizar o projeto de ensino**

Registrar as três trilhas de cada AP, a quantidade de problemas, a exceção quantitativa da Unidade III e o papel complementar entre AT abrangente e AP especializada.

- [ ] **Step 2: Atualizar os acompanhamentos do cronograma**

Em cada encontro prático, informar primeiro a evidência comum e depois a diferenciação por trilha. Preservar datas, feriados, ATs, apresentações e a exceção de 09/12.

Na Unidade I, não exigir DFS/BFS antes das semanas 4 e 5. Na Unidade II, cobrar a propriedade específica somente depois da aula correspondente. Na Unidade III, manter modelagem comum enquanto a família algorítmica da trilha ainda não tiver sido ensinada.

- [ ] **Step 3: Revisar o fluxo de ensino**

Conferir links, nomes e quantidades contra os arquivos efetivamente criados. Não ampliar o fluxo com regras já descritas integralmente nos trabalhos.

- [ ] **Step 4: Validar integração**

Run:

```bash
test "$(rg -c '^#### Semana ' mat/ensino/cronograma_2026_2.md)" -eq 19
rg -q 'Trilha A' mat/ensino/proj_ensino_2026.md mat/ensino/cronograma_2026_2.md mat/ensino/fluxo_ensino.md
rg -q '09/12' mat/ensino/cronograma_2026_2.md
rg -q 'Dia da Independência do Brasil.*feriado, sem aula' mat/ensino/cronograma_2026_2.md
! rg '^\|' mat/ensino/proj_ensino_2026.md mat/ensino/cronograma_2026_2.md mat/ensino/fluxo_ensino.md
git diff --check -- mat/ensino
```

Expected: 19 semanas e preservação de datas, feriados e regras avaliativas.

- [ ] **Step 5: Commit**

```bash
git add mat/ensino/proj_ensino_2026.md mat/ensino/cronograma_2026_2.md mat/ensino/fluxo_ensino.md
git commit -m "docs: integra trilhas ao planejamento da T290"
```

### Task 5: Executar verificação cruzada final

**Files:**
- Verify: `trabalhos/und1/T1.md`
- Verify: `trabalhos/und1/trilhas/*.md`
- Verify: `trabalhos/und2/T2/T2.md`
- Verify: `trabalhos/und2/T2/trilhas/*.md`
- Verify: `trabalhos/und3/README.md`
- Verify: `trabalhos/und3/T1/T1.md`
- Verify: `trabalhos/und3/T2/T2.md`
- Verify: `trabalhos/und3/T3/T3.md`
- Verify: `mat/ensino/proj_ensino_2026.md`
- Verify: `mat/ensino/cronograma_2026_2.md`
- Verify: `mat/ensino/fluxo_ensino.md`

**Interfaces:**
- Consumes: todas as tarefas anteriores.
- Produces: evidência de consistência curricular, documental e estrutural.

- [ ] **Step 1: Verificar contagens e nomenclatura**

Run:

```bash
test "$(rg '^## Problema ' trabalhos/und1/trilhas/*.md | wc -l | tr -d ' ')" -eq 10
test "$(rg '^## Problema ' trabalhos/und2/T2/trilhas/*.md | wc -l | tr -d ' ')" -eq 10
test "$(rg -c '^[0-9]+\\. \\*\\*Grupo ' trabalhos/und3/T1/T1.md)" -eq 10
test "$(rg -c '^[0-9]+\\. \\*\\*Grupo ' trabalhos/und3/T2/T2.md)" -eq 10
test "$(rg -c '^[0-9]+\\. \\*\\*Grupo ' trabalhos/und3/T3/T3.md)" -eq 10
```

Expected: T1=10, T2=10 e cada trilha de T3=10.

- [ ] **Step 2: Verificar links locais**

Run:

```bash
ruby -E UTF-8:UTF-8 -e 'bad=[]; ARGV.each{|f| File.read(f,encoding:"UTF-8").scan(/\[[^\]]+\]\(([^)#]+)(?:#[^)]+)?\)/).flatten.each{|p| next if p =~ %r{\Ahttps?://}; bad << "#{f}: #{p}" unless File.exist?(File.expand_path(p,File.dirname(f)))}}; abort bad.join("\n") unless bad.empty?; puts "LINKS_LOCAIS_OK"' mat/ensino/proj_ensino_2026.md mat/ensino/cronograma_2026_2.md mat/ensino/fluxo_ensino.md trabalhos/und1/T1.md trabalhos/und1/trilhas/*.md trabalhos/und2/T2/T2.md trabalhos/und2/T2/trilhas/*.md trabalhos/und3/README.md trabalhos/und3/T1/T1.md trabalhos/und3/T2/T2.md trabalhos/und3/T3/T3.md
```

Expected: `LINKS_LOCAIS_OK`.

- [ ] **Step 3: Verificar aferição teórica e formato**

Run:

```bash
for f in trabalhos/und1/trilhas/*.md trabalhos/und2/T2/trilhas/*.md trabalhos/und3/T1/T1.md trabalhos/und3/T2/T2.md trabalhos/und3/T3/T3.md; do rg -q 'Conhecimento teórico aferido' "$f" || exit 1; done
! rg '^\|' mat/ensino/proj_ensino_2026.md mat/ensino/cronograma_2026_2.md mat/ensino/fluxo_ensino.md trabalhos/und1/T1.md trabalhos/und1/trilhas trabalhos/und2/T2/T2.md trabalhos/und2/T2/trilhas trabalhos/und3/README.md trabalhos/und3/T1/T1.md trabalhos/und3/T2/T2.md trabalhos/und3/T3/T3.md
git diff --check
```

Expected: todos os bancos com aferição teórica explícita, nenhuma tabela e nenhuma falha de whitespace.

- [ ] **Step 4: Inspecionar o estado final**

Run:

```bash
git status --short
git log -5 --oneline
```

Expected: somente alterações preexistentes do usuário fora do escopo e os commits das Tasks 1–4 no topo do histórico.
