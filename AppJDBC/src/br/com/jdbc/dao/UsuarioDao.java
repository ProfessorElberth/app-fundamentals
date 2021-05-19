package br.com.jdbc.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.jdbc.conexao.Conexao;
import br.com.jdbc.negocio.Usuario;

public class UsuarioDao {
	
	public static List<Usuario> obterLista(){
		
		List<Usuario> lista = new ArrayList<Usuario>();
		
		try {
			PreparedStatement ps = Conexao.obterConexao().prepareStatement("SELECT * FROM TUsuario ORDER BY email");
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				lista.add(new Usuario(rs.getString("email"), rs.getString("senha")));
			}
			
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		return lista;
	}

	public static boolean validar(Usuario usuario) {

		String sql = "SELECT * FROM TUsuario WHERE email = ? and senha = ?";
		
		try {
			PreparedStatement ps = Conexao.obterConexao().prepareStatement(sql);
			ps.setString(1, usuario.getEmail());
			ps.setString(2, usuario.getSenha());
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()){
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}
	
	public static boolean incluir(Usuario usuario) {
		
		try {
			PreparedStatement ps = Conexao.obterConexao().prepareStatement("INSERT INTO TUsuario (email, senha) VALUES (?,?)");
			ps.setString(1, usuario.getEmail());
			ps.setString(2, usuario.getSenha());
			ps.execute();
			
			return true;
			
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		return false;
	}
}