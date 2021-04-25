// when you need to create a variable but you don't want to initialize it 
// at the time of declaration/creation of the variable because you are
//  sure that the variable will be initialized before its access/usage.


class Example{
    // lateinit variable will be initialized before accessing it otherwise you will get
    private lateinit var courseName:String
    constructor(course:String){
        courseName = course 
    }
    fun fetchCourseName(){
         // we can check about initialized or not 
        if(this::courseName.isInitialized){
                println(courseName)
        }else{
           println("Not initialized ")
        }
    }
}


fun main(){
    // One way of achieving this is 
// by making the variable nullable like this:
    // var courseId:String? =null 

    // hat if you don't want to make it nullable?
    //  Here comes the use of the lateinit keyword.

    Example("Comp.science").fetchCourseName()
    

}