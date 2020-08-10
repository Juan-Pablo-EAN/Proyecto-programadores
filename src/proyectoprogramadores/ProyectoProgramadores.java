package proyectoprogramadores;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ProyectoProgramadores {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        DecimalFormat dec = new DecimalFormat("#.0");

        int base = 3000000;
        int eleccion = 0;

        System.out.println("Bienvenido programador");
        System.out.println("¿Qué tipo de aplicación vas a desarrollar?");
        System.out.println("1. App de escritorio");
        System.out.println("2. App movil");
        System.out.println("3. Desarrollo web");
        System.out.println("4. multiplataforma");
        eleccion = entrada.nextInt();
        if(eleccion == 1){
             
        }
    }

}
