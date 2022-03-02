CREATE TABLE Tabela1 (
    coluna1 int IDENTITY,
    coluna2 varchar(40) NOT NULL
        CONSTRAINT DF_col2_tab1 DEFAULT ('Valor default'),
    coluna3 int NULL,
    coluna4 varchar(30) NOT NULL
)

INSERT INTO Tabela1 (coluna4) VALUES ('valor 1-4')

INSERT INTO Tabela1 (coluna2, coluna4) VALUES ('Valor 2-2', 'valor 2-4')

INSERT INTO Tabela1 (coluna2, coluna3, coluna4) VALUES ('valor 3-2', 33, 'valor 3-4')

INSERT INTO Tabela1 DEFAULT VALUES

SELECT * FROM Tabela1