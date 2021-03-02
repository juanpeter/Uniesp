# Calcular tempo médio de espera
# Calcule e mostre a média artimética de um cliente, baseado no tempo
# de espera dos clientes anteriores
# número máximo de clientes: 5

def main1():
    tempoTotal = 0
    nClientes = int(input("Quantos clientes estão no banco? "))
    if nClientes > 5:
        print("O número máximo de clientes é 5")
    else:
        for x in range(nClientes):
            tempoCliente = (int(input(f"Quanto tempo o cliente {x+1} demorou? ")))
            tempoTotal = tempoTotal + tempoCliente
        tempoMedio = tempoTotal / nClientes
        print(f"Os clientes demoram, em média, {tempoMedio} minutos para serem atendidos")


# main1()

def main2():
    tempoTotal = 0
    nClientes = int(input("Quantos clientes estão no banco? "))
    if nClientes > 5:
        print("O número máximo de clientes é 5")
    else:
        x = 0
        while x < nClientes:
            tempoCliente = (int(input(f"Quanto tempo o cliente {x+1} demorou? ")))
            tempoTotal = tempoTotal + tempoCliente
            x += 1
        tempoMedio = tempoTotal / nClientes
        print(f"Os clientes demoram, em média, {tempoMedio} minutos para serem atendidos")


main2()
