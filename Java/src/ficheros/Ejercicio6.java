package ficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Realiza un programa que diga cu�ntas ocurrencias de una palabra hay en un
 * fichero. Tanto el nombre del fichero como la palabra se deben pasar como
 * argumentos en la l�nea de comandos.
 * 
 * @author d18momoa
 *
 */
public class Ejercicio6 {

  public static void main(String[] args) {
    try {
      // BufferedReader br = new BufferedReader(new FileReader(args[0]+".txt"));
      BufferedReader br = new BufferedReader(new FileReader("loremIpsum.txt"));
      String linea = "";
      // String palabraDeseada = ""+args[1]; //Palabra la cual queremos buscar en el
      // fichero
      String palabraDeseada = "amet"; // Palabra la cual queremos buscar en el fichero
      int coincidencias = 0; // Numero de veces que se encuentra la palabra
      while (linea != null) {
        linea = br.readLine();
        String[] palabras = new String[] { "" }; // Se inicializa para evitar que en el foreach pueda dar un
                                                 // NullPointerExceptionAlFinal
        if (linea != null) {
          palabras = linea.split(" "); // Separa las palabras separadas por espacios y las almacena en un array de
                                       // string
        }
        for (String x : palabras) { // Recorre el array y si coincide con la palabra deseada, aumenta el contador
          if (x.equals(palabraDeseada)) {
            coincidencias++;
          }
        }
      }

      System.out.println("La palabra " + palabraDeseada + " se ha encontrado " + coincidencias + " veces.");
      System.out.println("Programa terminado");
      br.close(); // Cierre de archivo
    } catch (Exception e) {
      System.err.println(
          "Error, no se ha podido llevar a cabo el programa por la siguiente excepcion:\n" + e.getLocalizedMessage());
    }
  }

}
