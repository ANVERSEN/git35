package demo2;

public class Bye implements Runnable{
	int p=500;
	@Override
	public void run() {
		for (int i = 0; i < 500; i++) {
		synchronized (this) {
		if(p>0){
	    System.out.println(Thread.currentThread().getName()+"卖掉了第"+(501-p)+"张票");
           p--;
		     }else{
				   System.out.println("无票");
				   break;
			   }
		   }
		
		}
	 }

}
