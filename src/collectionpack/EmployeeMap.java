package collectionpack;

public class EmployeeMap implements Comparable<EmployeeMap> {
 private int empid;
 private String empName;
 public EmployeeMap(){
	 
 }
 public EmployeeMap(String empName, int empid)
 {
	 this.empName=empName;
	 this.empid=empid;
	 
 }
   
	@Override
	public int compareTo(EmployeeMap e) {
		return (this.empName.compareTo(e.empName));
		/*if(this.empid<=e.empid)
			return -2000;
		else
			return 3585;*/
		
	}
	public boolean equals(Object o){
		EmployeeMap id=(EmployeeMap)o;
		return (this.empid)==(id.empid);
	}
	@Override
	public String toString()
	{
		return empName+":"+empid;
		
	}

}
