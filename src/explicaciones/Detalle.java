package explicaciones;

public class Detalle {

    public static void explicacionByte(){

        System.out.println("--------------------------------------------------------------------   ");
        System.out.println("1      Datos  Primitivos           'byte'                             ");
        System.out.println("       Descripcion  es utilizado para datos pequeños y                 ");
        System.out.println("       optimización de memoria en arrays grandes.                      ");
        System.out.println("       Representa un tipo de dato de 8 bits con signo.                 ");
        System.out.println("       Tamaño (bytes)    es  1                                         ");
        System.out.println("       Rango  va  entre  -128 a 127                                    ");
        System.out.println("              Ejemplo   'byte edad =  25'                              ");
        System.out.println("--------------------------------------------------------------------   ");
    }

    public static void explicacionShort(){

        System.out.println("--------------------------------------------------------------------   ");
        System.out.println(" 2     Datos  Primitivos           'short'                             ");
        System.out.println("        Descripcion  es útil para datos numéricos más                  ");
        System.out.println("        grandes que  'byte' pero aún pequeños.                         ");
        System.out.println("        Representa un tipo de dato de 16 bits con signo.               ");
        System.out.println("        Algunas de las aplicaciones del tipo short son:                ");
        System.out.println("        --Para representar valores que no necesitan mucha              ");
        System.out.println("        precisión  y que están dentro del rango permitido              ");
        System.out.println("        --También se utilizan para ahorrar espacio en matrices         ");
        System.out.println("        -- que contienen muchos valores enteros pequeños.              ");
        System.out.println("        * Tamaño (bytes)    es  2                                      ");
        System.out.println("        De esta manera almacena valores numéricos                      ");
        System.out.println("                Rango  va  entre  -32,768 a 32,767                     ");
        System.out.println("                Ejemplo   short año =  2024;                           ");
        System.out.println("                Ejemplo   short temperatura =  -10 ;                   ");
        System.out.println("                Ejemplo   short  numero de la habitacion =  105;       ");
        System.out.println("--------------------------------------------------------------------   ");
    }
    public static void explicacionInt(){
        System.out.println("--------------------------------------------------------------------   ");
        System.out.println("  3   Datos  Primitivos               'int'                            ");
        System.out.println("        Descripcion  es utilizado para para números enteros            ");
        System.out.println("        Algunas de las aplicaciones del tipo de dato int son:          ");
        System.out.println("        **Para programar contadores y variables de control  en         ");
        System.out.println("        ciclos(bucles) y estructuras de control de flujo del programa  ");
        System.out.println("        **En otra aplicación, son utilizados como valores numéricos en ");
        System.out.println("        cálculos  matemáticos y operaciones aritméticas.               ");
        System.out.println("        * Es un tipo de dato de 32 bits con signo para almacenar valores");
        System.out.println("        numéricos                                                      ");
        System.out.println("        * Tamaño (bytes)    es  4                                      ");
        System.out.println("                Rango  -2.147.483.648 a 2.147.483.647 en valor decimal ");
        System.out.println("                Ejemplo   int numeroEntero = 100;                      ");
        System.out.println("                Ejemplo   int salario = 500000;                        ");
        System.out.println("--------------------------------------------------------------------   ");
    }
    public static void explicacionLong(){
        System.out.println("--------------------------------------------------------------------   ");
        System.out.println(" 1     Datos  Primitivos                                               ");
        System.out.println(" 4     Datos  Primitivos             long                              ");
        System.out.println("       Descripcion  es utilizado para para números enteros             ");
        System.out.println("       muy grandes                                                     ");
        System.out.println("       Algunas de las aplicaciones del tipo de dato long son:          ");
        System.out.println("       Para medir el tiempo cuando la cantidad de dígitos es amplia,   ");
        System.out.println("       como al añadir milisegundos, segundos, minutos, horas, días     ");
        System.out.println("       Otra aplicación es para cálculos matemáticos que requieren una  ");
        System.out.println("       precisión, como en problemas de física, ingenieria o matemáticas");
        System.out.println("       * Es un tipo de dato de 64 bits con signo para almacenar valores");
        System.out.println("        numéricos                                                      ");
        System.out.println("       * Tamaño (bytes)    es  8                                       ");
        System.out.println("                Rango  va  entre  -9223372036854775808                 ");
        System.out.println("                 y 9223372036854775808                                 ");
        System.out.println("                Ejemplo1   long distancia= 15000000000000000000000;    ");
        System.out.println("                Ejemplo2   long numeroLargo = 999999999;               ");
        System.out.println("                Ejemplo3    población mundial =4899999999999;          ");
        System.out.println("--------------------------------------------------------------------   ");
    }
    public static void explicacionFloat(){
        System.out.println("--------------------------------------------------------------------   ");
        System.out.println(" 5     Datos  Primitivos         float                                 ");
        System.out.println("       Descripción son  numeros  en como flotante de precisión simple  ");
        System.out.println("       Algunas de las aplicaciones del tipo de dato  float  son:       ");
        System.out.println("       -Para representar números con decimales, como la altura de una  ");
        System.out.println("       persona,la temperatura de un ambiente,el precio de un producto  ");
        System.out.println("       -También se utilizan para cálculos matemáticos que involucran   ");
        System.out.println("       números con decimales,como problemas de física, ingeniería o    ");
        System.out.println("       matemáticas.                                                    ");
        System.out.println("       Es un tipo dato para almacenar números en coma flotante con     ");
        System.out.println("       precisión simple de 32 bits.                                    ");
        System.out.println("       * Tamaño (bytes)    es  4                                       ");
        System.out.println("               Rango  va  entre  1.4e-45 a 3.4e38 en valor decimal     ");
        System.out.println("               Ejemplo1:   'float precio = 19.99f; '                   ");
        System.out.println("               Ejemplo2:    float numeroFlotante = 3.1416f;            ");
        System.out.println("--------------------------------------------------------------------   ");
    }
    public static void explicaiconDouble(){
        System.out.println("--------------------------------------------------------------------   ");
        System.out.println("6     Datos  Primitivos            double                              ");
        System.out.println("      Descripción son  numeros  en como flotante de precisión          ");
        System.out.println("      doble precisión.                                                 ");
        System.out.println("      Algunas de las aplicaciones del tipo de dato double son:         ");
        System.out.println("      -Se emplean para representar números con decimales con una alta  ");
        System.out.println("      precisión,como en cálculos financieros, científicos,de ingeniería");
        System.out.println("      -También se utilizan para almacenar grandes cantidades de datos en");
        System.out.println("      una matriz o estructura de datos, así como en la manipulación de ");
        System.out.println("      grandes conjuntos de datos.                                      ");
        System.out.println("      - También se utilizan en la geolocalización para almacenar las   ");
        System.out.println("      coordenadas de la latitud y longitud de un lugar en un sistema,  ");
        System.out.println("      como en una aplicación de mapas                                  ");
        System.out.println("      *   Tamaño (bytes)    es  8                                      ");
        System.out.println("                Rango  va  entre  4.9e-324 a 1.8e308 en valor decimal  ");
        System.out.println("                Ejemplo1:   'double pi = 3.141592653589793;'           ");
        System.out.println("--------------------------------------------------------------------   ");
    }
    public static void explicacionChar(){
        System.out.println("--------------------------------------------------------------------   ");
        System.out.println("7    Datos  Primitivos          char                                   ");
        System.out.println("      Descripcion  Almacena valores de verdad.                         ");
        System.out.println("      se representan con caracteres individuales,como letras y símbolos");
        System.out.println("      Algunas de las aplicaciones del tipo de dato char  son:          ");
        System.out.println("      - Se emplean en la entrada y salida de datos para representar    ");
        System.out.println("      caracteres,como letras, números y signos de puntuación, y con    ");
        System.out.println("      ello formar otro tipo de datos en cadena.                        ");
        System.out.println("      * Tamaño (bytes)    es  2                                        ");
        System.out.println("      Rango  va entre 0 a 65.535 en valor decimal (caracteres Unicode) ");
        System.out.println("             Ejemplo1:   'char inicial =  'A';'                        ");
        System.out.println("             Ejemplo2:   char b = 'b';                                 ");
        System.out.println("--------------------------------------------------------------------   ");
    }
    public static void explicacionBoolean(){
        System.out.println("--------------------------------------------------------------------   ");
        System.out.println(" 8    Datos  Primitivos            boolean                             ");
        System.out.println("      Descripcion  Almacena valores  de verdad                         ");
        System.out.println("      El tipo de datos boolean se utiliza para almacenar un valor de   ");
        System.out.println("      verdadero o falso, que representa el resultado de una expresión  ");
        System.out.println("      lógica.                                                          ");
        System.out.println("      Algunas de las aplicaciones del tipo de dato boolean son:        ");
        System.out.println("      -Para representar el resultado de la toma de decisiones en un    ");
        System.out.println("      programa; estos valores son el resultado de una expresión lógica,");
        System.out.println("      como una comparación una operación booleana de tipo AND,OR,NOT,etc");
        System.out.println("      -También se emplean en la programación condicional para controlar");
        System.out.println("      el flujo de ejecución del programa en estructuras condicionales  ");
        System.out.println("      como if-else, while, do-while, etc.                              ");
        System.out.println("      -Otra aplicación es la validación de datos para verificar si los ");
        System.out.println("       datos ingresados por el usuario son válidos o no.               ");
        System.out.println("       * Tamaño (bytes)   es  1 bit ( dependiendo de la JVM)          ");
        System.out.println("       * Tienen un valor de true o false.                             ");
        System.out.println("         Ejemplo1:    boolean esVerdadero = true;                     ");
        System.out.println("         Ejemplo2:    boolean esMayorDeEdad  =true; System.out.println");
    }
    public static void explicacionString(){
        System.out.println("--------------------------------------------------------------------     ");
        System.out.println("2  String                                                                ");
        System.out.println("   Descripcion En Java, los String son un objeto el cual nos permite      ");
        System.out.println("   almacenar muchos caracteres.                                           ");
        System.out.println("   Un objeto String representa una cadena alfanumérica de un valor        ");
        System.out.println("   constante que no puede ser cambiada después de haber sido creada.      ");
        System.out.println("   y se utiliza en aplicaciones para almacenar y manipular texto         ");
        System.out.println("   En Java,una cadena de texto se define utilizando comillas dobles      ");
        System.out.println("   alrededor del texto.                                                  ");
        System.out.println("   Ejem.1 String mensaje= Hola Mundo;//Usado comillas dobles para iniciar");
        System.out.println("   Ejem.2 String nombre= new String (Mario);//Usando el constructor de String");
        System.out.println("   Ejem.3 String nombre= Hola + nombre;//Resultado: mensaje= Hola Mario   ");
        System.out.println("--------------------------------------------------------------------      ");
    }
    public static void explicacionConstante(){
        System.out.println("--------------------------------------------------------------------   ");
        System.out.println("3    Constantes                                                        ");
        System.out.println("     Descripcion En Java, una constante  es  un valor  que no cambia   ");
        System.out.println("     durante la ejecución del programa.                                ");
        System.out.println("     Las constantes se utilizan para representar valores fijos y de    ");
        System.out.println("     lectura fijosy de lectura única,lo que ayuda a que el código sea  ");
        System.out.println("     más legible y menos propenso a errores.                           ");
        System.out.println("     Las contantes en Java se declaran usando la palabra clave final   ");
        System.out.println("     Ejemplo1  final int VALUE = 54;                                   ");
        System.out.println("     Ejemplo2  public static final int TIEMPO_ESPERA_CONEXION  = 50;   ");
        System.out.println("     Ejemplo3  public static final boolean MODO_DEPURACION  = true;    ");
        System.out.println("--------------------------------------------------------------------   ");
    }
    public static void explicacionqueesOperador(){
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("4    Tipos de operadores                                               ");
        System.out.println("1    Operador                                                          ");
        System.out.println("     Descripcion ¿Qué es operador?                                     ");
        System.out.println("     En programación un operador representa un símbolo que permite     ");
        System.out.println("     realizar operaciones aritméticas, relacionar elementos            ");
        System.out.println("     o hacer preguntas donde se involucra más de una condición.        ");
        System.out.println("     Los Operadores en JAVA presentan los símbolos de los operadores   ");
        System.out.println("     que se utilizan enel lenguaje de programación JAVA                ");
        System.out.println("     Existen los siguientes  tipos de operadores:                      ");
        System.out.println("     Aritméticos,Relacionales y Lógicos.                               ");
        System.out.println("-------------------------------------------------------------------    ");
    }
    public static void explicaciontipoOperadorArtimeticos(){
        System.out.println("---------------------------------------------------------------------- ");
        System.out.println("4    Tipos de operadores                                               ");
        System.out.println("2     Aritméticos                                                      ");
        System.out.println("---------------------------------------------------------------------- ");
        System.out.println("       Operador    +                                                   ");
        System.out.println("           Ejemplo int  suma =5 + 3;                                   ");
        System.out.println("           Detalle  Suma  dos operadores . Resultado : 8               ");
        System.out.println("---------------------------------------------------------------------  ");
        System.out.println("       Operador    -                                                   ");
        System.out.println("           Ejemplo int resta   =5 - 3;                                 ");
        System.out.println("           Detalle  Resta el segundo operador del primero. Resultado :2");
        System.out.println("---------------------------------------------------------------------  ");
        System.out.println("       Operador    *                                                   ");
        System.out.println("           Ejemplo int  multiplicacion    =5 * 3;                      ");
        System.out.println("           Multiplica dos operadores . Resultado 15                    ");
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("       Operador    /                                                   ");
        System.out.println("           Ejemplo int   divisionn    =6 * 3;                          ");
        System.out.println("           Divide el primer operando por el segundo . Resultado 15     ");
        System.out.println("--------------------------------------------------------------------   ");
        System.out.println("      Operador    %   --porcentaje--                                   ");
        System.out.println("       Ejemplo int  modulo    =5 % 3;                                  ");
        System.out.println("       Devuelve el resto de la division del primer operando por el segundo");
        System.out.println("       Resultado 2                                                     ");
        System.out.println("---------------------------------------------------------------------  ");
    }
    public static void explicaciontipoOperadorRelacionales(){
        System.out.println("---------------------------------------------------------------------- ");
        System.out.println("4    Tipos de operadores                                               ");
        System.out.println("---------------------------------------------------------------------- ");
        System.out.println("3  Relacionales                                                      ");
        System.out.println("     Operador   ==                                                     ");
        System.out.println("       Ejemplo boolean esIgual =(5 == 3);                              ");
        System.out.println("       Detalle  Comprueba  si los valores de dos operadores son iguales");
        System.out.println("       Resultado : false                                               ");
        System.out.println("---------------------------------------------------------------------- ");
        System.out.println("     Operador    !=                                                    ");
        System.out.println("      Ejemplo boolean noesIgual =(5 != 3);                             ");
        System.out.println("      Detalle  Comprueba  si los valores de dos operadores  no son iguales");
        System.out.println("      Resultado :  true                                                ");
        System.out.println("---------------------------------------------------------------------- ");
        System.out.println("     Operador    >                                                     ");
        System.out.println("      Ejemplo boolean mayor =(5 >3);                                   ");
        System.out.println("      Detalle  Comprueba  si el primer operador  es mayor que el segundo");
        System.out.println("      Resultado :  true                                                ");
        System.out.println("----------------------------------------------------------------------- ");
        System.out.println("     Operador    <                                                      ");
        System.out.println("       Ejemplo boolean menos=(5 <3);                                    ");
        System.out.println("       Detalle  Comprueba  si el primer operador  es menor que el segundo");
        System.out.println("       Resultado :  false                                               ");
        System.out.println("----------------------------------------------------------------------- ");
        System.out.println("     Operador    >=                                                     ");
        System.out.println("       Ejemplo boolean mayorOIgual =(5 >=3);                            ");
        System.out.println("        Detalle  Comprueba  si el primer operador  es mayor que el      ");
        System.out.println("        segundo o igual  que el segundo                                 ");
        System.out.println("        Resultado :  true                                               ");
        System.out.println("------------------------------------------------------------------------");
        System.out.println("     Operador    <=                                                     ");
        System.out.println("       Ejemplo boolean menos=(5 <=3);                                   ");
        System.out.println("       Detalle Comprueba si el primer operador es menor o igual que el segundo");
        System.out.println("       Resultado :  false                                               ");
        System.out.println("----------------------------------------------------------------------- ");
    }
    public static void explicaciontipoOperadorLogicos(){
        System.out.println("----------------------------------------------------------------------  ");
        System.out.println("4   Tipos de operadores                                                 ");
        System.out.println("4  Lógicos                                                             ");
        System.out.println("----------------------------------------------------------------------  ");
        System.out.println("    Operador   &&                                                       ");
        System.out.println("     Ejemplo boolean  resultado =(5> 3 &&  3< 4);                       ");
        System.out.println("     Detalle  Devuelve true  si ambos  son true                         ");
        System.out.println("     Resultado : true                                                   ");
        System.out.println("----------------------------------------------------------------------- ");
        System.out.println("    Operador   ||                                                       ");
        System.out.println("     Ejemplo boolean  resultado =(5> 3||  3< 4);                        ");
        System.out.println("     Detalle  Devuelve true  si al menos una de ellas  es true          ");
        System.out.println("----------------------------------------------------------------------- ");
        System.out.println("    Operador   !                                                        ");
        System.out.println("      Ejemplo boolean  resultado = !(5> 3);                             ");
        System.out.println("      Detalle  Devuelve el valor de un  operando booleano.              ");
        System.out.println("      Resultado :  false                                                ");
        System.out.println("----------------------------------------------------------------------- ");
    }
    public static void explicaciontipoOperadorAsignacion(){
        System.out.println("----------------------------------------------------------------------  ");
        System.out.println("4   Tipos de operadores                                                 ");
        System.out.println("5  Asignación                                                          ");
        System.out.println("------------------------------------------------------------------------");
        System.out.println("    Operador   =                                                        ");
        System.out.println("      Ejemplo  int a=5;                                                 ");
        System.out.println("      Detalle  Asigna el valor del operando derecho al operando izquierdo");
        System.out.println("----------------------------------------------------------------------- ");
        System.out.println("    Operador   +=                                                       ");
        System.out.println("     Ejemplo  int a=5;  a +=3;                                          ");
        System.out.println("     Suma el operando derecho al operando izquierdo y asigna el         ");
        System.out.println("     resultado al operando izquierdo .    Resultado :  8                ");
        System.out.println("----------------------------------------------------------------------- ");
        System.out.println("    Operador   -=                                                       ");
        System.out.println("     Ejemplo  int a=5;  a -= 3;                                         ");
        System.out.println("     Resta el  operando derecho al operando izquierdo y asigna el       ");
        System.out.println("     resultado al operando  izquierdo.      Resultado :  2                                                            ");
        System.out.println("----------------------------------------------------------------------- ");
        System.out.println("    Operador   *=                                                       ");
        System.out.println("     Ejemplo  int a=5;  a *= 3;                                         ");
        System.out.println("     Multiplica el operando derecho por el operando izquierdo y asigna  ");
        System.out.println("     el resultado al operando  izquierdo.   Resultado :  15             ");
        System.out.println("----------------------------------------------------------------------- ");
        System.out.println("    Operador   /=                                                       ");
        System.out.println("     Ejemplo  int a=6;  a /= 3;                                         ");
        System.out.println("     Divide el operando  izquierdo por el operando derecho y asigna     ");
        System.out.println("     el resultado al operando  izquierdo.   Resultado :  2              ");
        System.out.println("------------------------------------------------------------------------");
        System.out.println("    Operador   %=                                                       ");
        System.out.println("     Ejemplo  int a=5;  a %= 3;                                         ");
        System.out.println("     Calcula el módulo del operando izquierdo por el operando derecho y ");
        System.out.println("     asigna el resultado al operando  izquierdo.     Resultado :  2     ");
        System.out.println("----------------------------------------------------------------------- ");
    }
    public static void explicaciontipoOperadorDecrementoIncremento(){
        System.out.println("------------------------------------------------------------------------");
        System.out.println("4    Tipos de operadores                                                ");
        System.out.println("6  Incremento/Decremento                                              ");
        System.out.println("----------------------------------------------------------------------- ");
        System.out.println("     Operador  ++                                                       ");
        System.out.println("      Ejemplo  int a=5;  a++;                                           ");
        System.out.println("      Detalle  Incrementa el valor del operando en 1                    ");
        System.out.println("      Resultado :  6                                                    ");
        System.out.println("------------------------------------------------------------------------");
        System.out.println("     Operador  --                                                       ");
        System.out.println("      Ejemplo  int a=5;  a--;                                           ");
        System.out.println("      Detalle  Decrementa el valor del operando en 1                    ");
        System.out.println("      Resultado :  4                                                    ");
        System.out.println("------------------------------------------------------------------------");
    }
    public static void explicacioncondicionalIf(){
        System.out.println("----------------------------------------------------------------------  ");
        System.out.println("5    Condicional  IF, ELSE IF, ELSE                                     ");
        System.out.println("1    Condicional   IF                                                   ");
        System.out.println("----------------------------------------------------------------------  ");
        System.out.println("     Descripcion El condicional IF se puede utilizar sin el else.       ");
        System.out.println("     Ejemplo  Si se solicita un programa en el que se diga ÚNICAMENTE   ");
        System.out.println("     si una persona tiene sobrepeso de acuerdo a su indice de masa corporal,");
        System.out.println("     se utilizaría el IF sin colocar la parte del else.                 ");
        System.out.println("     if (condición ) {     //instrucciones para el caso verdadero - IF  ");
        System.out.println("           Ejemplo1                                                     ");
        System.out.println("           int peso =20;                                                ");
        System.out.println("           if (peso >=18); {                                            ");
        System.out.println("           System.out.println(entre comillas Tu peso esentre comillas   ");
        System.out.println("           }                                                            ");
        System.out.println("------------------------------------------------------------------------");
    }
    public static void explicacioncondicionalElseIf(){
        System.out.println("----------------------------------------------------------------------  ");
        System.out.println("5    Condicional  IF, ELSE IF , ELSE                                    ");
        System.out.println("2    Condicional    ELSE  IF                                            ");
        System.out.println("----------------------------------------------------------------------  ");
        System.out.println("     Descripcion En el condicional IF se tiene una condición central    ");
        System.out.println("     que arroja como resultado verdadero o falso.                       ");
        System.out.println("     Para cada resultado se puede realizar una acción diferente.        ");
        System.out.println("     Ejemplo1 if (condición ) { //instrucciones para el caso verdadero - IF");
        System.out.println("                 } else  {     //instrucciones para el caso falso-ELSE  ");
        System.out.println("                 }                                                      ");
        System.out.println("     Ejemplo2                                                           ");
        System.out.println("                int nota =12;                                           ");
        System.out.println("                if (nota >=30;  {                                       ");
        System.out.println("                System.out.println(Paso la materia)                     ");
        System.out.println("               }  else                                                  ");
        System.out.println("                System.out.println(Perdio la materia)                   ");
        System.out.println("               }                                                        ");
        System.out.println("---------------------------------------------------------------------   ");
    }
    public static void explicacioncondicionalElse(){
        System.out.println("---------------------------------------------------------------------   ");
        System.out.println(" 5    Condicional  IF, ELSE IF , ELSE                                   ");
        System.out.println(" 3    Condicional  ELSE                                                 ");
        System.out.println("----------------------------------------------------------------------- ");
        System.out.println("    La cláusula else (no obligatoria) sirve para indicar instrucciones a");
        System.out.println("    realizar en caso de no cumplirse la condición. Java admite escribir un else");
        System.out.println("    y dejarlo vacío: else { }.El else vacío se interpreta como que contemplamos");
        System.out.println("    el caso pero no hacemos nada en respuesta a él.                     ");
        System.out.println("    Ejemplo  incluyendo el Else  en Un IF anidado                       ");
        System.out.println("    Si en una condición se requiere hacer más de una pregunta se puede  ");
        System.out.println("    e utilizar un IF anidado                                            ");
        System.out.println("      if (condición ) {                                                 ");
        System.out.println("             //instrucciones para el caso verdadero - IF                ");
        System.out.println("              } else {                                                  ");
        System.out.println("           if (condición ) {                                            ");
        System.out.println("             //instrucciones para el caso verdadero - IF                ");
        System.out.println("            } else {                                                    ");
        System.out.println("           //instrucciones para el caso falso - ELSE                    ");
        System.out.println("             }                                                          ");
        System.out.println("           }                                                            ");
        System.out.println("             int temperatura=39;                                        ");
        System.out.println("             if (temperatura<=36 ) {                                    ");
        System.out.println("            System.out.println(“Temperatura normal”);                   ");
        System.out.println("          } else {                                                      ");
        System.out.println("           if (temperatura>36 && temperatura<39) {                      ");
        System.out.println("         System.out.println(“Tenga cuidado”);                           ");
        System.out.println("         } else {                                                       ");
        System.out.println("         System.out.println(“OJO tiene fiebre”);                        ");
        System.out.println("          }                                                             ");
        System.out.println("          }                                                             ");
        System.out.println("----------------------------------------------------------------------  ");
    }
    public static void explicacionSwitch(){
        System.out.println("-------------------------------------------------------------------------  ");
        System.out.println("1    Condicional SWITCH                                                    ");
        System.out.println("     Descripcion Cuando se requiere comparar una variable con una serie    ");
        System.out.println("     valores diferentes, esta indican los posibles valores que puede tomar ");
        System.out.println("     la variable y las sentencias que se tienen que ejecutar sí es que la  ");
        System.out.println("     variable coincide con alguno de dichos valores.                       ");
        System.out.println("     Cada case ejecutará las sentencias correspondientes,con base en base  ");
        System.out.println("     en el valor de la variable,que deberá de evaluarse con valores de     ");
        System.out.println("     tipo byte,char,short o int                                            ");
        System.out.println("     Si el valor de la variable no coincide con ningún valor, entonces se  ");
        System.out.println("     ejecutan las sentencias por default, sí es que las hay.               ");
        System.out.println("     La sentencia break al final de cada case transfiere el control al final");
        System.out.println("     de la sentencia switch; de esta manera, cada vez que se ejecuta un    ");
        System.out.println("     case todos los enunciados case restantes son ignorados y termina la   ");
        System.out.println("     operación del switch                                                  ");
        System.out.println("                Ejemplo1   switch( variable ){                             ");
        System.out.println("                case valor1:                                               ");
        System.out.println("                     sentencias;                                           ");
        System.out.println("                break;                                                     ");
        System.out.println("                case valor2:                                               ");
        System.out.println("                     sentencias;                                           ");
        System.out.println("                break;                                                     ");
        System.out.println("                case valorN:                                               ");
        System.out.println("                     sentencias;                                           ");
        System.out.println("                break;                                                     ");
        System.out.println("                default;                                                   ");
        System.out.println("                     sentencias;                                           ");
        System.out.println("               }                                                           ");
        System.out.println("--------------------------------------------------------------------       ");
    }
    public static void explicacionTernaria(){
        System.out.println("--------------------------------------------------------------------------- ");
        System.out.println("1   Condicion Ternaria                                                     ");
        System.out.println("--------------------------------------------------------------------------- ");
        System.out.println("    El operador ternario en Java es una construcción que permite tomar      ");
        System.out.println("    decisiones basadas en una condición booleana de manera concisa en una   ");
        System.out.println("    sola línea de código.                                                   ");
        System.out.println("    Es una forma abreviada de expresar una estructura condicional if-else   ");
        System.out.println("    Su estructura básica es: condición ? valor_si_verdadero : valor_si_falso;");
        System.out.println("    Si la condición es verdadera, se devuelve el valor correspondiente a    ");
        System.out.println("    entre comillas valor_si_verdadero entre comillas; de lo contrario, se   ");
        System.out.println("    devuelve el valor asignado a entre comillas valor_si_falso entre comillas");
        System.out.println("      Ejemplo  variable = ( condicion)? valor_si_verdadero : valor_si_falso; ");
        System.out.println("      Ejemplo1                                                              ");
        System.out.println("       int edad = 20;                                                        ");
        System.out.println("       String status =( edad  >= 18) ? entre comillas Adulto entre comillas :");
        System.out.println("                               Menor de edad entre comillas;                 ");
        System.out.println("      System.out.println(entre comillas La persona es:entre comillas + status);");
        System.out.println("      Ejemplo2                                                                ");
        System.out.println("       int  numero = 15;                                                      ");
        System.out.println("       String resultado =(numero % 2 == 0 ) ? entre comillas Par entre comillas:");
        System.out.println("                                  entre comillas Impar entre comillas;        ");
        System.out.println("    System.out.println(entre comillas El numero es:entre comillas + resultado);");
        System.out.println("------------------------------------------------------------------------------");
    }
    public static void explicacionCicloDoWhile(){
        System.out.println("---------------------------------------------------------------------------------  ");
        System.out.println("1 Ciclo Do While                                                                 ");
        System.out.println("---------------------------------------------------------------------------------  ");
        System.out.println("  Es una estructura de control cíclica que permite ejecutar de manera repetitiva   ");
        System.out.println("  un bloque de instrucciones sin evaluar de forma inmediata una condición especifica,.");
        System.out.println("  sino evaluándola justo después de ejecutar por primera vez el bloque de          ");
        System.out.println("  instrucciones en su interior.                                                    ");
        System.out.println("  El ciclo do-while en Java se utiliza cuando se desea garantizar que el código se ");
        System.out.println("  ejecute al menos una vez, independientemente de si se cumple la condición.       ");
        System.out.println("  La diferencia entre el ciclo while y el ciclo do-while es que en el ciclo while, ");
        System.out.println("  la condición se evalúa antes de ejecutar el código, mientras que en el ciclo     ");
        System.out.println("  do-while, el. código se ejecuta primero y luego se evalúa la condición.          ");
        System.out.println("  Si la condición se cumple, el ciclo se repite, de lo contrario, el ciclo se detiene.");
        System.out.println("                Ejemplo1                                                           ");
        System.out.println("                int  i= 1;                                                         ");
        System.out.println("                do {                                                               ");
        System.out.println("                System.out.println(i);                                             ");
        System.out.println("                i++;                                                               ");
        System.out.println("                } while ( i <= 10);                                                ");
        System.out.println("  En este ejemplo, el código dentro del ciclo se ejecutará al menos una vez,       ");
        System.out.println("  imprimiendo el valor de i y luego incrementando i en 1. Luego, se evalúa         ");
        System.out.println("  la condición (i <= 10) y si se cumple,                                           ");
        System.out.println("  el ciclo se repite y se vuelve a ejecutar el código dentro del ciclo.            ");
        System.out.println("  Esto continúa hasta que la condición ya no se cumple (i es mayor que 10) y el    ");
        System.out.println("  ciclo se detiene.                                                                ");
        System.out.println("--------------------------------------------------------------------------------   ");
    }
    public static void explicacionCicloWhile(){
        System.out.println("---------------------------------------------------------------------------------  ");
        System.out.println(" 1  Ciclo  While                                                                 ");
        System.out.println("---------------------------------------------------------------------------------  ");
        System.out.println("    es una estructura de control de ciclo que se utiliza para ejecutar un bloque   ");
        System.out.println("    de código mientras se cumpla una determinada condición..                       ");
        System.out.println("    La sintaxis básica de la sentencia while en Java es:                           ");
        System.out.println("                while (condición) {                                                ");
        System.out.println("                // bloque de código a ejecutar mientras se cumpla la condición     ");
        System.out.println("                }                                                                  ");
        System.out.println("         Ejemplo1                                                                  ");
        System.out.println("          int  contador = 1;                                                       ");
        System.out.println("          while ( contador >= 5) {                                                 ");
        System.out.println("          System.out.println(entre comillas contador:  entre comillas + contador );");
        System.out.println("                contador ++;");
        System.out.println("   La condición es una expresión booleana que se evalúa antes de cada iteración del ciclo.");
        System.out.println("   Si la condición es verdadera, se ejecuta el bloque de código dentro del ciclo y ");
        System.out.println("   luego se vuelve a evaluar la condición. Si la condición es falsa, el ciclo se detiene y ");
        System.out.println("   se continúa con la ejecución del código después del ciclo.                      ");
        System.out.println("   Es importante asegurarse de que la condición finalice en algún momento,         ");
        System.out.println("   para evitar un ciclo infinito.                                                  ");
        System.out.println("   El cuerpo del ciclo debe modificar alguna variable que afecte a la condición de la");
        System.out.println("   la forma que terminara en algún momento.                                        ");
        System.out.println("---------------------------------------------------------------------------------  ");
    }
    public static void explicacionCicloFor(){
        System.out.println("---------------------------------------------------------------------------------  ");
        System.out.println(" 1  Ciclo  For                                                                    ");
        System.out.println("---------------------------------------------------------------------------------  ");
        System.out.println("     Es una estructura de control de ciclo que se utiliza para ejecutar un bloque de código");
        System.out.println("     una cantidad determinada de veces.                                            ");
        System.out.println("     La sintaxis básica de un ciclo for en Java es la siguiente:                   ");
        System.out.println("                for (inicialización; condición; actualización) {                   ");
        System.out.println("                // bloque de código a ejecutar                                     ");
        System.out.println("                }                                                                  ");
        System.out.println("                Ejemplo1                                                           ");
        System.out.println("     La inicialización es el código que se ejecuta al inicio del bucle, normalmente");
        System.out.println("     se usa para inicializar una variable“contador”.                               ");
        System.out.println("     La condición es la condición que se evalúa antes de ejecutar el bloque de código.");
        System.out.println("     Si se cumple, se ejecuta el bloque de código, de lo contrario, se sale del bucle.");
        System.out.println("     La actualización es el código que se ejecuta después de cada iteración del bucle,");
        System.out.println("     normalmente se utiliza para actualizar el valor de la variable contador.      ");
        System.out.println("     Por ejemplo, el siguiente código imprimirá los números del 1 al 10:           ");
        System.out.println("                for (int i = 1; i <= 10; i++) {                                    ");
        System.out.println("                System.out.println(i);                                             ");
        System.out.println("                 }                                                                 ");
        System.out.println("     En este ejemplo, la inicialización es“int i = 1”, la condición es“i <= 10” la actualización es“i++”. ");
        System.out.println("     El código dentro del bucle imprime el valor de la variable i en cada iteración.");
        System.out.println("------------------------------------------------------------------------------     ");
    }

}
