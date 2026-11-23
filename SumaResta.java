
// Importamos la clase Scanner del paquete java.util para leer datos ingresados por teclado
import java.util.Scanner;

// La Clase se deve de llamar igual que el archivo
public class SumaResta {

    // Funcion main obligatorio
    public static void main(String args[]) {
        // inicialisamos las variables
        double num1;
        double num2;
        double sum1;
        double res1;
        double mult;
        double div;
        int opcion = 0;
        double Potencia;
        double numRaiz;
        double raiz;

        // Utilizamos la libreria Scanner
        Scanner datos = new Scanner(System.in);

        while (opcion != 7) {
            System.out.println();
            // Pedimos los datos al Usuario
            System.out.println("----- CALCULADORA -----");
            System.out.println();

            System.out.println();
            System.out.println("Elige una opcion...");
            System.out.println();
            System.out.println("1. Para sumar\n" +
                    "2. Para restar\n" +
                    "3. Para Multiplicar\n" +
                    "4. Para dividir\n" +
                    "5. Para Potencia\n" +
                    "6. Raiz Cuadrada\n" +
                    "7. Para salir");

            System.out.println();
            opcion = datos.nextInt();

            if (opcion == 1) {
                System.out.println("Ingresa el primer Número: ");
                num1 = datos.nextDouble();

                System.out.println("Ingresa el segundo numero: ");
                num2 = datos.nextDouble();
                sum1 = Operaciones.sumar(num1, num2);
                System.out.println("La suma es: " + sum1);

            } else if (opcion == 2) {
                System.out.println("Ingresa el primer Número: ");
                num1 = datos.nextDouble();

                System.out.println("Ingresa el segundo numero: ");
                num2 = datos.nextDouble();
                res1 = Operaciones.restar(num1, num2);
                System.out.println("La Resta es: " + res1);

            } else if (opcion == 3) {
                System.out.println("Ingresa el primer Número: ");
                num1 = datos.nextDouble();

                System.out.println("Ingresa el segundo numero: ");
                num2 = datos.nextDouble();
                mult = Operaciones.multiplicar(num1, num2);
                System.out.println("La mltiplicacion es:" + mult);

            } else if (opcion == 4) {
                System.out.println("Ingresa el primer Número: ");
                num1 = datos.nextDouble();

                System.out.println("Ingresa el segundo numero: ");
                num2 = datos.nextDouble();
                if (num2 != 0) {
                    div = Operaciones.divicion(num1, num2);
                    System.out.println("La divicion es:" + div);
                } else {
                    System.out.println("Error...");
                    System.out.println("No se puede dividir por cero... ");
                    System.out.println("Intente Nuevamente...");

                }

            } else if (opcion == 5) {
                System.out.println("Ingresa el primer Número: ");
                num1 = datos.nextDouble();

                System.out.println("Ingresa el segundo numero: ");
                num2 = datos.nextDouble();
                Potencia = Operaciones.potencia(num1, num2);
                System.out.println("La Potencia es: " + Potencia);

            } else if (opcion == 6) {
                System.out.println("Ingresa un  Numero: ");
                numRaiz = datos.nextDouble();
                if (numRaiz < 0) {
                    System.out.println("Error...");
                    System.out.println("Numero no valido...");
                    System.out.println("En numero no debe de ser negativo...");
                } else {
                    raiz = Operaciones.raizCuadrada(numRaiz);
                    System.out.println("La Raiz cuadrada de " + numRaiz + " es: " + raiz);

                }
            } else if (opcion == 7) {
                System.out.println("Gracias por usar nuestro servicios...");
                System.out.println("Vuelve Pronto...");
            } else {
                System.out.println("Error:");
                System.out.println("Opcion invalida...");
                System.out.println("Intente de nuevo...");

            }

        }

        datos.close();

    }
}
