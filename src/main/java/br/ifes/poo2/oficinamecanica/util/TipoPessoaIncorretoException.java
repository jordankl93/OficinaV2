/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.poo2.oficinamecanica.util;

/**
 *
 * @author RafaelBroedel
 */
public class TipoPessoaIncorretoException extends Exception {

    public TipoPessoaIncorretoException() {
        super("Tipo de Pessoa informado não existe.");
    }
    
}
