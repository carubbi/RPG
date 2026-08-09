# Orientação de Estudo - AV1

## Unidade 1 - Fundamentos de Grafos

A AV1 avaliará conteúdos da Unidade 1, com foco em definições, representação, modelagem, propriedades estruturais básicas e interpretação de grafos.

A prova será objetiva. As questões poderão usar figuras, conjuntos de vértices e arestas, matrizes de adjacência, matrizes de incidência, sequências de graus, famílias clássicas de grafos e pequenos problemas de modelagem.

## Assuntos Para Estudar

### 1. Conceitos Básicos de Grafos

- definição de grafo como conjunto de vértices e arestas;
- vértices, arestas, extremidades e incidência;
- adjacência entre vértices e entre arestas;
- loops, arestas paralelas e vértices isolados;
- diferença entre grafo simples, multigrafo e pseudografo;
- ordem, tamanho e notação `|V|` e `|E|`;
- problemas típicos: identificar vértices, arestas, loops, arestas paralelas, vértices isolados e decidir se um grafo é simples.

### 2. Modelagem de Problemas Como Grafos

- escolha do que será representado por vértices;
- escolha do que será representado por arestas;
- diferença entre relação de adjacência e interpretação do domínio;
- grafos dirigidos e não dirigidos;
- grafos ponderados e não ponderados;
- modelos por tabuleiro, mapas, palavras, pontos no plano, intervalos e relações;
- problemas típicos: construir um grafo a partir de uma descrição e justificar a escolha de vértices e arestas.

### 3. Subgrafos e Operações

- definição de subgrafo;
- subgrafo gerador ou spanning;
- remoção de vértices e remoção de arestas;
- subgrafo induzido por vértices e subgrafo induzido por arestas;
- subgrafos disjuntos e aresta-disjuntos;
- união, interseção, soma e decomposição de subgrafos;
- complemento de grafo simples;
- fusão de vértices;
- problemas típicos: construir subgrafos, aplicar remoções, identificar subgrafos induzidos e calcular união, interseção, soma ou complemento.

### 4. Representação de Grafos

- lista de arestas;
- lista de adjacência;
- matriz de adjacência;
- matriz de incidência;
- matriz de bipartição;
- adaptações para grafos dirigidos, ponderados, bipartidos e multigrafos;
- leitura de grau a partir das representações;
- construção de grafo a partir de lista de arestas, lista de adjacência, matriz de adjacência ou matriz de incidência;
- relação entre matriz de adjacência e complemento;
- interpretação de linhas, colunas, diagonal principal e simetria;
- problemas típicos: escolher uma representação adequada, converter entre representações, construir matrizes, desenhar grafos a partir de representações e interpretar somas de linhas ou colunas.

### 5. Graus e Sequências de Graus

- grau de um vértice;
- grau mínimo `delta(G)`, grau máximo `Delta(G)` e grau médio `mu(G)`;
- grafos regulares;
- Lema do Aperto de Mãos: soma dos graus igual a `2|E|`;
- número par de vértices de grau ímpar;
- limites para grau em grafos simples;
- existência ou impossibilidade de grafos com sequências de graus dadas;
- problemas típicos: calcular graus, verificar regularidade, determinar número de arestas e justificar se uma sequência de graus pode representar um grafo.

### 6. Famílias Clássicas de Grafos

- grafo completo `K_n`;
- grafo vazio e complemento de `K_n`;
- caminhos, ciclos e estrelas;
- grafos bipartidos completos `K_{p,q}`;
- grafos tripartidos;
- cubos `Q_k`;
- grafo de Petersen;
- grafo das arestas ou line graph `L(G)`;
- problemas típicos: reconhecer famílias clássicas, calcular número de vértices, número de arestas e graus característicos.

### 7. Grafos Bipartidos

- definição de grafo bipartido;
- partições `U` e `W`;
- grafos bipartidos completos;
- matriz de adjacência de grafo bipartido;
- matriz da bipartição;
- relação entre bipartição e ausência de ciclos ímpares em casos simples;
- propriedades de grafos bipartidos regulares;
- problemas típicos: decidir se um grafo é bipartido, indicar as partições e calcular quantidade máxima de arestas.

### 8. Conectividade Introdutória

- noção de grafo conectado e desconectado;
- vértices alcançáveis em exemplos pequenos;
- efeito da remoção de vértices e arestas na conectividade;
- identificação visual de componentes;
- relação entre conectividade e subgrafos;
- problemas típicos: decidir se um grafo é conectado, identificar componentes e analisar o efeito de remoções simples.

### 9. Contagem em Grafos

- contagem de arestas em grafos completos;
- contagem de arestas em grafos bipartidos completos;
- contagem de arestas em grafos regulares;
- contagem em grades, tabuleiros e cubos;
- uso de dupla contagem;
- cuidado com contagem duplicada de pares ou arestas;
- problemas típicos: calcular número de arestas a partir de fórmulas, graus ou descrições combinatórias.

## Estruturas de Representação

- uso de conjuntos de vértices e arestas;
- uso de lista de arestas;
- uso de matriz de adjacência;
- uso de matriz de incidência;
- escolha da representação conforme a pergunta feita.

## Fórmulas e Relações Importantes

- `|E(K_n)| = n(n - 1)/2`;
- `|E(K_{p,q})| = pq`;
- em grafo `r`-regular com `n` vértices: `|E| = nr/2`;
- soma dos graus: `sum d(v) = 2|E|`;
- grau médio: `mu(G) = 2|E|/|V|`;
- em grafo simples com `n` vértices: `0 <= d(v) <= n - 1`;
- em qualquer grafo: o número de vértices de grau ímpar é par;
- em grafo simples: `|E| <= n(n - 1)/2`.

## Como Estudar

1. Refaça exemplos pequenos identificando `V`, `E`, loops, arestas paralelas e vértices isolados.
2. Treine modelar descrições como grafos, deixando claro o que são vértices e o que são arestas.
3. Converta o mesmo grafo entre lista de arestas, lista de adjacência, matriz de adjacência e matriz de incidência.
4. Desenhe grafos a partir de matrizes e confira se linhas, colunas e diagonal foram interpretadas corretamente.
5. Calcule graus, grau mínimo, grau máximo e grau médio a partir de figuras e representações computacionais.
6. Use o Lema do Aperto de Mãos para calcular arestas, testar impossibilidades e verificar sequências de graus.
7. Treine decidir se um grafo é simples, bipartido, completo, regular ou conectado.
8. Refaça operações com subgrafos: remoção, indução, união, interseção, soma, decomposição e complemento.
9. Revise famílias clássicas: `K_n`, `K_{p,q}`, caminhos, ciclos, estrelas, cubos e Petersen.
10. Pratique contagens em grades, tabuleiros, cubos, grafos completos, bipartidos completos e grafos regulares.
11. Compare representações diferentes do mesmo grafo para evitar erros de contagem ou dupla contagem.
12. Revise as métricas do trabalho da Unidade 1: densidade, grau médio, distribuição de graus, escala log-log e clustering.

## O Que Não Será o Foco

- escrever código em Python ou Java durante a prova;
- decorar todos os exercícios da lista;
- resolver demonstrações longas ou muito abstratas;
- fazer ajuste estatístico completo de lei de potência manualmente;
- memorizar fórmulas sem compreender quando elas se aplicam;
- usar algoritmos de busca da Unidade 2 como foco principal.
