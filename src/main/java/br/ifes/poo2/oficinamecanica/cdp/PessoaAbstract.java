/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.poo2.oficinamecanica.cdp;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author RafaelBroedel
 */
public abstract class PessoaAbstract implements Pessoa{
    private String nome, email;
    private long cpf;
    private String nascimento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public String getDataDeNascimento() {
        return nascimento;
    }

    public void setDataDeNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    @Override
    public Pessoa clone() {
        Pessoa obj = null;
        try {
            obj = (Pessoa) super.clone();
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(PessoaAbstract.class.getName()).log(Level.SEVERE, null, ex);
        }
        return obj;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", email=" + email + ", cpf=" + cpf + ", nascimento=" + nascimento + '}';
    }
    
    
}
