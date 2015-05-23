/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.poo2.oficinamecanica.util;

import br.ifes.poo2.oficinamecanica.cdp.FuncionarioAbstract;

/**
 *
 * @author RafaelBroedel
 */
public class FuncionarioBuilder {
    private FuncionarioAbstract funcionario;

    public FuncionarioAbstract getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(FuncionarioAbstract funcionario) {
        this.funcionario = funcionario;
    }
    
    public void addNome(){
        funcionario.setNome(FuncionarioModelo.getNome());
    }
    
    public void addEmail(){
        funcionario.setEmail(FuncionarioModelo.getEmail());
    }
    
    public void addCpf(){
        funcionario.setCpf(FuncionarioModelo.getCpf());
    }
    
    public void addNascimento(){
        funcionario.setDataDeNascimento(FuncionarioModelo.getDataDeNascimento());
    }
    
    public void addCarteiraDeTrabalho(){
        funcionario.setCarteiraDeTrabalho(FuncionarioModelo.getCarteiraDeTrabalho());
    }
    
    public void addSalarioFixo(){
        funcionario.setSalarioFixo(FuncionarioModelo.getSalarioFixo());
    }
}
