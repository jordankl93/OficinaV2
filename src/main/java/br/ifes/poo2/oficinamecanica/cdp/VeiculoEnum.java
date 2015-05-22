/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.poo2.oficinamecanica.cdp;

/**
 *
 * @author RafaelBroedel
 */
public enum VeiculoEnum implements Veiculo{
    CARRO, MOTO, CAMINHAO;
    
    private String placa, modelo, cor;

    @Override
    public String getPlaca() {
        return placa;
    }

    @Override
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public String getModelo() {
        return modelo;
    }

    @Override
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String getCor() {
        return cor;
    }

    @Override
    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "VeiculoEnum{" + "placa=" + placa + ", modelo=" + modelo + ", cor=" + cor + '}';
    }
    
}
