/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.poo2.oficinamecanica.cgd;

import br.ifes.poo2.oficinamecanica.cdp.Veiculo;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author RafaelBroedel
 */
public class VeiculoDAOTest {
    

    @Before
    public void setUp() {
    }


    /**
     * Test of criarTabela method, of class VeiculoDAO.
     */
    //@Test
    public void testCriarTabela() throws Exception {
        System.out.println("criarTabela");
        VeiculoDAO instance = new VeiculoDAO();
        instance.criarTabela();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insert method, of class VeiculoDAO.
     */
    //@Test
    public void testInsert() throws Exception {
        System.out.println("insert");
        Veiculo obj = null;
        VeiculoDAO instance = new VeiculoDAO();
        instance.insert(obj);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class VeiculoDAO.
     */
    //@Test
    public void testUpdate() throws Exception {
        System.out.println("update");
        Veiculo obj = null;
        VeiculoDAO instance = new VeiculoDAO();
        instance.update(obj);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class VeiculoDAO.
     */
    //@Test
    public void testDelete() throws Exception {
        System.out.println("delete");
        Veiculo obj = null;
        VeiculoDAO instance = new VeiculoDAO();
        instance.delete(obj);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findbyID method, of class VeiculoDAO.
     */
    //@Test
    public void testFindbyID() throws Exception {
        System.out.println("findbyID");
        Long id = null;
        VeiculoDAO instance = new VeiculoDAO();
        Veiculo expResult = null;
        Veiculo result = instance.findbyID(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findAll method, of class VeiculoDAO.
     */
    //@Test
    public void testFindAll() throws Exception {
        System.out.println("findAll");
        VeiculoDAO instance = new VeiculoDAO();
        List<Veiculo> expResult = null;
        List<Veiculo> result = instance.findAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
