package demo2;

public class Test {

	public static void main(String[] args) {

		Bye b=new Bye();
		Thread th1=new Thread(b, "����");
		Thread th2=new Thread(b, "����");
		Thread th3=new Thread(b, "����");

		th1.start();
		th2.start();
		th3.start();
	}

}
