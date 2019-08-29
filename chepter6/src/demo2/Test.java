package demo2;

public class Test {

	public static void main(String[] args) {

		Bye b=new Bye();
		Thread th1=new Thread(b, "张三");
		Thread th2=new Thread(b, "李四");
		Thread th3=new Thread(b, "王五");

		th1.start();
		th2.start();
		th3.start();
	}

}
