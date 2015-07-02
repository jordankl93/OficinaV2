/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.poo2.oficinamecanica.util;

import br.ifes.poo2.oficinamecanica.cih.PessoaEstatico;

/**
 *
 * @author RafaelBroedel
 */
public class FuncionarioBuilder extends PessoaBuilder {

    @Override
    public void addCarteiraDeTrabalho() {
        pessoa.setCarteiraDeTrabalho(PessoaEstatico.getCarteiraDeTrabalho());
    }

    @Override
    public void addSalarioFixo() {
        pessoa.setSalarioFixo(PessoaEstatico.getSalarioFixo());
        
    }

}
