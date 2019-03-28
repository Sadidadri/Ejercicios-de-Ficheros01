#!/usr/bin/env python
# -*- coding: utf-8 -*-

'''
Created on 28 mar. 2019
Realiza un programa que lea el fichero creado en el ejercicio anterior y que
muestre los n�meros por pantalla.
@author: d18momoa
'''
#Abrimos fichero
fichero = open("primos.dat","r")
#Leemos su contenido
print(fichero.read())
#Cierre del fichero
fichero.close()