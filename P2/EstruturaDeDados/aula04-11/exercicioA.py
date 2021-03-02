# Crie um array que contenha na primeira posição o array ('uniesp', 'joão pessoa',)
# e na segunda posição o array ('ufcg', 'campina grande')
# Em seguida, imprima na tela

def main():
    array_jp_cg = [['uniesp', 'joão pessoa'], ['ufcg', 'campina grande']]

    for i in range(len(array_jp_cg)):
        for j in range(len(array_jp_cg)):
            print(array_jp_cg[i][j])
    # print(array_jp_cg)


main()
