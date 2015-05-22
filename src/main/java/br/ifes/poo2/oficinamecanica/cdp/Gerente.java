/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.poo2.oficinamecanica.cdp;

import java.util.Date;

/**
 *
 * @author RafaelBroedel
 */
public interface Gerente {
    public String getNome();

    public void setNome(String nome);

    public String getEmail();

    public void setEmail(String email);

    public long getCpf();

    public void setCpf(long cpf);

    public Date getNascimento();

    public void setNascimento(Date nascimento);
    
    public long getCarteiraDeTrabalho();

    public void setCarteiraDeTrabalho(long carteiraDeTrabalho);

    public double getSalarioFixo();

    public void setSalarioFixo(double salarioFixo);
}
