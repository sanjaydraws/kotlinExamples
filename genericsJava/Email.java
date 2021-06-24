
// The fourth example doesn't use generics at all, so it's similar to if the class had
// an Object parameter. The compiler will warn about AbstractParam being a raw type, but it will compile the
// ObjectParam class.

// public class ObjectParam extends AbstractParam {
//     // ...
//     }
// public class MultiParam<T, E> extends AbstractParam<E> {
    
//  }

// public class Age extends AbstractParam<Integer> {
//     // ...
//     }
public class Email extends AbstractParam<String> {
    public static void main(String[] args) {

        // if extends AbstractParam<String>
        // Email email = new Email();
        // email.setValue("test@gmail.com");
        // System.out.println(email.getValue());

        //         Age age = new Age();
        // age.setValue(25);
        // Integer retrievedAge = age.getValue();
        // int autounboxedAge = age.getValue();

        
        // MultiParam<String, Double> multiParam = new MultiParam<>(); 
        // multiParam.setValue(3.3);


        // It is also possible to instantiate with anonymous inner class with an empty curly braces ({}):
        AbstractParam<Double> height = new AbstractParam<Double>(){};
        height.setValue(198.6);
        System.out.println(height.getValue());

        // Note that using the diamond with anonymous inner classes is not allowed.
    }
}
