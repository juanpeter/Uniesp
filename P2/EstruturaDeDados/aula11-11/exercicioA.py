# Crie um dicionário que possua uma data de nascimento
# e endereço completo de 5 usuários
# Obs. As chaves do dicionário será o primeiro nome dos usuários

def main():
    dicionario = {
        'Pedro': ['03/02/1997', 'Rua x'],
        'João': ['03/04/1996', 'Rua y'],
        'Eduardo': ['13/05/1998', 'Rua z'],
        'Sarah': ['03/11/2002', 'Rua w'],
        "Bia": ['03/05/2000', 'Rua q']
    }

    for chave in dicionario.items():
        print(chave)


main()
