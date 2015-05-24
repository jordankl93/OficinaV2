/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.poo2.oficinamecanica.util;

import br.ifes.poo2.oficinamecanica.cdp.Venda;
import br.ifes.poo2.oficinamecanica.cdp.VendaImp;

/**
 *
 * @author RafaelBroedel
 */
public class FabricaAbstrataVenda {
    
    public Venda criarProduto(){
        return new VendaImp(Venda.Tipo.PRODUTO);
    }
    
    public Venda criarServico(){
        return new VendaImp(Venda.Tipo.SERVICO);
    }
}
