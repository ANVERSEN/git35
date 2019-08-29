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
			
			InputStream is=socket.getInputStream();//�õ�socket�Դ���������
			InputStreamReader isr=new InputStreamReader(is);
			OutputStream os=socket.getOutputStream();//�õ�docket�Դ��������
			
			BufferedReader br1=new BufferedReader(isr);//������������Ϣ���뻺�����У��Ա�������Ϣ
			PrintWriter pw1=new PrintWriter(os, true);//ͨ��socket�Դ�������������Ϣ
			
			Scanner sc1=new Scanner(System.in);
			
			while(true){
				System.out.println(br1.readLine());//����Ϣ
				String str1=sc1.nextLine();//����Ϣ
				System.out.println("�仨��");
				pw1.println(str1);
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
