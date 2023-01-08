/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dividiendonros.servicios;

import dividiendonros.entidades.DivisionNumero;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class ServicioDivision {

    Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

    public DivisionNumero crearNumeros() {
        System.out.println("Ingrese numero");
        String num1 = leer.next();
        System.out.println("Ingrese otro numero");
        String num2 = leer.next();

        return new DivisionNumero(num1, num2);
    }

    public void dividirNumeros() {
        DivisionNumero nros = crearNumeros();
        int nro1 = 1;
        int nro2 = 1;

        try {
            nro1 = Integer.parseInt(nros.getN1());
            nro2 = Integer.parseInt(nros.getN2());
            int nro3 = (nro1 / nro2);
        } catch (NumberFormatException e) {
            System.out.println(e.fillInStackTrace());
        } catch (ArithmeticException f) {

            System.out.println(f.fillInStackTrace());
        }

    }
}
