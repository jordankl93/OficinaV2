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
public enum VendaEnum implements Venda {
    PRODUTO, SERVICO;
    
    private String descricao;
    private Double valor;
    private Date dataDaVenda;
    private Status status;

    @Override
    public String getDescricao() {
        return descricao;
    }

    @Override
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public Double getValor() {
        return valor;
    }

    @Override
    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    public Date getDataDaVenda() {
        return dataDaVenda;
    }

    @Override
    public void setDataDaVenda(Date dataDaVenda) {
        this.dataDaVenda = dataDaVenda;
    }

    @Override
    public Status getStatus() {
        return status;
    }

    @Override
    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "VendaEnum{" + "descricao=" + descricao + ", valor=" + valor + ", dataDaVenda=" + dataDaVenda + ", status=" + status + '}';
    }
    
    
}
