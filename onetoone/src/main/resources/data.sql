insert into proprietario (codigo, nome, telefone) values (1, 'Fernando Martins', '34 9 1111 1111');
insert into proprietario (codigo, nome, telefone) values (2, 'Isabela Santos', '34 9 2222 2222');
insert into proprietario (codigo, nome, telefone) values (3, 'Ulisses Silva', '34 9 3333 3333');



-- insert into veiculo (codigo, fabricante, modelo) values (1, 'Fiat', 'Toro');
-- insert into veiculo (codigo, fabricante, modelo) values (2, 'Ford', 'Fiesta');
-- insert into veiculo (codigo, fabricante, modelo) values (3, 'VW', 'Gol');
insert into veiculo (codigo, fabricante, modelo, id_proprietario_fk) values (1, 'Fiat', 'Toro',1);
insert into veiculo (codigo, fabricante, modelo, id_proprietario_fk) values (2, 'Ford', 'Fiesta',2);
insert into veiculo (codigo, fabricante, modelo, id_proprietario_fk) values (3, 'VW', 'Gol',3);

