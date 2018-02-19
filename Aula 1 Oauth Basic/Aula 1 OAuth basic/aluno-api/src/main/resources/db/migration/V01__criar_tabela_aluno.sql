CREATE TABLE aluno(

	matricula BIGINT(30) PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(50)


)Engine=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO aluno(nome) values('Joao Carlos');
INSERT INTO aluno(nome) values('Bruno de Almeida');
INSERT INTO aluno(nome) values('Jose Borges');
INSERT INTO aluno(nome) values('Jon Jon');