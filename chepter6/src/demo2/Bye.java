package demo2;

public class Bye implements Runnable{
	int p=500;
	@Override
	public void run() {
		for (int i = 0; i < 500; i++) {
		synchronized (this) {
		if(p>0){
	    System.out.println(Thread.currentThread().getName()+"�����˵�"+(501-p)+"��Ʊ");
           p--;
		     }else{
				   System.out.println("��Ʊ");
				   break;
			   }
		   }
		
		}
	 }

}
