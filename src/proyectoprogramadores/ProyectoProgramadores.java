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
        System.out.println("¿Qué tipo de aplicación vas a desarrollar? Ingresa el número correspondiente");
        System.out.println("1. App de escritorio");
        System.out.println("2. App movil");
        System.out.println("3. Desarrollo web");
        System.out.println("4. Multiplataforma");
        eleccion = entrada.nextInt();
        if (eleccion == 1) {
            System.out.println("Escoge el tipo de sistema de operativo:");

            System.out.println("1. Windows");
            System.out.println("2. Mac");
            System.out.println("3. Linux");
            System.out.println("4. Desarrollo multisistema");

            eleccion = entrada.nextInt();
            switch (eleccion) {
                case 1:
                    precio = base + 1000000;
                    tiempo = 4;
                    tipo = "aplicación para Windows";
                    break;
                case 2:
                    precio = base + 1000000;
                    tiempo = 4;
                    tipo = "aplicación para Mac";
                    break;
                case 3:
                    precio = base + 1500000;
                    tiempo = 4;
                    tipo = "aplicación para Linux";
                    break;
                case 4:
                    precio = base + 3000000;
                    tiempo = 4;
                    tipo = "aplicación multisistema";
                    break;
                default:
                    System.out.println("La opción que escogiste es incorrecta, por favor vuelve a intentar");
            }

        } else if (eleccion == 2) {
            System.out.println("Seleccione el tipo de sistema de operativo movil : ");

            System.out.println("1. Android");
            System.out.println("2. IOS");
            System.out.println("3. Windows Phone");
            System.out.println("4. Multisistema movil");

            eleccion = entrada.nextInt();
            switch (eleccion) {
                case 1:
                    precio = base + 1000000;
                    tiempo = 4;
                    tipo = "aplicación para el sistema operativo Android";
                    break;
                case 2:
                    precio = base + 2000000;
                    tiempo = 4;
                    tipo = "aplicación para el sistema operativo IOS";
                    break;
                case 3:
                    precio = base + 1000000;
                    tiempo = 4;
                    tipo = "aplicación para el sistema operativo Windows Phone";
                    break;
                case 4:
                    precio = base + 2500000;
                    tiempo = 4;
                    tipo = "aplicación multisistema movil";
                    break;
                default:
                    System.out.println("La opción que escogiste es incorrecta, por favor vuelve a intentar");
            }
        } else if (eleccion == 3) { //inicio de la condicion de paginas web
            precio = base + 1000000 + 250000 + 42000;
            tiempo = 4;
            tipo = "pagina web";

        } else if (eleccion == 4) { //inicio de la condicion de app multiplataforma
            precio = base + 5000000;
            tiempo = 6;
            tipo = "aplicación multiplataforma";
        } else {
            System.out.println("La opción que escogiste es incorrecta, por favor vuelve a intentar");
        }
        System.out.println("¿Deseas el precio en pesos colombianos, dolares o euros?");
        System.out.println("1. Pesos colombianos");
        System.out.println("2. Dolares");
        System.out.println("3. Euros");
        eleccion = entrada.nextInt();
        if (eleccion == 1) {
            precio = precio;
            moneda = "de pesos";
        } else if (eleccion == 2) {
            precio = precio / 3772; //conversion a dolares
            moneda = "dolares";
        } else if (eleccion == 3) {
            precio = precio / 4428; //conversion a euros
            moneda = "euros";
        } else {
            System.out.println("Ingresaste un valor incorrecto");
        }
        System.out.println("El costo de una " + tipo + " es de $" + dec.format(precio) + " " + moneda + " y tardaría " + tiempo + " meses.");
    }
}
