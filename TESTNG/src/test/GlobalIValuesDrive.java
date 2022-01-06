package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalIValuesDrive {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//How to read properties class
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("\\Users\\Palazov\\git\\SeleniumProject\\TESTNG\\src\\test\\data.properties");		
		prop.load(fis);
	System.out.println(prop.getProperty("browser"));
	System.out.println(prop.getProperty("url"));
	prop.setProperty("browser", "fierfox");
	System.out.println(prop.getProperty("browser"));
	
	//how to write and read class
	FileOutputStream fos=new FileOutputStream("\\Users\\Palazov\\git\\SeleniumProject\\TESTNG\\src\\test\\data.properties");
	prop.store(fos, null);

	}

}