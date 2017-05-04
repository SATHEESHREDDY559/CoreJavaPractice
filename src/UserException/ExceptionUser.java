package UserException;

import java.io.File;

class A extends Throwable{
	
	A(String msg){
		super(msg);
		//new Exception(msg);
	}
	
}

public class ExceptionUser  {

	public static void main(String[] args)throws A {
		/*System.out.println(1/0);
		File f= new File("/ajflka");*/
		
		try{
			throw new A("Exceptionafafaf");
			//System.out.println(1/0);
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(1/0);
	}

}
