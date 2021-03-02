# Digite um número e descubra se ele é um palíndromo.
# Palíndromo:
# 1º algarismo de n é igual ao seu último algarismo,
# 2º algarismo de n é igual ao penúltimo algarismo, e assim sucessivamente.

def isPalindrome(n):
    nString = str(n)
    nReverse = nString[len(nString)::-1]
    if nString == nReverse:
        print(f"{n} é palindromo")
    else:
        print(f"{n} não é palindromo")


def main():
    n = int(input("Digite um número: "))
    isPalindrome(n)


main()
