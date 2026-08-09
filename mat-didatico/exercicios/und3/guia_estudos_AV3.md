# Guia de Estudos - AV3: Algoritmos em Grafos

Este guia orienta como estudar para a AV3 da Unidade 3. A prova avalia dois
tipos de habilidade:

- **entendimento conceitual**: lógica do algoritmo, corretude, estruturas de dados e custo assintótico;
- **execução operacional**: leitura de estados parciais, atualização de estruturas e justificativa de cada decisão do trace.

O objetivo do estudo não deve ser memorizar respostas, mas conseguir explicar
por que cada algoritmo toma determinada decisão e como suas estruturas mudam ao
longo da execução.

## Como Estudar Para Melhorar a Nota

Estude cada algoritmo respondendo sempre às mesmas perguntas:

1. Qual problema o algoritmo resolve?
2. Qual é a decisão local feita a cada passo?
3. Qual estrutura de dados torna essa decisão eficiente?
4. Qual propriedade ou invariante justifica a corretude?
5. Qual operação domina o custo assintótico?
6. Como ficam as estruturas após uma etapa crítica do trace?

Para questões conceituais, treine comparações entre algoritmos parecidos. Para
questões operacionais, treine atualizar estados de arrays, filas, filas de
prioridade, componentes e fluxos sem pular etapas.

## Lazy Prim MST

**Ideia central.** O algoritmo constrói uma árvore geradora mínima crescendo a
partir de uma árvore parcial. A cada passo, considera arestas que cruzam o corte
entre vértices já na árvore e vértices fora dela.

**Estruturas de dados.**

- `marked[]`: indica quais vértices já estão na árvore.
- `pq`: fila de prioridade com arestas candidatas.
- `mst`: conjunto ou fila de arestas aceitas na MST.

**O que dominar.**

- Saber quando uma aresta é de corte.
- Entender por que a implementação é chamada de preguiçosa.
- Reconhecer que a `pq` pode conter arestas obsoletas.
- Saber que uma aresta removida da `pq` é descartada se seus dois extremos já
  estão marcados.

**Eficiência.** A versão preguiçosa pode manter muitas arestas na `pq`, inclusive
arestas que depois serão descartadas. O custo é dominado pelas operações de
inserção e remoção na fila de prioridade.

**Erros comuns.**

- Achar que toda menor aresta removida da `pq` entra na MST.
- Confundir a versão preguiçosa com a versão ansiosa.
- Esquecer que arestas obsoletas só são descartadas quando removidas da fila.

## Eager Prim MST

**Ideia central.** A versão ansiosa evita guardar todas as arestas candidatas.
Ela mantém, para cada vértice fora da árvore, apenas a melhor conexão conhecida
com a MST parcial.

**Estruturas de dados.**

- `marked[]`: indica vértices já incorporados à árvore.
- `edgeTo[]`: guarda a melhor aresta conhecida para ligar cada vértice à árvore.
- `distTo[]`: guarda o peso dessa melhor aresta.
- `IndexMinPQ`: fila de prioridade indexada por vértice.

**O que dominar.**

- Distinguir candidato por aresta, na versão preguiçosa, de candidato por
  vértice, na versão ansiosa.
- Atualizar `edgeTo[]` e `distTo[]` quando aparece uma aresta mais leve para um
  vértice fora da árvore.
- Entender que a prioridade de um vértice pode diminuir na fila indexada.

**Eficiência.** A estrutura indexada evita duplicar o mesmo vértice na fila. A
operação importante é atualizar a prioridade quando uma conexão melhor é
encontrada.

**Erros comuns.**

- Tratar `distTo[]` como distância acumulada desde uma origem, como em Dijkstra.
- Inserir o mesmo vértice mais de uma vez na fila indexada.
- Aceitar uma aresta antes de o vértice correspondente ser removido da fila.

## Kruskal MST

**Ideia central.** Kruskal examina as arestas em ordem crescente de peso e aceita
uma aresta apenas se ela une duas componentes diferentes.

**Estruturas de dados.**

- Fila de prioridade ou ordenação das arestas por peso.
- `UF`: estrutura union-find para controlar componentes.
- `find`: verifica a componente de um vértice.
- `union`: une duas componentes quando uma aresta é aceita.

**O que dominar.**

- Identificar se uma aresta fecharia ciclo.
- Entender que a decisão depende das componentes dos extremos, não apenas do
  peso da aresta.
- Saber que `rank[]` ajuda a manter a estrutura eficiente, mas não é o critério
  direto para detectar ciclo.

**Eficiência.** O custo vem da ordenação das arestas e das operações de
union-find. `find` e `union` tornam o teste de ciclo eficiente.

**Erros comuns.**

- Aceitar uma aresta só por ela ser leve.
- Fazer `union` depois de rejeitar uma aresta.
- Confundir `rank[]` com critério de ciclo.
- Imaginar que Kruskal remove arestas antigas para corrigir ciclos.

## Dijkstra

**Ideia central.** Dijkstra resolve caminhos mínimos a partir de uma origem
quando todos os pesos são não negativos. O vértice removido com menor distância
conhecida passa a ter distância definitiva.

**Estruturas de dados.**

- `distTo[]`: melhor distância conhecida desde a origem.
- `edgeTo[]`: última aresta do melhor caminho conhecido.
- `IndexMinPQ`: fila de prioridade indexada por distância.

**O que dominar.**

- Calcular o candidato de relaxação como `distTo[v] + peso(v->w)`.
- Atualizar `distTo[]`, `edgeTo[]` e a prioridade na fila quando há melhoria.
- Entender por que pesos negativos invalidam o invariante do algoritmo.

**Eficiência.** A fila de prioridade indexada permite escolher o próximo vértice
de menor distância conhecida e reduzir prioridades com eficiência.

**Erros comuns.**

- Usar apenas o peso da aresta como candidato.
- Criar entradas duplicadas para o mesmo vértice na fila indexada.
- Achar que `edgeTo[]` impede ciclos ou corrige pesos negativos.

## Bellman-Ford Baseado em Fila

**Ideia central.** Bellman-Ford permite pesos negativos porque não considera uma
distância definitiva apenas por um vértice ter sido processado. Se uma distância
melhora, essa melhoria pode ser propagada.

**Estruturas de dados.**

- `distTo[]`: melhor distância conhecida.
- `edgeTo[]`: aresta que levou à melhor distância.
- `queue`: fila de vértices que precisam ter suas arestas relaxadas.
- `onQueue[]`: indica quais vértices já estão aguardando na fila.

**O que dominar.**

- Saber quando um vértice deve entrar novamente na fila.
- Entender que `onQueue[]` evita cópias simultâneas do mesmo vértice.
- Relacionar pesos negativos a novas melhorias em `distTo[]`.
- Diferenciar a fila FIFO de Bellman-Ford da fila de prioridade de Dijkstra.

**Eficiência.** A fila evita relaxar todos os vértices em todas as passadas
quando isso não é necessário, mas o pior caso ainda pode ser proporcional a
`V E`.

**Erros comuns.**

- Achar que cada vértice sai da fila uma única vez.
- Tratar `onQueue[]` como se guardasse distâncias.
- Confundir Bellman-Ford com Dijkstra usando `IndexMinPQ`.

## Bellman-Ford Com Detecção de Ciclo Negativo

**Ideia central.** Um ciclo negativo alcançável permite reduzir indefinidamente
as distâncias dos vértices afetados. Nesse caso, não há caminhos mínimos bem
definidos para esses vértices.

**Estruturas de dados.**

- `distTo[]`: mostra reduções sucessivas de distância.
- `edgeTo[]`: pode revelar o ciclo formado pelas últimas relaxações.
- `queue` e `onQueue[]`: continuam controlando a propagação de melhorias.

**O que dominar.**

- Distinguir aresta negativa de ciclo negativo.
- Identificar um ciclo usando `edgeTo[]`.
- Somar os pesos das arestas do ciclo.
- Concluir corretamente quando o custo do ciclo é negativo.

**Eficiência e corretude.** A detecção evita que o algoritmo continue tentando
produzir caminhos mínimos onde eles não existem.

**Erros comuns.**

- Achar que uma única aresta negativa já invalida todos os caminhos.
- Incluir o caminho desde a origem no custo do ciclo.
- Confundir caminho com ciclo.
- Imaginar que Bellman-Ford remove automaticamente o ciclo.

## Ford-Fulkerson Com DFS

**Ideia central.** Ford-Fulkerson aumenta fluxo ao longo de caminhos aumentantes
na rede residual. Com DFS, o caminho escolhido depende da ordem de adjacência.

**Estruturas de dados e conceitos.**

- Rede residual: representa onde ainda é possível aumentar ou desfazer fluxo.
- Capacidade residual direta: quanto ainda pode ser enviado em uma aresta.
- Capacidade residual de retorno: quanto fluxo pode ser desfeito.
- `edgeTo[]`: registra o caminho encontrado em uma busca operacional.
- Gargalo: menor capacidade residual ao longo do caminho.

**O que dominar.**

- Entender que DFS não escolhe necessariamente o caminho com menos arestas.
- Saber que a rede residual inclui arestas diretas e de retorno.
- Calcular o gargalo de um caminho aumentante.
- Atualizar o fluxo em todas as arestas do caminho.

**Eficiência.** Com capacidades inteiras, se `U` é o número de caminhos
aumentantes, a versão genérica pode ter custo proporcional a `E U`. Escolhas
desfavoráveis de caminhos podem aumentar `U`.

**Erros comuns.**

- Confundir DFS com BFS.
- Achar que DFS escolhe o maior gargalo.
- Ignorar arestas residuais de retorno.
- Atualizar apenas a última aresta do caminho.

## Ford-Fulkerson Com BFS / Edmonds-Karp

**Ideia central.** Edmonds-Karp é a versão de Ford-Fulkerson que usa BFS na rede
residual para escolher caminhos aumentantes com menor número de arestas.

**Estruturas de dados e conceitos.**

- `queue`: fila FIFO usada pela BFS.
- `marked[]`: vértices alcançados na rede residual.
- `edgeTo[]`: caminho aumentante encontrado.
- Gargalo: menor capacidade residual do caminho.
- Valor do fluxo: aumenta pelo gargalo a cada aumento.

**O que dominar.**

- Entender por que BFS escolhe caminhos por número de arestas, não por gargalo.
- Reconstruir o caminho aumentante a partir da busca.
- Calcular o gargalo e atualizar todos os fluxos do caminho.
- Relacionar Edmonds-Karp ao limite de pior caso proporcional a `V E^2`.

**Eficiência.** A análise depende do número de arestas nos caminhos aumentantes
e das arestas críticas na rede residual, não do valor numérico das capacidades.
Por isso, o limite de Edmonds-Karp não depende de as capacidades serem inteiras.

**Erros comuns.**

- Escolher o caminho de maior capacidade em vez do caminho com menos arestas.
- Confundir BFS com DFS por ordem de adjacência.
- Usar a maior capacidade do caminho como gargalo.
- Ignorar arestas residuais de retorno.

## Checklist Final

Antes da prova, verifique se você consegue:

- explicar a diferença entre Lazy Prim e Eager Prim;
- dizer quando uma aresta é aceita ou descartada em Prim e Kruskal;
- usar `find` e `union` para justificar decisões de Kruskal;
- fazer uma relaxação em Dijkstra e em Bellman-Ford, explicando a diferença;
- atualizar `distTo[]`, `edgeTo[]`, filas e prioridades em um trace;
- identificar um ciclo negativo e calcular seu custo;
- explicar rede residual, caminho aumentante, gargalo e atualização de fluxo;
- diferenciar Ford-Fulkerson com DFS de Edmonds-Karp com BFS;
- justificar custos assintóticos a partir das operações dominantes.

Ao estudar, não basta saber qual é o próximo valor. Treine explicar por que ele
muda, qual estrutura foi responsável pela decisão e qual propriedade do
algoritmo torna essa decisão correta.
