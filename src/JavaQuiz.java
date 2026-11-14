import java.util.Scanner;

public class JavaQuiz {
    final static String VERDE = "\u001B[32m";
    final static String ROJO = "\u001B[31m";
    final static String RESET = "\u001B[0m";


    public static boolean bienabc(String opcion) {
        if (opcion.equals("A") || opcion.equals("B") || opcion.equals("C")){
            return true;
        } else{
            return false;
        }
    }

    public static int comprobacion(String usuario, String buena) {
        if (usuario.equals(buena)){
            System.out.println(VERDE+"¡Correcto!"+RESET);
            return 1;
        } else {
            System.out.println(ROJO+"¡Incorrecto!"+RESET);
            return 0;
        }
    }

    public static void main(String[] args) {
        // Scanner para leer las respuestas del usuario
        Scanner sc = new Scanner(System.in);

        // Variable compartida para contar los aciertos
        int aciertos = 0;

        // Variables para la opción del usuario y la respuesta correcta
        String respuesta, correcta;

        // Variable booleana para controlar que se introduzca una opción válida
        boolean salir = false;

        // Presentación del concurso
        System.out.printf("========== JAVAQUIZ ==========%n");
        System.out.printf("Concurso de preguntas sobre Java%n");
        System.out.printf("Responde escribiendo A, B o C.%n");

        // INICIO RONDA 1 - INTEGRANTE A
        do {
            System.out.printf("%n1. Las posiciones de los arrays en Java se enumeran empezando en %n");
            System.out.printf("A) 1    B) 0    C) No siguen un orden%n");
            respuesta = sc.nextLine();
            salir = bienabc(respuesta);
        } while (salir == false);
        correcta = "B";
        aciertos += comprobacion(respuesta, correcta);
        do {
            System.out.printf("%n2. El bucle que utilizamos para recorrer un array es %n");
            System.out.printf("A) For    B) Do-While    C) While%n");
            respuesta = sc.nextLine();
            salir = bienabc(respuesta);
        } while (salir == false);
        correcta = "A";
        aciertos += comprobacion(respuesta, correcta);

    do {
        System.out.printf("%n3. ¿Con qué lector tenemos que hacer throws IOException? %n");
        System.out.printf("A) Scanner    B) BufferedReader    C) No hay que hacerlo %n");
        respuesta = sc.nextLine();
        salir = bienabc(respuesta);
    } while (salir == false);
    correcta = "B";
    aciertos += comprobacion(respuesta, correcta);
    
    // FIN RONDA 1 - INTEGRANTE A
    System.out.printf("%nFIN DE LA RONDA 1%n");
    System.out.printf("¿Preparado para la siguiente?%n");
 
    // INICIO RONDA 2 - INTEGRANTE B
    // Pregunta 1 - INTEGRANTE B
    System.out.printf("%nFase 2, esto se complica%n");
    do{
        System.out.printf("1. Java usa%nA) Intérpetre B) Compilador C)Todas%n");
        respuesta = sc.nextLine();
        salir = bienabc(respuesta);
    } while(salir == false);
    correcta = "B";
    aciertos += comprobacion(respuesta, correcta);
    System.out.println();
    
    // Pregunta 2 - INTEGRANTE B
    do{
        System.out.printf("2. En git para subirlo a git se usa%nA) git add B) git commit C)git push%n");
        respuesta = sc.nextLine();
        salir = bienabc(respuesta);
    } while(salir == false);
    correcta = "C";
    aciertos += comprobacion(respuesta, correcta);
    System.out.println();

    // Pregunta 3 - INTEGRANTE B
    do{
        System.out.printf("3. En funciones el void hace%nA) Que tengas que pasarle un int obligatorio B) Que no va a sacar nada C) Que va a sacar un int%n");
        respuesta = sc.nextLine();
        salir = bienabc(respuesta);
    } while(salir == false);
    correcta = "B";
    aciertos += comprobacion(respuesta, correcta); 
    System.out.println();
    
    // RESULTADO FINAL - INTEGRANTE B 
    System.out.printf("Has acertado %d/6", aciertos);
    // Cerrar Scanner
    sc.close();


    }
}
