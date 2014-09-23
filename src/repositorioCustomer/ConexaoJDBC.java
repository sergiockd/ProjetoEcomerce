package repositorioCustomer;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoJDBC {


		protected static final String url_conexao = "jdbc:mysql://localhost/LojaOnline";
		protected static final String user = "root";
		protected static final String password = "abcd1234";
		protected static final String nome_driver = "com.mysql.jdbc.Driver";

		protected ConexaoJDBC() {

			try {

				Class.forName(nome_driver);

			} catch (Exception e) {
			
			}

		}

		protected Connection obterConexao() throws SQLException {
			return DriverManager.getConnection(url_conexao, user, password);
		}


}