/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.poo2.oficinamecanica.cih;

/**
 *
 * @author RafaelBroedel
 */
public class VeiculoEstatico {
    private static String placa, modelo, cor;

    public static String getPlaca() {
        return placa;
    }

    public static void setPlaca(String placa) {
        VeiculoEstatico.placa = placa;
    }

    public static String getModelo() {
        return modelo;
    }

    public static void setModelo(String modelo) {
        VeiculoEstatico.modelo = modelo;
    }

    public static String getCor() {
        return cor;
    }

    public static void setCor(String cor) {
        VeiculoEstatico.cor = cor;
    }
    
}
