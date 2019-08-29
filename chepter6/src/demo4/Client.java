package demo4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {

		try {
			Socket socket=new Socket("192.168.1.103",8888);
			
			InputStream is=socket.getInputStream();//得到socket自带的输入流
			InputStreamReader isr=new InputStreamReader(is);
			OutputStream os=socket.getOutputStream();//得到docket自带的输出流
			
			BufferedReader br1=new BufferedReader(isr);//将输入流的信息放入缓存流中，以便后边收消息
			PrintWriter pw1=new PrintWriter(os, true);//通过socket自带的输出流输出信息
			
			Scanner sc1=new Scanner(System.in);
			
			while(true){
				System.out.println(br1.readLine());//收消息
				String str1=sc1.nextLine();//发消息
				System.out.println("翠花：");
				pw1.println(str1);
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
