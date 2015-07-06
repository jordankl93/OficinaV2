/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.poo2.oficinamecanica.util;

import br.ifes.poo2.oficinamecanica.cdp.Pessoa;
import br.ifes.poo2.oficinamecanica.cdp.PessoaPrototipo;
import br.ifes.poo2.oficinamecanica.exceptions.TipoVendaIncorretoException;
import br.ifes.poo2.oficinamecanica.cdp.Venda;
import br.ifes.poo2.oficinamecanica.cdp.VendaPrototipo;
import br.ifes.poo2.oficinamecanica.cgd.DAO;
import br.ifes.poo2.oficinamecanica.cgd.PessoaDAO;
import br.ifes.poo2.oficinamecanica.cih.VendaEstatico;
import java.sql.SQLException;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author RafaelBroedel
 */
public class FabricaVendaTest {
    private FabricaVenda instance;
    private Pessoa pessoa;
    
    @Before
    public void setUp() throws ClassNotFoundException, SQLException {
        instance = FabricaVenda.getInstancia();
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
        
        VendaEstatico.setDescricao("nomeServico");
        VendaEstatico.setQuantidade(2);
        VendaEstatico.setValorUnitario(100.10);
        VendaEstatico.setStatus(VendaEstatico.Status.ABERTO);
        System.out.println(pessoa.getId());
        VendaEstatico.setIdVendedor(pessoa.getId());
    }

    /**
     * Test of criar method, of class FabricaVenda.
     */
    @Test
    public void testCriarServico() throws Exception {
        String tipo = "servico";
        Venda expResult = new VendaPrototipo(Venda.Tipo.SERVICO);
        Venda result = instance.criar(tipo);
        assertEquals(expResult.getTipo(), result.getTipo());
        assertEquals(pessoa.getNome(), result.getVendedor().getNome());
    }
    
    @Test
    public void testCriarProduto() throws Exception {
        String tipo = "produto";
        Venda expResult = new VendaPrototipo(Venda.Tipo.PRODUTO);
        Venda result = instance.criar(tipo);
        assertEquals(expResult.getTipo(), result.getTipo());
        assertEquals(pessoa.getNome(), result.getVendedor().getNome());
    }
    
    @Test(expected = TipoVendaIncorretoException.class)
    public void testCriarComErro() throws Exception {
        String tipo = "xxx";

        new AssertionError(instance.criar(tipo));
    }
    
}
