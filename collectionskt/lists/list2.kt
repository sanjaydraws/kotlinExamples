class   Person constructor  (var name:String,var  age : Int){}

fun main(){
    
    // var obj2 = Person("Milr",43)
   
    val personList = mutableListOf<Person>()
    personList.add(Person("Justin",34))
    personList.add(Person("Taylor",34))
    personList.add(Person("Camilla",34))
    personList.add(Person("Selena",34))
    personList.add(Person("Cameron",34))
    
    for(i in personList)
      print(i.name)
    
    personList.remove(personList[1])
    
    println(personList.size) // 4 
    println(personList.first().name)

    
}