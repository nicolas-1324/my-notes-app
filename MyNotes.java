import javax.swing.*;
import java.awt.Graphics;
public class MyNotes{
	public static void main(String[] args){
	
		//Basic frame	
		JFrame jframe = new JFrame("My Notes");

		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Menu constructors
		JMenuBar menu_bar = new JMenuBar();
		JMenu menu = new JMenu("File");

		//Menu Items
		JMenuItem item_1 = new JMenuItem("New");
		JMenuItem item_2 = new JMenuItem("Open");
		JMenuItem item_3 = new JMenuItem("Save");

		menu.add(item_1);
		menu.add(item_2);
		menu.add(item_3);
		menu_bar.add(menu);//dodam menu na menu_bar

		jframe.setJMenuBar(menu_bar);
		jframe.setSize(400, 400);
		jframe.setVisible(true);
	}
}
