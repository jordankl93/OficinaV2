/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.poo2.oficinamecanica.cgt;

import br.ifes.poo2.oficinamecanica.cdp.Venda;
import br.ifes.poo2.oficinamecanica.util.FabricaVenda;
import br.ifes.poo2.oficinamecanica.exceptions.TipoVendaIncorretoException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author RafaelBroedel
 */
public class AplCriarVenda {
    private final FabricaVenda fabrica = FabricaVenda.getInstancia();
    private Venda venda;
    
    public Venda criarServico(){
        try {
            venda = fabrica.criar("servico");
        } catch (TipoVendaIncorretoException ex) {
            Logger.getLogger(AplCriarVenda.class.getName()).log(Level.SEVERE, null, ex);
        }
        return venda;
    }
    
    public Venda criarProduto(){
        try {
            venda = fabrica.criar("produto");
        } catch (TipoVendaIncorretoException ex) {
            Logger.getLogger(AplCriarVenda.class.getName()).log(Level.SEVERE, null, ex);
        }
        return venda;
    }
}
