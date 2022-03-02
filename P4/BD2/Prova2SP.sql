-- Busca básica de dados de cliente
CREATE PROCEDURE buscarPacientePorCPF @cpf char(11)
AS
SELECT * FROM PACIENTE
WHERE CPF = @cpf

-- Retornar nome e posição de pacientes na fila em um determinado dia
CREATE PROCEDURE filaDePacientes @data DATE
AS
SELECT ck.POSICAO, p.NOME
FROM PACIENTE p
INNER JOIN CHECKIN ck
ON ck.CPF = p.CPF
WHERE CK.[DATA] = @data
ORDER BY ck.POSICAO