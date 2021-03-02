# Crie uma matriz que contenha na primeira linha o array
# [1, 2, 3, 4] e na segunda linha o array [5, 6, 7, 8]. Depois, insira
# um valor, digitado por você, na última posição de todas as linhas

def main():
    matriz = [[1, 2, 3, 4], [5, 6, 7, 8]]

    for i in range(len(matriz)):
        n = int(input("Insira um número:\n"))
        matriz[i].append(n)

    print(matriz)


main()
