
// Can we start a thread twice
// after starting thread , can never be started again  if you does IllegalThreadStateException is thrown
// In such case, thread will run once but for second time, it will throw exception.

public class JExample4 extends Thread {
@Override
public void run() {
    super.run();
    System.out.println("running");
}

public static void main(String[] args) {
    JExample4 t1 = new JExample4();
    t1.start();
    t1.start();
    
}
    
}
