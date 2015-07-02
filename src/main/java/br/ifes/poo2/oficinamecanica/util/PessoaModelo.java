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
public class PessoaModelo {
    private static String nome, email, endereco;
    private static long cpf, carteiraDeTrabalho;
    private static String dataDeNascimento;
    private static double salarioFixo;

    public static String getNome() {
        return nome;
    }

    public static void setNome(String nome) {
        PessoaModelo.nome = nome;
    }

    public static String getEmail() {
        return email;
    }

    public static void setEmail(String email) {
        PessoaModelo.email = email;
    }

    public static long getCpf() {
        return cpf;
    }

    public static void setCpf(long cpf) {
        PessoaModelo.cpf = cpf;
    }

    public static long getCarteiraDeTrabalho() {
        return carteiraDeTrabalho;
    }

    public static void setCarteiraDeTrabalho(long carteiraDeTrabalho) {
        PessoaModelo.carteiraDeTrabalho = carteiraDeTrabalho;
    }

    public static String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public static void setDataDeNascimento(String dataDeNascimento) {
        PessoaModelo.dataDeNascimento = dataDeNascimento;
    }

    public static double getSalarioFixo() {
        return salarioFixo;
    }

    public static void setSalarioFixo(double salarioFixo) {
        PessoaModelo.salarioFixo = salarioFixo;
    }

    public static String getEndereco() {
        return endereco;
    }

    public static void setEndereco(String endereco) {
        PessoaModelo.endereco = endereco;
    }
    
    
    
}
