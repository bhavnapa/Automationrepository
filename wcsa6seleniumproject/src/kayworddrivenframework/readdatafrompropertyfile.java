package kayworddrivenframework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class readdatafrompropertyfile {


	public static void main(String[] args) throws IOException {
		
	FileInputStream fis = new FileInputStream(".data/TestData/config.properties");
		
		//read data from conflig properties
		Properties prop=new Properties();
		//make the file ready to read
	    prop.load(fis);
		prop.getProperty("Username");
	System.out.println("PropertyData");
	
	}

}
