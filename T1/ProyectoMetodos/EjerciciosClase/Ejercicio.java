import java.util.Scanner;

public class Ejercicio {
    private Scanner sc;
    //! Ejercicio 1
    public void ejercicio1() {
        sc = new Scanner(System.in);
        System.out.print("Cuantas bebidas vas a comprar?");
        int bebidas = sc.nextInt();

        // 1 -> pedir cosas por teclado
        // 2 -> guardar cosas en variables
        System.out.print("Cuantos bocadillos vas a comprar?");
        int bocadillos = sc.nextInt();
        System.out.print("Cuanto vale cada bebida?");
        double precioBebida = sc.nextDouble();
        System.out.print("Cuanto vale cada bocadillo?");
        double precioBocadillo = sc.nextDouble();
        System.out.print("Cuantas personas han realizado la compra?");
        int numeroPersonas = sc.nextInt();

        //3 -> realizar calculos
        double precioBocadillos = bocadillos*precioBocadillo;
        double precioBebidas = bebidas*precioBebida;
        double costeTotal = precioBocadillo + precioBebida;
        double precioPersona = costeTotal/numeroPersonas;

        // 4 -> mostrar informacion
        System.out.printf("El precio total de la compra es: %.2f\n",costeTotal);
        System.out.printf("El precio total de los bocadillos es: %.2f\n", precioBocadillos);
        System.out.printf("El precio total de las bebidas es: %.2f\n", precioBebidas);
        System.out.printf("El precio por persona es: %.2f\n", precioPersona);
        sc.close();
    }

    //! Ejercicio2
    public void ejercicio2(){
        sc = new Scanner(System.in);
        System.out.print("Precio con IVA: ");
        double precioConIVA = sc.nextDouble();
        System.out.print("IVA: ");
        int IVA = sc.nextInt();
        double precioSinIVA = precioConIVA - (precioConIVA * (double)IVA/100);
        double precioIVA = precioConIVA - precioSinIVA;
        System.out.printf("Precio con IVA: %.2f\n", precioConIVA);
        System.out.println("IVA: " + IVA + "%");
        System.out.printf("Precio sin IVA: %.2f\n", precioSinIVA);
        System.out.printf("Coste del IVA: %.2f", precioIVA);
    }

    //! Ejercicio3
    public void ejercicio3(){
        sc = new Scanner(System.in);
        System.out.print("Numero: ");
        int numero = sc.nextInt();
        int diezmiles = numero / 10000; // 12345 : 1 : 2345
        int miles = (numero % 10000) / 1000; // 2345 : 2 : 345
        int centenas = (numero % 1000) / 100; // 
        int decenas = (numero % 100) / 10;
        int unidades = numero % 10;
        System.out.println("Diezmiles: " + diezmiles);
        System.out.println("Miles: " + miles);
        System.out.println("Centenas: " + centenas);
        System.out.println("Decenas: " + decenas);
        System.out.println("Unidades: " + unidades);
    }

    //! Ejercicio4
    public void ejercicio4() {
        sc = new Scanner(System.in);
        System.out.print("Cuantos segundos quieres pasar a tiempo");
        int segundos = sc.nextInt();
        int horas = segundos / 3600;
        int minutos = (segundos % 3600) / 60;
        segundos = segundos % 60;
        System.out.println(horas + " horas");
        System.out.println(minutos + " minutos");
        System.out.println(segundos + " segundos");
        sc.close();
    }
}
