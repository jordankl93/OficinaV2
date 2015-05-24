/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.poo2.oficinamecanica.util;


/**
 *
 * @author RafaelBroedel
 */
public class VendaModelo {
    
    public enum Status {ABERTO, CONCLUIDO, INSTALADO, EMEXECUCAO, NAFILA};
    private static String descricao;
    private static Double valorUnitario;
    private static int quantidade;
    private static String dataDaVenda;
    private static Status status;

    public static String getDescricao() {
        return descricao;
    }

    public static void setDescricao(String descricao) {
        VendaModelo.descricao = descricao;
    }

    public static Double getValorUnitario() {
        return valorUnitario;
    }

    public static void setValorUnitario(Double valorUnitario) {
        VendaModelo.valorUnitario = valorUnitario;
    }

    public static int getQuantidade() {
        return quantidade;
    }

    public static void setQuantidade(int quantidade) {
        VendaModelo.quantidade = quantidade;
    }

    public static String getDataDaVenda() {
        return dataDaVenda;
    }

    public static void setDataDaVenda(String dataDaVenda) {
        VendaModelo.dataDaVenda = dataDaVenda;
    }

    public static Status getStatus() {
        return status;
    }

    public static void setStatus(Status status) {
        VendaModelo.status = status;
    }
    
    
}
