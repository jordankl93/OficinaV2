/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.poo2.oficinamecanica.cgt;

import br.ifes.poo2.oficinamecanica.cdp.Veiculo;
import br.ifes.poo2.oficinamecanica.util.FabricaVeiculo;
import br.ifes.poo2.oficinamecanica.util.TipoVeiculoIncorretoException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author RafaelBroedel
 */
public class AplCriarVeiculo {
    private final FabricaVeiculo fabrica = FabricaVeiculo.getInstancia();
    private Veiculo veiculo;
    
    public Veiculo criarCarro(){
        try {
            veiculo = fabrica.criar("carro");
        } catch (TipoVeiculoIncorretoException ex) {
            Logger.getLogger(AplCriarVeiculo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return veiculo;
    }
    
    public Veiculo criarMoto(){
        try {
            veiculo = fabrica.criar("moto");
        } catch (TipoVeiculoIncorretoException ex) {
            Logger.getLogger(AplCriarVeiculo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return veiculo;
    }
    
    public Veiculo criarCaminhao(){
        try {
            veiculo = fabrica.criar("caminhao");
        } catch (TipoVeiculoIncorretoException ex) {
            Logger.getLogger(AplCriarVeiculo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return veiculo;
    }
}
