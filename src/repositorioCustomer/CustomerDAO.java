package repositorioCustomer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import ecomerce.Customer;

public class CustomerDAO extends ConexaoJDBC {

	Connection conn = null;
	PreparedStatement pstmt = null;
	int res;
	ResultSet rs;

	public boolean registerCostumer(Customer customer) {

		try {
			conn = obterConexao();

			pstmt = conn
					.prepareStatement("insert into Customer(first_name,last_name,email_address,type_customer,discount,acct_id_fk) values (?,?,?,?,?,?)");
			pstmt.setString(1, customer.getFirstName());
			pstmt.setString(2, customer.getLastName());
			pstmt.setString(3, customer.getEmailAddress());
			pstmt.setInt(4, customer.getCustomerType());
			pstmt.setDouble(5, customer.getDiscount());
			pstmt.setInt(6, customer.getIdAccountFK());

			res = pstmt.executeUpdate();
			conn.commit();

		} catch (Exception e) {

		}
		if (res == 1) {
			System.out.println("Inserido com SUCESSO!");
			return true;
		}
		return false;
	}

	public Customer searchCustomer(int idCustomer) {

		Customer customer = null;
		try {

			pstmt = conn
					.prepareStatement("select * from Customer where id = ?");
			pstmt.setInt(1, idCustomer);
			rs = pstmt.executeQuery();
			if (rs.next()) {

				customer = new Customer();

				customer.setFirstName(rs.getString("first_name"));
				customer.setLastName(rs.getString("last_name"));
				customer.setEmailAddress(rs.getString("email_address"));
				customer.setCustomerType(rs.getInt("type_customer"));
				customer.setDiscount(rs.getDouble("discount"));
				customer.setIdAccountFK(rs.getInt("acct_id_fk"));
				
				
			} else {}

		} catch (Exception e) {

		}
		return customer ;
		
	}

}
