import math

def main():

    areaPintada = int(input("Informe a área, em metros quadrados, a ser pintada: "))

    class tinta():
        litros = 18
        rendimento = 3 * litros
        preco = 80


    latas = math.ceil(areaPintada / tinta.rendimento)

    precoTotal = tinta.preco * latas

    print(f"Você irá precisar de {latas} latas de tinta e pagará R${precoTotal},00")

main()