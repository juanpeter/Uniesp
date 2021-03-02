# Manoel comprou um novo terreno, quando chega um carro novo, este é estacionado
# no terreno, quando chega um novo carro, este é estacionado no terreno, um atrás do outro
# Quando um carro precisa sair, os carros do terreno são retirados pela saída, dão uma volta
# na quadra e são colocados no final da fila pela entrada do estacionamento.

# Faça um sistema que inclua carros no estacionamento informando o número da placa e
# retire carros usando o identificador "placa". Depois de ter informado a placa, cada
# vez que é pressionada a tecla "S" deve ser mostrado o estado do estacionamento

from Fila import Fila


def estacionamento_ineficiente():

    estacionamento = Fila()
    sistema = True

    while sistema:
        print("--------------------------------\n"
              "   SISTEMA DE ESTACIONAMENTO   \n"
              "--------------------------------\n"
              "Selecione uma opção\n"
              "S - Mostrar o estacionamento\n"
              "A - Adicionar um novo carro\n"
              "R - Remover um carro\n"
              "Z - Sair do sistema")

        escolha = input('Insira uma opção:\n')

        if escolha == 'S':
            if len(estacionamento.get_fila()) == 0:
                print("O estacionamento está vazio!")
            else:
                print(estacionamento.get_fila())
                print("Retornando ao menu principal")

        if escolha == 'A':
            placa = input("Insira o número da placa:\n")
            estacionamento.inserir_dado(placa)
            print(f"Carro de placa {placa} adicionado no estacionamento!")
            print("Retornando ao menu principal")

        if escolha == 'R':
            placa = input("Insira o número da placa do carro a remover:\n")
            estacionamento.remover_dado_reorganizar(placa)
            print(f"Carro de placa {placa} removido do estacionamento!")
            print(estacionamento.get_fila())

        if escolha == 'Z':
            print("Encerrando o sistema!")
            sistema = False


def main():
    estacionamento_ineficiente()


main()
