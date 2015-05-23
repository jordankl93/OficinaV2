/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.poo2.oficinamecanica.cgt;

import br.ifes.poo2.oficinamecanica.cdp.Pessoa;
import br.ifes.poo2.oficinamecanica.util.FabricaPessoa;
import br.ifes.poo2.oficinamecanica.util.TipoPessoaIncorretoException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author RafaelBroedel
 */
public class AplCriarPessoa {
    private FabricaPessoa fabrica = FabricaPessoa.getInstancia();
    private Pessoa pessoa;
    
    public Pessoa criarCliente(){
        try {
            pessoa = fabrica.criar("cliente");
        } catch (TipoPessoaIncorretoException ex) {
            Logger.getLogger(AplCriarPessoa.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pessoa;
    }
    
    public Pessoa criarVendedor(){
        try {
            pessoa = fabrica.criar("vendedor");
        } catch (TipoPessoaIncorretoException ex) {
            Logger.getLogger(AplCriarPessoa.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pessoa;
    }
    
    public Pessoa criarGerente(){
        try {
            pessoa = fabrica.criar("gerente");
        } catch (TipoPessoaIncorretoException ex) {
            Logger.getLogger(AplCriarPessoa.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pessoa;
    }
}
