/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.poo2.oficinamecanica.cgt;

import br.ifes.poo2.oficinamecanica.cdp.Venda;
import br.ifes.poo2.oficinamecanica.cih.VendaEstatico;
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
public class AplCriarVendaTest {
    AplCriarVenda instance;
    
    public AplCriarVendaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new AplCriarVenda();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of criarServico method, of class AplCriarVenda.
     */
    @Test
    public void testCriarServico() throws Exception {
        VendaEstatico.setDescricao("alinhamento");
        VendaEstatico.setQuantidade(2);
        VendaEstatico.setValorUnitario(100.10);
        VendaEstatico.setStatus(VendaEstatico.Status.ABERTO);
        
        Venda result = instance.criarServico();
        assertEquals(VendaEstatico.getDescricao(), result.getDescricao());
        assertEquals(VendaEstatico.getQuantidade(), result.getQuantidade());
        assertEquals(VendaEstatico.getValorUnitario(), result.getValorUnitario());
        assertEquals(Venda.Status.ABERTO, result.getStatus());
        assertEquals(200.20, result.getValorTotal(),1); //delta?
    }

    /**
     * Test of criarProduto method, of class AplCriarVenda.
     */
    @Test
    public void testCriarProduto() throws Exception {
        VendaEstatico.setDescricao("pneu");
        VendaEstatico.setQuantidade(2);
        VendaEstatico.setValorUnitario(100.10);
        VendaEstatico.setStatus(VendaEstatico.Status.INSTALADO);
        
        Venda result = instance.criarProduto();
        assertEquals(VendaEstatico.getDescricao(), result.getDescricao());
        assertEquals(VendaEstatico.getQuantidade(), result.getQuantidade());
        assertEquals(VendaEstatico.getValorUnitario(), result.getValorUnitario());
        assertEquals(Venda.Status.INSTALADO, result.getStatus());
        assertEquals(200.20, result.getValorTotal(),1); //delta?
    }
    
}
