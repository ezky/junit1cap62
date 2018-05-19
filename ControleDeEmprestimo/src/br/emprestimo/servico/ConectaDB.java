package br.emprestimo.servico;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.CommunicationsException;
import com.mysql.jdbc.Connection;

public class ConectaDB {
	String url = "jdbc:mysql:localhost:3306/biblioteca";
	String driver = "com.mysql.jdbc.Driver";
	String usuario = "root";
	String senha = "alunofatec";

	public ConectaDB(String driver, String url, String usuario, String senha){
		this.driver = driver;
		this.url = url;
		this.usuario = usuario;
		this.senha = senha;
	}
	
	public Object getConection() {
		try {
			Class.forName(driver);
			return (Connection) DriverManager.getConnection(url,usuario,senha);
		} catch (CommunicationsException | ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
