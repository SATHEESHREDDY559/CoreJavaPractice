
import java.util.ArrayList;
import java.util.Scanner;
/**
 * @author Satheesh
 
 * Anagrams.java
 *
 */
public class Anagrams {
	
	public static void main(String[] args) {
		//String input="listen,pot,part,opt,trap,silent,top,this,hello,hits,what,shit";
		System.out.println("Please enter the input:");
		System.out.println();
		Scanner inputScanner=new Scanner(System.in);
		String input=inputScanner.nextLine();
		//splitting the string in to array
		String[] inputarray=input.split(",");
		//iterating the array
		for(int i=0;i<inputarray.length;i++)
		{
			
			String element=inputarray[i];
			if(element.equals(""))
				continue;
			//converting the element into char array
			char[] elementarray=element.toCharArray();
			String innerElementMatchingList="";
			for(int j=i+1;j<inputarray.length;j++)
			{
				
				String innerelement=inputarray[j];
				//checking whether inner element size and element size is equal or not(i.e comparing the sizes of two elements)
				if(element.length()==innerelement.length())
				{
					//converting the inner element into list of characters
				char[] innerelementarray=innerelement.toCharArray();
				ArrayList<Character> innerelementcharacterlist=new ArrayList<Character>();
				for(Character cha:innerelementarray)
				{
					innerelementcharacterlist.add(cha);
				}
				boolean isCharacterNotExist=false;
				//checking whether the two elements are matching or not
				for(int k=0;k<elementarray.length;k++)
				{
					
					if(innerelementcharacterlist.contains(elementarray[k]))
					{
						innerelementcharacterlist.remove(new Character(elementarray[k]));
					}
					else
					{
						isCharacterNotExist=true;
						break;
					}
					//if two elements are matched replacing the 2nd element position with empty string
					if(!isCharacterNotExist)
					{
						inputarray[j]="";
					}
				}
				
				if(!(innerelementcharacterlist.size()>0))
				{
					innerElementMatchingList+=","+innerelement;
					
				}
				}
					
			}
			if(!innerElementMatchingList.equals(""))
			System.out.println("{"+element+innerElementMatchingList+"}");
		}
		inputScanner.close();
	}

}
