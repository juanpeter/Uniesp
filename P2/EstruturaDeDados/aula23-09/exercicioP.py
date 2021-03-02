# Dado um inteiro não-negativo n, determinar n!
# Por exemplo: 3! = 3 x 2 x 1
# usar for e while

def main1(n):
    resultado = 1
    for x in range(1, n+1):
        resultado = resultado * x
    print(resultado)

def main2(n):
    resultado = 1
    while 0 < n:
        resultado = resultado * n
        n -= 1
    print(resultado)

# main1(5)
main2(4)