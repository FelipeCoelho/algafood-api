insert into cozinha (id, nome) values (1, 'Tailandeza');
insert into cozinha (id, nome) values (2, 'Indiana'); 

insert into restaurante (nome, taxa_frete, cozinha_id) values('Thais Gourmet',10, 1);
insert into restaurante (nome, taxa_frete, cozinha_id) values('Thais Delivery', 9.50, 1);
insert into restaurante (nome, taxa_frete, cozinha_id) values('Tuk Tuk comida Indiana',15, 2); 

insert into estado (id, nome) values (1,'São Paulo');
insert into estado (id, nome) values (2, 'Parana');

insert into cidade (id, nome, estado_id) values(1,'Araraquara',1);
insert into cidade (id, nome, estado_id) values(2,'São Paulo',1);
insert into cidade (id, nome, estado_id) values(3,'Ribeirão Preto',1);
insert into cidade (id, nome, estado_id) values(4,'Curitiba',2);
insert into cidade (id, nome, estado_id) values(5,'Cascavel',2);

insert into permissao (id, nome, descricao) values (1,'Administrador','Administrador do sistema');