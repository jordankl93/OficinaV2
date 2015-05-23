/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.poo2.oficinamecanica.util;

import br.ifes.poo2.oficinamecanica.cdp.PessoaAbstract;

/**
 *
 * @author RafaelBroedel
 */
public class ClienteBuilder {
    private PessoaAbstract cliente;

    public PessoaAbstract getCliente() {
        return cliente;
    }

    public void setCliente(PessoaAbstract cliente) {
        this.cliente = cliente;
    }
    
    public void addNome(){
        cliente.setNome(ClienteModelo.getNome());
    }
    
    public void addEmail(){
        cliente.setEmail(ClienteModelo.getEmail());
    }
    
    public void addCpf(){
        cliente.setCpf(ClienteModelo.getCpf());
    }
    
    public void addNascimento(){
        cliente.setDataDeNascimento(ClienteModelo.getDataDeNascimento());
    }

}
