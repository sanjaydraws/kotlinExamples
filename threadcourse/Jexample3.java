
// Sleep method in java
// of Thread class is used to sleep a thread for 
// the specified amount of time.

// syntax

// public static void sleep(long miliseconds)throws InterruptedException
// public static void sleep(long miliseconds, int nanos)throws InterruptedException



class Jexample3 extends Thread{

    public void run(){
        for(int i = 0;i<5;i++){
            try{
                Thread.sleep(500);
                System.out.println(Thread.currentThread().getName());
                
            }
            catch(InterruptedException e){
                System.out.println("Hello ");
                System.out.println(e);
            }
            System.out.println(i);

        }

    }

    public static void main(String[] args){
        Jexample3 t1 = new Jexample3();
        Jexample3 t2 = new Jexample3();
        Jexample3 t3 = new Jexample3();


        t1.start();
        t2.start();
        t3.start();

    }
}

// output
// 1
// 1
// 2
// 2
// 3
// 3
// 4
// 4
// As you know well that at a time only one thread is executed. If you sleep a thread for the specified
//  time,the thread shedular picks up another thread and so on.