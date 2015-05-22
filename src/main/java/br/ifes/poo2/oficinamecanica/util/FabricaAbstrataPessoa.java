/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.poo2.oficinamecanica.util;

import br.ifes.poo2.oficinamecanica.cdp.ClienteImp;
import br.ifes.poo2.oficinamecanica.cdp.GerenteImp;
import br.ifes.poo2.oficinamecanica.cdp.Pessoa;
import br.ifes.poo2.oficinamecanica.cdp.VendedorImp;

/**
 *
 * @author RafaelBroedel
 */
public class FabricaAbstrataPessoa {
    
    public static Pessoa criarCliente(){
        return new ClienteImp();
    }
    public static Pessoa criarVendedor(){
        return new VendedorImp();
    }
    public static Pessoa criarGerente(){
        return new GerenteImp();
    }
}
