# Crie um tabuleiro de jogo da velha, usando uma matriz de caracteres 3x3,
# onde o usuário pede o número da linha (1 até 3) e o da coluna (1 até 3).
# A cada vez que  o usuário entrar com esses dados, colocar um 'X' ou 'O' no
# local selecionado

import random


def jogo_da_velha():
    jogando = True
    jogo = [
        [" ", " ", " "],
        [" ", " ", " "],
        [" ", " ", " "]
    ]

    while jogando:
        # Loop do jogador
        usuario_jogando = True
        while usuario_jogando:
            print("Sua vez!")
            print("################################")
            for i in range(3):
                print(jogo[i])
            print("################################")
            comando = True
            while comando:
                linha = int(input("Insira a Linha (1/2/3) em que você quer jogar\nLinha: ")) - 1
                coluna = int(input("Digite a Coluna (1/2/3) em que você quer jogar\nColuna: ")) - 1
                if 0 <= linha <= 2 or 0 <= coluna <= 2:
                    comando = False
                else:
                    print("Por favor insira um valor entre 1 e 3!")

            if jogo[linha][coluna] == " ":
                jogo[linha][coluna] = "X"
                usuario_jogando = False
            else:
                print("Espaço já marcado, selecione outro espaço")

        # Resetar o jogo se todos os espaços forem ocupados
        if jogo[0].count(" ") == 0:
            if jogo[1].count(" ") == 0:
                if jogo[2].count(" ") == 0:
                    print("################################")
                    print("Empate, resetando jogo!")
                    print("################################")
                    jogo = [
                        [" ", " ", " "],
                        [" ", " ", " "],
                        [" ", " ", " "]
                    ]

        # Loop do computador

        # selecionar uma casa aleatória para marcar com 'O'
        print("Vez do computador!")
        computador_jogando = True
        while computador_jogando:
            linha = random.randint(0, 2)
            coluna = random.randint(0, 2)
            if jogo[linha][coluna] == " ":
                jogo[linha][coluna] = 'O'
                computador_jogando = False

        print("################################")
        for i in range(3):
            print(jogo[i])
        print("################################")

        # checar condições de vitória ou derrota
        for j in range(3):
            # Checar todas as linhas horizontalmente
            if jogo[j] == ["X", "X", "X"]:
                print("Você ganhou!")
                print("################################")
                for i in range(3):
                    print(jogo[i])
                print("################################")
                jogando = False

            if jogo[j] == ["O", "O", "O"]:
                print("Você perdeu!")
                print("################################")
                for i in range(3):
                    print(jogo[i])
                print("################################")
                jogando = False

            # Checar todas as linhas verticalmente
            if jogo[0][j] == "X" and jogo[1][j] == "X" and jogo[2][j] == "X":
                print("Você ganhou!")
                print("################################")
                for i in range(3):
                    print(jogo[i])
                print("################################")
                jogando = False

            if jogo[0][j] == "O" and jogo[1][j] == "O" and jogo[2][j] == "O":
                print("Você perdeu!")
                print("################################")
                for i in range(3):
                    print(jogo[i])
                print("################################")
                jogando = False

        # Checar todas as linhas horizontalmente
        if jogo[0][0] == "X" and jogo[1][1] == "X" and jogo[2][2] == "X" or jogo[0][2] == "X" and jogo[1][1] == "X" and jogo[2][0] == "X":
            print("Você ganhou!")
            print("################################")
            for i in range(3):
                print(jogo[i])
            print("################################")
            jogando = False

        if jogo[0][0] == "O" and jogo[1][1] == "O" and jogo[2][2] == "O" or jogo[0][2] == "O" and jogo[1][1] == "O" and jogo[2][0] == "O":
            print("Você perdeu!")
            print("################################")
            for i in range(3):
                print(jogo[i])
            print("################################")
            jogando = False


def main():
    jogo_da_velha()


main()
