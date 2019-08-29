package demo1;

import java.security.cert.Certificate;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class TextThread {

	public static void main(String[] args) {

//		FirstThread ft=new FirstThread();
//		FirstThread ff=new FirstThread();
//		ft.setPriority(Thread.MIN_PRIORITY);
//		ff.setPriority(Thread.MAX_PRIORITY);
//		ft.start();
//	    ff.start();
		SecondThread st=new SecondThread();
		SecondThread st1=new SecondThread();
		
		Thread th=new Thread(st);
		th.start();
		Thread th1=new Thread(st1);
		th1.start();
	}

}
