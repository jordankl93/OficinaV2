/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.poo2.oficinamecanica.util;

import br.ifes.poo2.oficinamecanica.cdp.Venda;

/**
 *
 * @author RafaelBroedel
 */
public class VendaBuilder {
    private Venda venda;

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }
    
    public void addDescricao(){
        venda.setDescricao(VendaModelo.getDescricao());
    }
    
    public void addValor(){
        venda.setValorUnitario(VendaModelo.getValorUnitario());
    }
    
    public void addQuantidade(){
        venda.setQuantidade(VendaModelo.getQuantidade());
    }
    
    public void addData(){
        venda.setDataDaVenda(VendaModelo.getDataDaVenda());
    }
    
    public void addStatus(){
        if (VendaModelo.getStatus() == VendaModelo.Status.ABERTO){
            venda.setStatus(Venda.Status.ABERTO);
        } 
        else if (VendaModelo.getStatus() == VendaModelo.Status.CONCLUIDO){
            venda.setStatus(Venda.Status.CONCLUIDO);
        } 
        else if (VendaModelo.getStatus() == VendaModelo.Status.EMEXECUCAO){
            venda.setStatus(Venda.Status.EMEXECUCAO);
        } 
        else if (VendaModelo.getStatus() == VendaModelo.Status.INSTALADO){
            venda.setStatus(Venda.Status.INSTALADO);
        } 
        else if (VendaModelo.getStatus() == VendaModelo.Status.NAFILA){
            venda.setStatus(Venda.Status.NAFILA);
        }     
    }
    
    public void addValorTotal(){
        Double valorTotal = venda.getValorUnitario() * venda.getQuantidade();
        venda.setValorTotal(valorTotal);
    }
}
