package collectionpack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcConnDemo {
	
	

	public static void main(String[] args)throws Exception{
		// TODO Auto-generated method stub
		Connection con=null;
		Statement stmt=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try{
		//Load drivers
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//Connection Estd
		 con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","System", "Bejjanki");
		if(con!=null)
			System.out.println("Connected............");
		 stmt =con.createStatement();
		 ps=con.prepareStatement("Update Employee set Salary=10000 where Empid=123");
		int ii=ps.executeUpdate();
		 System.out.println(ii);
		 if(ii!=0)
			 System.out.println("Updated");
	/*	 int i=stmt.executeUpdate("insert into Employee values(123,'Abc',12000)");
		 if(i!=0){
			 System.out.println("Inserted "+i);
		 }*/
		String query= "select * from Employee";
		rs=stmt.executeQuery(query);
		System.out.println(rs.next());
			while(rs.next()){
				/*System.out.println("hiiiiiiii");*/
				int EmpId=rs.getInt("EmpId");
				String EmpName=rs.getString("EmpName");
				int Salary = rs.getInt("salary");
				System.out.println("\t"+EmpId+"\t"+EmpName+"\t"+Salary);
			
			}
		
		

	}catch(SQLException e){
		e.printStackTrace();
	}
		finally{
			con.close();
			stmt.close();
			
			
		}
		
	}
	

}
