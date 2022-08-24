import numpy as np
import os

def entraDados(inst):
    path = os.path.join(os.getcwd() + '\\DATASET_GRAFOS\\' + inst + '.txt')
    matriz = np.loadtxt(path, dtype=int)
    return matriz.shape

