package AprendiendoJava;

import javax.swing.*;

public class Entrada_Numeros {

    public static void main(String [] args){

        String num1= JOptionPane.showInputDialog("Introduce un número");

        double num2=Double.parseDouble(num1);

        System.out.print("La raiz de " + num2 + " es ");

        System.out.printf("%1.2f", Math.sqrt(num2));

        // el 2 es por la cantidad de decimales
    }
}
