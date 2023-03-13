import java.io.*;
import java.util.*;
class FileRW{
	public static void main(String args[]){
		System.out.println("creating a file test.txt:");
		try{
		File f1 = new File("C:/Users/madhu/OneDrive/Desktop/NucleusTeq/week5/test.txt");
		if(f1.createNewFile()){
			System.out.println("created");
		}
		else{
			System.out.println("file already exists");
		}
		}
		catch(Exception e){
			System.out.println(e);
		}
		System.out.println("writing file test.txt");
		try{
			FileWriter fw = new FileWriter("C:/Users/madhu/OneDrive/Desktop/NucleusTeq/week5/test.txt");
			fw.write("hii this is madhuri");
			fw.close();
			System.out.println("written successfully");
		}
		catch(IOException e){
			System.out.println("cant able to write");
		}
		System.out.println("reading file test.txt");
		try{
			File f1 = new File("C:/Users/madhu/OneDrive/Desktop/NucleusTeq/week5/test.txt");
			Scanner d = new Scanner(f1);
			while(d.hasNextLine()){
				String  file = d.nextLine();
				
				System.out.println(file);
			}
			d.close();
		}
		catch(FileNotFoundException e){
			System.out.println("file not found");
		}

	}
}