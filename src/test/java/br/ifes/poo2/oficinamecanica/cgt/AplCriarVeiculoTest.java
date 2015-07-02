/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.poo2.oficinamecanica.cgt;

import br.ifes.poo2.oficinamecanica.cdp.Veiculo;
import br.ifes.poo2.oficinamecanica.cih.VeiculoEstatico;
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
        VeiculoEstatico.setPlaca("xxx-0000");
        VeiculoEstatico.setModelo("Corsa");
        VeiculoEstatico.setCor("preto");
        
        Veiculo result = instance.criarCarro();
        
        assertEquals(VeiculoEstatico.getPlaca(), result.getPlaca());
        assertEquals(VeiculoEstatico.getModelo(), result.getModelo());
        assertEquals(VeiculoEstatico.getCor(), result.getCor());
    }

    /**
     * Test of criarMoto method, of class AplCriarVeiculo.
     */
    @Test
    public void testCriarMoto() {
        VeiculoEstatico.setPlaca("yyy-0000");
        VeiculoEstatico.setModelo("cg");
        VeiculoEstatico.setCor("vermelho");
        
        Veiculo result = instance.criarMoto();
        
        assertEquals(VeiculoEstatico.getPlaca(), result.getPlaca());
        assertEquals(VeiculoEstatico.getModelo(), result.getModelo());
        assertEquals(VeiculoEstatico.getCor(), result.getCor());
    }

    /**
     * Test of criarCaminhao method, of class AplCriarVeiculo.
     */
    @Test
    public void testCriarCaminhao() {
        VeiculoEstatico.setPlaca("aaa-0000");
        VeiculoEstatico.setModelo("truck");
        VeiculoEstatico.setCor("branco");
        
        Veiculo result = instance.criarCaminhao();
        
        assertEquals(VeiculoEstatico.getPlaca(), result.getPlaca());
        assertEquals(VeiculoEstatico.getModelo(), result.getModelo());
        assertEquals(VeiculoEstatico.getCor(), result.getCor());
    }
    
}
