# Plano De Correcao Do T1 - Unidade 3

## Resumo

- Corrigir o T1 da UND3 por turma em `trabalhos/und3/aval/entrada_bruta/GR-R-261-T290-*/`.
- Nota base do grupo: `nota_repositorio/submissao (0 a 1) + nota_apresentacao (0 a 1)`, total `2,0`.
- Usar `.venv/bin/python` como interpretador padrao.
- Aplicar penalizacao de atraso a partir do HTML de avaliacao da entrega, presente em todas as turmas.
- Acrescentar depreciacao individual de ate `0,20` para alunos que nao avaliaram os demais grupos como ouvintes.

## Criterios De Correcao

### Repositorio/submissao: `1,0`

- `0,50`: evidencia clara de submissao `Accepted`.
- `0,25`: codigo-fonte, evidencias e apresentacao PDF presentes e organizados.
- `0,25`: `README.md` com execucao, modelagem, algoritmo, complexidade e casos especiais.

### Apresentacao: `1,0`

- Ler a nota do professor no arquivo `T1_T290-XX.xlsx`, rubrica do T1 da Unidade 3.
- Essa nota cobre ate `0,80`.
- Calcular ouvintes pelo HTML `Avaliacao dos Alunos Ouvintes - T1-respostas.html`, usando media das quatro respostas objetivas validas `x 0,20`.
- Ignorar respostas do aluno para o proprio grupo, grupos que nao apresentaram e respostas malformadas.

### Atraso

- Extrair status e `Ultima modificacao (envio)` do HTML `Entrega do T1 - Resolucao de Problemas com MST - Avaliacao`.
- Aplicar a mesma regra da UND2:
  - ate `1h`: sem penalizacao;
  - mais de `1h` ate `24h`: reduz a etapa de repositorio/submissao em `50%`;
  - mais de `24h`: zera a etapa de repositorio/submissao.
- A penalizacao de atraso nao reduz a nota de apresentacao, pois apresentacao e avaliacao dos ouvintes ocorreram em fluxo separado.

## Metodologia Final De Depreciacao

> Observacao: esta depreciacao e individual. Ela nao reduz a nota do grupo
> apresentado; reduz apenas a nota final do aluno que nao participou
> adequadamente da avaliacao dos demais grupos como ouvinte.

- Definir `grupos_apresentados` por turma a partir do `T1_T290-XX.xlsx`: grupos com nota de apresentacao do professor `> 0`.
- Usar o HTML de avaliacao da entrega como lista oficial de alunos por turma/grupo, pois ele contem nome, matricula, e-mail e grupo.
- Extrair integrantes do `README.md` de cada grupo clonado como conferencia/cross-check da lista oficial.
- Para cada aluno:
  - `avaliacoes_esperadas = quantidade de grupos apresentados - 1`, excluindo o proprio grupo;
  - `avaliacoes_validas = grupos distintos apresentados, diferentes do proprio, avaliados validamente pelo aluno`.
- Uma avaliacao e valida se:
  - aluno esta identificado;
  - grupo de origem e grupo avaliado foram informados;
  - grupo avaliado e diferente do grupo do aluno;
  - grupo avaliado esta em `grupos_apresentados`;
  - as quatro respostas objetivas foram marcadas;
  - em duplicatas do mesmo aluno para o mesmo grupo, manter apenas a resposta valida mais recente.

Formula:

```text
fator_participacao = min(avaliacoes_validas / avaliacoes_esperadas, 1)
desconto_individual = 0,20 * (1 - fator_participacao)
nota_individual_T1 = nota_grupo_T1 - desconto_individual
```

- Se `avaliacoes_esperadas = 0`, usar `fator_participacao = 1`.
- Se o integrante nao puder ser extraido ou associado com seguranca ao HTML dos ouvintes, nao aplicar desconto automatico; registrar pendencia para revisao manual.

## Implementacao

Criar pipeline propria em `trabalhos/und3/aval/scripts/`:

- `gerar_manifesto.py`: detectar turmas, grupos, links, HTML de avaliacao da entrega, planilha da rubrica renomeada e HTML dos ouvintes.
- `classificar_links.py`: normalizar GitHub/GitLab, inclusive links `tree/blob`, `.git` e texto com URL.
- `clonar_repositorios.py`: clonar repositorios avaliaveis em `entregas_extraidas/`.
- `extrair_integrantes.py`: consolidar alunos pelo HTML de avaliacao da entrega, localizar `README.md`, extrair integrantes, normalizar nomes e gerar pendencias de divergencia/ambiguidade.
- `calcular_ouvintes.py`: calcular nota recebida dos ouvintes por grupo e participacao individual como avaliador.
- `corrigir_T1.py`: calcular repositorio, apresentacao, ouvintes, atraso, nota base do grupo, descontos individuais e nota individual.
- `exportar_moodle.py`: gerar CSV/Markdown consolidado para lancamento.

Saidas por turma:

- `resultados/<turma>/T1/manifesto.json`
- `resultados/<turma>/T1/integrantes_por_grupo.csv`
- `resultados/<turma>/T1/participacao_ouvintes.csv`
- `resultados/<turma>/T1/descontos_individuais.csv`
- `resultados/<turma>/T1/correcao_T1.json`
- `resultados/<turma>/T1/notas_T1.csv`
- `resultados/<turma>/T1/pendencias.csv`
- `resultados/<turma>/export_moodle/notas_feedbacks.csv`

## Testes E Conferencias

- Validar parsing das turmas `T290-09`, `T290-14`, `T290-16`, `T290-20`, `T290-30`.
- Conferir grupos detectados contra pastas, HTML de avaliacao, abas e resumo dos `.xlsx`.
- Conferir status, data de envio, atraso e fator de penalizacao por grupo.
- Conferir que a nota de ouvintes soma no maximo `0,20` e nao duplica a nota do professor.
- Conferir roster extraido do HTML de avaliacao da entrega e divergencias contra os READMEs antes de aplicar descontos individuais.
- Revisar manualmente casos com README sem integrantes, nomes ambiguos, repositorio inacessivel, PDF/evidencia de Accepted duvidosa ou aluno nao associado.

## Assuncoes E Riscos

- `T1_T290-XX.xlsx` e a fonte oficial da rubrica do T1 da Unidade 3.
- A nota da planilha representa apenas a parte do professor ate `0,80`; o bloco dos ouvintes sera calculado pelo HTML.
- O atraso sera aplicado somente a etapa de repositorio/submissao, nao a apresentacao.
- A depreciacao individual usa o roster do HTML de avaliacao da entrega; divergencias com README devem gerar pendencia de revisao, nao desconto automatico adicional.
