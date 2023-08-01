package synchronise.java;
import java.io.*;

public class Display {
	synchronized public void wish(String name) {
		for(int i=0;i<10;i++) {
			System.out.println("welcome");
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {
				System.out.println("I got interrupted");
			}
			System.out.println(name);
			
		}
	}

}
class MyThread extends Thread{
	Display d;
	String name;
	MyThread(Display d,String name){
		this.d = d;
		this.name = name;
	}
	public void run() {
		d.wish(name);
	}
}
class Test{
	public static void main(String args[]) {
		Display d=new Display();
		Display d1=new Display();
		MyThread t1=new MyThread(d,"sita");
		MyThread t2=new MyThread(d1,"gita");
		t1.start();
		t2.start();
	}
}
