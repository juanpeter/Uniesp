# Peça ao usuário para digitar os valores de uma matriz 4x4
# Em seguida, conte e escreva quantos valores maiores que 10 ela possui

def matriz():
    matriz = []
    acima_de_dez = []
    for i in range(4):
        matriz.append([] * (i+1))
        for j in range(4):
            n = int(input("Digite um número!\n"))
            if n > 10:
                acima_de_dez.append(n)
            matriz[i].append(n)

    print(f"{len(acima_de_dez)} valores foram maiores que 10:\n"
          f"{acima_de_dez}")


def main():
    matriz()


main()