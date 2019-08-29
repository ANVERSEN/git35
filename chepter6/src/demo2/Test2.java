package demo2;

public class Test2 {

	public static void main(String[] args) {

		
		Time t=new Time();
		Thread th=new Thread(t);
		th.start();
	}

}
