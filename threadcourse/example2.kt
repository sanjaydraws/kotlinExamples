// If you are not extending the Thread class,your class object would not be
//  treated as a thread object.So you need to explicitely create Thread class object.We are passing the object 
// of your class that implements Runnable so that your class run() method may execute.

class Jexample1 : Runnable {
    override fun run() {
        println("Thread is running   by implementing runnable interface ")
    }    
}


fun main() {
    val m1 = Jexample1()
    val t1 = Thread(m1)
    t1.start()
}