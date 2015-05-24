/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.poo2.oficinamecanica.util;

import br.ifes.poo2.oficinamecanica.cdp.Veiculo;
import br.ifes.poo2.oficinamecanica.cdp.VeiculoImp;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author RafaelBroedel
 */
public class FabricaVeiculoTest {
    private FabricaVeiculo instance;

    @Before
    public void setUp() {
        instance = FabricaVeiculo.getInstancia();
    }

    /**
     * Test of criar method, of class FabricaVeiculo.
     */
    @Test
    public void testCriarCarro() throws Exception {
        String tipo = "carro";
        Veiculo expResult = new VeiculoImp(Veiculo.Tipo.CARRO);
        Veiculo result = instance.criar(tipo);
        assertEquals(expResult.getTipo(), result.getTipo());
    }
    
    @Test
    public void testCriarMoto() throws Exception {
        String tipo = "moto";
        Veiculo expResult = new VeiculoImp(Veiculo.Tipo.MOTO);
        Veiculo result = instance.criar(tipo);
        assertEquals(expResult.getTipo(), result.getTipo());
    }
    
    @Test
    public void testCriarCaminhao() throws Exception {
        String tipo = "caminhao";
        Veiculo expResult = new VeiculoImp(Veiculo.Tipo.CAMINHAO);
        Veiculo result = instance.criar(tipo);
        assertEquals(expResult.getTipo(), result.getTipo());
    }
    
    @Test(expected = TipoVeiculoIncorretoException.class)
    public void testCriarComErro() throws Exception {
        String tipo = "xxx";

        new AssertionError(instance.criar(tipo));
    }
    
}
