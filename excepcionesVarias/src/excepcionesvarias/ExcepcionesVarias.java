/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepcionesvarias;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class ExcepcionesVarias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Todas estas operaciones puede tirar excepciones a manejar, el ingreso por teclado puede
causar una excepción de tipo InputMismatchException, el método Integer.parseInt() si la cadena
no puede convertirse a entero, arroja una NumberFormatException y además, al dividir un
número por cero surge una ArithmeticException. Manipule todas las posibles excepciones
utilizando bloques try/catch para las distintas excepciones*/

        Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        System.out.println("-------------------InputMismatchException--------------------------");
        List<Integer> lista = new ArrayList<Integer>();

        System.out.println("Introduce números. El cero para salir");

        int numero = 0;
        do {
            try {
                numero = leer.nextInt();
                lista.add(numero);
            } catch (InputMismatchException ime) {
                System.out.println(ime.fillInStackTrace());
                System.out.println("¡Cuidado! Solo puedes insertar números. ");
                leer.next();
            }
        } while (numero != 0);
        System.out.println(lista);
        System.out.println("---------------------------------------------");
        
        
    }

}
