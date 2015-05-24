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
public class FabricaVenda {
    private Venda servico, produto;
    private final FabricaAbstrataVenda fabrica = new FabricaAbstrataVenda();
    private final VendaBuilder builder = new VendaBuilder();
    private final VendaDirector director = new VendaDirector();
    
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
                    servico = fabrica.criarServico();
                } else {
                    servico = servico.clone();
                }
                builder.setVenda(servico);
                servico = director.build(builder);
                return servico;
            case "produto":
                if(produto == null){
                    produto = fabrica.criarProduto();
                } else {
                    produto = produto.clone();
                }
                builder.setVenda(produto);
                produto = director.build(builder);
                return produto;
            default:
                throw new TipoVendaIncorretoException();
        }
    }
    
}
