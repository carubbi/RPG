# Especificação — matrizes curriculares detalhadas de Computação

## Objetivo

Gerar duas matrizes curriculares detalhadas em Markdown a partir das páginas oficiais da Universidade de Fortaleza:

- `plan/matriz_curricular_engenharia_computacao.md`;
- `plan/matriz_curricular_ciencia_computacao.md`.

## Fontes

- Engenharia da Computação: <https://unifor.br/web/graduacao/engenharia-da-computacao>
- Ciência da Computação: <https://unifor.br/web/graduacao/ciencia-da-computacao>

Cada documento registrará a página de origem e a data de acesso.

## Estrutura dos documentos

Cada arquivo conterá:

1. título com o nome do curso;
2. fonte oficial e data de acesso;
3. disciplinas obrigatórias agrupadas por semestre;
4. uma lista de disciplinas em cada semestre;
5. para cada disciplina:
   - código e nome;
   - modalidade;
   - créditos;
   - ementa;
   - programa completo, organizado por unidades;
   - objetivos e conteúdos vinculados a cada unidade, quando publicados;
6. disciplinas optativas em seção separada, com a mesma estrutura;
7. observação de que o conteúdo retrata a matriz publicada na data de acesso.

Não serão usadas tabelas.

## Exclusões

Não serão incluídos:

- nomes, perfis ou currículos de professores;
- bibliografias básicas, complementares ou periódicos;
- textos promocionais ou informações gerais do curso.

## Normalização

- Preservar códigos, nomes, modalidades, créditos, ementas e programas publicados pela Unifor.
- Normalizar apenas espaços, capitalização evidentemente inconsistente e entidades HTML.
- Não inferir carga horária a partir dos créditos.
- Não preencher campos ausentes com valores presumidos.
- Quando a página não publicar uma ementa ou um programa, registrar explicitamente que a informação não foi disponibilizada na fonte.
- Organizar cada programa na mesma ordem de unidades, objetivos e conteúdos apresentada na página oficial.

## Validação

- Engenharia da Computação deve conter os dez semestres publicados.
- Ciência da Computação deve conter os oito semestres publicados.
- Todas as disciplinas obrigatórias e optativas identificadas no HTML devem aparecer uma única vez na seção correspondente.
- Cada disciplina deve conter modalidade, créditos, ementa e programa, ou uma indicação explícita de ausência na fonte.
- A ordem dos semestres, disciplinas, unidades, objetivos e conteúdos deve corresponder à página oficial.
- Os documentos não podem conter os termos estruturais “Professores” ou “Bibliografia”.
- Os documentos não podem conter tabelas Markdown.
- Os links das fontes devem permanecer válidos no Markdown.
