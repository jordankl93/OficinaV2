/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.poo2.oficinamecanica.util;

import br.ifes.poo2.oficinamecanica.cdp.Veiculo;

/**
 *
 * @author RafaelBroedel
 */
public class VeiculoBuilder {
    private Veiculo veiculo;

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
    
    public void addPlaca(){
        veiculo.setPlaca(VeiculoModelo.getPlaca());
    }
    
    public void addModelo(){
        veiculo.setModelo(VeiculoModelo.getModelo());
    }
    
    public void addCor(){
        veiculo.setCor(VeiculoModelo.getCor());
    }
}
