# Crie uma agenda eletrônica que contenha dois vetores:
# um array com o nome dos seus amigos e
# outro com as suas respectivas datas de aniversário.

# Tente inserir e remover as informações da agenda
# de maneira dinâmica (apagando pelo nome ou posição,
# inserindo n usuários por vez caso queira, etc...).

def agenda():
    lista_contatos = []
    lista_aniversario = []
    print("Bem vindo ao sistema de agenda, o que deseja fazer?\n")
    sair = False

    while not sair:
        print("##################################################")
        resposta = input("1 - Ver meus contatos\n"
                         "2 - Adicionar um ou mais contatos\n"
                         "3 - Deletar um ou mais contatos\n"
                         "9 - Fechar o programa\n"
                         "Reposta: ")

        if resposta == "1":
            print("##################################################")
            if len(lista_contatos) == 0:
                print("Você não tem contatos cadastrados!\n"
                      "Retornando ao Menu inicial")

            else:
                for i in range(len(lista_contatos)):
                    print(f"Contato {i + 1}: {lista_contatos[i]}, Aniversário: {lista_aniversario[i]}")

                print("Retornando ao Menu inicial")

        if resposta == "2":
            print("##################################################")
            n = int(input("Quantos contatos você gostaria de adicionar?\n"
                          "Resposta: "))

            if n == 0:
                print("Operação inválida\n"
                        "Retornando ao Menu inicial")

            else:
                for i in range(n):
                    nome = input(f"Qual o nome do contato {i + 1}?\n"
                                 f"Resposta: ")
                    aniversario = input(f"Qual é a data de aniversário de {nome}?\n"
                                        f"Resposta: ")
                    lista_contatos.append(nome)
                    lista_aniversario.append(aniversario)

                print("Cadastro(s) realizado(s) com sucesso!\n"
                      "Retornando ao Menu inicial")

        if resposta == "3":
            print("##################################################")
            if len(lista_contatos) >= 1:
                resposta_deletar = input("Como você gostaria de deletar contatos?\n"
                                         "1 - Por nome do contato\n"
                                         "2 - Por posição na lista de contatos\n"
                                         "9 - Apagar toda a lista de contatos\n"
                                         "Resposta: ")

                if resposta_deletar == "1":
                    nome = input("Digite o nome do contato a ser deletado\n"
                                 "Resposta: ")

                    i = lista_contatos.index(nome)
                    lista_contatos.pop(i)
                    lista_aniversario.pop(i)

                    print("Contato deletado com sucesso\n"
                          "Retornando ao Menu inicial")

                if resposta_deletar == "2":
                    n = int(input("Qual a posição do contato que você quer deletar?\n"
                              "Resposta: "))

                    lista_contatos.pop(i-1)
                    lista_aniversario.pop(i-1)
                    print("Contato deletado com sucesso\n"
                          "Retornando ao Menu inicial")

                if resposta_deletar == "9":
                    resposta_apagar_lista = input("Você tem certeza que quer apagar todos os contatos da lista?\n"
                          "Resposta S/N:")

                    if resposta_apagar_lista == "S":
                        lista_contatos.clear()
                        lista_aniversario.clear()
                        print("Todos os contatos da lista foram apagados")

                    else:
                        print("Operação Cancelada\n"
                        "Retornando ao Menu inicial")

            else:
                print("Por favor insira pelo menos um contato na lista!\n"
                      "Retornando ao Menu inicial")

        if resposta == "9":
            print("##################################################")
            print("Fechando o programa!")
            sair = True


def main():
    agenda()


main()
