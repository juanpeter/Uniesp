# Dada uma sequência de números inteiros, imprimir seus quadrados.
# Entradas do programa:
#         nº de início da sequência = 0
#         nº de fim da sequência = 4
# Saída do programa:
#          sequência : 0, 1, 4, 9, 16

numero1 = int(input("Digite o primeiro número: "))
numero2 = int(input("Digite o segundo número: "))
resultado = []


def main1(n1, n2):
    for x in range(n1, n2 + 1):
        resultado.append(x**2)
    print(resultado)


def main2(n1, n2):

    while n1 in range(n1, n2 + 1):
        resultado.append(n1 ** 2)
        n1 += 1
    print(resultado)


main1(numero1, numero2)
# main2(numero1, numero2)