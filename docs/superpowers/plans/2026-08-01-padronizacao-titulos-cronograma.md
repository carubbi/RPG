# Padronização dos títulos do cronograma — Plano de implementação

> **For agentic workers:** REQUIRED SUB-SKILL: Use superpowers:subagent-driven-development (recommended) or superpowers:executing-plans to implement this plan task-by-task. Steps use checkbox (`- [ ]`) syntax for tracking.

**Goal:** Padronizar os 19 títulos semanais e os rótulos das turmas sem modificar o conteúdo do cronograma.

**Architecture:** A alteração será textual e restrita a `mat/ensino/cronograma_2026_2.md`. Os títulos sintetizarão teoria e prática; os rótulos identificarão a turma e o assunto, preservando literalmente todo texto posterior aos dois-pontos.

**Tech Stack:** Markdown, Ruby para verificações locais e Git.

## Restrições globais

- Alterar somente títulos semanais e rótulos das turmas.
- Preservar datas, conteúdos, marcos, recursos, produtos, avaliações, feriados e regras de planejamento.
- Usar **“Turma teórica — assunto”** e **“Turma prática — assunto”**.
- Manter as exceções de aulas integradas, apresentações em datas distintas e ausência de encontro teórico.
- Não introduzir tabelas.

---

### Tarefa 1: Padronizar títulos e rótulos

**Arquivos:**
- Modificar: `mat/ensino/cronograma_2026_2.md:62-220`
- Referência: `docs/superpowers/specs/2026-08-01-padronizacao-titulos-cronograma-design.md`

**Interfaces:**
- Consome: os 19 títulos e os rótulos atuais do cronograma.
- Produz: 19 títulos sintéticos e 39 itens de conteúdo com rótulos padronizados.

- [ ] **Passo 1: Executar a verificação inicial**

Executar:

```bash
ruby -KU -e 's=File.read(%q[mat/ensino/cronograma_2026_2.md]); titles=s.scan(/^#### Semana \d+ — (.+?) — \d/).flatten; abort(%Q[esperados 19 títulos, encontrados #{titles.size}]) unless titles.size==19; labels=s.scan(/^- \*\*Turma (?:teórica|prática)[^:]*:\*\*/); puts %Q[títulos=#{titles.size}; rótulos=#{labels.size}]; exit(labels.all?{|x| x.match?(/Turma (?:teórica|prática) — /)} ? 0 : 1)'
```

Resultado esperado antes da edição: saída `títulos=19; rótulos=39` e código diferente de zero, pois ainda existem rótulos sem assunto ou com “integrada” antes do travessão.

- [ ] **Passo 2: Atualizar os 19 títulos**

Substituir os títulos atuais pela lista integral da especificação, preservando as datas ao final de cada linha.

- [ ] **Passo 3: Atualizar os 39 rótulos**

Aplicar a forma **“Turma teórica/prática — assunto”**. Incorporar os marcos ao assunto, manter duas entradas práticas na semana 18 e representar as práticas integradas como síntese teórica associada ao respectivo trabalho.

- [ ] **Passo 4: Verificar títulos, rótulos e preservação do conteúdo**

Executar:

```bash
ruby -KU -e 'expected=%q[Apresentação da disciplina e fundamentos de grafos|Tipos de grafos e modelagem do T1|Representações computacionais e implementação do T1|Busca em profundidade e aplicação no T1|Busca em largura e conclusão do T1|Síntese de fundamentos e apresentação do T1|AT1 e modelagem inicial do T2|Percursos, conectividade e desenvolvimento do T2|Dígrafos, problemas clássicos e conclusão do T2|Síntese de conectividade e apresentação do T2|Grafos ponderados e modelagem inicial do T3|AT2 e representação computacional do T3|Árvores geradoras mínimas e desenvolvimento do T3|Consolidação de MST e desenvolvimento do T3|Dijkstra e caminhos mínimos no T3|Fluxo máximo e redes no T3|Bellman–Ford e validação do T3|Floyd–Warshall, conclusão e apresentação do T3|AT3 e apresentação final do T3].split(%q[|]); s=File.read(%q[mat/ensino/cronograma_2026_2.md]); actual=s.scan(/^#### Semana \d+ — (.+?) — \d/).flatten; abort(%q[títulos divergentes]) unless actual==expected; labels=s.scan(/^- \*\*(Turma (?:teórica|prática) — [^:]+):\*\*/).flatten; abort(%Q[rótulos inválidos: #{labels.size}]) unless labels.size==39; puts %q[OK: 19 títulos e 39 rótulos padronizados]'
```

Executar:

```bash
ruby -KU -e 'old=`git show HEAD:mat/ensino/cronograma_2026_2.md`; new=File.read(%q[mat/ensino/cronograma_2026_2.md]); body=->(s){s.lines.filter_map{|x| m=x.match(/^- \*\*Turma (?:teórica|prática)[^:]*:\*\* (.*)$/); m&&m[1]}}; abort(%q[conteúdo posterior aos rótulos foi alterado]) unless body.call(old)==body.call(new); puts %q[OK: conteúdo dos encontros preservado]'
```

- [ ] **Passo 5: Verificar integridade do Markdown e escopo**

Executar:

```bash
git diff --check
git diff --name-only
```

Resultado esperado: nenhum erro de whitespace e somente `mat/ensino/cronograma_2026_2.md` alterado.

- [ ] **Passo 6: Registrar a implementação**

```bash
git add mat/ensino/cronograma_2026_2.md
git commit -m "docs: padroniza titulos e assuntos das turmas"
```
