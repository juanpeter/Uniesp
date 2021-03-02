# Crie uma matriz que armazene nome, matricula e data de nascimento de 3 alunos

def main():
    matriz = []
    for i in range(3):
        nome = input("Digite o nome de seu colega:\n")
        matricula = input("Digite a matricula de seu colega:\n")
        data_de_nascimento = input("Digite a data de aniversário de seu colega:\n")
        matriz.append(([nome, matricula, data_de_nascimento]))

    print(matriz)


main()
