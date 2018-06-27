package AprendiendoJava;

import javax.swing.*;

public class Entrada_Ejemplo2 {

    public static void main(String [] args){

        String nombreUsuario= JOptionPane.showInputDialog("Introduce tu nombre, por favor");

        String edad=JOptionPane.showInputDialog("Introduce la edad, por favor");

        int edadUsuario=Integer.parseInt(edad);

        System.out.println("Hola " + nombreUsuario + ". El año que viene tendras " + (edadUsuario+1) + " años");

    }
}
