# Crie uma matriz no seguinte formato:
# 39 | 14 | 27
# 21 | 83 | 92
# 31 | 12 | 43
#
# Em seguida, mostre todos os itens da matriz multplicados por 7

def main():
    matriz = [[39, 14, 27], [21, 83, 92], [31, 12, 43]]

    for i in range(len(matriz)):
        for j in range(len(matriz)):
            n = matriz[i][j] * 7
            matriz[i][j] = n

    print(matriz)


main()
