package collectionpack;
import java.sql.*;
import java.util.Scanner;
public class PreparedStmtDemo {
	public static void main(String arg[]) throws SQLException
	{
		Connection con=null;
		PreparedStatement ps=null;
		
		try{
			System.out.println("loadedddddddddddd");
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","Bejjanki");
			con.setAutoCommit(false);
			System.out.println("connecteddd.........");
			ps=con.prepareStatement("insert into Employee values(?,?,?)");
			@SuppressWarnings("resource")
			Scanner sc= new Scanner(System.in);
			System.out.println("enter id");
			int empid=sc.nextInt();
			System.out.println("enter name");
			String EmpName=sc.next();
			System.out.println("salary");
			int salary=sc.nextInt();
			ps.setInt(1, empid);
			ps.setString(2, EmpName);
			ps.setInt(3, salary);
			int ii=ps.executeUpdate();
			if(ii!=0){
				System.out.println("Inserted,,,,,,,,,,,,,,,,,,,,,,,");
			}
			
			
		}
		catch(Exception e)
		{
			
		}
		finally{
			//rs.close();
			con.commit();
			ps.close();
			con.close();
			//sc.close();
			
		}
	}

}
