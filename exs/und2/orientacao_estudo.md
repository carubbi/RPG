# Orientação de Estudo - AV2

## Unidade 2 - Grafos

A AV2 avaliará conteúdos da Unidade 2, com foco em teoria, modelagem, interpretação de grafos e compreensão conceitual dos algoritmos.

A prova será objetiva. As questões poderão usar figuras, listas de adjacência, tabelas, sequências de vértices, pseudocódigos curtos e pequenos grafos ponderados.

## Assuntos Para Estudar

### 1. Busca em largura - BFS

- execução da BFS em grafo pequeno;
- ordem de visita e de desenfileiramento/exploração;
- níveis da busca;
- papel operacional da fila na BFS;
- complexidade da BFS com lista de adjacência;
- problemas típicos: determinar ordem de visita, níveis, predecessores, vértices alcançáveis e menor caminho em grafo não ponderado.

### 2. Busca em profundidade - DFS

- execução da DFS em grafo pequeno;
- ordem de descoberta, visita e finalização/retorno;
- papel operacional da pilha ou recursão na DFS;
- complexidade da DFS com lista de adjacência;
- problemas típicos: determinar ordem de descoberta/finalização, encontrar caminho e detectar ciclo.

### 3. Classificação de Percursos em Grafos

- definição de passeio, trilha, caminho, ciclo e circuito;
- classificação de percursos dados;
- problemas típicos: classificar uma sequência como passeio, trilha, caminho, ciclo ou circuito.

### 4. Componentes Conexas e Alcançabilidade

- componentes conexas, vértices alcançáveis e vértices isolados;
- caminhos por busca e distância mínima em grafo não ponderado;
- identificação de ciclos, pontes e vértices de articulação;
- efeito da remoção de vértices e arestas na conectividade do grafo;
- uso de BFS/DFS para verificar alcançabilidade e conectividade;
- problemas típicos: identificar componentes conexas, vértices alcançáveis, vértices isolados, pontes e vértices de articulação.

### 5. Grafos Eulerianos

- definição de circuito euleriano e trilha euleriana;
- critérios para grafos eulerianos não dirigidos;
- critérios para dígrafos eulerianos;
- paridade dos graus e balanceamento entre entrada e saída;
- conectividade em problemas eulerianos;
- eulerização;
- problemas típicos: decidir se existe trilha ou circuito euleriano e justificar por graus, balanceamento e conectividade.

### 6. Algoritmos Para Circuito Euleriano

- execução conceitual de Hierholzer e Fleury;
- diferenças entre Hierholzer e Fleury;
- papel da pilha e do controle de arestas usadas no Hierholzer;
- regra de escolha de arestas no Fleury;
- circuito euleriano após eulerização;
- complexidade conceitual do Hierholzer;
- problemas típicos: executar passos de Hierholzer ou Fleury e validar o circuito euleriano obtido.

### 7. Grafos Hamiltonianos

- definição de caminho hamiltoniano e ciclo hamiltoniano;
- diferença entre Hamilton e Euler;
- impedimentos como vértice pendente e vértice de articulação;
- aplicação dos teoremas de Dirac e Ore;
- problemas típicos: verificar caminho ou ciclo hamiltoniano e aplicar condições suficientes ou impedimentos.

### 8. Problema do Caixeiro-Viajante - TSP

- definição do TSP;
- tour, custo de um tour e ciclo hamiltoniano ponderado;
- diferença entre solução exata e heurísticas;
- execução conceitual de `nearest insertion` e `smallest insertion`;
- cálculo do aumento de custo em uma inserção;
- problemas típicos: calcular custo de tours e executar heurísticas de inserção em instâncias pequenas.

### 9. Problema do Carteiro Chinês

- definição do problema do carteiro chinês;
- relação com grafos eulerianos;
- caso não dirigido: identificação de vértices de grau ímpar;
- caso dirigido: identificação de vértices desbalanceados por grau de entrada e grau de saída;
- duplicação de caminhos, eulerização e multigrafo resultante;
- cálculo do custo total do percurso;
- diferença entre carteiro chinês e TSP;
- problemas típicos: identificar vértices ímpares no caso não dirigido ou vértices desbalanceados no caso dirigido, duplicar caminhos e calcular o custo do percurso eulerizado.

### 10. Coloração de Grafos

- modelagem de incompatibilidades como grafo;
- definição de coloração de vértices;
- coloração sequencial simples como heurística gulosa principal;
- cores proibidas, cores disponíveis e validade de uma coloração;
- dependência da ordem dos vértices em algoritmos gulosos;
- DSatur como referência de heurística gulosa;
- problemas típicos: validar uma coloração, aplicar coloração gulosa e comparar o número de cores usadas.

### 11. Isomorfismo

- definição de isomorfismo de grafos e de árvores;
- preservação de adjacências;
- limites da comparação visual e da sequência de graus;
- validação de árvore;
- folhas e centro de uma árvore;
- codificação canônica de árvores;
- ordenação dos códigos dos filhos;
- problemas típicos: testar equivalência estrutural, comparar adjacências e aplicar codificação canônica em árvores.

## Estruturas de Dados

- papel operacional de fila, pilha, recursão e fila de prioridade;
- uso de lista de adjacência e matriz de adjacência;
- associação entre estruturas de dados, algoritmos e custo de execução.

## Complexidade

- justificativa da complexidade de BFS e DFS com lista de adjacência;
- complexidade de busca de caminho, componentes conexas e detecção de ciclo;
- complexidade para identificar pontes e vértices de articulação;
- complexidade do Hierholzer;
- complexidade da coloração sequencial simples e da validação de coloração;
- complexidade das heurísticas de inserção do TSP;
- complexidade da busca de centro e da codificação canônica de árvores;

## Pseudocódigos

Estude pseudocódigos de:

- BFS;
- DFS;
- busca de caminho por DFS;
- busca de caminho mínimo por BFS;
- componentes conexas;
- detecção de ciclo em grafo não dirigido;
- identificação de pontes;
- identificação de vértices de articulação;
- validação de árvore;
- busca de centro de árvore;
- codificação canônica de árvore;
- Hierholzer;
- Fleury;
- eulerização;
- carteiro chinês em caso simples;
- coloração sequencial simples como heurística gulosa principal;
- DSatur como referência de heurística gulosa;
- nearest insertion;
- smallest insertion.

Não é necessário decorar código-fonte de `algs4`.

## Como Estudar

1. Refaça exemplos pequenos de BFS e DFS, registrando ordem de visita e, na DFS, ordem de finalização.
2. Treine classificação de percursos em grafos.
3. Treine encontrar caminho por DFS.
4. Treine encontrar menor caminho por BFS em grafo não ponderado.
5. Treine identificar componentes conexas.
6. Treine encontrar ciclo em grafo pequeno.
7. Treine identificar pontes.
8. Treine identificar vértices de articulação.
9. Resolva exemplos de grafos eulerianos.
10. Acompanhe uma execução de Hierholzer.
11. Revise eulerização em casos pequenos.
12. Verifique ciclos hamiltonianos em grafos pequenos.
13. Calcule custos de tours em grafos ponderados.
14. Resolva um exemplo simples de carteiro chinês.
15. Execute coloração sequencial simples com ordem dada.
16. Revise componentes, pontes e articulações.
17. Revise estruturas de dados associadas aos algoritmos.
18. Revise complexidade conceitual dos algoritmos usados nos trabalhos.

## O Que Não Será o Foco

- escrever código em Python ou Java durante a prova;
- decorar código-fonte de `algs4`;
- resolver instâncias grandes;
- usar algoritmos não enfatizados em aula;
- memorizar fórmulas de complexidade sem compreender o contexto.
