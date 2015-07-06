/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.poo2.oficinamecanica.cdp;

import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author RafaelBroedel
 */
public class VeiculoPrototipo extends Model implements Veiculo{
    
    private String placa, modelo, cor;
    private Tipo tipo;

    public VeiculoPrototipo(Tipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public Tipo getTipo() {
        return tipo;
    }

    @Override
    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

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
        return "Veiculo{" + "placa=" + placa + ", modelo=" + modelo + ", cor=" + cor + '}';
    }

    @Override
    public Veiculo clone(){
        Veiculo obj = null;
        try {
            obj = (Veiculo) super.clone();
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(VeiculoPrototipo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return obj;
    }
    
}
