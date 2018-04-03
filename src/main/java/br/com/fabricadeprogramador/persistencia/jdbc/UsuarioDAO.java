package br.com.fabricadeprogramador.persistencia.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fabricadeprogramador.persistencia.Usuario;

public class UsuarioDAO {
	
	Connection con = ConexaoFactory.getConnection();

	public void cadastrar(Usuario usu) {
		
		String sql = "insert into usuario (nome, login, senha) values (?, ?, ?)";
		
		try (PreparedStatement conect = con.prepareStatement(sql)) {
			conect.setString(1, usu.getNome());
			conect.setString(2, usu.getLogin());
			conect.setString(3, usu.getSenha());
			conect.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void alterar(Usuario usu) {

		String sql = "update usuario set nome = ?, login = ?, senha = ? where id = ?";
		
		try (PreparedStatement conect = con.prepareStatement(sql)) {
			conect.setString(1, usu.getNome());
			conect.setString(2, usu.getLogin());
			conect.setString(3, usu.getSenha());
			conect.setInt(4, usu.getId());
			conect.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void deletar(Usuario usu) {
		
		String sql = "delete from usuario where id = ?";
		
		try (PreparedStatement conect = con.prepareStatement(sql)) {
			conect.setInt(1, usu.getId());;
			conect.execute();
			
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	

}
