# Crie um dicionario que será a agenda de clientes que compraram fiado na bodega
# de dona Chica. Essa agenda contém três informações principais: nome, o quanto
# deve em reais, telefone e endereço. Crie interações que façam:

# a - O Cadastro dos clientes
# b - A atualização dos valores em dívida
# c - A remoção dos clientes que não devem mais
# d - Uma busca por nome

def agenda():
    # agenda = {}
    agenda = {
            f'devedor_1': {
                'nome': 'pedro',
                'valor': 30.00,
                'telefone': 'bbbb',
                'endereço': 'cccc'
            }
    }

    sistema = True
    menu_principal = True

    while sistema:

        while menu_principal:
            resposta = input('a - Cadastrar nova dívida\n'
                             'b - Atualizar dívida\n'
                             'c - Remover dívida\n'
                             'd - Buscar devedor\n'
                             'Resposta: ')
            menu_principal = False

        # Cadastrar novo devedor
        if resposta == 'a':
            nome = input('Digite o nome do devedor'
                         '\nResposta: ')
            try:
                valor = float(input('Digite o valor devido'
                                    '\nResposta: '))
            except ValueError:
                print('Digite um valor correto!')

            telefone = input('Digite o número do telefone do devedor'
                             '\nReposta: ')
            endereco = input('Digite o endereço do devedor'
                             '\nReposta: ')

            num = len(agenda)

            dados = {
                f'devedor_{num+1}': {
                    'nome': nome,
                    'valor': valor,
                    'telefone': telefone,
                    'endereço': endereco
                    }
                }

            # Adicionar dados
            agenda.update(dados)
            print("Devedor cadastrado com sucesso\nRetornando ao menu principal")
            # Retornar ao menu principal
            menu_principal = True

        # Atualizar dados da dívida
        if resposta == 'b':
            devedor = input('Insira o nome do devedor\nResposta: ')

            for i in agenda:
                if agenda[i]['nome'] == devedor:
                    print('Que valor você gostaria de mudar?')
                    resposta = input('a - Nome\n'
                                     'b - Valor da dívida\n'
                                     'c - Telefone\n'
                                     'd - Endereço\n'
                                     'Resposta: ')

                    # Atualizar nome do devedor
                    if resposta == 'a':
                        novo_valor = input("Digite o nome do devedor\nResposta: ")
                        agenda[i]['nome'] = novo_valor

                    # Atualizar valor da dívida
                    if resposta == 'b':
                        novo_valor = float(input("Digite o novo valor da dívida\nResposta: "))
                        agenda[i]['valor'] = novo_valor

                    # Atualizar telefone
                    if resposta == 'c':
                        novo_valor = input("Digite o número de telefone do devedor\nResposta: ")
                        agenda[i]['telefone'] = novo_valor

                    # Atualizar endereço
                    if resposta == 'd':
                        novo_valor = input("Digite o endereço do devedor\nResposta: ")
                        agenda[i]['endereco'] = novo_valor

                    print(agenda)
                    print("Valor atualizado com sucesso\nRetornando ao menu principal")
                    break

                else:
                    print('Não existem devedores com esse nome!')

            # Retornar ao menu principal
            menu_principal = True

        # Apagar dívida
        if resposta == 'c':
            devedor = input('Insira o nome do devedor para cancelar a dívida\nResposta: ')

            for i in agenda:
                if agenda[i]['nome'] == devedor:
                    agenda.pop(i)
                    print(agenda)
                    print(f"Dívida do usuário {devedor} cancelada\nRetornando ao menu principal")
                    break
                else:
                    print('Não existem devedores com esse nome!')

            # Retornar ao menu principal
            menu_principal = True

        # Encontrar devedor
        if resposta == 'd':
            devedor = input('Insira o nome do devedor para cancelar a dívida\nResposta: ')

            for i in agenda:
                if agenda[i]['nome'] == devedor:
                    print('Usuário encontrado!')
                    print(agenda[i])
                    break
                else:
                    print('Não existem devedores com esse nome!')

            # Retornar ao menu principal
            menu_principal = True


def main():
    agenda()


main()
