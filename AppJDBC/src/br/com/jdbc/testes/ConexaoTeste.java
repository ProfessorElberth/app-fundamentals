package br.com.jdbc.testes;

import br.com.jdbc.conexao.Conexao;

public class ConexaoTeste {

	public static void main(String[] args) {

		if(Conexao.obterConexao() != null) {
			System.out.println("Conex�o realizada com sucesso!");
		} else {
			System.err.println("Imposs�vel se conectar!");
		}
	}
}