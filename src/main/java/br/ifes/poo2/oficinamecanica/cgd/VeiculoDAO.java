/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.poo2.oficinamecanica.cgd;

import br.ifes.poo2.oficinamecanica.cdp.Veiculo;
import br.ifes.poo2.oficinamecanica.cdp.VeiculoPrototipo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

/**
 *
 * @author RafaelBroedel
 */
public class VeiculoDAO extends DAOGeneric implements DAO<Veiculo> {

        
	//CRIANDO A TABELA VEICULO
	public void criarTabela() throws ClassNotFoundException, SQLException
	{
		this.openConnection();
		
		this.execute("DROP TABLE IF EXISTS VEICULO");
		
		String sql = "CREATE TABLE VEICULO " +
					 " (ID INTEGER GENERATED BY DEFAULT AS IDENTITY "+
                     " (START WITH 1, INCREMENT BY 1) NOT NULL," +
					 " PLACA varchar(255) NOT NULL," +
					 " MODELO varchar(255) NOT NULL," +
					 " COR varchar(255) NOT NULL," +
					 " TIPO varchar(255) NOT NULL," +
					 " PRIMARY KEY (ID) )";
		
		this.execute(sql);
		
		this.closeConnection();
	}

        @Override
	public void insert(Veiculo obj) throws SQLException, ClassNotFoundException {
		
		this.openConnection();
		
		String sql = "INSERT INTO VEICULO (PLACA, MODELO, MODELO, TIPO)"
                        + "VALUES ('"+obj.getPlaca()+"',"
                        + "'"+obj.getModelo()+"',"
                        + "'"+obj.getCor()+"',"
                        + "'"+obj.getTipo().name()+"')";
		
		int id = this.executeUpdate(sql);
		
		obj.setId(id);
		
		this.closeConnection();
		
	}

        @Override
	public void update(Veiculo obj) throws SQLException, ClassNotFoundException {
		this.openConnection();
		
		String sql = "UPDATE VEICULO SET "
                        + "PLACA = '"+obj.getPlaca()
                        + "', MODELO = '"+obj.getModelo()
                        + "', COR = '"+obj.getCor()
                        + "', TIPO = '"+obj.getTipo().name()
                        + "' WHERE ID = " +obj.getId(); 
		
                this.executeUpdate(sql);
		
		this.closeConnection();
		
	}

        @Override
	public void delete(Veiculo obj) throws SQLException, ClassNotFoundException {
		this.openConnection();
		
		String sql = "DELETE FROM VEICULO WHERE ID = " +obj.getId(); 
		
                this.executeUpdate(sql);
		
		this.closeConnection();
		
	}

        @Override
	public Veiculo findbyID(Long id) throws ClassNotFoundException, SQLException {
		//Query para buscar o usuario
		this.openConnection();
		
		String sql = "SELECT * FROM VEICULO WHERE ID ="+id;
		
		ResultSet rs = this.executeQuery(sql);
		
		List<Veiculo> veiculos = retriveVeiculos(rs);
		
		this.closeConnection();
		if (veiculos.isEmpty()){
                        throw new EmptyStackException();
                }
                return veiculos.get(0);
	}
        @Override
	public List<Veiculo> findAll() throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		this.openConnection();
		
		String sql = "SELECT * FROM VEICULO ";
		
		ResultSet rs = this.executeQuery(sql);
		
		List<Veiculo> veiculos = retriveVeiculos(rs);
		
		this.closeConnection();
		
		return veiculos;
	}
	
	private List<Veiculo> retriveVeiculos(ResultSet rs) throws SQLException
	{
		List<Veiculo> veiculos = new ArrayList<Veiculo>();
		
		while (rs.next())
		{
                        String tipo = rs.getString("TIPO");
                        Veiculo veiculo = null;
                        
                        if(null != tipo)switch (tipo) {
                        case "CARRO":
                            veiculo = new VeiculoPrototipo(Veiculo.Tipo.CARRO);
                            break;
                        case "MOTO":
                            veiculo = new VeiculoPrototipo(Veiculo.Tipo.MOTO);
                            break;
                        case "CAMINHAO":
                            veiculo = new VeiculoPrototipo(Veiculo.Tipo.CAMINHAO);
                            break;
                        default:
                            
                            break;
                    }
			
			veiculo.setId(rs.getInt("ID"));
			veiculo.setPlaca(rs.getString("PLACA"));
                        veiculo.setModelo(rs.getString("MODELO"));
                        veiculo.setCor(rs.getString("COR"));
                        
			veiculos.add(veiculo);
		}
		
		return veiculos;
	}
}
