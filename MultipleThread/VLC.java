package MultipleThread;

public class VLC {
	public static void main(String[] args) {
		PlayVedio t1 = new PlayVedio();
		t1.setPriority(10);
		//t1.start();
		StartSound t2 = new StartSound();
		t2.start();
		t2.setPriority(10);
		t1.start();
		TimeProcessing t3 = new TimeProcessing();
		t3.start();
		PlayVedio t4 = new PlayVedio();
		PlayVedio t5 = new PlayVedio();
		t4.start();			//one thread perform multiple thread
		t5.start();
	}
}
