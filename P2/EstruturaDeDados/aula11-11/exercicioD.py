# Crie um dicionário com 6 códigos de barra e o seu respectivo produto e preço
# Em seguida, remova 2 registros do dicionário por chave e outros 2 registros do
# dicionário por valores

def main():
    dicionario = {
        '123456789012': 'R$ 40.00',
        '555444332221': 'R$ 108.99',
        '568754456745': 'R$ 32.50',
        '853029753205': 'R$ 20.50',
        '095783783728': 'R$ 99.99'
    }
    print(dicionario)

    del dicionario['123456789012']
    del dicionario['853029753205']
    print(dicionario)

    for chave, valor in dicionario.items():
        if valor == 'R$ 99.99':
            del dicionario[chave]
            break

    for chave, valor in dicionario.items():
        if valor == 'R$ 108.99':
            del dicionario[chave]
            break


    print(dicionario)



main()
