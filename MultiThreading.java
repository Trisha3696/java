import java.util.Random;

class SquareThread implements Runnable {

int n;

SquareThread(int x) {

n = x;

}

public void run() {

System.out.println( n * n);

}

}

class CubeThread implements Runnable {

int n;

CubeThread(int x) {

n = x;

}

public void run() {

System.out.println(n*n*n);

}

}

class RandomThread implements Runnable {

Random r;

Thread t2, t3;

public void run() {

int num;

r = new Random();

try {

for(int i=0;i<10;i++){

num = r.nextInt(100);

System.out.println(num);

if(num % 2 == 0) {

t2 = new Thread(new SquareThread(num));

t2.start();

}else if(num % 2 != 0) {

t3 = new Thread(new CubeThread(num));

t3.start();

}

Thread.sleep(1000);

}

} catch (Exception ex) {

System.out.println("Interrupted Exception");

}

}

}

class MainThread {

public static void main(String[] args) {

RandomThread thread_obj = new RandomThread();

Thread t1 = new Thread(thread_obj);

t1.start();

}

}

	
