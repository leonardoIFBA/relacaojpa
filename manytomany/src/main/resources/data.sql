insert into veiculo (codigo, fabricante, modelo) values (1, 'Fiat', 'Toro');
insert into veiculo (codigo, fabricante, modelo) values (2, 'Ford', 'Fiesta');
insert into veiculo (codigo, fabricante, modelo) values (3, 'VW', 'Gol');

-- testando o many-to-many
insert into acessorio (codigo, descricao) values (1, 'Direção hidráulica');
insert into acessorio (codigo, descricao) values (2, 'Alarme');
insert into acessorio (codigo, descricao) values (3, 'Ar condicionado');
insert into acessorio (codigo, descricao) values (4, 'Bancos de couro');
insert into veiculo_acessorio (veiculo_codigo, acessorio_codigo) values (1, 1);
insert into veiculo_acessorio (veiculo_codigo, acessorio_codigo) values (1, 2);
insert into veiculo_acessorio (veiculo_codigo, acessorio_codigo) values (1, 3);
insert into veiculo_acessorio (veiculo_codigo, acessorio_codigo) values (1, 4);