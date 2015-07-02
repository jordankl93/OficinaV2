/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.poo2.oficinamecanica.cih;

import java.util.Scanner;

/**
 *
 * @author RafaelBroedel
 */
public class VisaoMenu {
    private final Scanner ler = new Scanner(System.in);
    
    public void menuInicial(){
        System.out.println("1 - Criar Cliente");
        System.out.println("2 - Criar Vendedor");
        System.out.println("3 - Criar Gerente");
        System.out.println("4 - Criar Veiculo");
        System.out.println("0 - SAIR");
        System.out.println(" ");
    }
    
    public void menuCriarCliente(){
        System.out.print("Insira nome: ");
        PessoaEstatico.setNome(ler.next());
        System.out.print("Insira CPF: ");
        PessoaEstatico.setCpf(ler.nextLong());
        System.out.print("Insira data de nascimento: ");
        PessoaEstatico.setDataDeNascimento(ler.next());
        System.out.print("Insira e-mail: ");
        PessoaEstatico.setEmail(ler.next());
        System.out.print("Insira endereco: ");
        PessoaEstatico.setEndereco(ler.next());

    }
    
    public void menuCriarFuncinario() {
        this.menuCriarCliente();
        System.out.print("Insira carteira de trabalho: ");
        PessoaEstatico.setCarteiraDeTrabalho(ler.nextLong());
        System.out.print("Insira salarioFixo: ");
        PessoaEstatico.setSalarioFixo(ler.nextDouble());
    }
    
    public void menuCriarVeiculo(){
        System.out.println("1 - Criar Carro");
        System.out.println("2 - Criar Moto");
        System.out.println("3 - Criar Caminhao");
    }
    
    public void menuDadosVeiculo(){
        System.out.print("Informe placa: ");
        VeiculoEstatico.setPlaca(ler.next());
        System.out.print("Informe modelo: ");
        VeiculoEstatico.setModelo(ler.next());
        System.out.print("Informe cor: ");
        VeiculoEstatico.setCor(ler.next());
    }
    
    public int lerEntrada(){
        return (ler.nextInt());
    }

    public void print(String conteudo){
        System.out.println(conteudo);
    }
    
    public void print(Double conteudo){
        System.out.println(conteudo);
    }

}
