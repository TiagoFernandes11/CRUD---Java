drop database if exists cadastro;
create database if not exists cadastro;

use cadastro;

create table pessoas(
id int(3) primary key auto_increment,
nome varchar(40),
apelido varchar(20),
email varchar(50),
cpf varchar(11),
rg varchar(9),
nascimento date,
id_empresa int(3), 
cargo varchar(20),
subordinado int(3),
foto blob,
celular varchar(12),
MFA
Centro de Custo
Departamento
Divisão
Perfil

);

create table empresas(
);

