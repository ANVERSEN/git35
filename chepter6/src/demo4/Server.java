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
			ServerSocket ss=new ServerSocket(8888);//socket �ķ���������ָ���������˿ں�
			
			System.out.println("�ȴ����ӡ�����������");
			
			Socket socket=ss.accept();//��������ʼ����
			
			System.out.println("���ӳɹ���������");
			
			InputStream ins=socket.getInputStream();//���ش��׽��ֵ�������
			
			OutputStream out=socket.getOutputStream();//���ش��׽��ֵ������
			
			BufferedReader br=new BufferedReader(new InputStreamReader(ins));//���ͻ��˵ķ���������Ϣ���뻺����
			PrintWriter pw=new PrintWriter(out,true);//ͨ��socket�Դ�����������Ϣ������ͻ���
			
			Scanner sc=new Scanner(System.in);
			
			while(true){//������ѭ�����Ͻ��ܺͷ�����Ϣ
				
				System.out.println(br.readLine());//�Ѵ���ڻ��������е���Ϣһ��һ�ж�ȡ����
				
				String str=sc.nextLine();
				System.out.println("���ϣ�");
				pw.println(str);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
