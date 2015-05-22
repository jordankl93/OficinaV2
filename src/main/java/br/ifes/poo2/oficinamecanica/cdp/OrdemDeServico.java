/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.poo2.oficinamecanica.cdp;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author RafaelBroedel
 */
public class OrdemDeServico implements Ordem{
    private Date dataInicio, dataFim;
    private Double valorTotal;
    
    private Veiculo veiculo;
    private Cliente cliente;
    
    private List<Venda> vendasProdutos = new ArrayList<Venda>();
    private List<Venda> vendasServicos = new ArrayList<Venda>();

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
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
