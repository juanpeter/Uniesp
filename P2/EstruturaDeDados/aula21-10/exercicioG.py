# Crie um array que o conteúdo seja nomes das cores.
# Em seguida remova apenas a cor "vermelho”, se houver.

def lista_cores():
    registro = []
    while True:
        cor = input("Digite uma cor:\n")
        registro.append(cor.lower())

        resposta = input("Você quer inserir outra cor?\nS/N ").lower()
        if resposta == "n":
            break

    while "vermelho" in registro:
        print("Não aceitamos a cor vermelho na lista!")
        registro.remove("vermelho")

    print(registro)


def main():
    lista_cores()


main()
