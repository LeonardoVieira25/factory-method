package evento;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class EventoAniversarioTest {
    @Test
    void testAgendar() {
        EventoAniversario evento = new EventoAniversario();
        assertEquals("Evento de aniversário agendado.", evento.agendar());
    }

    @Test
    void testCancelar() {
        EventoAniversario evento = new EventoAniversario();
        assertEquals("Evento de aniversário cancelado.", evento.cancelar());
    }
}
