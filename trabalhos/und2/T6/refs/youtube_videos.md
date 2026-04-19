# Referências para o T6

Estas referências ajudam a entender, em ordem, os conceitos usados no trabalho
de **Identificação de Isomorfismo em Árvores**.

## Ordem sugerida de estudo

1. introdução geral a algoritmos em árvores;
2. conceito de centro(s) de uma árvore;
3. ideia de isomorfismo em árvores;
4. implementação da codificação canônica.

## Materiais

### 1. Introdução a algoritmos em árvores

- **Vídeo:** `Introduction to tree algorithms | Graph Theory`
- **Link:** https://youtu.be/1XC3p2zBK34?si=XDT4W9Jp2tdeMV_o
- **Por que assistir:** apresenta a base conceitual sobre árvores, suas
  propriedades e o tipo de raciocínio usado em problemas estruturais.
- **Observe principalmente:** o que diferencia árvores de grafos gerais e por
  que a ausência de ciclos simplifica vários algoritmos.

### 2. Centro(s) de uma árvore

- **Vídeo:** `Tree center(s) | Graph Theory`
- **Link:** https://youtu.be/nzF_9bjDzdc?si=HF_X3Ov_k-YQV1Z2
- **Por que assistir:** o algoritmo de isomorfismo canônico depende de escolher
  corretamente o centro da árvore antes de gerar a codificação.
- **Observe principalmente:** o processo de remover folhas em camadas até
  restar um ou dois vértices centrais.

### 3. Isomorfismo em árvores

- **Vídeo:** `Identifying Isomorphic Trees | Graph Theory`
- **Link:** https://youtu.be/OCKvEMF0Xac?si=cB4Tk1n1WGmHNIFT
- **Por que assistir:** conecta a noção de centro com o problema de decidir se
  duas árvores têm a mesma estrutura, mesmo com rótulos diferentes.
- **Observe principalmente:** por que comparar apenas graus ou aparência visual
  não é suficiente para decidir isomorfismo.

### 4. Implementação de referência da codificação canônica

- **Código:** `Tree Isomorphism - Canonical Encoding`
- **Link:** https://github.com/williamfiset/Algorithms/blob/master/src/main/java/com/williamfiset/algorithms/graphtheory/treealgorithms/TreeIsomorphism.java
- **Por que consultar:** mostra uma implementação concreta da estratégia de:
  encontrar centros, enraizar a árvore, codificar subárvores e comparar os
  códigos gerados.
- **Observe principalmente:**
  - a função que encontra os centros;
  - a construção da árvore enraizada;
  - a ordenação dos códigos dos filhos;
  - a comparação final entre as codificações canônicas.

## Como essas referências se conectam ao T6

No trabalho, vocês devem implementar a seguinte sequência lógica:

1. ler duas árvores no formato `algs4`;
2. validar se cada entrada representa uma árvore;
3. encontrar o(s) centro(s);
4. gerar a codificação canônica;
5. comparar os códigos para decidir se as árvores são isomorfas.

Se estudarem as referências nessa ordem, o código deixa de parecer uma
"receita pronta" e passa a fazer sentido como construção algorítmica.
