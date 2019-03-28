package ficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Realiza un programa que diga cuántas ocurrencias de una palabra hay en un
 * fichero. Tanto el nombre del fichero como la palabra se deben pasar como
 * argumentos en la línea de comandos.
 * @author d18momoa
 *
 */
public class Ejercicio6 {

  public static void main(String[] args) {
    try {
      BufferedReader br = new BufferedReader(new FileReader(args[0]+".txt"));
      String linea = "";
      String palabraDeseada = ""+args[1];
      int coincidencias = 0;
      while(linea != null) {
        linea = br.readLine();
        String[] palabras = linea.split(" ");
        for(String x : palabras) {
          if (x.equals(palabraDeseada)) {
            coincidencias++;
          }
        }
      }
      
      System.out.println("La palabra "+palabraDeseada+" se ha encontrado "+coincidencias+" veces.");
      System.out.println("Programa terminado");
      br.close();
    } catch (Exception e) {
      System.err.println("Error, no se ha podido encontrar esas coincidencias.");
    }
  }

}
