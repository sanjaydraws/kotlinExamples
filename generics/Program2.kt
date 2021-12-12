package genericsKotlin


class Generics<T> {
    fun doSomething(t: T) {
        println(t)
    }
}
class Generics1 {
    // declare covarint in kotlin
    // it can take list that extends animals
    fun makeNoises(animalList: List<out Animal>) {
        for (a in animalList) {
            a.makeNoise()
        }
    }

    // when putting something use contravariant
    // to put use in keyword
    fun addToList(animalList: MutableList<in Animal?>) {
        val m1 = Mammal()
        val a1 = Animal()
        val d1 = Dog()
        animalList.add(d1)
        //        animalList.add(m1);
        animalList.add(a1)
    }

    // when getting something use covariant type
    //to  get use out keyword

    fun getFromList(animalList: List<out Dog?>) {
        val animal:Animal? = animalList[0]
    }
    fun  copy(src:List<out Animal>, dest:MutableList<in Animal>){
        for(animal in src){
            dest.add(animal)
        }
    }

}

fun main() {
    val genericsDog = Generics<Dog>()
    val genericsAnimal = Generics<Animal>()

    val mammal = Mammal()
    val animal = Animal()
    val dog = Dog()


    genericsDog.doSomething(dog) //genericsJava.Dog@5f184fc6

//    genericsDog.doSomething(mammal);
//    genericsDog.doSomething(Animal);
//    genericsDog.doSomething(mammal);
    genericsAnimal.doSomething(animal);
    genericsAnimal.doSomething(dog)

    /**
     * Invariant type
     *  does not accept supertypes.
     *  does not accept subtypes.
     * */
    val gA1 = Generics<Animal>()
//    val genericsString: Generics<String> = gA1 // called invariant type

    //        Generics<String> genericsString = genericsAnimal;  //// called invariant type
    /**
     * covariant type example
     *  does not accept supertypes.
     *  does accept subtypes.
     *  producer
     */
    val m1 = Mammal()
    val m2 = Mammal()
    val mammals: List<Mammal> = listOf(m1,m2)

    val a1 = Animal()
    val a2 = Animal()
    val animals: List<Animal> = listOf(a1,a2)


    val d1 = Dog()
    val d2 = Dog()
    val dogs: List<Dog> = listOf(d1,d2)


    val g = Generics1()
    g.makeNoises(animals)
//      g.makeNoises(mammals); not works
    //  g.makeNoises(dogs);  // can't take  use (? extends Animals) in java kotlin we don't need
    // kotlin compiler automatic check// can be used out  keyword but doesn't need this
    g.makeNoises(dogs)

    /**
     * contravariant types
     *  does accept supertypes.
     * does not accept subtypes.
     * consumer
     * */

    val mammalComparator: Comparator<Mammal> = Comparator<Mammal>{ o1, o2 -> 0 }
    val dogComparator: Comparator<Dog> = Comparator <Dog>{ o1, o2 -> 0 }

    val animalComparator: Comparator<Animal> =
        Comparator<Animal> { o1, o2 -> 0 }
    dogs.sortedWith(animalComparator)
    dogs.sortedWith(dogComparator) // take any of type and supertype  (? super Dog) use in keyword  in kotlin
    dogs.sortedWith(mammalComparator)
//        mammals.sortedWith(dogComparator);


    /**
     * contravariance and covariance example
     * */
    g.copy(animals, mutableListOf())
    g.copy(dogs, mutableListOf())
//    g.copy(mammals, mutableListOf())


    /**
     * Bivariance
     * Bivariance does accept supertypes.
       Bivariance does accept subtypes.
     * */

}