/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.poo2.oficinamecanica.cgt;

import br.ifes.poo2.oficinamecanica.cdp.FuncionarioAbstract;
import br.ifes.poo2.oficinamecanica.cdp.Pessoa;
import br.ifes.poo2.oficinamecanica.cdp.PessoaAbstract;
import br.ifes.poo2.oficinamecanica.util.ClienteModelo;
import br.ifes.poo2.oficinamecanica.util.FuncionarioModelo;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author RafaelBroedel
 */
public class AplCriarPessoaTest {
    AplCriarPessoa instance;

    @Before
    public void setUp() {
        instance = new AplCriarPessoa();
    }

    /**
     * Test of criarCliente method, of class AplCriarPessoa.
     */
    @Test
    public void testCriarCliente() {
        ClienteModelo.setNome("Rafael");
        ClienteModelo.setCpf(123);
        ClienteModelo.setDataDeNascimento("02/09/1992");
        ClienteModelo.setEmail("rafael@");

        PessoaAbstract result = (PessoaAbstract) instance.criarCliente();
        
        assertEquals(ClienteModelo.getNome(), result.getNome());
        assertEquals(ClienteModelo.getCpf(), result.getCpf());
        assertEquals(ClienteModelo.getDataDeNascimento(), result.getDataDeNascimento());
        assertEquals(ClienteModelo.getEmail(), result.getEmail());
    }

    /**
     * Test of criarVendedor method, of class AplCriarPessoa.
     */
    @Test
    public void testCriarVendedor() {
        FuncionarioModelo.setNome("Kamila");
        FuncionarioModelo.setCpf(456);
        FuncionarioModelo.setDataDeNascimento("12/19/1991");
        FuncionarioModelo.setEmail("kamila@");
        FuncionarioModelo.setCarteiraDeTrabalho(123);
        FuncionarioModelo.setSalarioFixo(1000);

        FuncionarioAbstract result = (FuncionarioAbstract) instance.criarVendedor();
        
        assertEquals(FuncionarioModelo.getNome(), result.getNome());
        assertEquals(FuncionarioModelo.getCpf(), result.getCpf());
        assertEquals(FuncionarioModelo.getDataDeNascimento(), result.getDataDeNascimento());
        assertEquals(FuncionarioModelo.getEmail(), result.getEmail());
        assertEquals(FuncionarioModelo.getCarteiraDeTrabalho(), result.getCarteiraDeTrabalho());
        assertEquals(FuncionarioModelo.getSalarioFixo(), result.getSalarioFixo(),1); //delta?
    }

    /**
     * Test of criarGerente method, of class AplCriarPessoa.
     */
    @Test
    public void testCriarGerente() {
        FuncionarioModelo.setNome("Chiara");
        FuncionarioModelo.setCpf(789);
        FuncionarioModelo.setDataDeNascimento("22/10/1911");
        FuncionarioModelo.setEmail("chiara@");
        FuncionarioModelo.setCarteiraDeTrabalho(456);
        FuncionarioModelo.setSalarioFixo(2200.10);

        FuncionarioAbstract result = (FuncionarioAbstract) instance.criarGerente();
        
        assertEquals(FuncionarioModelo.getNome(), result.getNome());
        assertEquals(FuncionarioModelo.getCpf(), result.getCpf());
        assertEquals(FuncionarioModelo.getDataDeNascimento(), result.getDataDeNascimento());
        assertEquals(FuncionarioModelo.getEmail(), result.getEmail());
        assertEquals(FuncionarioModelo.getCarteiraDeTrabalho(), result.getCarteiraDeTrabalho());
        assertEquals(FuncionarioModelo.getSalarioFixo(), result.getSalarioFixo(),1); //delta?
    }
    
}
