
fun <A> lazyIf(
    cond:Boolean,
    onTrue:() -> A,
    onFalse:() -> A
):A = if(cond) onTrue() else onFalse()


fun main(args: Array<String>) {
    val a= 90 
    val y = lazyIf(
        (a<22),
        {
            println("a")
        },{
            println("b")
        }
    )
    print(y)
}

