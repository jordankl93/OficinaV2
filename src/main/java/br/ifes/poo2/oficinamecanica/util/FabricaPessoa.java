/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.poo2.oficinamecanica.util;

import br.ifes.poo2.oficinamecanica.cdp.Pessoa;
import br.ifes.poo2.oficinamecanica.cdp.PessoaPrototipo;

/**
 *
 * @author RafaelBroedel
 */
public class FabricaPessoa {
    private Pessoa cliente, vendedor, gerente;
    private PessoaBuilder funcionarioBuilder, clienteBuilder;
    private PessoaDirector pessoaDirector;
    
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
                    cliente = new PessoaPrototipo(Pessoa.Tipo.CLIENTE);
                } else {
                    cliente = cliente.clone();
                }
                cliente = chamarClienteBuilder(cliente);
                return cliente;
            case "vendedor":
                if(vendedor == null){
                    vendedor = new PessoaPrototipo(Pessoa.Tipo.VENDEDOR);
                } else {
                    vendedor = vendedor.clone();
                }
                vendedor = chamarFuncionarioBuilder(vendedor);
                return vendedor;
            case "gerente":
                if (gerente == null){
                    gerente = new PessoaPrototipo(Pessoa.Tipo.GERENTE);
                } else {
                    gerente = gerente.clone();
                }
                gerente = chamarFuncionarioBuilder(gerente);
                return gerente;
            default:
                throw new TipoPessoaIncorretoException();
        }
    }
    
    private Pessoa chamarFuncionarioBuilder(Pessoa pessoa){
        if (funcionarioBuilder == null){
            funcionarioBuilder = new FuncionarioBuilder();
        }
        if (pessoaDirector == null){
            pessoaDirector = new PessoaDirector();
        }
        
        funcionarioBuilder.setPessoa(pessoa);
        pessoa = pessoaDirector.build(funcionarioBuilder);
        return pessoa;
    }
    
    private Pessoa chamarClienteBuilder(Pessoa pessoa){
        if (clienteBuilder == null){
            clienteBuilder = new ClienteBuilder();
        }
        if (pessoaDirector == null){
            pessoaDirector = new PessoaDirector();
        }
        
        clienteBuilder.setPessoa(pessoa);
        pessoa = pessoaDirector.build(clienteBuilder);
        return pessoa;
    }
}
