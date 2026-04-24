package practicaDePlugAndPlay;

public class Main {
    public static void main(String[] args) {


        AgenteConversacional miAgente = new AgenteConversacional();

        // 1. Usamos Llama3 para una tarea compleja

        miAgente.setModelo(new Llama3Strategy());

        miAgente.interactuar("Explica la física cuántica.");

        System.out.println("---");

        // 2. Cambiamos a Mistral en tiempo de ejecución por su rapidez

        miAgente.setModelo(new MistralStrategy());

        miAgente.interactuar("Dime un chiste corto.");


        // 3. Cambiamos a Phi3Strategy
        miAgente.setModelo(new Phi3Strategy());
        miAgente.interactuar("¿Cómo optimizar un código en Java?");

    }
}
