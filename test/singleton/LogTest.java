/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

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
public class LogTest {
    
    private Log  log = Log.getInstance();
    
    public LogTest() {
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
     * Test of getInstance method, of class Log.
     */
    @Test
    public void testGetInstance() {
        
    }

    /**
     * Test of imprimir method, of class Log.
     */
    @Test
    public void testImprimir() throws Exception {
        
    }

    /**
     * Test of gravar method, of class Log.
     */
    @Test
    public void testGravar() throws Exception {
        System.out.println("Teste metodo gravar");
        String gravar = "TESTE5";
        log.gravar(gravar);
        assertEquals(gravar, log.imprimir());
    }
}
