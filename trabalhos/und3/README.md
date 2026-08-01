# Resolução de Problemas com Grafos

Orientador: Prof. Me Ricardo Carubbi

## Trabalho Prático 3 — T3

## Tema

Otimização em grafos ponderados e redes.

## Objetivo

Cada grupo deverá resolver um problema de otimização, implementar a solução em Python ou Java, obter `Accepted`, manter um repositório autocontido e apresentar como a modelagem conduz ao algoritmo escolhido.

O T3 é uma única AP organizada em três trilhas. Os arquivos de cada trilha funcionam como bancos de problemas e requisitos específicos, não como avaliações independentes:

- **Trilha A — Árvore geradora mínima:** [banco de problemas de MST](T1/T1.md).
- **Trilha B — Caminhos mínimos:** [banco de problemas de Dijkstra](T2/T2.md).
- **Trilha C — Fluxo máximo:** [banco de problemas de fluxo](T3/T3.md).

Para 2026.2, as regras de acompanhamento e a pontuação deste documento prevalecem sobre valores isolados registrados nos bancos de problemas.

## Acompanhamento processual

Todos os encontros práticos oferecidos antes da apresentação serão usados para acompanhamento. Cada grupo deverá manter evidências curtas e progressivas no repositório.

### Marco 1 — Formulação

- resumir o problema em linguagem própria;
- identificar entrada, saída, objetivo e restrições;
- definir vértices, arestas, direção e pesos ou capacidades;
- criar uma instância pequena.

### Marco 2 — Representação e execução manual

- justificar a representação computacional;
- executar manualmente a ideia central do algoritmo na instância pequena;
- registrar estados intermediários relevantes;
- verificar a resposta da instância.

### Marco 3 — Escolha do algoritmo

- justificar Kruskal/Prim, Dijkstra ou Ford-Fulkerson/Edmonds-Karp conforme a trilha;
- enunciar as condições de aplicabilidade;
- apresentar o invariante, propriedade ou operação central;
- estimar a complexidade.

### Marco 4 — Implementação

- implementar a lógica principal em Python ou Java;
- manter no repositório todas as dependências diretas;
- não usar biblioteca externa que resolva o problema;
- registrar uma execução reproduzível.

### Marco 5 — Testes e análise

- testar a instância pequena;
- testar casos-limite e casos de impossibilidade quando aplicáveis;
- diagnosticar divergências entre resultado esperado e produzido;
- revisar complexidade de tempo e memória.

### Marco 6 — Submissão e comunicação

- obter `Accepted` na plataforma;
- finalizar o `README.md`;
- disponibilizar evidência da submissão;
- preparar e ensaiar a apresentação.

## Entrega

A entrega será feita por um link de repositório público no GitHub informado no AVA/Moodle. A estrutura específica poderá seguir o banco da trilha, mas deverá conter:

```text
T3/
├── README.md
├── acompanhamento/
│   └── marcos.md
├── src/
│   ├── Main.java | main.py
│   └── classes ou módulos necessários
├── evidencias/
│   └── accepted.png | accepted.pdf
├── apresentacao/
│   └── apresentacao.pdf | apresentacao.md | link_google_docs.txt
└── dados/
    └── casos-de-teste.txt
```

O `README.md` deverá explicar problema, integrantes, linguagem, execução, modelagem, algoritmo, correção esperada, complexidade, casos especiais e evidência do `Accepted`.

## Apresentação

Cada grupo terá até 5 minutos:

- até 1 minuto para problema e modelagem;
- até 2 minutos para estratégia algorítmica;
- até 1 minuto para complexidade e casos especiais;
- até 1 minuto para testes, resultado e conclusão.

O grupo não deverá ler código linha por linha. A apresentação deverá priorizar as decisões de modelagem e o raciocínio algorítmico.

## Avaliação da AP3

A AP3 será avaliada em escala de 0 a 10 e terá ponderação de 80% na AV3:

- **2,0 pontos:** acompanhamento processual e evidências dos seis marcos;
- **4,0 pontos:** correção, `Accepted`, organização e reprodutibilidade;
- **4,0 pontos:** apresentação, incluindo modelagem, estratégia, complexidade, casos especiais e comunicação.

A avaliação pelos alunos ouvintes terá função pedagógica e integrará o critério de comunicação, sem substituir a nota do professor.

## Equivalência entre trilhas

A dificuldade será controlada pela atribuição dos problemas e pela rubrica comum. Um grupo não será avaliado por conteúdos específicos de outra trilha, mas todos deverão demonstrar o mesmo nível de domínio em modelagem, implementação, análise e comunicação.
