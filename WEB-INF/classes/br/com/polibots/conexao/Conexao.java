package br.com.polibots.conexao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
	public static Connection abrirConexao()throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		return DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL","RM76413","161298");
	}
}