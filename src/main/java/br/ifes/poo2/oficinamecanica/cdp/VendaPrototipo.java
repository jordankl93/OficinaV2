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
public class VendaPrototipo implements Venda {
    
    private Tipo tipo;
    private String descricao;
    private Double valorUnitario;
    private Double valorTotal;
    private int quantidade;
    private String dataDaVenda;
    private Status status;

    public VendaPrototipo(Tipo tipo) {
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
    public String getDescricao() {
        return descricao;
    }

    @Override
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public Double getValorUnitario() {
        return valorUnitario;
    }

    @Override
    public void setValorUnitario(Double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    @Override
    public Double getValorTotal() {
        return valorTotal;
    }

    @Override
    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String getDataDaVenda() {
        return dataDaVenda;
    }

    @Override
    public void setDataDaVenda(String dataDaVenda) {
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
    public Venda clone() {
        Venda obj = null;
        try {
            obj = (Venda) super.clone();
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(VendaPrototipo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return obj;
    }
    
}
