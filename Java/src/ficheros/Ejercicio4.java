package ficheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 * Realiza un programa que sea capaz de ordenar alfabéticamente las palabras
 * contenidas en un fichero de texto. El nombre del fichero que contiene las
 * palabras se debe pasar como argumento en la línea de comandos. El nombre del
 * fichero resultado debe ser el mismo que el original añadiendo la coletilla
 * sort, por ejemplo palabras_sort.txt. Suponemos que cada palabra ocupa una
 * línea.
 * 
 * @author d18momoa
 *
 */
public class Ejercicio4 {

  public static void main(String[] args) {

    try {
      BufferedReader br = new BufferedReader(new FileReader(args[0] + "+.txt"));
      BufferedWriter bw = new BufferedWriter(new FileWriter(args[0] + "_sort.txt"));
      String linea = "";
      ArrayList<String> lista = new ArrayList<String>();

      while (linea != null) {
        linea = br.readLine();
        lista.add(linea);
      }
      lista.sort(null);

      for (String x : lista) {
        bw.write(x);
      }

      System.out.println("Las palabras se han ordenado. Programa terminado");
      br.close();
      bw.close();

    } catch (Exception e) {
      System.err.println("Error, no se ha podido llevar a cabo la accion.");
    }

  }

}
