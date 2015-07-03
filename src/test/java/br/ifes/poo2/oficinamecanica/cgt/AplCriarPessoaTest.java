/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.poo2.oficinamecanica.cgt;

import br.ifes.poo2.oficinamecanica.cdp.Pessoa;
import br.ifes.poo2.oficinamecanica.cih.PessoaEstatico;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author RafaelBroedel
 */
public class AplCriarPessoaTest {
    AplCriarPessoa instance;
    Pessoa result;

    @Before
    public void setUp() {
        instance = new AplCriarPessoa();
    }

    /**
     * Test of criarCliente method, of class AplCriarPessoa.
     */
    @Test
    public void testCriarCliente() {
        PessoaEstatico.setNome("Rafael");
        PessoaEstatico.setCpf(123);
        PessoaEstatico.setDataDeNascimento("02/09/1992");
        PessoaEstatico.setEmail("rafael@");
        PessoaEstatico.setEndereco("rua a");

        result = instance.criarCliente();
        
        assertEquals(PessoaEstatico.getNome(), result.getNome());
        assertEquals(PessoaEstatico.getCpf(), result.getCpf());
        assertEquals(PessoaEstatico.getDataDeNascimento(), result.getNascimento());
        assertEquals(PessoaEstatico.getEmail(), result.getEmail());
        assertEquals(PessoaEstatico.getEndereco(), result.getEndereco());
        
    }

    /**
     * Test of criarVendedor method, of class AplCriarPessoa.
     */
    @Test
    public void testCriarVendedor() {
        PessoaEstatico.setNome("Kamila");
        PessoaEstatico.setCpf(456);
        PessoaEstatico.setDataDeNascimento("12/19/1991");
        PessoaEstatico.setEmail("kamila@");
        PessoaEstatico.setCarteiraDeTrabalho(123);
        PessoaEstatico.setSalarioFixo(1000);
        PessoaEstatico.setEndereco("rua b");
        
        result = instance.criarVendedor();
        
        assertEquals(PessoaEstatico.getNome(), result.getNome());
        assertEquals(PessoaEstatico.getCpf(), result.getCpf());
        assertEquals(PessoaEstatico.getDataDeNascimento(), result.getNascimento());
        assertEquals(PessoaEstatico.getEmail(), result.getEmail());
        assertEquals(PessoaEstatico.getCarteiraDeTrabalho(), result.getCarteiraDeTrabalho());
        assertEquals(PessoaEstatico.getSalarioFixo(), result.getSalarioFixo(),0); 
        assertEquals(PessoaEstatico.getEndereco(), result.getEndereco());
    }

    /**
     * Test of criarGerente method, of class AplCriarPessoa.
     */
    @Test
    public void testCriarGerente() {
        PessoaEstatico.setNome("Chiara");
        PessoaEstatico.setCpf(789);
        PessoaEstatico.setDataDeNascimento("22/10/1911");
        PessoaEstatico.setEmail("chiara@");
        PessoaEstatico.setCarteiraDeTrabalho(456);
        PessoaEstatico.setSalarioFixo(2200.10);
        PessoaEstatico.setEndereco("rua c");
        
        result = instance.criarGerente();
        
        assertEquals(PessoaEstatico.getNome(), result.getNome());
        assertEquals(PessoaEstatico.getCpf(), result.getCpf());
        assertEquals(PessoaEstatico.getDataDeNascimento(), result.getNascimento());
        assertEquals(PessoaEstatico.getEmail(), result.getEmail());
        assertEquals(PessoaEstatico.getCarteiraDeTrabalho(), result.getCarteiraDeTrabalho());
        assertEquals(PessoaEstatico.getSalarioFixo(), result.getSalarioFixo(),0); //delta?
        assertEquals(PessoaEstatico.getEndereco(), result.getEndereco());
    }
    
}
