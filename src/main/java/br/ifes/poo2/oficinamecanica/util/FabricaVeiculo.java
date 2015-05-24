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
public class FabricaVeiculo {
    private Veiculo carro, moto, caminhao;
    private final FabricaAbstrataVeiculo fabrica = new FabricaAbstrataVeiculo();
    private final VeiculoBuilder builder = new VeiculoBuilder();
    private final VeiculoDirector director = new VeiculoDirector();
    
    //Singleton
    private static FabricaVeiculo instancia;
    private FabricaVeiculo(){};
    public static FabricaVeiculo getInstancia(){
        if(instancia == null){
            instancia = new FabricaVeiculo();
        }
        return instancia;
    }
    
    public Veiculo criar(String tipo) throws TipoVeiculoIncorretoException{
        switch(tipo){
            case "carro":
                if(carro == null){
                    carro = fabrica.criarCarro();
                } else {
                    carro = carro.clone();
                }
                builder.setVeiculo(carro);
                carro = director.build(builder);
                return carro;
            case "moto":
                if(moto == null){
                    moto = fabrica.criarMoto();
                } else {
                    moto = moto.clone();
                }
                builder.setVeiculo(moto);
                moto = director.build(builder);
                return moto;
            case "caminhao":
                if(caminhao == null){
                    caminhao = fabrica.criarCaminhao();
                } else {
                    caminhao = caminhao.clone();
                }
                builder.setVeiculo(caminhao);
                caminhao = director.build(builder);
                return caminhao;
            default:
                throw new TipoVeiculoIncorretoException();
        }
    }
}
