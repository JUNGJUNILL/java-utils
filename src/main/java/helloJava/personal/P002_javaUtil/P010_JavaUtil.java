package helloJava.personal.P002_javaUtil;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


class CountTest {

    private int count = 0;

    public void unsafeIncrement(){
        count++; 
    }

    public synchronized void safeIncrement(){
        count++; 
    }

    public int getCount(){
        return count;
    }

}

class TestThread1 implements Runnable {
    
    private CountTest countTest; 

    private Map<String,String> map;

    private boolean safeThread = false;

    public TestThread1(CountTest countTest, Map<String,String> map , boolean safeThread){
        this.countTest = countTest;
        this.map = map; 
        this.safeThread = safeThread;
    }


    @Override
    public void run() {

        for(int i=0; i<100000; i++){
            map.put(String.valueOf(i), String.valueOf(i));
            
            if(safeThread == false){
                countTest.unsafeIncrement();
            }else{
                countTest.safeIncrement();
            }
  
        }

    }
}

public class P010_JavaUtil {


    static void unsafeThread() throws Exception {
        CountTest countTest = new CountTest(); 
        Map<String,String> map = new HashMap<>();

        TestThread1 testThread = new TestThread1(countTest,map , false); 
        Thread thread1 = new Thread(testThread); 
        Thread thread2 = new Thread(testThread); 

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("countTest.getCount()="+countTest.getCount());
        System.out.println("map.size()="+map.size());

    }

    static void safeThread() throws Exception {

        CountTest countTest = new CountTest(); 
        Map<String,String> map = new ConcurrentHashMap<>();

        TestThread1 testThread = new TestThread1(countTest,map,true); 
        Thread thread1 = new Thread(testThread); 
        Thread thread2 = new Thread(testThread); 

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("countTest.getCount()="+countTest.getCount());
        System.out.println("map.size()="+map.size());


    }


    public static void main(String[] args) throws Exception {
        unsafeThread(); 
        System.out.println("============================");
        safeThread();

    }
    
}
