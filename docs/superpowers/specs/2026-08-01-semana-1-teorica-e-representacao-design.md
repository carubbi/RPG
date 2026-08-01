# Semana 1 teórica e precedência da representação computacional

## Objetivo

Reorganizar as semanas 1 a 3 da T290 para estabelecer a progressão conceitos → tipos e modelagem → representação computacional → implementação.

## Estilo

- Redação tópica, concisa e objetiva.
- Enumeração de conteúdos e produtos.
- Ausência de explicações narrativas nos encontros.
- Ausência de tabelas.

## Semana 1 — dois encontros teóricos

### Primeiro encontro — segunda/terça

- Apresentação da disciplina.
- Objetivos, metodologia e avaliações.
- Problemas motivadores: Pontes de Königsberg, rotas, redes e alocação.
- Modelagem inicial: entidades, relações, vértices e arestas.

### Segundo encontro teórico excepcional — quarta/quinta

- Grafo `G = (V, E)`.
- Vértice e aresta.
- Ordem e tamanho.
- Densidade em grafos simples não orientados.
- Grau.
- Adjacência e incidência.
- Ponte.
- Subgrafo.
- Ciclo.

### Recursos e produto

- Recurso: `mat/aulas/A1_Conceitos_Iniciais.pdf`.
- Produto formativo: exercícios conceituais, modelagens e cálculos estruturais.
- Sem prática não computacional.
- Sem acompanhamento do T1.
- Sem preparação de ambiente.
- Sem implementação.

## Semana 2 — tipos, propriedades e modelagem do T1

### Encontro teórico — segunda/terça

- Grafos rotulados.
- Grafos simples e multigrafos.
- Grafos não orientados e dígrafos.
- Grafos ponderados.
- Grafos regulares e completos.
- Grafos bipartidos.
- Grafos planares.
- Grafos conexos.
- Orientação, laços, arestas paralelas, pesos, rótulos e partições.
- Passeio, trilha e caminho: reconhecimento introdutório.

### Encontro prático — quarta/quinta

- Lançamento do T1.
- Apresentação das trilhas.
- Atribuição dos problemas.
- Preparação do ambiente Python/Java.
- Entrada, saída e restrições.
- Definição de vértices e arestas.
- Classificação do grafo.
- Ordem, tamanho, densidade e graus.
- Instância pequena e resposta esperada.

### Restrições e produto

- Sem implementação de `Graph`, `Digraph`, representação ou algoritmo.
- Produto/evidência: ficha de modelagem, classificação justificada e instância pequena.

## Semana 3 — representação e implementação

### Encontro teórico — segunda/terça

- Matriz de adjacência.
- Matriz de incidência.
- Lista de adjacência.
- Lista de incidência.
- Custos de espaço.
- Inserção de arestas.
- Consulta de adjacência e incidência.
- Percurso de vizinhança.
- Adequação da representação ao tipo e à densidade do grafo.

### Encontro prático — quarta/quinta

- Implementação de `Graph` e `Digraph`.
- Listas de adjacência.
- Python ou Java.
- Inserção e consulta de arestas.
- Leitura dos datasets.
- Representação do problema do T1.
- Validação por instância pequena.
- Custo de espaço e das operações.

### Produto

- Estruturas `Graph` e `Digraph`.
- Entrada processada.
- Representação documentada.
- Escolha justificada em função de `V`, `E`, orientação, pesos, rótulos e restrições.

## Ajustes correlatos no cronograma

- Registrar a semana 1 como exceção ao acompanhamento prático.
- Iniciar os acompanhamentos da AP1 em 12–13/08.
- Preservar as semanas 4 a 6.
- Preservar datas, feriados, apresentação da AP1 e AT1.
- Remover da semana 1 referências ao T1, `Graph`, `Graph.java`, `tinyG.txt` e à prática das Pontes de Königsberg.
- Inserir `A1_Conceitos_Iniciais.pdf` como recurso da semana 1.
- Inserir `A2_Tipos_Representação_Computacional_.pdf` como recurso das semanas 2 e 3.

## Sincronização do fluxo

- Remover a prática não computacional das Pontes de Königsberg.
- Registrar a semana 1 com dois encontros teóricos.
- Posicionar o lançamento e a modelagem inicial do T1 após os conceitos fundamentais.
- Condicionar a implementação de `Graph` e `Digraph` ao ensino prévio de representação computacional.

## Arquivos

- Modificar `mat/ensino/cronograma_2026_2.md`.
- Modificar `mat/ensino/fluxo_ensino.md`.
- Não modificar o projeto de ensino, os PDFs ou os trabalhos.

## Critérios de aceitação

- Semana 1 integralmente teórica em todas as turmas.
- Pontes de Königsberg somente como problema motivador.
- Ausência de prática não computacional.
- Ausência de implementação antes da representação computacional.
- Semana 2 sem implementação.
- `Graph` e `Digraph` implementados na semana 3 após a teoria de representação.
- Acompanhamentos da AP1 iniciados em 12–13/08.
- Redação tópica e sem tabelas.
- Demais datas e semanas preservadas.
