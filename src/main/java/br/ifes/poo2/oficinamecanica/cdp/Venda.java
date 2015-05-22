/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.poo2.oficinamecanica.cdp;

import java.util.Date;

/**
 *
 * @author RafaelBroedel
 */
public interface Venda {
    
    public String getDescricao();
    public void setDescricao(String descricao);
    public Double getValor();
    public void setValor(Double valor);
    public Date getDataDaVenda();
    public void setDataDaVenda(Date dataDaVenda);
    public Status getStatus();
    public void setStatus(Status status);

    @Override
    public String toString();
    
}
