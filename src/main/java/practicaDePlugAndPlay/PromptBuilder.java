package practicaDePlugAndPlay;

public class PromptBuilder {
    public String sistema, contexto, tecnica;

    public  PromptBuilder(){
        this.sistema = "sos un profesional con la maquina";
    }

    public void usarChainOfThought(){
        this.tecnica = "piensa antes de dar la respuesta";
    }

    public String construir(String inputUsario){
        return String.format(
                "SYSTEM: %S\nMETOLOGÍA: %s\nUSUARIO: %s",
                sistema, tecnica != null ? tecnica : "Respuesta directa", inputUsario
        );
    }

}
