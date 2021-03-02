# Crie um programa que o usuário digite uma sequência de valores (de tamanho dinâmico)
# numa única variável, chamada registro. Em seguida, mostre os valores armazenados.

def main():
    tamanhoRegistro = int(input('Quantos valores estarão dentro do registro? '))
    registro = []

    for i in range(0, tamanhoRegistro):
        valor = input(f'Insira o valor na posição {i}: ')
        registro.append(valor)

    print(registro)


main()
