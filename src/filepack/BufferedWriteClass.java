package filepack;
import java.io.*;
public class BufferedWriteClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f= new File("e:\\text.txt");
		FileWriter fw= new FileWriter(f,true);
		BufferedWriter bw= new BufferedWriter(fw);
		bw.write("Hello, ");
		
		bw.newLine();
		bw.write("How are you?");
		bw.newLine();
		bw.write("Hi, I'm good!!");
		bw.flush();
		bw.close();
		

	}

}
