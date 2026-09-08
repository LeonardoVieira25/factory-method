package evento;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class EventoFormaturaTest {
    @Test
    void testAgendar() {
        EventoFormatura evento = new EventoFormatura();
        assertEquals("Evento de formatura agendado.", evento.agendar());
    }

    @Test
    void testCancelar() {
        EventoFormatura evento = new EventoFormatura();
        assertEquals("Evento de formatura cancelado.", evento.cancelar());
    }
}
