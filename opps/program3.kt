// calling constructor from another constructor  

class Add{
    constructor(a:Int, b : Int):this(a, b, 7){
        var c = a+b
        print("sum of two $c")
    }
    constructor(a:Int, b:Int, c:Int){
        print("sum of three $a+$b+$c")

    }
}
fun main(){
    Add(3,4)
}