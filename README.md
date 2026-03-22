# T290

Material da disciplina **Resolução de Problemas com Grafos**.

## Estrutura

- `dataset/`: conjuntos de dados para exercícios e experimentos.
- `algs4-py/`: implementações em Python versionadas diretamente neste repositório.
- `und1/exs/`: lista de exercícios da Unidade 1, enunciados, imagens e respostas.
- `prof/`: materiais de apoio do professor.

## Acesso rápido

- [Lista da Unidade 1 (Markdown)](./und1/exs/lista_u1.md)
- [Lista da Unidade 1 (PDF)](./und1/exs/lista_u1.pdf)
- [README da Unidade 1](./und1/exs/README.md)

## Observações

- Arquivos de dataset acima de 100 MB não são aceitos pelo GitHub e estão no `.gitignore`.
- Para trabalhar com arquivos grandes, use armazenamento externo ou Git LFS.
- Há um hook versionado em `.githooks/pre-commit` que bloqueia commits com arquivos staged acima de 50 MiB.
- Para ativá-lo neste clone: `git config core.hooksPath .githooks`
