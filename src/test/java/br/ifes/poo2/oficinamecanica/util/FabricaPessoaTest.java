/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.poo2.oficinamecanica.util;

import br.ifes.poo2.oficinamecanica.cdp.ClienteImp;
import br.ifes.poo2.oficinamecanica.cdp.GerenteImp;
import br.ifes.poo2.oficinamecanica.cdp.Pessoa;
import br.ifes.poo2.oficinamecanica.cdp.VendedorImp;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author RafaelBroedel
 */
public class FabricaPessoaTest {
    private FabricaPessoa fabrica;
    
    @Before
    public void setUp() {
        fabrica = FabricaPessoa.getInstancia();
    }

    /**
     * Test of criar method, of class FabricaPessoa.
     */
    @Test
    public void testCriarCliente() throws Exception {
        String tipo = "cliente";
        Pessoa expResult = new ClienteImp();
        Pessoa result = fabrica.criar(tipo);
        assertEquals(expResult.getClass(), result.getClass());
    }
    
    @Test
    public void testCriarVendedor() throws Exception {
        String tipo = "vendedor";
        Pessoa expResult = new VendedorImp();
        Pessoa result = fabrica.criar(tipo);
        assertEquals(expResult.getClass(), result.getClass());
    }
    
    @Test
    public void testCriarGerente() throws Exception {
        String tipo = "gerente";
        Pessoa expResult = new GerenteImp();
        Pessoa result = fabrica.criar(tipo);
        assertEquals(expResult.getClass(), result.getClass());
    }
    
    @Test(expected = TipoPessoaIncorretoException.class)
    public void testCriarComErro() throws Exception {
        String tipo = "xxx";

        new AssertionError(fabrica.criar(tipo));
    }
    
}
