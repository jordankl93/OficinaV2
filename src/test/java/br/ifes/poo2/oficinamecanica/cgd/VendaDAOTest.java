/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.poo2.oficinamecanica.cgd;

import br.ifes.poo2.oficinamecanica.cdp.Pessoa;
import br.ifes.poo2.oficinamecanica.cdp.PessoaPrototipo;
import br.ifes.poo2.oficinamecanica.cdp.Venda;
import br.ifes.poo2.oficinamecanica.cdp.VendaPrototipo;
import br.ifes.poo2.oficinamecanica.cih.VendaEstatico;
import java.sql.SQLException;
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
public class VendaDAOTest {
    private DAO vendaDAO, pessoaDAO;
    private Pessoa vendedor;
    private Venda venda;
    
    @Before
    public void setUp() throws ClassNotFoundException, SQLException {
        vendaDAO = new VendaDAO();
        vendaDAO.criarTabela();
        pessoaDAO = new PessoaDAO();
        
        vendedor = new PessoaPrototipo(Pessoa.Tipo.VENDEDOR);
        vendedor.setNome("rafael");
        vendedor.setEmail("rafael@");
        vendedor.setCpf(123);
        vendedor.setEndereco("rua1");
        vendedor.setNascimento("01/01/1991");
        
        pessoaDAO.insert(vendedor);
    }
    
    /**
     * Test of insert method, of class VendaDAO.
     */
    //@Test
    public void testInsertProduto() throws Exception {
        VendaEstatico.setDataDaVenda(null);
    }

    /**
     * Test of update method, of class VendaDAO.
     */
    //@Test
    public void testUpdate() throws Exception {
        System.out.println("update");
        Venda obj = null;
        VendaDAO instance = new VendaDAO();
        instance.update(obj);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class VendaDAO.
     */
    //@Test
    public void testDelete() throws Exception {
        System.out.println("delete");
        Venda obj = null;
        VendaDAO instance = new VendaDAO();
        instance.delete(obj);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findbyID method, of class VendaDAO.
     */
    //@Test
    public void testFindbyID() throws Exception {
        System.out.println("findbyID");
        Long id = null;
        VendaDAO instance = new VendaDAO();
        Venda expResult = null;
        Venda result = instance.findbyID(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findAll method, of class VendaDAO.
     */
    //@Test
    public void testFindAll() throws Exception {
        System.out.println("findAll");
        VendaDAO instance = new VendaDAO();
        List<Venda> expResult = null;
        List<Venda> result = instance.findAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
