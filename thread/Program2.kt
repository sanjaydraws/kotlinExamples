
//running multiple tasks in parallel
class Task(val taskId: Int) : Thread() {
    override fun run() {
        for (i in 1..5) {
            println("Task $taskId: $i")
            Thread.sleep(1000)
        }
    }
}

fun main() {
    val thread1 = Task(1)
    val thread2 = Task(2)

    thread1.start()
    thread2.start()

    thread1.join() // Wait for thread1 to complete
    thread2.join() // Wait for thread2 to complete

    println("All tasks completed")
}

/** 
Output
Task 1: 1
Task 2: 1
Task 2: 2
Task 1: 2
Task 2: 3
Task 1: 3
Task 1: 4
Task 2: 4
Task 1: 5
Task 2: 5
All tasks completed
*/