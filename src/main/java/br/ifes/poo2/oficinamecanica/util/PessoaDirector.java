/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.poo2.oficinamecanica.util;

import br.ifes.poo2.oficinamecanica.cdp.Pessoa;

/**
 *
 * @author RafaelBroedel
 */
public class PessoaDirector {
    
    public Pessoa build (PessoaBuilder builder){
        builder.addNome();
        builder.addCpf();
        builder.addEmail();
        builder.addNascimento();
        builder.addCarteiraDeTrabalho();
        builder.addSalarioFixo();
        return builder.getPessoa();
    }
}
