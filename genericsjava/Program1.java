package genericsJava;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


/**
 * ? extends T if you only need "read" access ("input")
 * ? super T if you need "write" access ("output")
 * T if you need both ("modify")
 *
 * ? extends T represents an upper bounded wildcard. The unknown type represents a type that must be a subtype of T, or type T itself.
 *
 * ? super T represents a lower bounded wildcard. The unknown type represents a type that must be a supertype of T, or type T itself.
 * */

// 4 type of variance
public class Program1 {

    public static void main(String[] args) {
        Generics<Dog> genericsDog = new Generics<>();
        Generics<Animal> genericsAnimal = new Generics<>();

        Mammal mammal = new Mammal();
        Animal animal = new Animal();
        Dog dog = new Dog();


        genericsDog.doSomething(dog);//genericsJava.Dog@5f184fc6
//        genericsDog.doSomething(mammal);
//        genericsDog.doSomething(Animal);
        genericsAnimal.doSomething(dog);

        /**
         * Invariant type
         * */

        Generics<Animal> gA1 = new Generics<>();
//        Generics<String> genericsString = genericsAnimal;  //// called invariant type

        /**
         * covariant type example
         * */
        Mammal m1 = new Mammal();
        Mammal m2 = new Mammal();
        List<Mammal> mammals = new ArrayList<>();

        mammals.add(m1);
        mammals.add(m2);

        Animal a1 = new Animal();
        Animal a2 = new Animal();
        List<Animal> animals = new ArrayList<>();
        animals.add(a1);
        animals.add(a2);

        Dog d1 = new Dog();
        Dog d2 = new Dog();
        List<Dog> dogs = new ArrayList<>();
        dogs.add(d1);
        dogs.add(d2);

        Generics1 g = new Generics1();
        g.makeNoises(animals);
//        g.makeNoises(mammals);
//        g.makeNoises(dogs);  // can't take  use (? extends Animals) in java kotlin we don't need
//    // kotlin compiler automatic check// can be used out  keyword but doesn't need this
         g.makeNoises(dogs);


        /**
         * contravariant types
         * */
        Comparator<Mammal> mammalComparator = new Comparator<Mammal>() {
            @Override
            public int compare(Mammal o1, Mammal o2) {
                return 0;
            }
        };
        Comparator<Dog> dogComparator = new Comparator<Dog>() {
            @Override
            public int compare(Dog o1, Dog o2) {
                return 0;
            }
        };

        Comparator<Animal> animalComparator = new Comparator<Animal>() {
            @Override
            public int compare(Animal o1, Animal o2) {
                return 0;
            }
        };
        dogs.sort(animalComparator);
        dogs.sort(dogComparator); // take any of type and supertype  (? super Dog) use in keyword  in kotlin
        dogs.sort(mammalComparator);
//        mammals.sort(dogComparator);





    }
}
