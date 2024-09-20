package ejecucion;

import explicaciones.Detalle;
import menus.MenuPrincipal;
import menus.SubMenus;
import programas.Ejercicios;
import utilidades.Validaciones;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);//scanner permite  ingresar valores por consola , con esta permite crear un objeto

    public static void main(String[] args) {
        Scanner scannerMenuPrincipal = new Scanner(System.in);
        Scanner scannerMenuDatosPrimitivos =new Scanner (System.in);
        Scanner scannerTiposOperadores =new Scanner (System.in);
        Scanner scannerIf =new Scanner (System.in);
        Scanner scannerSwich =new Scanner (System.in);
        Scanner scannerTernaria =new Scanner (System.in);
        Scanner scannerWhile =new Scanner (System.in);
        Scanner scannerDoWhile =new Scanner (System.in);
        Scanner scannerFor =new Scanner (System.in);

        int opcion = 0;

        do {
            MenuPrincipal.menuPrincipal();//Clase y el metodo
            Validaciones.opcionValida(scannerMenuPrincipal);
            opcion = scannerMenuPrincipal.nextInt();

            switch (opcion) {
                case 1:
                    SubMenus.datosPrimitivos();
                    Validaciones.opcionValida(scannerMenuDatosPrimitivos);

                    int opcionUno =scannerMenuDatosPrimitivos.nextInt();

                    switch (opcionUno){
                        case 1:
                            Detalle.explicacionByte();
                            break;
                        case 2:
                            Detalle.explicacionShort();
                            break;
                        case 3:
                            Detalle.explicacionInt();
                            break;
                        case 4:
                            Detalle.explicacionLong();
                            break;
                        case 5:
                            Detalle.explicacionFloat();
                            break;
                        case 6:
                            Detalle.explicaiconDouble();
                            break;
                        case 7:
                            Detalle.explicacionChar();
                            break;
                        case 8:
                            Detalle.explicacionBoolean();
                            break;
                        case 0:
                            break;
                        default:
                            System.out.println (" ********************************************************************");
                            System.out.println (" *             HA SELECCIONADO UNA OPCIÓN INVALIDA,                 *");
                            System.out.println (" *                INGRESE NUEVAMENTE UNA OPCIÓN                     *");
                            System.out.println (" ********************************************************************");
                            break;
                    }
                    break;
                case 2:
                    SubMenus.queEsString();
                    int opcionDos =scannerMenuPrincipal.nextInt();

                    switch (opcionDos) {
                        case 1:
                            Detalle.explicacionString();
                            break;
                        case 0:
                            break;
                        default:
                            System.out.println (" ********************************************************************");
                            System.out.println (" *             HA SELECCIONADO UNA OPCIÓN INVALIDA,                 *");
                            System.out.println (" *                INGRESE NUEVAMENTE UNA OPCIÓN                     *");
                            System.out.println (" ********************************************************************");
                            break;
                    }
                    break;
                case 3:
                    SubMenus.queEsConstante();
                    int opcionTres =scannerMenuPrincipal.nextInt();

                    switch (opcionTres) {
                        case 1:
                            Detalle.explicacionConstante();
                            break;
                        case 0:
                            break;
                        default:
                            System.out.println (" ********************************************************************");
                            System.out.println (" *             HA SELECCIONADO UNA OPCIÓN INVALIDA,                 *");
                            System.out.println (" *                INGRESE NUEVAMENTE UNA OPCIÓN                     *");
                            System.out.println (" ********************************************************************");
                            break;
                    }
                    break;
                case 4:
                    SubMenus.tiposOperadores();
                    Validaciones.opcionValida(scannerTiposOperadores);
                    int opcionCuatro =scannerTiposOperadores.nextInt();

                    switch(opcionCuatro){
                        case 1:
                            Detalle.explicacionqueesOperador();
                            break;
                        case 2:
                            Detalle.explicaciontipoOperadorArtimeticos();
                            break;
                        case 3:
                            Detalle.explicaciontipoOperadorRelacionales();
                            break;
                        case 4:
                            Detalle.explicaciontipoOperadorLogicos();
                            break;
                        case 5:
                            Detalle.explicaciontipoOperadorAsignacion();
                            break;
                        case 6:
                            Detalle.explicaciontipoOperadorDecrementoIncremento();
                            break;
                        case 0:
                            break;
                        default:
                            System.out.println (" ********************************************************************");
                            System.out.println (" *             HA SELECCIONADO UNA OPCIÓN INVALIDA,                 *");
                            System.out.println (" *                INGRESE NUEVAMENTE UNA OPCIÓN                     *");
                            System.out.println (" ********************************************************************");
                            break;
                    }
                    break;
                case 5:
                    SubMenus.tiposCondicionales();
                    Validaciones.opcionValida(scannerIf);
                    int opcionCinco =scannerIf.nextInt();


                    switch (opcionCinco) {
                        case 1:
                            Detalle.explicacioncondicionalIf();
                            break;
                        case 2:
                            Detalle.explicacioncondicionalElseIf();
                            break;
                        case 3:
                            Detalle.explicacioncondicionalElse();
                            break;
                        case 4:
                            Ejercicios.programaIf();
                            break;
                        case 0:
                            break;
                        default:
                            System.out.println (" ********************************************************************");
                            System.out.println (" *             HA SELECCIONADO UNA OPCIÓN INVALIDA,                 *");
                            System.out.println (" *                INGRESE NUEVAMENTE UNA OPCIÓN                     *");
                            System.out.println (" ********************************************************************");
                            break;
                    }
                    break;
                case 6:
                    SubMenus.queEsswitch();
                    Validaciones.opcionValida(scannerSwich);
                    int opcionSeis =scannerSwich.nextInt();

                    switch (opcionSeis) {
                        case 1:
                            Detalle.explicacionSwitch();
                            break;
                        case 2:
                            Ejercicios.programaSwitch();
                            break;
                        case 0:
                            break;
                        default:
                            System.out.println (" ********************************************************************");
                            System.out.println (" *             HA SELECCIONADO UNA OPCIÓN INVALIDA,                 *");
                            System.out.println (" *                INGRESE NUEVAMENTE UNA OPCIÓN                     *");
                            System.out.println (" ********************************************************************");
                            break;
                    }
                    break;
                case 7:
                    SubMenus.queEsTernaria();
                    Validaciones.opcionValida(scannerTernaria);
                    int opcionSiete =scannerTernaria.nextInt();


                    switch (opcionSiete) {
                        case 1:
                            Detalle.explicacionTernaria();
                            break;
                        case 2:
                            Ejercicios.programaTernaria();
                            break;
                        case 3:
                            break;
                        default:
                            System.out.println (" ********************************************************************");
                            System.out.println (" *             HA SELECCIONADO UNA OPCIÓN INVALIDA,                 *");
                            System.out.println (" *                INGRESE NUEVAMENTE UNA OPCIÓN                     *");
                            System.out.println (" ********************************************************************");
                            break;
                    }
                    break;
                case 8:
                    SubMenus.queEsCicloDoWhile();
                    Validaciones.opcionValida(scannerDoWhile);
                    int opcionOcho =scannerDoWhile.nextInt();


                    switch (opcionOcho) {
                        case 1:
                            Detalle.explicacionCicloDoWhile();
                            break;
                        case 2:
                            Ejercicios.programaDowhile();
                            break;
                        case 0:
                            break;
                        default:
                            System.out.println (" ********************************************************************");
                            System.out.println (" *             HA SELECCIONADO UNA OPCIÓN INVALIDA,                 *");
                            System.out.println (" *                INGRESE NUEVAMENTE UNA OPCIÓN                     *");
                            System.out.println (" ********************************************************************");
                            break;
                    }
                    break;
                case 9:
                    SubMenus.queEsCicloWhile();
                    Validaciones.opcionValida(scannerWhile);
                    int opcionNueve =scannerWhile.nextInt();

                    switch (opcionNueve) {
                        case 1:
                            Detalle.explicacionCicloWhile();
                            break;
                        case 2:
                            Ejercicios.programaWhile();
                            break;
                        case 0:
                            break;
                        default:
                            System.out.println (" ********************************************************************");
                            System.out.println (" *             HA SELECCIONADO UNA OPCIÓN INVALIDA,                 *");
                            System.out.println (" *                INGRESE NUEVAMENTE UNA OPCIÓN                     *");
                            System.out.println (" ********************************************************************");
                            break;
                    }
                    break;
                case 10:
                    SubMenus.queEsCicloFor();
                    Validaciones.opcionValida(scannerFor);
                    int opcionDiez =scannerFor.nextInt();


                    switch (opcionDiez) {
                        case 1:
                            Detalle.explicacionCicloFor();
                            break;
                        case 2:
                            Ejercicios.programaFor();
                            break;
                        case 0:
                            break;
                        default:
                            System.out.println (" ********************************************************************");
                            System.out.println (" *             HA SELECCIONADO UNA OPCIÓN INVALIDA,                 *");
                            System.out.println (" *                INGRESE NUEVAMENTE UNA OPCIÓN                     *");
                            System.out.println (" ********************************************************************");
                            break;
                    }
                    break;
                case 0:
                    break;
                default:
                    System.out.println (" ********************************************************************");
                    System.out.println (" *             HA SELECCIONADO UNA OPCIÓN INVALIDA,                 *");
                    System.out.println (" *                INGRESE NUEVAMENTE UNA OPCIÓN                     *");
                    System.out.println (" ********************************************************************");
            }
            if (opcion != 0) {
                System.out.println("PRESIONE ENTER PARA CONTINUAR...");
                scanner.nextLine(); // Espera a que el usuario presione Enter
                for (int i = 0; i < 10; i++) {
                    System.out.println("  ");
                }
            }
        } while (opcion != 0);//  si ya no se cumple  la condicion se detiene  por eso se coloca cero
        System.out.println("  ****************************************** ");
        System.out.println("  *   USTED HA SALIDO DEL MENÚ PRINCIPAL   * ");
        System.out.println("  *        GRACIAS POR SU VISITA           * ");
        System.out.println("  *               --*--                    * ");
        System.out.println("  ****************************************** ");
    }
}

