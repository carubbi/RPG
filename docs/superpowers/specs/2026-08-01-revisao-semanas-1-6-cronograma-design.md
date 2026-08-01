# Revisão das semanas 1 a 6 do cronograma da T290

## Objetivo

Revisar as semanas 1 a 6 de `mat/ensino/cronograma_2026_2.md` para assegurar a completude curricular da Unidade I e do início da Unidade II, com explicitação da representação computacional e da modelagem correspondente aos tipos de grafos.

## Hierarquia documental

- `mat/ensino/proj_ensino_2026.md` é a referência normativa para objetivos e conteúdos curriculares.
- `mat/ensino/fluxo_ensino.md` orienta a progressão didática e a articulação entre teoria, prática e trabalhos, mas não substitui nem limita o projeto de ensino.
- `mat/ensino/cronograma_2026_2.md` distribui o conteúdo completo nas datas efetivamente oferecidas pelo calendário acadêmico.

## Restrições preservadas

- Não alterar datas, feriados, avaliações ou apresentações.
- Não criar reposições nem encontros externos.
- Manter a equivalência entre as turmas de segunda/quarta e terça/quinta.
- Não exigir, nos acompanhamentos, conhecimentos ainda não ensinados.
- Manter o T1 transversal entre a Unidade I e o início da Unidade II.
- Manter as ATs em encontros teóricos integrais e as apresentações das APs em encontros práticos integrais.
- Não introduzir tabelas no documento.

## Distinção conceitual

O cronograma distinguirá tipos que alteram diretamente a modelagem ou a codificação — orientação, pesos, rótulos, laços e arestas paralelas — de propriedades verificadas sobre uma estrutura, como regularidade, completude, bipartição, planaridade e conectividade. Portanto, não será sugerido que todo tipo de grafo exige uma estrutura de dados exclusiva.

## Progressão das semanas 1 a 6

### Semana 1 — Introdução, fundamentos e modelagem

- A teoria abrangerá apresentação da disciplina, Pontes de Königsberg, rotas e redes, transformação de entidades em vértices e relações em arestas, vértice, aresta, ordem, tamanho, densidade, grau, adjacência e incidência.
- A prática começará pela atividade não computacional das Pontes de Königsberg e incluirá preparação do ambiente Python/Java, apresentação e atribuição dos problemas do T1, interpretação de entrada, saída e restrições e modelagem inicial.
- A evidência será composta por ambiente validado, resumo do problema, modelo inicial e cálculos estruturais sobre uma instância pequena.

### Semana 2 — Tipos de grafos e respectivas modelagens

- A teoria abrangerá grafos rotulados, simples, multigrafos, não orientados, dígrafos e ponderados; grafos regulares, completos, bipartidos, planares e conexos; subgrafos, pontes e ciclos; e uma introdução a passeio, trilha e caminho suficiente para o T1.
- As decisões de modelagem explicitarão orientação para relações assimétricas, multiplicidade de arestas, pesos como atributos, associação entre rótulos e índices e partições em grafos bipartidos.
- A prática implementará as APIs fundamentais de `Graph` e `Digraph` em Python ou Java, incluindo inserção de arestas, consulta de adjacência e cálculo de graus, ordem, tamanho e densidade.
- A evidência será composta pelas estruturas mínimas funcionando, pela classificação justificada do grafo do T1 e por uma instância pequena documentada.

### Semana 3 — Representação computacional

- A teoria abrangerá matrizes de adjacência e incidência, listas de adjacência e incidência, representação dos diferentes tipos de grafos e comparação dos custos de espaço e das operações fundamentais.
- A prática concluirá `Graph` e `Digraph`, fará a leitura dos datasets, representará o problema do T1, comparará matriz e lista e validará a estrutura com uma instância pequena.
- A evidência será composta pela representação documentada, pela entrada processada e pela escolha justificada em função de `V`, `E`, orientação, pesos e restrições.

### Semana 4 — Busca em profundidade

- A teoria abrangerá DFS, árvore de busca, alcançabilidade, predecessores, invariantes, correção e complexidade `O(V + E)`.
- A prática incluirá execução manual, implementação quando aplicável, identificação de componentes ou alcançabilidade e classificação de uma sequência como passeio, trilha, caminho ou ciclo.
- A evidência será composta por rastreamento manual, implementação parcial e análise inicial de complexidade.

### Semana 5 — Busca em largura e conclusão do T1

- A teoria abrangerá BFS, fronteiras, níveis, predecessores, distâncias, reconstrução de caminhos, caminho mínimo sem pesos e comparação entre BFS e DFS.
- A prática incluirá execução manual, decisão fundamentada entre estratégia estrutural, DFS e BFS, conclusão incremental da implementação e dos testes, submissão, análise de complexidade e preparação da apresentação.
- A evidência será composta pela solução testada, estratégia justificada, submissão aceita, complexidade e apresentação preparada.
- O marco final será cumulativo: implementação e testes serão construídos desde as semanas anteriores, evitando concentrar trabalho incompatível com um encontro de 100 minutos.

### Semana 6 — Síntese e apresentação da AP1

- Em 07/09, Dia da Independência do Brasil, não haverá aula.
- Em 08/09, a turma teórica realizará revisão formativa de modelagem, tipos, representações, DFS, BFS, alcançabilidade e caminhos, sem conteúdo novo, para preservar o alinhamento entre as turmas.
- Em 09 e 10/09, o encontro prático integral será dedicado à apresentação do T1.
- A evidência será composta pela apresentação da AP1, pelo repositório congelado e pela devolutiva.

## Critérios de aceitação

- Todos os conteúdos 01.01, 01.02 e 01.03 do projeto de ensino aparecem explicitamente nas semanas 1 a 3.
- Representação computacional constitui o foco explícito da semana 3.
- Os tipos de grafos são associados às decisões de modelagem pertinentes, sem confundir propriedades com estruturas de dados.
- A prática não computacional de Königsberg e a implementação de `Graph` e `Digraph` aparecem explicitamente.
- As semanas 4 e 5 preservam o ensino completo de DFS e BFS.
- A semana 6 preserva o feriado, a equivalência entre turmas e a apresentação integral da AP1.
- Recursos e produtos/evidências são coerentes com o conteúdo de cada encontro.
- Datas e estrutura das avaliações permanecem inalteradas.
