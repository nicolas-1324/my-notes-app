import java.util.*;
import java.io.*;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.lang.StringBuffer;

public class MyNotes{
	public static void main(String[] args)throws IOException{
		BufferedReader vhodText = new BufferedReader(new InputStreamReader(System.in));
		Scanner in = new Scanner(System.in);

		System.out.print("Do you want to make a new note or write to an existing one [new/write]:");
		//Note note = new Note();	
		String izbira = vhodText.readLine();
		int st_note;
		switch(izbira){
			case "new":
				note = vhodText.readLine();
				
				break;
			case "write":
				System.out.println("To which file do you want to write");
				break;
			default:
				System.out.println("Vnesel veljaven vnos!");
		}
	}
}
