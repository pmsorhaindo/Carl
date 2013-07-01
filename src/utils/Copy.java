package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Copy {
	
	private boolean copyDir() {
		
		
		
		return false;
	}

	private static void copyfileTest() {
		try {
			File f1 = new File("C:/file.txt");
			File f2 = new File("C:/new.txt");
			InputStream in = new FileInputStream(f1);
			OutputStream out = new FileOutputStream(f2, true);
			byte[] buf = new byte[1024];
			int len;
			
			while ((len = in.read(buf)) > 0) {
				out.write(buf, 0, len);
			}
			
			in.close();
			out.close();
			System.out.println("File copied.");
			
		} catch (Exception ex) {
			System.out.println(ex);
		}
		
	}
	
	private static void listDirs() {
		File dir = new File("C:/");
		File listDir[] = dir.listFiles();
		
		for (int i = 0; i < listDir.length; i++) {
			if (listDir[i].isDirectory()) {
				System.out.println(listDir[i].getName());
			}
		}
    }
	
	private static void driveLister() {	
	    File[] roots = File.listRoots();
	    for (int i = 0; i < roots.length; i++) {
	      System.out.println("Drive:" + roots[i]);
	    }		
	}
	
}
