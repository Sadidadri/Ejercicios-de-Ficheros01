package ficheros;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 * Escribe un programa que guarde en un fichero con nombre primos.dat los
 * numeros primos que hay entre 1 y 500.
 * 
 * @author d18momoa
 *
 */
public class Ejercicio1 {

  public static void main(String[] args) {
    try {
      // Creamos el fichero en modo escritura
      BufferedWriter bw = new BufferedWriter(new FileWriter("primos.dat"));

      ArrayList<Integer> primos = new ArrayList<Integer>();
      // Se agnaden los 2 primeros elementos de la lista, el 1 y el 2
      primos.add(1);
      primos.add(2);
      // numero con el que se realizara la comprobacion si es primo o no
      int num = 3;
      while (num < 501) {
        boolean es_primo = true;
        int divisor = 3;
        while (divisor <= Math.sqrt(num) && es_primo) { // comprobamos que el numero sea primo o no
          if (num % divisor == 0) {
            es_primo = false;
          }
          divisor += 2;
        }
        if (es_primo) {
          primos.add(num); // si es primo se agnade a la lista
        }
        num += 2; // aumentamos de dos en dos ya que los pares no son primos
      }
      for (int i : primos) {
        bw.write(i + " ");
      }
      bw.close();
      System.out.println("Programa finalizado.");
    } catch (Exception e) {
      System.err.println("No se ha podido llevar a cabo el proceso");
    }
  }

}
