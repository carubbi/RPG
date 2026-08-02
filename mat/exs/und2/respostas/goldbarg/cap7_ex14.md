# Goldbarg - Capítulo 7 - Exercício 14

## Enunciado de referência

Ver: `../../goldbarg.md`, Capítulo 7 - Exercício no 14.

## Resolução extraída do livro

Fonte: `livros/Goldbarg2012.pdf`, página 701-703.

```text
Exercício no 14
O grafo abaixo resume os testemunhos dos professores. Um arco de A para B signifi ca que A afi rma ter visto
B. Observando-se o grafo, verifi ca-se que realmente alguém está mentido, uma vez que grafos de intervalo
não possuem ciclos de tamanho 4.
72  Gráﬁ cos
É possível observar o problema no esquema que se segue. Estão envolvidos os professores Alberto, Beto, Ida e
Denis. Os intervalos de tempo na biblioteca relativos aos professores Alberto, Beto e Denis não permitem que
a professora Ida possa ter estado na biblioteca.
Não seria possível aos professores Beto e Denis verem Ida e Alberto simultaneamente sem que Ida observas-
se Alberto ou Alberto observasse Ida, uma vez que Beto e Denis não se observaram mutuamente.
Existem quatro ciclos de quatro pessoas:
{A, B, I, D}    {A, D, I, E}    {A, D, C, E}
Um dos quatro no ciclo {A, B, I, D}, Alberto, Beto, Ida e Denis, está mentindo. Com isso sabe-se que Eduar-
do e Cristina falam a verdade.
Um dos quatro professore no ciclo {A, D, C, E}, Alberto, Denis, Cristina e Eduardo, está mentindo. Com isso
sabe-se que Beto e Ida falam a verdade.
Um dos quatro professores do ciclo {A, D, I, E} estão mentindo. Com isso sabe-se que Beto e Cristina
falam a verdade.
Restam como suspeitos Denis e Alberto.
Se Alberto é o mentiroso e Denis fala a verdade {A, B, I, D}, continua sendo um ciclo inviável, como se
pode observar na fi gura que se segue.
Grafo com ciclo de comprimento 4
Portanto, o mentiroso é Denis.
```

![Resolução](<imgs/cap7_ex14_sol_p701_1.png>)

![Resolução](<imgs/cap7_ex14_sol_p702_2.png>)

![Resolução](<imgs/cap7_ex14_sol_p703_3.png>)
