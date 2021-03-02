# Crie um array referente aos anos de nascimento das 5 pessoas mais próximas a você.
# Em seguida:
# - Ordene o array  na ordem crescente e mostre o resultado;
# - Ordene o array na ordem decrescente e mostre o resultado;

def aniversarios_importantes(num):
    aniversarios = []
    for i in range(num):
        data = int(input("Insira um ano de aniversário importante:\n"))
        aniversarios.append(data)

    aniversarios_crescente = sorted(aniversarios)
    aniversarios_decrescente = sorted(aniversarios, reverse=True)

    print(f"Aniversários importantes, em ordem crescente: {aniversarios_crescente}\n"
          f"Aniversários importantes, em ordem decrescente: {aniversarios_decrescente}")


def main():
    aniversarios_importantes(5)


main()
