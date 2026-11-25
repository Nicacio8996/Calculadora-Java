
// Importamos la clase Scanner del paquete java.util para leer datos ingresados por teclado
import java.util.Scanner;

// La Clase se deve de llamar igual que el archivo
public class SumaResta {

    // Funcion main obligatorio
    public static void main(String args[]) {
        // inicialisamos las variables
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
            ConsolaUI.mostrarMenu();
            opcion = ConsolaUI.leerOpcion(datos);
            

            
           

            

            if (opcion == 1) {
                double[] numeros = ConsolaUI.leerDosNumeros(datos);
                sum1 = Operaciones.sumar(numeros[0], numeros[1]);
                ConsolaUI.mostrarMensaje("La suma es: " + sum1);


            } else if (opcion == 2) {
                double[] numeros = ConsolaUI.leerDosNumeros(datos);
                res1 = Operaciones.restar(numeros[0], numeros[1]);
                ConsolaUI.mostrarMensaje("La resta es: " + res1);


            } else if (opcion == 3) {
                double[] numeros = ConsolaUI.leerDosNumeros(datos);
                mult = Operaciones.multiplicar(numeros[0], numeros[1]);
                ConsolaUI.mostrarMensaje("La multiplicación es: " + mult);
                
            } else if (opcion == 4) {
                double[] numeros = ConsolaUI.leerDosNumeros(datos);
                if (numeros[1] != 0) {
                    div = Operaciones.divicion(numeros[0], numeros[1]);
                    ConsolaUI.mostrarMensaje("La divicion es: " + div);
                } else {
                    ConsolaUI.mostrarMensaje("Error...");
                    ConsolaUI.mostrarMensaje("No se puede dividir por cero... ");
                    ConsolaUI.mostrarMensaje("Intente Nuevamente...");
                }

            }else if (opcion == 5){
                double [] numeros = ConsolaUI.leerDosNumeros(datos);
                Potencia = Operaciones.potencia(numeros[0], numeros[1]);
                ConsolaUI.mostrarMensaje("La Potencia es: " + Potencia);

        
            } else if (opcion == 6) {
                numRaiz = ConsolaUI.leerNumero(datos, "Ingresa un número: ");
                if (numRaiz < 0) {
                ConsolaUI.mostrarMensaje("Error...\n" +
                                         "Número no válido...\n" +
                                         "El número no debe ser negativo...\n" +
                                         "Intente Nuevamente...");
                } else {
                       raiz = Operaciones.raizCuadrada(numRaiz);
                        ConsolaUI.mostrarMensaje("La raíz cuadrada de " + numRaiz + " es: " + raiz);
                }
            }else if (opcion == 7) {
                ConsolaUI.mostrarMensaje("Gracias por usar nuestros servicios...\n" +
                                                  "Vuelve Pronto...");
               
            }else{
                ConsolaUI.mostrarMensaje("Error:\n" +
                                         "Opción inválida...\n" +
                                         "Intente de nuevo...");
            }
    }

    datos.close();
 }
}
