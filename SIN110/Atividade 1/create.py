def saiDados(inst, row, col):
    nome = 'Resultado.txt'  # Nome do arquivo
    file = open(nome, 'w+') # Abre com a permissão de escrita
    text = str(inst + ' ' + str(row) + ' ' + str(col)) # Gera o texto com as informações a serem escritas
    file.write(text) # Salva no arquivo txt
    file.close() # Fecha o arquivp

    return text # Retorna o texto formatado para impressão na tela
