# Crie um algorítmo que leia uma matriz A nxn (n<= 10) e calcule
# a respectiva matriz transposta A

def transpor_matriz(matriz):
    matriz_transposta = []

    if len(matriz) > 10 or len(matriz[0]) > 10:
        return "A largura máxima da matriz é 10!"

    colunas = len(matriz[0])

    for i in range(colunas):
        matriz_transposta.append([])
        for j in range(len(matriz)):
            matriz_transposta[i].append(matriz[j][i])

    return matriz_transposta


def main():
    matriz_1 = [
                [1, 2, 3],
                [4, 5, 6]
            ]
    matriz_2 = [
        [1, 2],
        [3, 4],
        [4, 5],
        [6, 7]
    ]
    matriz_3 = [
        [1, 2, 4, 5, 6, 6, 8, 9, 10, 7, 11],
        [3, 4, 4, 5, 6, 6, 8, 9, 10, 7, 11],
        [4, 5, 4, 5, 6, 6, 8, 9, 10, 7, 11],
        [6, 7, 4, 5, 6, 6, 8, 9, 10, 7, 11]
    ]
    print(transpor_matriz(matriz_1))


main()
