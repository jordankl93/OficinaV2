/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.poo2.oficinamecanica.cci;

import br.ifes.poo2.oficinamecanica.cdp.Pessoa;
import br.ifes.poo2.oficinamecanica.cdp.Veiculo;
import br.ifes.poo2.oficinamecanica.cgt.AplCriarPessoa;
import br.ifes.poo2.oficinamecanica.cgt.AplCriarVeiculo;
import br.ifes.poo2.oficinamecanica.cih.VisaoMenu;
import br.ifes.poo2.oficinamecanica.exceptions.OpcaoIncorretaException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author RafaelBroedel
 */
public class Controle {
    private final VisaoMenu visao = new VisaoMenu();
    private final AplCriarPessoa aplCriarPessoa = new AplCriarPessoa();
    private final AplCriarVeiculo aplCriarVeiculo = new AplCriarVeiculo();
    private Pessoa pessoa;
    private Veiculo veiculo;
    
    public void iniciar(){
        boolean continuar = true;
        while(continuar){
            visao.menuInicial();
            int opcao = visao.lerEntrada();
            if(opcao ==0){
                continuar = false;
            } else {
                try {
                    this.selecionarOpcao(opcao);
                } catch (OpcaoIncorretaException ex) {
                    Logger.getLogger(Controle.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
    private void selecionarOpcao(int opcao) throws OpcaoIncorretaException{
        switch (opcao){
            case 1:
                visao.menuCriarCliente();
                pessoa = aplCriarPessoa.criarCliente();
                visao.print(pessoa.toString());
                visao.print("-- Cliente criado --");
                visao.print(" ");
                break;
            case 2:
                visao.menuCriarFuncinario();
                pessoa = aplCriarPessoa.criarVendedor();
                visao.print(pessoa.toString());
                visao.print("-- Vendedor criado --");
                visao.print(" ");
                break;
            case 3:
                visao.menuCriarFuncinario();
                pessoa = aplCriarPessoa.criarGerente();
                visao.print(pessoa.toString());
                visao.print("-- Gerente criado --");
                visao.print(" ");
                break;
            case 4:
                visao.menuCriarVeiculo();
                int tipoVeiculo = visao.lerEntrada();
                visao.menuDadosVeiculo();
                this.selecionarVeiculo(tipoVeiculo);
                visao.print(veiculo.toString());
                visao.print("-- Veiculo criado --");
                visao.print(" ");
                break;
            default:
                throw new OpcaoIncorretaException();
        }
    }

    private void selecionarVeiculo(int tipoVeiculo) throws OpcaoIncorretaException {
        
        switch(tipoVeiculo){
            case 1:
                veiculo = aplCriarVeiculo.criarCarro();
                break;
            case 2:
                veiculo = aplCriarVeiculo.criarMoto();
                break;
            case 3:
                veiculo = aplCriarVeiculo.criarCaminhao();
                break;
            default:
                throw new OpcaoIncorretaException();
        }
    }
}
