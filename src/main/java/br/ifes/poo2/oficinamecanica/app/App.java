/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.poo2.oficinamecanica.app;

import br.ifes.poo2.oficinamecanica.cci.Controle;

/**
 *
 * @author RafaelBroedel
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Controle controle = new Controle();
        controle.iniciar();
    }
    
}
