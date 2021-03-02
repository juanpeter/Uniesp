# Crie um programa no qual o usuário digitará
# 5 nomes num vetor (OBRIGATÓRIO TER SEU NOME INCLUÍDO NO VETOR).
# Em seguida:
# a) Mostre os valores na tela.
# b) Adicione seu sobrenome na posição do seu nome no array.
# c) Imprima o resultado na tela.

def lista_nomes():
    registros = []
    nome = input("Digite seu nome:\n")
    sobrenome = input("Digite seu sobrenome:\n")

    for i in range(0, 5):
        nome_lista = input("Digite um nome:\n")
        registros.append(nome_lista)

    if nome not in registros:
        print("Seu nome deve estar na lista!")
        while True:
            substituir_nome = input(f"Escolha um dos nomes para substituir:\n{registros}\n")
            if substituir_nome in registros:
                i = registros.index(substituir_nome)
                registros[i] = nome
                print(registros)
                break
            else:
                print("Por favor selecione um nome na lista!")

    i = registros.index(nome)
    registros[i] = f"{nome} {sobrenome}"
    print(registros)


def main():
    lista_nomes()


main()
