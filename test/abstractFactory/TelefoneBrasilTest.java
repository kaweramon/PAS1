/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractFactory;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kawe
 */
public class TelefoneBrasilTest {
    
    public TelefoneBrasilTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of exibirTelefone method, of class TelefoneBrasil.
     */
    @Test
    public void testExibirTelefone() {
        AbstractFactory brasil = new BrasilFactory();
        AbstractTelefone telefonBrasil = new TelefoneBrasil();
        String telefone1 = "(55) dsadas";
        assertEquals(telefone1, telefonBrasil.exibirTelefone(telefone1));
        
    }
}
