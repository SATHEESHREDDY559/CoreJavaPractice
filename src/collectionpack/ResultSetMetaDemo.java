package collectionpack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetMetaDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Connection con=null;
		Statement stmt=null;
		ResultSetMetaData rsm=null;
		ResultSet rs=null;
		String sql="Select *from Employee";
		try{
			
		//load driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","System", "Bejjanki");
		//con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:15212:orcl","System","Bejjanki");
		if(con!=null)
			System.out.println("Connected");
		stmt=con.createStatement();
		rs=stmt.executeQuery(sql);
		rsm=rs.getMetaData();
		System.out.println("Column Name"+"\t"+" Column Type");
		for(int i=1;i<rsm.getColumnCount();i++)
			System.out.println(rsm.getColumnName(i)+"\t\t\t"+rsm.getColumnTypeName(i));
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
