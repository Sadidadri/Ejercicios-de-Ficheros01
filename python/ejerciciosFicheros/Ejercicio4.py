#!/usr/bin/env python
# -*- coding: utf-8 -*-

'''
Created on 28 mar. 2019
Realiza un programa que sea capaz de ordenar alfab�ticamente las palabras
contenidas en un fichero de texto. El nombre del fichero que contiene las
palabras se debe pasar como argumento en la l�nea de comandos. El nombre
del fichero resultado debe ser el mismo que el original a�adiendo la coletilla
sort, por ejemplo palabras_sort.txt. Suponemos que cada palabra ocupa una
l�nea.
@author: d18momoa
'''
#Indicamos nombre fichero
nombreFichero = input("Introduzca nombre del fichero a ordenar, que tenga una palabra por linea.") 
ficheroLeido = open(nombreFichero+".txt","r") #Este sera el fichero que leamos
ficheroOrdenado = open (nombreFichero+"_sort.txt","w") #Este el que escribiremos ordenado

listaPalabras = [] #lista donde almacenaremos todas las palabras

for linea in ficheroLeido: #for que recorre las lineas del fichero y añade las palabras a la lista
    listaPalabras.append(linea)
    
listaPalabras.sort() #Ordenar la lista de palabras

for x in listaPalabras: #Escribe las palabras ya ordenadas en el otro fichero
    ficheroOrdenado.writelines(str(x))
#Cierre de ficheros
ficheroLeido.close()
ficheroOrdenado.close()    
print("Programa finalizado.")    