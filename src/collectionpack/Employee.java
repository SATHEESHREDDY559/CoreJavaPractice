package collectionpack;

public class Employee implements Comparable<Employee> {
 private int empid;
 private String empName;
 public Employee(){
	 
 }
 public Employee(String empName, int empid)
 {
	 this.empName=empName;
	 this.empid=empid;
	 
 }
   
	@Override
	public int compareTo(Employee e) {
		return (this.empName.compareTo(e.empName));
		/*if(this.empid<=e.empid)
			return -2000;
		else
			return 3585;*/
		
	}
	public boolean equals(Object o){
		Employee id=(Employee)o;
		return (this.empid)==(id.empid);
	}
	@Override
	public String toString()
	{
		return empName+":"+empid;
		
	}

}
