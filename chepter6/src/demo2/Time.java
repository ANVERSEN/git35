package demo2;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Time extends Thread{
	//1.	写一个时钟的程序，在控制台显示 
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
