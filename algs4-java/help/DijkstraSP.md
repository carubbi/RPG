A implementação apresentada é a versão clássica de **Dijkstra para caminhos mínimos a partir de uma única origem** em um **digrafo ponderado**, assumindo que **todas as arestas têm peso não negativo**. No código, isso aparece logo no início do construtor, quando cada aresta é verificada e uma exceção é lançada se houver peso negativo. 

## 1. Ideia central do algoritmo

O algoritmo de Dijkstra resolve o seguinte problema:

> Dado um vértice origem `s`, encontrar o menor caminho de `s` até todos os outros vértices do grafo.

A intuição é parecida com expandir uma “fronteira” a partir da origem. Primeiro sabemos que a distância da origem para ela mesma é `0`. Para todos os outros vértices, inicialmente assumimos distância infinita, pois ainda não conhecemos nenhum caminho até eles.

Depois, repetidamente, escolhemos o vértice ainda não finalizado que possui a menor distância conhecida. A partir dele, tentamos melhorar as distâncias dos seus vizinhos. Esse processo é chamado de **relaxamento**.

---

## 2. Estruturas principais usadas no código

A classe usa três estruturas centrais:

```java
private double[] distTo;
private DirectedEdge[] edgeTo;
private IndexMinPQ<Double> pq;
```

### 2.1 `distTo[]`

```java
distTo[v] = distância do menor caminho conhecido de s até v
```

Exemplo:

```java
distTo[0] = 0.0
distTo[4] = 0.38
distTo[5] = 0.73
```

Se `distTo[v]` ainda é infinito, significa que nenhum caminho da origem até `v` foi descoberto.

Complexidade de acesso:

| Operação              | Complexidade |
| --------------------- | -----------: |
| Ler `distTo[v]`       |         Θ(1) |
| Atualizar `distTo[v]` |         Θ(1) |

---

### 2.2 `edgeTo[]`

```java
edgeTo[v] = última aresta usada no menor caminho conhecido de s até v
```

Esse vetor não guarda o caminho inteiro diretamente. Ele guarda apenas a última aresta do caminho.

Por exemplo, se o menor caminho até `5` é:

```text
0 -> 4 -> 5
```

Então:

```java
edgeTo[5] = aresta 4 -> 5
edgeTo[4] = aresta 0 -> 4
```

Para reconstruir o caminho, o método `pathTo(v)` volta de trás para frente usando `edgeTo[]`.

Complexidade:

| Operação                    |                                    Complexidade |
| --------------------------- | ----------------------------------------------: |
| Ler `edgeTo[v]`             |                                            Θ(1) |
| Atualizar `edgeTo[v]`       |                                            Θ(1) |
| Reconstruir caminho até `v` | Θ(k), onde `k` é o número de arestas do caminho |

---

### 2.3 `IndexMinPQ<Double> pq`

Essa é a estrutura mais importante da implementação.

Ela representa uma **fila de prioridade mínima indexada**. Cada item da fila é um vértice, e sua prioridade é a distância atual `distTo[v]`.

A fila sempre permite remover o vértice com menor distância conhecida.

Exemplo conceitual:

```text
Vértice   Distância conhecida
2         0.26
4         0.38
7         0.60
5         0.73
```

A operação `delMin()` remove o vértice `2`, pois ele tem a menor distância.

A vantagem de ser **indexada** é que a fila consegue saber se um vértice já está dentro dela e também consegue diminuir sua prioridade com `decreaseKey`.

Complexidades típicas com heap binária:

| Operação                   | Função no código | Complexidade |
| -------------------------- | ---------------- | -----------: |
| Inserir vértice            | `insert()`       |     Θ(log V) |
| Remover menor distância    | `delMin()`       |     Θ(log V) |
| Verificar se contém índice | `contains()`     |         Θ(1) |
| Diminuir prioridade        | `decreaseKey()`  |     Θ(log V) |
| Verificar se está vazia    | `isEmpty()`      |         Θ(1) |

---

## 3. Inicialização do algoritmo

No construtor:

```java
distTo = new double[digraph.V()];
edgeTo = new DirectedEdge[digraph.V()];
```

São criados dois vetores com tamanho igual ao número de vértices.

Depois:

```java
for (int v = 0; v < digraph.V(); v++)
    distTo[v] = Double.POSITIVE_INFINITY;
distTo[s] = 0.0;
```

A lógica é:

```text
Distância da origem para ela mesma: 0
Distância da origem para os demais vértices: infinito
```

Isso representa o estado inicial do conhecimento do algoritmo.

Complexidade dessa etapa:

| Etapa                               | Complexidade |
| ----------------------------------- | -----------: |
| Criar `distTo[]` e `edgeTo[]`       |         Θ(V) |
| Inicializar distâncias com infinito |         Θ(V) |
| Definir `distTo[s] = 0`             |         Θ(1) |

---

## 4. Inserção da origem na fila

```java
pq = new IndexMinPQ<Double>(digraph.V());
pq.insert(s, distTo[s]);
```

A origem é o primeiro vértice inserido na fila, com prioridade `0`.

Isso significa:

```text
Comece explorando a partir do vértice s.
```

Complexidade:

```text
Θ(log V)
```

Na prática, como é a primeira inserção, o custo é muito pequeno, mas assintoticamente consideramos Θ(log V).

---

## 5. Laço principal

```java
while (!pq.isEmpty()) {
    int v = pq.delMin();
    for (DirectedEdge e : digraph.adj(v))
        relax(e);
}
```

Esse é o núcleo do algoritmo.

A cada iteração:

1. Remove da fila o vértice `v` com menor distância conhecida.
2. Examina todas as arestas que saem de `v`.
3. Tenta relaxar cada uma dessas arestas.

A intuição é:

> Se `v` é o vértice com menor distância conhecida, e os pesos são não negativos, então a distância atual até `v` já é definitiva.

Esse ponto é o coração do método guloso de Dijkstra.

---

## 6. O relaxamento da aresta

O método `relax(e)` é:

```java
private void relax(DirectedEdge e) {
    int v = e.from(), w = e.to();
    if (distTo[w] > distTo[v] + e.weight()) {
        distTo[w] = distTo[v] + e.weight();
        edgeTo[w] = e;
        if (pq.contains(w)) pq.decreaseKey(w, distTo[w]);
        else                pq.insert(w, distTo[w]);
    }
}
```

Suponha uma aresta:

```text
v -> w
```

com peso `e.weight()`.

A pergunta feita pelo relaxamento é:

> O caminho de `s` até `w` melhora se eu passar por `v`?

Ou seja:

```text
distância atual até w > distância até v + peso da aresta v -> w ?
```

Se sim, encontramos um caminho melhor.

Então o algoritmo atualiza:

```java
distTo[w] = distTo[v] + e.weight();
edgeTo[w] = e;
```

Isto significa:

```text
A nova melhor forma de chegar em w termina pela aresta v -> w.
```

Depois, a fila de prioridade também precisa ser atualizada:

```java
if (pq.contains(w)) pq.decreaseKey(w, distTo[w]);
else                pq.insert(w, distTo[w]);
```

Há dois casos:

| Caso                       | Ação                        | Intuição                                                |
| -------------------------- | --------------------------- | ------------------------------------------------------- |
| `w` já está na fila        | `decreaseKey(w, distTo[w])` | A distância dele melhorou, então sua prioridade diminui |
| `w` ainda não está na fila | `insert(w, distTo[w])`      | O vértice foi descoberto pela primeira vez              |

Complexidade do relaxamento:

| Operação dentro de `relax`    | Complexidade |
| ----------------------------- | -----------: |
| Acessar `e.from()` e `e.to()` |         Θ(1) |
| Acessar `e.weight()`          |         Θ(1) |
| Comparar distâncias           |         Θ(1) |
| Atualizar `distTo[w]`         |         Θ(1) |
| Atualizar `edgeTo[w]`         |         Θ(1) |
| `pq.contains(w)`              |         Θ(1) |
| `pq.decreaseKey(w, ...)`      |     Θ(log V) |
| `pq.insert(w, ...)`           |     Θ(log V) |

Assim, no pior caso:

```text
relax(e) = Θ(log V)
```

---

## 7. Por que a fila de prioridade é necessária?

Sem fila de prioridade, seria necessário procurar manualmente o vértice com menor `distTo[]` a cada passo. Isso custaria Θ(V) por escolha.

Com fila de prioridade mínima, essa escolha fica eficiente:

```java
int v = pq.delMin();
```

Essa linha faz a escolha gulosa:

> Escolha o vértice mais próximo da origem entre os ainda candidatos.

Com heap binária:

```text
delMin() = Θ(log V)
```

Como cada vértice pode ser removido uma vez, o custo total das remoções é:

```text
Θ(V log V)
```

---

## 8. Complexidade total do construtor

O próprio comentário da classe informa que essa implementação usa algoritmo de Dijkstra com heap binária e que o construtor tem tempo Θ(E log V) no pior caso, usando Θ(V) de espaço extra. 

Podemos decompor:

| Parte                       | Complexidade |
| --------------------------- | -----------: |
| Verificar pesos negativos   |         Θ(E) |
| Inicializar vetores         |         Θ(V) |
| Inserir origem              |     Θ(log V) |
| Remoções `delMin()`         |   Θ(V log V) |
| Relaxamento das arestas     |   Θ(E log V) |
| Verificação final `check()` |     Θ(V + E) |

Como normalmente `E` domina em grafos conectados ou moderadamente densos, a complexidade final é:

```text
Θ(E log V)
```

Espaço adicional:

| Estrutura                 |                                       Espaço |
| ------------------------- | -------------------------------------------: |
| `distTo[]`                |                                         Θ(V) |
| `edgeTo[]`                |                                         Θ(V) |
| `pq`                      |                                         Θ(V) |
| Pilha usada em `pathTo()` | Θ(k), apenas durante reconstrução do caminho |

Logo, o espaço principal é:

```text
Θ(V)
```

sem contar o armazenamento do próprio grafo.

---

## 9. Métodos públicos e suas complexidades

### 9.1 `distTo(int v)`

```java
public double distTo(int v) {
    validateVertex(v);
    return distTo[v];
}
```

Retorna o comprimento do menor caminho da origem até `v`.

Complexidade:

```text
Θ(1)
```

A validação também é Θ(1).

---

### 9.2 `hasPathTo(int v)`

```java
public boolean hasPathTo(int v) {
    validateVertex(v);
    return distTo[v] < Double.POSITIVE_INFINITY;
}
```

Verifica se existe caminho da origem até `v`.

Se a distância continua infinita, nenhum caminho foi encontrado.

Complexidade:

```text
Θ(1)
```

---

### 9.3 `pathTo(int v)`

```java
public Iterable<DirectedEdge> pathTo(int v) {
    validateVertex(v);
    if (!hasPathTo(v)) return null;
    Stack<DirectedEdge> path = new Stack<DirectedEdge>();
    for (DirectedEdge e = edgeTo[v]; e != null; e = edgeTo[e.from()]) {
        path.push(e);
    }
    return path;
}
```

Esse método reconstrói o caminho mínimo da origem até `v`.

Ele começa em `edgeTo[v]`, isto é, na última aresta do caminho, e vai voltando:

```text
v <- predecessor <- predecessor <- ... <- origem
```

Como esse processo encontra o caminho de trás para frente, usa uma pilha (`Stack`) para inverter a ordem.

Complexidade:

```text
Θ(k)
```

onde `k` é o número de arestas no caminho retornado.

No pior caso, um caminho simples pode ter até `V - 1` arestas, então:

```text
O(V)
```

---

### 9.4 `validateVertex(int v)`

```java
private void validateVertex(int v) {
    int V = distTo.length;
    if (v < 0 || v >= V)
        throw new IllegalArgumentException(...);
}
```

Verifica se o vértice está no intervalo válido:

```text
0 <= v < V
```

Complexidade:

```text
Θ(1)
```

---

### 9.5 `check(digraph, s)`

Esse método verifica condições de otimalidade ao final do algoritmo.

Ele checa:

1. Se não há pesos negativos.
2. Se `distTo[]` e `edgeTo[]` estão consistentes.
3. Se todas as arestas foram relaxadas corretamente.
4. Se as arestas da árvore de caminhos mínimos estão “justas”, isto é, se respeitam exatamente a distância calculada.

Complexidade:

```text
Θ(V + E)
```

Esse método é usado como verificação interna com:

```java
assert check(digraph, s);
```

Em execuções normais, dependendo da configuração da JVM, `assert` pode nem estar ativado.

---

## 10. Por que Dijkstra exige pesos não negativos?

A escolha gulosa de Dijkstra depende da seguinte ideia:

> Quando o vértice de menor distância é removido da fila, não aparecerá depois um caminho mais barato até ele.

Isso só é verdadeiro se as arestas têm pesos não negativos.

Se houver aresta negativa, um caminho que parecia pior no início pode ficar melhor depois, quebrando a lógica do algoritmo.

Exemplo conceitual:

```text
s -> a custa 10
s -> b custa 2
b -> a custa -9
```

A distância até `a` poderia melhorar depois por causa da aresta negativa. Por isso, Dijkstra não é adequado para grafos com pesos negativos. Para esse caso, normalmente se usa Bellman-Ford.

---

## 11. Intuição metodológica em sala de aula

Uma forma didática de apresentar o algoritmo é:

```text
Dijkstra mantém três ideias simultâneas:

1. O melhor custo conhecido até cada vértice.
2. A última aresta que produziu esse melhor custo.
3. Uma fila que sempre escolhe o próximo vértice mais promissor.
```

A cada passo, o algoritmo faz uma pergunta simples:

```text
Consigo chegar mais barato ao vizinho passando pelo vértice atual?
```

Se sim, atualiza a distância e registra a aresta responsável.

Ao final, `distTo[]` contém os custos mínimos e `edgeTo[]` permite reconstruir os caminhos.

---

## 12. Resumo final

| Elemento       | Papel no algoritmo                               |                      Complexidade principal |
| -------------- | ------------------------------------------------ | ------------------------------------------: |
| `distTo[]`     | Guarda menor distância conhecida                 |                                 Acesso Θ(1) |
| `edgeTo[]`     | Guarda a última aresta do caminho mínimo         |                                 Acesso Θ(1) |
| `IndexMinPQ`   | Escolhe o vértice de menor distância             | `delMin`, `insert`, `decreaseKey`: Θ(log V) |
| `relax(e)`     | Tenta melhorar o caminho até o destino da aresta |                       Θ(log V) no pior caso |
| Construtor     | Executa Dijkstra completo                        |                                  Θ(E log V) |
| `distTo(v)`    | Retorna distância mínima até `v`                 |                                        Θ(1) |
| `hasPathTo(v)` | Verifica se há caminho                           |                                        Θ(1) |
| `pathTo(v)`    | Reconstrói o caminho                             |                              Θ(k), até O(V) |

Em síntese:

> Dijkstra é um algoritmo guloso que constrói uma árvore de caminhos mínimos a partir da origem. Ele sempre expande o vértice atualmente mais próximo e usa relaxamento para melhorar as estimativas dos vizinhos. A fila de prioridade indexada é o componente que torna essa escolha eficiente.
