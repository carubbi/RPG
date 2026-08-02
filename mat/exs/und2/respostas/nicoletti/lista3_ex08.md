# 3ª Lista - Exercício 8

## 1. Tipo de questão

Questão teórica de prova sobre distância em grafos.

## 2. Estratégia de resolução

No item (a), a ideia é concatenar um caminho mais curto de $u$ até $v$ com um caminho mais curto de $v$ até $w$. Essa concatenação produz um passeio de $u$ até $w$, do qual se pode extrair um caminho. Logo, o caminho mais curto de $u$ até $w$ não pode ser maior que essa concatenação.

No item (b), tomamos um vértice interno $z$ em um caminho mais curto de $u$ até $v$. Como esse caminho é mínimo, seus subcaminhos também são mínimos.

## 3. Resolução detalhada

### (a) Prova de que $d(u,w)\leq d(u,v)+d(v,w)$

Considere três vértices quaisquer $u$, $v$ e $w$ de $G$.

Se $d(u,v)=\infty$ ou $d(v,w)=\infty$, então o lado direito

$$
d(u,v)+d(v,w)
$$

é infinito. Nesse caso, a desigualdade

$$
d(u,w)\leq d(u,v)+d(v,w)
$$

é automaticamente verdadeira, pois $d(u,w)$ é um número natural ou $\infty$.

Agora suponha que $d(u,v)$ e $d(v,w)$ sejam finitos. Então existem:

- um caminho mais curto de $u$ até $v$, com comprimento $d(u,v)$;
- um caminho mais curto de $v$ até $w$, com comprimento $d(v,w)$.

Ao percorrer primeiro o caminho de $u$ até $v$ e depois o caminho de $v$ até $w$, obtemos um passeio de $u$ até $w$ de comprimento

$$
d(u,v)+d(v,w).
$$

Esse passeio pode repetir vértices, mas se existe um passeio de $u$ até $w$, então existe também um caminho de $u$ até $w$ cujo comprimento é menor ou igual ao comprimento desse passeio.

Como $d(u,w)$ é o comprimento do caminho mais curto entre $u$ e $w$, concluímos que:

$$
d(u,w)\leq d(u,v)+d(v,w).
$$

Portanto, a desigualdade vale para quaisquer vértices $u$, $v$ e $w$.

### (b) Prova de que existe $z$ tal que $d(u,v)=d(u,z)+d(z,v)$

Suponha que $d(u,v)\geq 2$.

Como $d(u,v)$ é finito e pelo menos $2$, existe um caminho mais curto de $u$ até $v$ com comprimento $d(u,v)$. Escreva esse caminho como:

$$
u=x_0,x_1,x_2,\ldots,x_k=v,
$$

em que

$$
k=d(u,v)\geq 2.
$$

Escolha o vértice

$$
z=x_1.
$$

Como $x_1$ é o primeiro vértice depois de $u$ no caminho, temos:

$$
d(u,z)=1.
$$

Agora observe que o trecho

$$
z=x_1,x_2,\ldots,x_k=v
$$

é um caminho de $z$ até $v$ com comprimento $k-1$.

Esse trecho também é um caminho mais curto de $z$ até $v$. Se existisse um caminho mais curto de $z$ até $v$, com comprimento menor que $k-1$, então poderíamos ligar $u$ a $z$ pela aresta $ux_1$ e depois seguir esse caminho mais curto até $v$. Isso produziria um caminho de $u$ até $v$ com comprimento menor que $k$, contradizendo a escolha do caminho original como caminho mais curto.

Logo:

$$
d(z,v)=k-1.
$$

Portanto:

$$
d(u,z)+d(z,v)=1+(k-1)=k=d(u,v).
$$

Assim, existe um vértice $z$ tal que:

$$
d(u,v)=d(u,z)+d(z,v).
$$

## 4. Resposta final

- (a) Para quaisquer vértices $u$, $v$ e $w$ de $G$,

$$
d(u,w)\leq d(u,v)+d(v,w).
$$

- (b) Se $d(u,v)\geq 2$, então tomando $z$ como um vértice interno de um caminho mais curto de $u$ até $v$, temos:

$$
d(u,v)=d(u,z)+d(z,v).
$$

## 5. Comentários didáticos

A teoria subjacente é a definição de distância em grafos. Segundo Nicoletti, se dois vértices $u$ e $v$ estão conectados por algum caminho, então $d(u,v)$ é o comprimento do caminho mais curto entre eles. Se não existe caminho entre $u$ e $v$, define-se $d(u,v)=\infty$.

O item (a) é a desigualdade triangular para grafos: ir diretamente de $u$ até $w$ pelo caminho mais curto nunca pode ser pior do que ir de $u$ até $v$ e depois de $v$ até $w$.

O ponto técnico é lembrar que a concatenação de dois caminhos pode não ser um caminho, porque pode repetir vértices. Ela é, no mínimo, um passeio. Mas de todo passeio entre dois vértices pode-se extrair um caminho entre esses vértices com comprimento menor ou igual.

No item (b), a hipótese $d(u,v)\geq 2$ garante que há pelo menos um vértice interno em um caminho mais curto de $u$ até $v$. Esse vértice interno é o $z$ procurado.

Um erro comum é escolher qualquer vértice do grafo como $z$. O vértice $z$ precisa estar em um caminho mais curto de $u$ até $v$; caso contrário, a igualdade pode falhar.
