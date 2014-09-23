package repositorioCustomer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import ecomerce.Account;

public class AccountDAO extends ConexaoJDBC {

	Connection conn = null;
	PreparedStatement pstmt = null;
	int res;
	ResultSet rs = null;

	public boolean registerAccount(Account account) {

		try {

			obterConexao();

			pstmt = conn
					.prepareStatement("insert into Account (acct_id,username,password_account)values (?,?,?)");

			pstmt.setInt(1, account.getIdAccount());
			pstmt.setString(2, account.getUserName());
			pstmt.setString(3, account.getPassword());

			res = pstmt.executeUpdate();
			conn.commit();

		} catch (Exception e) {

		}
		if (res == 1) {

			System.out.println("inserido com SUCESSO !");
			return true;
		}
		return false;
	}

	public Account searchAccount(int idAccount) {
		Account account = null;

		try {
			pstmt = conn.prepareStatement("select * from Account where id = ?");

			pstmt.setInt(1, idAccount);

			rs = pstmt.executeQuery();

			if (rs.next()) {

				account = new Account();

				account.setIdAccount(rs.getInt("acct_id"));
				account.setUserName(rs.getString("username"));
				account.setPassword(rs.getString("password_account"));

			} else {
			}
		} catch (Exception e) {

		}
		return account;
	}

}
