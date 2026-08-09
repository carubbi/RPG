# Goldbarg - Capítulo 5 - Exercício 10

## Enunciado de referência

Ver: `../../goldbarg.md`, Capítulo 5 - Exercício no 10.

## Resolução extraída do livro

Fonte: `livros/Goldbarg2012.pdf`, página 681-683.

```text
Exercício no 10
Este problema é conhecido como o problema do casamento estável. Ele pode ser modelado através de um
grafo bipartido direcionado completo G = (V1,V2,E,W), onde V1 representa o conjunto de n homens, V2 o de
n mulheres e W as preferências atribuídas aos arcos de E. O problema consiste em encontrar um matching M
no grafo subjacente de G tal que não exista h  V1 e m  V2, (h–m)  M, whm’ < whm e wmh’ < wmh, (h–m’)  M,
(m–h’)  M.
Um algoritmo com complexidade em tempo O(n2) foi apresentado por Gale e Shapley (1962), o qual é descrito
a seguir. O algoritmo faz uso das seguintes listas: MV1, MV2, Livre e C. O i-ésimo elemento da lista MV1
guarda o índice j da mulher comprometida com o homem i. De modo similar, o i-ésimo elemento da lista
MV2 guarda o índice j do homem comprometido com a mulher i. A lista Livre guarda os índices dos homens
livres e é controlada pelo contador c_livre. As preferências são expressas nas matrizes LV para os homens e LU
para mulheres. No caso dos homens, o elemento LV[i][j] guarda a mulher na j-ésima posição de preferência
do i-ésimo homem. No caso das mulheres, o elemento LU[i][j] guarda a ordem de preferência do homem j na
lista da mulher i. A lista C guarda para cada homem o índice da primeira mulher na sua lista de preferências
à qual o homem ainda não fez uma proposta.
Dados n, matrizes LV e LU
Para i ← 1 até n
MV1[i] ← 0; MV2[i] ← 0; // inicialização das listas de casamento
Livre[i] ← i // lista de homens livres controlada pelo contador c_livre
C[i] ← 1
Fim_para
c_livre ← n
Enquanto c_livre > 0 Faça
Homem ← Livre[1]

// a primeira mulher na lista de homem que não recebeu proposta
Mulher ← LV[Homem][C[Homem]]
Se MV2[Mulher] = 0
MV2[Mulher] ← Homem; MV1[Homem] ← Mulher
C[Homem] ← C[Homem] + 1
Livre[1] ← Livre[c_livre]
c_livre ← c_livre – 1
Senão
Aux ← MV2[Mulher]
Se LU[Mulher][Homem] > LU[Mulher][Aux]
MV2[Mulher] ← Homem; MV1[Homem] ← Mulher
C[Homem] ← C[Homem] + 1
Livre[1] ← Aux
Fim_se
Fim_se
Fim_enquanto
A
Casamento Estável
52  Gráﬁ cos
A execução do algoritmo casamento estável é exemplifi cada a seguir para um caso onde n = 4, com as listas de
preferências expressas nas matrizes LV e LU para homens e mulheres, respectivamente. Tomando a linha 1 da
matriz LV verifi ca-se que a mulher preferida pelo homem 1 é a 1 seguida da 2, da 3 e, em último lugar, da mulher
4. Tomando, agora, a linha 1 da matriz LU verifi ca-se que a mulher 1 prefere o homem 4 em primeiro lugar,
depois o 2, o 3 e, em último lugar, o homem 1.

O algoritmo inicia as listas de casamentos, MV1 = {0,0,0,0} e MV2 = {0,0,0,0}, que estão inicialmente vazias, e
a lista de homens disponíveis Livre = {1,2,3,4} com c_livre = 4. As variáveis de controle das listas de preferên-
cias dos homens está no vetor C = {1,1,1,1}, uma vez que nenhuma proposta foi feita.
1a iteração:
A variável Homem recebe valor 1, indicando que o primeiro homem fará uma proposta à primeira mulher
na sua lista de preferências à qual ele ainda não fez proposta. A variável Mulher recebe, portanto, o valor em
LV[1][1] = 1. A variável MV2[1] = 0 indicando que a mulher 1 ainda não tem um compromisso. Logo, o
algoritmo modifi ca as listas de casamento para MV1 = {1,0,0,0} e MV2 = {1,0,0,0}, indicando que existe
um compromisso entre o homem 1 e a mulher 1. O contador do homem 1 passa para 2, modifi cando a lista C
para {2,1,1,1}. O homem 1 é removido da lista Livre. Isto é feito em O(1) simplesmente copiando o último
elemento da lista para a posição 1 e decrescendo c_livre de 1 unidade. Depois disso a lista Livre torna-se
Livre = {4,2,3} e c_livre = 3. Como ainda existem homens na lista Livre, então o algoritmo continua.
2a iteração:
O homem 4 é agora considerado. A mulher na posição C[4] = 1 é a mulher 3, que também não está com-
prometida. As listas e variáveis de controle são modifi cadas como a seguir:
– MV1 = {1,0,0,3} e MV2 = {1,0,4,0}
– C = {2,1,1,2}
– Livre = {3,2} e c_livre = 2
3a iteração:
O próximo homem a ser considerado pelo algoritmo é o homem 3. A primeira preferência deste homem
é pela mulher 1, a qual já está comprometida. Portanto, o algoritmo entra no senão e a variável Aux recebe o
índice do homem que está atualmente comprometido com a mulher 1, sendo ele o homem 1 conforme a va-
riável MV2[Mulher]. O algoritmo testa, então, a preferência da mulher 1 entre os homens: 3 e 1. As variáveis
LU[1][3] = 3 e LU[1][1] = 4 mostram que o homem 3 é preferível em relação ao homem 1 para a mulher 1.
Assim o compromisso entre o homem 1 e a mulher 1 é desfeito e um novo compromisso entre o homem
3 e a mulher 1 é assumido. As listas e variáveis são mostradas abaixo:
– MV1 = {0,0,1,3} e MV2 = {3,0,4,0}
– C = {2,1,2,2}
– Livre = {1,2} e c_livre = 2
4a iteração:
O algoritmo prossegue considerando o homem 1 novamente. Sua segunda preferência é pela mulher
2, que não está comprometida. Assim as listas são alteradas pelo algoritmo para:
– MV1 = {2,0,1,3} e MV2 = {3,1,4,0}
– C = {3,1,2,2}
– Livre = {2} e c_livre = 1
5a iteração:
O algoritmo prossegue considerando o homem 2, o qual tem preferência pela mulher 4, que está livre. Nesta
iteração as listas se tornam:
– MV1 = {2,4,1,3} e MV2 = {3,1,4,2}
– C = {3,2,2,2}
– Livre = { } e c_livre = 0
Como c_livre = 0, o algoritmo é encerrado produzindo o matching indicado pelos pares (homem, mulher) a
seguir: (1-2), (2-4), (3-1) e (4-3).
```

![Resolução](<imgs/cap5_ex10_sol_p681_1.png>)

![Resolução](<imgs/cap5_ex10_sol_p682_2.png>)

![Resolução](<imgs/cap5_ex10_sol_p683_3.png>)
