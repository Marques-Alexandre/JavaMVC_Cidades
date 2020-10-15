use poolibertas;

create table cidade (
	idcidade int not null auto_increment,
    nome varchar(55) not null,
    primary key(idcidade)
);
insert into cidade(nome)
values('São Sebastião do Paraíso'),
      ('Passos'),
      ('Franca'),
      ('Ribeirão Preto'),
      ('São Paulo'),
      ('Jacuí'),
      ('Itamogi'),
      ('Varginha'),
      ('Manaus'),
      ('Porto Alegre'),
      ('Fortaleza'),
      ('Cuiabá');
      