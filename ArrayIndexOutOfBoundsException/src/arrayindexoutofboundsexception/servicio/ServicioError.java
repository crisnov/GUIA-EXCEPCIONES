/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayindexoutofboundsexception.servicio;

import java.util.Locale;
import java.util.Scanner;
import arrayindexoutofboundsexception.entidades.Clase;

/**
 *
 * @author crist
 */
public class ServicioError {

    Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    

    public Clase crearClase() {
        int[] Vector = new int[5];

        try {

            for (int i = 0; i < 6; i++) {
                Vector[i] = i;
            }

        } catch (Exception e) {
            System.out.println("fuera de rango");
            System.out.println(e.fillInStackTrace());
        }

        return new Clase(Vector);
    }
}
