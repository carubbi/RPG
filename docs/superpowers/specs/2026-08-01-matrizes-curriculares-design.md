# Especificação — matrizes curriculares de Computação

## Objetivo

Gerar duas matrizes curriculares sintéticas em Markdown a partir das páginas oficiais da Universidade de Fortaleza:

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
4. uma tabela Markdown por semestre, com:
   - código;
   - disciplina;
   - modalidade;
   - créditos;
5. disciplinas optativas em seção separada, com as mesmas colunas;
6. observação de que o conteúdo retrata a matriz publicada na data de acesso.

## Exclusões

Não serão incluídos:

- nomes, perfis ou currículos de professores;
- bibliografias básicas, complementares ou periódicos;
- ementas;
- programas e conteúdos detalhados;
- textos promocionais ou informações gerais do curso.

## Normalização

- Preservar códigos, nomes, modalidades e créditos publicados pela Unifor.
- Normalizar apenas espaços, capitalização evidentemente inconsistente e entidades HTML.
- Não inferir carga horária a partir dos créditos.
- Não preencher campos ausentes com valores presumidos.

## Validação

- Engenharia da Computação deve conter os dez semestres publicados.
- Ciência da Computação deve conter os oito semestres publicados.
- Todas as disciplinas obrigatórias e optativas identificadas no HTML devem aparecer uma única vez na seção correspondente.
- Os documentos não podem conter os termos estruturais “Professores” ou “Bibliografia”.
- Os links das fontes devem permanecer válidos no Markdown.
