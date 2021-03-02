# Faça um Programa que verifique se uma letra digitada é "F" ou "M".
# Conforme a letra escrever: F - Feminino, M - Masculino, Gênero Inválido.

def lerSexo(sexo):
    if sexo == "M" or sexo == "m":
        print("M - Masculino")
    elif sexo == "F" or sexo == "f":
        print("F - Feminino")
    else:
        print("Gênero Inválido")


def main():
    sexo = input("Selecione entre M ou F: ")
    lerSexo(sexo)


main()

