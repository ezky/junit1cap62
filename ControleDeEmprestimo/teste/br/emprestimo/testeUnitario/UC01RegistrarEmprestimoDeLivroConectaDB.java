package br.emprestimo.testeUnitario;

import static org.junit.Assert.*;
import org.junit.Test;
import br.emprestimo.servico.ConectaDB;

public class UC01RegistrarEmprestimoDeLivroConectaDB {

	@Test
	public void conexaoComSucesso() {
		//cenario
		String url = "jdbc:mysql://localhost:3306/biblioteca";
		String driver = "com.mysql.jdbc.Driver";
		String usuario = "root";
		String senha = "alunofatec";
		//a��o
		ConectaDB conectaDB = new ConectaDB(driver,url,usuario,senha);
		conectaDB.getConection();
		//Verifica��o
		assertNotNull(conectaDB.getConection());
	}

}
