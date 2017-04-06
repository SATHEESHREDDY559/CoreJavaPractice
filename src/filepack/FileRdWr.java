package filepack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileRdWr {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f= new File("e:\\text.txt");
		FileReader fr= new FileReader(f);
		BufferedReader br= new BufferedReader(fr);
		
		FileWriter fw= new FileWriter(f,true);
		BufferedWriter bw= new BufferedWriter(fw);
	String s=br.readLine();
	while(s!=null){
		bw.write(s);
		bw.newLine();
		s=br.readLine();
	}
	br.close();
	bw.close();
	
	fw.close();
	fr.close();
		
		

	}

}
