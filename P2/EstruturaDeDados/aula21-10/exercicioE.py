# Crie um programa no qual o usuário digitará 5 nomes.
# Todos os cinco nomes serão salvos no vetor chamado "registros".
# Em seguida:
# a) Mostre o que o usuário digitou na tela;
# b) O programa pedirá outro nome, que será adicionado no fim do vetor "registros”;
# c) O programa pedirá outro nome, que será adicionado na 2ª posição do vetor "registros”;
# d) Imprima o resultado na tela.

def registrar_nomes():
    registros = []
    for i in range(0, 5):
        nome = input("Digite um nome: ")
        registros.append(nome)

    print(registros)
    nome = input("Digite um outro nome: ")
    registros.append(nome)
    nome = input("Digite um último nome: ")
    registros[1] = nome

    print(registros)


def main():
    registrar_nomes()


main()