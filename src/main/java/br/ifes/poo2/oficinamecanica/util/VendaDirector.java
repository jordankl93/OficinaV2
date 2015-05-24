/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.poo2.oficinamecanica.util;

import br.ifes.poo2.oficinamecanica.cdp.Venda;

/**
 *
 * @author RafaelBroedel
 */
public class VendaDirector {
    
    public Venda build(VendaBuilder builder){
        builder.addDescricao();
        builder.addQuantidade();
        builder.addValor();
        builder.addData();
        builder.addValor();
        builder.addStatus();
        builder.addValorTotal();
        return builder.getVenda();
    }
}
