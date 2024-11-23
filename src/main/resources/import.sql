INSERT INTO produto (id,nome,preco,descricao) VALUES (1,'Kindle',499.1,'Conheça o novo Kindle, agora com novas definições');
INSERT INTO cliente (id,nome,sexo_cliente)  VALUES  (1,'rafael','MASCULINO');
INSERT INTO pedido  (id,cliente_id,nota_fiscal,total,status) VALUES (2,1,1,232.00,'CANCELADO');
INSERT INTO item_pedido (id,pedido_id,produto_id,preco_produto,quantidade) VALUES (1,2,1,440.00,1);