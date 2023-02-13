drop database if exists cadastro;
create database if not exists cadastro;

use cadastro;

create table pessoa(
id int(3) primary key auto_increment,
nome varchar(40) not null,
apelido varchar(20),
email varchar(50) not null,
cpf varchar(11) not null,
rg varchar(9) not null,
nascimento date not null,
id_empresa int(3) not null,
cargo varchar(20) not null,
subordinado int(3),
foto blob,
celular varchar(12)  not null,
MFA
Centro de Custo
Departamento
Divisão
Perfil

);

create table empresa(
id int(3) primary key auto_increment,
razao varchar(20) not null,
fantasia varchar(30),
cnpj varchar(14) not null,
ie
im
endereco int(3) not null,
logo blob
);

