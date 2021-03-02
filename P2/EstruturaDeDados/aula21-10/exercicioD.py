# Elabore um programa que cria um array de nomes de países
# e outro array com nomes de cidades.
# Cada uma das criações devem ser feitas com métodos diferentes.

def lista_paises():
    lista = []
    while True:
        pais = input("Digite um país:\n")
        lista.append(pais)

        resposta = input("Você quer inserir outro país?\nS/N ").lower()
        if resposta == "n":
            break

    print(lista)


def lista_cidades():
    lista = []
    n = int(input("Quantas cidades você irá inserir?\n"))

    for i in range(0, n):
        cidade = input("Digite uma cidade:\n")
        lista.insert(i, cidade)

    print(lista)


def main():
    lista_paises()
    lista_cidades()


main()
