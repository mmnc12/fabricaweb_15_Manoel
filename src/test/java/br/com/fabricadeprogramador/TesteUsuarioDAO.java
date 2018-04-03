package br.com.fabricadeprogramador;

import br.com.fabricadeprogramador.persistencia.Usuario;
import br.com.fabricadeprogramador.persistencia.jdbc.UsuarioDAO;

public class TesteUsuarioDAO {
	
	public static void main(String[] args) {
		
		//testeCadastar();
		//testeAlterar();
		testeDeletar();
	}
	
	public static void testeCadastar() {
		Usuario usu = new Usuario();
		usu.setNome("Maria");
		usu.setLogin("mar");
		usu.setSenha("321");
		
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.cadastrar(usu);
		
		System.out.println("Cadastrado com sucesso!");
		
	}
	
	public static void testeAlterar() {
		Usuario usu = new Usuario();
		usu.setId(4);
		usu.setNome("Maria da Silva");
		usu.setLogin("mar");
		usu.setSenha("321");
		
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.alterar(usu);
		
		System.out.println("Alteração realizada com sucesso!");
	}
	
	public static void testeDeletar() {
		Usuario usu = new Usuario();
		usu.setId(5);
		
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.deletar(usu);
		
		System.out.println("Registro deletado com sucesso!");
	}

}
