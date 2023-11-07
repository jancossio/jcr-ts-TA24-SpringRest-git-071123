drop table if exists empleado;

create table empleado(
    id int auto_increment,
    nom_Apel varchar(250) not null,
    trabajo int,
    salario int
);

insert into empleado(nom_Apel, trabajo, salario) values ('Pablo Lopez', 0, 1050);
insert into empleado(nom_Apel, trabajo, salario) values ('Miguel Garcia', 0, 1050);
insert into empleado(nom_Apel, trabajo, salario) values ('Angel Guimera', 1, 1100);
insert into empleado(nom_Apel, trabajo, salario) values ('Lluis Companys', 2, 1400);
insert into empleado(nom_Apel, trabajo, salario) values ('Paco Alfonso', 1, 1100);