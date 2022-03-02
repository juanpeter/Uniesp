-- Selecionar todos os pacientes que tiveram uma consulta no dia 12 de março de 2021
SELECT p.NOME, c.[DATA] 
FROM CONSULTA c
INNER JOIN PACIENTE p
ON p.CPF = c.CPF
WHERE c.DATA = '12-03-2021'

-- Selecionar os valores dos pagamentos no mês de fevereiro que foram feitos por convênios
SELECT pg.VALOR
FROM CONSULTA c
INNER JOIN PAGAMENTO pg
ON c.ID_PAGAMENTO = pg.ID_PAGAMENTO
where EXTRACT(MONTH FROM c.[DATA]) = 2
AND pg.ID_CONVENIO IS NOT NULL

-- Selecionar todos os médicos que receitaram "Benadril" no mês de agosto
SELECT md.NOME, c.ID_CONSULTA
FROM MEDICO md
INNER JOIN CONSULTA c
ON md.CRM = c.CRM
INNER JOIN PRONTUARIO p
ON c.ID_PRONTUARIO = p.ID_PRONTUARIO
INNER JOIN RECEITA rc
ON rc.ID_RECEITA = p.ID_RECEITA
WHERE rc.MEDICAMENTO = 'Benadril'
AND EXTRACT(MONTH FROM c.[DATA]) = 8

-- Contar quantos pacientes foram consultados entre os meses de janeiro e julho
SELECT COUNT(DISTINCT(p.NOME))
FROM PACIENTE p
INNER JOIN CONSULTA c
ON c.CPF = p.CPF
WHERE EXTRACT(MONTH FROM c.[DATA]) between 1 and 7

-- Checar quantos pacientes irão retornar para o consultório no dia 31 de janeiro de 2021
SELECT COUNT(DISTINCT(p.NOME))
FROM PACIENTE p
INNER JOIN CONSULTA c
ON c.CPF = p.CPF
INNER JOIN RETORNO rt
ON c.ID_RETORNO = rt.ID_RETORNO
WHERE rt.[DATA] = '31-01-2021'

-- Retornar, em ordem da fila, todos os os pacientes na fila de checkin no dia 2 de fevereiro de 2021
SELECT p.NOME, ck.POSICAO
FROM PACIENTE p
INNER JOIN CHECKIN ck
ON ck.CPF = p.CPF
WHERE CK.[DATA] = '02-02-2021'
ORDER BY ck.POSICAO

-- Encontrar todos os pacientes que sofrem de diabetes
SELECT p.NOME, CID.DOENCA
FROM PACIENTE p
INNER JOIN CONSULTA c
ON c.CPF = p.CPF
INNER JOIN PRONTUARIO pr
ON c.ID_PRONTUARIO = pr.ID_PRONTUARIO
INNER JOIN CID
ON CID.CID = pr.CID
WHERE CID.DOENCA = 'Diabetes'

-- Retornar todas as consultas que foram pagas de forma particular, junto com os nomes dos pacientes
SELECT p.NOME, pg.VALOR
FROM PAGAMENTO pg
INNER JOIN CONSULTA c
ON c.ID_PAGAMENTO = pg.ID_PAGAMENTO
INNER JOIN PACIENTE p
ON p.CPF = c.CPF
WHERE pg.ID_PG_PARTICULAR IS NOT NULL

-- Encontrar todos os pacientes atendidos pelo doutor Marcos, entre os meses de abril a junho
SELECT c.[DATA], p.NOME
FROM CONSULTA c
INNER JOIN PACIENTE p
ON c.CPF = p.CPF
INNER JOIN MEDICO m
ON c.CRM = m.CRM
WHERE m.NOME = 'Marcos'

-- Encontrar todos os médicos especializados em pressão alta e quantas vezes eles receitaram o medicamento 'lisinopril'
SELECT m.NOME, COUNT(R.MEDICAMENTO)
FROM MEDICO m
INNER JOIN CONSULTA c
ON m.CRM = c.CRM
INNER JOIN PRONTUARIO pr
ON pr.ID_PRONTUARIO = c.ID_PRONTUARIO
INNER JOIN RECEITA r
ON pr.ID_RECEITA = r.ID_RECEITA
WHERE m.ESPECIALIDADE = 'Pressão alta'
AND r.MEDICAMENTO = 'lisinopril'