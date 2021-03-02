def numVelasAniversario(velasAltura):
    while True:
        if not 1 <= velasAltura <= 10 ** 5:
            velasAltura = int(input("Por favor selecione uma idade real: "))
        else:
            break

    velas = []
    maiorVela = 0
    for i in range(0, velasAltura):
        vela = int(input(f"Tamanho da vela número {i + 1}: "))
        velas.append(vela)
        if vela >= maiorVela:
            maiorVela = vela

    numVelasAltMax = 0
    for vela in velas:
        if vela == maiorVela:
            numVelasAltMax += 1

    print(f"Número de velas com a altura máxima = {numVelasAltMax}")


def main():
    idade = int(input("Qual a idade da criança? "))
    numVelasAniversario(idade)


main()
