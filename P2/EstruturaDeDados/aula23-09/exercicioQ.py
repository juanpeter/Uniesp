# Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer
# número inteiro entre 1 a 10. O usuário deve informar de qual número ele
# deseja ver a tabuada.

def tabuada(n):
    tabuada = []
    for x in range(1, 11):
        tabuada.append(x * n)
    return tabuada


def main():
    numero = int(input("Digite um número de 1 a 10: "))
    while numero > 10 or numero < 1:
        print("Digite outro número")
        numero = int(input("Digite um número de 1 a 10: "))

    print(tabuada(numero))


main()
