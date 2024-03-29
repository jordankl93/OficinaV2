/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.poo2.oficinamecanica.cdp;

/**
 *
 * @author RafaelBroedel
 */
public interface Pessoa extends Cloneable {
    
    public enum Tipo{
        CLIENTE, VENDEDOR, GERENTE;
    }
    public Pessoa clone();
    
    public Tipo getTipo();
    
    public void setTipo(Tipo tipo);
    
    public String getNome();
    
    public void setNome(String nome);
    
    public String getEmail();

    public void setEmail(String email);

    public long getCpf();

    public void setCpf(long cpf);

    public long getCarteiraDeTrabalho();

    public void setCarteiraDeTrabalho(long carteiraDeTrabalho);

    public String getNascimento();

    public void setNascimento(String nascimento);

    public double getSalarioFixo();

    public void setSalarioFixo(double salarioFixo);
    
    public String getEndereco();

    public void setEndereco(String endereco);
    
    public long getId();

    public void setId(long id);
}
