package Lambda;

public class Cal {

	public static void main(String[] args) {
		
		Calculator cal=s -> s.length();
		
		System.out.println(cal.sub("Hello,World!"));
		
		
		
		
		
		
		/*Calculator add=(int x, int y)->(x+y);
		Calculator sub=(int x, int y)->x-y;
		Calculator div=(int x, int y)->x/y;
		Calculator mul=(int x, int y)->x*y;
		System.out.println(""+add.add(2, 3));
		System.out.println(""+sub.sub(2, 3));
		System.out.println(""+div.div(2, 3));
		System.out.println(""+mul.mul(2, 3));*/
	}
	interface Calculator{
		/*int add(int x, int y);
		int sub(int x, int y);
		float div(int x, int y);
		double mul(int x, int y);*/
		int sub(String s);
		
	}
	
}
