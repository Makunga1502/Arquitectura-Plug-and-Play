package practicaDePlugAndPlay;

public class Phi3Strategy implements InteligenciaArtificialStrategy{

    @Override
    public String generarRespuesta(String prompt) {
        return "[Phi3-Ollama]: Procesando de forma eficiente y ligera..." + prompt;
    }

    @Override
    public String getNombreModelo() {
        return "Phi3";
    }
}
