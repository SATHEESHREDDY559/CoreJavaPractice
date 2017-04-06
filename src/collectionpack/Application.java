package collectionpack;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Application {
	private static final String deleteStudent = "Delete student2 where id=?";
	private static final String updateStudent = "update student2 set name=?, age=? where id=?";
	private static final String selectStudent = "select * from student2 where id=";
	private static final String createStudent = "insert into student2(id, name, age) values(?,?,?)";
	private static final String generatePrimaryKey = "select Max(id) from student2";
	int accountNumber132_$;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//creating student obj and setting the studnetid
		Student st= new Student();
		st.setStudentName("satheesh");
		st.setAge(27);
		//inserting student object and getting the studentid
		System.out.println("create student");
		long studentId= createStudent(st);
		System.out.println(studentId);
		System.out.println("Generate123 ");
		System.out.println("Generats");
		System.out.println("Generate");
		Student student=getStudent(12);
		System.out.println(student);
	}
	private static Student getStudent(int i) {
		// TODO Auto-generated method stub
		Student st=null;
				try{
				System.out.println("Student Details");
				Connection con = DBUtil.getConnection();
				st= new Student();;
				Statement stmt=con.createStatement();
				DBUtil.beginTransaction();
				ResultSet rs =  stmt.executeQuery(selectStudent+i);
				if (rs.next()) {
					st.setStudentId(rs.getLong(1));
					st.setStudentName(rs.getString(2));
					st.setAge(rs.getInt(3));	
					DBUtil.commit();
				}
				else{
					DBUtil.rollBack();
				}
				DBUtil.closeDBUtil(null, stmt, con);
				}
				catch(Exception ex){
					ex.printStackTrace();
				}
				return st;
	}
	private static long createStudent(Student st)throws Exception{
		
		// TODO Auto-generated method stub
		long studentId = generateStudentId()+1;
		System.out.println(studentId);
		Connection con = DBUtil.getConnection();
		PreparedStatement ps= con.prepareStatement(createStudent);
		ps.setLong(1,studentId);
		ps.setString(2, st.getStudentName());
		ps.setInt(3, st.getAge());
		
		DBUtil.beginTransaction();  
		int  result =  ps.executeUpdate();
		if(result!=0){
			DBUtil.commit();
		}
		else{
			DBUtil.rollBack();
		}
		DBUtil.closeDBUtil(null, ps, con);
		return studentId;
	}
	private static int generateStudentId() {
		Connection con= null;
		Statement stmt =  null;
		int i=0;
		ResultSet rs= null;
		try{
			con= DBUtil.getConnection();
			stmt = con.createStatement();
			rs= stmt.executeQuery(generatePrimaryKey);
			while (rs.next()) {
				i=rs.getInt(1);
				
			}
		}catch(SQLException ex){
			ex.printStackTrace();
			
		}
		// TODO Auto-generated method stub
		return i;
	}

}
