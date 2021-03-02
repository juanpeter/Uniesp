# Faça um programa que pergunte o preço de três produtos e
# informe qual produto você deve comprar, sabendo que a
# decisão é sempre pelo mais barato

def main():
    produto1 = float(input("Quanto custo o produto 1?: "))
    produto2 = float(input("Quanto custo o produto 2?: "))
    produto3 = float(input("Quanto custo o produto 3?: "))

    if produto1 <= produto2 and produto1 <= produto3:
        print("Eu quero o produto 1!")
    elif produto2 <= produto1 and produto2 <= produto3:
        print("Eu quero o produto 2!")
    else:
        print("Eu quero o produto 3!")

def main2():

    valorMinimo = 1000000
    ordemDoProduto = 1
    for tmp in range(0, 3):
        produto = float(input(f"Quanto custo o produto {tmp+1}?: "))

        if(produto < valorMinimo):
            valorMinimo = produto
            produto += 1

    print(f"O Produto {ordemDoProduto} é o mais barato, ele custa R${valorMinimo}")


main2()
