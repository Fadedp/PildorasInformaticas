package AprendiendoJava;

import java.util.Scanner;

public class Entrada_Ejemplo1 {
    public static void main(String [] args){

        Scanner entrada=new Scanner(System.in);

        System.out.println("Introduce tu nombre, por favor");

        String nombreUsuario=entrada.nextLine();

        System.out.println("Introduce edad, por favor");

        int edad=entrada.nextInt();

        System.out.println("Hola" + nombreUsuario + ", el año que viene tendrás " + (edad+1) + " años");


    }
}
