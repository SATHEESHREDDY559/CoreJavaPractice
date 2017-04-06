package filepack;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileDemo {
public static void main(String arg[])throws Exception {
	File f = new File("e:\\text.txt");
	FileWriter fw = new FileWriter(f,true);
	fw.write("Hi, How are you ??");
	fw.write("hello, I'm Good!!");
	fw.write("How you doing??");
	fw.close();
	
FileReader fr= new FileReader(f);
int i=fr.read();
while (i!=-1) {
	System.out.println((char)i);
	i=fr.read();
}

}
}
