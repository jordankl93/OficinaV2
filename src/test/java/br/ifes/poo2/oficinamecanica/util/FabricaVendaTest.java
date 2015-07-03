/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.poo2.oficinamecanica.util;

import br.ifes.poo2.oficinamecanica.exceptions.TipoVendaIncorretoException;
import br.ifes.poo2.oficinamecanica.cdp.Venda;
import br.ifes.poo2.oficinamecanica.cdp.VendaPrototipo;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author RafaelBroedel
 */
public class FabricaVendaTest {
    private FabricaVenda instance;

    @Before
    public void setUp() {
        instance = FabricaVenda.getInstancia();
    }

    /**
     * Test of criar method, of class FabricaVenda.
     */
    @Test
    public void testCriarServico() throws Exception {
        String tipo = "servico";
        Venda expResult = new VendaPrototipo(Venda.Tipo.SERVICO);
        Venda result = instance.criar(tipo);
        assertEquals(expResult.getTipo(), result.getTipo());
    }
    
    @Test
    public void testCriarProduto() throws Exception {
        String tipo = "produto";
        Venda expResult = new VendaPrototipo(Venda.Tipo.PRODUTO);
        Venda result = instance.criar(tipo);
        assertEquals(expResult.getTipo(), result.getTipo());
    }
    
    @Test(expected = TipoVendaIncorretoException.class)
    public void testCriarComErro() throws Exception {
        String tipo = "xxx";

        new AssertionError(instance.criar(tipo));
    }
    
}
