package empleado;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Empleado> nomina = new ArrayList<>();

        nomina.add(new Cocinero());
        nomina.add(new Mesero());

        System.out.println("ejecución de polimorfismo");
        for (Empleado e: nomina){
            e.saludar();
            e.trabajar();

        }

    }
}
