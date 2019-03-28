#!/usr/bin/env python
# -*- coding: utf-8 -*-

'''
Created on 28 mar. 2019
Realiza un programa que diga cu�ntas ocurrencias de una palabra hay en un
fichero. Tanto el nombre del fichero como la palabra se deben pasar como
argumentos en la l�nea de comandos.
@author: d18momoa
'''

nombreFichero = input("Introduca el nombre del fichero a examinar")
palabra = input("Que palabra quieres buscar?")
#Se abre el fichero
f = open(nombreFichero+".txt","r")
#Un contador que indicara el numero de coincidencias
contador = 0
#Se almacena el contenido del fichero en una cadena de texto
texto = f.read()
f.close() #Se cierra el fichero
palabrasSeparadas = texto.split() #Almaceno las palabras separadas en una lista

for x in palabrasSeparadas: #Recorro un for que si encuentra coincidencia de la palabra elegida con una de la lista, aumenta el contador
    if x == palabra:
        contador += 1
        
print("La palabra "+str(palabra)+" ha sido encontrada "+str(contador)+" veces.")
