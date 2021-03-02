# Faça um programa que peça um valor e mostre na tela
# se o valor é positivo ou negativo.

def leitorDeValor():
    valor = int(input("Insira um valor: "))
    if valor > 0:
        print("O valor é positivo")
    elif valor < 0:
        print("O valor é negativo")
    else:
        print("O valor é neutro")

def main():
    leitorDeValor()

main()
