
// What if we call run() method directly instead start() method?
// ->Each thread starts in a separate call stack.
// ->Invoking the run() method from main thread, the run() method goes onto the current call
//  stack rather than at the beginning of a new call stack.

// public class JExample5 extends Thread{

//     public void run(){
//         System.out.println("Runnning ...");
//     }
//     public static void main(String[] args) {
//         JExample5 t1 = new JExample5();
//         t1.run(); // fine , but doesn't start from seprate call stack 
//     }
// }



class JExample5 extends Thread{
    @Override
    public void run() {
        for(int i =0 ;i<5;i++){
            try{
                Thread.sleep(500);
                System.out.println(Thread.currentThread().getName());
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        JExample5 t1 = new JExample5();
        JExample5 t2 = new JExample5();
        t1.run();
        t2.run();
    }
}