<img src="./imgs/UNIFOR_logo1b.png" width="400">

# Resolução de Problemas com Grafos

Orientador: Prof. Me Ricardo Carubbi

# Trabalho Prático 3

## Tema

Otimização em grafos ponderados e redes.

## Objetivo

Cada grupo deverá resolver um problema de otimização, adaptar a implementação de referência em Python ou Java, obter `Accepted`, manter um repositório autocontido e apresentar como a modelagem conduz ao algoritmo escolhido.

O T3 é uma única AP organizada em três classes de otimização. Cada classe mantém dez opções, totalizando trinta problemas. Os arquivos funcionam como bancos e requisitos específicos, não como avaliações independentes:

- **Árvore geradora mínima:** [banco de problemas de MST](T1/T1.md).
- **Caminhos mínimos:** [banco de problemas de caminhos mínimos](T2/T2.md).
- **Fluxo máximo:** [banco de problemas de fluxo](T3/T3.md).

Em cada oferta, aproximadamente dez problemas serão selecionados e atribuídos aos grupos. A seleção deverá equilibrar as classes, a dificuldade, a carga de adaptação e a profundidade de modelagem. As regras de acompanhamento, entrega, apresentação e pontuação pertencem exclusivamente a este documento.

## Acompanhamento processual

Todos os encontros práticos oferecidos antes da apresentação serão usados para acompanhamento. Cada grupo deverá manter evidências curtas e progressivas no repositório. A implementação de referência, as alterações e suas justificativas deverão ser registradas.

### Marco 1 — Formulação

- resumir o problema em linguagem própria;
- identificar entrada, saída, objetivo e restrições;
- definir vértices, arestas, direção e pesos ou capacidades;
- criar uma instância pequena.

### Marco 2 — Representação e validação

- justificar a representação computacional;
- representar a instância pequena;
- validar entrada e saída esperada;
- identificar preliminarmente a família do problema: árvore geradora mínima, caminho mínimo ou fluxo.

### Marco 3 — Escolha do algoritmo

- justificar Kruskal/Prim, Dijkstra ou Ford-Fulkerson/Edmonds-Karp conforme a classe;
- enunciar as condições de aplicabilidade;
- apresentar o invariante, propriedade ou operação central;
- estimar a complexidade.

Esse marco somente será exigido depois que cada família algorítmica for ensinada.

### Marco 4 — Adaptação e integração

Este marco ocorrerá depois do marco 3 da respectiva classe.

- integrar e adaptar a implementação de referência em Python ou Java;
- justificar as alterações realizadas;
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

## Progressão dos marcos por classe

- semana 14: marco 3 de MST;
- semana 15: marco 4 de MST; marcos 3 e 4 de caminhos mínimos;
- semana 16: marcos 3 e 4 de fluxo máximo;
- semana 17: marco 5 de todas as classes; marco 6 das turmas de quinta-feira;
- semana 18: marco 6 das turmas de quarta-feira.

## Entrega

A entrega será feita por um link de repositório público no GitHub informado no AVA/Moodle. A estrutura específica poderá seguir o banco da classe, mas deverá conter:

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

O `README.md` deverá explicar problema, integrantes, linguagem, execução, modelagem, algoritmo, implementação de referência, alterações, justificativas, correção esperada, complexidade, casos especiais e evidência do `Accepted`.

A linguagem será definida conforme a disponibilidade da implementação de referência informada pelo professor.

## Apresentação

Cada grupo terá até 5 minutos:

- até 1 minuto para problema e modelagem;
- até 2 minutos para estratégia algorítmica;
- até 1 minuto para complexidade e casos especiais;
- até 1 minuto para testes, resultado e conclusão.

O grupo não deverá ler código linha por linha. A apresentação deverá priorizar as decisões de modelagem e o raciocínio algorítmico.

## Avaliação da AP3

A AP3 será avaliada em escala de 0 a 10 e terá ponderação de 30% na AV3:

- **4,0 pontos:** acompanhamento processual e evidências dos seis marcos;
- **2,0 pontos:** solução adaptada, `Accepted`, organização e reprodutibilidade;
- **4,0 pontos:** apresentação, incluindo modelagem, estratégia, complexidade, casos especiais e comunicação.

A avaliação pelos alunos ouvintes terá função pedagógica e integrará o critério de comunicação, sem substituir a nota do professor.

O uso de IA deverá ser declarado no `README.md`. Cada integrante deverá compreender, justificar, testar e adaptar os artefatos utilizados.

## Equivalência entre classes

A dificuldade será controlada pela atribuição dos problemas e pela rubrica comum. Um grupo não será avaliado por conteúdos específicos de outra classe, mas todos deverão demonstrar o mesmo nível de domínio em modelagem, adaptação, análise e comunicação.

Antes da distribuição, o professor deverá verificar os links oficiais, excluir problemas que exijam como núcleo algoritmos não ensinados e registrar no AVA/Moodle o problema atribuído a cada grupo. A existência de trinta opções não autoriza distribuição aleatória.
