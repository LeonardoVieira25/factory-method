import evento.EventoFactory;
import evento.IEvento;

public class Main {
    public static void main(String[] args) {
        IEvento evento = EventoFactory.criarEvento("Formatura");
        evento.agendar();
        evento.cancelar();
    }
}
