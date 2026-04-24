package practicaDePlugAndPlay;

public class MistralStrategy implements InteligenciaArtificialStrategy{

    @Override
    public String generarRespuesta(String prompt) {
        return "[Mistral-Ollama]: Respuesta rápida generada para: " + prompt;
    }

    @Override
    public String getNombreModelo() {
        return "Mistral";
    }
}
