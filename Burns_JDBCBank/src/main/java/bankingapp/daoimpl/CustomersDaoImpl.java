package bankingapp.daoimpl;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import bankingapp.beans.Customer;
import bankingapp.dao.CustomersDao;

import bankingapp.util.ConnFactory;


public class CustomersDaoImpl implements CustomersDao {

		public static ConnFactory cf = ConnFactory.getInstance();

	
public Customer getbyUserName(String usern) throws SQLException {
		
		Connection con = cf.getConnection();
		
		String sql="select * from \"customers\" where \"username\"=?";
		PreparedStatement ps =con.prepareStatement(sql);
		ps.setString(1, usern);
		ResultSet rs = ps.executeQuery();
		
		Customer cust =null;
		while(rs.next()) {
			
			cust = new Customer(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),
					rs.getInt(5),rs.getDouble(6),rs.getString(7),rs.getString(8));
			
		}
		return cust;
		
	}
	

	
	public void incomingNew(String firstName,String lastName,String userName, String password, String email, double balance) throws SQLException {
		
		Connection con = cf.getConnection();
		String sql = "insert into \"customers\"(\"first_name\",\"email\",\"username\",\"balance\",\"last_name\",\"app_approval\")values(?,?,?,?,?,false)";
		
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setString(1, firstName);
		ps.setString(5, lastName);
		ps.setString(3, userName);
		ps.setString(2, email);
		ps.setDouble(4, balance);
		ps.executeUpdate();
	}


	public Customer getAccountInfo() throws SQLException {
			Connection con = cf.getConnection();
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from \"customers\"");
		Customer cust =null;
		while(rs.next()) {
			
			cust = new Customer(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),
					rs.getInt(5),rs.getDouble(6),rs.getString(7),rs.getString(8));
			
		}
		
		return cust;
	}



	public void depositMoney(double increase, int ac) throws SQLException {
		Connection con= cf.getConnection();
		String sql="update \"customers\" set \"balance\"= \"balance\" +? where \"account_number\"=?";
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setDouble(1, increase);
		ps.setInt(2, ac);
		ps.executeUpdate();
		
	}



	
	public void withdarwMoney(double decrease, int account) throws SQLException {
		Connection con= cf.getConnection();
		String sql="update \"customers\" set \"balance\"= \"balance\" -? where \"account_number\"=?";
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setDouble(1, decrease);
		ps.setInt(2, account);
		ps.executeUpdate();
		
	}
	
	public void delete(int accountNumb) throws SQLException {
		Connection con= cf.getConnection();
		String sql="delete from \"customers\" where \"account_number\"=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, accountNumb);
		ps.executeUpdate();
		
	}
	
	
}


																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																										
