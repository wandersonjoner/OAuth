# Oauth Basic Autenticacao de acesso da aplicacao Aluno-api RESTful 

1 - Criaremos um pacote Config e uma classe de configuracao de seguranca com o Spring Security e OAuth com autenticacao básica;

2 - Usaremos dois (02) métodos. Um de autenticacao e outro de autorizacao:

3 - Autencicacao de login com USUÁRIO e SENHA de acordo com o papel(ROLES). Vamos atribuir os privilégios a estas Roles ao invés de atribuir aos usuários o GRANT como permissão à cada usuário deixando mais trabalhosa a construcao das permissões, nas próximas aulas iremos fazer autenticacao em Banco de Dados;

4 - Autorizacao de endereco http /PATH e acesso aos métodos / VERBOS Http, podendo restringir acesso de usuários aos métodos configurados da API RESTful

5 - Vamos invocar o método SessionManager que cria políticas de criação de sessão usando a funcionalidade Stateless que não precisa manter o estado das requisicoes anteriores.
