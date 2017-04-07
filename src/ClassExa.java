
abstract class AAA{

	abstract void m();
	abstract void m(int i);
	void mm(){
		System.out.println("from  AAA ");
	}
}
class Bbb extends AAA{
	
	public void m(){
		System.out.println("from  BBB ");
	}
	public void m(int i){
		System.out.println("from  BBB "+i);
	}
	/*void mm(){
		System.out.println("from  xyz ");
	}*/
}
public class ClassExa {

	public static void main(String[] args) {
	Bbb b=new Bbb();
	b.m();
	b.m(2);
	b.mm();
	
	}

}

