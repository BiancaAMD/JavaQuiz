import java.util.Scanner;

public class JavaQuiz {
    public static boolean bienabc(String opcion) {
        if (opcion.equals("A") || opcion.equals("B") || opcion.equals("C")){
            return true;
        } else{
            return false;
        }
    }

    public static int comprobacion(String usuario, String buena) {
        if (usuario.equals(buena)){
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
    // Scanner para leer las respuestas del usuario
    Scanner sc = new Scanner(System.in);

    // Variable compartida para contar los aciertos
    int aciertos = 0;

    //Variables para la opcion correcta
    String respuesta, correcta;

    //variables booleanas para que ponga una opcion correcta
    boolean salir = false;

    //cuerpo
    // Presentación del concurso
    System.out.println("========== JAVAQUIZ ==========");
    System.out.println("Concurso de preguntas sobre Java");
    System.out.println("Responde escribiendo A, B o C.");

    // INICIO RONDA 1 - INTEGRANTE A
    
    
    // FIN RONDA 1 - INTEGRANTE A
 
 
    // INICIO RONDA 2 - INTEGRANTE B
    // Pregunta 1 - INTEGRANTE B
    System.out.printf("%nFase 2, esto se complica%n");
    do{
        System.out.printf("1. Java usa A) Interpetre B) Compilador C)Todas%n");
        respuesta = sc.nextLine();
        salir = bienabc(respuesta);
    } while(salir == false);
    correcta = "B";
    aciertos += comprobacion(respuesta, correcta);

    // Pregunta 2 - INTEGRANTE B
    do{
        System.out.printf("%n2. En git para subirlo a githup se usa A) git add B) git commit C)git push%n");
        respuesta = sc.nextLine();
        salir = bienabc(respuesta);
    } while(salir == false);
    correcta = "C";
    aciertos += comprobacion(respuesta, correcta);

    // Pregunta 3 - INTEGRANTE B
    do{
        System.out.printf("%n3. En funciones el void hace A) Que tengas que pasele un int obligatorio B) Que no va a sacar nada C)Que va a sacar un int%n");
        respuesta = sc.nextLine();
        salir = bienabc(respuesta);
    } while(salir == false);
    correcta = "B";
    aciertos += comprobacion(respuesta, correcta); 
 
    // RESULTADO FINAL - INTEGRANTE B 
    System.out.printf("%nHas acertado %d/6", aciertos);
    // Cerrar Scanner
    sc.close();


    }
}
