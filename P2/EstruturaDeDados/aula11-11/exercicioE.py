# Crie um dicionário que armazene informações sobre nome, endereço e cpf de 3 usuários
# Em seguida, mostre na tela

# OBS: As chaves dos usuários devem ter os mesmos nomes entre si (nome, endereço, cpf)

def main():
    dicionario = {
        'usuario_1': {
            'nome': 'Pedro',
            'endereço': 'Rua fulano de tal',
            'cpf': '207.378.650-24'
        },
        'usuario_2': {
            'nome': 'Sarah',
            'endereço': 'Rua cicrano da silva',
            'cpf': '488.805.820-20'
        },
        'usuario_3': {
            'nome': 'José',
            'endereço': 'Rua curva do vento',
            'cpf': '685.811.260-06'
        }
    }

    print(dicionario)


main()
