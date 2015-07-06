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
public class PessoaPrototipo extends Model implements Pessoa {
    private String nome, email, endereco;
    private long cpf, carteiraDeTrabalho;
    private String nascimento;
    private double salarioFixo;
    private Tipo tipo;

    public PessoaPrototipo(Tipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public Tipo getTipo() {
        return tipo;
    }

    @Override
    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public long getCpf() {
        return cpf;
    }

    @Override
    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    @Override
    public long getCarteiraDeTrabalho() {
        return carteiraDeTrabalho;
    }

    @Override
    public void setCarteiraDeTrabalho(long carteiraDeTrabalho) {
        this.carteiraDeTrabalho = carteiraDeTrabalho;
    }

    @Override
    public String getNascimento() {
        return nascimento;
    }

    @Override
    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    @Override
    public double getSalarioFixo() {
        return salarioFixo;
    }

    @Override
    public void setSalarioFixo(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    @Override
    public String getEndereco() {
        return endereco;
    }

    @Override
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    @Override
    public String toString() {
        return "Pessoa {" + "nome=" + nome + ", email=" + email + ", cpf=" + cpf + ", carteiraDeTrabalho=" + carteiraDeTrabalho + ", nascimento=" + nascimento + ", salarioFixo=" + salarioFixo + ", tipo=" + tipo + '}';
    }

    @Override
    public Pessoa clone() {
        Pessoa obj = null;
        try {
            obj = (Pessoa) super.clone();
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(PessoaPrototipo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return obj;
    }

}
