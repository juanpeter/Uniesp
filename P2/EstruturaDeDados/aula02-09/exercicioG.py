# Numero inteiro: não pode ser um double
# Numero real: pode ser um double

def produtoDobroPrimeiroMetadeSegundo(numeroInteiro1, numeroInteiro2):
    solucao = (2 * numeroInteiro1) * (numeroInteiro2 / 2)
    return solucao

def somaTriploPrimeiroComTerceiro(numeroInteiro1, numeroReal):
    solucao = 3 * numeroInteiro1 + numeroReal
    return solucao

def terceiroAoCubo(numeroReal):
    solucao = numeroReal ** 3
    return solucao

def main():
    numeroInteiro1 = int(input("Informe um número inteiro: "))
    numeroInteiro2 = int(input("Informe um segundo número inteiro: "))
    numeroReal = float(input("Informe um número real: "))

    solucao1 = produtoDobroPrimeiroMetadeSegundo(numeroInteiro1, numeroInteiro2)
    solucao2 = somaTriploPrimeiroComTerceiro(numeroInteiro1, numeroReal)
    solucao3 = terceiroAoCubo(numeroReal)
    print(solucao1)
    print(solucao2)
    print(solucao3)

main()
