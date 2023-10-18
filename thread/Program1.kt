// creating and running a multithreaded program 

class MyThread : Thread() {
    override fun run() {
        for (i in 1..5) {
            println("Thread ${Thread.currentThread().id}: $i")
            Thread.sleep(1000)
        }
    }
}

fun main() {
    val thread1 = MyThread()
    val thread2 = MyThread()

    thread1.start()
    thread2.start()
}
