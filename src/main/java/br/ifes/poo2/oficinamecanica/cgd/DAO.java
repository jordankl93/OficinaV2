package br.ifes.poo2.oficinamecanica.cgd;

import java.sql.SQLException;
import java.util.List;

public interface DAO <T> {

	//T create();
	void insert ( T obj ) throws SQLException, ClassNotFoundException;
	void update ( T obj ) throws SQLException, ClassNotFoundException;
	void delete ( T obj ) throws SQLException, ClassNotFoundException;
	T findbyID  ( Long id ) throws SQLException, ClassNotFoundException;
	List<T> findAll() throws SQLException, ClassNotFoundException;
        void criarTabela()  throws ClassNotFoundException, SQLException;
}
