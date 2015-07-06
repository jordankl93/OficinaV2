/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.poo2.oficinamecanica.cgt;

import br.ifes.poo2.oficinamecanica.cdp.Pessoa;
import br.ifes.poo2.oficinamecanica.cdp.PessoaPrototipo;
import br.ifes.poo2.oficinamecanica.cdp.Venda;
import br.ifes.poo2.oficinamecanica.cgd.DAO;
import br.ifes.poo2.oficinamecanica.cgd.PessoaDAO;
import br.ifes.poo2.oficinamecanica.cih.VendaEstatico;
import br.ifes.poo2.oficinamecanica.exceptions.TipoPessoaIncorretoException;
import java.sql.SQLException;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author RafaelBroedel
 */
public class AplCriarVendaTest {
    AplCriarVenda instance;
    Pessoa pessoa;
    
    @Before
    public void setUp() throws TipoPessoaIncorretoException, SQLException, ClassNotFoundException {
        instance = new AplCriarVenda();
        
        
        pessoa = new PessoaPrototipo(Pessoa.Tipo.VENDEDOR);
        pessoa.setCarteiraDeTrabalho(123);
        pessoa.setCpf(123);
        pessoa.setEmail("vendedor@");
        pessoa.setEndereco("rua1");
        pessoa.setNascimento("01/01/01");
        pessoa.setNome("Paulo");
        pessoa.setSalarioFixo(1000.00);
        
        DAO dao = new PessoaDAO();
        dao.criarTabela();
        dao.insert(pessoa);
    }

    /**
     * Test of criarServico method, of class AplCriarVenda.
     */
    @Test
    public void testCriarServico() throws Exception {
        VendaEstatico.setDescricao("alinhamento");
        VendaEstatico.setQuantidade(2);
        VendaEstatico.setValorUnitario(100.10);
        VendaEstatico.setStatus(VendaEstatico.Status.ABERTO);
        System.out.println(pessoa.getId());
        VendaEstatico.setIdVendedor(pessoa.getId());
        
        Venda result = instance.criarServico();
        assertEquals(VendaEstatico.getDescricao(), result.getDescricao());
        assertEquals(VendaEstatico.getQuantidade(), result.getQuantidade());
        assertEquals(VendaEstatico.getValorUnitario(), result.getValorUnitario());
        assertEquals(Venda.Status.ABERTO, result.getStatus());
        assertEquals(200.20, result.getValorTotal(),0);
        assertNotNull(result.getVendedor());
        assertEquals("Paulo", result.getVendedor().getNome());
    }

    /**
     * Test of criarProduto method, of class AplCriarVenda.
     */
    @Test
    public void testCriarProduto() throws Exception {
        VendaEstatico.setDescricao("pneu");
        VendaEstatico.setQuantidade(2);
        VendaEstatico.setValorUnitario(100.10);
        VendaEstatico.setStatus(VendaEstatico.Status.INSTALADO);
        VendaEstatico.setIdVendedor(pessoa.getId());
        
        Venda result = instance.criarProduto();
        assertEquals(VendaEstatico.getDescricao(), result.getDescricao());
        assertEquals(VendaEstatico.getQuantidade(), result.getQuantidade());
        assertEquals(VendaEstatico.getValorUnitario(), result.getValorUnitario());
        assertEquals(Venda.Status.INSTALADO, result.getStatus());
        assertEquals(200.20, result.getValorTotal(),0);
        assertNotNull(result.getVendedor());
        assertEquals("Paulo", result.getVendedor().getNome());
    }
    
}
