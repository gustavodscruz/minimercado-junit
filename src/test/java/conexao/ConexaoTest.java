/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package conexao;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Admin
 */
public class ConexaoTest {
    
    public ConexaoTest() {
    }
    
     @Test
    public void testConecta() {
        System.out.println("Testando conecta");
        Conexao conexao = new Conexao();
        boolean expected = true;
        boolean result = conexao.conecta();
        assertEquals(expected, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of executaSQL method, of class Conexao.
     */
    @Test
    public void testExecutaSQL() {
        System.out.println("Testando executaSQL");
        String sql = "SELECT * FROM usuarios";
        Conexao conexao = new Conexao();
        conexao.conecta();
        conexao.executaSQL(sql);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of executaUpdate method, of class Conexao.
     */
    
    /**
     * Test of desconecta method, of class Conexao.
     */
    @Test
    public void testDesconecta() {
        System.out.println("Testando desconecta");
        Conexao instance = new Conexao();
        instance.conecta();
        instance.desconecta();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
