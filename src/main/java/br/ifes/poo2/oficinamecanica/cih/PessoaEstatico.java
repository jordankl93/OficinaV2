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
public class PessoaEstatico {
    private static String nome, email, endereco;
    private static long cpf, carteiraDeTrabalho;
    private static String dataDeNascimento;
    private static double salarioFixo;

    public static String getNome() {
        return nome;
    }

    public static void setNome(String nome) {
        PessoaEstatico.nome = nome;
    }

    public static String getEmail() {
        return email;
    }

    public static void setEmail(String email) {
        PessoaEstatico.email = email;
    }

    public static long getCpf() {
        return cpf;
    }

    public static void setCpf(long cpf) {
        PessoaEstatico.cpf = cpf;
    }

    public static long getCarteiraDeTrabalho() {
        return carteiraDeTrabalho;
    }

    public static void setCarteiraDeTrabalho(long carteiraDeTrabalho) {
        PessoaEstatico.carteiraDeTrabalho = carteiraDeTrabalho;
    }

    public static String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public static void setDataDeNascimento(String dataDeNascimento) {
        PessoaEstatico.dataDeNascimento = dataDeNascimento;
    }

    public static double getSalarioFixo() {
        return salarioFixo;
    }

    public static void setSalarioFixo(double salarioFixo) {
        PessoaEstatico.salarioFixo = salarioFixo;
    }

    public static String getEndereco() {
        return endereco;
    }

    public static void setEndereco(String endereco) {
        PessoaEstatico.endereco = endereco;
    }
    
    
    
}
