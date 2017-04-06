package UserException;
class A extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	A(String msg){
		super(msg);
	}
	
}




public class ExceptionUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			throw new A("Exceptionafafaf");
			
		}catch (A e) {
			e.printStackTrace();
		}

	}

}
