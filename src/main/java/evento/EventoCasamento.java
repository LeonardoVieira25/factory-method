package evento;

public class EventoCasamento implements IEvento {
    public String agendar() {
        return "Evento de casamento agendado.";
    }

    public String cancelar() {
        return "Evento de casamento cancelado.";
    }
}
