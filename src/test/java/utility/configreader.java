package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class configreader {
	
	public String readconfig(String valuetoberead) throws IOException {
		Properties prop = new Properties();

		String file="config/config.properties";
         InputStream inputstream = getClass().getClassLoader().getResourceAsStream(file);
         prop.load(inputstream);

		String value = prop.getProperty(valuetoberead);
         System.out.println(value);

              return value;
	}

}
