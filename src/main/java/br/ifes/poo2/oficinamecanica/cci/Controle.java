/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.poo2.oficinamecanica.cci;

import br.ifes.poo2.oficinamecanica.cdp.Pessoa;
import br.ifes.poo2.oficinamecanica.cgt.AplCriarPessoa;
import br.ifes.poo2.oficinamecanica.cih.VisaoMenu;
import br.ifes.poo2.oficinamecanica.util.TipoPessoaIncorretoException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author RafaelBroedel
 */
public class Controle {
    private VisaoMenu visao = new VisaoMenu();
    private AplCriarPessoa aplCriarPessoa = new AplCriarPessoa();
    private Pessoa pessoa;
    
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
                    visao.print(pessoa.toString());
                    visao.print(" ");
                } catch (TipoPessoaIncorretoException ex) {
                    Logger.getLogger(Controle.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
    private void selecionarOpcao(int opcao) throws TipoPessoaIncorretoException{
        switch (opcao){
            case 1:
                visao.menuCriarCliente();
                pessoa = aplCriarPessoa.criarCliente();
                visao.print("-- Cliente criado --");
                break;
            case 2:
                visao.menuCriarFuncinario();
                pessoa = aplCriarPessoa.criarVendedor();
                visao.print("-- Vendedor criado --");
                break;
            case 3:
                visao.menuCriarFuncinario();
                pessoa = aplCriarPessoa.criarGerente();
                visao.print("-- Gerente criado --");
                break;
            default:
                throw new TipoPessoaIncorretoException();
        }
    }
}
