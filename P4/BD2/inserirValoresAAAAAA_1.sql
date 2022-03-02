CREATE TABLE Tabela3 (
    pedido SMALLINT
        CONSTRAINT PK_tabela3 PRIMARY KEY,
    cliente VARCHAR(40) NULL,
    vendedor VARCHAR(40) NULL
)

INSERT INTO Tabela3
SELECT p.codigo, c.nome, f.nome
FROM pedido p
JOIN cliente c ON c.codigo = p.cliente
JOIN funcionario f ON f.codigo = p.vendedor

select * from Tabela3