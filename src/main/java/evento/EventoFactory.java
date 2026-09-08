package evento;

public class EventoFactory {

    public static IEvento criarEvento(String tipo) {
        Class<?> classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("evento.Evento" + tipo);
            objeto = classe
                    .getDeclaredConstructor()
                    .newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Serviço inexistente");
        }
        if (!(objeto instanceof IEvento)) {
            throw new IllegalArgumentException("Serviço inválido");
        }
        return (IEvento) objeto;
    }
}
