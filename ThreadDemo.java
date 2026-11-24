class MyThread extends Thread {
  MyThread() {
    super();
    start();
}
public void run() {
  for (int i = 1; i <= 5; i++) {
    System.out.println("Child Thread: " + i);
    try {
       Thread.sleep(500);
    } catch (InterruptedException e) {
      System.out.println(e);
    }
  }
  }
}
public class ThreadDemo {
  public static void main(String[] args) {
    MyThread t = new MyThread();
    for (int i = 1; i <= 5; i++) {
      System.out.println("Main Thread: " + i);
      try {
         Thread.sleep(500);
      } catch (InterruptedException e) {
          System.out.println(e);
      }
    }
  }
}