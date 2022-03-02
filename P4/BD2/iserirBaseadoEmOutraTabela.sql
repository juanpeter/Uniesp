CREATE TABLE Tabela2 (
    coluna1 int IDENTITY,
    coluna2 VARCHAR(40) NULL,
    coluna3 char(1) NULL,
    coluna4 VARCHAR(40) NULL
)

INSERT INTO Tabela2
SELECT nome, sexo, endereco
FROM funcionario
WHERE estcivil <> 'C'

SELECT * FROM Tabela