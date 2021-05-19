package br.com.jdbc.testes;

import br.com.jdbc.dao.UsuarioDao;
import br.com.jdbc.negocio.Usuario;

public class UsuarioTeste {

	public static void main(String[] args) {
		
		Usuario usuario = new Usuario("pedro@paulo.com", "123");
		System.out.println(usuario);
		
		UsuarioDao.incluir(usuario);
		
		System.out.println("Inclusão realizada com sucesso: " + usuario);		
	}
}
