package demo1;

public class FirstThread extends Thread{

	public void run(){
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
				System.out.println(Thread.currentThread().getName()+"Ö´ÐÐµÚ"+(i+1)+"´Î");
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}
