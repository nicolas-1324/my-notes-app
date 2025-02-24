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

		System.out.print("Do you want to make a new note or read/write to an existing one [new/read/write]:");
		String izbira = vhodText.readLine();
		int st_note;
		switch(izbira){
			case "new":
				System.out.println("Vnesi niz/note:");
				String vnesenNiz = vhodText.readLine();

				System.out.println("Vnesi mesto na katerega ga hoces shranit:");
				st_note = in.nextInt();
				Notes note = new Notes(vnesenNiz, st_note);
				break;
			case "edit":
				System.out.println("Which file do you want to edit");
				break;
			case "read":
				System.out.println("Which file do you want to read");
				st_note = in.nextInt();
				note.izpis(st_note);
				break;
			default:
				System.out.println("Vnesel veljaven vnos!");
		}
	}
}
