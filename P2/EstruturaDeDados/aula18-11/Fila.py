class Fila():
    def __init__(self):
        self.dados = ['1619', '4402', '3219', '5689']

    def get_fila(self):
        return self.dados

    def inserir_dado(self, novo_valor):
        self.dados.append(novo_valor)

    def remover_dado_reorganizar(self, valor):
        posicao = self.dados.index(valor)
        for i in range(0, posicao + 1):
            if valor != self.dados[0]:
                self.dados.append(self.dados[0])
            self.dados.pop(0)

