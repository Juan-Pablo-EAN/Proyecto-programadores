package proyectoprogramadores;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ProyectoProgramadores {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        DecimalFormat dec = new DecimalFormat("#.0");

        int base = 3000000;
        int eleccion = 0;
        int precio = 0;
        int tiempo = 0;
        String moneda = "";
        String tipo = "";

        System.out.println("Bienvenido programador");
        System.out.println("¿Qué tipo de aplicación vas a desarrollar?");
        System.out.println("1. App de escritorio");
        System.out.println("2. App movil");
        System.out.println("3. Desarrollo web");
        System.out.println("4. multiplataforma");
        eleccion = entrada.nextInt();
        if (eleccion == 1) {

        } else if (eleccion == 3) { //inicio de la condicion de paginas web
            precio = base + 1000000 + 250000 + 42000;
            tiempo = 4;
            tipo = "pagina web";
            
        } else if (eleccion == 4) { //inicio de la condicion de app multiplataforma
            precio = base + 5000000;
            tiempo = 6;
            tipo = "aplicación multiplataforma";
        }
        System.out.println("¿Deseas el precio en pesos colombianos, dolares o euros?");
        System.out.println("1. Pesos colombianos");
        System.out.println("2. Dolares");
        System.out.println("3. Euros");
        eleccion = entrada.nextInt();
        if (eleccion == 1) {
            precio = precio;
            moneda = "pesos";
        } else if (eleccion == 2) {
            precio = precio/3772; //conversion a dolares
            moneda = "dolares";
        } else if (eleccion == 3) {
            precio = precio/4428; //conversion a euros
            moneda = "euros";
        } else {
            System.out.println("Ingresaste un valor incorrecto");
        }

        System.out.println("El costo de una " + tipo + " es de $" + precio + " " + moneda + " y tardaría " + tiempo + " meses.");
    }

}
