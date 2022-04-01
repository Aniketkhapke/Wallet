package Jdbcon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;
import java.util.Scanner;

import com.mysql.cj.protocol.Resultset;


public class Insertdats  {
	static int wallwtId,bal,withdrow,deposit;
	static String fname,lname,address,gender,dob;
	public static void main(String[] args) throws SQLException {
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/banking","root","aniket123anni");
		PreparedStatement ps=con.prepareStatement("insert into wallet values(?,?,?,?,?,?,?,?,?)");
		
		Insertdats ob=new Insertdats();
		ob.ins();
		ps.setInt(1,wallwtId);
		ps.setString(2,fname);
		ps.setString(3,lname);
		ps.setString(4,address);
		ps.setInt(5,bal);
		ps.setInt(6,withdrow);
		ps.setInt(7,deposit);
		ps.setString(8,gender);
		ps.setString(9,dob);
		
		ps.executeUpdate();
		con.close();
		
	}
			private void ins() {
				
				try (Scanner sc = new Scanner(System.in)) {
					System.out.println("Enter WalletId");
					wallwtId=sc.nextInt();
					System.out.println("Enter fName");
					fname=sc.next();
					System.out.println("Enter lname");
					lname=sc.next();
					System.out.println("Change address");
					address=sc.next();
					System.out.println("total balance bal");
					bal=sc.nextInt();
					System.out.println("Withdrow Amount");
					withdrow=sc.nextInt();
					System.out.println("deposit Amount");
					deposit=sc.nextInt();
					System.out.println("Gender");
					gender=sc.next();
					System.out.println("DOB");
					dob=sc.next();
				}
				
	}
			void display() throws SQLException {
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/banking","root","aniket123anni");
				Statement st=con.createStatement();
				ResultSet rs=st.executeQuery("select*from wallet;");
				while( rs.next()) {
					System.out.println(rs.getInt(1)+""+rs.getString(2)+""+rs.getString(3)+""+rs.getString(4)+""+rs.getInt(5)+""+rs.getInt(6)+""+rs.getInt(7)+""+rs.getString(8)+""+rs.getString(9));
					
				}
						
				con.close();
			}
	}


	


