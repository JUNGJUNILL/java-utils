package helloJava.personal.P002_javaUtil;

//멀티 스레스 환경에서 동시성 제어 할 때 씀
public class P005_JavaUtil {
    public static void main(String[] args) throws Exception {
		Counter counter = new Counter();

		// 두 개의 스레드를 생성
		CounterThread thread1 = new CounterThread(counter);
		CounterThread thread2 = new CounterThread(counter);
		CounterThread thread3 = new CounterThread(counter);

		// 스레드 시작
		thread1.start();
		thread2.start();
		thread3.start();

    }

}

class CounterThread extends Thread {
	private Counter counter;

	public CounterThread(Counter counter) {
		this.counter = counter;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			counter.increment();
			try {
				Thread.sleep(1000); // 0.1초 대기
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("1=================");


		for (int i = 0; i < 5; i++) {
			counter.increment2();
			try {
				Thread.sleep(1000); // 0.1초 대기
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		System.out.println("2=================");

		for (int i = 0; i < 5; i++) {
			counter.increment3();
			try {
				Thread.sleep(1000); // 0.1초 대기
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

class Counter {
	private int count = 0;

	private int count2= 0;

	private int count3= 0;

	// synchronized 메서드로 설정하여 한 번에 하나의 스레드만 접근 가능
	public synchronized void increment() {
		count++;
		System.out.println("Count incremented: " + count);
	}

	public void increment2() {
		count2++;
		System.out.println("Count2 incremented: " + count2);
	}

	public void increment3(){
		synchronized (this){
			count3++;
			System.out.println("Count3 incremented: " + count3);
		}
	}

	public int getCount() {
		return count;
	}

	public int getCount2() {
		return count2;
	}

	public int getCount3() {
		return count3;
	}
}