# Simples Aplicacao com a tecnologia REST, mapeando o ciclo de vida dos objetos.
0 - Vamos construir passo a passo uma aplicacao RESTful usando a tecnologia REST com Spring Boot, JPA, FlyWay, MySQL/SQL e testar as requisicoes REST com o POSTMAN.    

1 - Temos um esqueleto já pronto com algumas configuracoes feitas para ganharmos mais tempo com a produtividade lógica da Api, nossa Api é sobre cadastro de Aluno;

2 - Vamos criar uma classe de Eventos e uma classe para controlar a lista de eventos;
3 - Vamos criar uma classe génerica de erros com a classe Handler. (Um Handler é uma classe Java que implementa a interface javax.xml, criado para tratar erros), que será invocado por métodos CRUD da nossa Api. As classes serão: classe de Erro com as variaveis do tipo String (mensagemUsuario e mensagemDesenvolvedor), vamos tratar mensagens para os usuarios comuns e mensagem para os desenvolvedores a fim do desenvolvedor entender e tratar o erro e vamos criar uma lista de Erros;                                              

4 - Vamos criar uma classe modelo com o package de nome de model e criaremos a classe Aluno com suas anotacoes @Entity e @Table na matricula usaremos o @Id e @GeneratedValue(), no nome do Aluno vamos usar a anotacao @NotNull para que e entrada nao seja vazio sem caracteres digitados e @Size para que seja mapeado o minimo e máximo de caractes digitados, Getters e setters e Java Hash Equals para serializar a matricula do aluno;                                                                        

5 - Vamos criar uma classe de Interface para se comunicar com o Front-End da Api, essa classe será nosso repositório. Na classe Resource será invocado pela anotacao @AlunoRepository;        

6 - Vamos criar uma classe de Servico para controlar as acoes lógicas nos verbos GET(buscar) e PUT(atualizar), na classe Resource a classe servico será invocada pela anotacao @AlunoService;                                            

7 - Vamos criar uma classe Resource para controlar nossos métodos CRUD com @RestController e @RequestMapping, anotacoes invoacadas: @AlunoRepository, @AlunoService, @ApplicationEventPublisher invoca a classe Event e Listener, para controlar os métodos usaremos as anotacoes @GetMapping, @PostMapping, @PutMapping, @DeleteMapping, nos métodos GET/matricula que busca o aluno pela matricula, POST, PUT/matricula que atualiza o aluno pela matricula usaremos o ResponseEntity: que significa representar toda a resposta HTTP. Você pode controlar qualquer coisa que aconteça: código de status, cabeçalhos e corpo.;                                                      

8 - Vamos criar uma tabela em código SQL usando a migracao do Flyway, e vamos fazer um INSERT em nosso banco de dados, que tem o nome de aluno-api

9 - Vamos testar nossa Api com o POSTMAN que realiza o teste nos verbos GET(buscar), POST(criar), DELETE(excluir) e PUT(atualizar).
