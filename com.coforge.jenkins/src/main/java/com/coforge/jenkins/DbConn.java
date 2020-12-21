package com.coforge.jenkins;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.Statement;
	public class DbConn {

		public static void main(String args[]) {
			Connection con;
			Statement st=null;
			try {
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/car","root","varsha");
			    st=con.createStatement();
			    String sql="select id,model from cars";
			    ResultSet rs=st.executeQuery(sql);
			    while(rs.next()) {
			    	System.out.println(rs.getString(1)+" "+rs.getString(2));
			    }
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

