/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.poo2.oficinamecanica.util;

import br.ifes.poo2.oficinamecanica.cdp.FuncionarioAbstract;
import br.ifes.poo2.oficinamecanica.cdp.Pessoa;
import br.ifes.poo2.oficinamecanica.cdp.PessoaAbstract;

/**
 *
 * @author RafaelBroedel
 */
public class FabricaPessoa {
    private Pessoa cliente, vendedor, gerente;
    private FuncionarioBuilder funcionarioBuilder = new FuncionarioBuilder();
    private FuncionarioDirector funcionarioDirector = new FuncionarioDirector();
    private ClienteBuilder clienteBuilder = new ClienteBuilder();
    private ClienteDirector clienteDirector = new ClienteDirector();
    //Singleton
    private static FabricaPessoa instancia;
    private FabricaPessoa(){};
    public static FabricaPessoa getInstancia(){
        if(instancia == null){
            instancia = new FabricaPessoa();
        }
        return instancia;
    }
    
    public Pessoa criar(String tipo) throws TipoPessoaIncorretoException{
        switch(tipo){
            case "cliente":
                if(cliente == null){
                    cliente = FabricaAbstrataPessoa.criarCliente();
                } else {
                    cliente = cliente.clone();
                }
                clienteBuilder.setCliente((PessoaAbstract) cliente);
                cliente = clienteDirector.build(clienteBuilder);
                return cliente;
            case "vendedor":
                if(vendedor == null){
                    vendedor = FabricaAbstrataPessoa.criarVendedor();
                } else {
                    vendedor = vendedor.clone();
                }
                funcionarioBuilder.setFuncionario((FuncionarioAbstract) vendedor);
                vendedor = funcionarioDirector.build(funcionarioBuilder);
                return vendedor;
            case "gerente":
                if (gerente == null){
                    gerente = FabricaAbstrataPessoa.criarGerente();
                } else {
                    gerente = gerente.clone();
                }
                funcionarioBuilder.setFuncionario((FuncionarioAbstract) gerente);
                gerente = funcionarioDirector.build(funcionarioBuilder);
                return gerente;
            default:
                throw new TipoPessoaIncorretoException();
        }
    }
}
