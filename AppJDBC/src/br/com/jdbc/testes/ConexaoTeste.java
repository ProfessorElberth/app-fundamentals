package br.com.jdbc.testes;

import br.com.jdbc.conexao.Conexao;

public class ConexaoTeste {

	public static void main(String[] args) {

		if(Conexao.obterConexao() != null) {
			System.out.println("Conexão realizada com sucesso!");
		} else {
			System.err.println("Impossível se conectar!");
		}
	}
}