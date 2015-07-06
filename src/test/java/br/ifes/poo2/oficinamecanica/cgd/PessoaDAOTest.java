/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.poo2.oficinamecanica.cgd;

import br.ifes.poo2.oficinamecanica.cdp.Pessoa;
import br.ifes.poo2.oficinamecanica.cdp.PessoaPrototipo;
import java.sql.SQLException;
import java.util.EmptyStackException;
import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author RafaelBroedel
 */
public class PessoaDAOTest {
    private PessoaDAO instance;
    private Pessoa obj;
    
    @Before
    public void setUp() throws ClassNotFoundException, SQLException {
        instance = new PessoaDAO();
        instance.criarTabela();
    }

    /**
     * Test of insert method, of class PessoaDAO.
     */
    @Test
    public void testInsertCliente() throws Exception {
        
        obj = new PessoaPrototipo(Pessoa.Tipo.CLIENTE);
        obj.setNome("rafael");
        obj.setEmail("rafael@");
        obj.setCpf(123);
        obj.setEndereco("rua1");
        obj.setNascimento("01/01/1991");
        
        instance.insert(obj);
        
        Assert.assertNotSame(0, obj.getId());
    }
    
    /**
     * Test of insert method, of class PessoaDAO.
     */
    @Test
    public void testInsertVendedor() throws Exception {
        
        obj = new PessoaPrototipo(Pessoa.Tipo.VENDEDOR);
        obj.setNome("rafael");
        obj.setEmail("rafael@");
        obj.setCpf(123);
        obj.setEndereco("rua1");
        obj.setNascimento("01/01/1991");
        obj.setCarteiraDeTrabalho(123);
        obj.setSalarioFixo(10.10);
        
        instance.insert(obj);
        
        Assert.assertNotSame(0, obj.getId());
    }
    
    /**
     * Test of insert method, of class PessoaDAO.
     */
    @Test
    public void testInsertGerente() throws Exception {
        
        obj = new PessoaPrototipo(Pessoa.Tipo.GERENTE);
        obj.setNome("rafael");
        obj.setEmail("rafael@");
        obj.setCpf(123);
        obj.setEndereco("rua1");
        obj.setNascimento("01/01/1991");
        obj.setCarteiraDeTrabalho(123);
        obj.setSalarioFixo(10.10);
        
        instance.insert(obj);
        
        Assert.assertNotSame(0, obj.getId());
    }

    /**
     * Test of update method, of class PessoaDAO.
     */
    @Test
    public void testUpdate() throws Exception {
        obj = new PessoaPrototipo(Pessoa.Tipo.CLIENTE);
        obj.setNome("rafael");
        obj.setEmail("rafael@");
        obj.setCpf(123);
        obj.setEndereco("rua1");
        obj.setNascimento("01/01/1991");
        
        instance.insert(obj);
        
        obj.setCpf(321);
        obj.setEndereco("rua2");

        instance.update(obj);
        
        Pessoa pessoaTest = instance.findbyID(obj.getId());
        
        Assert.assertEquals(obj.getTipo(), pessoaTest.getTipo());
        Assert.assertEquals(obj.getCpf(), pessoaTest.getCpf());
        Assert.assertEquals(obj.getEndereco(), pessoaTest.getEndereco());
    }

    /**
     * Test of delete method, of class PessoaDAO.
     */
    @Test(expected = EmptyStackException.class)
    public void testDelete() throws Exception {
        obj = new PessoaPrototipo(Pessoa.Tipo.CLIENTE);
        obj.setNome("rafael");
        obj.setEmail("rafael@");
        obj.setCpf(123);
        obj.setEndereco("rua1");
        obj.setNascimento("01/01/1991");
        
        instance.insert(obj);
        instance.delete(obj);
        
        new AssertionError(instance.findbyID(obj.getId()));
    }

    /**
     * Test of findbyID method, of class PessoaDAO.
     */
    @Test
    public void testClienteFindbyID() throws Exception {
        obj = new PessoaPrototipo(Pessoa.Tipo.CLIENTE);
        obj.setNome("rafael");
        obj.setEmail("rafael@");
        obj.setCpf(123);
        obj.setEndereco("rua1");
        obj.setNascimento("01/01/1991");
        
        instance.insert(obj);
        
        Pessoa pessoaTest = instance.findbyID(obj.getId());
        
        Assert.assertEquals(obj.getTipo(), pessoaTest.getTipo());
        Assert.assertEquals(obj.getNome(), pessoaTest.getNome());
        Assert.assertEquals(obj.getEmail(), pessoaTest.getEmail());
        Assert.assertEquals(obj.getCpf(), pessoaTest.getCpf());
        Assert.assertEquals(obj.getEndereco(), pessoaTest.getEndereco());
        Assert.assertEquals(obj.getNascimento(), pessoaTest.getNascimento());
        Assert.assertEquals(obj.getSalarioFixo(), pessoaTest.getSalarioFixo(),0);
        Assert.assertEquals(obj.getCarteiraDeTrabalho(), pessoaTest.getCarteiraDeTrabalho());
        

    }
    
    /**
     * Test of findbyID method, of class PessoaDAO.
     */
    @Test
    public void testVendedorFindbyID() throws Exception {
        obj = new PessoaPrototipo(Pessoa.Tipo.VENDEDOR);
        obj.setNome("rafael");
        obj.setEmail("rafael@");
        obj.setCpf(123);
        obj.setEndereco("rua1");
        obj.setNascimento("01/01/1991");
        obj.setCarteiraDeTrabalho(123);
        obj.setSalarioFixo(10.10);
        
        instance.insert(obj);
        
        Pessoa pessoaTest = instance.findbyID(obj.getId());
        
        Assert.assertEquals(obj.getTipo(), pessoaTest.getTipo());
        Assert.assertEquals(obj.getNome(), pessoaTest.getNome());
        Assert.assertEquals(obj.getEmail(), pessoaTest.getEmail());
        Assert.assertEquals(obj.getCpf(), pessoaTest.getCpf());
        Assert.assertEquals(obj.getEndereco(), pessoaTest.getEndereco());
        Assert.assertEquals(obj.getNascimento(), pessoaTest.getNascimento());
        Assert.assertEquals(obj.getSalarioFixo(), pessoaTest.getSalarioFixo(),0);
        Assert.assertEquals(obj.getCarteiraDeTrabalho(), pessoaTest.getCarteiraDeTrabalho());

    }
    
    /**
     * Test of findbyID method, of class PessoaDAO.
     */
    @Test
    public void testGerenteFindbyID() throws Exception {
        obj = new PessoaPrototipo(Pessoa.Tipo.GERENTE);
        obj.setNome("rafael");
        obj.setEmail("rafael@");
        obj.setCpf(123);
        obj.setEndereco("rua1");
        obj.setNascimento("01/01/1991");
        obj.setCarteiraDeTrabalho(123);
        obj.setSalarioFixo(10.10);
        
        instance.insert(obj);
        
        Pessoa pessoaTest = instance.findbyID(obj.getId());
        
        Assert.assertEquals(obj.getTipo(), pessoaTest.getTipo());
        Assert.assertEquals(obj.getNome(), pessoaTest.getNome());
        Assert.assertEquals(obj.getEmail(), pessoaTest.getEmail());
        Assert.assertEquals(obj.getCpf(), pessoaTest.getCpf());
        Assert.assertEquals(obj.getEndereco(), pessoaTest.getEndereco());
        Assert.assertEquals(obj.getNascimento(), pessoaTest.getNascimento());
        Assert.assertEquals(obj.getSalarioFixo(), pessoaTest.getSalarioFixo(),0);
        Assert.assertEquals(obj.getCarteiraDeTrabalho(), pessoaTest.getCarteiraDeTrabalho());

    }

    /**
     * Test of findAll method, of class PessoaDAO.
     */
    @Test
    public void testFindAll() throws Exception {
        obj = new PessoaPrototipo(Pessoa.Tipo.CLIENTE);
        obj.setNome("rafael");
        obj.setEmail("rafael@");
        obj.setCpf(123);
        obj.setEndereco("rua1");
        obj.setNascimento("01/01/1991");
        
        instance.insert(obj);
        
        obj = new PessoaPrototipo(Pessoa.Tipo.GERENTE);
        obj.setNome("rafael2");
        obj.setEmail("rafael2@");
        obj.setCpf(1232);
        obj.setEndereco("rua12");
        obj.setNascimento("01/01/1992");
        
        instance.insert(obj);
        
        List<Pessoa> result = instance.findAll();
        
        Assert.assertNotNull(result);
	Assert.assertNotSame(0, result.size());
        Assert.assertEquals(2, result.size());
    }
    
}
