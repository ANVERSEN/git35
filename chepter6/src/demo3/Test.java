package demo3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Test {
	public static void main(String[] args) throws IOException{
        URL url;
		try {
			url = new URL("https://www.baidu.com/");
			 BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
		        String line;
		        while((line = in.readLine())!=null){
		                System.out.println(line);
		        }
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
      
    }
}


