/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.poo2.oficinamecanica.cih;

import br.ifes.poo2.oficinamecanica.util.ClienteModelo;
import br.ifes.poo2.oficinamecanica.util.FuncionarioModelo;
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
        System.out.println("0 - SAIR");
        System.out.println(" ");
    }
    
    public void menuCriarCliente(){
        System.out.print("Insira nome: ");
        ClienteModelo.setNome(ler.next());
        System.out.print("Insira CPF: ");
        ClienteModelo.setCpf(ler.nextLong());
        System.out.print("Insira data de nascimento: ");
        ClienteModelo.setDataDeNascimento(ler.next());
        System.out.print("Insira e-mail: ");
        ClienteModelo.setEmail(ler.next());

    }
    
    public void menuCriarFuncinario() {
        System.out.print("Insira nome: ");
        FuncionarioModelo.setNome(ler.next());
        System.out.print("Insira CPF: ");
        FuncionarioModelo.setCpf(ler.nextLong());
        System.out.print("Insira data de nascimento: ");
        FuncionarioModelo.setDataDeNascimento(ler.next());
        System.out.print("Insira e-mail: ");
        FuncionarioModelo.setEmail(ler.next());
        System.out.print("Insira carteira de trabalho: ");
        FuncionarioModelo.setCarteiraDeTrabalho(ler.nextLong());
        System.out.print("Insira salarioFixo: ");
        FuncionarioModelo.setSalarioFixo(ler.nextDouble());
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
