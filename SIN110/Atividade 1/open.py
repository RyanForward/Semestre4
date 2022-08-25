import numpy as np
import os

def entraDados(inst):

    path = os.path.join(os.getcwd() + '\\DATASET_GRAFOS\\' + inst + '.txt') # abre a instância informada como parâmetro
    matriz = np.loadtxt(path, dtype=int) # carrega do arquivo .txt a matriz já a transformando para o formato NumPy
    return matriz.shape # retorna as dimensões da matriz
