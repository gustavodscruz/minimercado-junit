/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package controle;

//import org.junit.jupiter.api.AfterEach;
import java.awt.event.ActionEvent;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//import org.junit.jupiter.api.AfterAll;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.*;
/**
 *
 * @author Admin
 */
public class FuncionarioTest {

    public FuncionarioTest() {
    }

    @AfterAll
    public static void tearDownClass() throws Exception {
    }

    @BeforeEach
    public void setUp() throws Exception {
    }

    @AfterEach
    public void tearDown() throws Exception {
    }

    @BeforeAll
    public static void setUpClass() throws Exception {
    }

    /**
     * Test of posicionarRegistro method, of class Funcionario.
     */
    @Test
    public void testPosicionarRegistro() {
        System.out.println("posicionarRegistro");
        Funcionario instance = new Funcionario();
        instance.posicionarRegistro();
        // TODO review the generated test code and remove the default call to fail.
     //   fail("The test case is a prototype.");
    }

    /**
     * Test of mostrar_Dados method, of class Funcionario.
     */
    @Test
    public void testMostrar_Dados() {
        System.out.println("mostrar_Dados");
        Funcionario instance = new Funcionario();
        instance.mostrar_Dados();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of preencherTabela method, of class Funcionario.
     */
    @Test
    public void testPreencherTabela() {
        System.out.println("preencherTabela");
        Funcionario instance = new Funcionario();
        instance.preencherTabela();
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of AlterarActionPerformed2 method, of class Funcionario.
     */
    @Test
    public void testAlterarActionPerformed2() {
        System.out.println("AlterarActionPerformed2");
        ActionEvent evt = null;
        Funcionario instance = new Funcionario();
        instance.AlterarActionPerformed2(evt);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
        instance.cod_fun.setText("5");
        instance.cod_tipo.setText("11");
        instance.comp_res.setText("jdksfdhj");
        instance.cpf.setText(" 555555555");
        instance.ctps.setText(" 5555555");
        instance.nome.setText("kdfhhjsdkjfds ");
        instance.rg.setText(" 5555");
    }

}
