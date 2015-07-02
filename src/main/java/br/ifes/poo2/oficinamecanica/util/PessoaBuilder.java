/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.poo2.oficinamecanica.util;

import br.ifes.poo2.oficinamecanica.cih.PessoaEstatico;
import br.ifes.poo2.oficinamecanica.cdp.Pessoa;

/**
 *
 * @author RafaelBroedel
 */
public abstract class PessoaBuilder {
    protected Pessoa pessoa;

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    
    public void addNome(){
        this.pessoa.setNome(PessoaEstatico.getNome());
    }
    
    public void addEmail(){
        this.pessoa.setEmail(PessoaEstatico.getEmail());
    }
    
    public void addCpf(){
        this.pessoa.setCpf(PessoaEstatico.getCpf());
    }
    
    public void addNascimento(){
        this.pessoa.setNascimento(PessoaEstatico.getDataDeNascimento());
    }
    
    public void addEndereco(){
        this.pessoa.setEndereco(PessoaEstatico.getEndereco());
    }
    
    public abstract void addCarteiraDeTrabalho();
    
    public abstract void addSalarioFixo();
}
