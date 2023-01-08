/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dividiendonros;

import dividiendonros.servicios.ServicioDivision;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class DividiendoNros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /*Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos
números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
una división con los dos numeros y mostrar el resultado.*/
       
//        Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
//        String n1 ="123e";
//        int nro1 = Integer.parseInt(n1);
       ServicioDivision sd = new ServicioDivision();
       
       sd.dividirNumeros();
    }
    
}
