package ncu.MavenSpringProgram4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.stereotype.Component;

@Component("fileRead")
public class FileRead{
	ArrayList<String> list;
	File file;
	FileRead() throws IOException{
		file = new File("./src/main/resources/fileRead.txt");
		checkFileExists();
		list = new ArrayList<>();
	}
	public ArrayList<String> dataFile()throws FileNotFoundException{
		
		Scanner myReader = new Scanner(file);
	      while (myReader.hasNextLine()) {
	        String data = myReader.nextLine();
	        list.add(data);
	      }
	      myReader.close();
		return list;
	}
	public boolean checkFileExists() throws IOException {
		if (file.createNewFile()) {
	        System.out.println("File created: " + file.getName());
	        return true;
	      } else {
	        System.out.println("File already exists.");
	        return false;
	      }
	}
	public static void main(String[] args) throws IOException {
		FileRead fileRead = new FileRead();
	}
}
