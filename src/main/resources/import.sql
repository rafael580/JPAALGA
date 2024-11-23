INSERT INTO produto (id,nome,preco,descricao) VALUES (1,'Kindle',499.1,'Conheça o novo Kindle, agora com novas definições');
insert into produto (id, nome, preco, descricao) values (3, 'Câmera GoPro Hero 7', 1400.0, 'Desempenho 2x melhor.');

INSERT INTO cliente (id,nome,sexo_cliente)  VALUES  (1,'rafael','MASCULINO');

INSERT INTO pedido  (id,cliente_id,total,status) VALUES (2,1,232.00,'CANCELADO');
insert into pedido (id, cliente_id, data_pedido, total, status) values (3, 1, sysdate(), 100.0, 'AGUARDANDO');

INSERT INTO item_pedido (id,pedido_id,produto_id,preco_produto,quantidade) VALUES (1,2,1,440.00,1);

INSERT INTO categoria (id,nome) VALUES (1,"digital")

INSERT INTO produto_categoria (produto_id,categoria_id) VALUES (1,1)

INSERT INTO pagamento_cartao (id,pedido_id,status,numero) VALUES (1,2,'PROCESSANDO','12')