package demo2;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Time extends Thread{
	//1.	дһ��ʱ�ӵĳ����ڿ���̨��ʾ 
	SimpleDateFormat s=new SimpleDateFormat("hh:mm:ss");
	@Override
	public void run() {
	while(true){
		String str=s.format(new Date());
		System.out.println(str);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	}
}
