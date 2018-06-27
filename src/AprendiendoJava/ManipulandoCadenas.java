package AprendiendoJava;

public class ManipulandoCadenas {
    public static void main(String [] args){

        String nombre="Facundo";

        System.out.println("Mi nombre es " + nombre);

        System.out.println("Mi nombre tiene " + nombre.length() + " letras");

        System.out.println("La primer letras de " + nombre + " es la " + nombre.charAt(0));

        int ultimaletra=nombre.length();

        System.out.println("Y la ultima letra es la " + nombre.charAt(ultimaletra-1));
    }
}
