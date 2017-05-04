package Arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
 
public class ArrayToArrayListExample 
{      
    public static void main(String[] args) 
    {    
        //String[] array = new String[] {"ANDROID", "JSP", "JAVA", "STRUTS", "HADOOP", "JSF"};
         int array[]={1,2};
       
         
        
        List<Integer> list = IntStream.of(array).boxed().collect(Collectors.toList());
       
         
        System.out.println(list);
    }    
}