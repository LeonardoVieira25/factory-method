package evento;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class EventoFactoryTest {
    @Test
    void testCriarEvento() {
        IEvento evento = EventoFactory.criarEvento("Formatura");
        assertTrue(evento instanceof EventoFormatura);
    }

    @Test
    void deveRetornarExcecaoParaEventoInvalido() {
        try {
            EventoFactory.criarEvento("Aniversario");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Evento inválido"));
        }
    }

    @Test
    void deveRetornarExecaoParaEventoInexistente() {
        try {
            EventoFactory.criarEvento("Inexistente");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Evento inexistente"));
        }
    }
}
