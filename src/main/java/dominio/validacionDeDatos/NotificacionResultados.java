package dominio.validacionDeDatos;

import java.util.Scanner;
public class NotificacionResultados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String estado = "";

        while (!estado.equalsIgnoreCase("Listo para la revisión")) {
            System.out.println("\nEstados posibles: [En proceso, Pendiente, Error de muestra, Listo para la revisión]");
            System.out.print("Ingrese el estado actual: ");
            estado = sc.nextLine();

            if (estado.equalsIgnoreCase("En proceso")) {
                System.out.println("El sistema sigue monitoreando...");
                continue;
            }

            if (estado.equalsIgnoreCase("Error de muestra")) {
                System.out.println("Proceso detenido: Se requiere nueva toma de muestra.");
                break;
            }

            System.out.println("Estado registrado: " + estado);
        }

        if (estado.equalsIgnoreCase("Listo para revisión")) {
            System.out.println("Notificación: Los resultados ya pueden ser consultados.");
        }
        sc.close();
    }
}
