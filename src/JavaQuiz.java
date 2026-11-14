import java.util.Scanner;

public class JavaQuiz {
    public static int comproBacion(String usuario, String buena) {
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
    // Presentación del concurso
    System.out.println("========== JAVAQUIZ ==========");
    System.out.println("Concurso de preguntas sobre Java");
    System.out.println("Responde escribiendo A, B o C.");

    // INICIO RONDA 1 - INTEGRANTE A
    
    
    // FIN RONDA 1 - INTEGRANTE A
 
 
    // INICIO RONDA 2 - INTEGRANTE B
    System.out.println("Fase 2, esto se complica");
    System.out.println("1. Java usa A) Interpetre B) Compilador C)Todas");
    correcta = "B";
    respuesta = sc.nextLine();
    aciertos += comprovacion(respuesta, correcta);
 
    // FIN RONDA 2 - INTEGRANTE B
 
 
    // RESULTADO FINAL - INTEGRANTE B
 
    System.out.println("Has acertado "+aciertos+"/6");
    // Cerrar Scanner
    sc.close();


    }
}
