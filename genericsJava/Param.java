//Example 1 

// Generics enable classes, interfaces, and methods to take other classes and interfaces as type parameters
// To instantiate this class, provide a type argument in place of T. For example, Integer:

public class Param<T> {
    private T value;
    public T getT() {
        return value;
    }
    public void setT(T value) {
        this.value = value;
    }
    public static void main(String[] args) {
        Param<Integer> integerParam = new Param<Integer>();
        integerParam.setT(34);
        System.out.println( integerParam.getT());

        Param<String []> stringArrayParam ;
        Param<int[][]> int2dArrayParam;
        Param<Param<Object>> objectNestedParam ;

        // In Java SE 7 and later, the type argument can be 
        // replaced with an empty set of type arguments (<>) called the
        //  diamond 

        // Param<Integer> intParam = new Param<>();
        // integerParam.setT(12334);
        // System.out.println( integerParam.getT());



    }

}
