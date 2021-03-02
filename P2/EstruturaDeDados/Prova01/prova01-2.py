def diaDoProgramador(y):
    while True:
        if not 1700 <= y <= 2700:
            y = int(input("A máquina do tempo só pode viajar entre os anos:\n - 1700\n -2700 \nPor favor insira um ano entre estes: "))
        else:
            break

    eBissexto = False
    if y % 400 == 0 or (y % 4 == 0 and y % 100 != 0):
        print("O ano é bissexto")
        eBissexto = True

    # se o ano for menor que 1917 o calendário é JULIANO (-14 dias)
    if y <= 1917:
        m = "08"
        if eBissexto:
            d = "29"
        else:
            d = "30"

    # Se o ano for maior que 1919 o calendário é GREGORIANO
    else:
        m = "09"
        if eBissexto:
            d = "12"
        else:
            d = "13"

    print(f"{d}.{m}.{y}")


def main():
    ano = int(input("Bem vindo ao console da máquina do tempo da Marie."
                    "\nPor razões técnicas, só podemos viajar ao 256 dia do ano na Russia"
                    "\nDigite o ano desejado e boa viagem!"
                    "\nAno desejado: "))
    diaDoProgramador(ano)


main()
