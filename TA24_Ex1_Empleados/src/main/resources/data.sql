drop table if exists empleado;

create table empleado(
    id int auto_increment,
    nomApels varchar(250) not null,
    trabajo int,
    salario int
);

insert into empleado(nomApels, trabajo, salario) values ('Pablo_Lopez', 0, 1050);
insert into empleado(nomApels, trabajo, salario) values ('Miguel_Garcia', 0, 1050);
insert into empleado(nomApels, trabajo, salario) values ('Angel_Guimera', 1, 1100);
insert into empleado(nomApels, trabajo, salario) values ('Lluis_Companys', 2, 1400);
insert into empleado(nomApels, trabajo, salario) values ('Paco_Alfonso', 1, 1100);