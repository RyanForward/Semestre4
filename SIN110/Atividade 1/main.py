from open import entraDados
from create import saiDados
import sys  #sistema

matriz = entraDados(inst=sys.argv[1]) #envia como parametro a instância pré-definida pelo usuário

row, col = matriz  #informação do número de linhas e colunas são retiradas da tupla

result = saiDados(inst=sys.argv[1], row=row, col=col) #envia para a função saiDados, disposta no arquivo create.py, os parametro de instância, número de linhas e número de colunas
print(result) #Informa na tela o resultado com as dimensões da matriz
