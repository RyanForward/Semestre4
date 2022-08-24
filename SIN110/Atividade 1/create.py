def saiDados(inst, row, col):
    nome = 'Resultado.txt'
    file = open(nome, 'w+')
    text = str(inst + ' ' + str(row) + ' ' + str(col))
    file.write(text)
    file.close()

    return text
