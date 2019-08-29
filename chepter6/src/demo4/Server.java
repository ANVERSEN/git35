package demo4;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

	public static void main(String[] args) {
		try {
			ServerSocket ss=new ServerSocket(8888);//socket 的服务器，并指定服务器端口号
			
			System.out.println("等待连接。。。。。。");
			
			Socket socket=ss.accept();//服务器开始监听
			
			System.out.println("连接成功。。。。");
			
			InputStream ins=socket.getInputStream();//返回此套接字的输入流
			
			OutputStream out=socket.getOutputStream();//返回此套接字的输出流
			
			BufferedReader br=new BufferedReader(new InputStreamReader(ins));//将客户端的发过来的信息放入缓存流
			PrintWriter pw=new PrintWriter(out,true);//通过socket自带的流，把信息输出到客户端
			
			Scanner sc=new Scanner(System.in);
			
			while(true){//利用死循环不断接受和发送信息
				
				System.out.println(br.readLine());//把存放在缓存流当中的信息一行一行读取出来
				
				String str=sc.nextLine();
				System.out.println("呆瓜：");
				pw.println(str);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
