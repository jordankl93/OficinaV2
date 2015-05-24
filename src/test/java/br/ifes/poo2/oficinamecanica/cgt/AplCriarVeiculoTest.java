/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.poo2.oficinamecanica.cgt;

import br.ifes.poo2.oficinamecanica.cdp.Veiculo;
import br.ifes.poo2.oficinamecanica.util.VeiculoModelo;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author RafaelBroedel
 */
public class AplCriarVeiculoTest {
    private AplCriarVeiculo instance;
    
    @Before
    public void setUp() {
        instance = new AplCriarVeiculo();
    }

    /**
     * Test of criarCarro method, of class AplCriarVeiculo.
     */
    @Test
    public void testCriarCarro() {
        VeiculoModelo.setPlaca("xxx-0000");
        VeiculoModelo.setModelo("Corsa");
        VeiculoModelo.setCor("preto");
        
        Veiculo result = instance.criarCarro();
        
        assertEquals(VeiculoModelo.getPlaca(), result.getPlaca());
        assertEquals(VeiculoModelo.getModelo(), result.getModelo());
        assertEquals(VeiculoModelo.getCor(), result.getCor());
    }

    /**
     * Test of criarMoto method, of class AplCriarVeiculo.
     */
    @Test
    public void testCriarMoto() {
        VeiculoModelo.setPlaca("yyy-0000");
        VeiculoModelo.setModelo("cg");
        VeiculoModelo.setCor("vermelho");
        
        Veiculo result = instance.criarMoto();
        
        assertEquals(VeiculoModelo.getPlaca(), result.getPlaca());
        assertEquals(VeiculoModelo.getModelo(), result.getModelo());
        assertEquals(VeiculoModelo.getCor(), result.getCor());
    }

    /**
     * Test of criarCaminhao method, of class AplCriarVeiculo.
     */
    @Test
    public void testCriarCaminhao() {
        VeiculoModelo.setPlaca("aaa-0000");
        VeiculoModelo.setModelo("truck");
        VeiculoModelo.setCor("branco");
        
        Veiculo result = instance.criarCaminhao();
        
        assertEquals(VeiculoModelo.getPlaca(), result.getPlaca());
        assertEquals(VeiculoModelo.getModelo(), result.getModelo());
        assertEquals(VeiculoModelo.getCor(), result.getCor());
    }
    
}
