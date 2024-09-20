package programas;

import java.util.Random;
import java.util.Scanner;
public class Ejercicios {
    public static void programaIf(){
        System.out.println("----------------------------------------------------------------------  ");
        System.out.println("504 PROGRAMA  DE  CONDICIONAL-¿CUAL ES LA EDAD?- IF, ELSE IF ELSE       ");
        System.out.println("----------------------------------------------------------------------  ");
        Scanner scannerEdad = new Scanner(System.in);
        System.out.println("Ingrese su edad:   ");
        int edad = scannerEdad.nextInt();
        System.out.println(edad);
        if (edad <= 12){
            System.out.println("su edad es entre 0 a 12 años eres un niño");
        } else if (edad <= 20){
            System.out.println("su edad 13 a 20 años eres un joven");
        } else if (edad <= 60){
            System.out.println("su edad 21 a 60 años eres un adulto");
        }if(edad >= 61){
            System.out.println("su edad  es mayor a 61 eres de la tercera edad");
        } else{
        }
    }
    public static void programaSwitch(){
        Scanner scannerNota = new Scanner(System.in);
        System.out.println("Ingrese su Nota del 1 al 10 número entero:   ");
        int nota = scannerNota.nextInt();
        System.out.println(nota);

        switch (nota) {
            case 1:
            case 2:
                System.out.println("Su calificacion es: F");
                break;
            case 3:
            case 4:
                System.out.println("Su calificación es: D");
                break;
            case 5:
            case 6:
                System.out.println("Su calificación es: C");
                break;
            case 7:
            case 8:
                System.out.println("Su calificación es: B");
                break;
            case 9:
            case 10:
                System.out.println("Su calificación es: A");
                break;
            default:
                System.out.println("Número no valido, por favor verifique");
                break;
        }
    }
    public static void programaTernaria(){
        Scanner scannerparimpar = new Scanner(System.in);
        System.out.println("Ingrese el numero:   ");
        int numerito = scannerparimpar.nextInt();
        String resultado = (numerito % 2 == 0 ? " un numero par"   : " un numero impar   ");
        System.out.print("El numero      " + numerito + " es " +  resultado);
    }
    public static void programaDowhile(){
        Scanner t = new Scanner(System.in);
        System.out.println("Ingrese un número entero para adivinar cual es  ");
        int numeroAleatorio;
        int num;
        int cont = 0;
        Random a = new Random();
        numeroAleatorio = a.nextInt (10) +1;
        do {
            System.out.println ("Ingrese su numero favorito");
            num = t.nextInt ();
            cont++;

            if (num > numeroAleatorio) {
                System.out.println ("el numero es menor");
            }

            if(num < numeroAleatorio) {
                System.out.println ("el numero es mayor");
            }

            System.out.println ("Intentos:   "  + cont);

        } while (num != numeroAleatorio);
        System.out.println ("****Felicidades el numero es:***-->   "+ num  );
    }
    public static void programaWhile(){
        Scanner scannersum = new Scanner (System.in);
        System.out.println("Ingrese un número entero :     ");
        int Sum = scannersum.nextInt();
        int suma = 0;
        int i = 1;
        while(i<= Sum) {
            suma += i;
            i++;
        }
        System.out.print ("la suma es :    " + suma);
        System.out.print ("                       ");
    }
    public static void programaFor(){
        Scanner scannersumatoria = new Scanner (System.in);
        System.out.println("Ingrese un número entero:   ");
        int Sumatoria = scannersumatoria.nextInt();
        int sumatoria = 0;
        for (int n = 1; n<=Sumatoria; n++) {
            sumatoria +=n;
        }
        System.out.print("La sumatoria es:   " + sumatoria);
        System.out.print ("                              ");
    }
}