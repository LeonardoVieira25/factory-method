package evento;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class EventoCasamentoTest {
    @Test
    void testAgendar() {
        EventoCasamento evento = new EventoCasamento();
        assertEquals("Evento de casamento agendado.", evento.agendar());
    }

    @Test
    void testCancelar() {
        EventoCasamento evento = new EventoCasamento();
        assertEquals("Evento de casamento cancelado.", evento.cancelar());
    }
}
