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
public class VendaEstatico {
    
    public enum Status {ABERTO, CONCLUIDO, INSTALADO, EMEXECUCAO, NAFILA};
    private static String descricao;
    private static Double valorUnitario;
    private static int quantidade;
    private static long idVendedor;
    private static String dataDaVenda;
    private static Status status;

    public static String getDescricao() {
        return descricao;
    }

    public static void setDescricao(String descricao) {
        VendaEstatico.descricao = descricao;
    }

    public static Double getValorUnitario() {
        return valorUnitario;
    }

    public static void setValorUnitario(Double valorUnitario) {
        VendaEstatico.valorUnitario = valorUnitario;
    }

    public static int getQuantidade() {
        return quantidade;
    }

    public static void setQuantidade(int quantidade) {
        VendaEstatico.quantidade = quantidade;
    }

    public static String getDataDaVenda() {
        return dataDaVenda;
    }

    public static void setDataDaVenda(String dataDaVenda) {
        VendaEstatico.dataDaVenda = dataDaVenda;
    }

    public static Status getStatus() {
        return status;
    }

    public static void setStatus(Status status) {
        VendaEstatico.status = status;
    }

    public static long getIdVendedor() {
        return idVendedor;
    }

    public static void setIdVendedor(long idVendedor) {
        VendaEstatico.idVendedor = idVendedor;
    }
    
    
    
}
