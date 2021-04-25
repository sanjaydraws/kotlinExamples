
//we were unable to run more than one task in parallel
//the smallest part of the process that allows a program to operate more efficiently by running multiple tasks simultaneously.
//In order to perform complicated tasks in the background, we used the Thread concept in Java

//Another benefit of using thread is that if a thread gets an exception or
//an error at the time of its execution, it doesn't affect the execution
//of the other threads. All the threads share a common memory and have their own stack,
//local variables and program counter. When multiple threads are executed in parallel at the same time,
//this process is known as Multithreading.

//In a simple way, a Thread is a:
//Feature through which we can perform multiple activities within a single process.
//Series of executed statements.
//Nested sequence of method calls.


// How to create thread
// There are two ways to create a thread:

// By extending Thread class
// By implementing Runnable interface.


// 1) Java Thread Example by extending Thread class

class ThreadExample1 : Thread() {
    // run() method to perform action for thread.
    override fun run() {
        val a = 10
        val b = 12
        val result = a + b
        println("Thread started running..")
        println("Sum of two numbers is: $result")
    }
}


fun main() {
    // Creating instance of the class extend Thread class
    val t1 = ThreadExample1()
    //calling start method to execute the run() method of the Thread class
    t1.start()
}