
package proxecto.ProxectoXogo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author yagov
 */
public class XogoTest {
    
    public XogoTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of gañador method, of class Xogo.
     */
    /*@Test
    public void testGañador1() {
        System.out.println("EMPATE!");
        String xogada1 = "PEDRA";
        String xogada2 = "PEDRA";
        Xogo instance = new Xogo();
        String expResult = "EMPATE!";
        String result = instance.gañador(xogada1, xogada2);
        assertEquals(expResult, result);
    }
    @Test
    public void testGañador2() {
        System.out.println("Gaña o xogador 2!");
        String xogada1 = "PEDRA";
        String xogada2 = "PAPEL";
        Xogo instance = new Xogo();
        String expResult = "Gaña o xogador 2!";
        String result = instance.gañador(xogada1, xogada2);
        assertEquals(expResult, result);
    }
    @Test
    public void testGañador3() {
        System.out.println("Gaña o xogador 2!");
        String xogada1 = "PAPEL";
        String xogada2 = "TESOIRAS";
        Xogo instance = new Xogo();
        String expResult = "Gaña o xogador 2!";
        String result = instance.gañador(xogada1, xogada2);
        assertEquals(expResult, result);
    }
    @Test
    public void testGañador4() {
        System.out.println("Gaña o xogador 2!");
        String xogada1 = "PAPEL";
        String xogada2 = "TESOIRAS";
        Xogo instance = new Xogo();
        String expResult = "Gaña o xogador 2!";
        String result = instance.gañador(xogada1, xogada2);
        assertEquals(expResult, result);
    }
     @Test
    public void testGañador5() {
        System.out.println("Gaña o xogador 2!");
        String xogada1 = "TESOIRAS";
        String xogada2 = "PEDRA";
        Xogo instance = new Xogo();
        String expResult = "Gaña o xogador 2!";
        String result = instance.gañador(xogada1, xogada2);
        assertEquals(expResult, result);
    }
     @Test
    public void testGañador6() {
        System.out.println("Gaña o xogador 2!");
        String xogada1 = "TESOIRAS";
        String xogada2 = "PEDRA";
        Xogo instance = new Xogo();
        String expResult = "Gaña o xogador 2!";
        String result = instance.gañador(xogada1, xogada2);
        assertEquals(expResult, result);
    }*/
     @Test
    public void testGañador7() {
        System.out.println("EMPATE!");
        String xogada1 = "PEDRA";
        String xogada2 = "PEDRA";
        Xogo instance = new Xogo();
        String expResult = "EMPATE!";
        String result = instance.gañador(xogada1, xogada2);
        assertArrayEquals(expResult, result);
    }

    private void assertArrayEquals(String expResult, String result) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}


