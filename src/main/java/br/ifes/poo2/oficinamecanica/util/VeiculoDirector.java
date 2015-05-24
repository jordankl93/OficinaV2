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
public class VeiculoDirector {
    
    public Veiculo build(VeiculoBuilder builder){
        builder.addPlaca();
        builder.addModelo();
        builder.addCor();
        return builder.getVeiculo();
    }
}
