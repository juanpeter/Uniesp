# Crie uma matriz no seguinte formato:
# 39 | 14 | 27
# 21 | 83 | 92
# 31 | 12 | 43
#
# Em seguida, remova os últimos itens de cada linha

def main():
    matriz = [[39, 14, 27], [21, 83, 92], [31, 12, 43]]

    for i in range(len(matriz)):
        matriz[i].pop(-1)

    print(matriz)


main()
