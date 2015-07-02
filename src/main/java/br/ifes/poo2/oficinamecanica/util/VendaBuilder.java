/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.poo2.oficinamecanica.util;

import br.ifes.poo2.oficinamecanica.cih.VendaEstatico;
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
        venda.setDescricao(VendaEstatico.getDescricao());
    }
    
    public void addValor(){
        venda.setValorUnitario(VendaEstatico.getValorUnitario());
    }
    
    public void addQuantidade(){
        venda.setQuantidade(VendaEstatico.getQuantidade());
    }
    
    public void addData(){
        venda.setDataDaVenda(VendaEstatico.getDataDaVenda());
    }
    
    public void addStatus(){
        if (VendaEstatico.getStatus() == VendaEstatico.Status.ABERTO){
            venda.setStatus(Venda.Status.ABERTO);
        } 
        else if (VendaEstatico.getStatus() == VendaEstatico.Status.CONCLUIDO){
            venda.setStatus(Venda.Status.CONCLUIDO);
        } 
        else if (VendaEstatico.getStatus() == VendaEstatico.Status.EMEXECUCAO){
            venda.setStatus(Venda.Status.EMEXECUCAO);
        } 
        else if (VendaEstatico.getStatus() == VendaEstatico.Status.INSTALADO){
            venda.setStatus(Venda.Status.INSTALADO);
        } 
        else if (VendaEstatico.getStatus() == VendaEstatico.Status.NAFILA){
            venda.setStatus(Venda.Status.NAFILA);
        }     
    }
    
    public void addValorTotal(){
        Double valorTotal = venda.getValorUnitario() * venda.getQuantidade();
        venda.setValorTotal(valorTotal);
    }
}
