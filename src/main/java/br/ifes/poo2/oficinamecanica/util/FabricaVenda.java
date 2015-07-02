/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.poo2.oficinamecanica.util;

import br.ifes.poo2.oficinamecanica.exceptions.TipoVendaIncorretoException;
import br.ifes.poo2.oficinamecanica.cdp.Venda;
import br.ifes.poo2.oficinamecanica.cdp.VendaPrototipo;

/**
 *
 * @author RafaelBroedel
 */
public class FabricaVenda {
    private Venda servico, produto;
    private VendaBuilder builder = new VendaBuilder();
    private VendaDirector director = new VendaDirector();
    
    //Singleton
    private static FabricaVenda instancia;
    private FabricaVenda(){};
    public static FabricaVenda getInstancia(){
        if(instancia == null){
            instancia = new FabricaVenda();
        }
        return instancia;
    }
    
    public Venda criar(String tipo) throws TipoVendaIncorretoException{
        switch(tipo){
            case "servico":
                if(servico == null){
                    servico = new VendaPrototipo(Venda.Tipo.SERVICO);
                } else {
                    servico = servico.clone();
                }
                servico = chamarVendaBuilder(servico);
                return servico;
            case "produto":
                if(produto == null){
                    produto = new VendaPrototipo(Venda.Tipo.PRODUTO);
                } else {
                    produto = produto.clone();
                }
                produto = chamarVendaBuilder(produto);
                return produto;
            default:
                throw new TipoVendaIncorretoException();
        }
    }
    
    private Venda chamarVendaBuilder(Venda venda){
        if(builder == null){
            builder = new VendaBuilder();
        }
        if(director == null){
            director = new VendaDirector();
        }
        
        builder.setVenda(venda);
        venda = director.build(builder);
        return venda;
    }
    
}
