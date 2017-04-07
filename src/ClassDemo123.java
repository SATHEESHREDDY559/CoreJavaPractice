import java.io.IOException;

public class ClassDemo123
{
    public static void main(String[] args) throws Exception
    {
        Runtime runtime = Runtime.getRuntime();     //getting Runtime object
 
        String[] s = new String[] {"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe", "http://javaconceptoftheday.com/"};
 
        try
        {
          Process p=  runtime.exec(s);        //opens "http://javaconceptoftheday.com/" in chrome browser
        Thread.sleep(50000);
        p.destroy();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}