fun fib(k: Int): Int = when (k) { 
    0 -> 1 
    1 -> 1 
    else -> fib(k - 1) + fib(k - 2) 
  } 