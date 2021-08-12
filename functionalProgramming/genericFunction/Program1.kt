// function can be generic type ,that can work with any type 

fun <T> funct1(x :T , y:Int):Unit{
    for(i in 0..y){
        print(x.get(i))
    }
    
}
fun main(args: Array<String>) {
    funct1(listOf(2,3,6,8,90), 5)
    funct1(listOf("Red","Green", "Blue", "Orange"),4)


}