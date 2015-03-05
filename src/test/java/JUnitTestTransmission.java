/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.leona.transmissor.controller.ControllerServices;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Leona
 */
public class JUnitTestTransmission {
      private static ControllerServices controllServices;  
    public JUnitTestTransmission() {
         controllServices = new ControllerServices();  
    }
    
    @BeforeClass
    public static void setUpClass() {   
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        //controllServices.iniciarTransmissao();      
    }
    
    @After
    public void tearDown() {        
        controllServices.pararTransmissao();
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void transmmission() {
          try {
            Thread.sleep(1000);                 //1000 milliseconds is one second.
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }    
        
    }
}
