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
public class OpcaoIncorretaException extends Exception {

    public OpcaoIncorretaException() {
        super("Opcao nao existe no menu.");
    }
    
}
