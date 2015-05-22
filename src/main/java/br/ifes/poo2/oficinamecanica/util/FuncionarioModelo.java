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
public class FuncionarioModelo {
    private static String nome, email;
    private static long cpf, carteiraDeTrabalho;
    private static String dataDeNascimento;
    private static double salarioFixo;

    public static String getNome() {
        return nome;
    }

    public static void setNome(String nome) {
        FuncionarioModelo.nome = nome;
    }

    public static String getEmail() {
        return email;
    }

    public static void setEmail(String email) {
        FuncionarioModelo.email = email;
    }

    public static long getCpf() {
        return cpf;
    }

    public static void setCpf(long cpf) {
        FuncionarioModelo.cpf = cpf;
    }

    public static long getCarteiraDeTrabalho() {
        return carteiraDeTrabalho;
    }

    public static void setCarteiraDeTrabalho(long carteiraDeTrabalho) {
        FuncionarioModelo.carteiraDeTrabalho = carteiraDeTrabalho;
    }

    public static String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public static void setDataDeNascimento(String dataDeNascimento) {
        FuncionarioModelo.dataDeNascimento = dataDeNascimento;
    }

    public static double getSalarioFixo() {
        return salarioFixo;
    }

    public static void setSalarioFixo(double salarioFixo) {
        FuncionarioModelo.salarioFixo = salarioFixo;
    }
    
}
