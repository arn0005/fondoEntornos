/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package proyectoFondo;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author elena.racero
 */
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
