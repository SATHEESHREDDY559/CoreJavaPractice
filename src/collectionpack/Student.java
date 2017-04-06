package collectionpack;

import java.io.Serializable;

public class Student implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long studentId;
	private String studentName;
	private int age;
	public Student(long studentId, String studentName, int age){
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.age = age;
	}
	public Student(){
		super();
	}
	public long getStudentId() {
		return studentId;
	}
	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String toString(){
		return "Student [studentId= " +studentId+",studentName= "+ studentName+",age= "+age+"]";
	}
	
}
