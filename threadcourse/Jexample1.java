

//1) Java Thread Example by extending Thread class

// public class Jexample1 extends Thread{  
//     public void run(){  
//     System.out.println("thread is running...");  
//     }  
//     public static void main(String args[]){  
//         Jexample1 t1 = new Jexample1();  
//     t1.start();  
//      }  
// }  



// 2. Java Thread Example by implementing Runnable interface

// If you are not extending the Thread class,your class object would not be treated as a thread object.So
//  you need to explicitely create Thread class object.We are passing the object of your class that 
//  implements Runnable so that 
// your class run() method may execute.
class Jexample1 implements Runnable{
    public void run(){
        System.out.println("Thread is running   by implementing runnable interface ");
    }

    public static void main(String[] args) {
    
        Jexample1 m1 = new Jexample1();
        Thread t1 = new Thread(m1);   
        t1.start();
    }


}

// start() method
// A new thread starts(with new callstack).
// The thread moves from New state to the Runnable state.
// When the thread gets a chance to execute, its target run() method will run.






