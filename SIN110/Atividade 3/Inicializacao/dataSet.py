'''=================================================
UNIVERSIDADE FEDERAL DE ITAJUBÁ
INSTITUTO DE MATEMÁTICA E COMPUTAÇÃO
SIN110 - ALGORITMOS E GRAFOS
Prof. Rafael Frinhani

dataSet - Funções de leitura de um dataset, criação das estruturas de representação de grafos e salvamento de resultados em arquivo.

05/09/2022
===================================================='''

import numpy as np

'''Cria Matriz de Adjacência: Função para leitura de um dataset em forma de matriz de adjacências.
Entrada: instancia (nome do arquivo .txt do dataset em forma de matriz de adjacência
Saída: matriz de adjacência (tipo NumPy.ndarray)'''
def criaMatrizAdjacencias(instancia):
    print('NOME DA INSTÂNCIA:', instancia, '\n')
    caminho = 'D:/01-Academicos/01-UNIFEI/Disciplinas/SIN110 - Algoritmos e Grafos/Aulas/Codigos/grafo/Instancias/' + instancia + '.txt'
    with open(caminho, 'rb') as f:
        data = np.genfromtxt(f, dtype="int64") #OBS. Lê arquivo .txt de uma Instancia no formato Matriz de Adjacência
    return data

'''Salva Resultado: Função para salvar em arquivo .txt o resultado da execução do programa.
Entrada: resultado (tipo lista)
Saída: arquivo .txt no diretório especificado'''
def salvaResultado(resultado):
    stringRes = ''
    for res in resultado:
        stringRes += str(res) + ' '
    arquivo = open('D:/01-Academicos/01-UNIFEI/Disciplinas/SIN110 - Algoritmos e Grafos/Aulas/Codigos/grafo/Resultados/resultado.txt', 'a+')
    arquivo.writelines(stringRes + '\n')
    arquivo.close()