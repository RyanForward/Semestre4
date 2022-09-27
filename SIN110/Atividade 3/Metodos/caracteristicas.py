'''=================================================
UNIVERSIDADE FEDERAL DE ITAJUBÁ
INSTITUTO DE MATEMÁTICA E COMPUTAÇÃO
SIN110 - ALGORITMOS E GRAFOS
Prof. Rafael Frinhani

caracteristicas - Funções para obtenção das características do grafo e operações em uma matriz de adjacências.

05/09/2022
===================================================='''


'''Verifica Adjacência: Função que verifica se os vértices vi e vj são adjacentes.
Entrada: matriz de adjacências (numpy.ndarray), vi (Integer), vj (Integer)
Saída: 0 (Integer) se vi e vj NÃO são adjacentes; 1 se vi e vj são adjacentes'''

import numpy as np


def verificaAdjacencia(matriz, vi, vj):
    if matriz[vi][vj] > 0:  # Se célula M[vi][vj] for maior que 0 existe uma ou mais arestas
        verticesAdjacentes = True
    else:
        verticesAdjacentes = False
    print('Vertices', vi, 'e', vj, 'são adjacentes?', verticesAdjacentes, '\n')
    return verticesAdjacentes

def tipoGrafo(matriz):
    # parametros para definição do tipo de grafo
    assimetria = 0
    paralelas = 0
    laco = 0

    # tamanho da matriz
    
    mat = np.shape(matriz)
    dimensao = mat[1]

    for vi in range(dimensao):
        for vj in range(dimensao):
            if matriz[vi][vj] != matriz[vj][vi]:
                assimetria = 1
            if matriz[vi][vj] == 2:
                paralelas = 1
            if matriz[vj][vj] == 1:
                laco = 1

        caracter = (assimetria, paralelas, laco)  # Transformando as informações em uma lista

        # Retornos
        if caracter == (1, 0, 0):
            print(1)
            return 1  # Assimetria indica um digrafo
        if caracter == (0, 1, 0):
            print(2)
            return 2  # Arestas paralelas somente, indicam um multígrafo
        if caracter == (0, 1, 1):
            print(3)
            return 3  # Arestas paralelas e laços indicam um pseudografo
        else:
            print(0)
            return 0  # Nenhuma das características indicam um grafo normal


def qtdVertices(matriz):
    matrizshape = matriz.shape()
    return matrizshape[1]


def qtdArestas(matriz):
    vertices = qtdVertices(matriz)
    numArestas = 0

    for i in range(vertices):
        for j in range(vertices):
            if matriz[i][j] > 0:
                numArestas += matriz[i][j]

    return numArestas


def densidade(matriz):
    E = qtdArestas(matriz)
    V = qtdVertices(matriz)

    if tipoGrafo(matriz) != 1:
        dens = 2 * E / (V * (V - 1))
        return dens
    else:
        dens = E / (V * (V - 1))
        return dens


def insereAresta(matriz, vi, vj):
    if tipoGrafo(matriz) == 1
        matriz[vi][vj] += 1
    else:
        matriz[vi][vj] += 1
        matriz[vj][vi] += 1
    return matriz


def insereVertice(matriz, vi):
    vert = qtdVertices(matriz)

    for i in range(vert + 1):
        matriz[i][vert + 1] = 0
        matriz[vert + 1][i] = 0

    return matriz


def removeAresta(matriz, vi, vj):
    if tipoGrafo(matriz) == 1
        matriz[vi][vj] += -1
    else:
        matriz[vi][vj] += -1
        matriz[vj][vi] += -1
    return matriz


def removeVertice(matriz, vi):
    vert = qtdVertices(matriz)
    for i in range(vert):
        matriz[i][vi] = -1
        matriz[vi][i] = -1
