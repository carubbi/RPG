# Dependências pedagógicas e dificuldade dos exercícios — Plano de implementação

> **For agentic workers:** REQUIRED SUB-SKILL: Use superpowers:subagent-driven-development (recommended) or superpowers:executing-plans to implement this plan task-by-task. Steps use checkbox (`- [ ]`) syntax for tracking.

**Goal:** Sincronizar fluxo, cronograma e trabalhos T1–T3 com as dependências pedagógicas aprovadas e sinalizar 28 desafios avançados nos três bancos.

**Architecture:** O projeto de ensino permanecerá imutável e funcionará como limite curricular. Fluxo e cronograma explicitarão a diferença entre conceitos-base ensinados e aprofundamentos restritos aos exercícios; os documentos dos trabalhos refletirão a progressão específica das trilhas; os nove bancos usarão uma convenção única de asterisco.

**Tech Stack:** Markdown, Ruby para verificações locais e Git.

## Restrições globais

- Não alterar `mat/ensino/proj_ensino_2026.md`.
- Não converter ainda o cronograma inteiro para redação sintética; essa será uma revisão separada.
- Ordenação topológica, SCC, Kosaraju e Tarjan para SCC permanecerão restritos aos exercícios e fora das ATs.
- Tempos de descoberta e término serão ensinados com DFS.
- Valores `low` serão ensinados no contexto de cortes em vértices e arestas.
- O símbolo `*` identificará somente os 28 desafios definidos na especificação.
- Usar a legenda: `` `*` **Desafio avançado:** exige maior transferência de conhecimentos, combinação de conceitos ou carga de implementação, sem depender de conteúdo-base ausente. ``
- Preservar datas, feriados, quantidade de problemas e composição das avaliações.

---

### Tarefa 1: Alinhar fluxo e cronograma

**Arquivos:**
- Modificar: `mat/ensino/fluxo_ensino.md`
- Modificar: `mat/ensino/cronograma_2026_2.md`
- Não modificar: `mat/ensino/proj_ensino_2026.md`

**Interfaces:**
- Consome: conteúdo curricular do projeto e progressões da especificação.
- Produz: base teórica explícita, aprofundamentos confinados aos exercícios e semana 14 diferenciada por dia.

- [ ] **Passo 1: Executar a verificação inicial**

```bash
ruby -KU -e 'c=File.read(%q[mat/ensino/cronograma_2026_2.md]); f=File.read(%q[mat/ensino/fluxo_ensino.md]); checks=[c.include?(%q[tempo de descoberta]),c.include?(%q[tempo de término]),!c[/Turma teórica — dígrafos e problemas clássicos.*$/].to_s.match?(/ordenação topológica|fortemente conexas/),c.include?(%q[quinta-feira — acompanhamento prático integral]),!f[/## Turma teórica.*?(?=## Turma prática)/m].to_s.match?(/Ordenação topológica|fortemente conexas/)]; puts checks.inspect; exit(checks.all? ? 0 : 1)'
```

Resultado esperado antes da edição: código diferente de zero.

- [ ] **Passo 2: Corrigir os princípios gerais**

Em `fluxo_ensino.md` e nos critérios de `cronograma_2026_2.md`, substituir a interpretação rígida por:

> Nenhum acompanhamento exigirá conceitos-base ainda não ensinados. Os problemas poderão exigir integração, transferência e descoberta de estratégias a partir desses conhecimentos.

Manter a exigência de evidência verificável e de fundamentação.

- [ ] **Passo 3: Corrigir a Unidade II no fluxo**

Na turma teórica:

- acrescentar estados de visita e tempos de descoberta e término a DFS;
- manter conectividade, percursos, Euler/Hamilton, cortes e introdução aos problemas clássicos previstos no projeto;
- retirar ordenação topológica e componentes fortemente conexas da lista teórica.

Nas trilhas:

- manter grafo reverso, conectividade forte, Kosaraju e Tarjan para SCC como aprofundamentos restritos aos exercícios da Trilha A;
- manter ordenação topológica como aprofundamento restrito aos exercícios da Trilha B;
- explicitar que esses aprofundamentos não integram a AT2.

- [ ] **Passo 4: Corrigir as semanas 4, 8–10**

No cronograma:

- semana 4: acrescentar estados de visita, tempos de descoberta e término;
- semana 8: acrescentar árvore DFS, valores `low` e critérios de cortes em vértices e arestas;
- semana 9: retirar ordenação topológica, SCC, `Topological` e `KosarajuSCC` da turma teórica e dos recursos; manter os exercícios avançados no T2;
- semana 10: manter a síntese e os problemas clássicos do projeto;
- AT2: não acrescentar os aprofundamentos restritos aos exercícios.

- [ ] **Passo 5: Corrigir a Unidade III e a semana 14**

No cronograma:

- semana 11: incluir representação de pesos e capacidades na síntese;
- semana 13: identificar marcos 3–4 da Trilha A;
- semana 15: identificar marcos 3–4 da Trilha B;
- semana 16: identificar marcos 3–4 da Trilha C;
- semana 17: manter marco 5 comum;
- semana 18: manter marco 6 comum;
- semana 14: registrar quarta-feira em formato integrado, com 40 minutos de síntese e 60 minutos de acompanhamento; registrar quinta-feira como acompanhamento prático integral.

Qualificar os produtos das semanas 13, 15 e 16 por trilha para evitar demandas prematuras comuns.

- [ ] **Passo 6: Verificar fluxo, cronograma e projeto imutável**

```bash
ruby -KU -e 'c=File.read(%q[mat/ensino/cronograma_2026_2.md]); f=File.read(%q[mat/ensino/fluxo_ensino.md]); teoria_c=c.scan(/^- \*\*Turma teórica[^:]*:\*\* (.*)$/).flatten.join(%q[ ]); teoria_f=f.scan(/## Turma teórica\n\n(.*?)(?=\n## )/m).flatten.join(%q[ ]); forbidden=/ordenação topológica|componentes fortemente conexas|Kosaraju|Tarjan para SCC/i; checks={%q[aprofundamentos fora da teoria]=>!teoria_c.match?(forbidden)&&!teoria_f.match?(forbidden),%q[tempos de DFS]=>c.include?(%q[tempo de descoberta])&&c.include?(%q[tempo de término]),%q[cortes com low]=>c.include?(%q[valores `low`]),%q[quarta integrada]=>c.include?(%q[quarta-feira — prática integrada]),%q[quinta integral]=>c.include?(%q[quinta-feira — acompanhamento prático integral]),%q[marcos por trilha]=>%w[Trilha\\ A Trilha\\ B Trilha\\ C].all?{|x| c.include?(x.gsub(%q[\\ ],%q[ ]))}}; checks.each{|k,v| puts %Q[#{v ? "OK" : "FALHA"}: #{k}]}; exit(checks.values.all? ? 0 : 1)'
git diff --exit-code -- mat/ensino/proj_ensino_2026.md
git diff --check
```

- [ ] **Passo 7: Registrar a tarefa**

```bash
git add mat/ensino/fluxo_ensino.md mat/ensino/cronograma_2026_2.md
git commit -m "docs: alinha dependencias no fluxo e cronograma"
```

---

### Tarefa 2: Sincronizar as regras de T1, T2 e T3

**Arquivos:**
- Modificar: `trabalhos/und1/T1.md`
- Modificar: `trabalhos/und2/T2/T2.md`
- Modificar: `trabalhos/und3/README.md`

**Interfaces:**
- Consome: progressão corrigida na Tarefa 1.
- Produz: objetivos e marcos compatíveis com soluções estruturais, desafios derivados e ensino escalonado das famílias de otimização.

- [ ] **Passo 1: Executar a verificação inicial**

```bash
ruby -KU -e 't1=File.read(%q[trabalhos/und1/T1.md]); t2=File.read(%q[trabalhos/und2/T2/T2.md]); t3=File.read(%q[trabalhos/und3/README.md]); checks=[t1.include?(%q[DFS, BFS ou ambas, quando aplicáveis]),t2.include?(%q[conceitos-base]),!t3[/### Marco 2.*?(?=### Marco 3)/m].match?(/ideia central do algoritmo|verificar a resposta/),t3.include?(%q[cada família algorítmica for ensinada])]; puts checks.inspect; exit(checks.all? ? 0 : 1)'
```

Resultado esperado antes da edição: código diferente de zero.

- [ ] **Passo 2: Ajustar o T1**

No objetivo, substituir a exigência universal de DFS/BFS por “DFS, BFS ou ambas, quando aplicáveis”. Manter a obrigação de justificar a estratégia estrutural nas trilhas A e B.

- [ ] **Passo 3: Ajustar o T2**

Explicitar que:

- os conceitos-base devem ter sido ensinados;
- a solução completa pode exigir transferência e aprofundamento;
- ordenação topológica, SCC, Kosaraju e Tarjan para SCC são desafios restritos aos exercícios;
- esses aprofundamentos não integram a AT2.

Manter `Checkposts` e os dez problemas.

- [ ] **Passo 4: Ajustar os marcos do T3**

No marco 2, manter somente representação, entrada, saída, instância e identificação preliminar da família.

No marco 3, registrar que a escolha do algoritmo ocorrerá após o ensino da família da trilha.

No marco 4, registrar que a implementação ocorrerá depois do marco 3 da respectiva trilha.

Acrescentar a correspondência:

- Trilha A: marcos 3–4 na semana 13;
- Trilha B: marcos 3–4 na semana 15;
- Trilha C: marcos 3–4 na semana 16;
- todas as trilhas: marco 5 na semana 17 e marco 6 na semana 18.

- [ ] **Passo 5: Verificar as regras**

```bash
ruby -KU -e 't1=File.read(%q[trabalhos/und1/T1.md]); t2=File.read(%q[trabalhos/und2/T2/T2.md]); t3=File.read(%q[trabalhos/und3/README.md]); checks={%q[T1 condicional]=>t1.include?(%q[DFS, BFS ou ambas, quando aplicáveis]),%q[T2 desafios derivados]=>t2.include?(%q[conceitos-base])&&t2.include?(%q[restritos aos exercícios])&&t2.include?(%q[não integrarão a AT2]),%q[T3 marco 2 sem algoritmo]=>!t3[/### Marco 2.*?(?=### Marco 3)/m].match?(/ideia central do algoritmo|verificar a resposta/),%q[T3 progressão por trilha]=>[%q[Trilha A],%q[Trilha B],%q[Trilha C],%q[semana 13],%q[semana 15],%q[semana 16]].all?{|x| t3.include?(x)}}; checks.each{|k,v| puts %Q[#{v ? "OK" : "FALHA"}: #{k}]}; exit(checks.values.all? ? 0 : 1)'
git diff --check
```

- [ ] **Passo 6: Registrar a tarefa**

```bash
git add trabalhos/und1/T1.md trabalhos/und2/T2/T2.md trabalhos/und3/README.md
git commit -m "docs: sincroniza progressao dos trabalhos"
```

---

### Tarefa 3: Sinalizar desafios avançados no T1 e T2

**Arquivos:**
- Modificar: `trabalhos/und1/trilhas/trilha-a-grafos-simples.md`
- Modificar: `trabalhos/und1/trilhas/trilha-b-digrafos.md`
- Modificar: `trabalhos/und1/trilhas/trilha-c-buscas.md`
- Modificar: `trabalhos/und2/T2/trilhas/trilha-a-conectividade.md`
- Modificar: `trabalhos/und2/T2/trilhas/trilha-b-percursos.md`
- Modificar: `trabalhos/und2/T2/trilhas/trilha-c-relacoes-estruturais.md`

**Interfaces:**
- Consome: lista de dez problemas de T1 e dez problemas de T2.
- Produz: três desafios avançados no T1, sete no T2 e legenda em cada banco.

- [ ] **Passo 1: Executar a verificação inicial**

```bash
ruby -KU -e 'files=Dir[%q[trabalhos/und1/trilhas/*.md]]+Dir[%q[trabalhos/und2/T2/trilhas/*.md]]; stars=files.sum{|f| File.read(f).scan(/^## Problema [A-J]\*/).size}; legends=files.count{|f| File.read(f).include?(%q[`*` **Desafio avançado:**])}; puts %Q[asteriscos=#{stars}; legendas=#{legends}]; exit(stars==10&&legends==6 ? 0 : 1)'
```

Resultado esperado antes da edição: código diferente de zero.

- [ ] **Passo 2: Inserir a legenda nos seis bancos**

Inserir exatamente:

> `*` **Desafio avançado:** exige maior transferência de conhecimentos, combinação de conceitos ou carga de implementação, sem depender de conteúdo-base ausente.

- [ ] **Passo 3: Marcar os três desafios do T1**

Acrescentar `*` aos títulos:

- Problema B — UVA 11387 The 3-Regular Graph;
- Problema H — CSES Labyrinth;
- Problema J — UVA 336 A Node Too Far.

- [ ] **Passo 4: Marcar os sete desafios do T2**

Acrescentar `*` aos títulos:

- Problema A — CSES Flight Routes Check;
- Problema B — Codeforces 427C Checkposts;
- Problema D — UVA 796 Critical Links;
- Problema F — Codeforces 510C Fox And Names;
- Problema G — Kattis Eulerian Path;
- Problema I — Kattis Paintball;
- Problema J — CSES Tree Isomorphism I.

- [ ] **Passo 5: Verificar títulos e legendas**

```bash
ruby -KU -e 'expected=%w[B H J A B D F G I J].sort; files=Dir[%q[trabalhos/und1/trilhas/*.md]].sort+Dir[%q[trabalhos/und2/T2/trilhas/*.md]].sort; actual=files.flat_map{|f| File.read(f).scan(/^## Problema ([A-J])\*/).flatten}.sort; abort(%Q[asteriscos divergentes: #{actual.inspect}]) unless actual==expected; abort(%q[legenda ausente]) unless files.all?{|f| File.read(f).include?(%q[`*` **Desafio avançado:**])}; puts %q[OK: 10 desafios e 6 legendas]'
git diff --check
```

- [ ] **Passo 6: Registrar a tarefa**

```bash
git add trabalhos/und1/trilhas trabalhos/und2/T2/trilhas
git commit -m "docs: sinaliza desafios avancados no T1 e T2"
```

---

### Tarefa 4: Sinalizar desafios avançados no T3

**Arquivos:**
- Modificar: `trabalhos/und3/T1/T1.md`
- Modificar: `trabalhos/und3/T2/T2.md`
- Modificar: `trabalhos/und3/T3/T3.md`

**Interfaces:**
- Consome: trinta opções das três trilhas do T3.
- Produz: dezoito desafios avançados e três legendas.

- [ ] **Passo 1: Executar a verificação inicial**

```bash
ruby -KU -e 'files=%w[trabalhos/und3/T1/T1.md trabalhos/und3/T2/T2.md trabalhos/und3/T3/T3.md]; stars=files.sum{|f| File.read(f).scan(/^\d+\. \*\*Grupo [A-J]\*/).size}; legends=files.count{|f| File.read(f).include?(%q[`*` **Desafio avançado:**])}; puts %Q[asteriscos=#{stars}; legendas=#{legends}]; exit(stars==18&&legends==3 ? 0 : 1)'
```

Resultado esperado antes da edição: código diferente de zero.

- [ ] **Passo 2: Inserir a legenda nos três bancos**

Usar a mesma legenda definida nas restrições globais.

- [ ] **Passo 3: Marcar cinco desafios de MST**

Acrescentar `*` aos grupos:

- C — Treehouses;
- D — Arctic Network;
- F — Anti Brute Force Lock;
- G — Transportation System;
- J — ACM Contest and Blackout.

- [ ] **Passo 4: Marcar seis desafios de caminhos mínimos**

Acrescentar `*` aos grupos:

- E — Route Change;
- F — Jzzhu and Cities;
- G — Flight Discount;
- H — Highest Paid Toll;
- I — Almost Shortest Path;
- J — Flight Routes.

- [ ] **Passo 5: Marcar sete desafios de fluxo máximo**

Acrescentar `*` aos grupos:

- B — Police Chase;
- C — School Dance;
- D — Distinct Routes;
- E — Gopher II;
- G — Software Allocation;
- H — The Problem with the Problem Setter;
- J — Waif Until Dark.

- [ ] **Passo 6: Verificar títulos e legendas**

```bash
ruby -KU -e 'expected={%q[trabalhos/und3/T1/T1.md]=>%w[C D F G J],%q[trabalhos/und3/T2/T2.md]=>%w[E F G H I J],%q[trabalhos/und3/T3/T3.md]=>%w[B C D E G H J]}; expected.each{|f,ids| actual=File.read(f).scan(/^\d+\. \*\*Grupo ([A-J])\*/).flatten; abort(%Q[#{f}: #{actual.inspect}]) unless actual==ids; abort(%Q[legenda ausente: #{f}]) unless File.read(f).include?(%q[`*` **Desafio avançado:**])}; puts %q[OK: 18 desafios e 3 legendas]'
git diff --check
```

- [ ] **Passo 7: Registrar a tarefa**

```bash
git add trabalhos/und3/T1/T1.md trabalhos/und3/T2/T2.md trabalhos/und3/T3/T3.md
git commit -m "docs: sinaliza desafios avancados no T3"
```

---

### Tarefa 5: Auditoria final da primeira revisão

**Arquivos:**
- Verificar todos os arquivos modificados nas tarefas 1–4.

**Interfaces:**
- Consome: quatro commits independentes.
- Produz: evidência de escopo, integridade dos links e atendimento integral à especificação.

- [ ] **Passo 1: Confirmar contagens e delimitação curricular**

```bash
ruby -KU -e 'files=Dir[%q[trabalhos/und1/trilhas/*.md]]+Dir[%q[trabalhos/und2/T2/trilhas/*.md]]+%w[trabalhos/und3/T1/T1.md trabalhos/und3/T2/T2.md trabalhos/und3/T3/T3.md]; stars=files.sum{|f| File.read(f).scan(/(?:^## Problema [A-J]\*|^\d+\. \*\*Grupo [A-J]\*)/).size}; legends=files.count{|f| File.read(f).include?(%q[`*` **Desafio avançado:**])}; abort(%Q[asteriscos=#{stars}; legendas=#{legends}]) unless stars==28&&legends==9; puts %q[OK: 28 desafios e 9 legendas]'
```

- [ ] **Passo 2: Confirmar links locais**

```bash
ruby -KU -e 'files=%w[mat/ensino/fluxo_ensino.md mat/ensino/cronograma_2026_2.md trabalhos/und1/T1.md trabalhos/und2/T2/T2.md trabalhos/und3/README.md]+Dir[%q[trabalhos/und1/trilhas/*.md]]+Dir[%q[trabalhos/und2/T2/trilhas/*.md]]+%w[trabalhos/und3/T1/T1.md trabalhos/und3/T2/T2.md trabalhos/und3/T3/T3.md]; bad=[]; files.each{|f| File.read(f).scan(/\[[^\]]+\]\(([^)]+)\)/).flatten.each{|p| next if p.match?(/\A(?:https?:|#|mailto:)/); path=p.split(%q[#],2).first; bad << %Q[#{f}: #{p}] unless File.exist?(File.expand_path(path,File.dirname(f)))}}; abort(bad.join(%q[\n])) unless bad.empty?; puts %q[OK: links locais válidos]'
```

- [ ] **Passo 3: Confirmar escopo e integridade**

```bash
git diff --check HEAD~4..HEAD
git diff --exit-code HEAD~4..HEAD -- mat/ensino/proj_ensino_2026.md
git log -4 --oneline
git status --short
```

Resultado esperado: quatro commits da implementação, projeto de ensino inalterado e somente alterações preexistentes do usuário fora do escopo no estado de trabalho. O plano contém cinco tarefas e 29 passos verificáveis.
