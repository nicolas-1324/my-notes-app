import java.util.*;
import java.io.*;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.lang.StringBuilder;

public class MyNotes{
	public static void main(String[] args)throws IOException{
		BufferedReader vhodText = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder izpis = new StringBuilder();
		Scanner in = new Scanner(System.in);

		System.out.print("Do you want to make a new note or read/write to an existing one [new/read/write]:");
		String izbira = vhodText.readLine();
		int st_note;
		switch(izbira){
			case "new":
				System.out.println("Write your note:");
				String vnesenNote = vhodText.readLine();

				System.out.println("Enter PATH to which you want to save the file:");
				String pot = vhodText.readLine();
				try{
					File noteFile = new File(pot);
					noteFile.createNewFile();

					FileWriter pisalec = new FileWriter(pot);
					pisalec.write(vnesenNote);
					pisalec.close();
				}
				catch(Exception e){
					System.out.println(e.getMessage());
				}
				break;
			case "write":
				System.out.println("Enter the path to the file you want to EDIT");
				pot = vhodText.readLine();
				String test = vhodText.readLine("KOSA MONA");
				break;
			case "read":
				System.out.println("Enter the PATH to the file that you want to READ");
				pot = vhodText.readLine();
				try{
					FileReader bralec = new FileReader(pot);
					int podatki = bralec.read();

					System.out.println("Vsebina datoteke: ");
					while(podatki != -1){
						char znak = (char)podatki;
						izpis.append(znak);
						System.out.print(znak);
						podatki = bralec.read();
					}
					bralec.close();
					System.out.println();
				}
				catch(Exception e){
					System.out.println(e.getMessage());
				}
				break;
			default:
				System.out.println("Invalid input!");
		}
	}
}
