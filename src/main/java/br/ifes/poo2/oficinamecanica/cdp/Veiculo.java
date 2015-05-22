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
public interface Veiculo {
    public String getPlaca();

    public void setPlaca(String placa);

    public String getModelo();

    public void setModelo(String modelo);

    public String getCor();

    public void setCor(String cor);

    @Override
    public String toString();
    
}
