# Faça um programa que pergunte quanto você ganha por hora
# e o número de horas trabalhadas no mês.
# Calcule e mostre o
# total do seu salário no referido mês, sabendo-se que são descontados
# 11% para o Imposto de Renda,
# 8% para o INSS e
# 5% para o sindicato,
# faça um programa que nos dê:
# a. salário bruto.
# b. quanto pagou ao IPRF
# c. quanto pagou ao INSS.
# d. quanto pagou ao sindicato.
# e. o salário líquido.
# f. o valor descontado

def salarioBruto(valor, tempo):
    global bruto
    bruto = valor * tempo
    return bruto


def iprf():
    global iprf
    iprf = bruto * 11.0/100.0
    return iprf


def inss():
    global inss
    inss = bruto * 8.0/100.0
    return inss


def valorSindicato():
    global sindicato
    sindicato = bruto * 5.0/100.0
    return sindicato

def valorDescontado():
    global descontoTotal
    descontoTotal = iprf + inss + sindicato
    return descontoTotal


def salarioLiquido():
    liquido = bruto - descontoTotal
    return liquido


def main():
    valorHora = float(input("Insira o quanto você ganha por hora: "))
    tempoTrabalhado = float(input("Insira o tempo que você trabalhou este mês: "))

    bruto = salarioBruto(valorHora, tempoTrabalhado)
    descontoIprf = iprf()
    descontoInss = inss()
    descontoSindicato = valorSindicato()
    desconto = valorDescontado()
    liquido = salarioLiquido()

    print(f"Seu salário bruto é R${bruto}")
    print(f"Seu desconto de Imposto de Renda é de R${descontoIprf}")
    print(f"Seu desconto de INSS é de R${descontoInss}")
    print(f"Seu desconto para o sindicato é de R${descontoSindicato}")
    print(f"Seu salário líquido é R${liquido}")
    print(f"O valor descontado de seu salário bruto é de R${desconto}")


main()
