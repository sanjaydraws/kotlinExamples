// delegating to another propeerty 


// class ClassWithDelegate(val anotherClassInt:Int)

// var MyClass.extDelegated:Int by ::topLevelInt 

// class MyClass {
//     var newName: Int = 0
//     @Deprecated("Use 'newName' instead", ReplaceWith("newName"))
//     var oldName: Int by this::newName

// }

// class MyClass(var memberInt:Int, val anotherClassInstance:ClassWithDelegate){
//     var delegagtedToMember:Int by this::memberInt 
//     var delegatedToTopLevel:Int by ::topLevelInt 

//     val delegatedToAnotherClass:Int by anotherClassInstance::anotherClassInt
// }