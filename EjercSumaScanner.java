package Cmy;

import java.util.Scanner;

public class EjercSumaScanner{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Desea sumar numeros? s/n: ");
        String opcion = scanner.nextLine();

        int suma = 0;

        while (opcion.equalsIgnoreCase("s")) {
            int numero = solicitarNumeros(scanner, "Ingrese un num: ");

            suma += numero;

            System.out.print("Desea seguir sumando numeros? (s/n): ");
            opcion = scanner.next();
            scanner.nextLine();
        }

        System.out.print("La suma es: " + suma);
    }

    private static int solicitarNumeros(Scanner scanner, String mensaje) {
        System.out.print(mensaje);
        return scanner.nextInt();
    }
}