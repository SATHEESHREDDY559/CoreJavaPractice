package collectionpack;

import java.util.Hashtable;

class Temp{
	private int i;

	Temp(int i){
		this.i=i;
		}
public int hashCode(){
	i=(i%9);
	return i;
}
public String toString(){
	return i+"";
}
}



public class HashTableDemo {	

	public static void main(String[] args) {
		// TODO Auto-generated method stu,b
		Hashtable<Temp, Integer> ht= new Hashtable<Temp,Integer>();
		Temp t1=new Temp(23);
		Temp t2= new Temp(24);
		Temp t3= new Temp(25);
		
		ht.put(t1,11);
		ht.put(t2,22);
		ht.put(t3,44);
	System.out.println(ht);
		

	}

}
