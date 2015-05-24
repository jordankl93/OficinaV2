/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.poo2.oficinamecanica.util;

import br.ifes.poo2.oficinamecanica.cdp.Veiculo;
import br.ifes.poo2.oficinamecanica.cdp.VeiculoImp;

/**
 *
 * @author RafaelBroedel
 */
public class FabricaAbstrataVeiculo {
    
    public Veiculo criarCarro(){
        return new VeiculoImp(Veiculo.Tipo.CARRO);
    }
    
    public Veiculo criarMoto(){
        return new VeiculoImp(Veiculo.Tipo.MOTO);
    }
    
    public Veiculo criarCaminhao(){
        return new VeiculoImp(Veiculo.Tipo.CAMINHAO);
    }
}
