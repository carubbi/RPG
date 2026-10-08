Para identificar **pontes** com DFS, podemos pensar em `pre[]` e `low[]` como duas perguntas diferentes sobre cada vértice.

### 1. `pre[v]`: quando o vértice foi descoberto?

`pre[v]` registra a **ordem em que o vértice `v` foi visitado pela DFS**.

Por exemplo, no grafo não dirigido abaixo:

```text
0: 1
1: 0, 2, 3
2: 1, 3
3: 1, 2
```

```text
0
|
1
|\
| \
2--3
```

A árvore da DFS e a aresta de retorno:

```text
A = aresta da árvore
R = aresta de retorno

0
│ A
└── 1◀───────────┐
    │ A          │
    └── 2        │ R
        │ A      │
        └── 3 ───┘
```

- **Aresta da árvore:** descobre um vértice ainda não visitado e define seu pai. Neste exemplo, são `0-1`, `1-2` e `2-3`.
- **Pai:** vértice a partir do qual outro vértice foi descoberto. Essa relação pertence à árvore da DFS, não ao grafo original.
- **Ancestral:** vértice no caminho da raiz da árvore da DFS até `v`, antes de chegar a `v`. O pai é o ancestral imediato. Para `3`, os ancestrais são `2`, `1` e `0`, mas `2` é seu pai.
- **Aresta de retorno:** liga um vértice a um ancestral já descoberto **sem ser a aresta usada para chegar a ele**. No exemplo, `3—1` é de retorno: a DFS chegou a `3` por `2—3`, mas encontrou também uma ligação de `3` com o ancestral `1`. Já `3—2` é a própria aresta usada para chegar a `3`.

Nessa ordem de visita, temos:

```text
v       0   1   2   3
pre[v]  0   1   2   3
```

### 2. `low[v]`: até onde consigo voltar?

Podemos interpretar `low[v]` assim:

> `low[v]` é o menor valor de `pre` entre o próprio `v` e os ancestrais alcançados por uma aresta de retorno que sai de `v` ou de seus descendentes.

Por isso, inicialmente:

```text
low[v] = pre[v]
```

Durante a DFS, `low[v]` pode diminuir quando `v` ou um descendente encontra uma aresta de retorno para um ancestral. A aresta que liga `v` ao seu pai não conta como retorno.

Então:

```text
low[0] = pre[0] = 0
low[1] = pre[1] = 1
low[2] = pre[2] = 2
low[3] = pre[3] = 3
```

Cada `low` fica definitivo ao terminar a chamada daquele vértice. Primeiro, a DFS encontra a aresta de retorno `3—1` enquanto examina `3`. Depois, os valores são propagados na volta da recursão:

```text
3 examina 3—1:      low[3] = min(pre[3], pre[1]) = min(3, 1) = 1
3 retorna para 2:   low[2] = min(pre[2], low[3]) = min(2, 1) = 1
2 retorna para 1:   low[1] = min(pre[1], low[2]) = min(1, 1) = 1
1 retorna para 0:   low[0] = min(pre[0], low[1]) = min(0, 1) = 0
```

Para o vértice `3`, interpretamos:

```text
pre[3] = 3
```

como:

> "Eu fui descoberto na posição 3."

e:

```text
low[3] = 1
```

como:

> "Cheguei a `3` por `2-3`. No grafo, também existe `3-1`. Por essa aresta, alcanço `1` sem voltar por `3-2`."

Para o vértice `2`, interpretamos:

```text
low[2] = 1
```

como:

> "De 2, posso chegar a 1 por outro caminho: 2 → 3 → 1."

Para o vértice `1`, interpretamos:

```text
low[1] = 1
```

como:

> "Sem usar a aresta `1-0`, nem eu nem meus descendentes alcançamos `0`. O menor `pre` alcançado é 1."

Valores finais neste grafo:

| Vértice | `pre` | `low` |
| ------- | ----- | ----- |
| `0`     | 0     | 0     |
| `1`     | 1     | 1     |
| `2`     | 2     | 1     |
| `3`     | 3     | 1     |

## Como isso identifica uma ponte?

Considere uma aresta da árvore DFS:

```text
v
|
w
```

onde `w` foi descoberto a partir de `v`.

Quando a DFS termina de explorar `w` e seus descendentes, verificamos:

```text
low[w] == pre[w]
```

Se `low[w]` continua igual ao valor de descoberta de `w`, então:

> **`v-w` é uma ponte.**

Por quê?

Porque nem `w` nem nenhum de seus descendentes possui outro caminho que volte até `v` ou até algum ancestral de `v`.

Portanto, a única ligação daquela subárvore com o restante do grafo é:

```text
v-w
```

Se retirarmos essa aresta, o grafo se desconecta. `low[w] == pre[w]` é o teste usado em `Bridge.java` para grafos simples, sem arestas paralelas. A condição equivalente é `low[w] > pre[v]`.

Como `w` é filho de `v` na DFS, `pre[w] > pre[v]`. Se a subárvore de `w` não alcança `v` nem um ancestral de `v` por outra aresta, `low[w]` permanece em `pre[w]`. Se alcança, `low[w]` cai para `pre[v]` ou menos. Por isso, as duas condições têm o mesmo resultado para grafos não dirigidos simples.

### Compare os dois casos

#### Caso 1: existe caminho alternativo

No grafo de referência, considere a aresta `1—2`. A subárvore de `2` contém `2` e `3`. A aresta de retorno `3—1` oferece o caminho alternativo `2 → 3 → 1`, sem passar por `1—2`.

Os valores já calculados são:

```text
low[2] = 1
pre[2] = 2
```

Ao testar `1—2`:

```text
low[2] == pre[2]
1 == 2   FALSO
```

Portanto, **`1—2` não é ponte**: se a retirarmos, `2` ainda alcança `1` por `2 → 3 → 1`.


#### Caso 2: não existe caminho alternativo

No mesmo grafo de referência, considere a aresta `0—1`. A subárvore de `1` contém `1`, `2` e `3`. Embora exista a aresta de retorno `3—1`, ela não oferece um caminho até `0` sem passar por `0—1`.

Os valores já calculados são:

```text
low[1] = 1
pre[1] = 1
```

Ao testar `0—1`:

```text
low[1] == pre[1]
1 == 1   VERDADEIRO
```

Portanto, **`0—1` é ponte**: se a retirarmos, `0` fica isolado do restante do grafo.


### Aplicação às arestas da árvore

No grafo de referência, a DFS descobre os vértices na ordem `0 → 1 → 2 → 3`. Quando cada filho termina, aplicamos a regra às três arestas da árvore:

| Aresta da árvore | Comparação                    | Resultado   |
| ---------------- | ----------------------------- | ----------- |
| `0—1`            | `low[1] == pre[1]` → `1 == 1` | **É ponte** |
| `1—2`            | `low[2] == pre[2]` → `1 == 2` | Não é ponte |
| `2—3`            | `low[3] == pre[3]` → `1 == 3` | Não é ponte |

Em `1—2`, `low[2] < pre[2]` porque a subárvore de `2` alcança o ancestral `1` pela aresta de retorno `3—1`. Em `0—1`, `low[1] = pre[1]` porque a subárvore de `1` não alcança `0` por outra aresta. As arestas `1—2` e `2—3` pertencem ao ciclo `1—2—3—1`.

Assim, **`0—1` é a única ponte do grafo**.
