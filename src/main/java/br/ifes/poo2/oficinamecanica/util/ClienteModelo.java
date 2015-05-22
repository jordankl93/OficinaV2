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
public class ClienteModelo {
    private static String nome, email;
    private static long cpf;
    private static String dataDeNascimento;

    public static String getNome() {
        return nome;
    }

    public static void setNome(String nome) {
        ClienteModelo.nome = nome;
    }

    public static String getEmail() {
        return email;
    }

    public static void setEmail(String email) {
        ClienteModelo.email = email;
    }

    public static long getCpf() {
        return cpf;
    }

    public static void setCpf(long cpf) {
        ClienteModelo.cpf = cpf;
    }

    public static String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public static void setDataDeNascimento(String dataDeNascimento) {
        ClienteModelo.dataDeNascimento = dataDeNascimento;
    }
    
    
}
