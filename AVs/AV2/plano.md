# Plano Atualizado: Converter AV2 Para o Padrão da AV1

## Resumo

Converter `AVs/AV2/AV2.md` para o padrão estrutural de `AVs/AV1/AV1.md`, mantendo as 12 questões atuais.

Não alterar `AVs/AV2/_local/orientacao_estudo_av2.md`.

## Itens Já Concluídos

- Remoção das notas internas de construção.
- Conversão das alternativas de `A.`-`E.` para `a)`-`e)` com `<br>`.
- Correção de `índice cromático` para `número cromático` na Q10.

## Agrupamentos Temáticos

### Busca, Percursos e Conectividade

- Q1 BFS.
- Q2 DFS.
- Q3 Classificação de percursos.
- Q4 Componentes conexas, pontes e articulações.

### Eulerização e Circuitos

- Q5 Grafos eulerianos.
- Q6 Hierholzer/Fleury.
- Q9 Carteiro chinês.

### Hamilton, Tours e Otimização

- Q7 Grafos hamiltonianos.
- Q8 TSP.

### Modelagem Estrutural de Grafos

- Q10 Coloração.
- Q11 Isomorfismo.
- Q12 Emparelhamento.

## Mudanças Pendentes

- Alterar o título para `# Questões AV2`.
- Inserir `## Orientações importantes`, adaptada da AV1.
- Inserir os 4 agrupamentos temáticos no arquivo da prova.
- Reformatar cada questão no padrão:
  - `### Questão N (X,XX ponto)`.
  - `#### Nome da Questão`.
  - `#### Contexto da Questão`.
  - `#### Enunciado`.
  - `#### Alternativas de Resposta`.
  - `#### Resposta Correta`.
  - `#### Feedback Geral`.
  - `#### Feedback por Alternativa`.
- Manter listas de adjacência, matrizes e tabelas em Markdown.

## Pontuação

Usar total de `4,00 pontos`:

- Q1 BFS: `0,25`.
- Q2 DFS: `0,25`.
- Q3 Percursos: `0,30`.
- Q4 Componentes/pontes: `0,30`.
- Q5 Eulerianos: `0,30`.
- Q6 Hierholzer/Fleury: `0,35`.
- Q7 Hamiltonianos: `0,35`.
- Q8 TSP: `0,35`.
- Q9 Carteiro chinês: `0,50`.
- Q10 Coloração: `0,40`.
- Q11 Isomorfismo: `0,30`.
- Q12 Emparelhamento: `0,35`.

## Teste de Aceitação

- Apenas `AVs/AV2/AV2.md` deve ser alterado nas próximas etapas de conversão da prova.
- `AVs/AV2/_local/orientacao_estudo_av2.md` deve permanecer sem mudanças.
- A AV2 deve ficar organizada nos 4 blocos temáticos definidos.
- As 12 questões devem continuar presentes.
- Cada questão deve seguir o formato de `AVs/AV1/AV1.md`.
- Não deve haver notas internas de construção no arquivo final da prova.
- Todas as alternativas devem estar no formato `a)`-`e)` com `<br>`.
- Q10 deve usar `número cromático`.
- A soma das pontuações deve ser `4,00`.
