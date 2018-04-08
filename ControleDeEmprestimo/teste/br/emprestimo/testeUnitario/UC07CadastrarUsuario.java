package br.emprestimo.testeUnitario;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import br.emprestimo.modelo.Livro;
import br.emprestimo.modelo.Usuario;

public class UC07CadastrarUsuario {
	public static Usuario usuario;
	public static Usuario usuario2;
	public static Livro usuario3;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		usuario = new Usuario();
		usuario.setNome("Ezequiel");
		usuario.setRa("1610554");
		usuario2 = new Usuario();
		usuario2.setNome("Ezequiel");
		usuario2.setRa("1610554");
		usuario3 = new Livro();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test(expected = RuntimeException.class)
	public void CT02UC06CadastrarUsuario_com_Nome_invalido() {
		usuario.setNome(null);
	}
	
	@Test
	public void CT03UC7CadastrarUsuario_com_Nome_valido() {
		assertEquals("Ezequiel", usuario.getNome());
	}
	
	@Test
	public void CT03UC07CadastrarUsuario_com_RA_valido() {
		assertEquals("1610554", usuario.getRa());
	}

	@Test
	public void CT03UC7CadastrarUsuario_com_Obj_valido() {
		assertTrue(usuario.equals(usuario));
	}
	@Test
	public void CT03UC7CadastrarUsuario_com_Obj_invalido() {
		assertFalse(usuario.equals(null));
	}
	@Test
	public void CT03UC7CadastrarUsuario_com_Obj_invalidClass() {
		assertFalse(usuario.equals(usuario3.getClass()));
	}
	@Test
	public void CT03UC7CadastrarUsuario_com_Obj_igual() {
		assertTrue(usuario.equals(usuario2));
	}

}
