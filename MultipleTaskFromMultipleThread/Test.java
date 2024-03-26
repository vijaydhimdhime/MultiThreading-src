package MultipleTaskFromMultipleThread;

public class Test {
	public static void main(String[] args) {
		Threrad1 t1= new Threrad1();
		t1.start();
		Threrad2 t2 = new Threrad2();
		t2.start();
		Threrad3 t3 = new Threrad3();
		t3.start();
		Threrad4 t4 = new Threrad4();
		t4.start();
	}

}
