package evento;

public class EventoFormatura implements IEvento {
    public String agendar() {
        return "Evento de formatura agendado.";
    }

    public String cancelar() {
        return "Evento de formatura cancelado.";
    }
}
