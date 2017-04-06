package collectionpack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil {
	private static Connection con;
	private static String username ="system";
	private static String password = "Bejjanki";
	private static String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	private static String driverclass = "oracle.jdbc.driver.OracleDriver";
	static {
		try{
			Class.forName(driverclass);
			
		}catch(ClassNotFoundException ex){
			ex.printStackTrace();
		}
	}
		
	public static  Connection getConnection() throws SQLException{
		return con=DriverManager.getConnection(url,username,password);
		}
	public static void beginTransaction(){
		if(con!=null){
			try{
				con.setAutoCommit(false);
			}catch(SQLException ex){
				ex.printStackTrace();
			}
		}
		
	}
	public static void commit(){
		if(con!=null){
			try{
				con.commit();
			}catch(SQLException ex){
				ex.printStackTrace();
			}
		}
	}
	public static void rollBack(){
		if(con!=null){
			try{
				con.rollback();
			}catch(SQLException ex){
				ex.printStackTrace();
			}
		}
	}
	public static void closeDBUtil(ResultSet rs, Statement stmt, Connection con){
		try{
			if(rs!=null){
				rs.close();
				rs=null;
			}
		}catch(SQLException ex){
			ex.printStackTrace();
		}
		try{
			if(stmt!=null){
				stmt.close();
				stmt=null;
			}
		}catch(SQLException ex){
			ex.printStackTrace();
		}
		
		try{
			if(con!=null){
				con.close();
				con=null;
			}
		}catch(SQLException ex){
			ex.printStackTrace();  
		}
		
	}
	
	}
