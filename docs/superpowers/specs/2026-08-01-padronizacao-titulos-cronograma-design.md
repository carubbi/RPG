# Padronização dos títulos do cronograma

## Objetivo

Padronizar o cronograma para que cada título semanal represente conjuntamente os conteúdos das turmas teórica e prática e para que cada encontro siga a forma **“Turma teórica/prática — assunto”**.

## Escopo

- Alterar somente os títulos das semanas e os rótulos das turmas em `mat/ensino/cronograma_2026_2.md`.
- Preservar integralmente datas, conteúdos, marcos, recursos, produtos, avaliações, feriados e regras de planejamento.
- Manter explícitas as exceções de aulas integradas, apresentações em datas distintas e ausência de encontro teórico.

## Títulos semanais

- Semana 1 — Apresentação da disciplina e fundamentos de grafos
- Semana 2 — Tipos de grafos e modelagem do T1
- Semana 3 — Representações computacionais e implementação do T1
- Semana 4 — Busca em profundidade e aplicação no T1
- Semana 5 — Busca em largura e conclusão do T1
- Semana 6 — Síntese de fundamentos e apresentação do T1
- Semana 7 — AT1 e modelagem inicial do T2
- Semana 8 — Percursos, conectividade e desenvolvimento do T2
- Semana 9 — Dígrafos, problemas clássicos e conclusão do T2
- Semana 10 — Síntese de conectividade e apresentação do T2
- Semana 11 — Grafos ponderados e modelagem inicial do T3
- Semana 12 — AT2 e representação computacional do T3
- Semana 13 — Árvores geradoras mínimas e desenvolvimento do T3
- Semana 14 — Consolidação de MST e desenvolvimento do T3
- Semana 15 — Dijkstra e caminhos mínimos no T3
- Semana 16 — Fluxo máximo e redes no T3
- Semana 17 — Bellman–Ford e validação do T3
- Semana 18 — Floyd–Warshall, conclusão e apresentação do T3
- Semana 19 — AT3 e apresentação final do T3

## Rótulos dos encontros

- Usar **“Turma teórica — assunto”** e **“Turma prática — assunto”**.
- Incorporar o número do marco ao assunto prático quando aplicável.
- Nas práticas integradas, indicar a síntese teórica no assunto.
- Na semana 18, manter dois rótulos de turma prática, diferenciados pela data.
- Não reescrever o conteúdo posterior aos dois-pontos.

## Verificação

- Confirmar os 19 títulos previstos.
- Confirmar que todo item de conteúdo começa por “Turma teórica —” ou “Turma prática —”.
- Comparar o texto posterior aos rótulos antes e depois da alteração.
- Confirmar que datas, links, avaliações e demais seções permanecem inalterados.
- Executar `git diff --check`.
