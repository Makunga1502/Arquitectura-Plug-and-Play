package dominio.validacionDeDatos;

import java.util.Scanner;
import java.util.InputMismatchException;

public class ValidacionCitas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hora = 0;
        String dia;

        try {
            System.out.print("Ingrese la hora de su cita (0-23): ");
            hora = sc.nextInt();
            sc.nextLine();

            System.out.print("Ingrese el día de la semana: ");
            dia = sc.nextLine().toLowerCase();

            if (hora >= 9 && hora <= 17) {
                if (!dia.equals("sabado") && !dia.equals("sábado") && !dia.equals("domingo")) {
                    System.out.println("Cita agendada con éxito para el día " + dia + " a las " + hora + ":00.");
                } else {
                    System.out.println("Error: No hay citas disponibles los fines de semana.");
                }
            } else {
                System.out.println("Error: La hora debe de estar entre las 9 y las 17 horas.");
            }

        } catch (InputMismatchException e) {
            System.out.println("Error: La hora debe de ser un número entero.");
        } finally {
            sc.close();
        }
    }

}
