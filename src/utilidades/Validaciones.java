package utilidades;

import java.util.Scanner;

public class Validaciones {
    public static void opcionValida(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("-----------------------------------");
            System.out.println("POR FAVOR INGRESE UNA OPCION VALIDA");
            System.out.println("-----------------------------------");
            scanner.next();
            System.out.println("----INGRESE SU OPCION---->:   ");
        }
    }
}