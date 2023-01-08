/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adivinarnumero;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class AdivinarNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora
debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para
ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el
número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando
consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario
ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe
controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el
carácter fallido como un intento.*/
        Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

        System.out.println("A continuacion se creará un numero aleatorio");

        int numeroAleatorio = (int) (Math.random() * 500 + 1);
        System.out.println("                                                                                                      "+numeroAleatorio);

        int num = 0;
        int cont = 0;
  
        do {
            cont += 1;
            System.out.println(" cantidad de intentos: " + cont);

            try {

                System.out.println("Ingrese numero:");
                num = leer.nextInt();
                if (numeroAleatorio > num && num != 0) {
                    System.out.println("El numero a adivinar es mayor");

                } else if (numeroAleatorio < num) {
                    System.out.println("El numero a adivinar es menor");

                } else {
                    System.out.println("Correcto, has adivinado el numero! FELICITACIONES!");
                }

            } catch (InputMismatchException e) {
                System.out.println("error, ingrese un numero entero | " + e);
               leer.next();
            }

        } while (num != numeroAleatorio);

        System.out.println("Se ha intentado " + cont + " veces");
    }

}
