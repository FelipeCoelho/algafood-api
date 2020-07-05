set foreign_key_checks = 0;

delete from cidade;
delete from cozinha;
delete from estado;
delete from forma_pagamento;
delete from grupo;
delete from grupo_permissao;
delete from permissao;
delete from produto;
delete from restaurante;
delete from restaurante_forma_pagamento;
delete from usuario;
delete from usuario_grupo;

set foreign_key_checks = 1;

alter table cidade auto_increment = 1;
alter table cozinha auto_increment = 1;
alter table estado auto_increment = 1;
alter table forma_pagamento auto_increment = 1;
alter table grupo auto_increment = 1;
alter table permissao auto_increment = 1;
alter table produto auto_increment = 1;
alter table restaurante auto_increment = 1;
alter table usuario auto_increment = 1;



insert into cozinha (id, nome) values (1, 'Tailandeza');
insert into cozinha (id, nome) values (2, 'Indiana'); 

insert into estado (id, nome) values (1,'São Paulo');
insert into estado (id, nome) values (2, 'Parana');

insert into cidade (id, nome, estado_id) values(1,'Araraquara',1);
insert into cidade (id, nome, estado_id) values(2,'São Paulo',1);
insert into cidade (id, nome, estado_id) values(3,'Ribeirão Preto',1);
insert into cidade (id, nome, estado_id) values(4,'Curitiba',2);
insert into cidade (id, nome, estado_id) values(5,'Cascavel',2);

insert into restaurante (nome, taxa_frete, cozinha_id, data_cadastro, data_atualizacao, endereco_cidade_id, endereco_cep, endereco_logradouro, endereco_numero, endereco_bairro) values('Thais Gourmet',10, 1, utc_timestamp, utc_timestamp, 1, '14806122', 'Rua Teste','1000','Centro');
insert into restaurante (nome, taxa_frete, cozinha_id, data_cadastro, data_atualizacao) values ('Thais Delivery', 9.50, 1, utc_timestamp, utc_timestamp);
insert into restaurante (nome, taxa_frete, cozinha_id, data_cadastro, data_atualizacao ) values ('Tuk Tuk comida Indiana',15, 2, utc_timestamp, utc_timestamp); 

insert into permissao (id, nome, descricao) values (1,'Administrador','Administrador do sistema');

insert into forma_pagamento(id,descricao) values (1,'Debito');
insert into forma_pagamento(id,descricao) values (2,'Credito');
insert into forma_pagamento(id,descricao) values (3,'Dinheiro');

insert into restaurante_forma_pagamento(restaurante_id, forma_pagamento_id) values (1,1), (1,2), (1,3) ,(2,3),(3,2) ,(3,3);
