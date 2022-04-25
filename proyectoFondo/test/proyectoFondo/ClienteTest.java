
package proyectoFondo;

import org.junit.Test;
import static org.junit.Assert.*;

public class ClienteTest {

    public ClienteTest() {
    }

    /**
     * Test of atender method, of class Cliente.
     */
    @Test
    public void testAtenderCuandoElClienteNoEstaAtendido() {
        Cliente cliente = new Cliente("elena");

        cliente.atender();

        assertEquals(cliente.isAtendido(), true);
    }

    @Test
    public void testAtenderCuandoElClienteYaEstaAtendido() {
        Cliente cliente = new Cliente("elena");

        cliente.atender();

        assertEquals(cliente.isAtendido(), true);

        cliente.atender();

        assertEquals(cliente.isAtendido(), true);
    }
}


