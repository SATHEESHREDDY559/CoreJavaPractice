package AmazonQ;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class StringReplaceInFile {
	public static void main(String[] args) {
		File log= new File("C:\\Users\\Satheesh Reddy\\workspace\\JavaProjectDemoSecond\\src\\AmazonQ\\log");
		String search = "a savings of X%";
		String replace = "(X% off)";

		try{
		    FileReader fr = new FileReader(log);
		    String s;
		    String totalStr = "";
		    try (BufferedReader br = new BufferedReader(fr)) {

		        while ((s = br.readLine()) != null) {
		            totalStr += s;
		        }
		        totalStr = totalStr.replaceAll(search, replace);
		        FileWriter fw = new FileWriter(log);
		    fw.write(totalStr);
		    fw.close();
		    }
		}catch(Exception e){
		    e.printStackTrace();
		}
	}

}
