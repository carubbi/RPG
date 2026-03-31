# Respostas Consolidadas - Lista 1

<a id="sumario"></a>
## Sumário

- [Questão 1](#q1)
- [Questão 2](#q2)
- [Questão 3](#q3)
- [Questão 4](#q4)
- [Questão 5](#q5)
- [Questão 6](#q6)
- [Questão 7](#q7)
- [Questão 8](#q8)
- [Questão 9](#q9)
- [Questão 10](#q10)
- [Questão 11](#q11)
- [Questão 12](#q12)
- [Questão 13](#q13)
- [Questão 14](#q14)
- [Questão 15](#q15)
- [Questão 16](#q16)
- [Questão 17](#q17)
- [Questão 18](#q18)
- [Questão 19](#q19)
- [Questão 20](#q20)
- [Questão 21](#q21)
- [Questão 22](#q22)
- [Questão 23](#q23)
- [Questão 24](#q24)
- [Questão 25](#q25)
- [Questão 26](#q26)
- [Questão 27](#q27)
- [Questão 28](#q28)
- [Questão 29](#q29)
- [Questão 30](#q30)
- [Questão 31](#q31)
- [Questão 32](#q32)
- [Questão 33](#q33)
- [Questão 34](#q34)
- [Questão 35](#q35)
- [Questão 36](#q36)
- [Questão 37](#q37)
- [Questão 38](#q38)
- [Questão 39](#q39)
- [Questão 40](#q40)
- [Questão 41](#q41)
- [Questão 42](#q42)
- [Questão 43](#q43)
- [Questão 44](#q44)
- [Questão 45](#q45)
- [Questão 46](#q46)
- [Questão 47](#q47)
- [Questão 48](#q48)
- [Questão 49](#q49)
- [Questão 50](#q50)
- [Questão 51](#q51)
- [Questão 52](#q52)
- [Questão 53](#q53)
- [Questão 54](#q54)
- [Questão 55](#q55)
- [Questão 56](#q56)
- [Questão 57](#q57)
- [Questão 58](#q58)
- [Questão 59](#q59)
- [Questão 60](#q60)
- [Questão 61](#q61)
- [Questão 62](#q62)
- [Questão 63](#q63)
- [Questão 64](#q64)
- [Questão 65](#q65)
- [Questão 66](#q66)
- [Questão 67](#q67)
- [Questão 68](#q68)
- [Questão 69](#q69)
- [Questão 70](#q70)
- [Questão 71](#q71)
- [Questão 72](#q72)
- [Questão 73](#q73)
- [Questão 74](#q74)
- [Questão 75](#q75)
- [Questão 76](#q76)
- [Questão 77](#q77)
- [Questão 78](#q78)
- [Questão 79](#q79)
- [Questão 80](#q80)
- [Questão 81](#q81)
- [Questão 82](#q82)
- [Questão 83](#q83)
- [Questão 84](#q84)
- [Questão 85](#q85)
- [Questão 86](#q86)
- [Questão 87](#q87)
- [Questão 88](#q88)
- [Questão 89](#q89)
- [Questão 90](#q90)
- [Questão 91](#q91)
- [Questão 92](#q92)
- [Questão 93](#q93)
- [Questão 94](#q94)
- [Questão 95](#q95)
- [Questão 96](#q96)
- [Questão 97](#q97)
- [Questão 98](#q98)
- [Questão 99](#q99)
- [Questão 100](#q100)
- [Questão 101](#q101)
- [Questão 102](#q102)
- [Questão 103](#q103)
- [Questão 104](#q104)
- [Questão 105](#q105)
- [Questão 106](#q106)
- [Questão 107](#q107)
- [Referências](#referencias)

<a id="q1"></a>
## Resposta da Questão 1

- **Questão 1:** **(Nicoletti, 2018)** Para cada um dos três grafos $G=(V,E)$, encontre $V$, $E$, todas as arestas paralelas, todos os loops, todos os vértices isolados, e diga se $G$ é um grafo simples. Diga também a quais vértices $e_1$ é incidente.
  - **Resposta:**
    - **Grafo (a)**
      - Lista de adjacência: $v_1 : \{v_1, v_2, v_2, v_3\}$; $v_2 : \{v_1, v_1, v_3\}$; $v_3 : \{v_1, v_2, v_4\}$; $v_4 : \{v_3\}$.
      - Simples?: **não** (tem loop em $v_1$ e arestas paralelas entre $v_1$ e $v_2$).
      - Incidência de $e_1$: em $v_1$ (loop).
    - **Grafo (b)**
      - Lista de adjacência: $v_1 : \{v_2, v_3, v_5\}$; $v_2 : \{v_1, v_3, v_4, v_5\}$; $v_3 : \{v_1, v_2, v_4\}$; $v_4 : \{v_2, v_3, v_5\}$; $v_5 : \{v_1, v_2, v_4\}$.
      - Simples?: **sim** (sem loops e sem arestas paralelas).
      - Incidência de $e_1$: em $v_5$ e $v_2$.
    - **Grafo (c)**
      - Lista de adjacência: $v_1 : \emptyset$, $v_2 : \emptyset$, $v_3 : \emptyset$.
      - Simples?: **sim** (sem loops e sem arestas paralelas).
      - Incidência de $e_1$: não existe aresta $e_1$.
  - **Feedback:** Grafo simples é aquele sem laços e sem arestas paralelas. A lista de adjacência permite detectar ambos de forma mecânica (autovizinhança indica laço; repetição do mesmo vizinho indica paralela).

[Voltar ao sumário](#sumario)

<a id="q2"></a>
## Resposta da Questão 2

- **Questão 2:** **(Nicoletti, 2018)** Dê três exemplos de grafos bipartidos diferentes. Especifique os conjuntos de vértices disjuntos.
  - **Resposta:** Exemplos de bipartidos: $K_{2,3}$ com partição $\{u_1,u_2\}\cup\{v_1,v_2,v_3\}$; caminho $P_4$ com partição alternada; estrela $K_{1,4}$ com centro em uma partição e folhas na outra.
    - Exemplo 1: $K_{2,3}$
      ```mermaid
      flowchart LR
        subgraph U["U = {u1, u2}"]
          u1((u1))
          u2((u2))
        end
        subgraph V["V = {v1, v2, v3}"]
          v1((v1))
          v2((v2))
          v3((v3))
        end
        u1---v1
        u1---v2
        u1---v3
        u2---v1
        u2---v2
        u2---v3
      ```
    - Exemplo 2: $P_4$
      ```mermaid
      flowchart LR
        p1((p1))---p2((p2))---p3((p3))---p4((p4))
      ```
    - Exemplo 3: $K_{1,4}$
      ```mermaid
      flowchart LR
        c((c))
        f1((f1))
        f2((f2))
        f3((f3))
        f4((f4))
        c---f1
        c---f2
        c---f3
        c---f4
      ```
  - **Feedback:** Um grafo é bipartido quando V pode ser particionado em U e W sem arestas internas. Em cada exemplo, valide a partição checando se toda aresta cruza U-W.

[Voltar ao sumário](#sumario)

<a id="q3"></a>
## Resposta da Questão 3

- **Questão 3:** **(Nicoletti, 2018)** Verifique se cada um dos grafos a seguir é bipartido. Se o grafo em questão for bipartido, especifique os conjuntos disjuntos de vértices.

  - **Resposta:**
    - **Grafo (a)**
      - Lista de adjacência (sublista suficiente para decisão): $v_1:\{v_1,v_2,v_3\}$; $v_2:\{v_1,v_3\}$; $v_3:\{v_1,v_2\}$.
      - Bicoloração (duas cores): impossível; contraexemplo: se $v_1$ recebe cor A, o loop $v_1v_1$ exigiria simultaneamente cor B para o mesmo vértice (impossível). Portanto **não é bipartido**.
    - **Grafo (b)**
      - Lista de adjacência (sublista suficiente para decisão): $v_1:\{v_2,v_3\}$; $v_2:\{v_1,v_3\}$; $v_3:\{v_1,v_2\}$.
      - Bicoloração (duas cores): impossível; contraexemplo: colore $v_1$ com A, então $v_2$ e $v_3$ ficam B, mas há aresta $v_2v_3$ (conflito B-B). Portanto **não é bipartido**.
    - **Grafo (c)**
      - Lista de adjacência: $v_1:\emptyset$, $v_2:\emptyset$, $v_3:\emptyset$.
      - Verificação por 2-coloração: é possível colorir com duas cores sem conflito (não há arestas), então **é bipartido**.
      - Uma bipartição possível: $U=\{v_1,v_2,v_3\}$ e $W=\emptyset$.
    - **Grafo (d)**
      - Lista de adjacência (sublista suficiente para decisão): $v_2:\{v_3,v_8\}$; $v_3:\{v_2,v_8\}$; $v_8:\{v_2,v_3\}$.
      - Bicoloração (duas cores): impossível; contraexemplo: colore $v_2$ com A, então $v_3$ e $v_8$ ficam B, mas há aresta $v_3v_8$ (conflito B-B). Portanto **não é bipartido**.

  - **Feedback:** Bipartição equivale a 2-coloração e também à ausência de ciclos ímpares. Use o contraexemplo de coloração para negar bipartição e uma partição explícita para confirmá-la.

[Voltar ao sumário](#sumario)

<a id="q4"></a>
## Resposta da Questão 4

- **Questão 4:** **(Nicoletti, 2018)** Justifique cada uma das afirmações a seguir:

  - **Resposta:**
    - (a) **“Todo grafo é seu próprio subgrafo.”** Verdadeira: para $G=(V,E)$, vale $V\subseteq V$ e $E\subseteq E$, logo $G$ é subgrafo de si mesmo.
    - (b) **“Um subgrafo de um subgrafo de $G$ é subgrafo de $G$.”** Verdadeira: se $H\subseteq G$ e $K\subseteq H$, então, por transitividade de inclusão, $V_K\subseteq V_H\subseteq V_G$ e $E_K\subseteq E_H\subseteq E_G$.
    - (c) **“Um único vértice em um grafo $G$ é um subgrafo de $G$.”** Verdadeira: escolhendo $V'=\{v\}$ com $v\in V_G$ e $E'=\emptyset$, obtém-se um subgrafo de $G$.
    - (d) **“Uma única aresta de $G$, junto com seus vértices-extremidade, é subgrafo de $G$.”** Verdadeira: para $e=uv\in E_G$, tome $V'=\{u,v\}$ e $E'=\{e\}$; então $(V',E')$ satisfaz as condições de subgrafo.

  - **Feedback:** Nesta questão, o núcleo teórico é a definição de subgrafo por inclusão de conjuntos de vértices e arestas. A justificativa correta é sempre “mostrar inclusões”, não usar fórmulas de contagem.

[Voltar ao sumário](#sumario)

<a id="q5"></a>
## Resposta da Questão 5

- **Questão 5:** **(Nicoletti, 2018)** Especifique três subgrafos spanning para cada um dos grafos (a), (b), (c) e (d).

  - **Resposta:**
    - **Grafo (a)**, com $V=\{v_1,v_2,v_3,v_4,v_5,v_6,v_7,v_8\}$:
      - $H_1=(V,\{e_2,e_4,e_6,e_9,e_{10},e_{11},e_8\})$
      ```mermaid
      graph LR
        v1((v1)) ---|e2| v3((v3))
        v2((v2)) ---|e4| v3
        v3 ---|e6| v4((v4))
        v4 ---|e9| v6((v6))
        v6 ---|e10| v7((v7))
        v8((v8)) ---|e11| v6
        v5((v5)) ---|e8| v8
      ```
      - $H_2=(V,\{e_{12},e_1,e_2,e_5,e_7,e_9,e_{10},e_8\})$
      ```mermaid
      graph LR
        v1((v1)) ---|e12| v1
        v1 ---|e1| v2((v2))
        v1 ---|e2| v3((v3))
        v2 ---|e5| v8((v8))
        v8 ---|e7| v4((v4))
        v4 ---|e9| v6((v6))
        v6 ---|e10| v7((v7))
        v5((v5)) ---|e8| v8
      ```
      - $H_3=(V,\{e_3,e_6,e_8,e_{10}\})$
      ```mermaid
      graph LR
        v1((v1)) ---|e3| v2((v2))
        v3((v3)) ---|e6| v4((v4))
        v5((v5)) ---|e8| v8((v8))
        v6((v6)) ---|e10| v7((v7))
      ```
    - **Grafo (b)**, com $V=\{v_1,v_2,v_3,v_4,v_5,v_6,v_7\}$:
      - $H_1=(V,\{e_1,e_4,e_7,e_8,e_{10},e_{11}\})$
      ```mermaid
      graph LR
        v1((v1)) ---|e1| v2((v2))
        v1 ---|e4| v3((v3))
        v3 ---|e7| v4((v4))
        v4 ---|e8| v5((v5))
        v4 ---|e10| v6((v6))
        v5 ---|e11| v7((v7))
      ```
      - $H_2=(V,\{e_2,e_3,e_5,e_6,e_9,e_{11}\})$
      ```mermaid
      graph LR
        v1((v1)) ---|e2| v2((v2))
        v1 ---|e3| v5((v5))
        v2 ---|e5| v3((v3))
        v2 ---|e6| v4((v4))
        v2 ---|e9| v6((v6))
        v5 ---|e11| v7((v7))
      ```
      - $H_3=(V,\{e_1,e_2,e_4,e_{12},e_8,e_{10}\})$
      ```mermaid
      graph LR
        v1((v1)) ---|e1| v2((v2))
        v1 ---|e2| v2
        v1 ---|e4| v3((v3))
        v2 ---|e12| v4((v4))
        v4 ---|e8| v5((v5))
        v4 ---|e10| v6((v6))
      ```
    - **Grafo (c)**, com $V=\{v_1,v_2,v_3\}$:
      - Há apenas **um** spanning distinto (grafo sem arestas): $H=(V,\emptyset)$.
      - Se for exigido listar 3, eles coincidem: $H_1=H_2=H_3=(V,\emptyset)$.
      ```mermaid
      graph LR
        v1((v1))
        v2((v2))
        v3((v3))
      ```
    - **Grafo (d)**, com $V=\{v_1,v_2,v_3,v_4,v_5,v_6,v_7,v_8,v_9,v_{10}\}$:
      - $H_1=(V,\{e_1,e_2,e_3,e_4,e_5,e_6,e_{11},e_{12},e_{10}\})$
      ```mermaid
      graph LR
        v1((v1)) ---|e1| v5((v5))
        v1 ---|e2| v2((v2))
        v2 ---|e3| v3((v3))
        v3 ---|e4| v4((v4))
        v4 ---|e5| v8((v8))
        v8 ---|e6| v9((v9))
        v10((v10)) ---|e11| v9
        v9 ---|e12| v7((v7))
        v10 ---|e10| v6((v6))
      ```
      - $H_2=(V,\{e_{14},e_{13},e_8,e_2,e_3,e_7,e_6,e_{12},e_{10}\})$
      ```mermaid
      graph LR
        v4((v4)) ---|e14| v4
        v5((v5)) ---|e13| v10((v10))
        v2((v2)) ---|e8| v10
        v1((v1)) ---|e2| v2
        v2 ---|e3| v3((v3))
        v3 ---|e7| v9((v9))
        v8((v8)) ---|e6| v9
        v9 ---|e12| v7((v7))
        v10 ---|e10| v6((v6))
      ```
      - $H_3=(V,\{e_1,e_4,e_6,e_8,e_{10},e_{12}\})$
      ```mermaid
      graph LR
        v1((v1)) ---|e1| v5((v5))
        v3((v3)) ---|e4| v4((v4))
        v8((v8)) ---|e6| v9((v9))
        v2((v2)) ---|e8| v10((v10))
        v10 ---|e10| v6((v6))
        v9 ---|e12| v7((v7))
      ```

  - **Feedback:** Subgrafo spanning mantém **todos os vértices** do grafo original e escolhe apenas um subconjunto das arestas.

[Voltar ao sumário](#sumario)

<a id="q6"></a>
## Resposta da Questão 6

- **Questão 6:** **(Nicoletti, 2018)** Para os quatro grafos (a), (b), (c) e (d):

  - **Resposta:**
    - **(a) Subgrafos $G-v_3$**
      - **Grafo (a):** remove $v_3$ e arestas incidentes $\{e_2,e_4,e_6\}$.
        - Vértices: $\{v_1,v_2,v_4,v_5,v_6,v_7,v_8\}$.
        - Arestas remanescentes: $\{e_1,e_3,e_5,e_7,e_8,e_9,e_{10},e_{11},e_{12}\}$.
        - Lista de adjacência: $v_1:\{v_1,v_2,v_2\}$; $v_2:\{v_1,v_1,v_8\}$; $v_4:\{v_8,v_6\}$; $v_5:\{v_8\}$; $v_6:\{v_8,v_4,v_7\}$; $v_7:\{v_6\}$; $v_8:\{v_2,v_4,v_5,v_6\}$.
        ```mermaid
        graph LR
          v1((v1)) ---|e12| v1
          v1 ---|e1| v2((v2))
          v1 ---|e3| v2
          v2 ---|e5| v8((v8))
          v8 ---|e7| v4((v4))
          v8 ---|e8| v5((v5))
          v8 ---|e11| v6((v6))
          v4 ---|e9| v6
          v6 ---|e10| v7((v7))
        ```
      - **Grafo (b):** remove $v_3$ e arestas incidentes $\{e_4,e_5,e_7\}$.
        - Vértices: $\{v_1,v_2,v_4,v_5,v_6,v_7\}$.
        - Arestas remanescentes: $\{e_1,e_2,e_3,e_6,e_8,e_9,e_{10},e_{11},e_{12}\}$.
        - Lista de adjacência: $v_1:\{v_2,v_2,v_5\}$; $v_2:\{v_1,v_1,v_4,v_4,v_6\}$; $v_4:\{v_2,v_2,v_5,v_6\}$; $v_5:\{v_1,v_4,v_7\}$; $v_6:\{v_2,v_4\}$; $v_7:\{v_5\}$.
        ```mermaid
        graph LR
          v1((v1)) ---|e1| v2((v2))
          v1 ---|e2| v2
          v1 ---|e3| v5((v5))
          v2 ---|e6| v4((v4))
          v2 ---|e12| v4
          v2 ---|e9| v6((v6))
          v4 ---|e8| v5
          v4 ---|e10| v6
          v5 ---|e11| v7((v7))
        ```
      - **Grafo (c):** remove $v_3$ (isolado).
        - Vértices: $\{v_1,v_2\}$.
        - Arestas remanescentes: $\emptyset$.
        - Lista de adjacência: $v_1:\emptyset$; $v_2:\emptyset$.
        ```mermaid
        graph LR
          v1((v1))
          v2((v2))
        ```
      - **Grafo (d):** remove $v_3$ e arestas incidentes $\{e_3,e_4,e_7\}$.
        - Vértices: $\{v_1,v_2,v_4,v_5,v_6,v_7,v_8,v_9,v_{10}\}$.
        - Arestas remanescentes: $\{e_1,e_2,e_5,e_6,e_8,e_9,e_{10},e_{11},e_{12},e_{13},e_{14}\}$.
        - Lista de adjacência: $v_1:\{v_5,v_2\}$; $v_2:\{v_1,v_{10}\}$; $v_4:\{v_8,v_4\}$; $v_5:\{v_1,v_{10},v_{10}\}$; $v_6:\{v_{10}\}$; $v_7:\{v_9\}$; $v_8:\{v_4,v_9\}$; $v_9:\{v_8,v_{10},v_7\}$; $v_{10}:\{v_2,v_5,v_5,v_9,v_6\}$.
        ```mermaid
        graph LR
          v1((v1)) ---|e1| v5((v5))
          v1 ---|e2| v2((v2))
          v2 ---|e8| v10((v10))
          v5 ---|e9| v10
          v5 ---|e13| v10
          v10 ---|e10| v6((v6))
          v10 ---|e11| v9((v9))
          v9 ---|e12| v7((v7))
          v8((v8)) ---|e6| v9
          v4((v4)) ---|e5| v8
          v4 ---|e14| v4
        ```
    - **(b) Subgrafos $G-U$, com $U=\{v_1,v_3\}$**
      - **Grafo (a):** remove $v_1,v_3$ e arestas incidentes $\{e_1,e_2,e_3,e_4,e_6,e_{12}\}$.
        - Vértices: $\{v_2,v_4,v_5,v_6,v_7,v_8\}$.
        - Arestas remanescentes: $\{e_5,e_7,e_8,e_9,e_{10},e_{11}\}$.
        - Lista de adjacência: $v_2:\{v_8\}$; $v_4:\{v_8,v_6\}$; $v_5:\{v_8\}$; $v_6:\{v_8,v_4,v_7\}$; $v_7:\{v_6\}$; $v_8:\{v_2,v_4,v_5,v_6\}$.
        ```mermaid
        graph LR
          v2((v2)) ---|e5| v8((v8))
          v8 ---|e7| v4((v4))
          v8 ---|e8| v5((v5))
          v8 ---|e11| v6((v6))
          v4 ---|e9| v6
          v6 ---|e10| v7((v7))
        ```
      - **Grafo (b):** remove $v_1,v_3$ e arestas incidentes $\{e_1,e_2,e_3,e_4,e_5,e_7\}$.
        - Vértices: $\{v_2,v_4,v_5,v_6,v_7\}$.
        - Arestas remanescentes: $\{e_6,e_8,e_9,e_{10},e_{11},e_{12}\}$.
        - Lista de adjacência: $v_2:\{v_4,v_4,v_6\}$; $v_4:\{v_2,v_2,v_5,v_6\}$; $v_5:\{v_4,v_7\}$; $v_6:\{v_2,v_4\}$; $v_7:\{v_5\}$.
        ```mermaid
        graph LR
          v2((v2)) ---|e6| v4((v4))
          v2 ---|e12| v4
          v2 ---|e9| v6((v6))
          v4 ---|e8| v5((v5))
          v4 ---|e10| v6
          v5 ---|e11| v7((v7))
        ```
      - **Grafo (c):** remove $v_1,v_3$.
        - Vértices: $\{v_2\}$.
        - Arestas remanescentes: $\emptyset$.
        - Lista de adjacência: $v_2:\emptyset$.
        ```mermaid
        graph LR
          v2((v2))
        ```
      - **Grafo (d):** remove $v_1,v_3$ e arestas incidentes $\{e_1,e_2,e_3,e_4,e_7\}$.
        - Vértices: $\{v_2,v_4,v_5,v_6,v_7,v_8,v_9,v_{10}\}$.
        - Arestas remanescentes: $\{e_5,e_6,e_8,e_9,e_{10},e_{11},e_{12},e_{13},e_{14}\}$.
        - Lista de adjacência: $v_2:\{v_{10}\}$; $v_4:\{v_8,v_4\}$; $v_5:\{v_{10},v_{10}\}$; $v_6:\{v_{10}\}$; $v_7:\{v_9\}$; $v_8:\{v_4,v_9\}$; $v_9:\{v_8,v_{10},v_7\}$; $v_{10}:\{v_2,v_5,v_5,v_9,v_6\}$.
        ```mermaid
        graph LR
          v2((v2)) ---|e8| v10((v10))
          v5((v5)) ---|e9| v10
          v5 ---|e13| v10
          v10 ---|e10| v6((v6))
          v10 ---|e11| v9((v9))
          v9 ---|e12| v7((v7))
          v8((v8)) ---|e6| v9
          v4((v4)) ---|e5| v8
          v4 ---|e14| v4
        ```

  - **Feedback:** O procedimento correto é sempre: (1) remover vértices pedidos; (2) remover todas as arestas incidentes; (3) reescrever a lista de adjacência do subgrafo resultante.

[Voltar ao sumário](#sumario)

<a id="q7"></a>
## Resposta da Questão 7

- **Questão 7:** **(Nicoletti, 2018)** Para os três grafos (a), (b) e (d):

  - **Resposta:**
    - **(a) Subgrafos $G-e_2$**
      - **Grafo (a):** remove apenas $e_2$.
        - Vértices: $\{v_1,v_2,v_3,v_4,v_5,v_6,v_7,v_8\}$.
        - Arestas remanescentes: $\{e_1,e_3,e_4,e_5,e_6,e_7,e_8,e_9,e_{10},e_{11},e_{12}\}$.
        - Lista de adjacência: $v_1:\{v_1,v_2,v_2\}$; $v_2:\{v_1,v_1,v_3,v_8\}$; $v_3:\{v_2,v_4\}$; $v_4:\{v_3,v_8,v_6\}$; $v_5:\{v_8\}$; $v_6:\{v_4,v_7,v_8\}$; $v_7:\{v_6\}$; $v_8:\{v_2,v_4,v_5,v_6\}$.
        ```mermaid
        graph LR
          v1((v1)) ---|e12| v1
          v1 ---|e1| v2((v2))
          v1 ---|e3| v2
          v2 ---|e4| v3((v3))
          v2 ---|e5| v8((v8))
          v3 ---|e6| v4((v4))
          v8 ---|e7| v4
          v8 ---|e8| v5((v5))
          v4 ---|e9| v6((v6))
          v6 ---|e10| v7((v7))
          v8 ---|e11| v6
        ```
      - **Grafo (b):** remove apenas $e_2$.
        - Vértices: $\{v_1,v_2,v_3,v_4,v_5,v_6,v_7\}$.
        - Arestas remanescentes: $\{e_1,e_3,e_4,e_5,e_6,e_7,e_8,e_9,e_{10},e_{11},e_{12}\}$.
        - Lista de adjacência: $v_1:\{v_2,v_3,v_5\}$; $v_2:\{v_1,v_3,v_4,v_4,v_6\}$; $v_3:\{v_1,v_2,v_4\}$; $v_4:\{v_3,v_2,v_2,v_5,v_6\}$; $v_5:\{v_1,v_4,v_7\}$; $v_6:\{v_2,v_4\}$; $v_7:\{v_5\}$.
        ```mermaid
        graph LR
          v1((v1)) ---|e1| v2((v2))
          v1 ---|e4| v3((v3))
          v1 ---|e3| v5((v5))
          v2 ---|e5| v3
          v2 ---|e6| v4((v4))
          v2 ---|e12| v4
          v2 ---|e9| v6((v6))
          v3 ---|e7| v4
          v4 ---|e8| v5
          v4 ---|e10| v6
          v5 ---|e11| v7((v7))
        ```
      - **Grafo (d):** remove apenas $e_2$.
        - Vértices: $\{v_1,v_2,v_3,v_4,v_5,v_6,v_7,v_8,v_9,v_{10}\}$.
        - Arestas remanescentes: $\{e_1,e_3,e_4,e_5,e_6,e_7,e_8,e_9,e_{10},e_{11},e_{12},e_{13},e_{14}\}$.
        - Lista de adjacência: $v_1:\{v_5\}$; $v_2:\{v_3,v_{10}\}$; $v_3:\{v_2,v_4,v_9\}$; $v_4:\{v_3,v_8,v_4\}$; $v_5:\{v_1,v_{10},v_{10}\}$; $v_6:\{v_{10}\}$; $v_7:\{v_9\}$; $v_8:\{v_4,v_9\}$; $v_9:\{v_8,v_3,v_{10},v_7\}$; $v_{10}:\{v_2,v_5,v_5,v_6,v_9\}$.
        ```mermaid
        graph LR
          v1((v1)) ---|e1| v5((v5))
          v2((v2)) ---|e3| v3((v3))
          v3 ---|e4| v4((v4))
          v4 ---|e5| v8((v8))
          v8 ---|e6| v9((v9))
          v3 ---|e7| v9
          v2 ---|e8| v10((v10))
          v5 ---|e9| v10
          v5 ---|e13| v10
          v10 ---|e10| v6((v6))
          v10 ---|e11| v9
          v9 ---|e12| v7((v7))
          v4 ---|e14| v4
        ```
    - **(b) Subgrafos $G-F$, com $F=\{e_2,e_4,e_7\}$**
      - **Grafo (a):** remove $\{e_2,e_4,e_7\}$.
        - Vértices: $\{v_1,v_2,v_3,v_4,v_5,v_6,v_7,v_8\}$.
        - Arestas remanescentes: $\{e_1,e_3,e_5,e_6,e_8,e_9,e_{10},e_{11},e_{12}\}$.
        - Lista de adjacência: $v_1:\{v_1,v_2,v_2\}$; $v_2:\{v_1,v_1,v_8\}$; $v_3:\{v_4\}$; $v_4:\{v_3,v_6\}$; $v_5:\{v_8\}$; $v_6:\{v_4,v_7,v_8\}$; $v_7:\{v_6\}$; $v_8:\{v_2,v_5,v_6\}$.
        ```mermaid
        graph LR
          v1((v1)) ---|e12| v1
          v1 ---|e1| v2((v2))
          v1 ---|e3| v2
          v2 ---|e5| v8((v8))
          v3((v3)) ---|e6| v4((v4))
          v8 ---|e8| v5((v5))
          v4 ---|e9| v6((v6))
          v6 ---|e10| v7((v7))
          v8 ---|e11| v6
        ```
      - **Grafo (b):** remove $\{e_2,e_4,e_7\}$.
        - Vértices: $\{v_1,v_2,v_3,v_4,v_5,v_6,v_7\}$.
        - Arestas remanescentes: $\{e_1,e_3,e_5,e_6,e_8,e_9,e_{10},e_{11},e_{12}\}$.
        - Lista de adjacência: $v_1:\{v_2,v_5\}$; $v_2:\{v_1,v_3,v_4,v_4,v_6\}$; $v_3:\{v_2\}$; $v_4:\{v_2,v_2,v_5,v_6\}$; $v_5:\{v_1,v_4,v_7\}$; $v_6:\{v_2,v_4\}$; $v_7:\{v_5\}$.
        ```mermaid
        graph LR
          v1((v1)) ---|e1| v2((v2))
          v1 ---|e3| v5((v5))
          v2 ---|e5| v3((v3))
          v2 ---|e6| v4((v4))
          v2 ---|e12| v4
          v2 ---|e9| v6((v6))
          v4 ---|e8| v5
          v4 ---|e10| v6
          v5 ---|e11| v7((v7))
        ```
      - **Grafo (d):** remove $\{e_2,e_4,e_7\}$.
        - Vértices: $\{v_1,v_2,v_3,v_4,v_5,v_6,v_7,v_8,v_9,v_{10}\}$.
        - Arestas remanescentes: $\{e_1,e_3,e_5,e_6,e_8,e_9,e_{10},e_{11},e_{12},e_{13},e_{14}\}$.
        - Lista de adjacência: $v_1:\{v_5\}$; $v_2:\{v_3,v_{10}\}$; $v_3:\{v_2\}$; $v_4:\{v_8,v_4\}$; $v_5:\{v_1,v_{10},v_{10}\}$; $v_6:\{v_{10}\}$; $v_7:\{v_9\}$; $v_8:\{v_4,v_9\}$; $v_9:\{v_8,v_{10},v_7\}$; $v_{10}:\{v_2,v_5,v_5,v_6,v_9\}$.
        ```mermaid
        graph LR
          v1((v1)) ---|e1| v5((v5))
          v2((v2)) ---|e3| v3((v3))
          v2 ---|e8| v10((v10))
          v5 ---|e9| v10
          v5 ---|e13| v10
          v10 ---|e10| v6((v6))
          v10 ---|e11| v9((v9))
          v9 ---|e12| v7((v7))
          v8((v8)) ---|e6| v9
          v4((v4)) ---|e5| v8
          v4 ---|e14| v4
        ```

  - **Feedback:** O procedimento é: (1) remover exatamente as arestas pedidas; (2) manter todos os vértices; (3) listar arestas remanescentes e reconstruir a adjacência preservando rótulos originais.

[Voltar ao sumário](#sumario)

<a id="q8"></a>
## Resposta da Questão 8

- **Questão 8:** **(Nicoletti, 2018)** Construa o grafo básico simples de (a), (b), (c) e (d).

  - **Resposta:**
    - **Grafo (a)**
      - Vértices: $\{v_1,v_2,v_3,v_4,v_5,v_6,v_7,v_8\}$.
      - Arestas do grafo simples básico: $\{\{v_1,v_2\},\{v_1,v_3\},\{v_2,v_3\},\{v_2,v_8\},\{v_3,v_4\},\{v_4,v_8\},\{v_5,v_8\},\{v_4,v_6\},\{v_6,v_7\},\{v_6,v_8\}\}$.
      - Ajustes: remove loop $e_{12}$ em $v_1$; funde paralelas $e_1,e_3$ em uma única aresta $\{v_1,v_2\}$.
      - Lista de adjacência: $v_1:\{v_2,v_3\}$; $v_2:\{v_1,v_3,v_8\}$; $v_3:\{v_1,v_2,v_4\}$; $v_4:\{v_3,v_6,v_8\}$; $v_5:\{v_8\}$; $v_6:\{v_4,v_7,v_8\}$; $v_7:\{v_6\}$; $v_8:\{v_2,v_4,v_5,v_6\}$.
      ```mermaid
      graph LR
        v1((v1)) ---|e1/e3| v2((v2))
        v1 ---|e2| v3((v3))
        v2 ---|e4| v3
        v2 ---|e5| v8((v8))
        v3 ---|e6| v4((v4))
        v4 ---|e7| v8
        v8 ---|e8| v5((v5))
        v4 ---|e9| v6((v6))
        v6 ---|e10| v7((v7))
        v6 ---|e11| v8
      ```
    - **Grafo (b)**
      - Vértices: $\{v_1,v_2,v_3,v_4,v_5,v_6,v_7\}$.
      - Arestas do grafo simples básico: $\{\{v_1,v_2\},\{v_1,v_3\},\{v_1,v_5\},\{v_2,v_3\},\{v_2,v_4\},\{v_3,v_4\},\{v_4,v_5\},\{v_2,v_6\},\{v_4,v_6\},\{v_5,v_7\}\}$.
      - Ajustes: funde paralelas $\{e_1,e_2\}$ em $\{v_1,v_2\}$ e $\{e_6,e_{12}\}$ em $\{v_2,v_4\}$.
      - Lista de adjacência: $v_1:\{v_2,v_3,v_5\}$; $v_2:\{v_1,v_3,v_4,v_6\}$; $v_3:\{v_1,v_2,v_4\}$; $v_4:\{v_2,v_3,v_5,v_6\}$; $v_5:\{v_1,v_4,v_7\}$; $v_6:\{v_2,v_4\}$; $v_7:\{v_5\}$.
      ```mermaid
      graph LR
        v1((v1)) ---|e1/e2| v2((v2))
        v1 ---|e4| v3((v3))
        v1 ---|e3| v5((v5))
        v2 ---|e5| v3
        v2 ---|e6/e12| v4((v4))
        v3 ---|e7| v4
        v4 ---|e8| v5
        v2 ---|e9| v6((v6))
        v4 ---|e10| v6
        v5 ---|e11| v7((v7))
      ```
    - **Grafo (c)**
      - Vértices: $\{v_1,v_2,v_3\}$.
      - Arestas do grafo simples básico: $\emptyset$.
      - Ajustes: nenhum (já é simples e sem arestas).
      - Lista de adjacência: $v_1:\emptyset$; $v_2:\emptyset$; $v_3:\emptyset$.
      ```mermaid
      graph LR
        v1((v1))
        v2((v2))
        v3((v3))
      ```
    - **Grafo (d)**
      - Vértices: $\{v_1,v_2,v_3,v_4,v_5,v_6,v_7,v_8,v_9,v_{10}\}$.
      - Arestas do grafo simples básico: $\{\{v_1,v_5\},\{v_1,v_2\},\{v_2,v_3\},\{v_3,v_4\},\{v_4,v_8\},\{v_8,v_9\},\{v_3,v_9\},\{v_2,v_{10}\},\{v_5,v_{10}\},\{v_{10},v_6\},\{v_{10},v_9\},\{v_9,v_7\}\}$.
      - Ajustes: remove loop $e_{14}$ em $v_4$; funde paralelas $e_9,e_{13}$ em uma única aresta $\{v_5,v_{10}\}$.
      - Lista de adjacência: $v_1:\{v_2,v_5\}$; $v_2:\{v_1,v_3,v_{10}\}$; $v_3:\{v_2,v_4,v_9\}$; $v_4:\{v_3,v_8\}$; $v_5:\{v_1,v_{10}\}$; $v_6:\{v_{10}\}$; $v_7:\{v_9\}$; $v_8:\{v_4,v_9\}$; $v_9:\{v_3,v_7,v_8,v_{10}\}$; $v_{10}:\{v_2,v_5,v_6,v_9\}$.
      ```mermaid
      graph LR
        v1((v1)) ---|e1| v5((v5))
        v1 ---|e2| v2((v2))
        v2 ---|e3| v3((v3))
        v3 ---|e4| v4((v4))
        v4 ---|e5| v8((v8))
        v8 ---|e6| v9((v9))
        v3 ---|e7| v9
        v2 ---|e8| v10((v10))
        v5 ---|e9/e13| v10
        v10 ---|e10| v6((v6))
        v10 ---|e11| v9
        v9 ---|e12| v7((v7))
      ```

  - **Feedback:** Grafo simples básico = remover loops e substituir arestas paralelas por uma única aresta entre cada par de vértices.

[Voltar ao sumário](#sumario)

<a id="q9"></a>
## Resposta da Questão 9

- **Questão 9:** **(Nicoletti, 2018)** Para os grafos (a), (b) e (d), construa os subgrafos induzidos $G[U]$, para $U=\{v_1,v_3,v_5,v_6\}$, e $G[F]$, para $F=\{e_1,e_2,e_6,e_8\}$.

  - **Resposta:**
    - **Grafo (a)**
      - **$G[U]$**, com $U=\{v_1,v_3,v_5,v_6\}$:
        - Vértices: $\{v_1,v_3,v_5,v_6\}$.
        - Arestas: $\{e_2,e_{12}\}$ (com $e_{12}$ loop em $v_1$).
        - Lista de adjacência: $v_1:\{v_1,v_3\}$; $v_3:\{v_1\}$; $v_5:\emptyset$; $v_6:\emptyset$.
        ```mermaid
        graph LR
          v1((v1)) ---|e12| v1
          v1 ---|e2| v3((v3))
          v5((v5))
          v6((v6))
        ```
      - **$G[F]$**, com $F=\{e_1,e_2,e_6,e_8\}$:
        - Vértices: $\{v_1,v_2,v_3,v_4,v_5,v_8\}$.
        - Arestas: $\{e_1,e_2,e_6,e_8\}$.
        - Lista de adjacência: $v_1:\{v_2,v_3\}$; $v_2:\{v_1\}$; $v_3:\{v_1,v_4\}$; $v_4:\{v_3\}$; $v_5:\{v_8\}$; $v_8:\{v_5\}$.
        ```mermaid
        graph LR
          v1((v1)) ---|e1| v2((v2))
          v1 ---|e2| v3((v3))
          v3 ---|e6| v4((v4))
          v5((v5)) ---|e8| v8((v8))
        ```
    - **Grafo (b)**
      - **$G[U]$**, com $U=\{v_1,v_3,v_5,v_6\}$:
        - Vértices: $\{v_1,v_3,v_5,v_6\}$.
        - Arestas: $\{e_3,e_4\}$.
        - Lista de adjacência: $v_1:\{v_3,v_5\}$; $v_3:\{v_1\}$; $v_5:\{v_1\}$; $v_6:\emptyset$.
        ```mermaid
        graph LR
          v1((v1)) ---|e4| v3((v3))
          v1 ---|e3| v5((v5))
          v6((v6))
        ```
      - **$G[F]$**, com $F=\{e_1,e_2,e_6,e_8\}$:
        - Vértices: $\{v_1,v_2,v_4,v_5\}$.
        - Arestas: $\{e_1,e_2,e_6,e_8\}$.
        - Lista de adjacência: $v_1:\{v_2,v_2\}$; $v_2:\{v_1,v_1,v_4\}$; $v_4:\{v_2,v_5\}$; $v_5:\{v_4\}$.
        ```mermaid
        graph LR
          v1((v1)) ---|e1| v2((v2))
          v1 ---|e2| v2
          v2 ---|e6| v4((v4))
          v4 ---|e8| v5((v5))
        ```
    - **Grafo (d)**
      - **$G[U]$**, com $U=\{v_1,v_3,v_5,v_6\}$:
        - Vértices: $\{v_1,v_3,v_5,v_6\}$.
        - Arestas: $\{e_1\}$.
        - Lista de adjacência: $v_1:\{v_5\}$; $v_3:\emptyset$; $v_5:\{v_1\}$; $v_6:\emptyset$.
        ```mermaid
        graph LR
          v1((v1)) ---|e1| v5((v5))
          v3((v3))
          v6((v6))
        ```
      - **$G[F]$**, com $F=\{e_1,e_2,e_6,e_8\}$:
        - Vértices: $\{v_1,v_2,v_5,v_8,v_9,v_{10}\}$.
        - Arestas: $\{e_1,e_2,e_6,e_8\}$.
        - Lista de adjacência: $v_1:\{v_2,v_5\}$; $v_2:\{v_1,v_{10}\}$; $v_5:\{v_1\}$; $v_8:\{v_9\}$; $v_9:\{v_8\}$; $v_{10}:\{v_2\}$.
        ```mermaid
        graph LR
          v1((v1)) ---|e1| v5((v5))
          v1 ---|e2| v2((v2))
          v2 ---|e8| v10((v10))
          v8((v8)) ---|e6| v9((v9))
        ```

  - **Feedback:** Em $G[U]$, entram todas as arestas do grafo original cujas extremidades estão em $U$; em $G[F]$, entram exatamente as arestas de $F$ e todos os seus vértices incidentes.

[Voltar ao sumário](#sumario)

<a id="q10"></a>
## Resposta da Questão 10

- **Questão 10:** **(Nicoletti, 2018)** Para cada um dos grafos (a), (b) e (d), construa dois pares de subgrafos disjuntos e dois pares de subgrafos aresta-disjuntos.

  - **Resposta:**
    - **Grafo (a)**
      - **Dois pares de subgrafos disjuntos**
        - Par 1:
          - $H_1=(\{v_1,v_3\},\{e_2\})$
          - $H_2=(\{v_6,v_7\},\{e_{10}\})$
          - Verificação: $V(H_1)\cap V(H_2)=\emptyset$.
          ```mermaid
          graph LR
            v1((v1)) ---|e2| v3((v3))
            v6((v6)) ---|e10| v7((v7))
          ```
        - Par 2:
          - $H_3=(\{v_1,v_2\},\{e_1\})$
          - $H_4=(\{v_5,v_8\},\{e_8\})$
          - Verificação: $V(H_3)\cap V(H_4)=\emptyset$.
          ```mermaid
          graph LR
            v1((v1)) ---|e1| v2((v2))
            v5((v5)) ---|e8| v8((v8))
          ```
      - **Dois pares de subgrafos aresta-disjuntos**
        - Par 1:
          - $A_1=(\{v_1,v_2,v_3\},\{e_1,e_2\})$
          - $A_2=(\{v_1,v_2,v_3\},\{e_3,e_4\})$
          - Verificação: $E(A_1)\cap E(A_2)=\emptyset$.
          ```mermaid
          graph LR
            v1((v1)) ---|e1| v2((v2))
            v1 ---|e2| v3((v3))
            v1 ---|e3| v2
            v2 ---|e4| v3
          ```
        - Par 2:
          - $A_3=(\{v_2,v_4,v_5,v_8\},\{e_5,e_7,e_8\})$
          - $A_4=(\{v_4,v_6,v_7,v_8\},\{e_9,e_{10},e_{11}\})$
          - Verificação: $E(A_3)\cap E(A_4)=\emptyset$.
          ```mermaid
          graph LR
            v2((v2)) ---|e5| v8((v8))
            v8 ---|e7| v4((v4))
            v8 ---|e8| v5((v5))
            v4 ---|e9| v6((v6))
            v6 ---|e10| v7((v7))
            v8 ---|e11| v6
          ```
    - **Grafo (b)**
      - **Dois pares de subgrafos disjuntos**
        - Par 1:
          - $H_1=(\{v_1,v_3\},\{e_4\})$
          - $H_2=(\{v_5,v_7\},\{e_{11}\})$
          - Verificação: $V(H_1)\cap V(H_2)=\emptyset$.
          ```mermaid
          graph LR
            v1((v1)) ---|e4| v3((v3))
            v5((v5)) ---|e11| v7((v7))
          ```
        - Par 2:
          - $H_3=(\{v_1,v_3\},\{e_4\})$
          - $H_4=(\{v_4,v_6\},\{e_{10}\})$
          - Verificação: $V(H_3)\cap V(H_4)=\emptyset$.
          ```mermaid
          graph LR
            v1((v1)) ---|e4| v3((v3))
            v4((v4)) ---|e10| v6((v6))
          ```
      - **Dois pares de subgrafos aresta-disjuntos**
        - Par 1:
          - $A_1=(\{v_1,v_2,v_4,v_5\},\{e_1,e_3,e_8\})$
          - $A_2=(\{v_1,v_2,v_3,v_5,v_7\},\{e_2,e_4,e_{11}\})$
          - Verificação: $E(A_1)\cap E(A_2)=\emptyset$.
          ```mermaid
          graph LR
            v1((v1)) ---|e1| v2((v2))
            v1 ---|e3| v5((v5))
            v4((v4)) ---|e8| v5
            v1 ---|e2| v2
            v1 ---|e4| v3((v3))
            v5 ---|e11| v7((v7))
          ```
        - Par 2:
          - $A_3=(\{v_2,v_4,v_6\},\{e_6,e_9\})$
          - $A_4=(\{v_2,v_4,v_6\},\{e_{12},e_{10}\})$
          - Verificação: $E(A_3)\cap E(A_4)=\emptyset$.
          ```mermaid
          graph LR
            v2((v2)) ---|e6| v4((v4))
            v2 ---|e9| v6((v6))
            v2 ---|e12| v4
            v4 ---|e10| v6
          ```
    - **Grafo (d)**
      - **Dois pares de subgrafos disjuntos**
        - Par 1:
          - $H_1=(\{v_1,v_5\},\{e_1\})$
          - $H_2=(\{v_7,v_9\},\{e_{12}\})$
          - Verificação: $V(H_1)\cap V(H_2)=\emptyset$.
          ```mermaid
          graph LR
            v1((v1)) ---|e1| v5((v5))
            v7((v7)) ---|e12| v9((v9))
          ```
        - Par 2:
          - $H_3=(\{v_1,v_2\},\{e_2\})$
          - $H_4=(\{v_4,v_8\},\{e_5\})$
          - Verificação: $V(H_3)\cap V(H_4)=\emptyset$.
          ```mermaid
          graph LR
            v1((v1)) ---|e2| v2((v2))
            v4((v4)) ---|e5| v8((v8))
          ```
      - **Dois pares de subgrafos aresta-disjuntos**
        - Par 1:
          - $A_1=(\{v_5,v_{10}\},\{e_9,e_{13}\})$
          - $A_2=(\{v_2,v_6,v_9,v_{10}\},\{e_8,e_{10},e_{11}\})$
          - Verificação: $E(A_1)\cap E(A_2)=\emptyset$.
          ```mermaid
          graph LR
            v5((v5)) ---|e9| v10((v10))
            v5 ---|e13| v10
            v2((v2)) ---|e8| v10
            v10 ---|e10| v6((v6))
            v10 ---|e11| v9((v9))
          ```
        - Par 2:
          - $A_3=(\{v_3,v_4\},\{e_3,e_4,e_{14}\})$
          - $A_4=(\{v_3,v_7,v_8,v_9\},\{e_6,e_7,e_{12}\})$
          - Verificação: $E(A_3)\cap E(A_4)=\emptyset$.
          ```mermaid
          graph LR
            v3((v3)) ---|e3| v4((v4))
            v3 ---|e4| v4
            v4 ---|e14| v4
            v8((v8)) ---|e6| v9((v9))
            v3 ---|e7| v9
            v9 ---|e12| v7((v7))
          ```

  - **Feedback:** Disjuntos exigem conjuntos de vértices sem interseção; aresta-disjuntos exigem apenas conjuntos de arestas sem interseção (podendo compartilhar vértices).

[Voltar ao sumário](#sumario)

<a id="q11"></a>
## Resposta da Questão 11

- **Questão 11:** **(Nicoletti, 2018)** Para cada um dos grafos (a), (b) e (d), dê exemplos das operações:

  - **Resposta:**
    - **Grafo (a)**
      - Tome $H_1=(\{v_1,v_2,v_3\},\{e_1,e_2,e_4\})$ e $H_2=(\{v_1,v_2,v_3,v_8\},\{e_3,e_4,e_5\})$.
      - (a) União: $H_1\cup H_2=(\{v_1,v_2,v_3,v_8\},\{e_1,e_2,e_3,e_4,e_5\})$.
      ```mermaid
      graph LR
        v1((v1)) ---|e1| v2((v2))
        v1 ---|e2| v3((v3))
        v1 ---|e3| v2
        v2 ---|e4| v3
        v2 ---|e5| v8((v8))
      ```
      - (b) Interseção: $H_1\cap H_2=(\{v_2,v_3\},\{e_4\})$.
      ```mermaid
      graph LR
        v2((v2)) ---|e4| v3((v3))
      ```
      - (c) Soma: $H_1\oplus H_2=(\{v_1,v_2,v_3,v_8\},\{e_1,e_2,e_3,e_5\})$.
      ```mermaid
      graph LR
        v1((v1)) ---|e1| v2((v2))
        v1 ---|e2| v3((v3))
        v1 ---|e3| v2
        v2 ---|e5| v8((v8))
      ```
      - (d) Complemento: para $S=(\{v_2,v_3,v_4,v_8\},\{\{v_2,v_3\},\{v_3,v_4\}\})$, em relação a $K_4$ nesses vértices,
        $\overline{S}=(\{v_2,v_3,v_4,v_8\},\{\{v_2,v_4\},\{v_2,v_8\},\{v_3,v_8\},\{v_4,v_8\}\})$.
      ```mermaid
      graph LR
        v2((v2)) ---|e4| v3((v3))
        v3 ---|e6| v4((v4))
      ```
      ```mermaid
      graph LR
        v2((v2)) ---|comp| v4((v4))
        v2 ---|comp| v8((v8))
        v3((v3)) ---|comp| v8
        v4 ---|comp| v8
      ```
    - **Grafo (b)**
      - Tome $H_1=(\{v_1,v_2,v_3\},\{e_1,e_4,e_5\})$ e $H_2=(\{v_1,v_2,v_3,v_4\},\{e_2,e_5,e_6\})$.
      - (a) União: $H_1\cup H_2=(\{v_1,v_2,v_3,v_4\},\{e_1,e_2,e_4,e_5,e_6\})$.
      ```mermaid
      graph LR
        v1((v1)) ---|e1| v2((v2))
        v1 ---|e2| v2
        v1 ---|e4| v3((v3))
        v2 ---|e5| v3
        v2 ---|e6| v4((v4))
      ```
      - (b) Interseção: $H_1\cap H_2=(\{v_2,v_3\},\{e_5\})$.
      ```mermaid
      graph LR
        v2((v2)) ---|e5| v3((v3))
      ```
      - (c) Soma: $H_1\oplus H_2=(\{v_1,v_2,v_3,v_4\},\{e_1,e_2,e_4,e_6\})$.
      ```mermaid
      graph LR
        v1((v1)) ---|e1| v2((v2))
        v1 ---|e2| v2
        v1 ---|e4| v3((v3))
        v2 ---|e6| v4((v4))
      ```
      - (d) Complemento: para $S=(\{v_2,v_3,v_4,v_6\},\{\{v_2,v_3\},\{v_3,v_4\},\{v_4,v_6\}\})$, em relação a $K_4$ nesses vértices,
        $\overline{S}=(\{v_2,v_3,v_4,v_6\},\{\{v_2,v_4\},\{v_2,v_6\},\{v_3,v_6\}\})$.
      ```mermaid
      graph LR
        v2((v2)) ---|e5| v3((v3))
        v3 ---|e7| v4((v4))
        v4 ---|e10| v6((v6))
      ```
      ```mermaid
      graph LR
        v2((v2)) ---|comp| v4((v4))
        v2 ---|comp| v6((v6))
        v3((v3)) ---|comp| v6
      ```
    - **Grafo (d)**
      - Tome $H_1=(\{v_1,v_2,v_5,v_{10}\},\{e_1,e_2,e_8\})$ e $H_2=(\{v_1,v_2,v_3,v_9,v_{10}\},\{e_2,e_3,e_8,e_{11}\})$.
      - (a) União: $H_1\cup H_2=(\{v_1,v_2,v_3,v_5,v_9,v_{10}\},\{e_1,e_2,e_3,e_8,e_{11}\})$.
      ```mermaid
      graph LR
        v1((v1)) ---|e1| v5((v5))
        v1 ---|e2| v2((v2))
        v2 ---|e3| v3((v3))
        v2 ---|e8| v10((v10))
        v10 ---|e11| v9((v9))
      ```
      - (b) Interseção: $H_1\cap H_2=(\{v_1,v_2,v_{10}\},\{e_2,e_8\})$.
      ```mermaid
      graph LR
        v1((v1)) ---|e2| v2((v2))
        v2 ---|e8| v10((v10))
      ```
      - (c) Soma: $H_1\oplus H_2=(\{v_1,v_2,v_3,v_5,v_9,v_{10}\},\{e_1,e_3,e_{11}\})$.
      ```mermaid
      graph LR
        v1((v1)) ---|e1| v5((v5))
        v2((v2)) ---|e3| v3((v3))
        v10((v10)) ---|e11| v9((v9))
      ```
      - (d) Complemento: para $S=(\{v_2,v_3,v_9,v_{10}\},\{\{v_2,v_3\},\{v_9,v_{10}\}\})$, em relação a $K_4$ nesses vértices,
        $\overline{S}=(\{v_2,v_3,v_9,v_{10}\},\{\{v_2,v_9\},\{v_2,v_{10}\},\{v_3,v_9\},\{v_3,v_{10}\}\})$.
      ```mermaid
      graph LR
        v2((v2)) ---|e3| v3((v3))
        v9((v9)) ---|e11| v10((v10))
      ```
      ```mermaid
      graph LR
        v2((v2)) ---|comp| v9((v9))
        v2 ---|e8| v10((v10))
        v3((v3)) ---|e7| v9
        v3 ---|comp| v10
      ```

  - **Feedback:** Para união/interseção/soma, opere sobre os conjuntos de arestas e ajuste os vértices incidentes; para complemento, fixe um conjunto de $n$ vértices e complete com as arestas de $K_n$ que faltam.

[Voltar ao sumário](#sumario)

<a id="q12"></a>
## Resposta da Questão 12

- **Questão 12:** **(Nicoletti, 2018)** Construa uma decomposição para cada um dos grafos (a), (b) e (d).

  - **Resposta:**
    - **Grafo (a)**  
      Uma decomposição possível é $\{H_1,H_2,H_3\}$, com:
      - $H_1=(V,\{e_1,e_2,e_3,e_4,e_{12}\})$
      - $H_2=(V,\{e_5,e_6,e_7\})$
      - $H_3=(V,\{e_8,e_9,e_{10},e_{11}\})$
      - Verificação: os conjuntos de arestas são dois a dois disjuntos e $E(H_1)\cup E(H_2)\cup E(H_3)=E(G)$.
      ```mermaid
      graph LR
        v1((v1)) ---|H1:e1| v2((v2))
        v1 ---|H1:e2| v3((v3))
        v1 ---|H1:e3| v2
        v2 ---|H1:e4| v3
        v1 ---|H1:e12| v1
        v2 ---|H2:e5| v8((v8))
        v3 ---|H2:e6| v4((v4))
        v8 ---|H2:e7| v4
        v8 ---|H3:e8| v5((v5))
        v4 ---|H3:e9| v6((v6))
        v6 ---|H3:e10| v7((v7))
        v8 ---|H3:e11| v6
      ```
    - **Grafo (b)**  
      Uma decomposição possível é $\{H_1,H_2,H_3,H_4\}$, com:
      - $H_1=(V,\{e_1,e_2,e_3\})$
      - $H_2=(V,\{e_4,e_5,e_7\})$
      - $H_3=(V,\{e_6,e_8,e_{12}\})$
      - $H_4=(V,\{e_9,e_{10},e_{11}\})$
      - Verificação: os conjuntos de arestas são dois a dois disjuntos e a união de todos os $E(H_i)$ é $E(G)$.
      ```mermaid
      graph LR
        v1((v1)) ---|H1:e1| v2((v2))
        v1 ---|H1:e2| v2
        v1 ---|H1:e3| v5((v5))
        v1 ---|H2:e4| v3((v3))
        v2 ---|H2:e5| v3
        v3 ---|H2:e7| v4((v4))
        v2 ---|H3:e6| v4
        v4 ---|H3:e8| v5
        v2 ---|H3:e12| v4
        v2 ---|H4:e9| v6((v6))
        v4 ---|H4:e10| v6
        v5 ---|H4:e11| v7((v7))
      ```
    - **Grafo (d)**  
      Uma decomposição possível é $\{H_1,H_2,H_3,H_4\}$, com:
      - $H_1=(V,\{e_1,e_2,e_3,e_4,e_{14}\})$
      - $H_2=(V,\{e_5,e_6,e_7\})$
      - $H_3=(V,\{e_8,e_9,e_{10},e_{11},e_{12}\})$
      - $H_4=(V,\{e_{13}\})$
      - Verificação: os conjuntos de arestas são dois a dois disjuntos e $\bigcup_i E(H_i)=E(G)$.
      ```mermaid
      graph LR
        v1((v1)) ---|H1:e1| v5((v5))
        v1 ---|H1:e2| v2((v2))
        v2 ---|H1:e3| v3((v3))
        v3 ---|H1:e4| v4((v4))
        v4 ---|H1:e14| v4
        v4 ---|H2:e5| v8((v8))
        v8 ---|H2:e6| v9((v9))
        v3 ---|H2:e7| v9
        v2 ---|H3:e8| v10((v10))
        v5 ---|H3:e9| v10
        v10 ---|H3:e10| v6((v6))
        v10 ---|H3:e11| v9
        v9 ---|H3:e12| v7((v7))
        v5 ---|H4:e13| v10
      ```

  - **Feedback:** Para decompor, particione $E(G)$ em blocos disjuntos e forme subgrafos com o mesmo conjunto de vértices (ou com os vértices incidentes). A união das arestas dos blocos deve reconstruir exatamente $G$.

[Voltar ao sumário](#sumario)

<a id="q13"></a>
## Resposta da Questão 13

- **Questão 13:** **(Nicoletti, 2018)** Para cada um dos grafos (a), (b), (c) e (d), construa um novo grafo, resultado da fusão de dois vértices do grafo original.

  - **Resposta:**
    - **Grafo (a):** fundir $v_2$ e $v_3$ em $v_{23}$.
      - Vértices resultantes: $\{v_1,v_{23},v_4,v_5,v_6,v_7,v_8\}$.
      - Efeito nas arestas: $e_4$ vira loop em $v_{23}$; $e_1,e_2,e_3$ passam a ligar $v_1$ a $v_{23}$; $e_5$ liga $v_{23}$ a $v_8$; $e_6$ liga $v_{23}$ a $v_4$; demais inalteradas.
      ```mermaid
      graph LR
        v1((v1)) ---|e12| v1
        v1 ---|e1| v23((v23))
        v1 ---|e2| v23
        v1 ---|e3| v23
        v23 ---|e4| v23
        v23 ---|e5| v8((v8))
        v23 ---|e6| v4((v4))
        v8 ---|e7| v4
        v8 ---|e8| v5((v5))
        v4 ---|e9| v6((v6))
        v6 ---|e10| v7((v7))
        v8 ---|e11| v6
      ```
    - **Grafo (b):** fundir $v_2$ e $v_4$ em $v_{24}$.
      - Vértices resultantes: $\{v_1,v_3,v_5,v_6,v_7,v_{24}\}$.
      - Efeito nas arestas: $e_6$ e $e_{12}$ viram loops em $v_{24}$; $e_5$ e $e_7$ passam a ligar $v_3$ a $v_{24}$; $e_9$ e $e_{10}$ passam a ligar $v_6$ a $v_{24}$; demais ajustadas por incidência.
      ```mermaid
      graph LR
        v1((v1)) ---|e1| v24((v24))
        v1 ---|e2| v24
        v1 ---|e3| v5((v5))
        v1 ---|e4| v3((v3))
        v3 ---|e5| v24
        v3 ---|e7| v24
        v24 ---|e6| v24
        v24 ---|e12| v24
        v24 ---|e8| v5
        v24 ---|e9| v6((v6))
        v24 ---|e10| v6
        v5 ---|e11| v7((v7))
      ```
    - **Grafo (c):** fundir $v_1$ e $v_2$ em $v_{12}$.
      - Vértices resultantes: $\{v_{12},v_3\}$.
      - Não há arestas no grafo original, então o grafo fundido também não tem arestas.
      ```mermaid
      graph LR
        v12((v12))
        v3((v3))
      ```
    - **Grafo (d):** fundir $v_5$ e $v_{10}$ em $v_{510}$.
      - Vértices resultantes: $\{v_1,v_2,v_3,v_4,v_6,v_7,v_8,v_9,v_{510}\}$.
      - Efeito nas arestas: $e_9$ e $e_{13}$ viram loops em $v_{510}$; $e_1$ passa a ligar $v_1$ a $v_{510}$; $e_8$ liga $v_2$ a $v_{510}$; $e_{10}$ liga $v_{510}$ a $v_6$; $e_{11}$ liga $v_{510}$ a $v_9$; demais inalteradas.
      ```mermaid
      graph LR
        v1((v1)) ---|e1| v510((v510))
        v1 ---|e2| v2((v2))
        v2 ---|e3| v3((v3))
        v3 ---|e4| v4((v4))
        v4 ---|e14| v4
        v4 ---|e5| v8((v8))
        v8 ---|e6| v9((v9))
        v3 ---|e7| v9
        v2 ---|e8| v510
        v510 ---|e9| v510
        v510 ---|e13| v510
        v510 ---|e10| v6((v6))
        v510 ---|e11| v9
        v9 ---|e12| v7((v7))
      ```

  - **Feedback:** Na fusão, os dois vértices escolhidos são identificados em um único vértice; arestas entre eles viram loops, e arestas incidentes passam a incidir no novo vértice.

[Voltar ao sumário](#sumario)

<a id="q14"></a>
## Resposta da Questão 14

- **Questão 14:** **(Nicoletti, 2018)** Discuta as propriedades comutativas da união, interseção e soma de subgrafos de um grafo $G$.

  - **Resposta:**
    - Considere (no grafo (a)) os subgrafos:
      - $H_1=(\{v_1,v_2,v_3\},\{e_1,e_2,e_4\})$
      - $H_2=(\{v_1,v_2,v_3,v_8\},\{e_3,e_4,e_5\})$
    - **(a) União é comutativa**
      - $H_1\cup H_2=H_2\cup H_1=(\{v_1,v_2,v_3,v_8\},\{e_1,e_2,e_3,e_4,e_5\})$.
      ```mermaid
      graph LR
        v1((v1)) ---|e1| v2((v2))
        v1 ---|e2| v3((v3))
        v1 ---|e3| v2
        v2 ---|e4| v3
        v2 ---|e5| v8((v8))
      ```
    - **(b) Interseção é comutativa**
      - $H_1\cap H_2=H_2\cap H_1=(\{v_2,v_3\},\{e_4\})$.
      ```mermaid
      graph LR
        v2((v2)) ---|e4| v3((v3))
      ```
    - **(c) Soma simétrica é comutativa**
      - $H_1\oplus H_2=H_2\oplus H_1=(\{v_1,v_2,v_3,v_8\},\{e_1,e_2,e_3,e_5\})$.
      ```mermaid
      graph LR
        v1((v1)) ---|e1| v2((v2))
        v1 ---|e2| v3((v3))
        v1 ---|e3| v2
        v2 ---|e5| v8((v8))
      ```
    - Conclusão: para quaisquer subgrafos $A$ e $B$ de $G$, valem $A\cup B=B\cup A$, $A\cap B=B\cap A$ e $A\oplus B=B\oplus A$.

  - **Feedback:** A comutatividade decorre diretamente da comutatividade das operações de conjuntos sobre arestas (e vértices incidentes): união, interseção e diferença simétrica.

[Voltar ao sumário](#sumario)

<a id="q15"></a>
## Resposta da Questão 15

- **Questão 15:** **(Nicoletti, 2018)** Verifique, usando as definições, que, se $G_1$ e $G_2$ são aresta-disjuntos, então $G_1 \cap G_2$ é o grafo nulo e $G_1 \oplus G_2 = G_1 \cup G_2$.

  - **Resposta:**
    - Exemplo (grafo (a)):
      - $G_1=(\{v_1,v_2,v_3\},\{e_1,e_2,e_4\})$
      - $G_2=(\{v_1,v_2,v_3,v_8\},\{e_3,e_5\})$
      - São aresta-disjuntos, pois $\{e_1,e_2,e_4\}\cap\{e_3,e_5\}=\emptyset$.
    - **(a) Interseção**
      - $G_1\cap G_2=(\emptyset,\emptyset)$ (grafo nulo), pois não há aresta comum.
      ```mermaid
      graph LR
      ```
    - **(b) União**
      - $G_1\cup G_2=(\{v_1,v_2,v_3,v_8\},\{e_1,e_2,e_3,e_4,e_5\})$.
      ```mermaid
      graph LR
        v1((v1)) ---|e1| v2((v2))
        v1 ---|e2| v3((v3))
        v2 ---|e4| v3
        v1 ---|e3| v2
        v2 ---|e5| v8((v8))
      ```
    - **(c) Soma simétrica**
      - $G_1\oplus G_2=(\{v_1,v_2,v_3,v_8\},\{e_1,e_2,e_3,e_4,e_5\})$.
      - Como não há arestas comuns, a soma simétrica coincide com a união:
        $G_1\oplus G_2=G_1\cup G_2$.
      ```mermaid
      graph LR
        v1((v1)) ---|e1| v2((v2))
        v1 ---|e2| v3((v3))
        v2 ---|e4| v3
        v1 ---|e3| v2
        v2 ---|e5| v8((v8))
      ```

  - **Feedback:** Se $E(G_1)\cap E(G_2)=\emptyset$, então a interseção é nula e a diferença simétrica não remove nenhuma aresta, ficando igual à união.

[Voltar ao sumário](#sumario)

<a id="q16"></a>
## Resposta da Questão 16

- **Questão 16:** **(Nicoletti, 2018)** Verifique, usando as definições, que, se $G_1$ e $G_2$ são vértice-disjuntos, então $G_1 \cap G_2 = \emptyset$.

  - **Resposta:**
    - Considere o exemplo (grafo (a)):
      - $G_1=(\{v_1,v_2,v_3\},\{e_1,e_2,e_4\})$
      - $G_2=(\{v_5,v_8\},\{e_8\})$
      - Como $V(G_1)\cap V(G_2)=\emptyset$, os subgrafos são vértice-disjuntos.
    - **(a) Visualização de $G_1$**
      ```mermaid
      graph LR
        v1((v1)) ---|e1| v2((v2))
        v1 ---|e2| v3((v3))
        v2 ---|e4| v3
      ```
    - **(b) Visualização de $G_2$**
      ```mermaid
      graph LR
        v5((v5)) ---|e8| v8((v8))
      ```
    - **(c) Interseção**
      - Não existe vértice comum e, portanto, também não existe aresta comum:
        $G_1\cap G_2=\emptyset$.
      ```mermaid
      graph LR
      ```

  - **Feedback:** A interseção de grafos exige simultaneamente vértices e arestas comuns; se os vértices já são disjuntos, a interseção necessariamente é vazia.

[Voltar ao sumário](#sumario)

<a id="q17"></a>
## Resposta da Questão 17

- **Questão 17:** **(Nicoletti, 2018)** Verifique que, para qualquer grafo $G$, $G \cup G = G \cap G = G$ e $G \oplus G$ é o grafo nulo.

  - **Resposta:**
    - Exemplo (subgrafo do grafo (a)):
      - $G=(\{v_1,v_2,v_3,v_8\},\{e_1,e_2,e_4,e_5\})$.
    - **(a) União**
      - $G\cup G = G$.
      ```mermaid
      graph LR
        v1((v1)) ---|e1| v2((v2))
        v1 ---|e2| v3((v3))
        v2 ---|e4| v3
        v2 ---|e5| v8((v8))
      ```
    - **(b) Interseção**
      - $G\cap G = G$.
      ```mermaid
      graph LR
        v1((v1)) ---|e1| v2((v2))
        v1 ---|e2| v3((v3))
        v2 ---|e4| v3
        v2 ---|e5| v8((v8))
      ```
    - **(c) Soma simétrica**
      - $G\oplus G=\emptyset$ (cada aresta aparece duas vezes e é cancelada).
      ```mermaid
      graph LR
      ```
    - Portanto, para qualquer grafo $G$, valem as identidades:
      $G\cup G=G$, $G\cap G=G$ e $G\oplus G=\emptyset$.

  - **Feedback:** União e interseção são idempotentes; a soma simétrica mantém apenas arestas que aparecem em exatamente um dos grafos, então em $G\oplus G$ nenhuma aresta permanece.

[Voltar ao sumário](#sumario)

<a id="q18"></a>
## Resposta da Questão 18

- **Questão 18:** **(Nicoletti, 2018)** Determine se os grafos $G_1$ e $G_2$ a seguir são isomorfos. Se $G_1$ e $G_2$ forem isomorfos, escreva as funções $f$ e $g$ que estabelecem o isomorfismo. Caso contrário, forneça um invariante que os grafos não compartilham. Para os exercícios 19 a 27, desenhe o grafo com a propriedade solicitada ou, então, explique por que tal grafo não existe.

  - **Resposta:**
    - **(a) Não isomorfos.**  
      Invariante: número de vértices. $G_1$ tem 5 vértices e $G_2$ tem 6.
      ```mermaid
      graph LR
        subgraph G1a["G1"]
          a((a)) --- b((b))
          a --- d((d))
          a --- e((e))
          a --- c((c))
          d --- e
          e --- b
          e --- c
          d --- c
        end
        subgraph G2a["G2"]
          A((A)) --- B((B))
          A --- C((C))
          C --- D((D))
          B --- D
          E((E)) --- A
          E --- C
          B --- F((F))
          D --- F
        end
      ```
    - **(b) Isomorfos.**  
      Ambos são ciclos com 7 vértices ($C_7$).  
      Uma bijeção possível: $f(a)=A,\ f(b)=C,\ f(c)=D,\ f(d)=F,\ f(e)=B,\ f(f)=G,\ f(g)=E$.
      ```mermaid
      graph LR
        subgraph G1b["G1"]
          a((a)) --- b((b))
          b --- c((c))
          c --- d((d))
          d --- e((e))
          e --- f((f))
          f --- g((g))
          g --- a
        end
        subgraph G2b["G2"]
          A((A)) --- C((C))
          C --- D((D))
          D --- F((F))
          F --- B((B))
          B --- G((G))
          G --- E((E))
          E --- A
        end
      ```
    - **(c) Não isomorfos.**  
      Invariante: número de triângulos. Em $G_2$ aparecem triângulos $ABC$ e $DEF$; em $G_1$ não há triângulo.
      ```mermaid
      graph LR
        subgraph G1c["G1"]
          a((a)) --- b((b))
          b --- f((f))
          f --- e((e))
          e --- a
          b --- c((c))
          c --- d((d))
          c --- e
          d --- a
          d --- f
        end
        subgraph G2c["G2"]
          A((A)) --- B((B))
          B --- F((F))
          F --- E((E))
          E --- A
          A --- C((C))
          B --- C
          C --- D((D))
          D --- E
          D --- F
        end
      ```
    - **(d) Isomorfos.**  
      Mesma sequência de graus $(4,3,3,2,2)$ e mesma estrutura de adjacências.  
      Uma bijeção possível: $f(b)=D,\ f(a)=B,\ f(e)=C,\ f(d)=A,\ f(c)=E$.
      ```mermaid
      graph LR
        subgraph G1d["G1"]
          a((a)) --- b((b))
          a --- d((d))
          b --- d
          b --- c((c))
          c --- d
          e((e)) --- b
          e --- c
        end
        subgraph G2d["G2"]
          A((A)) --- B((B))
          A --- D((D))
          A --- E((E))
          D --- B
          D --- E
          D --- C((C))
          E --- C
        end
      ```
    - **(e) Não isomorfos.**  
      Invariante: sequência de graus diferente (em $G_1$: $4,4,3,3,2$; em $G_2$: $4,3,3,3,3$).
      ```mermaid
      graph LR
        subgraph G1e["G1"]
          e((e)) --- a((a))
          a --- b((b))
          b --- c((c))
          c --- d((d))
          d --- e
          e --- b
          a --- d
          d --- b
        end
        subgraph G2e["G2"]
          A((A)) --- B((B))
          B --- E((E))
          E --- C((C))
          C --- D((D))
          D --- A
          D --- B
          A --- E
          B --- C
        end
      ```
    - **(f) Isomorfos (inferência visual).**  
      Ambos têm 8 vértices e mesma distribuição visual de graus; uma renomeação/reposicionamento preserva adjacências.
      ```mermaid
      graph LR
        subgraph G1f["G1 (esquemático)"]
          a((a)) --- b((b))
          b --- c((c))
          c --- d((d))
          d --- e((e))
          e --- f((f))
          f --- g((g))
          g --- h((h))
          h --- a
          a --- c
          b --- d
          b --- e
          a --- f
          h --- c
        end
        subgraph G2f["G2"]
          A((A)) --- B((B))
          A --- E((E))
          A --- F((F))
          E --- B
          E --- F
          B --- F
          B --- G((G))
          F --- G
          G --- C((C))
          C --- D((D))
          C --- H((H))
          D --- G
          D --- H
        end
      ```
    - **(g) Isomorfos (inferência visual).**  
      Ambos representam um quadrado com diagonais subdivididas e dois vértices adicionais na faixa inferior.
      ```mermaid
      graph LR
        subgraph G1g["G1"]
          a((a)) --- b((b))
          b --- c((c))
          c --- d((d))
          d --- a
          a --- e((e))
          e --- c
          b --- e
          d --- e
          d --- g((g))
          g --- f((f))
          f --- c
        end
        subgraph G2g["G2"]
          A((A)) --- B((B))
          B --- C((C))
          C --- D((D))
          D --- A
          A --- F((F))
          F --- E((E))
          E --- B
          E --- D
          D --- G((G))
          G --- F
          G --- B
        end
      ```
    - **(h) Isomorfos (inferência visual).**  
      Mesma estrutura “triângulo externo + triângulo interno + conexões cruzadas”.
      ```mermaid
      graph LR
        subgraph G1h["G1"]
          a((a)) --- b((b))
          b --- c((c))
          c --- a
          d((d)) --- e((e))
          e --- f((f))
          f --- d
          a --- d
          b --- e
          c --- f
          f --- e
        end
        subgraph G2h["G2"]
          A((A)) --- B((B))
          B --- C((C))
          C --- A
          D((D)) --- E((E))
          E --- F((F))
          F --- D
          A --- D
          B --- E
          C --- F
          F --- E
        end
      ```
    - **(i) Isomorfos (inferência visual).**  
      Ambos têm 7 vértices e a mesma assinatura de graus ($4$ vértices de grau 3 e $3$ de grau 2), com mesma adjacência relativa.
      ```mermaid
      graph LR
        subgraph G1i["G1"]
          v1((1)) --- v2((2))
          v2 --- v7((7))
          v7 --- v4((4))
          v4 --- v3((3))
          v3 --- v5((5))
          v5 --- v1
          v1 --- v6((6))
          v6 --- v4
          v6 --- v7
        end
        subgraph G2i["G2"]
          a((a)) --- b((b))
          b --- c((c))
          c --- f((f))
          f --- e((e))
          e --- d((d))
          d --- a
          a --- e
          d --- g((g))
          g --- f
        end
      ```

  - **Feedback:** Para decidir isomorfismo, compare invariantes rápidos (número de vértices, arestas, sequência de graus, triângulos/ciclos curtos). Só depois proponha uma bijeção de vértices.

[Voltar ao sumário](#sumario)

<a id="q19"></a>
## Resposta da Questão 19

- **Questão 19:** **(Nicoletti, 2018)** Seis vértices, cada um com grau $3$.

  - **Resposta:** Existe. Um exemplo é o grafo bipartido completo $K_{3,3}$.
    - Partição: $U=\{u_1,u_2,u_3\}$ e $W=\{v_1,v_2,v_3\}$.
    - Arestas: todas as possíveis entre $U$ e $W$ (total 9 arestas).
    - Graus: cada vértice de $U$ liga-se aos 3 vértices de $W$, e vice-versa; portanto todos têm grau 3.
    ```mermaid
    graph LR
      u1((u1)) --- v1((v1))
      u1 --- v2((v2))
      u1 --- v3((v3))
      u2((u2)) --- v1
      u2 --- v2
      u2 --- v3
      u3((u3)) --- v1
      u3 --- v2
      u3 --- v3
    ```

  - **Feedback:** Para checar rapidamente se sua resposta está correta, faça dois passos:  
    1. Conte os vizinhos de cada vértice (todos devem ter 3).  
    2. Verifique se há exatamente 6 vértices no desenho.  
    Se essas duas condições forem satisfeitas, a construção atende ao enunciado.

[Voltar ao sumário](#sumario)

<a id="q20"></a>
## Resposta da Questão 20

- **Questão 20:** **(Nicoletti, 2018)** Cinco vértices, cada um com grau $3$.

  - **Resposta:** Não existe.
    - Se houvesse tal grafo, a soma dos graus seria:
      $$
      3+3+3+3+3 = 15.
      $$
    - Pelo lema do aperto de mãos, em qualquer grafo vale
      $$
      \sum_{v\in V} d(v)=2|E|,
      $$
      logo a soma dos graus deve ser par.
    - Como 15 é ímpar, chegamos a contradição. Portanto, esse grafo não pode existir.
    - Exemplo ilustrativo próximo (que **existe**): com 6 vértices, cada um de grau 3, por exemplo $K_{3,3}$.
      Isso ajuda a ver que o bloqueio da questão está no número ímpar de vértices com grau ímpar.

    ```mermaid
    graph LR
      u1((u1)) --- v1((v1))
      u1 --- v2((v2))
      u1 --- v3((v3))
      u2((u2)) --- v1
      u2 --- v2
      u2 --- v3
      u3((u3)) --- v1
      u3 --- v2
      u3 --- v3
    ```

  - **Feedback:** Dica de prova para questões desse tipo:  
    1. Some os graus pedidos no enunciado.  
    2. Compare com o lema do aperto de mãos (a soma precisa ser par).  
    Se a soma sair ímpar, você já conclui imediatamente que o grafo não existe.

[Voltar ao sumário](#sumario)

<a id="q21"></a>
## Resposta da Questão 21

- **Questão 21:** **(Nicoletti, 2018)** Quatro vértices, cada um com grau $1$.

  - **Resposta:** Existe.
    - Um exemplo é o grafo com vértices $\{v_1,v_2,v_3,v_4\}$ e arestas
      $$E=\{\{v_1,v_2\},\{v_3,v_4\}\}.$$
    - Nesse caso:
      - $d(v_1)=d(v_2)=d(v_3)=d(v_4)=1$.
      - Portanto, satisfaz exatamente o que o enunciado pede.
    ```mermaid
    graph LR
      v1((v1)) --- v2((v2))
      v3((v3)) --- v4((v4))
    ```

  - **Feedback:** Para validar rápido esse tipo de questão:
    1. desenhe o grafo;
    2. conte o grau de cada vértice no desenho;
    3. confira se todos batem com o enunciado.  
    Aqui, cada vértice participa de uma única aresta, então todos têm grau 1.

[Voltar ao sumário](#sumario)

<a id="q22"></a>
## Resposta da Questão 22

- **Questão 22:** **(Nicoletti, 2018)** Seis vértices e quatro arestas.

  - **Resposta:** Existe.
    - Exemplo: tome $V=\{v_1,v_2,v_3,v_4,v_5,v_6\}$ e
      $$E=\{\{v_1,v_2\},\{v_2,v_3\},\{v_3,v_4\},\{v_4,v_5\}\}.$$
    - Esse grafo tem:
      - 6 vértices (como pedido),
      - 4 arestas (como pedido),
      - $v_6$ isolado (o enunciado não proíbe vértice isolado).
    ```mermaid
    graph LR
      v1((v1)) --- v2((v2))
      v2 --- v3((v3))
      v3 --- v4((v4))
      v4 --- v5((v5))
      v6((v6))
    ```

  - **Feedback:** Em construção de grafos, sempre confira no final:
    1. quantidade de vértices;
    2. quantidade de arestas;
    3. se há alguma restrição extra no enunciado (conectado, simples, sem isolados etc.).  
    Aqui, só eram exigidos 6 vértices e 4 arestas, então o exemplo atende.

[Voltar ao sumário](#sumario)

<a id="q23"></a>
## Resposta da Questão 23

- **Questão 23:** **(Nicoletti, 2018)** Quatro arestas, quatro vértices tendo graus $1,2,3,4$.

  - **Resposta:** Não existe.
    - Se os graus fossem $1,2,3,4$, então a soma dos graus seria:
      $$1+2+3+4=10.$$
    - Pelo lema do aperto de mãos:
      $$\sum_{v\in V} d(v)=2|E|.$$
      Logo, teríamos $2|E|=10 \Rightarrow |E|=5$.
    - Mas o enunciado exige 4 arestas. Contradição. Portanto, não existe tal grafo.
    - Exemplo ilustrativo com **5 arestas** que realiza os graus $1,2,3,4$:
      - arestas: $\{v_4v_1,\ v_4v_2,\ v_4v_3,\ v_4v_3,\ v_2v_3\}$.
      - graus: $d(v_1)=1,\ d(v_2)=2,\ d(v_3)=3,\ d(v_4)=4$.
    ```mermaid
    graph LR
      v1((v1)) --- v4((v4))
      v2((v2)) --- v4
      v3((v3)) --- v4
      v3 --- v4
      v2 --- v3
    ```

  - **Feedback:** Quando o enunciado dá sequência de graus e número de arestas, o caminho mais rápido é:
    1. somar os graus;
    2. usar $\sum d(v)=2|E|$ para obter o número de arestas que a sequência exige;
    3. comparar com o número de arestas pedido.  
    Se não bater, a resposta é “não existe”.

[Voltar ao sumário](#sumario)

<a id="q24"></a>
## Resposta da Questão 24

- **Questão 24:** **(Nicoletti, 2018)** Quatro vértices com graus $1,2,3,4$.

  - **Resposta:** Não existe (em grafo simples).
    - Em um grafo simples com $n$ vértices, o grau máximo possível é $n-1$.
    - Para $n=4$, o grau máximo é $3$.
    - O enunciado exige um vértice de grau $4$, o que é impossível.
    - Observação: o contraexemplo mais “próximo” é o grafo completo $K_4$, onde todos os vértices têm grau 3 (máximo possível com 4 vértices).
    ```mermaid
    graph LR
      v1((v1)) --- v2((v2))
      v1 --- v3((v3))
      v1 --- v4((v4))
      v2 --- v3
      v2 --- v4
      v3 --- v4
    ```

  - **Feedback:** Dica prática: antes de tentar desenhar, cheque limites básicos.
    - Com $n$ vértices, nenhum grau pode passar de $n-1$.
    - Se o enunciado já viola esse limite, você conclui “não existe” imediatamente.

[Voltar ao sumário](#sumario)

<a id="q25"></a>
## Resposta da Questão 25

- **Questão 25:** **(Nicoletti, 2018)** Grafo simples; seis vértices tendo graus $1,2,3,4,5,5$.

  - **Resposta:** Não existe.
    - Em um grafo simples com 6 vértices, um vértice de grau 5 está ligado a todos os outros 5 vértices.
    - Como o enunciado pede **dois** vértices de grau 5, esses dois vértices ficam ligados entre si e também a todos os outros 4 vértices.
    - Portanto, cada um dos outros 4 vértices já tem grau pelo menos 2 (uma ligação para cada vértice de grau 5).
    - Isso contradiz a presença de um vértice de grau 1 na sequência $1,2,3,4,5,5$.
    - Logo, tal grafo simples não existe.
    ```mermaid
    graph LR
      v1((v1)) --- v2((v2))
      v1 --- v3((v3))
      v1 --- v4((v4))
      v1 --- v5((v5))
      v1 --- v6((v6))
      v2 --- v3
      v2 --- v4
      v2 --- v5
      v2 --- v6
    ```
    - Contraexemplo estrutural: nesse desenho, $d(v_1)=d(v_2)=5$ e $d(v_3)=d(v_4)=d(v_5)=d(v_6)=2$.  
      Ou seja, quando existem dois vértices de grau 5 em 6 vértices, nenhum dos outros pode ter grau 1.

  - **Feedback:** Dica útil: quando aparece grau máximo repetido (aqui, dois vértices com grau 5), primeiro analise as consequências obrigatórias dessas conexões. Isso costuma revelar contradições rapidamente, sem precisar montar o grafo inteiro.

[Voltar ao sumário](#sumario)

<a id="q26"></a>
## Resposta da Questão 26

- **Questão 26:** **(Nicoletti, 2018)** Grafo simples; cinco vértices tendo graus $2,3,3,4,4$.

  - **Resposta:** Existe.  
    Exemplo: $V=\{v_1,v_2,v_3,v_4,v_5\}$ e  
    $E=\{\{v_1,v_2\},\{v_1,v_3\},\{v_1,v_4\},\{v_1,v_5\},\{v_2,v_3\},\{v_2,v_5\},\{v_3,v_5\},\{v_4,v_5\}\}$.
    ```mermaid
    graph LR
      v1((v1)) --- v2((v2))
      v1 --- v3((v3))
      v1 --- v4((v4))
      v1 --- v5((v5))
      v2 --- v3
      v2 --- v5
      v3 --- v5
      v4 --- v5
    ```

  - **Feedback:** Esse grafo existe porque é possível distribuir as 8 arestas entre os 5 vértices de modo que dois vértices fiquem com 4 incidências, dois com 3 e um com 2, sem repetir aresta nem criar loop. Ou seja, a sequência $2,3,3,4,4$ é realizável em um grafo simples.

[Voltar ao sumário](#sumario)

<a id="q27"></a>
## Resposta da Questão 27

- **Questão 27:** **(Nicoletti, 2018)** Grafo simples; cinco vértices tendo graus $2,2,4,4,4$.

  - **Resposta:** Não existe.
    - Em um grafo simples com 5 vértices, um vértice de grau 4 está ligado a todos os outros 4 vértices.
    - Como há **três** vértices de grau 4, cada vértice restante (os dois que deveriam ter grau 2) precisa estar ligado a esses três vértices de grau 4.
    - Logo, cada um desses dois vértices teria grau pelo menos 3, e não 2.
    - Contradição: portanto a sequência $2,2,4,4,4$ não é realizável em grafo simples.
    ```mermaid
    graph LR
      a((4)) --- b((4))
      a --- c((4))
      b --- c
      a --- d((?))
      b --- d
      c --- d
      a --- e((?))
      b --- e
      c --- e
    ```

  - **Feedback:** Esse grafo não existe porque os vértices de grau máximo “forçam” conexões obrigatórias com todos os outros, aumentando os graus mínimos dos vértices restantes além do permitido no enunciado.

[Voltar ao sumário](#sumario)

<a id="q28"></a>
## Resposta da Questão 28

- **Questão 28:** **(Nicoletti, 2018)** Dê um exemplo de um grafo conectado tal que a remoção de qualquer aresta resulta em um grafo que não é conectado (assuma que a remoção de uma aresta não remove qualquer vértice).

  - **Resposta:** Um exemplo é o caminho $P_4$:
    - $V=\{v_1,v_2,v_3,v_4\}$
    - $E=\{\{v_1,v_2\},\{v_2,v_3\},\{v_3,v_4\}\}$
    - O grafo é conectado.
    - Se remover qualquer aresta, o caminho é quebrado em duas componentes, então deixa de ser conectado.
    ```mermaid
    graph LR
      v1((v1)) --- v2((v2))
      v2 --- v3((v3))
      v3 --- v4((v4))
    ```

  - **Feedback:** Esse tipo de enunciado caracteriza exatamente uma árvore: grafo conectado em que toda aresta é ponte. Por isso, qualquer árvore não trivial serve como resposta.

[Voltar ao sumário](#sumario)

<a id="q29"></a>
## Resposta da Questão 29

- **Questão 29:** **(Nicoletti, 2018)** Desenhe cada um dos grafos com as matrizes de adjacência fornecidas no enunciado.

  - **Resposta:**
    - Adotando vértices $v_1,\dots,v_n$ na ordem das linhas/colunas:
    - **(a)** 
      - Matriz $5\times 5$ com loops em $v_1$ e $v_5$.  
      - Arestas: $\{v_1v_1,\ v_1v_2,\ v_1v_4,\ v_2v_3,\ v_3v_4,\ v_5v_5\}$.
      - Lista de adjacência:  
        $v_1:\{v_1,v_2,v_4\}$; $v_2:\{v_1,v_3\}$; $v_3:\{v_2,v_4\}$; $v_4:\{v_1,v_3\}$; $v_5:\{v_5\}$.
      ```mermaid
      graph LR
        v1((v1)) --- v1
        v1 --- v2((v2))
        v1 --- v4((v4))
        v2 --- v3((v3))
        v3 --- v4
        v5((v5)) --- v5
      ```
    - **(b)** 
      - Matriz $5\times 5$ com subgrafo em $\{v_1,v_2,v_3\}$ e aresta $v_4v_5$.  
      - Arestas: $\{v_1v_1,\ v_2v_2,\ v_3v_3,\ v_1v_2,\ v_1v_3,\ v_2v_3,\ v_4v_5\}$.
      - Lista de adjacência:  
        $v_1:\{v_1,v_2,v_3\}$; $v_2:\{v_1,v_2,v_3\}$; $v_3:\{v_1,v_2,v_3\}$; $v_4:\{v_5\}$; $v_5:\{v_4\}$.
      ```mermaid
      graph LR
        v1((v1)) --- v1
        v2((v2)) --- v2
        v3((v3)) --- v3
        v1 --- v2
        v1 --- v3
        v2 --- v3
        v4((v4)) --- v5((v5))
      ```
    - **(c)** 
      - Matriz $4\times 4$ com multiplicidades (2 arestas paralelas) e loops em $v_3,v_4$.  
      - Arestas: $\{v_1v_2,\ 2\cdot v_2v_3,\ 2\cdot v_2v_4,\ 2\cdot v_3v_4,\ v_3v_3,\ v_4v_4\}$.
      - Lista de adjacência (com repetição para multiplicidade):  
        $v_1:\{v_2\}$; $v_2:\{v_1,v_3,v_3,v_4,v_4\}$; $v_3:\{v_2,v_2,v_4,v_4,v_3\}$; $v_4:\{v_2,v_2,v_3,v_3,v_4\}$.
      ```mermaid
      graph LR
        v1((v1)) --- v2((v2))
        v2 --- v3((v3))
        v2 --- v4((v4))
        v3 --- v4
        v3 --- v3
        v4 --- v4
      ```
      Observação: no desenho acima, as arestas com multiplicidade 2 aparecem uma vez; a multiplicidade correta está na lista.
    - **(d)** 
      - Matriz $4\times 4$ sem loops e com multiplicidades entre todos os pares.  
      - Arestas: $\{1\cdot v_1v_2,\ 2\cdot v_1v_3,\ 3\cdot v_1v_4,\ 3\cdot v_2v_3,\ 2\cdot v_2v_4,\ 1\cdot v_3v_4\}$.
      - Lista de adjacência (com repetição para multiplicidade):  
        $v_1:\{v_2,v_3,v_3,v_4,v_4,v_4\}$;  
        $v_2:\{v_1,v_3,v_3,v_3,v_4,v_4\}$;  
        $v_3:\{v_1,v_1,v_2,v_2,v_2,v_4\}$;  
        $v_4:\{v_1,v_1,v_1,v_2,v_2,v_3\}$.
      ```mermaid
      graph LR
        v1((v1)) --- v2((v2))
        v1 --- v3((v3))
        v1 --- v4((v4))
        v2 --- v3
        v2 --- v4
        v3 --- v4
      ```
      Observação: no desenho acima, cada par aparece uma vez; as multiplicidades corretas são as da lista.

  - **Feedback:** Em matrizes de adjacência, leia assim: diagonal indica loop; fora da diagonal indica quantas arestas ligam o par de vértices. Em grafos com paralelas, sempre registre a multiplicidade junto com o desenho.

[Voltar ao sumário](#sumario)

<a id="q30"></a>
## Resposta da Questão 30

- **Questão 30:** **(Nicoletti, 2018)** Seja $G$ um grafo simples e seja $A$ sua matriz de adjacência. Prove que as entradas na diagonal principal de $A^2$ fornecem os graus dos vértices de $G$. Esse fato continua válido se a condição de o grafo ser simples for removida?

  - **Resposta:**
    - Para qualquer $i$,
      $$ (A^2)_{ii}=\sum_{k=1}^n a_{ik}a_{ki}. $$
    - Como $G$ é simples e não direcionado, $a_{ik}=a_{ki}\in\{0,1\}$, então
      $$ (A^2)_{ii}=\sum_{k=1}^n a_{ik}^2=\sum_{k=1}^n a_{ik}. $$
    - A soma $\sum_k a_{ik}$ é exatamente o número de vizinhos de $v_i$, isto é, $d(v_i)$.
    - Logo, para grafo simples:
      $$ (A^2)_{ii}=d(v_i). $$

    - Se remover a hipótese de simplicidade, esse fato **não** vale em geral.
      - Com loop em $v_i$, o termo $a_{ii}^2$ entra em $(A^2)_{ii}$, mas o loop contribui de forma diferente para o grau (em grafos não orientados, loop conta 2 no grau).
      - Com arestas paralelas, os valores de $a_{ik}$ deixam de ser binários e o quadrado $a_{ik}^2$ distorce a contagem linear do grau.
    - Portanto, a igualdade da diagonal de $A^2$ com os graus é característica do caso simples.

  - **Feedback:** A ideia-chave é identificar o que cada termo da matriz conta: em $A^2$, a diagonal conta “idas e voltas” de comprimento 2 passando por um vértice intermediário. No grafo simples, essa contagem coincide exatamente com o grau; fora do simples, aparecem termos extras (loops) e pesos quadráticos (paralelas).

[Voltar ao sumário](#sumario)

<a id="q31"></a>
## Resposta da Questão 31

- **Questão 31:** **(Nicoletti, 2018)** Escreva a matriz de adjacência e a matriz de incidência para os grafos mostrados em (a) e (b), usando as ordenações de vértices e arestas dadas.

  - **Resposta:**
    - Adotando a ordem de vértices $(v_1,v_2,v_3,v_4)$ em (a) e $(v_1,v_2,v_3,v_4,v_5,v_6)$ em (b), e colunas da incidência na ordem $(e_1,e_2,...)$.

    - **(a) Matriz de adjacência**
      $$
      A_a=
      \begin{bmatrix}
      2 & 1 & 1 & 1 \\
      1 & 0 & 1 & 1 \\
      1 & 1 & 0 & 1 \\
      1 & 1 & 1 & 0
      \end{bmatrix}
      $$
      (há dois loops em $v_1$: $e_1,e_2$).

    - **(a) Matriz de incidência**
      $$
      M_a=
      \begin{array}{c|cccccccc}
      & e_1&e_2&e_3&e_4&e_5&e_6&e_7&e_8 \\\hline
      v_1&2&2&1&1&1&0&0&0 \\
      v_2&0&0&1&0&0&1&0&1 \\
      v_3&0&0&0&1&0&1&1&0 \\
      v_4&0&0&0&0&1&0&1&1
      \end{array}
      $$

    - **(b) Matriz de adjacência**
      $$
      A_b=
      \begin{bmatrix}
      0&1&0&0&1&1\\
      1&0&1&1&0&0\\
      0&1&0&1&1&0\\
      0&1&1&0&0&1\\
      1&0&1&0&0&1\\
      1&0&0&1&1&0
      \end{bmatrix}
      $$

    - **(b) Matriz de incidência**
      $$
      M_b=
      \begin{array}{c|ccccccccc}
      & e_1&e_2&e_3&e_4&e_5&e_6&e_7&e_8&e_9 \\\hline
      v_1&1&1&1&0&0&0&0&0&0 \\
      v_2&0&1&0&1&1&0&0&0&0 \\
      v_3&0&0&0&1&0&1&1&0&0 \\
      v_4&0&0&0&0&1&1&0&1&0 \\
      v_5&1&0&0&0&0&0&1&0&1 \\
      v_6&0&0&1&0&0&0&0&1&1
      \end{array}
      $$

  - **Feedback:** Para montar $A$, use vizinhança (com loops na diagonal). Para montar $M$, cada coluna representa uma aresta e marca seus vértices incidentes (loop conta 2 na linha do vértice).

[Voltar ao sumário](#sumario)

<a id="q32"></a>
## Resposta da Questão 32

- **Questão 32:** **(Nicoletti, 2018)** Use o processo de fusão para determinar se os grafos do Exercício 29, especificados por suas matrizes de adjacência, são conectados ou não. A cada passo, especifique o grafo correspondente e sua matriz de adjacência.

  - **Resposta:**
    - Com base nos grafos obtidos no Exercício 29:

    - **(a)** **Não conectado.**
      - Há uma componente em $\{v_1,v_2,v_3,v_4\}$ e outra em $\{v_5\}$ (com loop).
      - No processo de fusão, fundimos os vértices da primeira componente até um único vértice; $v_5$ permanece separado.

    - **(b)** **Não conectado.**
      - Há duas componentes: $\{v_1,v_2,v_3\}$ e $\{v_4,v_5\}$.
      - Após fusões internas em cada bloco, restam dois vértices sem aresta entre si.

    - **(c)** **Conectado.**
      - Existe caminho entre quaisquer dois vértices.
      - Exemplo de fusão: $v_1\sim v_2 \Rightarrow v_{12}$, depois $v_{12}\sim v_3 \Rightarrow v_{123}$, depois $v_{123}\sim v_4 \Rightarrow v_{1234}$.
      - Todos os vértices caem em uma única classe.

    - **(d)** **Conectado.**
      - Todas as entradas fora da diagonal são positivas (com multiplicidades), então cada par de vértices é adjacente.
      - As fusões levam diretamente a uma única classe de equivalência.

  - **Feedback didático:** O processo de fusão para conectividade equivale a identificar componentes conexas. Loops não unem componentes diferentes; apenas arestas entre vértices distintos fazem isso.

[Voltar ao sumário](#sumario)

<a id="q33"></a>
## Resposta da Questão 33

- **Questão 33:** **(Nicoletti, 2018)** Construa a matriz de adjacência e de incidência do grafo mostrado no enunciado.

  - **Resposta:**
    - Usando os vértices na ordem $(1,2,3,4,5)$ e arestas
      $e_1=(1,5), e_2=(1,2), e_3=(5,2), e_4=(5,4), e_5=(2,3), e_6=(4,3), e_7=(5,3)$.

    - **Matriz de adjacência**
      $$
      A=
      \begin{bmatrix}
      0&1&0&0&1\\
      1&0&1&0&1\\
      0&1&0&1&1\\
      0&0&1&0&1\\
      1&1&1&1&0
      \end{bmatrix}
      $$

    - **Matriz de incidência**
      $$
      M=
      \begin{array}{c|ccccccc}
      & e_1&e_2&e_3&e_4&e_5&e_6&e_7 \\\hline
      1&1&1&0&0&0&0&0\\
      2&0&1&1&0&1&0&0\\
      3&0&0&0&0&1&1&1\\
      4&0&0&0&1&0&1&0\\
      5&1&0&1&1&0&0&1
      \end{array}
      $$

  - **Feedback:** Escolher e declarar a ordem de vértices/arestas antes de preencher as matrizes evita erro de posição.

[Voltar ao sumário](#sumario)

<a id="q34"></a>
## Resposta da Questão 34

- **Questão 34:** **(Nicoletti, 2018)** Desenhe o grafo cuja matriz de incidência é a fornecida no enunciado.

  - **Resposta:**
    - Lendo as colunas da matriz (uma aresta por coluna), obtemos:
      - $e_1=(v_4,v_5)$
      - $e_2=(v_2,v_5)$
      - $e_3=(v_1,v_4)$
      - $e_4=(v_1,v_2)$
      - $e_5=(v_1,v_4)$
      - $e_6=(v_1,v_5)$
      - $e_7=(v_1,v_4)$
      - $e_8=(v_2,v_3)$
    - Portanto, há 5 vértices e arestas paralelas entre $v_1$ e $v_4$.

    ```mermaid
    graph LR
      v1((v1)) ---|e3| v4((v4))
      v1 ---|e5| v4
      v1 ---|e7| v4
      v1 ---|e4| v2((v2))
      v1 ---|e6| v5((v5))
      v2 ---|e2| v5
      v4 ---|e1| v5
      v2 ---|e8| v3((v3))
    ```

  - **Feedback:** Em matriz de incidência, cada coluna deve ter exatamente os vértices incidentes da aresta correspondente; colunas iguais indicam arestas paralelas entre o mesmo par.

[Voltar ao sumário](#sumario)

<a id="q35"></a>
## Resposta da Questão 35

- **Questão 35:** **(Nicoletti, 2018)** Se $G$ é um grafo sem loops, o que você pode dizer sobre a soma das entradas em:

  - **Resposta:**
    - (a) Em qualquer linha (ou coluna) da matriz de adjacência: a soma é o grau do vértice correspondente.
    - (b) Em qualquer linha da matriz de incidência: a soma é o grau do vértice correspondente.
    - (c) Em qualquer coluna da matriz de incidência: a soma é 2 (cada aresta tem duas extremidades).

  - **Feedback:** Pense em “o que cada 1 representa”: na adjacência, um vizinho; na incidência, participação do vértice em uma aresta.

[Voltar ao sumário](#sumario)

<a id="q36"></a>
## Resposta da Questão 36

- **Questão 36:** **(Nicoletti, 2018)** Considere o grafo $G$ mostrado no enunciado:

  - **Resposta:**
    - **(a)** Não. Em teoria dos grafos, **vértices não são incidentes entre si**; incidência é relação entre vértice e aresta. Aqui, $v_1$ e $v_2$ são **adjacentes** e ambos são incidentes à aresta $v_1v_2$.
    - **(b)** Apenas $v_{11}$ é adjacente a si próprio, pois possui loop.
    - **(c)** Não. $v_3$ e $v_6$ não têm aresta direta entre eles (há caminho, mas não adjacência).
    - **(d)** Não é simples, pois há loop (em $v_{11}$) e arestas paralelas (entre $v_6$ e $v_7$).
    - **(e)** Graus dos vértices:
      - $d(v_1)=1$, $d(v_2)=1$
      - $d(v_3)=2$, $d(v_4)=2$, $d(v_5)=2$
      - $d(v_6)=5$ (arestas com $v_4$, $v_5$ e 3 arestas para $v_7$)
      - $d(v_7)=3$
      - $d(v_8)=2$, $d(v_9)=2$, $d(v_{10})=2$
      - $d(v_{11})=2$ (loop conta 2 no grau)

  - **Feedback didático:** O ponto-chave é separar os conceitos: adjacência (vértice-vértice), incidência (vértice-aresta) e simplicidade (sem loops e sem paralelas). Essa separação evita confusão em quase todos os exercícios de leitura de grafo.

[Voltar ao sumário](#sumario)

<a id="q37"></a>
## Resposta da Questão 37

- **Questão 37:** **(Nicoletti, 2018)** Pode um grafo ter vértices com graus $2,2,3,4,5,5,6,8$ e nenhum outro vértice? Justifique sua resposta.

  - **Resposta:**
    - Não pode existir.
    - Pela Lema do Aperto de Mão, a soma dos graus deve ser par:
      $2+2+3+4+5+5+6+8=35$.
    - Como 35 é ímpar, essa sequência não pode ser sequência de graus de nenhum grafo.

  - **Feedback didático:** Sempre comece verificando a paridade da soma dos graus. É o teste mais rápido de impossibilidade e vale mesmo com loops/paralelas (a soma continua sendo $2|E|$).

[Voltar ao sumário](#sumario)

<a id="q38"></a>
## Resposta da Questão 38

- **Questão 38:** **(Nicoletti, 2018)** Se um grafo tem vértices de graus $1,2,3,3,4,5$, quantas arestas ele tem? Justifique sua resposta.

  - **Resposta:**
    - Soma dos graus: $1+2+3+3+4+5=18$.
    - Pelo Lema do Aperto de Mão, $2|E|=18$.
    - Logo, $|E|=9$.

  - **Feedback didático:** Quando o enunciado fornece apenas graus, a estratégia padrão é aplicar $\sum d(v)=2|E|$.

[Voltar ao sumário](#sumario)

<a id="q39"></a>
## Resposta da Questão 39

- **Questão 39:** **(Nicoletti, 2018)** Quantas arestas tem o grafo $K_{10}$?

  - **Resposta:**
    - Em $K_n$, todo par de vértices forma uma aresta.
    - Portanto, $|E(K_{10})|=\binom{10}{2}=45$.

  - **Feedback didático:** Para grafos completos, memorize a fórmula $|E(K_n)|=\frac{n(n-1)}{2}$.

[Voltar ao sumário](#sumario)

<a id="q40"></a>
## Resposta da Questão 40

- **Questão 40:** **(Nicoletti, 2018)** Dê um exemplo de um grafo simples:

  - **Resposta:**
    - **(a)** Sem vértices de grau ímpar: exemplo $C_4$ (todos os vértices têm grau 2).
    - **(b)** Sem vértices de grau par: exemplo $K_2$ (os dois vértices têm grau 1).

    ```mermaid
    graph LR
      a1((v1)) --- a2((v2))
      a2 --- a3((v3))
      a3 --- a4((v4))
      a4 --- a1
    ```

    ```mermaid
    graph LR
      b1((u1)) --- b2((u2))
    ```

  - **Feedback didático:** “Todos pares” e “todos ímpares” são propriedades globais de grau. Um único contraexemplo de vértice já invalida a condição.

[Voltar ao sumário](#sumario)

<a id="q41"></a>
## Resposta da Questão 41

- **Questão 41:** **(Nicoletti, 2018)** Mostre que não existe um grafo $G$ cujos vértices tenham graus iguais a $2,3,3,4,4,5$.

  - **Resposta:**
    - Soma dos graus: $2+3+3+4+4+5=21$.
    - Pelo Lema do Aperto de Mão, essa soma deveria ser par.
    - Como 21 é ímpar, não existe tal grafo.

  - **Feedback didático:** Em provas de inexistência por sequência de graus, checar a paridade da soma costuma resolver em uma linha.

[Voltar ao sumário](#sumario)

<a id="q42"></a>
## Resposta da Questão 42

- **Questão 42:** **(Nicoletti, 2018)** Mostre que não existe um grafo simples $G$ cujos vértices tenham graus $1,3,3,3$. Pode existir um outro tipo de grafo com esses graus?

  - **Resposta:**
    - **No grafo simples, não existe.**
    - Se um vértice tem grau 3 em um grafo simples com 4 vértices, ele é adjacente aos outros três. Como há três vértices de grau 3, isso força o quarto vértice a ser adjacente aos três, ficando com grau 3, e não 1.
    - **Em multigrafo, existe.** Exemplo com vértices $a,b,c,d$ e arestas:
      $ad,ab,ac,bc,bc$ (duas arestas paralelas entre $b$ e $c$).
      - $d(a)=3$, $d(b)=3$, $d(c)=3$, $d(d)=1$.

  - **Feedback didático:** Aqui a diferença entre “simples” e “multigrafo” é decisiva: no simples a estrutura fica rígida; no multigrafo, paralelas permitem ajustar graus.

[Voltar ao sumário](#sumario)

<a id="q43"></a>
## Resposta da Questão 43

- **Questão 43:** **(Nicoletti, 2018)** Se $m$ e $n$ são dois inteiros positivos, encontre um grafo $G$ com a propriedade de que todo vértice tem grau $m$ ou $n$.

  - **Resposta:**
    - Uma construção geral é:
      $$G = K_{m+1} \cup K_{n+1}$$
      (união disjunta).
    - Em $K_{m+1}$, todo vértice tem grau $m$.
    - Em $K_{n+1}$, todo vértice tem grau $n$.
    - Logo, em $G$, cada vértice tem grau $m$ ou $n$.

  - **Feedback didático:** Em questões de existência, construir por união disjunta de blocos regulares costuma ser a estratégia mais direta.

[Voltar ao sumário](#sumario)

<a id="q44"></a>
## Resposta da Questão 44

- **Questão 44:** **(Nicoletti, 2018)** O grafo completo $K_n$ é regular? Se for, qual o grau de $K_n$? Justifique sua resposta.

  - **Resposta:**
    - Sim, $K_n$ é regular.
    - Cada vértice é adjacente a todos os outros $n-1$ vértices.
    - Portanto, $K_n$ é $(n-1)$-regular.

  - **Feedback didático:** Regularidade significa “mesmo grau para todos os vértices”. Em $K_n$, isso vem diretamente da definição de completo.

[Voltar ao sumário](#sumario)

<a id="q45"></a>
## Resposta da Questão 45

- **Questão 45:** **(Nicoletti, 2018)** Desenhe os grafos bipartidos completos $K_{2,2}$, $K_{3,3}$ e $K_{4,5}$.

  - **Resposta:**

    - **$K_{2,2}$**
    ```mermaid
    graph LR
      subgraph A1[Partição A]
        a1((a1))
        a2((a2))
      end
      subgraph B1[Partição B]
        b1((b1))
        b2((b2))
      end
      a1 --- b1
      a1 --- b2
      a2 --- b1
      a2 --- b2
    ```

    - **$K_{3,3}$**
    ```mermaid
    graph LR
      subgraph A2[Partição A]
        a3((a1))
        a4((a2))
        a5((a3))
      end
      subgraph B2[Partição B]
        b3((b1))
        b4((b2))
        b5((b3))
      end
      a3 --- b3
      a3 --- b4
      a3 --- b5
      a4 --- b3
      a4 --- b4
      a4 --- b5
      a5 --- b3
      a5 --- b4
      a5 --- b5
    ```

    - **$K_{4,5}$**
    ```mermaid
    graph LR
      subgraph A3[Partição A]
        a6((a1))
        a7((a2))
        a8((a3))
        a9((a4))
      end
      subgraph B3[Partição B]
        b6((b1))
        b7((b2))
        b8((b3))
        b9((b4))
        b10((b5))
      end
      a6 --- b6
      a6 --- b7
      a6 --- b8
      a6 --- b9
      a6 --- b10
      a7 --- b6
      a7 --- b7
      a7 --- b8
      a7 --- b9
      a7 --- b10
      a8 --- b6
      a8 --- b7
      a8 --- b8
      a8 --- b9
      a8 --- b10
      a9 --- b6
      a9 --- b7
      a9 --- b8
      a9 --- b9
      a9 --- b10
    ```

  - **Feedback didático:** Em $K_{m,n}$, não há arestas dentro da mesma partição; todas as arestas são entre as duas partições.

[Voltar ao sumário](#sumario)

<a id="q46"></a>
## Resposta da Questão 46

- **Questão 46:** **(Nicoletti, 2018)** Encontre todos os subgrafos do grafo $G_1$ dado no enunciado.

  - **Resposta:**
    - O grafo $G_1$ é um triângulo: $V=\{v_1,v_2,v_3\}$ e
      $E=\{v_1v_2, v_1v_3, v_2v_3\}$.
    - Um subgrafo é dado por $(V',E')$ com $V'\subseteq V$ e $E'\subseteq E$ usando apenas vértices de $V'$.

    - **Total de subgrafos (incluindo vazio): 18.**
      - $|V'|=0$: 1 subgrafo.
      - $|V'|=1$: 3 subgrafos.
      - $|V'|=2$: para cada par de vértices, pode ter 0 ou 1 aresta $\Rightarrow 3\cdot2=6$.
      - $|V'|=3$: qualquer subconjunto das 3 arestas $\Rightarrow 2^3=8$.
      - Soma: $1+3+6+8=18$.

    - Se considerar apenas subgrafos não vazios, são **17**.

  - **Feedback didático:** Em contagem de subgrafos, separar por tamanho de $V'$ evita omissões. Em cada caso, conte escolhas possíveis de arestas compatíveis com os vértices escolhidos.

[Voltar ao sumário](#sumario)

<a id="q47"></a>
## Resposta da Questão 47

- **Questão 47:** **(Nicoletti, 2018)** Dê um exemplo de:

  - **Resposta:**
    - **(a) Grafo regular simples de grau 1 que não seja completo:**
      $2K_2$ (duas arestas disjuntas).

      ```mermaid
      graph LR
        a1((v1)) --- a2((v2))
        a3((v3)) --- a4((v4))
      ```

    - **(b) Grafo regular simples de grau 2 que não seja completo:**
      $C_4$.

      ```mermaid
      graph LR
        b1((v1)) --- b2((v2))
        b2 --- b3((v3))
        b3 --- b4((v4))
        b4 --- b1
      ```

    - **(c) Grafo regular simples de grau 3 que não seja completo:**
      $K_{3,3}$ (cada vértice tem 3 vizinhos).

      ```mermaid
      graph LR
        subgraph X[X]
          x1((x1))
          x2((x2))
          x3((x3))
        end
        subgraph Y[Y]
          y1((y1))
          y2((y2))
          y3((y3))
        end
        x1 --- y1
        x1 --- y2
        x1 --- y3
        x2 --- y1
        x2 --- y2
        x2 --- y3
        x3 --- y1
        x3 --- y2
        x3 --- y3
      ```

  - **Feedback didático:** Para provar regularidade, sempre confirme o grau de cada vértice no exemplo, e não só “a aparência” do desenho.

[Voltar ao sumário](#sumario)

<a id="q48"></a>
## Resposta da Questão 48

- **Questão 48:** **(Nicoletti, 2018)** Dados os grafos a seguir, quais deles são bipartidos e quais não? Para os bipartidos, redesenhe-os de modo que fiquem evidentes os dois conjuntos de vértices.

  - **Resposta:**
    - **(a)** Não bipartido (contém ciclo ímpar $C_3$).
    - **(b)** Não bipartido (contém ciclo ímpar $C_5$).
    - **(c)** Bipartido (é um ciclo par $C_6$).
    - **(d)** Não bipartido (contém triângulo $v_2v_3v_4$).
    - **(e)** Não bipartido (contém ciclo ímpar).

    - Redesenho do item bipartido **(c)** com partições explícitas:
      - Partição $X=\{v_1,v_3,v_5\}$
      - Partição $Y=\{v_2,v_4,v_6\}$

    ```mermaid
    graph LR
      subgraph X[Partição X]
        v1((v1))
        v3((v3))
        v5((v5))
      end
      subgraph Y[Partição Y]
        v2((v2))
        v4((v4))
        v6((v6))
      end
      v1 --- v2
      v2 --- v3
      v3 --- v4
      v4 --- v5
      v5 --- v6
      v6 --- v1
    ```

  - **Feedback didático:** O teste mais eficiente é buscar ciclo ímpar: se existir, não é bipartido; se não existir (em especial em ciclos pares), pode ser bipartido.

[Voltar ao sumário](#sumario)

<a id="q49"></a>
## Resposta da Questão 49

- **Questão 49:** **(Nicoletti, 2018)** Um grafo tripartido $K_{r,s,t}$ consiste em três conjuntos de vértices (de tamanhos $r$, $s$ e $t$), com uma aresta unindo dois vértices se e somente se eles pertencem a conjuntos diferentes. Desenhe os grafos $K_{2,2,2}$ e $K_{3,3,2}$ e encontre o número de arestas de $K_{3,4,5}$.

  - **Resposta:**

    - **$K_{2,2,2}$**
    ```mermaid
    graph LR
      subgraph A[A]
        a1((a1))
        a2((a2))
      end
      subgraph B[B]
        b1((b1))
        b2((b2))
      end
      subgraph C[C]
        c1((c1))
        c2((c2))
      end
      a1 --- b1
      a1 --- b2
      a2 --- b1
      a2 --- b2
      a1 --- c1
      a1 --- c2
      a2 --- c1
      a2 --- c2
      b1 --- c1
      b1 --- c2
      b2 --- c1
      b2 --- c2
    ```

    - **$K_{3,3,2}$**
    ```mermaid
    graph LR
      subgraph A1[A]
        x1((x1))
        x2((x2))
        x3((x3))
      end
      subgraph B1[B]
        y1((y1))
        y2((y2))
        y3((y3))
      end
      subgraph C1[C]
        z1((z1))
        z2((z2))
      end
      x1 --- y1
      x1 --- y2
      x1 --- y3
      x2 --- y1
      x2 --- y2
      x2 --- y3
      x3 --- y1
      x3 --- y2
      x3 --- y3
      x1 --- z1
      x1 --- z2
      x2 --- z1
      x2 --- z2
      x3 --- z1
      x3 --- z2
      y1 --- z1
      y1 --- z2
      y2 --- z1
      y2 --- z2
      y3 --- z1
      y3 --- z2
    ```

    - **Número de arestas de $K_{3,4,5}$:**
      $$|E|=3\cdot4 + 3\cdot5 + 4\cdot5 = 12+15+20=47.$$

  - **Feedback didático:** Em grafos multipartidos completos, some os produtos entre todos os pares de partições: $rs+rt+st$ no caso tripartido.

[Voltar ao sumário](#sumario)

<a id="q50"></a>
## Resposta da Questão 50

- **Questão 50:** **(Nicoletti, 2018)** Para o grafo $G$ mostrado no enunciado:

  - **Resposta:**

    - **(a) $G-U$, com $U=\{v_1,v_3,v_5,v_7\}$**
      - Vértices restantes: $\{v_2,v_4,v_6,v_8\}$.
      - Arestas restantes: $\{e_6,e_{13}\}$.

      ```mermaid
      graph LR
        v2((v2)) ---|e6| v2
        v8((v8)) ---|e13| v6((v6))
        v4((v4))
      ```

    - **(b) $G-F$, com $F=\{e_2,e_4,e_6,e_8,e_{10},e_{12}\}$**
      - Arestas restantes: $\{e_1,e_3,e_5,e_7,e_9,e_{11},e_{13}\}$.

      ```mermaid
      graph LR
        v1((v1)) ---|e1| v2((v2))
        v3((v3)) ---|e3| v4((v4))
        v2 ---|e5| v5((v5))
        v4 ---|e7| v5
        v3 ---|e9| v7((v7))
        v7 ---|e11| v8((v8))
        v8 ---|e13| v6((v6))
      ```

    - **(c) $G[U]$, com $U=\{v_2,v_3,v_4,v_7\}$**
      - Arestas induzidas: $\{e_3,e_6,e_8,e_9,e_{10}\}$.

      ```mermaid
      graph LR
        v2((v2)) ---|e6| v2
        v3((v3)) ---|e3| v4((v4))
        v3 ---|e8| v7((v7))
        v3 ---|e9| v7
        v4 ---|e10| v7
      ```

    - **(d) $G[F]$, com $F=\{e_1,e_2,e_8,e_{11}\}$**
      - Vértices incidentes: $\{v_1,v_2,v_3,v_7,v_8\}$.

      ```mermaid
      graph LR
        v1((v1)) ---|e1| v2((v2))
        v3((v3)) ---|e2| v1
        v3 ---|e8| v7((v7))
        v7 ---|e11| v8((v8))
      ```

    - **(e) Subgrafo isomorfo a $K_3$**
      - Existe, por exemplo em $\{v_1,v_3,v_4\}$ com arestas $\{e_2,e_3,e_4\}$.

      ```mermaid
      graph LR
        v1((v1)) ---|e2| v3((v3))
        v3 ---|e3| v4((v4))
        v1 ---|e4| v4
      ```

    - **(f) Existe subgrafo isomorfo a $K_4$?**
      - Não. Não há conjunto de 4 vértices com as 6 adjacências necessárias.

    - **(g) Grafo simples básico de $G$ e número de maneiras de obtê-lo**
      - Remove-se loop $e_6$ e fundem-se arestas paralelas $e_8,e_9$ (fica uma só aresta $v_3v_7$).
      - Arestas do simples básico:
        $$\{v_1v_2,v_1v_3,v_3v_4,v_1v_4,v_2v_5,v_4v_5,v_3v_7,v_4v_7,v_7v_8,v_5v_8,v_8v_6\}.$$
      - Pode ser obtido de **2 maneiras**, escolhendo manter $e_8$ ou $e_9$ como representante de $v_3v_7$.

    - **(h) Interseção dos subgrafos de (a) e (b)**
      - Vértices: $\{v_2,v_4,v_6,v_8\}$.
      - Arestas comuns: apenas $\{e_{13}\}$.

      ```mermaid
      graph LR
        v8((v8)) ---|e13| v6((v6))
        v2((v2))
        v4((v4))
      ```

    - **(i) União dos subgrafos de (c) e (d)**
      - Vértices: $\{v_1,v_2,v_3,v_4,v_7,v_8\}$.
      - Arestas: $\{e_1,e_2,e_3,e_6,e_8,e_9,e_{10},e_{11}\}$.

      ```mermaid
      graph LR
        v1((v1)) ---|e1| v2((v2))
        v3((v3)) ---|e2| v1
        v3 ---|e3| v4((v4))
        v2 ---|e6| v2
        v3 ---|e8| v7((v7))
        v3 ---|e9| v7
        v4 ---|e10| v7
        v7 ---|e11| v8((v8))
      ```

  - **Feedback didático:** Nos itens com remoção/indução, siga sempre este roteiro: (1) determinar o conjunto de vértices final; (2) filtrar arestas compatíveis; (3) só então desenhar. Isso evita perder loops/paralelas.

[Voltar ao sumário](#sumario)

<a id="q51"></a>
## Resposta da Questão 51

- **Questão 51:** **(Nicoletti, 2018)** Um grafo simples é chamado de autocomplementar se for isomorfo ao seu próprio complemento.

  - **Resposta:**
    - **(a)** Não é autocomplementar.
      - O grafo desenhado é um ciclo com 6 vértices (2-regular).
      - Seu complemento em 6 vértices é 3-regular.
      - Como os graus mudam, não pode ser isomorfo ao complemento.

    - **(b)** É autocomplementar.
      - O desenho é um $C_5$ (apenas em outra forma geométrica).
      - O complemento de $C_5$ também é um $C_5$.
      - Logo, é isomorfo ao próprio complemento.

    - **(c)** Não é autocomplementar.
      - O grafo é vazio em 6 vértices.
      - Seu complemento é $K_6$.
      - Grafo vazio e completo não são isomorfos.

  - **Conclusão:** somente o grafo **(b)** é autocomplementar.

  - **Feedback didático:** Para testar autocomplementaridade, compare invariantes simples entre $G$ e $\overline{G}$ (graus, número de arestas e estrutura). Se já diferirem nesses pontos, não há isomorfismo.

[Voltar ao sumário](#sumario)

<a id="q52"></a>
## Resposta da Questão 52

- **Questão 52:** **(Feofiloff, 2013)** Faça uma lista de todos os grafos que tenham $\{a,b,c\}$ por conjunto de vértices. Faça a lista de modo que cada grafo apareça ao lado do seu complemento. (ETG: 1.1).

  - **Resposta:**
    - Em $V=\{a,b,c\}$, as arestas possíveis são: $ab, ac, bc$.
    - Cada grafo corresponde a um subconjunto de $\{ab,ac,bc\}$, então há $2^3=8$ grafos.

    - Lista em pares $(G,\overline{G})$:
      - $E(G)=\emptyset$  e  $E(\overline{G})=\{ab,ac,bc\}$.
      - $E(G)=\{ab\}$  e  $E(\overline{G})=\{ac,bc\}$.
      - $E(G)=\{ac\}$  e  $E(\overline{G})=\{ab,bc\}$.
      - $E(G)=\{bc\}$  e  $E(\overline{G})=\{ab,ac\}$.

    - Observação: os casos com 2 arestas e com 3 arestas já aparecem como complementos dos casos com 1 aresta e 0 aresta, respectivamente.

  - **Feedback didático:** O método é: fixar o conjunto de vértices, listar todas as arestas possíveis e tomar todos os subconjuntos dessas arestas. O complemento sempre “inverte presença/ausência” de cada aresta possível.

[Voltar ao sumário](#sumario)

<a id="q53"></a>
## Resposta da Questão 53

- **Questão 53:** **(Feofiloff, 2013)** Faça uma figura de um $K_5$ e outra de um $\overline{K_5}$. Quantas arestas tem um $K_n$? E um $\overline{K_n}$? (ETG: 1.2).

  - **Resposta:**

    - **Exemplo de $K_5$** (todo par de vértices é adjacente):
    ```mermaid
    graph LR
      v1((1)) --- v2((2))
      v1 --- v3((3))
      v1 --- v4((4))
      v1 --- v5((5))
      v2 --- v3
      v2 --- v4
      v2 --- v5
      v3 --- v4
      v3 --- v5
      v4 --- v5
    ```

    - **Exemplo de $\overline{K_5}$** (grafo vazio com 5 vértices):
    ```mermaid
    graph LR
      a1((1))
      a2((2))
      a3((3))
      a4((4))
      a5((5))
    ```

    - **Número de arestas de $K_n$:**
      $$|E(K_n)|=\binom{n}{2}=\frac{n(n-1)}{2}.$$

    - **Número de arestas de $\overline{K_n}$:**
      $$|E(\overline{K_n})|=0,$$
      pois não há arestas no complemento de um grafo completo.

  - **Feedback didático:** Em $K_n$, conte pares de vértices; em $\overline{K_n}$, não existe nenhum par adjacente. Essa leitura direta da definição evita decorar fórmulas sem entendimento.

[Voltar ao sumário](#sumario)

<a id="q54"></a>
## Resposta da Questão 54

- **Questão 54:** **(Feofiloff, 2013)** A matriz de adjacências de um grafo $G$ é a matriz $A$ definida da seguinte maneira: para quaisquer dois vértices $u$ e $v$, $A[u,v]=1$ se $uv\in E_G$, e $A[u,v]=0$ em caso contrário. É claro que a matriz é indexada por $V_G\times V_G$. Escreva a matriz de adjacências do grafo definido no exemplo abaixo. Escreva a matriz de adjacências de um $K_4$. Qual a relação entre a matriz de adjacências de um grafo e a matriz de adjacências de seu complemento? (ETG: 1.3).

  - **Resposta:**
    - No exemplo da lista, os vértices são $\{t,u,v,w,x,y,z\}$ e as arestas são
      $\{vw,uv,xw,xu,xy,yz\}$.

    - **Matriz de adjacência do exemplo** (ordem de vértices: $t,u,v,w,x,y,z$):
      $$
      A=
      \begin{bmatrix}
      0&0&0&0&0&0&0\\
      0&0&1&0&1&0&0\\
      0&1&0&1&0&0&0\\
      0&0&1&0&1&0&0\\
      0&1&0&1&0&1&0\\
      0&0&0&0&1&0&1\\
      0&0&0&0&0&1&0
      \end{bmatrix}.
      $$

    - **Matriz de adjacência de $K_4$** (ordem $v_1,v_2,v_3,v_4$):
      $$
      A(K_4)=
      \begin{bmatrix}
      0&1&1&1\\
      1&0&1&1\\
      1&1&0&1\\
      1&1&1&0
      \end{bmatrix}.
      $$

    - **Relação com o complemento** (grafo simples com $n$ vértices):
      $$
      A(\overline{G}) = J_n - I_n - A(G),
      $$
      onde $J_n$ é a matriz $n\times n$ de 1 e $I_n$ é a identidade.
      Em palavras: para cada par de vértices distintos $(i,j)$, se $A(G)_{ij}=1$ então $A(\overline{G})_{ij}=0$, e se $A(G)_{ij}=0$ então $A(\overline{G})_{ij}=1$. A diagonal continua 0, pois em grafos simples não há loops.

  - **Feedback didático:** Depois de fixar a ordem dos vértices, preencha linha por linha marcando 1 apenas para pares adjacentes. No complemento, você só inverte 0/1 fora da diagonal.

[Voltar ao sumário](#sumario)

<a id="q55"></a>
## Resposta da Questão 55

- **Questão 55:** **(Feofiloff, 2013)** A matriz de incidências de um grafo $G$ é a matriz $M$ definida da seguinte maneira: para todo vértice $u$ e toda aresta $e$, $M[u,e]=1$ se $u$ é uma das pontas de $e$, e $M[u,e]=0$ em caso contrário. É claro que a matriz é indexada por $V_G\times E_G$. Escreva a matriz de incidências do grafo definido no exemplo da página 8. Escreva a matriz de incidências de um $K_4$. Quanto vale a soma de todos os elementos da matriz de incidências de um grafo? Qual a relação entre a matriz de incidências de um grafo e a matriz de incidências de seu complemento? (ETG: 1.4).

  - **Resposta:**
    - Usando o grafo exemplo da Q54 (vértices $t,u,v,w,x,y,z$ e arestas $vw,uv,xw,xu,xy,yz$), adote:
      $$e_1=vw,\ e_2=uv,\ e_3=xw,\ e_4=xu,\ e_5=xy,\ e_6=yz.$$

    - **Matriz de incidência do exemplo** (linhas na ordem $t,u,v,w,x,y,z$):
      $$
      M=
      \begin{array}{c|cccccc}
           & e_1 & e_2 & e_3 & e_4 & e_5 & e_6 \\\hline
      t    & 0 & 0 & 0 & 0 & 0 & 0 \\
      u    & 0 & 1 & 0 & 1 & 0 & 0 \\
      v    & 1 & 1 & 0 & 0 & 0 & 0 \\
      w    & 1 & 0 & 1 & 0 & 0 & 0 \\
      x    & 0 & 0 & 1 & 1 & 1 & 0 \\
      y    & 0 & 0 & 0 & 0 & 1 & 1 \\
      z    & 0 & 0 & 0 & 0 & 0 & 1
      \end{array}
      $$

    - **Matriz de incidência de $K_4$** (vértices $v_1,v_2,v_3,v_4$ e arestas
      $e_1=v_1v_2, e_2=v_1v_3, e_3=v_1v_4, e_4=v_2v_3, e_5=v_2v_4, e_6=v_3v_4$):
      $$
      M(K_4)=
      \begin{array}{c|cccccc}
           & e_1 & e_2 & e_3 & e_4 & e_5 & e_6 \\\hline
      v_1  & 1 & 1 & 1 & 0 & 0 & 0 \\
      v_2  & 1 & 0 & 0 & 1 & 1 & 0 \\
      v_3  & 0 & 1 & 0 & 1 & 0 & 1 \\
      v_4  & 0 & 0 & 1 & 0 & 1 & 1
      \end{array}
      $$

    - **Soma de todos os elementos da matriz de incidência:**
      $$\sum M = 2|E|=2m,$$
      pois cada coluna (cada aresta simples) tem exatamente dois 1.

    - **Relação com o complemento:**
      - Não há uma fórmula matricial simples do tipo $M(\overline{G})=\cdots$ usando apenas $M(G)$, porque o número e a identidade das colunas (arestas) mudam.
      - Em termos de graus, vale:
        $$d_{\overline{G}}(v)=n-1-d_G(v).$$
      - Se indexarmos colunas por **todos** os pares não ordenados de vértices, então as colunas de $G$ e de $\overline{G}$ particionam esse conjunto de pares.

  - **Feedback didático:** Na matriz de incidência, pense “coluna = aresta”. Em grafo simples, cada coluna sempre tem dois 1; por isso a soma total vira $2m$ imediatamente.

[Voltar ao sumário](#sumario)

<a id="q56"></a>
## Resposta da Questão 56

- **Questão 56:** **(Feofiloff, 2013)** Os hidrocarbonetos conhecidos como alcanos têm fórmula química $C_pH_{2p+2}$, onde $C$ e $H$ representam átomos de carbono e hidrogênio, respectivamente. As moléculas de alcanos podem ser representadas por grafos. Faça uma figura de uma molécula de metano $CH_4$. Quantas moléculas diferentes de $C_3H_8$ existem? (ETG: 1.5).

  - **Resposta:**
    - **Metano ($CH_4$):** um carbono ligado a quatro hidrogênios (grafo estrela $K_{1,4}$, com o carbono no centro).

    ```mermaid
    graph TD
      C((C)) --- H1((H))
      C --- H2((H))
      C --- H3((H))
      C --- H4((H))
    ```

    - **Número de moléculas diferentes de $C_3H_8$:**
      - Existe apenas **1** molécula estrutural (propano).
      - Com 3 carbonos, a cadeia carbônica só pode ser linear ($C-C-C$), sem alternativa de ramificação distinta.

  - **Feedback didático:** Para contar isômeros de alcanos, foque primeiro no esqueleto de carbonos (árvore dos vértices $C$). Depois complete as valências com hidrogênios. Em $C_3H_8$, há apenas um esqueleto possível.

[Voltar ao sumário](#sumario)

<a id="q57"></a>
## Resposta da Questão 57

- **Questão 57:** **(Feofiloff, 2013)** Seja $V$ o produto cartesiano $\{1,2,\ldots,p\}\times\{1,2,\ldots,q\}$. Digamos que dois elementos $(i,j)$ e $(i',j')$ de $V$ são adjacentes se $i=i'$ e $|j-j'|=1$, ou se $j=j'$ e $|i-i'|=1$. Essa relação de adjacência define o grafo grade $p$-por-$q$. Quantas arestas tem a grade $p$-por-$q$? Escreva as matrizes de adjacência e incidência de uma grade 4-por-5. (ETG: 1.6).

  - **Resposta:**
    - Em uma grade $p\times q$:
      - arestas horizontais: $p(q-1)$
      - arestas verticais: $q(p-1)$
      - total:
        $$m=p(q-1)+q(p-1)=2pq-p-q.$$

    - Para a grade $4\times 5$:
      $$|V|=20,\quad |E|=4(5-1)+5(4-1)=16+15=31.$$

    - Ordene os vértices por linhas:
      $$(1,1),(1,2),\ldots,(1,5),(2,1),\ldots,(2,5),(3,1),\ldots,(3,5),(4,1),\ldots,(4,5).$$

    - **Matriz de adjacência $A$ (20x20)** em blocos $5\times 5$:
      $$
      A=
      \begin{bmatrix}
      T_5 & I_5 & 0   & 0 \\
      I_5 & T_5 & I_5 & 0 \\
      0   & I_5 & T_5 & I_5 \\
      0   & 0   & I_5 & T_5
      \end{bmatrix},
      $$
      onde
      $$
      T_5=
      \begin{bmatrix}
      0&1&0&0&0\\
      1&0&1&0&0\\
      0&1&0&1&0\\
      0&0&1&0&1\\
      0&0&0&1&0
      \end{bmatrix}
      \quad\text{e}\quad I_5\text{ é a identidade }5\times5.
      $$

    - **Matriz de incidência $M$ (20x31):**
      - Colunas das arestas na ordem
        $$h_{1,1},\ldots,h_{1,4},h_{2,1},\ldots,h_{4,4},v_{1,1},\ldots,v_{1,5},v_{2,1},\ldots,v_{3,5},$$
        com
        $$h_{i,j}=\{(i,j),(i,j+1)\},\quad v_{i,j}=\{(i,j),(i+1,j)\}.$$
      - Escrevendo $M=[M_H\mid M_V]$:
        $$M_H=I_4\otimes N_5\quad(20\times16),\qquad M_V=N_4\otimes I_5\quad(20\times15),$$
        onde
        $$
        N_5=
        \begin{bmatrix}
        1&0&0&0\\
        1&1&0&0\\
        0&1&1&0\\
        0&0&1&1\\
        0&0&0&1
        \end{bmatrix},
        \qquad
        N_4=
        \begin{bmatrix}
        1&0&0\\
        1&1&0\\
        0&1&1\\
        0&0&1
        \end{bmatrix}.
        $$
      Isso determina completamente a matriz de incidência da grade $4\times5$.

  - **Feedback didático:** Para grafos grade, organizar por linhas/colunas transforma as matrizes em blocos repetitivos. Isso evita erro manual e mostra claramente a estrutura do problema.

[Voltar ao sumário](#sumario)

<a id="q58"></a>
## Resposta da Questão 58

- **Questão 58:** **(Feofiloff, 2013)** Dados números inteiros $p$ e $q$, seja $V$ o conjunto $\{1,2,3,\ldots,pq-2,pq-1,pq\}$. Digamos que dois elementos $k$ e $k'$ de $V$, com $k<k'$, são adjacentes se $k'=k+q$ ou se $k \bmod q \neq 0$ e $k'=k+1$. Essa relação de adjacência define um grafo com conjunto de vértices $V$. Faça uma figura do grafo com parâmetros $p=3$ e $q=4$. Faça uma figura do grafo com parâmetros $p=4$ e $q=3$. Qual a relação entre esses grafos e a grade definida no exercício 1.6? (ETG: 1.7).

  - **Resposta:**
    - A regra gera arestas “horizontais” ($k$ com $k+1$, sem cruzar fim de linha) e “verticais” ($k$ com $k+q$).

    - **Caso $p=3$, $q=4$** (grade 3 por 4):
    ```mermaid
    graph LR
      1 --- 2 --- 3 --- 4
      5 --- 6 --- 7 --- 8
      9 --- 10 --- 11 --- 12
      1 --- 5
      2 --- 6
      3 --- 7
      4 --- 8
      5 --- 9
      6 --- 10
      7 --- 11
      8 --- 12
    ```

    - **Caso $p=4$, $q=3$** (grade 4 por 3):
    ```mermaid
    graph LR
      1 --- 2 --- 3
      4 --- 5 --- 6
      7 --- 8 --- 9
      10 --- 11 --- 12
      1 --- 4
      2 --- 5
      3 --- 6
      4 --- 7
      5 --- 8
      6 --- 9
      7 --- 10
      8 --- 11
      9 --- 12
    ```

    - **Relação com a grade do exercício 57:**
      - O grafo definido aqui é exatamente a grade $p\times q$ com outra rotulação dos vértices.
      - Portanto, para cada par $(p,q)$ ele é isomorfo à grade $p$-por-$q$.
      - Em particular, os casos $(3,4)$ e $(4,3)$ também são isomorfos entre si (basta trocar linhas por colunas).

  - **Feedback didático:** A numeração linear $1,2,\dots,pq$ codifica uma malha retangular: condição $k+1$ cria vizinhança na linha e condição $k+q$ cria vizinhança entre linhas. Isso transforma diretamente o enunciado em uma grade.

[Voltar ao sumário](#sumario)

<a id="q59"></a>
## Resposta da Questão 59

- **Questão 59:** **(Feofiloff, 2013)** O grafo dos movimentos da dama (ou grafo da dama) é definido em um tabuleiro $t$-por-$t$: os vértices são as casas e dois vértices são adjacentes se uma dama do xadrez pode ir de uma casa à outra em um só movimento. Faça uma figura do grafo da dama 4-por-4. Escreva as matrizes de adjacência e incidência desse grafo. Quantas arestas tem o grafo da dama 8-por-8? Quantas arestas tem o grafo da dama $t$-por-$t$? (ETG: 1.8).

  - **Resposta:**
    - **Figura (vértices) do grafo da dama 4-por-4:**
      - Vértices: casas $(i,j)$ com $i,j\in\{1,2,3,4\}$.
      - Há aresta entre $(i,j)$ e $(k,\ell)$ sse estão na mesma linha ($i=k$), na mesma coluna ($j=\ell$), ou na mesma diagonal ($|i-k|=|j-\ell|$).

    - **Matriz 8x8 (um movimento da dama):** casa da dama em `(4,4)` (●) e casas alcançáveis em um lance marcadas com `x`.
      (linhas = primeira coordenada `i`, colunas = segunda coordenada `j`).

      | i\\j | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 |
      |---|---|---|---|---|---|---|---|---|
      | 1 | x | . | . | x | . | . | x | . |
      | 2 | . | x | . | x | . | x | . | . |
      | 3 | . | . | x | x | x | . | . | . |
      | 4 | x | x | x | ● | x | x | x | x |
      | 5 | . | . | x | x | x | . | . | . |
      | 6 | . | x | . | x | . | x | . | . |
      | 7 | x | . | . | x | . | . | x | . |
      | 8 | . | . | . | x | . | . | . | x |

    - **Grafo (Mermaid) 4x4:** vértices são as casas $(i,j)$; as arestas desenhadas abaixo mostram as adjacências por mesma linha e mesma coluna no tabuleiro 4x4.

    ```mermaid
    graph LR
      a11((1,1)) --- a12((1,2)) --- a13((1,3)) --- a14((1,4))
      a21((2,1)) --- a22((2,2)) --- a23((2,3)) --- a24((2,4))
      a31((3,1)) --- a32((3,2)) --- a33((3,3)) --- a34((3,4))
      a41((4,1)) --- a42((4,2)) --- a43((4,3)) --- a44((4,4))
      a11 --- a21 --- a31 --- a41
      a12 --- a22 --- a32 --- a42
      a13 --- a23 --- a33 --- a43
      a14 --- a24 --- a34 --- a44
      a11 --- a22
      a11 --- a33
      a11 --- a44
      a12 --- a21
      a12 --- a23
      a12 --- a34
      a13 --- a22
      a13 --- a24
      a13 --- a31
      a14 --- a23
      a14 --- a32
      a14 --- a41
      a21 --- a32
      a21 --- a43
      a22 --- a31
      a22 --- a33
      a22 --- a44
      a23 --- a32
      a23 --- a34
      a23 --- a41
      a24 --- a33
      a24 --- a42
      a31 --- a42
      a32 --- a41
      a32 --- a43
      a33 --- a42
      a33 --- a44
      a34 --- a43
    ```

    - **Matriz de adjacência (4-por-4):**
      - Ordene os 16 vértices lexicograficamente:
        $$(1,1),(1,2),(1,3),(1,4),(2,1),\ldots,(4,4).$$
      - A matriz $A$ é $16\times16$ com
        $$
        A[(i,j),(k,\ell)] =
        \begin{cases}
        1,& (i,j)\neq(k,\ell)\text{ e }(i=k\ \text{ou}\ j=\ell\ \text{ou}\ |i-k|=|j-\ell|),\\
        0,& \text{caso contrário.}
        \end{cases}
        $$

    - **Matriz de incidência (4-por-4):**
      - Como $|E|=76$ (calculado abaixo), $M$ é $16\times76$.
      - Numerando as arestas como $e_1,\dots,e_{76}$, cada coluna de $M$ tem 1 nas duas linhas dos vértices extremos de $e_r$ e 0 nas demais.

    - **Número de arestas no caso geral $t\times t$:**
      - Mesma linha: $t\binom{t}{2}$.
      - Mesma coluna: $t\binom{t}{2}$.
      - Mesma diagonal: em cada direção, comprimentos $1,2,\ldots,t-1,t,t-1,\ldots,1$; então
        $$
        \sum \binom{\text{comprimento}}{2}
        =\binom{t}{2}+2\sum_{k=1}^{t-1}\binom{k}{2}
        =\frac{t(t-1)(2t-1)}{6}.
        $$
        Duas direções: $\frac{t(t-1)(2t-1)}{3}$.
      - Total:
        $$
        |E|=2t\binom{t}{2}+\frac{t(t-1)(2t-1)}{3}
        =\frac{t(t-1)(5t-1)}{3}.
        $$

    - **Para $t=8$:**
      $$
      |E|=\frac{8\cdot7\cdot(5\cdot8-1)}{3}=728.
      $$

  - **Feedback didático:** A contagem de arestas funciona por decomposição em três tipos independentes (linha, coluna e diagonais). Esse método evita dupla contagem e escala bem para qualquer $t$.

[Voltar ao sumário](#sumario)

<a id="q60"></a>
## Resposta da Questão 60

- **Questão 60:** **(Feofiloff, 2013)** O grafo do cavalo $t$-por-$t$ é definido assim: os vértices são as casas de um tabuleiro de xadrez com $t$ linhas e $t$ colunas; dois vértices são adjacentes se um cavalo pode saltar de um deles para o outro em um só movimento. Faça uma figura do grafo do cavalo 3-por-3. Escreva as matrizes de adjacência e incidência desse grafo. Quantas arestas tem o grafo do cavalo 8-por-8? Quantas arestas tem o grafo do cavalo $t$-por-$t$? (ETG: 1.9).

  - **Resposta:**
    - **Matriz 8x8 (um movimento do cavalo):** casa do cavalo em `(4,4)` (●) e casas alcançáveis em um lance marcadas com `x`.
      (linhas = primeira coordenada `i`, colunas = segunda coordenada `j`).

      | i\\j | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 |
      |---|---|---|---|---|---|---|---|---|
      | 1 | . | . | . | . | . | . | . | . |
      | 2 | . | . | x | . | x | . | . | . |
      | 3 | . | x | . | . | . | x | . | . |
      | 4 | . | . | . | ● | . | . | . | . |
      | 5 | . | x | . | . | . | x | . | . |
      | 6 | . | . | x | . | x | . | . | . |
      | 7 | . | . | . | . | . | . | . | . |
      | 8 | . | . | . | . | . | . | . | . |

    - **Grafo (Mermaid) 3x3:** vértices são as casas $(i,j)$ e as arestas abaixo são exatamente os saltos de cavalo em um movimento.

    ```mermaid
    graph LR
      a11((1,1)) --- a23((2,3))
      a11 --- a32((3,2))
      a12((1,2)) --- a31((3,1))
      a12 --- a33((3,3))
      a13((1,3)) --- a21((2,1))
      a13 --- a32
      a21 --- a33
      a23 --- a31
      a22((2,2))
    ```

    - **Matriz de adjacência do cavalo 3x3:**
      - Ordem dos vértices:
        $$v_1=(1,1),\ v_2=(1,2),\ v_3=(1,3),\ v_4=(2,1),\ v_5=(2,2),\ v_6=(2,3),\ v_7=(3,1),\ v_8=(3,2),\ v_9=(3,3).$$
      - Matriz $A$:
        $$
        A=
        \begin{bmatrix}
        0&0&0&0&0&1&0&1&0\\
        0&0&0&0&0&0&1&0&1\\
        0&0&0&1&0&0&0&1&0\\
        0&0&1&0&0&0&0&0&1\\
        0&0&0&0&0&0&0&0&0\\
        1&0&0&0&0&0&1&0&0\\
        0&1&0&0&0&1&0&0&0\\
        1&0&1&0&0&0&0&0&0\\
        0&1&0&1&0&0&0&0&0
        \end{bmatrix}.
        $$

    - **Matriz de incidência do cavalo 3x3:**
      - Ordene as arestas como
        $$e_1=v_1v_6,\ e_2=v_1v_8,\ e_3=v_2v_7,\ e_4=v_2v_9,\ e_5=v_3v_4,\ e_6=v_3v_8,\ e_7=v_4v_9,\ e_8=v_6v_7.$$
      - Matriz $M$:
        $$
        M=
        \begin{array}{c|cccccccc}
             & e_1&e_2&e_3&e_4&e_5&e_6&e_7&e_8 \\\hline
        v_1  & 1&1&0&0&0&0&0&0 \\
        v_2  & 0&0&1&1&0&0&0&0 \\
        v_3  & 0&0&0&0&1&1&0&0 \\
        v_4  & 0&0&0&0&1&0&1&0 \\
        v_5  & 0&0&0&0&0&0&0&0 \\
        v_6  & 1&0&0&0&0&0&0&1 \\
        v_7  & 0&0&1&0&0&0&0&1 \\
        v_8  & 0&1&0&0&0&1&0&0 \\
        v_9  & 0&0&0&1&0&0&1&0
        \end{array}.
        $$

    - **Número de arestas no caso geral $t\times t$:**
      - Retângulos $2\times3$: $(t-1)(t-2)$ posições, cada um contribui com 2 arestas de cavalo.
      - Retângulos $3\times2$: $(t-2)(t-1)$ posições, cada um contribui com 2 arestas.
      - Total:
        $$|E|=2(t-1)(t-2)+2(t-1)(t-2)=4(t-1)(t-2).$$

    - **Para $t=8$:**
      $$|E|=4\cdot7\cdot6=168.$$

  - **Feedback didático:** Para o grafo do cavalo, a contagem por blocos $2\times3$ e $3\times2$ é a forma mais limpa de obter a fórmula geral sem dupla contagem.

[Voltar ao sumário](#sumario)

<a id="q61"></a>
## Resposta da Questão 61

- **Questão 61:** **(Feofiloff, 2013)** O grafo do bispo $t$-por-$t$ é definido assim: os vértices são as casas de um tabuleiro de xadrez com $t$ linhas e $t$ colunas; dois vértices são adjacentes se um bispo pode saltar de um deles para o outro em um só movimento. Faça uma figura do grafo do bispo 4-por-4. Escreva as matrizes de adjacência e incidência desse grafo. Quantas arestas tem o grafo do bispo 8-por-8? Quantas arestas tem o grafo do bispo $t$-por-$t$? (ETG: 1.10).

  - **Resposta:**
    - **Matriz 8x8 (um movimento do bispo):** casa do bispo em `(4,4)` (●) e casas alcançáveis em um lance marcadas com `x`.
      (linhas = primeira coordenada `i`, colunas = segunda coordenada `j`).

      | i\j | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 |
      |---|---|---|---|---|---|---|---|---|
      | 1 | x | . | . | . | . | . | x | . |
      | 2 | . | x | . | . | . | x | . | . |
      | 3 | . | . | x | . | x | . | . | . |
      | 4 | . | . | . | ● | . | . | . | . |
      | 5 | . | . | x | . | x | . | . | . |
      | 6 | . | x | . | . | . | x | . | . |
      | 7 | x | . | . | . | . | . | x | . |
      | 8 | . | . | . | . | . | . | . | x |

    - **Grafo (Mermaid) 4x4:** vértices são as casas $(i,j)$ e as arestas abaixo são exatamente adjacências por diagonal (movimento de bispo em um lance).
      Observação: o grafo fica com duas componentes conexas (casas claras e casas escuras), pois o bispo nunca muda a cor da casa.

    ```mermaid
    graph LR
      a11((1,1)) --- a22((2,2))
      a11 --- a33((3,3))
      a11 --- a44((4,4))
      a12((1,2)) --- a21((2,1))
      a12 --- a23((2,3))
      a12 --- a34((3,4))
      a13((1,3)) --- a22
      a13 --- a24((2,4))
      a13 --- a31((3,1))
      a14((1,4)) --- a23
      a14 --- a32((3,2))
      a14 --- a41((4,1))
      a21 --- a32
      a21 --- a43((4,3))
      a22 --- a31
      a22 --- a33
      a22 --- a44
      a23 --- a32
      a23 --- a34
      a23 --- a41
      a24 --- a33
      a24 --- a42((4,2))
      a31 --- a42
      a32 --- a41
      a32 --- a43
      a33 --- a42
      a33 --- a44
      a34 --- a43
    ```

    - **Matriz de adjacência do bispo 4x4:**
      - Ordem dos vértices:
        $$v_1=(1,1),\ v_2=(1,2),\ v_3=(1,3),\ v_4=(1,4),\ v_5=(2,1),\ v_6=(2,2),\ v_7=(2,3),\ v_8=(2,4),$$
        $$v_9=(3,1),\ v_{10}=(3,2),\ v_{11}=(3,3),\ v_{12}=(3,4),\ v_{13}=(4,1),\ v_{14}=(4,2),\ v_{15}=(4,3),\ v_{16}=(4,4).$$
      - Matriz $A$:
        $$
        \begin{bmatrix}
        0&0&0&0&0&1&0&0&0&0&1&0&0&0&0&1\\
        0&0&0&0&1&0&1&0&0&0&0&1&0&0&0&0\\
        0&0&0&0&0&1&0&1&1&0&0&0&0&0&0&0\\
        0&0&0&0&0&0&1&0&0&1&0&0&1&0&0&0\\
        0&1&0&0&0&0&0&0&0&1&0&0&0&0&1&0\\
        1&0&1&0&0&0&0&0&1&0&1&0&0&0&0&1\\
        0&1&0&1&0&0&0&0&0&1&0&1&1&0&0&0\\
        0&0&1&0&0&0&0&0&0&0&1&0&0&1&0&0\\
        0&0&1&0&0&1&0&0&0&0&0&0&0&1&0&0\\
        0&0&0&1&1&0&1&0&0&0&0&0&1&0&1&0\\
        1&0&0&0&0&1&0&1&0&0&0&0&0&1&0&1\\
        0&1&0&0&0&0&1&0&0&0&0&0&0&0&1&0\\
        0&0&0&1&0&0&1&0&0&1&0&0&0&0&0&0\\
        0&0&0&0&0&0&0&1&1&0&1&0&0&0&0&0\\
        0&0&0&0&1&0&0&0&0&1&0&1&0&0&0&0\\
        1&0&0&0&0&1&0&0&0&0&1&0&0&0&0&0
        \end{bmatrix}.
        $$

    - **Matriz de incidência do bispo 4x4:**
      - Ordene as 28 arestas como:
        $$\begin{aligned}
        &e_1=(1,1)(2,2),\ e_2=(1,1)(3,3),\ e_3=(1,1)(4,4),\ e_4=(1,2)(2,1),\ e_5=(1,2)(2,3),\ e_6=(1,2)(3,4),\\
        &e_7=(1,3)(2,2),\ e_8=(1,3)(2,4),\ e_9=(1,3)(3,1),\ e_{10}=(1,4)(2,3),\ e_{11}=(1,4)(3,2),\ e_{12}=(1,4)(4,1),\\
        &e_{13}=(2,1)(3,2),\ e_{14}=(2,1)(4,3),\ e_{15}=(2,2)(3,1),\ e_{16}=(2,2)(3,3),\ e_{17}=(2,2)(4,4),\\
        &e_{18}=(2,3)(3,2),\ e_{19}=(2,3)(3,4),\ e_{20}=(2,3)(4,1),\ e_{21}=(2,4)(3,3),\ e_{22}=(2,4)(4,2),\\
        &e_{23}=(3,1)(4,2),\ e_{24}=(3,2)(4,1),\ e_{25}=(3,2)(4,3),\ e_{26}=(3,3)(4,2),\ e_{27}=(3,3)(4,4),\ e_{28}=(3,4)(4,3).
        \end{aligned}$$
      - Matriz $M$ (linhas $v_1,\dots,v_{16}$ e colunas $e_1,\dots,e_{28}$):
        $$
        \begin{array}{c|cccccccccccccccccccccccccccc}
             &e_1&e_2&e_3&e_4&e_5&e_6&e_7&e_8&e_9&e_{10}&e_{11}&e_{12}&e_{13}&e_{14}&e_{15}&e_{16}&e_{17}&e_{18}&e_{19}&e_{20}&e_{21}&e_{22}&e_{23}&e_{24}&e_{25}&e_{26}&e_{27}&e_{28} \\\hline
        v_1  &1&1&1&0&0&0&0&0&0&0&0&0&0&0&0&0&0&0&0&0&0&0&0&0&0&0&0&0\\
        v_2  &0&0&0&1&1&1&0&0&0&0&0&0&0&0&0&0&0&0&0&0&0&0&0&0&0&0&0&0\\
        v_3  &0&0&0&0&0&0&1&1&1&0&0&0&0&0&0&0&0&0&0&0&0&0&0&0&0&0&0&0\\
        v_4  &0&0&0&0&0&0&0&0&0&1&1&1&0&0&0&0&0&0&0&0&0&0&0&0&0&0&0&0\\
        v_5  &0&0&0&1&0&0&0&0&0&0&0&0&1&1&0&0&0&0&0&0&0&0&0&0&0&0&0&0\\
        v_6  &1&0&0&0&0&0&1&0&0&0&0&0&0&0&1&1&1&0&0&0&0&0&0&0&0&0&0&0\\
        v_7  &0&0&0&0&1&0&0&0&0&1&0&0&0&0&0&0&0&1&1&1&0&0&0&0&0&0&0&0\\
        v_8  &0&0&0&0&0&0&0&1&0&0&0&0&0&0&0&0&0&0&0&0&1&1&0&0&0&0&0&0\\
        v_9  &0&0&0&0&0&0&0&0&1&0&0&0&0&0&1&0&0&0&0&0&0&0&1&0&0&0&0&0\\
        v_{10}&0&0&0&0&0&0&0&0&0&0&1&0&1&0&0&0&0&1&0&0&0&0&0&1&1&0&0&0\\
        v_{11}&0&1&0&0&0&0&0&0&0&0&0&0&0&0&0&1&0&0&0&0&1&0&0&0&0&1&1&0\\
        v_{12}&0&0&0&0&0&1&0&0&0&0&0&0&0&0&0&0&0&0&1&0&0&0&0&0&0&0&0&1\\
        v_{13}&0&0&0&0&0&0&0&0&0&0&0&1&0&0&0&0&0&0&0&1&0&0&0&1&0&0&0&0\\
        v_{14}&0&0&0&0&0&0&0&0&0&0&0&0&0&0&0&0&0&0&0&0&0&1&1&0&0&1&0&0\\
        v_{15}&0&0&0&0&0&0&0&0&0&0&0&0&0&1&0&0&0&0&0&0&0&0&0&0&1&0&0&1\\
        v_{16}&0&0&1&0&0&0&0&0&0&0&0&0&0&0&0&0&1&0&0&0&0&0&0&0&0&0&1&0
        \end{array}
        $$

    - **Número de arestas no caso geral $t\times t$:**
      - O bispo conecta pares de casas na mesma diagonal.
      - Em cada direção de diagonal, os comprimentos são $1,2,\ldots,t-1,t,t-1,\ldots,1$.
      - Então, em uma direção:
        $$\sum \binom{\ell}{2}=\binom{t}{2}+2\sum_{k=1}^{t-1}\binom{k}{2}=\frac{t(t-1)(2t-1)}{6}.$$
      - Duas direções:
        $$|E|=2\cdot\frac{t(t-1)(2t-1)}{6}=\frac{t(t-1)(2t-1)}{3}.$$

    - **Para $t=8$:**
      $$|E|=\frac{8\cdot7\cdot15}{3}=280.$$

  - **Feedback didático:** Para o bispo, toda a contagem se reduz a “pares de casas na mesma diagonal”. Somar $\binom{\ell}{2}$ por comprimento de diagonal é o caminho mais direto e evita dupla contagem.

[Voltar ao sumário](#sumario)

<a id="q62"></a>
## Resposta da Questão 62

- **Questão 62:** **(Feofiloff, 2013)** O grafo da torre $t$-por-$t$ é definido assim: os vértices são as casas de um tabuleiro de xadrez com $t$ linhas e $t$ colunas; dois vértices são adjacentes se uma torre pode saltar de um deles para o outro em um só movimento. Faça uma figura do grafo da torre 4-por-4. Escreva as matrizes de adjacência e incidência desse grafo. Quantas arestas tem o grafo da torre 8-por-8? Quantas arestas tem o grafo da torre $t$-por-$t$? (ETG: 1.11).

  - **Resposta:**
    - **Matriz 8x8 (um movimento da torre):** casa da torre em `(4,4)` (●) e casas alcançáveis em um lance marcadas com `x`.
      (linhas = primeira coordenada `i`, colunas = segunda coordenada `j`).

      | i\j | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 |
      |---|---|---|---|---|---|---|---|---|
      | 1 | . | . | . | x | . | . | . | . |
      | 2 | . | . | . | x | . | . | . | . |
      | 3 | . | . | . | x | . | . | . | . |
      | 4 | x | x | x | ● | x | x | x | x |
      | 5 | . | . | . | x | . | . | . | . |
      | 6 | . | . | . | x | . | . | . | . |
      | 7 | . | . | . | x | . | . | . | . |
      | 8 | . | . | . | x | . | . | . | . |

    - **Grafo (Mermaid) 4x4:** vértices são as casas $(i,j)$ e as arestas abaixo representam adjacência por mesma linha ou mesma coluna (movimento de torre em um lance).
      Observação: diferente do bispo, o grafo da torre é conexo.

    ```mermaid
    graph LR
      a11((1,1)) --- a12((1,2))
      a11 --- a13((1,3))
      a11 --- a14((1,4))
      a11 --- a21((2,1))
      a11 --- a31((3,1))
      a11 --- a41((4,1))
      a12 --- a13
      a12 --- a14
      a12 --- a22((2,2))
      a12 --- a32((3,2))
      a12 --- a42((4,2))
      a13 --- a14
      a13 --- a23((2,3))
      a13 --- a33((3,3))
      a13 --- a43((4,3))
      a14 --- a24((2,4))
      a14 --- a34((3,4))
      a14 --- a44((4,4))
      a21 --- a22
      a21 --- a23
      a21 --- a24
      a21 --- a31
      a21 --- a41
      a22 --- a23
      a22 --- a24
      a22 --- a32
      a22 --- a42
      a23 --- a24
      a23 --- a33
      a23 --- a43
      a24 --- a34
      a24 --- a44
      a31 --- a32
      a31 --- a33
      a31 --- a34
      a31 --- a41
      a32 --- a33
      a32 --- a34
      a32 --- a42
      a33 --- a34
      a33 --- a43
      a34 --- a44
      a41 --- a42
      a41 --- a43
      a41 --- a44
      a42 --- a43
      a42 --- a44
      a43 --- a44
    ```

    - **Matriz de adjacência da torre 4x4:**
      - Ordem dos vértices:
        $$v_1=(1,1),\ v_2=(1,2),\ v_3=(1,3),\ v_4=(1,4),\ v_5=(2,1),\ v_6=(2,2),\ v_7=(2,3),\ v_8=(2,4),$$
        $$v_9=(3,1),\ v_{10}=(3,2),\ v_{11}=(3,3),\ v_{12}=(3,4),\ v_{13}=(4,1),\ v_{14}=(4,2),\ v_{15}=(4,3),\ v_{16}=(4,4).$$
      - Matriz $A$:
        $$
        \begin{bmatrix}
        0&1&1&1&1&0&0&0&1&0&0&0&1&0&0&0\\
        1&0&1&1&0&1&0&0&0&1&0&0&0&1&0&0\\
        1&1&0&1&0&0&1&0&0&0&1&0&0&0&1&0\\
        1&1&1&0&0&0&0&1&0&0&0&1&0&0&0&1\\
        1&0&0&0&0&1&1&1&1&0&0&0&1&0&0&0\\
        0&1&0&0&1&0&1&1&0&1&0&0&0&1&0&0\\
        0&0&1&0&1&1&0&1&0&0&1&0&0&0&1&0\\
        0&0&0&1&1&1&1&0&0&0&0&1&0&0&0&1\\
        1&0&0&0&1&0&0&0&0&1&1&1&1&0&0&0\\
        0&1&0&0&0&1&0&0&1&0&1&1&0&1&0&0\\
        0&0&1&0&0&0&1&0&1&1&0&1&0&0&1&0\\
        0&0&0&1&0&0&0&1&1&1&1&0&0&0&0&1\\
        1&0&0&0&1&0&0&0&1&0&0&0&0&1&1&1\\
        0&1&0&0&0&1&0&0&0&1&0&0&1&0&1&1\\
        0&0&1&0&0&0&1&0&0&0&1&0&1&1&0&1\\
        0&0&0&1&0&0&0&1&0&0&0&1&1&1&1&0
        \end{bmatrix}.
        $$

    - **Matriz de incidência da torre 4x4:**
      - A matriz $M$ tem dimensão $16\times48$.
      - Ordene as arestas como todos os pares de casas na mesma linha (linha 1, depois 2, 3, 4) e, em seguida, todos os pares de casas na mesma coluna (coluna 1, depois 2, 3, 4), respeitando a ordem lexicográfica dos vértices.
      - Em cada coluna de $M$, coloque 1 nas duas linhas dos extremos da aresta e 0 nas demais.

    - **Número de arestas no caso geral $t\times t$:**
      - Em cada linha há $\binom{t}{2}$ arestas e existem $t$ linhas.
      - Em cada coluna há $\binom{t}{2}$ arestas e existem $t$ colunas.
      - Total:
        $$|E|=t\binom{t}{2}+t\binom{t}{2}=t^2(t-1).$$

    - **Para $t=8$:**
      $$|E|=8^2\cdot7=448.$$

  - **Feedback didático:** Para a torre, a contagem por linhas e colunas é direta e sem sobreposição. Essa decomposição produz a fórmula geral de forma limpa.

[Voltar ao sumário](#sumario)

<a id="q63"></a>
## Resposta da Questão 63

- **Questão 63:** **(Feofiloff, 2013)** O grafo do rei $t$-por-$t$ é definido assim: os vértices são as casas de um tabuleiro de xadrez com $t$ linhas e $t$ colunas; dois vértices são adjacentes se um rei pode saltar de um deles para o outro em um só movimento. Faça uma figura do grafo do rei 4-por-4. Escreva as matrizes de adjacência e incidência desse grafo. Quantas arestas tem o grafo do rei 8-por-8? Quantas arestas tem o grafo do rei $t$-por-$t$? (ETG: 1.12).

  - **Resposta:**
    - **Matriz 8x8 (um movimento do rei):** casa do rei em `(4,4)` (●) e casas alcançáveis em um lance marcadas com `x`.
      (linhas = primeira coordenada `i`, colunas = segunda coordenada `j`).

      | i\j | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 |
      |---|---|---|---|---|---|---|---|---|
      | 1 | . | . | . | . | . | . | . | . |
      | 2 | . | . | . | . | . | . | . | . |
      | 3 | . | . | x | x | x | . | . | . |
      | 4 | . | . | x | ● | x | . | . | . |
      | 5 | . | . | x | x | x | . | . | . |
      | 6 | . | . | . | . | . | . | . | . |
      | 7 | . | . | . | . | . | . | . | . |
      | 8 | . | . | . | . | . | . | . | . |

    - **Grafo (Mermaid) 4x4:** vértices são as casas $(i,j)$ e as arestas abaixo representam adjacência por um passo horizontal, vertical ou diagonal (movimento de rei em um lance).
      Observação: o grafo do rei é conexo.

    ```mermaid
    graph LR
      a11((1,1)) --- a12((1,2))
      a12 --- a13((1,3))
      a13 --- a14((1,4))
      a21((2,1)) --- a22((2,2))
      a22 --- a23((2,3))
      a23 --- a24((2,4))
      a31((3,1)) --- a32((3,2))
      a32 --- a33((3,3))
      a33 --- a34((3,4))
      a41((4,1)) --- a42((4,2))
      a42 --- a43((4,3))
      a43 --- a44((4,4))

      a11 --- a21
      a21 --- a31
      a31 --- a41
      a12 --- a22
      a22 --- a32
      a32 --- a42
      a13 --- a23
      a23 --- a33
      a33 --- a43
      a14 --- a24
      a24 --- a34
      a34 --- a44

      a11 --- a22
      a12 --- a21
      a12 --- a23
      a13 --- a22
      a13 --- a24
      a14 --- a23
      a21 --- a32
      a22 --- a31
      a22 --- a33
      a23 --- a32
      a23 --- a34
      a24 --- a33
      a31 --- a42
      a32 --- a41
      a32 --- a43
      a33 --- a42
      a33 --- a44
      a34 --- a43
    ```

    - **Matriz de adjacência do rei 4x4:**
      - Ordem dos vértices:
        $$v_1=(1,1),\ v_2=(1,2),\ v_3=(1,3),\ v_4=(1,4),\ v_5=(2,1),\ v_6=(2,2),\ v_7=(2,3),\ v_8=(2,4),$$
        $$v_9=(3,1),\ v_{10}=(3,2),\ v_{11}=(3,3),\ v_{12}=(3,4),\ v_{13}=(4,1),\ v_{14}=(4,2),\ v_{15}=(4,3),\ v_{16}=(4,4).$$
      - Matriz $A$:
        $$
        \begin{bmatrix}
        0&1&0&0&1&1&0&0&0&0&0&0&0&0&0&0\\
        1&0&1&0&1&1&1&0&0&0&0&0&0&0&0&0\\
        0&1&0&1&0&1&1&1&0&0&0&0&0&0&0&0\\
        0&0&1&0&0&0&1&1&0&0&0&0&0&0&0&0\\
        1&1&0&0&0&1&0&0&1&1&0&0&0&0&0&0\\
        1&1&1&0&1&0&1&0&1&1&1&0&0&0&0&0\\
        0&1&1&1&0&1&0&1&0&1&1&1&0&0&0&0\\
        0&0&1&1&0&0&1&0&0&0&1&1&0&0&0&0\\
        0&0&0&0&1&1&0&0&0&1&0&0&1&1&0&0\\
        0&0&0&0&1&1&1&0&1&0&1&0&1&1&1&0\\
        0&0&0&0&0&1&1&1&0&1&0&1&0&1&1&1\\
        0&0&0&0&0&0&1&1&0&0&1&0&0&0&1&1\\
        0&0&0&0&0&0&0&0&1&1&0&0&0&1&0&0\\
        0&0&0&0&0&0&0&0&1&1&1&0&1&0&1&0\\
        0&0&0&0&0&0&0&0&0&1&1&1&0&1&0&1\\
        0&0&0&0&0&0&0&0&0&0&1&1&0&0&1&0
        \end{bmatrix}.
        $$

    - **Matriz de incidência do rei 4x4:**
      - A matriz $M$ tem dimensão $16\times42$.
      - Ordene as arestas como todos os pares de vértices adjacentes (na ordem lexicográfica dos vértices), conectando apenas casas com distância de Chebyshev 1.
      - Em cada coluna de $M$, coloque 1 nas duas linhas dos extremos da aresta e 0 nas demais.

    - **Número de arestas no caso geral $t\times t$:**
      - Arestas horizontais: $t(t-1)$.
      - Arestas verticais: $t(t-1)$.
      - Diagonais (duas direções): $2(t-1)^2$.
      - Total:
        $$|E|=2t(t-1)+2(t-1)^2=2(t-1)(2t-1).$$

    - **Para $t=8$:**
      $$|E|=2\cdot7\cdot15=210.$$

  - **Feedback didático:** Para o rei, decompor em horizontal, vertical e diagonais locais evita erro de contagem. Essa decomposição já entrega a fórmula geral diretamente.

[Voltar ao sumário](#sumario)

<a id="q64"></a>
## Resposta da Questão 64

- **Questão 64:** **(Feofiloff, 2013)** O grafo das palavras é definido assim: cada vértice é uma palavra da língua portuguesa e duas palavras são adjacentes se diferem em exatamente uma posição. Por exemplo, rato e ralo são adjacentes, enquanto ralo e rota não são. Faça uma figura da parte do grafo definida pelas palavras `caiado, cavado, cavalo, girafa, girava, ralo, ramo, rata, rato, remo, reta, reto, rota, vaiado, varado, virada, virado, virava.` Escreva as matrizes de adjacência e incidência do grafo. (ETG: 1.13).

  - **Resposta:**
    - Ordem dos vértices:
      $$\begin{aligned}
      &v_1=\text{caiado},\ v_2=\text{cavado},\ v_3=\text{cavalo},\ v_4=\text{girafa},\ v_5=\text{girava},\\
      &v_6=\text{ralo},\ v_7=\text{ramo},\ v_8=\text{rata},\ v_9=\text{rato},\ v_{10}=\text{remo},\\
      &v_{11}=\text{reta},\ v_{12}=\text{reto},\ v_{13}=\text{rota},\ v_{14}=\text{vaiado},\\
      &v_{15}=\text{varado},\ v_{16}=\text{virada},\ v_{17}=\text{virado},\ v_{18}=\text{virava}.
      \end{aligned}$$

    - **Figura do grafo (componentes de 6 letras e 4 letras):**

    ```mermaid
    graph LR
      subgraph C6[Palavras de 6 letras]
        caiado --- cavado
        cavado --- cavalo
        caiado --- vaiado
        vaiado --- varado
        varado --- virado
        virado --- virada
        virada --- virava
        virava --- girava
        girava --- girafa
      end

      subgraph C4[Palavras de 4 letras]
        ralo --- ramo
        ralo --- rato
        ramo --- rato
        ramo --- remo
        rata --- rato
        rata --- reta
        rata --- rota
        rato --- reto
        remo --- reto
        reta --- reto
        reta --- rota
      end
    ```

    - **Matriz de adjacência $A$ (ordem $v_1,\dots,v_{18}$):**
      $$
      A=
      \begin{bmatrix}
      0&1&0&0&0&0&0&0&0&0&0&0&0&1&0&0&0&0\\
      1&0&1&0&0&0&0&0&0&0&0&0&0&0&0&0&0&0\\
      0&1&0&0&0&0&0&0&0&0&0&0&0&0&0&0&0&0\\
      0&0&0&0&1&0&0&0&0&0&0&0&0&0&0&0&0&0\\
      0&0&0&1&0&0&0&0&0&0&0&0&0&0&0&0&0&1\\
      0&0&0&0&0&0&1&0&1&0&0&0&0&0&0&0&0&0\\
      0&0&0&0&0&1&0&0&1&1&0&0&0&0&0&0&0&0\\
      0&0&0&0&0&0&0&0&1&0&1&0&1&0&0&0&0&0\\
      0&0&0&0&0&1&1&1&0&0&0&1&0&0&0&0&0&0\\
      0&0&0&0&0&0&1&0&0&0&0&1&0&0&0&0&0&0\\
      0&0&0&0&0&0&0&1&0&0&0&1&1&0&0&0&0&0\\
      0&0&0&0&0&0&0&0&1&1&1&0&0&0&0&0&0&0\\
      0&0&0&0&0&0&0&1&0&0&1&0&0&0&0&0&0&0\\
      1&0&0&0&0&0&0&0&0&0&0&0&0&0&1&0&0&0\\
      0&0&0&0&0&0&0&0&0&0&0&0&0&1&0&0&1&0\\
      0&0&0&0&0&0&0&0&0&0&0&0&0&0&0&0&1&1\\
      0&0&0&0&0&0&0&0&0&0&0&0&0&0&1&1&0&0\\
      0&0&0&0&1&0&0&0&0&0&0&0&0&0&0&1&0&0
      \end{bmatrix}.
      $$

    - **Matriz de incidência $M$ (ordem de arestas):**
      $$\begin{aligned}
      &e_1=v_1v_2,\ e_2=v_1v_{14},\ e_3=v_2v_3,\ e_4=v_4v_5,\ e_5=v_5v_{18},\\
      &e_6=v_6v_7,\ e_7=v_6v_9,\ e_8=v_7v_9,\ e_9=v_7v_{10},\ e_{10}=v_8v_9,\\
      &e_{11}=v_8v_{11},\ e_{12}=v_8v_{13},\ e_{13}=v_9v_{12},\ e_{14}=v_{10}v_{12},\\
      &e_{15}=v_{11}v_{12},\ e_{16}=v_{11}v_{13},\ e_{17}=v_{14}v_{15},\\
      &e_{18}=v_{15}v_{17},\ e_{19}=v_{16}v_{17},\ e_{20}=v_{16}v_{18}.
      \end{aligned}$$

      $$
      M=
      \begin{array}{c|cccccccccccccccccccc}
           &e_1&e_2&e_3&e_4&e_5&e_6&e_7&e_8&e_9&e_{10}&e_{11}&e_{12}&e_{13}&e_{14}&e_{15}&e_{16}&e_{17}&e_{18}&e_{19}&e_{20} \\\hline
      v_1   &1&1&0&0&0&0&0&0&0&0&0&0&0&0&0&0&0&0&0&0\\
      v_2   &1&0&1&0&0&0&0&0&0&0&0&0&0&0&0&0&0&0&0&0\\
      v_3   &0&0&1&0&0&0&0&0&0&0&0&0&0&0&0&0&0&0&0&0\\
      v_4   &0&0&0&1&0&0&0&0&0&0&0&0&0&0&0&0&0&0&0&0\\
      v_5   &0&0&0&1&1&0&0&0&0&0&0&0&0&0&0&0&0&0&0&0\\
      v_6   &0&0&0&0&0&1&1&0&0&0&0&0&0&0&0&0&0&0&0&0\\
      v_7   &0&0&0&0&0&1&0&1&1&0&0&0&0&0&0&0&0&0&0&0\\
      v_8   &0&0&0&0&0&0&0&0&0&1&1&1&0&0&0&0&0&0&0&0\\
      v_9   &0&0&0&0&0&0&1&1&0&1&0&0&1&0&0&0&0&0&0&0\\
      v_{10}&0&0&0&0&0&0&0&0&1&0&0&0&0&1&0&0&0&0&0&0\\
      v_{11}&0&0&0&0&0&0&0&0&0&0&1&0&0&0&1&1&0&0&0&0\\
      v_{12}&0&0&0&0&0&0&0&0&0&0&0&0&1&1&1&0&0&0&0&0\\
      v_{13}&0&0&0&0&0&0&0&0&0&0&0&1&0&0&0&1&0&0&0&0\\
      v_{14}&0&1&0&0&0&0&0&0&0&0&0&0&0&0&0&0&1&0&0&0\\
      v_{15}&0&0&0&0&0&0&0&0&0&0&0&0&0&0&0&0&1&1&0&0\\
      v_{16}&0&0&0&0&0&0&0&0&0&0&0&0&0&0&0&0&0&0&1&1\\
      v_{17}&0&0&0&0&0&0&0&0&0&0&0&0&0&0&0&0&0&1&1&0\\
      v_{18}&0&0&0&0&1&0&0&0&0&0&0&0&0&0&0&0&0&0&0&1
      \end{array}.
      $$

  - **Feedback didático:** O critério “difere em exatamente uma posição” é distância de Hamming 1, então só palavras com o mesmo tamanho podem ser adjacentes. Isso explica naturalmente as duas componentes do grafo.

[Voltar ao sumário](#sumario)

<a id="q65"></a>
## Resposta da Questão 65

- **Questão 65:** **(Feofiloff, 2013)** Para qualquer inteiro positivo $k$, um cubo de dimensão $k$ (ou $k$-cubo) é o grafo definido da seguinte maneira: os vértices são todas as sequências de $k$ bits; dois vértices são adjacentes se e somente se diferem em exatamente uma posição. Faça figuras dos cubos $Q_1$, $Q_2$ e $Q_3$. Escreva as matrizes de adjacência e incidência de $Q_3$. Quantos vértices tem $Q_k$? Quantas arestas tem $Q_k$? (ETG: 1.14).

  - **Resposta:**
    - **$Q_1$** (2 vértices, 1 aresta):
    ```mermaid
    graph LR
      a0((0)) --- a1((1))
    ```

    - **$Q_2$** (4 vértices, ciclo):
    ```mermaid
    graph LR
      b00((00)) --- b01((01))
      b01 --- b11((11))
      b11 --- b10((10))
      b10 --- b00
    ```

    - **$Q_3$** (8 vértices):
    ```mermaid
    graph LR
      c000((000)) --- c001((001))
      c001 --- c011((011))
      c011 --- c010((010))
      c010 --- c000

      c100((100)) --- c101((101))
      c101 --- c111((111))
      c111 --- c110((110))
      c110 --- c100

      c000 --- c100
      c001 --- c101
      c010 --- c110
      c011 --- c111
    ```

    - Para as matrizes de $Q_3$, adote a ordem de vértices:
      $$v_1=000,\ v_2=001,\ v_3=010,\ v_4=011,\ v_5=100,\ v_6=101,\ v_7=110,\ v_8=111.$$

    - **Matriz de adjacência de $Q_3$:**
      $$
      A=
      \begin{bmatrix}
      0&1&1&0&1&0&0&0\\
      1&0&0&1&0&1&0&0\\
      1&0&0&1&0&0&1&0\\
      0&1&1&0&0&0&0&1\\
      1&0&0&0&0&1&1&0\\
      0&1&0&0&1&0&0&1\\
      0&0&1&0&1&0&0&1\\
      0&0&0&1&0&1&1&0
      \end{bmatrix}.
      $$

    - **Matriz de incidência de $Q_3$:**
      - Ordem das arestas:
        $$\begin{aligned}
        &e_1=000\text{-}001,\ e_2=000\text{-}010,\ e_3=000\text{-}100,\ e_4=001\text{-}011,\\
        &e_5=001\text{-}101,\ e_6=010\text{-}011,\ e_7=010\text{-}110,\ e_8=011\text{-}111,\\
        &e_9=100\text{-}101,\ e_{10}=100\text{-}110,\ e_{11}=101\text{-}111,\ e_{12}=110\text{-}111.
        \end{aligned}$$
      $$
      M=
      \begin{array}{c|cccccccccccc}
           &e_1&e_2&e_3&e_4&e_5&e_6&e_7&e_8&e_9&e_{10}&e_{11}&e_{12} \\\hline
      v_1  &1&1&1&0&0&0&0&0&0&0&0&0\\
      v_2  &1&0&0&1&1&0&0&0&0&0&0&0\\
      v_3  &0&1&0&0&0&1&1&0&0&0&0&0\\
      v_4  &0&0&0&1&0&1&0&1&0&0&0&0\\
      v_5  &0&0&1&0&0&0&0&0&1&1&0&0\\
      v_6  &0&0&0&0&1&0&0&0&1&0&1&0\\
      v_7  &0&0&0&0&0&0&1&0&0&1&0&1\\
      v_8  &0&0&0&0&0&0&0&1&0&0&1&1
      \end{array}.
      $$

    - **Número de vértices de $Q_k$:**
      $$|V(Q_k)|=2^k.$$

    - **Número de arestas de $Q_k$:**
      - Cada vértice tem grau $k$ (pode trocar qualquer 1 das $k$ posições).
      - Pelo lema do aperto de mão:
        $$2|E|=k\cdot 2^k\ \Rightarrow\ |E(Q_k)|=k2^{k-1}.$$

  - **Feedback didático:** Em hipercubos, pense em bits: vértice = string binária, aresta = troca de um único bit. Essa leitura torna imediatos o grau, o número de vértices e o número de arestas.

[Voltar ao sumário](#sumario)

<a id="q66"></a>
## Resposta da Questão 66

- **Questão 66:** **(Feofiloff, 2013)** Seja $X=\{1,2,3,4,5\}$ e $V=X^{(2)}$ (o conjunto de todos os subconjuntos de $X$ com exatamente 2 elementos). Digamos que dois elementos $v$ e $w$ de $V$ são adjacentes se $v\cap w=\emptyset$. Essa relação define o grafo de Petersen. Faça uma figura do grafo. Escreva as matrizes de adjacência e incidência do grafo. Quantos vértices e quantas arestas tem o grafo? (ETG: 1.15).

  - **Resposta:**
    - Vértices (ordem):
      $$v_1=12,\ v_2=13,\ v_3=14,\ v_4=15,\ v_5=23,\ v_6=24,\ v_7=25,\ v_8=34,\ v_9=35,\ v_{10}=45.$$ 

    - **Figura (Petersen):**
    ```mermaid
    graph LR
      a12((12)) --- a34((34))
      a12 --- a35((35))
      a12 --- a45((45))

      a13((13)) --- a24((24))
      a13 --- a25((25))
      a13 --- a45

      a14((14)) --- a23((23))
      a14 --- a25
      a14 --- a35

      a15((15)) --- a23
      a15 --- a24
      a15 --- a34

      a23 --- a45
      a24 --- a35
      a25 --- a34
    ```

    - **Matriz de adjacência** (na ordem $v_1,\dots,v_{10}$):
      $$
      A=
      \begin{bmatrix}
      0&0&0&0&0&0&0&1&1&1\\
      0&0&0&0&0&1&1&0&0&1\\
      0&0&0&0&1&0&1&0&1&0\\
      0&0&0&0&1&1&0&1&0&0\\
      0&0&1&1&0&0&0&0&0&1\\
      0&1&0&1&0&0&0&0&1&0\\
      0&1&1&0&0&0&0&1&0&0\\
      1&0&0&1&0&0&1&0&0&0\\
      1&0&1&0&0&1&0&0&0&0\\
      1&1&0&0&1&0&0&0&0&0
      \end{bmatrix}.
      $$

    - **Matriz de incidência:**
      - Ordem das arestas:
        $$\begin{aligned}
        &e_1=12\text{-}34,\ e_2=12\text{-}35,\ e_3=12\text{-}45,\ e_4=13\text{-}24,\ e_5=13\text{-}25,\ e_6=13\text{-}45,\\
        &e_7=14\text{-}23,\ e_8=14\text{-}25,\ e_9=14\text{-}35,\ e_{10}=15\text{-}23,\ e_{11}=15\text{-}24,\ e_{12}=15\text{-}34,\\
        &e_{13}=23\text{-}45,\ e_{14}=24\text{-}35,\ e_{15}=25\text{-}34.
        \end{aligned}$$
      $$
      M=
      \begin{array}{c|ccccccccccccccc}
           &e_1&e_2&e_3&e_4&e_5&e_6&e_7&e_8&e_9&e_{10}&e_{11}&e_{12}&e_{13}&e_{14}&e_{15} \\\hline
      v_1   &1&1&1&0&0&0&0&0&0&0&0&0&0&0&0\\
      v_2   &0&0&0&1&1&1&0&0&0&0&0&0&0&0&0\\
      v_3   &0&0&0&0&0&0&1&1&1&0&0&0&0&0&0\\
      v_4   &0&0&0&0&0&0&0&0&0&1&1&1&0&0&0\\
      v_5   &0&0&0&0&0&0&1&0&0&1&0&0&1&0&0\\
      v_6   &0&0&0&1&0&0&0&0&0&0&1&0&0&1&0\\
      v_7   &0&0&0&0&1&0&0&1&0&0&0&0&0&0&1\\
      v_8   &1&0&0&0&0&0&0&0&0&0&0&1&0&0&1\\
      v_9   &0&1&0&0&0&0&0&0&1&0&0&0&0&1&0\\
      v_{10}&0&0&1&0&0&1&0&0&0&0&0&0&1&0&0
      \end{array}.
      $$

    - **Número de vértices e arestas:**
      $$|V|=\binom{5}{2}=10,\qquad |E|=15.$$
      (equivalentemente: grafo 3-regular, então $|E|=10\cdot3/2=15$.)

  - **Feedback didático:** Em grafos de Kneser/Petersen, o passo-chave é traduzir “adjacência” para “disjunção de conjuntos”. A contagem de grau e arestas sai naturalmente dessa interpretação.

[Voltar ao sumário](#sumario)

<a id="q67"></a>
## Resposta da Questão 67

- **Questão 67:** **(Feofiloff, 2013)** Seja $V$ o conjunto de todos os subconjuntos de $\{1,2,\ldots,n\}$ que têm exatamente $k$ elementos, sendo $k\leq n/2$. Digamos que dois elementos $v$ e $w$ de $V$ são adjacentes se $v\cap w=\emptyset$. Essa relação define o grafo de Kneser $K(n,k)$. Em particular, $K(5,2)$ é o grafo de Petersen. Faça figuras de $K(n,1)$, $K(n,n)$, $K(n,n-1)$, $K(4,2)$, $K(5,3)$, $K(6,2)$ e $K(6,3)$. (ETG: 1.16).

  - **Resposta:**
    - **$K(n,1)$:** vértices são singletons e dois singletons são sempre disjuntos.
      Logo, $K(n,1)\cong K_n$.

    - **$K(n,n)$:** há apenas um vértice (o conjunto total), então é $K_1$ (sem arestas).

    - **$K(n,n-1)$:** vértices são os $n$ subconjuntos com $n-1$ elementos. Dois deles sempre se intersectam em $n-2$ elementos, então não há arestas. É um grafo vazio com $n$ vértices.

    - **$K(4,2)$:** vértices $\binom42=6$. Cada 2-subconjunto tem exatamente um disjunto, então é um emparelhamento perfeito com 3 arestas.

    ```mermaid
    graph LR
      a12((12)) --- a34((34))
      a13((13)) --- a24((24))
      a14((14)) --- a23((23))
    ```

    - **$K(5,3)$:** dois 3-subconjuntos de $\{1,2,3,4,5\}$ nunca são disjuntos (3+3>5). Então é grafo vazio com $\binom53=10$ vértices.

    - **$K(6,2)$:**
      $$|V|=\binom62=15,\quad \deg=\binom{4}{2}=6,\quad |E|=\frac{15\cdot6}{2}=45.$$

    - **$K(6,3)$:**
      $$|V|=\binom63=20,\quad \deg=\binom{3}{3}=1,\quad |E|=\frac{20\cdot1}{2}=10.$$
      Portanto, é um emparelhamento perfeito com 10 arestas.

  - **Feedback didático:** Para cada $K(n,k)$, use três perguntas rápidas: quantos vértices ($\binom nk$), qual o grau ($\binom{n-k}{k}$) e se a disjunção é possível (comparando $2k$ com $n$). Isso resolve quase todos os casos especiais.

[Voltar ao sumário](#sumario)

<a id="q68"></a>
## Resposta da Questão 68

- **Questão 68:** **(Feofiloff, 2013)** O grafo dos estados do Brasil é definido assim: cada vértice é um dos estados da República Federativa do Brasil; dois estados são adjacentes se têm uma fronteira comum. Faça um desenho do grafo. Quantos vértices tem o grafo? Quantas arestas? (ETG: 1.17).

  - **Resposta:**
    - **Vértices:** 27 (26 estados + Distrito Federal).
    - **Arestas:** 46 (considerando fronteiras terrestres entre unidades da federação, convenção usual em grafos do mapa do Brasil).

    - **Desenho (esboço didático por regiões, não geográfico):**
    ```mermaid
    graph LR
      N[Norte] --- NE[Nordeste]
      N --- CO[Centro-Oeste]
      NE --- CO
      NE --- SE[Sudeste]
      CO --- SE
      CO --- S[Sul]
      SE --- S
    ```

    - Para o grafo completo dos 27 vértices, cada estado deve ser um nó e cada fronteira estadual uma aresta.

  - **Feedback didático:** Em grafos geográficos, o principal é fixar a regra de adjacência (fronteira terrestre comum) antes de contar arestas. Isso evita divergências de convenção.

[Voltar ao sumário](#sumario)

<a id="q69"></a>
## Resposta da Questão 69

- **Questão 69:** **(Feofiloff, 2013)** Considere as grandes cidades e as grandes estradas do estado de São Paulo. Digamos que uma cidade é grande se tem pelo menos 300 mil habitantes. Digamos que uma estrada é grande se tiver pista dupla (como a SP300, por exemplo). Digamos que duas grandes cidades são adjacentes se uma grande estrada ou uma concatenação de grandes estradas liga as duas cidades diretamente (isto é, sem passar por uma terceira grande cidade). Faça uma figura do grafo das grandes cidades definido por essa relação de adjacência. (ETG: 1.18).

  - **Resposta:**
    - Esta questão é **construtiva** e depende da base adotada (ano da população e malha rodoviária de pista dupla).
    - Procedimento correto:
      1. Liste as cidades paulistas com população $\ge 300\,000$.
      2. Considere apenas estradas de pista dupla entre elas.
      3. Ligue duas cidades quando houver caminho de pista dupla entre elas sem passar por terceira cidade da lista.

    - **Exemplo de figura (ilustrativa):**
    ```mermaid
    graph LR
      SP[São Paulo] --- SA[Santos]
      SP --- CP[Campinas]
      SP --- SJC[São José dos Campos]
      SP --- SO[Sorocaba]
      CP --- PI[Piracicaba]
      CP --- BR[Bauru]
      CP --- RP[Ribeirão Preto]
      RP --- SJRP[São José do Rio Preto]
      BR --- SJRP
    ```

    - O grafo final da atividade deve ser ajustado com a lista/ano de cidades e a malha viária efetivamente adotados na disciplina.

  - **Feedback didático:** Em modelagem de redes reais, a qualidade da resposta depende mais da definição operacional dos dados do que do desenho em si. Declare sempre os critérios antes de construir o grafo.

[Voltar ao sumário](#sumario)

<a id="q70"></a>
## Resposta da Questão 70

- **Questão 70:** **(Feofiloff, 2013)** Seja $V$ um conjunto de pontos no plano. Digamos que dois desses pontos são adjacentes se a distância entre eles é menor que 2. Essa relação de adjacência define o grafo dos pontos no plano (sobre o conjunto $V$). Faça uma figura do grafo definido pelos pontos abaixo. Escreva as matrizes de adjacência e incidência do grafo. (ETG: 1.19).

  - **Resposta:**
    - A figura do enunciado representa os 9 pontos da grade:
      $$V=\{(0,0),(1,0),(2,0),(0,1),(1,1),(2,1),(0,2),(1,2),(2,2)\}.$$
    - Regra: ligar dois pontos quando a distância euclidiana for $<2$.

    - **Figura do grafo:**
    ```mermaid
    graph LR
      p00((0,0)) --- p10((1,0)) --- p20((2,0))
      p01((0,1)) --- p11((1,1)) --- p21((2,1))
      p02((0,2)) --- p12((1,2)) --- p22((2,2))

      p00 --- p01 --- p02
      p10 --- p11 --- p12
      p20 --- p21 --- p22

      p00 --- p11
      p10 --- p01
      p10 --- p21
      p20 --- p11
      p01 --- p12
      p11 --- p02
      p11 --- p22
      p21 --- p12
    ```

    - Ordem dos vértices para as matrizes:
      $$v_1=(0,0),\ v_2=(1,0),\ v_3=(2,0),\ v_4=(0,1),\ v_5=(1,1),\ v_6=(2,1),\ v_7=(0,2),\ v_8=(1,2),\ v_9=(2,2).$$

    - **Matriz de adjacência:**
      $$
      A=
      \begin{bmatrix}
      0&1&0&1&1&0&0&0&0\\
      1&0&1&1&1&1&0&0&0\\
      0&1&0&0&1&1&0&0&0\\
      1&1&0&0&1&0&1&1&0\\
      1&1&1&1&0&1&1&1&1\\
      0&1&1&0&1&0&0&1&1\\
      0&0&0&1&1&0&0&1&0\\
      0&0&0&1&1&1&1&0&1\\
      0&0&0&0&1&1&0&1&0
      \end{bmatrix}.
      $$

    - **Matriz de incidência:**
      - Ordem das arestas:
        $$\begin{aligned}
        &e_1=v_1v_2,\ e_2=v_1v_4,\ e_3=v_1v_5,\ e_4=v_2v_3,\ e_5=v_2v_4,\ e_6=v_2v_5,\ e_7=v_2v_6,\\
        &e_8=v_3v_5,\ e_9=v_3v_6,\ e_{10}=v_4v_5,\ e_{11}=v_4v_7,\ e_{12}=v_4v_8,\\
        &e_{13}=v_5v_6,\ e_{14}=v_5v_7,\ e_{15}=v_5v_8,\ e_{16}=v_5v_9,\ e_{17}=v_6v_8,\ e_{18}=v_6v_9,\\
        &e_{19}=v_7v_8,\ e_{20}=v_8v_9.
        \end{aligned}$$
      $$
      M=
      \begin{array}{c|cccccccccccccccccccc}
           &e_1&e_2&e_3&e_4&e_5&e_6&e_7&e_8&e_9&e_{10}&e_{11}&e_{12}&e_{13}&e_{14}&e_{15}&e_{16}&e_{17}&e_{18}&e_{19}&e_{20} \\\hline
      v_1 &1&1&1&0&0&0&0&0&0&0&0&0&0&0&0&0&0&0&0&0\\
      v_2 &1&0&0&1&1&1&1&0&0&0&0&0&0&0&0&0&0&0&0&0\\
      v_3 &0&0&0&1&0&0&0&1&1&0&0&0&0&0&0&0&0&0&0&0\\
      v_4 &0&1&0&0&1&0&0&0&0&1&1&1&0&0&0&0&0&0&0&0\\
      v_5 &0&0&1&0&0&1&0&1&0&1&0&0&1&1&1&1&0&0&0&0\\
      v_6 &0&0&0&0&0&0&1&0&1&0&0&0&1&0&0&0&1&1&0&0\\
      v_7 &0&0&0&0&0&0&0&0&0&0&1&0&0&1&0&0&0&0&1&0\\
      v_8 &0&0&0&0&0&0&0&0&0&0&0&1&0&0&1&0&1&0&1&1\\
      v_9 &0&0&0&0&0&0&0&0&0&0&0&0&0&0&0&1&0&1&0&1
      \end{array}.
      $$

  - **Feedback didático:** Como o limiar é “distância < 2”, entram arestas de distância 1 e $\sqrt2$, mas não entram distâncias iguais a 2. Esse detalhe decide corretamente as diagonais locais.

[Voltar ao sumário](#sumario)

<a id="q71"></a>
## Resposta da Questão 71

- **Questão 71:** **(Feofiloff, 2013)** Dado um conjunto $V$, seja $E$ o conjunto definido da seguinte maneira: para cada par não ordenado de elementos de $V$, jogue uma moeda; se o resultado for cara, acrescente o par a $E$. O grafo $(V,E)$ assim definido é aleatório. Pegue sua moeda favorita e faça uma figura do grafo aleatório com vértices $1,\ldots,6$. Agora repita o exercício com uma moeda viciada que dá cara com probabilidade $1/3$ e coroa com probabilidade $2/3$. (ETG: 1.20).

  - **Resposta:**
    - Não existe resposta única; qualquer realização válida serve.
    - Exemplo de realização com moeda justa ($p=1/2$):
      $$E=\{12,14,16,23,35,45\}.$$

    ```mermaid
    graph LR
      v1((1)) --- v2((2))
      v1 --- v4((4))
      v1 --- v6((6))
      v2 --- v3((3))
      v3 --- v5((5))
      v4 --- v5
    ```

    - Exemplo de realização com moeda viciada ($p=1/3$):
      $$E=\{13,24,46\}.$$

    ```mermaid
    graph LR
      a1((1)) --- a3((3))
      a2((2)) --- a4((4))
      a4 --- a6((6))
      a5((5))
    ```

  - **Feedback didático:** O objetivo é registrar corretamente o procedimento aleatório e uma amostra coerente. Como o modelo é probabilístico, grafos diferentes podem estar todos corretos.

[Voltar ao sumário](#sumario)

<a id="q72"></a>
## Resposta da Questão 72

- **Questão 72:** **(Feofiloff, 2013)** Seja $S$ uma matriz quadrada de números inteiros. Suponha que as linhas de $S$ são indexadas por um conjunto $V$ e que as colunas são indexadas pelo mesmo conjunto $V$. O grafo da matriz $S$ é definido da seguinte maneira: o conjunto de vértices do grafo é $V$ e dois vértices $i$ e $j$ são adjacentes se $S[i,j]\neq 0$. O grafo de $S$ está bem definido? Que condições é preciso impor sobre a matriz para que o grafo esteja bem definido? (ETG: 1.21).

  - **Resposta:**
    - Do jeito que está, a regra define naturalmente um **dígrafo** (pois pode ocorrer $S[i,j]\neq0$ e $S[j,i]=0$).
    - Para definir um **grafo não orientado simples** de forma bem definida, imponha:
      1. **Simetria:** $S[i,j]=S[j,i]$ para todos $i,j$.
      2. **Diagonal nula:** $S[i,i]=0$ para todo $i$ (sem loop).
    - Como a adjacência só usa “$\neq0$”, os valores podem ser quaisquer inteiros; apenas o padrão de zeros e não zeros importa.

    - **Exemplo:**
      - Matriz que **não** define grafo simples não orientado:
        $$
        S_1=
        \begin{bmatrix}
        0&2&0\\
        0&0&5\\
        1&0&0
        \end{bmatrix}
        $$
        (não é simétrica; gera dígrafo).
      - Matriz que define grafo simples não orientado:
        $$
        S_2=
        \begin{bmatrix}
        0&2&0\\
        2&0&5\\
        0&5&0
        \end{bmatrix}
        $$
        (simétrica e diagonal zero; grafo com arestas $12$ e $23$).

  - **Feedback didático:** Primeiro decida qual classe de grafo você quer modelar (dígrafo, simples, com loops). As condições da matriz vêm diretamente dessa escolha estrutural.

[Voltar ao sumário](#sumario)

<a id="q73"></a>
## Resposta da Questão 73

- **Questão 73:** **(Feofiloff, 2013)** Suponha dados $k$ intervalos de comprimento finito, digamos $I_1,I_2,\ldots,I_k$, na reta real. Digamos que dois intervalos $I_i$ e $I_j$ são adjacentes se $I_i\cap I_j\neq\emptyset$. Essa relação define um grafo de intervalos com conjunto de vértices $\{I_1,I_2,\ldots,I_k\}$. Faça uma figura do grafo definido pelos intervalos $[0,2]$, $[1,4]$, $[3,6]$, $[5,6]$ e $[1,6]$. Escreva as matrizes de adjacência e incidência do grafo. (ETG: 1.22).

  - **Resposta:**
    - Seja
      $$I_1=[0,2],\ I_2=[1,4],\ I_3=[3,6],\ I_4=[5,6],\ I_5=[1,6].$$
    - Interseções não vazias geram as arestas:
      $$E=\{I_1I_2,\ I_1I_5,\ I_2I_3,\ I_2I_5,\ I_3I_4,\ I_3I_5,\ I_4I_5\}.$$

    - **Figura do grafo:**
    ```mermaid
    graph LR
      I1((I1)) --- I2((I2))
      I1 --- I5((I5))
      I2 --- I3((I3))
      I2 --- I5
      I3 --- I4((I4))
      I3 --- I5
      I4 --- I5
    ```

    - **Matriz de adjacência** (ordem $I_1,\dots,I_5$):
      $$
      A=
      \begin{bmatrix}
      0&1&0&0&1\\
      1&0&1&0&1\\
      0&1&0&1&1\\
      0&0&1&0&1\\
      1&1&1&1&0
      \end{bmatrix}.
      $$

    - **Matriz de incidência:**
      - Ordem das arestas:
        $$e_1=I_1I_2,\ e_2=I_1I_5,\ e_3=I_2I_3,\ e_4=I_2I_5,\ e_5=I_3I_4,\ e_6=I_3I_5,\ e_7=I_4I_5.$$
      $$
      M=
      \begin{array}{c|ccccccc}
           &e_1&e_2&e_3&e_4&e_5&e_6&e_7 \\\hline
      I_1  &1&1&0&0&0&0&0\\
      I_2  &1&0&1&1&0&0&0\\
      I_3  &0&0&1&0&1&1&0\\
      I_4  &0&0&0&0&1&0&1\\
      I_5  &0&1&0&1&0&1&1
      \end{array}.
      $$

  - **Feedback didático:** Em grafos de intervalos, o trabalho é decidir corretamente as interseções. Depois disso, a montagem das matrizes é mecânica.

[Voltar ao sumário](#sumario)

<a id="q74"></a>
## Resposta da Questão 74

- **Questão 74:** **(Feofiloff, 2013)** Seja $\preceq$ uma relação de ordem parcial sobre um conjunto finito $V$. Digamos que dois elementos distintos $x$ e $y$ de $V$ são adjacentes se forem comparáveis, ou seja, se $x\preceq y$ ou $y\preceq x$. Essa relação define o grafo de comparabilidade da relação $\preceq$. Faça uma figura do grafo de comparabilidade da relação usual de inclusão $\subseteq$ entre os subconjuntos de $\{1,2,3\}$. (ETG: 1.23).

  - **Resposta:**
    - Vértices: os 8 subconjuntos de $\{1,2,3\}$:
      $$\emptyset,\{1\},\{2\},\{3\},\{1,2\},\{1,3\},\{2,3\},\{1,2,3\}.$$
    - Dois vértices são adjacentes quando um é subconjunto do outro.

    - **Figura (grafo de comparabilidade):**
    ```mermaid
    graph LR
      E((∅)) --- A1((1))
      E --- A2((2))
      E --- A3((3))
      E --- A12((12))
      E --- A13((13))
      E --- A23((23))
      E --- A123((123))

      A1 --- A12
      A1 --- A13
      A1 --- A123

      A2 --- A12
      A2 --- A23
      A2 --- A123

      A3 --- A13
      A3 --- A23
      A3 --- A123

      A12 --- A123
      A13 --- A123
      A23 --- A123
    ```

    - Número de arestas:
      $$|E|=19.$$

  - **Feedback didático:** Não confunda com diagrama de Hasse: no grafo de comparabilidade entram todos os pares comparáveis, inclusive os que seriam “transitivos” no Hasse.

[Voltar ao sumário](#sumario)

<a id="q75"></a>
## Resposta da Questão 75

- **Questão 75:** **(Feofiloff, 2013)** Duas arestas de um grafo $G$ são adjacentes se têm uma ponta comum. Essa relação de adjacência define o grafo das arestas de $G$. De modo mais formal, o grafo das arestas (= line graph) de um grafo $G$ é o grafo $(E_G,A)$ em que $A$ é o conjunto de todos os pares de arestas adjacentes de $G$. O grafo das arestas de $G$ será denotado por $L(G)$.

  - **Resposta:**
    - **(a) Figura de $L(K_3)$:** como $K_3$ tem 3 arestas e cada par compartilha um vértice, $L(K_3)=K_3$.

    ```mermaid
    graph LR
      e1((e1)) --- e2((e2))
      e2 --- e3((e3))
      e3 --- e1
    ```

    - **(b) Figura de $L(K_4)$:**
      - Arestas de $K_4$: $e_{12},e_{13},e_{14},e_{23},e_{24},e_{34}$.
      - Em $L(K_4)$, dois desses vértices são adjacentes quando as arestas originais compartilham uma ponta.

    ```mermaid
    graph LR
      e12((e12)) --- e13((e13))
      e12 --- e14((e14))
      e12 --- e23((e23))
      e12 --- e24((e24))

      e13 --- e14
      e13 --- e23
      e13 --- e34((e34))

      e14 --- e24
      e14 --- e34

      e23 --- e24
      e23 --- e34

      e24 --- e34
    ```

    - **(c) Matrizes de $L(K_4)$** (ordem dos vértices: $e_{12},e_{13},e_{14},e_{23},e_{24},e_{34}$):

      - Matriz de adjacência:
      $$
      A=
      \begin{bmatrix}
      0&1&1&1&1&0\\
      1&0&1&1&0&1\\
      1&1&0&0&1&1\\
      1&1&0&0&1&1\\
      1&0&1&1&0&1\\
      0&1&1&1&1&0
      \end{bmatrix}.
      $$

      - Ordem das arestas de $L(K_4)$:
        $$\begin{aligned}
        &f_1=e_{12}e_{13},\ f_2=e_{12}e_{14},\ f_3=e_{12}e_{23},\ f_4=e_{12}e_{24},\\
        &f_5=e_{13}e_{14},\ f_6=e_{13}e_{23},\ f_7=e_{13}e_{34},\ f_8=e_{14}e_{24},\\
        &f_9=e_{14}e_{34},\ f_{10}=e_{23}e_{24},\ f_{11}=e_{23}e_{34},\ f_{12}=e_{24}e_{34}.
        \end{aligned}$$
      - Matriz de incidência:
      $$
      M=
      \begin{array}{c|cccccccccccc}
            &f_1&f_2&f_3&f_4&f_5&f_6&f_7&f_8&f_9&f_{10}&f_{11}&f_{12} \\\hline
      e_{12}&1&1&1&1&0&0&0&0&0&0&0&0\\
      e_{13}&1&0&0&0&1&1&1&0&0&0&0&0\\
      e_{14}&0&1&0&0&1&0&0&1&1&0&0&0\\
      e_{23}&0&0&1&0&0&1&0&0&0&1&1&0\\
      e_{24}&0&0&0&1&0&0&0&1&0&1&0&1\\
      e_{34}&0&0&0&0&0&0&1&0&1&0&1&1
      \end{array}.
      $$

    - **(d) Quantos vértices e arestas tem $L(K_n)$?**
      $$|V(L(K_n))|=|E(K_n)|=\binom n2.$$
      Cada aresta de $K_n$ incide em 2 vértices e é adjacente a $(n-2)+(n-2)=2n-4$ arestas.
      Então
      $$|E(L(K_n))|=\frac{\binom n2(2n-4)}{2}=\frac{n(n-1)(n-2)}{2}.$$

    - **(e) Figura de $L(P)$, com $P$ o grafo de Petersen:**
      - O Petersen é 3-regular com 15 arestas.
      - Logo, $L(P)$ tem 15 vértices e é 4-regular (cada aresta de $P$ é adjacente a 4 outras), portanto 30 arestas.

    ```mermaid
    graph LR
      O0((O0)) --- O1((O1))
      O1 --- O2((O2))
      O2 --- O3((O3))
      O3 --- O4((O4))
      O4 --- O0

      O0 --- S0((S0))
      O0 --- S1((S1))
      O1 --- S1
      O1 --- S2((S2))
      O2 --- S2
      O2 --- S3((S3))
      O3 --- S3
      O3 --- S4((S4))
      O4 --- S0
      O4 --- S4

      S0 --- I0((I0))
      S0 --- I3((I3))
      S1 --- I1((I1))
      S1 --- I4((I4))
      S2 --- I0
      S2 --- I2((I2))
      S3 --- I1
      S3 --- I3
      S4 --- I2
      S4 --- I4

      I0 --- I2
      I0 --- I3
      I1 --- I3
      I1 --- I4
      I2 --- I4
    ```

  - **Feedback didático:** Em line graph, a regra é sempre “vértice = aresta original” e “adjacência = compartilhar ponta no original”. Traduzir corretamente essa correspondência resolve todos os itens.

[Voltar ao sumário](#sumario)

<a id="q76"></a>
## Resposta da Questão 76

- **Questão 76:** **(Feofiloff, 2013)** Uma pequena fábrica tem cinco máquinas (1, 2, 3, 4 e 5) e seis operários (A, B, C, D, E e F). A tabela especifica as máquinas que cada operário sabe operar: Faça uma figura do grafo bipartido que representa a relação entre operários e máquinas. (ETG: 1.25).

  - **Resposta:**
    - Partições do grafo bipartido:
      $$U=\{A,B,C,D,E,F\},\qquad W=\{1,2,3,4,5\}.$$

    - Relações da tabela (como no enunciado):
      - $A\to\{2,3\}$
      - $B\to\{1,2,3,4,5\}$
      - $C\to\{3\}$
      - $D\to\emptyset$ (nenhuma máquina listada)
      - $E\to\{2,4,5\}$
      - $F\to\{2,5\}$

    - Logo,
      $$E=\{A2,A3,B1,B2,B3,B4,B5,C3,E2,E4,E5,F2,F5\}.$$

    - **Figura do grafo bipartido:**
    ```mermaid
    graph LR
      subgraph U[Operários]
        A((A))
        B((B))
        C((C))
        D((D))
        E((E))
        F((F))
      end
      subgraph W[Máquinas]
        M1((1))
        M2((2))
        M3((3))
        M4((4))
        M5((5))
      end

      A --- M2
      A --- M3

      B --- M1
      B --- M2
      B --- M3
      B --- M4
      B --- M5

      C --- M3

      E --- M2
      E --- M4
      E --- M5

      F --- M2
      F --- M5
    ```

  - **Feedback didático:** Em grafos bipartidos de relação, cada aresta representa exatamente um par “operário sabe operar máquina”. Montar o conjunto de arestas primeiro evita erro no desenho.

[Voltar ao sumário](#sumario)

<a id="q77"></a>
## Resposta da Questão 77

- **Questão 77:** **(Feofiloff, 2013)** Quantas arestas pode ter um grafo $\{U,W\}$-bipartido? (ETG: 1.26).

  - **Resposta:**
    - Se $|U|=p$ e $|W|=q$, então todo vértice de $U$ pode ligar, no máximo, a todos os $q$ vértices de $W$.
    - Portanto, o número máximo de arestas é $pq$ (atingido em $K_{p,q}$).
    - O mínimo é 0 (grafo sem arestas).

    $$0\le |E|\le pq.$$

    - **Exemplo:** se $|U|=3$ e $|W|=4$, então
      $$0\le |E|\le 12.$$
      O máximo 12 ocorre em $K_{3,4}$; o mínimo 0 ocorre no grafo vazio com essas partições.

  - **Feedback didático:** Em bipartidos, nunca há aresta dentro da mesma partição. Então a contagem máxima sempre vem do produto entre os tamanhos das duas partições.

[Voltar ao sumário](#sumario)

<a id="q78"></a>
## Resposta da Questão 78

- **Questão 78:** **(Feofiloff, 2013)** Quantas arestas tem um $K_{p,q}$? Quantas arestas tem um $\overline{K_{p,q}}$? (ETG: 1.27).

  - **Resposta:**
    - Em $K_{p,q}$, cada um dos $p$ vértices de uma partição conecta aos $q$ da outra:
      $$|E(K_{p,q})|=pq.$$

    - O complemento em $p+q$ vértices remove todas as arestas entre partições e adiciona as arestas internas de cada lado:
      $$|E(\overline{K_{p,q}})|=\binom p2+\binom q2.$$

    - **Exemplo:** para $p=2$ e $q=3$,
      $$|E(K_{2,3})|=2\cdot3=6,$$
      $$|E(\overline{K_{2,3}})|=\binom22+\binom32=1+3=4.$$

  - **Feedback didático:** Pense no complemento como “trocar aresta por não-aresta” no conjunto total de vértices; em bipartido completo isso vira dois cliques desconexos, um de tamanho $p$ e outro de tamanho $q$.

[Voltar ao sumário](#sumario)

<a id="q79"></a>
## Resposta da Questão 79

- **Questão 79:** **(Feofiloff, 2013)** Faça uma figura de um $K_{3,4}$. Escreva as matrizes de adjacência e incidência de um $K_{3,4}$. Faça uma figura de uma estrela com 6 vértices. (ETG: 1.28).

  - **Resposta:**
    - Considere as partições:
      $$U=\{u_1,u_2,u_3\},\qquad W=\{v_1,v_2,v_3,v_4\}.$$

    - **Figura de $K_{3,4}$:**
    ```mermaid
    graph LR
      subgraph U[U]
        u1((u1))
        u2((u2))
        u3((u3))
      end
      subgraph W[W]
        v1((v1))
        v2((v2))
        v3((v3))
        v4((v4))
      end
      u1 --- v1
      u1 --- v2
      u1 --- v3
      u1 --- v4
      u2 --- v1
      u2 --- v2
      u2 --- v3
      u2 --- v4
      u3 --- v1
      u3 --- v2
      u3 --- v3
      u3 --- v4
    ```

    - **Matriz de adjacência de $K_{3,4}$** (ordem $u_1,u_2,u_3,v_1,v_2,v_3,v_4$):
      $$
      A=
      \begin{bmatrix}
      0&0&0&1&1&1&1\\
      0&0&0&1&1&1&1\\
      0&0&0&1&1&1&1\\
      1&1&1&0&0&0&0\\
      1&1&1&0&0&0&0\\
      1&1&1&0&0&0&0\\
      1&1&1&0&0&0&0
      \end{bmatrix}.
      $$

    - **Matriz de incidência de $K_{3,4}$:**
      - Ordem das arestas:
        $$\begin{aligned}
        &e_1=u_1v_1,\ e_2=u_1v_2,\ e_3=u_1v_3,\ e_4=u_1v_4,\\
        &e_5=u_2v_1,\ e_6=u_2v_2,\ e_7=u_2v_3,\ e_8=u_2v_4,\\
        &e_9=u_3v_1,\ e_{10}=u_3v_2,\ e_{11}=u_3v_3,\ e_{12}=u_3v_4.
        \end{aligned}$$
      $$
      M=
      \begin{array}{c|cccccccccccc}
          &e_1&e_2&e_3&e_4&e_5&e_6&e_7&e_8&e_9&e_{10}&e_{11}&e_{12} \\\hline
      u_1 &1&1&1&1&0&0&0&0&0&0&0&0\\
      u_2 &0&0&0&0&1&1&1&1&0&0&0&0\\
      u_3 &0&0&0&0&0&0&0&0&1&1&1&1\\
      v_1 &1&0&0&0&1&0&0&0&1&0&0&0\\
      v_2 &0&1&0&0&0&1&0&0&0&1&0&0\\
      v_3 &0&0&1&0&0&0&1&0&0&0&1&0\\
      v_4 &0&0&0&1&0&0&0&1&0&0&0&1
      \end{array}.
      $$

    - **Figura de uma estrela com 6 vértices:**
      - Estrela com 6 vértices é $K_{1,5}$.

    ```mermaid
    graph LR
      c((c)) --- a((a))
      c --- b((b))
      c --- d((d))
      c --- e((e))
      c --- f((f))
    ```

  - **Feedback didático:** Em $K_{p,q}$, toda a estrutura matricial vem do bloco “zeros dentro da partição, uns entre partições”. Depois de fixar a ordem dos vértices, preencher $A$ e $M$ fica direto.

[Voltar ao sumário](#sumario)

<a id="q80"></a>
## Resposta da Questão 80

- **Questão 80:** **(Feofiloff, 2013)** É verdade que o grafo do cavalo no tabuleiro t-por-t é bipartido? (ETG: 1.29).

  - **Resposta:**
    - Sim, é bipartido.
    - Faça a coloração de xadrez nas casas: classe 1 = casas com $i+j$ par, classe 2 = casas com $i+j$ ímpar.
    - Um movimento de cavalo altera as coordenadas por $(\pm2,\pm1)$ ou $(\pm1,\pm2)$, então muda a paridade de $i+j$.
    - Logo, toda aresta liga sempre uma casa par a uma casa ímpar, sem arestas dentro da mesma classe.

  - **Feedback didático:** O critério de bipartição aqui é paridade. Sempre que todo movimento troca a paridade, o grafo é bipartido automaticamente.

[Voltar ao sumário](#sumario)

<a id="q81"></a>
## Resposta da Questão 81

- **Questão 81:** **(Feofiloff, 2013)** Que aparência tem a matriz de adjacências de um grafo bipartido? (ETG: 1.30).

  - **Resposta:**
    - Se $G$ é bipartido com partições $U$ e $W$, e ordenamos os vértices com todos os de $U$ primeiro e depois os de $W$, então
      $$
      A(G)=
      \begin{bmatrix}
      0 & B\\
      B^T & 0
      \end{bmatrix}.
      $$
    - Os blocos diagonais são nulos porque não há arestas dentro de $U$ nem dentro de $W$.
    - O bloco $B$ registra as arestas entre as partições.

    - **Exemplo (com destaque dos blocos):**
      - Tome $U=\{u_1,u_2\}$ e $W=\{w_1,w_2,w_3\}$, com arestas
        $$E=\{u_1w_1,\ u_1w_3,\ u_2w_2\}.$$
      - Na ordem $(u_1,u_2,w_1,w_2,w_3)$:
        $$
        A=
        \left[
        \begin{array}{cc|ccc}
        0&0&1&0&1\\
        0&0&0&1&0\\ \hline
        1&0&0&0&0\\
        0&1&0&0&0\\
        1&0&0&0&0
        \end{array}
        \right]
        $$
      - Bloco superior esquerdo ($U\\times U$) e inferior direito ($W\\times W$): só zeros.
      - Blocos fora da diagonal: relações entre as duas partições.

  - **Feedback didático:** A forma em blocos é a assinatura matricial de bipartição. Se aparecer 1 em bloco diagonal (nessa ordenação), o grafo não é bipartido.

[Voltar ao sumário](#sumario)

<a id="q82"></a>
## Resposta da Questão 82

- **Questão 82:** **(Feofiloff, 2013)** A matriz da bipartição de um grafo $\{U,W\}$-bipartido é definida assim: cada linha da matriz é um elemento de $U$, cada coluna da matriz é um elemento de $W$, e no cruzamento da linha $u$ com a coluna $w$ temos 1 se $uw$ é uma aresta e 0 em caso contrário. Escreva a matriz da bipartição do grafo do exercício E1.25, adotando a bipartição $U=\{A,\ldots,F\}$ e $W=\{1,\ldots,5\}$. (ETG: 1.31).

  - **Resposta:**
    - Usando os dados da questão 76:
      - $A\to\{2,3\}$
      - $B\to\{1,2,3,4,5\}$
      - $C\to\{3\}$
      - $D\to\emptyset$
      - $E\to\{2,4,5\}$
      - $F\to\{2,5\}$

    - Matriz da bipartição (linhas $A,\ldots,F$; colunas $1,\ldots,5$):
      $$
      M_{\text{bip}}=
      \begin{array}{c|ccccc}
           & 1&2&3&4&5 \\\hline
      A & 0&1&1&0&0\\
      B & 1&1&1&1&1\\
      C & 0&0&1&0&0\\
      D & 0&0&0&0&0\\
      E & 0&1&0&1&1\\
      F & 0&1&0&0&1
      \end{array}.
      $$

  - **Feedback didático:** A matriz da bipartição é só uma forma tabular da relação “quem opera o quê”. Cada 1 representa uma aresta do grafo bipartido.

[Voltar ao sumário](#sumario)

<a id="q83"></a>
## Resposta da Questão 83

- **Questão 83:** **(Feofiloff, 2013)** Quais são os graus dos vértices de uma estrela (veja a seção 1.2)? (ETG: 1.32).

  - **Resposta:**
    - Uma estrela com $n$ vértices é $K_{1,n-1}$.
    - O vértice central tem grau $n-1$.
    - Cada um dos $n-1$ vértices folhas tem grau $1$.

    - **Exemplo:** em $K_{1,5}$ (estrela com 6 vértices),
      - centro $c$: $d(c)=5$;
      - folhas $a,b,d,e,f$: $d(a)=d(b)=d(d)=d(e)=d(f)=1$.

    ```mermaid
    graph LR
      c((c)) --- a((a))
      c --- b((b))
      c --- d((d))
      c --- e((e))
      c --- f((f))
    ```

  - **Feedback didático:** Em estrela, toda aresta incide no centro. Por isso o centro acumula todos os graus e as folhas ficam com grau 1.

[Voltar ao sumário](#sumario)

<a id="q84"></a>
## Resposta da Questão 84

- **Questão 84:** **(Feofiloff, 2013)** Se $G$ é um $K_n$, quanto valem $\delta(G)$ e $\Delta(G)$, isto é, grau mínimo e grau máximo de $G$? Quanto valem os parâmetros $\delta$ e $\Delta$ de um $K_{p,q}$? (ETG: 1.33).

  - **Resposta:**
    - Em $K_n$, todo vértice tem grau $n-1$:
      $$\delta(K_n)=\Delta(K_n)=n-1.$$

    - Em $K_{p,q}$:
      - vértices da partição com $p$ elementos têm grau $q$;
      - vértices da partição com $q$ elementos têm grau $p$.
      Portanto,
      $$\delta(K_{p,q})=\min\{p,q\},\qquad \Delta(K_{p,q})=\max\{p,q\}.$$

    - **Exemplo:**
      - Em $K_4$: todo vértice tem grau 3, então
        $$\delta(K_4)=\Delta(K_4)=3.$$

      ```mermaid
      graph LR
        a1((1)) --- a2((2))
        a1 --- a3((3))
        a1 --- a4((4))
        a2 --- a3
        a2 --- a4
        a3 --- a4
      ```

      - Em $K_{3,5}$: vértices do lado com 3 têm grau 5 e do lado com 5 têm grau 3, então
        $$\delta(K_{3,5})=3,\qquad \Delta(K_{3,5})=5.$$

      ```mermaid
      graph LR
        subgraph U[Particao_U_3]
          u1((u1))
          u2((u2))
          u3((u3))
        end
        subgraph W[Particao_W_5]
          w1((w1))
          w2((w2))
          w3((w3))
          w4((w4))
          w5((w5))
        end
        u1 --- w1
        u1 --- w2
        u1 --- w3
        u1 --- w4
        u1 --- w5
        u2 --- w1
        u2 --- w2
        u2 --- w3
        u2 --- w4
        u2 --- w5
        u3 --- w1
        u3 --- w2
        u3 --- w3
        u3 --- w4
        u3 --- w5
      ```

  - **Feedback didático:** Para $\delta$ e $\Delta$, primeiro liste os graus possíveis por tipo de vértice. Depois só pegue mínimo e máximo desse conjunto.

[Voltar ao sumário](#sumario)

<a id="q85"></a>
## Resposta da Questão 85

- **Questão 85:** **(Feofiloff, 2013)** Para r = 1,2,3, faça uma figura de um grafo r-regular com 12 vértices. (ETG: 1.34).

  - **Resposta:**
    - **Exemplos com grafo (Mermaid):**
    - **(a) $r=1$:** união de 6 arestas disjuntas ($6K_2$).

    ```mermaid
    graph LR
      a1((1)) --- a2((2))
      a3((3)) --- a4((4))
      a5((5)) --- a6((6))
      a7((7)) --- a8((8))
      a9((9)) --- a10((10))
      a11((11)) --- a12((12))
    ```

    - **(b) $r=2$:** ciclo $C_{12}$.

    ```mermaid
    graph LR
      b1((1)) --- b2((2)) --- b3((3)) --- b4((4)) --- b5((5)) --- b6((6))
      b6 --- b7((7)) --- b8((8)) --- b9((9)) --- b10((10)) --- b11((11)) --- b12((12))
      b12 --- b1
    ```

    - **(c) $r=3$:** prisma $C_6\square K_2$ (12 vértices).

    ```mermaid
    graph LR
      u1((u1)) --- u2((u2)) --- u3((u3)) --- u4((u4)) --- u5((u5)) --- u6((u6)) --- u1
      v1((v1)) --- v2((v2)) --- v3((v3)) --- v4((v4)) --- v5((v5)) --- v6((v6)) --- v1
      u1 --- v1
      u2 --- v2
      u3 --- v3
      u4 --- v4
      u5 --- v5
      u6 --- v6
    ```

    - Em cada figura, todos os vértices têm exatamente o grau pedido.

  - **Feedback didático:** Para construir grafos regulares, use blocos clássicos: emparelhamento (grau 1), ciclos (grau 2) e prismas/cubos (grau 3). Depois verifique o grau vértice a vértice.

[Voltar ao sumário](#sumario)

<a id="q86"></a>
## Resposta da Questão 86

- **Questão 86:** **(Feofiloff, 2013)** Quais são os graus dos vértices de uma molécula de alcano (veja exercício 1.5)? (ETG: 1.35).

  - **Resposta:**
    - Na representação molecular completa (com carbonos e hidrogênios como vértices):
      - cada vértice de **hidrogênio** tem grau $1$;
      - cada vértice de **carbono** tem grau $4$.
    - Isso ocorre porque no alcano todas as ligações são simples e o carbono é tetravalente.

    - **Verificação em um exemplo (butano, $C_4H_{10}$):**
    ```mermaid
    graph LR
      C1((C1)) --- C2((C2)) --- C3((C3)) --- C4((C4))
      H1((H)) --- C1
      H2((H)) --- C1
      H3((H)) --- C1
      H4((H)) --- C2
      H5((H)) --- C2
      H6((H)) --- C3
      H7((H)) --- C3
      H8((H)) --- C4
      H9((H)) --- C4
      H10((H)) --- C4
    ```
    - Graus no exemplo:
      - $d(C1)=d(C4)=4$ (um carbono vizinho + três hidrogênios);
      - $d(C2)=d(C3)=4$ (dois carbonos vizinhos + dois hidrogênios);
      - $d(H_i)=1$ para todo hidrogênio.

  - **Feedback didático:** O jeito mais seguro é usar valência química como restrição de grau no grafo: H sempre 1, C sempre 4 no alcano completo.

[Voltar ao sumário](#sumario)

<a id="q87"></a>
## Resposta da Questão 87

- **Questão 87:** **(Feofiloff, 2013)** Calcule os valores dos parâmetros $\delta$, $\Delta$ e $\mu$ no $k$-cubo (veja exercício 1.14) e no grafo de Petersen (veja exercício 1.15). (ETG: 1.36).

  - **Resposta:**
    - **No $Q_k$:**
      - cada vértice difere de outros em exatamente 1 bit em $k$ posições possíveis, então $d(v)=k$ para todo $v$;
      - logo,
        $$\delta(Q_k)=\Delta(Q_k)=\mu(Q_k)=k.$$

    - **Exemplo do $k$-cubo (caso $Q_3$):**
    ```mermaid
    graph LR
      a000((000)) --- a001((001))
      a001 --- a011((011))
      a011 --- a010((010))
      a010 --- a000

      a100((100)) --- a101((101))
      a101 --- a111((111))
      a111 --- a110((110))
      a110 --- a100

      a000 --- a100
      a001 --- a101
      a010 --- a110
      a011 --- a111
    ```
    - No desenho de $Q_3$, cada vértice tem grau 3 (troca de um único bit), confirmando a regra geral $d(v)=k$ para $Q_k$.

    - **No grafo de Petersen:**
      - é 3-regular;
      - então,
        $$\delta(P)=\Delta(P)=\mu(P)=3.$$

    - **Grafo de Petersen (ETG 1.36), para verificar os graus:**
    ```mermaid
    graph LR
      u0((u0)) --- u1((u1)) --- u2((u2)) --- u3((u3)) --- u4((u4)) --- u0
      u0 --- w0((w0))
      u1 --- w1((w1))
      u2 --- w2((w2))
      u3 --- w3((w3))
      u4 --- w4((w4))
      w0 --- w2
      w2 --- w4
      w4 --- w1
      w1 --- w3
      w3 --- w0
    ```
    - Checagem: cada vértice tem exatamente 3 arestas incidentes (2 no ciclo/pentagrama + 1 raio), confirmando regularidade 3.

  - **Feedback didático:** Em grafos regulares, os três parâmetros coincidem com o grau comum. Verificar regularidade primeiro simplifica toda a conta.

[Voltar ao sumário](#sumario)

<a id="q88"></a>
## Resposta da Questão 88

- **Questão 88:** **(Feofiloff, 2013)** Calcule os valores dos parâmetros $\delta$ e $\Delta$ no grafo dos estados do Brasil (veja exercício 1.17). (ETG: 1.37).

  - **Resposta:**
    - No modelo usual do grafo dos estados brasileiros (27 vértices, fronteiras terrestres), toma-se:
      $$\delta=1,\qquad \Delta=8.$$
    - Exemplo típico: o Distrito Federal tem grau 1 (fronteira apenas com Goiás) e a Bahia grau 8.

    - **Grafo completo dos estados (ETG 1.37):**
    ```mermaid
    graph LR
      AC((AC)) --- AM((AM))
      AC --- RO((RO))

      AL((AL)) --- BA((BA))
      AL --- PE((PE))
      AL --- SE((SE))

      AP((AP)) --- PA((PA))

      AM --- RO
      AM --- RR((RR))
      AM --- PA
      AM --- MT((MT))

      BA --- SE
      BA --- PE
      BA --- PI((PI))
      BA --- TO((TO))
      BA --- GO((GO))
      BA --- MG((MG))
      BA --- ES((ES))

      CE((CE)) --- RN((RN))
      CE --- PB((PB))
      CE --- PE
      CE --- PI

      DF((DF)) --- GO

      ES --- MG
      ES --- RJ((RJ))

      GO --- MT
      GO --- MS((MS))
      GO --- MG
      GO --- TO

      MA((MA)) --- PA
      MA --- TO
      MA --- PI

      MT --- RO
      MT --- PA
      MT --- TO
      MT --- MS

      MS --- MG
      MS --- SP((SP))
      MS --- PR((PR))

      MG --- RJ
      MG --- SP

      PA --- TO
      PA --- RR

      PB --- RN
      PB --- PE

      PR --- SP
      PR --- SC((SC))

      PE --- PI

      PI --- TO

      RJ --- SP

      RS((RS)) --- SC
    ```
    - No grafo acima:
      - $d(DF)=1$;
      - $d(BA)=8$.

  - **Feedback didático:** Em grafos geográficos, declare a convenção de adjacência antes de calcular $\delta$ e $\Delta$, pois pequenas mudanças de modelagem podem alterar os valores.

[Voltar ao sumário](#sumario)

<a id="q89"></a>
## Resposta da Questão 89

- **Questão 89:** **(Feofiloff, 2013)** Calcule os valores dos parâmetros $\delta$, $\Delta$ e $\mu$ no grafo da dama (veja exercício 1.8) e no grafo do cavalo (veja exercício 1.9). (ETG: 1.38).

  - **Resposta:**
    - **Grafo da dama 8x8:**
      - grau mínimo no canto: $21$;
      - grau máximo no centro: $27$;
      - com $m=728$ e $n=64$:
        $$\mu=\frac{2m}{n}=\frac{2\cdot728}{64}=22{,}75.$$
      - Portanto:
        $$\delta=21,\ \Delta=27,\ \mu=22{,}75.$$

    - **Grafo do cavalo 8x8:**
      - grau mínimo no canto: $2$;
      - grau máximo no miolo: $8$;
      - com $m=168$ e $n=64$:
        $$\mu=\frac{2m}{n}=\frac{2\cdot168}{64}=5{,}25.$$
      - Portanto:
        $$\delta=2,\ \Delta=8,\ \mu=5{,}25.$$

    - **Trechos do grafo (ETG 1.38) para verificar os graus:**
      - Dama em casa central (ex.: `(4,4)`): alcança 27 casas em um lance.
    ```mermaid
    graph LR
      q((4,4))
      q --- a1((4,1))
      q --- a2((4,2))
      q --- a3((4,3))
      q --- a5((4,5))
      q --- a6((4,6))
      q --- a7((4,7))
      q --- a8((4,8))
      q --- b1((1,4))
      q --- b2((2,4))
      q --- b3((3,4))
      q --- b5((5,4))
      q --- b6((6,4))
      q --- b7((7,4))
      q --- b8((8,4))
      q --- c11((1,1))
      q --- c22((2,2))
      q --- c33((3,3))
      q --- c55((5,5))
      q --- c66((6,6))
      q --- c77((7,7))
      q --- c88((8,8))
      q --- d17((1,7))
      q --- d26((2,6))
      q --- d35((3,5))
      q --- d53((5,3))
      q --- d62((6,2))
      q --- d71((7,1))
    ```
      - Cavalo em casa central (ex.: `(4,4)`): alcança 8 casas; no canto alcança 2.
    ```mermaid
    graph LR
      k((4,4))
      k --- n1((2,3))
      k --- n2((2,5))
      k --- n3((3,2))
      k --- n4((3,6))
      k --- n5((5,2))
      k --- n6((5,6))
      k --- n7((6,3))
      k --- n8((6,5))
    ```

  - **Feedback didático:** Para $\mu$, use sempre $\mu=2m/n$. Para $\delta$ e $\Delta$, identifique posições extremas do tabuleiro (cantos versus centro).

[Voltar ao sumário](#sumario)

<a id="q90"></a>
## Resposta da Questão 90

- **Questão 90:** **(Feofiloff, 2013)** Seja $A$ a matriz de adjacências (veja exercício 1.3) e $M$ a matriz de incidências (veja exercício 1.4) de um grafo $G$. Quanto vale a soma dos elementos da linha $v$ de $A$? Quanto vale a soma dos elementos da linha $v$ de $M$? (ETG: 1.39).

  - **Resposta:**
    - Para grafo simples não orientado:
      - soma da linha $v$ em $A$ = $d(v)$;
      - soma da linha $v$ em $M$ = $d(v)$.

    - **Exemplo:** no caminho $P_3$ com vértices $v_1-v_2-v_3$:
      - $d(v_2)=2$;
      - na matriz de adjacência, a linha de $v_2$ é $(1,0,1)$, cuja soma é 2;
      - na matriz de incidência (arestas $e_1=v_1v_2$, $e_2=v_2v_3$), a linha de $v_2$ é $(1,1)$, cuja soma também é 2.

  - **Feedback didático:** As duas somas contam a mesma coisa por codificações diferentes: vizinhos de $v$ (em $A$) e arestas incidentes a $v$ (em $M$).

[Voltar ao sumário](#sumario)

<a id="q91"></a>
## Resposta da Questão 91

- **Questão 91:** **(Feofiloff, 2013)** Seja $G$ um grafo $\{U,W\}$-bipartido. Suponha que $G$ é $r$-regular, com $r>0$. Mostre que $|U|=|W|$. (ETG: 1.40).

  - **Resposta:**
    - Conte arestas a partir de $U$:
      $$m=r|U|.$$
    - Conte arestas a partir de $W$:
      $$m=r|W|.$$
    - Igualando:
      $$r|U|=r|W|.$$
    - Como $r>0$, divide-se por $r$ e obtém-se:
      $$|U|=|W|.$$

    - **Exemplo:** se $r=3$, $|U|=8$ e $G$ é bipartido 3-regular, então
      $$m=3|U|=24.$$
      Como também $m=3|W|$, segue:
      $$3|W|=24 \Rightarrow |W|=8.$$
      Ou seja, as partições têm o mesmo tamanho.

  - **Feedback didático:** A prova é uma dupla contagem de arestas. Em bipartidos regulares, esse é o argumento-padrão para relacionar os tamanhos das partições.

[Voltar ao sumário](#sumario)

<a id="q92"></a>
## Resposta da Questão 92

- **Questão 92:** **(Feofiloff, 2013)** É verdade que todo grafo com pelo menos dois vértices tem dois vértices com o mesmo número de vizinhos? Em outras palavras, se um grafo tem mais de um vértice, é verdade que tem dois vértices distintos $v$ e $w$ tais que $|N(v)|=|N(w)|$? (Uma maneira informal de dizer isso: em toda cidade com pelo menos dois habitantes residem duas pessoas que têm exatamente o mesmo número de amigos na cidade?) (ETG: 1.41).

  - **Resposta:** Sim. Pelo princípio das gavetas nos graus possíveis (0 a $n-1$), não podem coexistir 0 e $n-1$, restam $n-1$ valores para $n$ vértices.

  - **Exemplo com grafo:**
    - Considere o caminho $P_4$:
    ```mermaid
    graph LR
      v1((v1)) --- v2((v2)) --- v3((v3)) --- v4((v4))
    ```
    - Graus:
      - $d(v_1)=d(v_4)=1$;
      - $d(v_2)=d(v_3)=2$.
    - Há repetição de graus (na verdade, duas repetições), como afirma o enunciado.

  - **Condições necessárias (checklist para concluir impossibilidade, quando aplicável):**
    - **Soma dos graus par:** em qualquer grafo, $\sum d(v)=2|E|$, então a soma dos graus deve ser par.
    - **Limite de grau máximo:** em grafo simples com $n$ vértices, todo grau satisfaz $0\le d(v)\le n-1$.
    - **Teste de sequência gráfica:** após passar pelos dois testes acima, aplicar Havel-Hakimi (ou Erdős-Gallai) para decidir se a sequência pode ser realizada.

  - **Leitura complementar:**
    - Havel-Hakimi: <https://en.wikipedia.org/wiki/Havel%E2%80%93Hakimi_algorithm>
    - Erdős-Gallai: <https://en.wikipedia.org/wiki/Erd%C5%91s%E2%80%93Gallai_theorem>
    - Referência adicional (notas de aula): <https://mathworld.wolfram.com/GraphicSequence.html>

  - **Feedback:** Use condições necessárias de existência (soma dos graus par, limite de grau máximo, testes de sequência gráfica) para concluir impossibilidade sem depender de tentativa e erro.

[Voltar ao sumário](#sumario)

<a id="q93"></a>
## Resposta da Questão 93

- **Questão 93:** **(Feofiloff, 2013)** Mostre que, em todo grafo, a soma dos graus dos vértices é igual ao dobro do número de arestas. Ou seja, todo grafo $(V,E)$ satisfaz a identidade $\sum_{v\in V} d(v)=2|E|$. (ETG: 1.42).

  - **Resposta:** Cada aresta $uv$ contribui com 1 unidade para $d(u)$ e 1 unidade para $d(v)$. Portanto, ao somar os graus de todos os vértices, cada aresta é contada exatamente duas vezes. Logo,
    $$
    \sum_{v\in V} d(v)=2|E|.
    $$
    Isso é exatamente o **Lema do Aperto de Mãos**.

  - **Exemplo curto:** No caminho $P_4$ (4 vértices em linha), os graus são $1,2,2,1$. A soma é $6$, e como há $3$ arestas, temos $2|E|=2\cdot 3=6$.
    ```mermaid
    graph LR
      v1((v1)) --- v2((v2))
      v2 --- v3((v3))
      v3 --- v4((v4))
    ```

  - **Feedback didático:** Sempre que o enunciado falar em “soma dos graus”, tente usar dupla contagem: conte a mesma informação por vértices e por arestas.

[Voltar ao sumário](#sumario)

<a id="q94"></a>
## Resposta da Questão 94

- **Questão 94:** **(Feofiloff, 2013)** Mostre que $\mu(G)=2m(G)/n(G)$ para todo grafo $G$. (ETG: 1.43).

  - **Resposta:** Por definição, o grau médio é
    $$
    \mu(G)=\frac{1}{n(G)}\sum_{v\in V(G)} d(v).
    $$
    Pela Questão 93 (Lema do Aperto de Mãos), $\sum_{v\in V(G)} d(v)=2m(G)$. Substituindo:
    $$
    \mu(G)=\frac{2m(G)}{n(G)}.
    $$

  - **Exemplo curto:** Em $C_5$, temos $n=5$, $m=5$, então $\mu=2m/n=10/5=2$, coerente com o fato de todos os vértices terem grau 2.
    ```mermaid
    graph LR
      v1((v1)) --- v2((v2))
      v2 --- v3((v3))
      v3 --- v4((v4))
      v4 --- v5((v5))
      v5 --- v1
    ```

  - **Feedback didático:** Aqui a chave é ligar corretamente “definição de média” com “soma dos graus = $2m$”.

[Voltar ao sumário](#sumario)

<a id="q95"></a>
## Resposta da Questão 95

- **Questão 95:** **(Feofiloff, 2013)** Mostre que todo grafo $G$ tem um vértice $v$ tal que $d(v)\leq 2m(G)/n(G)$ e um vértice $w$ tal que $d(w)\geq 2m(G)/n(G)$. É verdade que todo grafo $G$ tem um vértice $x$ tal que $d(x)<2m(G)/n(G)$? (ETG: 1.44).

  - **Resposta:** Da Questão 94, sabemos que
    $$
    \frac{2m(G)}{n(G)}=\mu(G),
    $$
    isto é, a média dos graus dos vértices.
    Em qualquer conjunto de números reais, existe pelo menos um valor menor ou igual à média e pelo menos um valor maior ou igual à média. Aplicando aos graus:
    $$
    \exists\, v:\ d(v)\le \frac{2m}{n}
    \quad\text{e}\quad
    \exists\, w:\ d(w)\ge \frac{2m}{n}.
    $$
    A afirmação com desigualdade estrita
    $$
    \exists\, x:\ d(x)<\frac{2m}{n}
    $$
    **não é sempre verdadeira**.

  - **Contraexemplo:** Se $G$ é $r$-regular (por exemplo, $C_4$), então todo vértice tem grau $r$ e também $\frac{2m}{n}=r$. Logo, nenhum vértice tem grau estritamente menor que a média.
    ```mermaid
    graph LR
      v1((v1)) --- v2((v2))
      v2 --- v3((v3))
      v3 --- v4((v4))
      v4 --- v1
    ```

  - **Feedback didático:** Em questões com média, pense em dois casos: “desigualdade fraca” (sempre vale) e “desigualdade estrita” (pode falhar em casos uniformes, como grafos regulares).

[Voltar ao sumário](#sumario)

<a id="q96"></a>
## Resposta da Questão 96

- **Questão 96:** **(Feofiloff, 2013)** Mostre que, em qualquer grafo, tem-se $\delta \leq 2m/n \leq \Delta$. (ETG: 1.45).

  - **Resposta:** Seja $\mu=\frac{2m}{n}$ o grau médio (Questão 94). Por definição de grau mínimo e máximo:
    $$
    \delta \le d(v)\le \Delta,\ \forall v\in V.
    $$
    A média de valores que estão todos entre $\delta$ e $\Delta$ também fica entre esses extremos. Portanto:
    $$
    \delta \le \mu \le \Delta
    \quad\Rightarrow\quad
    \delta \le \frac{2m}{n}\le \Delta.
    $$

  - **Exemplo curto:** Em $P_4$, temos graus $(1,2,2,1)$, então $\delta=1$, $\Delta=2$ e $\frac{2m}{n}=\frac{2\cdot3}{4}=1{,}5$. De fato, $1\le1{,}5\le2$.
    ```mermaid
    graph LR
      v1((v1)) --- v2((v2))
      v2 --- v3((v3))
      v3 --- v4((v4))
    ```

  - **Feedback didático:** Use sempre a ideia “a média fica entre o menor e o maior valor”.

[Voltar ao sumário](#sumario)

<a id="q97"></a>
## Resposta da Questão 97

- **Questão 97:** **(Feofiloff, 2013)** Mostre que todo grafo com $n$ vértices tem no máximo $n(n-1)/2$ arestas. (ETG: 1.46).

  - **Resposta:** Em um grafo simples com $n$ vértices, cada aresta liga um par não ordenado de vértices distintos. O número total de pares possíveis é
    $$
    \binom{n}{2}=\frac{n(n-1)}{2}.
    $$
    Como não pode haver mais de uma aresta por par, segue que
    $$
    m(G)\le \binom{n}{2}=\frac{n(n-1)}{2}.
    $$
    A igualdade ocorre em $K_n$.

  - **Exemplo curto:** Para $n=5$, o máximo é $\binom52=10$. De fato, $K_5$ tem exatamente 10 arestas.
    ```mermaid
    graph LR
      v1((v1)) --- v2((v2))
      v1 --- v3((v3))
      v1 --- v4((v4))
      v1 --- v5((v5))
      v2 --- v3
      v2 --- v4
      v2 --- v5
      v3 --- v4
      v3 --- v5
      v4 --- v5
    ```

  - **Feedback didático:** Quando aparecer “máximo de arestas”, pense imediatamente em “quantos pares de vértices existem”.

[Voltar ao sumário](#sumario)

<a id="q98"></a>
## Resposta da Questão 98

- **Questão 98:** **(Feofiloff, 2013)** Mostre que em qualquer grafo o número de vértices de grau ímpar é necessariamente par. (ETG: 1.47).

  - **Resposta:** Pelo Lema do Aperto de Mãos,
    $$
    \sum_{v\in V} d(v)=2m,
    $$
    que é um número par.
    Na soma dos graus, os termos de grau par não alteram a paridade. Assim, a paridade da soma depende apenas da quantidade de termos ímpares: soma de uma quantidade ímpar de números ímpares é ímpar; soma de uma quantidade par de números ímpares é par.
    Como a soma total é par, o número de vértices de grau ímpar deve ser **par**.

  - **Exemplo curto:** No caminho $P_5$, os graus são $(1,2,2,2,1)$. Há 2 vértices de grau ímpar, que é um número par.
    ```mermaid
    graph LR
      v1((v1)) --- v2((v2))
      v2 --- v3((v3))
      v3 --- v4((v4))
      v4 --- v5((v5))
    ```

  - **Feedback didático:** Em provas de paridade, separe mentalmente “termos pares” e “termos ímpares”; isso simplifica muito a argumentação.

[Voltar ao sumário](#sumario)

<a id="q99"></a>
## Resposta da Questão 99

- **Questão 99:** **(Feofiloff, 2013)** Quantas arestas tem o grafo da dama 8-por-8 (veja exercício 1.8)? Quantas arestas tem o grafo da dama $t$-por-$t$? (ETG: 1.48).

  - **Resposta:** No grafo da dama, duas casas são adjacentes se estão na mesma linha, coluna ou diagonal.
    - Mesma linha: $t\cdot \binom{t}{2}$ arestas.
    - Mesma coluna: $t\cdot \binom{t}{2}$ arestas.
    - Linhas + colunas: $t^2(t-1)$.
    - Diagonais (as duas direções): o total é
      $$
      2\left[\binom{t}{2}+2\sum_{k=1}^{t-1}\binom{k}{2}\right]
      =\frac{t(t-1)(2t-1)}{3}.
      $$
    Somando:
    $$
    m(t)=t^2(t-1)+\frac{t(t-1)(2t-1)}{3}
    =\frac{t(t-1)(5t-1)}{3}.
    $$
    Para $t=8$:
    $$
    m(8)=\frac{8\cdot7\cdot(40-1)}{3}=728.
    $$

  - **Grafo de exemplo (subgrafo da dama em $3\times3$: vizinhança da casa $a1$):**
    ```mermaid
    graph LR
      a1((a1)) --- a2((a2))
      a1 --- a3((a3))
      a1 --- b1((b1))
      a1 --- c1((c1))
      a1 --- b2((b2))
      a1 --- c3((c3))
    ```

  - **Feedback didático:** Em grafos de movimentos no tabuleiro, decompor por tipos de ataque (linha, coluna, diagonal) evita dupla contagem incorreta.

[Voltar ao sumário](#sumario)

<a id="q100"></a>
## Resposta da Questão 100

- **Questão 100:** **(Feofiloff, 2013)** Quantas arestas tem o grafo do cavalo 4-por-4 (veja exercício 1.9)? Quantas arestas tem o grafo do cavalo $t$-por-$t$? (ETG: 1.49).

  - **Resposta:** Um movimento do cavalo tem formato $(1,2)$ ou $(2,1)$.
    Em um tabuleiro $t\times t$:
    - há $(t-1)(t-2)$ maneiras de posicionar um retângulo $2\times3$;
    - em cada retângulo $2\times3$, existem exatamente 2 arestas de cavalo entre cantos opostos;
    - o mesmo vale para retângulos $3\times2$.
    Logo,
    $$
    m(t)=2(t-1)(t-2)+2(t-1)(t-2)=4(t-1)(t-2).
    $$
    Para $t=4$:
    $$
    m(4)=4\cdot3\cdot2=24.
    $$

  - **Grafo de referência (cavalo em tabuleiro $4\times4$):**
    ```mermaid
    graph LR
      a1((a1)) --- b3((b3))
      a1 --- c2((c2))
      a2((a2)) --- c1((c1))
      a2 --- c3((c3))
      a2 --- b4((b4))
      a3((a3)) --- b1((b1))
      a3 --- c2
      a3 --- c4((c4))
      a4((a4)) --- b2((b2))
      a4 --- c3
      b1 --- c3
      b1 --- d2((d2))
      b2 --- c4
      b2 --- d1((d1))
      b2 --- d3((d3))
      b3 --- c1
      b3 --- d2
      b3 --- d4((d4))
      b4 --- c2
      b4 --- d3
      c1 --- d3
      c2 --- d4
      c3 --- d1
      c4 --- d2
    ```

  - **Feedback didático:** Em problemas de contagem no tabuleiro, procure um “bloco básico” (aqui, os retângulos $2\times3$ e $3\times2$) para contar sem omissões.

[Voltar ao sumário](#sumario)

<a id="q101"></a>
## Resposta da Questão 101

- **Questão 101:** **(Feofiloff, 2013)** Quantas arestas tem um grafo $r$-regular com $n$ vértices? (ETG: 1.50).

  - **Resposta:** Se o grafo é $r$-regular, então todo vértice tem grau $r$. Assim,
    $$
    \sum_{v\in V} d(v)=nr.
    $$
    Pelo Lema do Aperto de Mãos,
    $$
    2m=nr \;\Rightarrow\; m=\frac{nr}{2}.
    $$
    Portanto, um grafo $r$-regular com $n$ vértices tem $\frac{nr}{2}$ arestas.

  - **Exemplo (grafo 2-regular com 6 vértices):**
    ```mermaid
    graph LR
      v1((v1)) --- v2((v2))
      v2 --- v3((v3))
      v3 --- v4((v4))
      v4 --- v5((v5))
      v5 --- v6((v6))
      v6 --- v1
    ```
    Aqui, $n=6$ e $r=2$, então $m=\frac{6\cdot2}{2}=6$, como no ciclo $C_6$.

  - **Feedback didático:** Sempre que o enunciado disser “$r$-regular”, você pode substituir imediatamente a soma dos graus por $nr$.

[Voltar ao sumário](#sumario)

<a id="q102"></a>
## Resposta da Questão 102

- **Questão 102:** **(Feofiloff, 2013)** Quantas arestas tem o cubo de dimensão $k$? (ETG: 1.51).

  - **Resposta:** O cubo de dimensão $k$ (hipercubo $Q_k$) tem:
    - $2^k$ vértices (todas as palavras binárias de comprimento $k$);
    - grau $k$ em cada vértice (troca-se exatamente 1 bit por vez).
    Então,
    $$
    \sum_{v\in V} d(v)=k\cdot 2^k.
    $$
    Pelo Lema do Aperto de Mãos:
    $$
    2m=k\cdot 2^k
    \;\Rightarrow\;
    m=k\cdot 2^{k-1}.
    $$

  - **Grafo de referência (3-cubo $Q_3$):**
    ```mermaid
    graph LR
      n000((000)) --- n001((001))
      n000 --- n010((010))
      n000 --- n100((100))
      n001 --- n011((011))
      n001 --- n101((101))
      n010 --- n011
      n010 --- n110((110))
      n100 --- n101
      n100 --- n110
      n111((111)) --- n011
      n111 --- n101
      n111 --- n110
    ```
    No caso $k=3$, a fórmula dá $m=3\cdot2^{2}=12$, que confere com o grafo acima.

  - **Feedback didático:** Para famílias clássicas (como hipercubo), use “número de vértices + regularidade” para chegar em $m$ de forma direta.

[Voltar ao sumário](#sumario)

<a id="q103"></a>
## Resposta da Questão 103

- **Questão 103:** **(Feofiloff, 2013)** Quantas arestas tem o grafo das arestas (veja exercício 1.24) de um grafo $G$? (ETG: 1.52).

  - **Resposta:** Seja $L(G)$ o grafo das arestas (line graph) de $G$.  
    Cada vértice $v\in V(G)$ com grau $d(v)$ gera, em $L(G)$, uma clique entre as arestas incidentes a $v$.  
    O número de pares de arestas incidentes em $v$ é $\binom{d(v)}{2}$.  
    Somando sobre todos os vértices:
    $$
    |E(L(G))|=\sum_{v\in V(G)}\binom{d(v)}{2}.
    $$
    (Comum assumir $G$ simples, sem laços e sem arestas paralelas.)

  - **Exemplo com grafo:** para $G=P_4$ com arestas $e_1,e_2,e_3$, o line graph é $L(G)=P_3$.
    ```mermaid
    graph LR
      subgraph G
        v1((v1)) ---|e1| v2((v2))
        v2 ---|e2| v3((v3))
        v3 ---|e3| v4((v4))
      end
    ```
    ```mermaid
    graph LR
      subgraph L(G)
        e1((e1)) --- e2((e2))
        e2 --- e3((e3))
      end
    ```
    Em $G$, os graus são $(1,2,2,1)$, então
    $\binom12+\binom22+\binom22+\binom12=0+1+1+0=2$, que bate com as 2 arestas de $L(G)$.

  - **Feedback didático:** A contagem correta vem de “pares de arestas que se encontram em um vértice”.

[Voltar ao sumário](#sumario)

<a id="q104"></a>
## Resposta da Questão 104

- **Questão 104:** **(Feofiloff, 2013)** Seja $\overline{G}$ o complemento de um grafo $G$. Calcule $\delta(\overline{G})$ e $\Delta(\overline{G})$ em função de $\delta(G)$ e $\Delta(G)$. (ETG: 1.53).

  - **Resposta:** Seja $n=|V(G)|$. Para todo vértice $v$:
    $$
    d_{\overline{G}}(v)=(n-1)-d_G(v),
    $$
    pois em $\overline{G}$ ele se conecta exatamente aos vértices que não eram adjacentes a ele em $G$.
    Assim:
    - o menor grau em $\overline{G}$ ocorre quando $d_G(v)$ é máximo;
    - o maior grau em $\overline{G}$ ocorre quando $d_G(v)$ é mínimo.
    Portanto:
    $$
    \delta(\overline{G})=n-1-\Delta(G),
    \qquad
    \Delta(\overline{G})=n-1-\delta(G).
    $$

  - **Exemplo com grafo:**
    ```mermaid
    graph LR
      subgraph G
        v1((v1)) --- v2((v2))
        v2 --- v3((v3))
        v3 --- v4((v4))
      end
    ```
    ```mermaid
    graph LR
      subgraph G_bar
        v1((v1)) --- v3((v3))
        v1 --- v4((v4))
        v2((v2)) --- v4
      end
    ```
    Em $G$: $\delta=1$, $\Delta=2$, $n=4$.  
    Pela fórmula: $\delta(\overline{G})=3-2=1$ e $\Delta(\overline{G})=3-1=2$, como no desenho.

  - **Feedback didático:** Em complementos, memorize a identidade local $d_{\overline G}(v)=n-1-d_G(v)$; o resto sai direto.

[Voltar ao sumário](#sumario)

<a id="q105"></a>
## Resposta da Questão 105

- **Questão 105:** **(Feofiloff, 2013)** Seja $G$ um grafo tal que $m(G)>n(G)$. Mostre que $\Delta(G)\geq 3$. (ETG: 1.54).

  - **Resposta:** Prova por contradição. Suponha $\Delta(G)\le2$.  
    Então cada componente conexa de $G$ é:
    - um caminho (com $m_c=n_c-1$), ou
    - um ciclo (com $m_c=n_c$), ou
    - um vértice isolado (com $m_c=0\le n_c$).
    Em todos os casos, $m_c\le n_c$. Somando em todas as componentes:
    $$
    m(G)=\sum m_c \le \sum n_c = n(G),
    $$
    contradizendo a hipótese $m(G)>n(G)$. Logo, necessariamente
    $$
    \Delta(G)\ge3.
    $$

  - **Exemplo com grafo:** este exemplo satisfaz $m>n$ e de fato tem vértice de grau 3.
    ```mermaid
    graph LR
      v1((v1)) --- v2((v2))
      v2 --- v3((v3))
      v3 --- v4((v4))
      v4 --- v1
      v1 --- v3
    ```
    Aqui, $n=4$, $m=5$, então $m>n$; e $\Delta=3$ (em $v1$ e $v3$).

  - **Feedback didático:** A hipótese $\Delta\le2$ “engessa” muito a estrutura do grafo; explorar componentes é o caminho mais limpo.

[Voltar ao sumário](#sumario)

<a id="q106"></a>
## Resposta da Questão 106

- **Questão 106:** **(Feofiloff, 2013)** Suponha que um grafo $G$ tem menos arestas que vértices, ou seja, que $m(G)<n(G)$. Mostre que $G$ tem (pelo menos) um vértice de grau $0$ ou (pelo menos) dois vértices de grau $1$. (ETG: 1.55).

  - **Resposta:** Prova por contradição. Suponha que:
    - não existe vértice de grau $0$;
    - existe no máximo um vértice de grau $1$.
    Então todos os demais vértices têm grau pelo menos $2$. Logo,
    $$
    \sum_{v\in V} d(v)\ge 1+2(n-1)=2n-1.
    $$
    Mas a soma dos graus é par, então na verdade
    $$
    \sum_{v\in V} d(v)\ge 2n.
    $$
    Pelo Lema do Aperto de Mãos, $2m=\sum d(v)\ge2n$, isto é, $m\ge n$, contradizendo $m<n$.
    Portanto, deve ocorrer pelo menos uma das alternativas:
    - existe vértice de grau $0$, ou
    - existem pelo menos dois vértices de grau $1$.

  - **Exemplo com grafo:** em um caminho $P_4$, temos $m=3<n=4$ e há dois vértices de grau 1.
    ```mermaid
    graph LR
      v1((v1)) --- v2((v2))
      v2 --- v3((v3))
      v3 --- v4((v4))
    ```

  - **Feedback didático:** Quando surgir “$m<n$”, combinar contradição com a paridade da soma dos graus costuma resolver em poucas linhas.

[Voltar ao sumário](#sumario)

<a id="q107"></a>
## Resposta da Questão 107

- **Questão 107:** **(Feofiloff, 2013)** Escolha dois números naturais $n$ e $k$ e considere o seguinte jogo para dois jogadores, A e B. Cada iteração do jogo começa com um grafo $G$ que tem $n$ vértices. No início da primeira iteração tem-se $E_G=\emptyset$. Em cada iteração ímpar (primeira, terceira, etc.), o jogador A escolhe dois vértices não adjacentes $u$ e $v$ e acrescenta $uv$ ao conjunto de arestas do grafo. Em cada iteração par (segunda, quarta, etc.), o jogador B faz um movimento análogo: escolhe dois vértices não adjacentes $u$ e $v$ e acrescenta $uv$ ao conjunto de arestas do grafo. O primeiro jogador a produzir um grafo $G$ tal que $\delta(G)\geq k$ perde o jogo. Problema: determinar uma estratégia vencedora para A e uma estratégia vencedora para B. (ETG: 1.56).

  - **Resposta:** A estratégia vencedora depende do par $(n,k)$; não existe regra única para todos os casos.  
    Casos fundamentais:
    - Se $k>n-1$: é impossível ter $\delta(G)\ge k$, então ninguém perde (jogo não alcança condição de derrota).
    - Se $k=n-1$: a derrota ocorre exatamente quando o grafo vira $K_n$ (pois $\delta=n-1$).  
      Como cada jogada adiciona 1 aresta, o perdedor é quem faz a jogada número $\binom{n}{2}$:
      - se $\binom{n}{2}$ é ímpar, A perde;
      - se $\binom{n}{2}$ é par, B perde.
    - Para $1\le k\le n-2$: o problema é combinatório e depende da dinâmica local dos graus; em geral, analisa-se por classes de $(n,k)$.

  - **Exemplo com grafo:** caso $(n,k)=(4,3)$.
    Aqui $k=n-1$, então a condição de derrota só ocorre em $K_4$.
    Como $\binom42=6$ (par), o 6º lance é de B; portanto B perde.
    ```mermaid
    graph LR
      v1((v1)) --- v2((v2))
      v1 --- v3((v3))
      v1 --- v4((v4))
      v2 --- v3
      v2 --- v4
      v3 --- v4
    ```
    No estado final acima, $\delta=3$, logo quem colocou a última aresta perdeu.

  - **Feedback didático:** Neste tipo de jogo, o primeiro filtro é identificar quando a condição de perda equivale a completar $K_n$; aí a paridade do número total de arestas resolve o vencedor.

[Voltar ao sumário](#sumario)

<a id="referencias"></a>
## Referências
- NICOLETTI, Maria do Carmo. *Fundamentos da teoria dos grafos*.
- FEOFILOFF, Paulo. *Exercícios de teoria dos grafos*. IME-USP, 2013.
