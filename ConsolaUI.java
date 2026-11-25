import java.util.Scanner;

public class ConsolaUI {
    
    public static void  mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }
        
    public static void  mostrarMenu(){
        System.out.println("\n===== BIENVENID@ A TU CALCULADORA =====");
        System.out.println();
        System.out.println("Elige una opcion...");
        System.out.println();
        System.out.println("1. Para sumar\n"       +
                           "2. Para restar\n"      +
                           "3. Para Multiplicar\n" +
                           "4. Para dividir\n"     +
                           "5. Para Potencia\n"    +
                           "6. Raiz Cuadrada\n"    +
                           "7. Para salir"
                            );
     }

    public static int leerOpcion(Scanner teclado) {
    while (true) {
        if (teclado.hasNextInt()) {
            return teclado.nextInt();
        }
        mostrarMensaje("Error...\n" +
                       "Ingresa un número de opción válido...");
        teclado.next();
    }
 }

    public static double leerNumero(Scanner teclado, String mensaje) {
    while (true) {
        mostrarMensaje(mensaje);
        if (teclado.hasNextDouble()) {
            return teclado.nextDouble();
        }
        mostrarMensaje("Error...\n" +
                       "Ingresa un número válido...");
        teclado.next();
    }
}


    public static double[] leerDosNumeros(Scanner teclado){
        double num1 = leerNumero(teclado, "Ingresa el primer número: ");
        double num2 = leerNumero(teclado, "Ingresa el segundo número: " );
        return  new double[]{num1, num2};
        }
}
