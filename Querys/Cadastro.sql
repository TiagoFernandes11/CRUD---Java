drop database if exists cliente;

create database cliente;

use cliente;

CREATE TABLE `Cliente` (
	`id` INT(3) NOT NULL AUTO_INCREMENT,
	`nome` varchar(40) NOT NULL,
	`senha` varchar(30) NOT NULL,
	`id_endereco` INT(3) NOT NULL UNIQUE,
	`id_contato` INT(3) NOT NULL UNIQUE,
	PRIMARY KEY (`id`)
);

CREATE TABLE `Endereco` (
	`id` INT(3) NOT NULL AUTO_INCREMENT,
	`cep` VARCHAR(8) NOT NULL UNIQUE,
	`rua` varchar(50) NOT NULL,
	`bairro` varchar(50) NOT NULL,
	`numero` INT(5) NOT NULL,
	`complemento` varchar(20),
	PRIMARY KEY (`id`)
);

CREATE TABLE `Contato` (
	`id` INT(3) NOT NULL AUTO_INCREMENT,
	`celular` VARCHAR(11) UNIQUE,
	`residencial` VARCHAR(11) UNIQUE,
	`email` varchar(30) NOT NULL UNIQUE,
	PRIMARY KEY (`id`)
);

ALTER TABLE `Cliente` ADD CONSTRAINT `Cliente_fk0` FOREIGN KEY (`id_endereco`) REFERENCES `Endereco`(`id`);

ALTER TABLE `Cliente` ADD CONSTRAINT `Cliente_fk1` FOREIGN KEY (`id_contato`) REFERENCES `Contato`(`id`);

INSERT INTO CONTATO VALUES(null, 'xxxxxx', 'xxxxxx', 'xxxxxxxx@xxxx.xxx.xxx');

INSERT INTO ENDERECO VALUES(null, 'xxxxxxxxxxx', 'rua fabio', 'centro', 1250, 'Aoartamento numero 50');

INSERT INTO CLIENTE VALUES(null, 'Rogério', 'umasenha', 1, 1);

SELECT * FROM CLIENTE cl
INNER JOIN ENDERECO e
ON cl.id_endereco = e.id
INNER JOIN CONTATO co
ON cl.id_contato = co.id;



