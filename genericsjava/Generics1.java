package genericsJava;

import java.util.List;

public class Generics1 {



    // declare covarint in java
    // it can take list that extends animals
    public void makeNoises(List<? extends Animal> animalList){
        for (Animal a :animalList){
            a.makeNoise();
        }
    }

    // when putting something use contravariant
    public void addToList(List<? super Animal> animalList){
        Mammal m1 = new Mammal();
        Animal a1 = new Animal();
        Dog d1 = new Dog();

        animalList.add(d1);
//        animalList.add(m1);
        animalList.add(a1);
    }

    // when getting something use covariant type
    public  void getFromList(List <? extends Dog> animalList){
        Mammal  animal = animalList.get(0);

    }

    /**
     * Bivariance Example
     * Bivariance does accept supertypes.
     * Bivariance does accept subtypes.
     * */


}

