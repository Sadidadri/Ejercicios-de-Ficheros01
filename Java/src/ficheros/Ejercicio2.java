package ficheros;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Realiza un programa que lea el fichero creado en el ejercicio anterior y que
 * muestre los números por pantalla.
 * @author d18momoa
 *
 */
public class Ejercicio2 {

  public static void main(String[] args) {
    
    try {
      BufferedReader br = new BufferedReader(new FileReader("primos.dat"));
      String primos = br.readLine();
      System.out.println("Los numeros primos del fichero son:");
      System.out.println(primos);
      br.close();
    }catch(Exception e) {
      System.err.println("No hemos podido llevar a cabo el proceso");
    }
  }

}
