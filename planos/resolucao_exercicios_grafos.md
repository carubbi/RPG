# Plano de Resolução Didática de Exercícios de Grafos

Este plano define o padrão para resolver exercícios de teoria dos grafos neste projeto, especialmente questões baseadas em figuras.

## Objetivo

Produzir respostas didáticas, verificáveis e autossuficientes, sem depender de código na exposição da solução. Ferramentas da `.venv` podem ser usadas apenas como apoio operacional, por exemplo para recortar imagens ou conferir resultados internamente.

## Fluxo de trabalho

1. Ler o enunciado e identificar o tipo de questão:
   - grafo em imagem;
   - prova teórica;
   - construção de exemplo;
   - modelagem;
   - execução conceitual de algoritmo.
2. Para questões com imagem, inserir a imagem no início da seção de leitura do grafo e propor primeiro a leitura do grafo.
3. Quando uma figura contiver vários grafos, gerar recortes individuais com ferramentas da `.venv`, preferencialmente `Pillow`, e salvar os arquivos em uma pasta `imgs/` próxima às respostas.
4. Inserir cada recorte antes da lista de adjacência correspondente.
5. Quando a figura não tiver rótulos de vértices, declarar a regra de rotulação adotada antes da lista de adjacência.
6. Representar o grafo por lista de adjacência no formato linear:

```text
v1: v2 v3
v2: v1
```

7. Quando houver rótulos de arestas necessários para preservar laços, paralelas ou ambiguidade, usar:

```text
v1: v1(e1) v2(e2) v2(e3)
v2: v1(e2) v1(e3)
```

8. Aguardar aprovação explícita da lista de adjacência antes de escrever a resolução.
9. Após a aprovação, escrever:
   - estratégia de resolução;
   - resolução detalhada;
   - resposta final;
   - comentários didáticos completos.
10. Depois que a resolução estiver pronta, remover:
   - seções `Observações:` usadas apenas para validação da leitura;
   - marcações como `Lista de adjacência aprovada`.
11. Em provas ou construções sem imagem, inserir diagramas Mermaid quando eles ajudarem a visualizar uma hipótese, uma contradição, uma construção explícita ou a atingibilidade de uma cota.
12. Em exercícios eulerianos, separar a verificação de existência da construção do percurso:
   - para decidir se existe circuito de Euler, usar primeiro o critério dos graus;
   - para construir explicitamente um circuito de Euler, preferir o algoritmo de Hierholzer;
   - mencionar Fleury apenas como alternativa didática quando fizer sentido, pois sua execução manual exige verificar pontes durante o percurso.

## Notação

- Usar LaTeX com `$...$` para notação matemática em linha.
- Usar `$$...$$` apenas para expressões destacadas.
- Usar notação consistente:
  - $V(G)$ para conjunto de vértices;
  - $E(G)$ para conjunto de arestas;
  - $d(v)$ ou $\deg(v)$ para grau;
  - $d(u,v)$ para distância;
  - passeio: sequência de vértices adjacentes, com repetição permitida;
  - trilha: passeio sem repetição de arestas;
  - caminho: passeio sem repetição de vértices;
  - ciclo: caminho fechado, sem repetição de vértices exceto início/fim.

## Comentários didáticos

Separar claramente a função de `Estratégia de resolução` e `Comentários didáticos`.

- `Estratégia de resolução` deve ser curta e operacional: explicar qual é o plano da solução.
- `Comentários didáticos` deve ser conceitual: explicar a teoria subjacente, as armadilhas e como verificar ou generalizar o raciocínio.

Os comentários didáticos devem ser completos. Incluir, quando aplicável:

- teoria subjacente ao exercício;
- definições dos conceitos usados;
- diferença entre conceitos próximos;
- justificativa de validade das sequências;
- erros comuns;
- forma de verificar a resposta manualmente;
- efeito de laços, arestas paralelas, vértices pendentes e articulações;
- indicação de que há múltiplas respostas possíveis quando for o caso.

## Critérios de qualidade

- A lista de adjacência deve ser fiel à figura e aprovada antes da resolução.
- Toda questão baseada em imagem deve exibir a imagem ou o recorte correspondente antes da lista de adjacência.
- Em multigrafos, preservar multiplicidade repetindo o vizinho e identificando a aresta.
- Em grafos com laço, registrar o próprio vértice como vizinho de si mesmo.
- Em figuras sem rótulos de vértices, adotar uma regra simples de rotulação. Preferir faixas horizontais: primeiro os vértices da linha superior, da esquerda para a direita; depois repetir o critério nas linhas abaixo, de cima para baixo.
- Em figuras sem rótulos de vértices, declarar claramente a regra de rotulação adotada.
- A resposta final deve ser curta e verificável.
- A solução deve ser compreensível sem consultar código.
- Diagramas Mermaid em provas devem apoiar o argumento, não substituir a demonstração matemática.

## Questões teóricas ou construtivas sem imagem

Para exercícios sem grafo em imagem, usar o seguinte padrão:

```md
# 3ª Lista - Exercício X

## 1. Tipo de questão

Questão teórica / questão construtiva / questão de prova.

## 2. Estratégia de resolução

Explicar de forma curta qual é o plano da solução, como argumento por contradição, construção explícita, uso de conectividade, ciclos, graus, componentes ou distância.

## 3. Resolução detalhada

Para prova:
- declarar a hipótese;
- mostrar o que aconteceria se a conclusão fosse falsa;
- derivar a contradição ou a conclusão.

Para construção:
- definir claramente $V(G)$ e $E(G)$;
- justificar que o grafo construído satisfaz cada condição do enunciado;
- inserir um Mermaid quando o desenho tornar a construção ou a verificação mais clara.

Para prova:
- inserir um Mermaid quando ele ajudar a ilustrar uma hipótese extrema, uma contradição ou um exemplo que atinge uma cota;
- manter a prova matemática explícita após o diagrama.

Para exercícios de Euler:
- verificar conectividade e paridade dos graus antes de construir o percurso;
- se todos os vértices tiverem grau par, construir o circuito por Hierholzer quando o enunciado pedir um circuito explícito;
- se houver vértices de grau ímpar, explicar que Hierholzer e Fleury não se aplicam como algoritmos de construção de circuito euleriano;
- em problemas do carteiro chinês, primeiro duplicar caminhos mínimos entre vértices de grau ímpar para tornar o multigrafo euleriano; depois usar Hierholzer para obter o circuito final.

## 4. Resposta final

Resposta curta, direta e verificável.

## 5. Comentários didáticos

Explicar:
- a teoria subjacente ao exercício;
- por que a estratégia funciona;
- qual é o erro comum;
- como verificar a resposta;
- quais detalhes do enunciado são essenciais.
```

Exemplos de classificação:
- Exercício sobre tamanhos de componentes: prova teórica, normalmente baseada no princípio da casa dos pombos.
- Exercício pedindo “dê um exemplo”: questão construtiva; exige descrição explícita de $V(G)$ e $E(G)$ e verificação das propriedades pedidas.
