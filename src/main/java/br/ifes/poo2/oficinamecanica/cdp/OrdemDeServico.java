/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.poo2.oficinamecanica.cdp;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author RafaelBroedel
 */
public class OrdemDeServico implements Ordem{
    private String dataInicio, dataFim;
    private Double valorTotal;
    
    private Veiculo veiculo;
    private Pessoa cliente;
    
    private List<Venda> vendasProdutos = new ArrayList<Venda>();
    private List<Venda> vendasServicos = new ArrayList<Venda>();

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Pessoa getCliente() {
        return cliente;
    }

    public void setCliente(Pessoa cliente) {
        this.cliente = cliente;
    }

    public List<Venda> getVendasServicos() {
        return vendasServicos;
    }

    public void setVendasServicos(Venda vendaServico) {
        this.vendasServicos.add(vendaServico);
    }
    
    public List<Venda> getVendasProdutos() {
        return vendasProdutos;
    }

    public void setVendasProdutos(Venda vendaProduto) {
        this.vendasProdutos.add(vendaProduto);
    }
    
}
