# Crie um dicionário com endereços vinculados a diferentes CEPs (como chave)
# Em seguida, mostre apenas os CEPs cadastrados

# Nesse dicionário, busque informações no dicionário pelo CEP e pelo endereço completo

def main():
    dicionario = {
        'Vila Monte Alto, Cais do Porto, Fortaleza, CE': '60180-400',
        'Rua Doutor Wilson Saliba, Buritis, Belo Horizonte, MG': '30575-236',
        'Rua Claudino Bento da Silva, Centro, Florianópolis, SC': '88010-135'
    }

    rua_buscada = '30575-236'
    for rua, busca in dicionario.items():
        if busca == rua_buscada:
            print(rua)

    print(dicionario["Vila Monte Alto, Cais do Porto, Fortaleza, CE"])


main()
