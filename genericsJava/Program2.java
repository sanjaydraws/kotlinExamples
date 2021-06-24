import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

// Deciding between `T`, `? super T`, and `? extends T`

// As a rule of thumb, you should use
// ? extends T if you only need "read" access ("input")
// ? super T if you need "write" access ("output")
// T if you need both ("modify")
// Using extends or super is usually better because it makes your code more flexible (as in: allowing the use of
// subtypes and supertypes), as you will see below.
class Shoe{}
class IPhone{}
interface Fruit{}

class Apple implements Fruit{}
class Banana implements Fruit{}
class GrannySmith extends Apple{}
class FruitHelper{
    public void eatAll(Collection <? extends Fruit> fruits){}
    public void  addApple(Collection<? super Apple> apples){}
}


public class Program2 {
    public static void main(String[] args) {
        FruitHelper fruitHelper = new FruitHelper() ;
        List<Fruit> fruits = new ArrayList<>() ;
        fruits.add(new Apple()); // // Allowed, as Apple is a Fruit
        fruits.add(new Banana()); // Allowed Banana as fruit 

        fruitHelper.addApple(fruits);//Allowed, as "Fruit super Apple"
        fruitHelper.eatAll(fruits); // Allowed

        

    }
}
