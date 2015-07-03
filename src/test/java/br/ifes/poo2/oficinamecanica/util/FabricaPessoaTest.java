/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.poo2.oficinamecanica.util;

import br.ifes.poo2.oficinamecanica.exceptions.TipoPessoaIncorretoException;
import br.ifes.poo2.oficinamecanica.cdp.Pessoa;
import br.ifes.poo2.oficinamecanica.cdp.PessoaPrototipo;
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
        Pessoa expResult = new PessoaPrototipo(Pessoa.Tipo.CLIENTE);
        Pessoa result = fabrica.criar(tipo);
        assertEquals(expResult.getClass(), result.getClass());
    }
    
    @Test
    public void testCriarVendedor() throws Exception {
        String tipo = "vendedor";
        Pessoa expResult = new PessoaPrototipo(Pessoa.Tipo.VENDEDOR);
        Pessoa result = fabrica.criar(tipo);
        assertEquals(expResult.getClass(), result.getClass());
    }
    
    @Test
    public void testCriarGerente() throws Exception {
        String tipo = "gerente";
        Pessoa expResult = new PessoaPrototipo(Pessoa.Tipo.GERENTE);
        Pessoa result = fabrica.criar(tipo);
        assertEquals(expResult.getClass(), result.getClass());
    }
    
    @Test(expected = TipoPessoaIncorretoException.class)
    public void testCriarComErro() throws Exception {
        String tipo = "xxx";

        new AssertionError(fabrica.criar(tipo));
    }
    
}
