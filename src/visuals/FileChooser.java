package visuals;

import java.io.*;
import javax.swing.*;

public class FileChooser {
	
	public static void run() {
		JFileChooser chooser = new JFileChooser();
		chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		chooser.showOpenDialog(null);
		File f = chooser.getCurrentDirectory();
		String path = f.getAbsolutePath();
		System.out.println("You have selected: " + path);
	}
	
}