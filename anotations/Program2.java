import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*** 
 creating custom anotation 
 can use anotation on method, variable , class  
***/

// to create anotation 
// marker anotation when doesn't have any variable 
// @interface SmartPhone
// {
// }
//// Single value anotation when have single variable 
// multi value anotation 
//  must specify meta anotation    TARGET and retation  others are optional 
@Inherited
@Documented   // to introduce anotation in document 
@Target(ElementType.TYPE) // which level want to use  for class and interface use --->TYPE
@Retention(RetentionPolicy.RUNTIME) // what point want this anotation -->RUNTIME -->>specify SOURCE (only compile time )
@interface SmartPhone
{
    // also can set default value 
    String os() default "Symbian"; 
    int version () default 1;
}

@SmartPhone(os = "Android",version = 6)
class NokiaSeries{
    String model;
    int size;
    public NokiaSeries(String model, int size){
        this.model = model ;
        this.size = size;
    }

}

// @Inherited use you want @SmartPhone(os = "Android",version = 6) will be available in new class 
class NaSeries extends NokiaSeries{

}

public class Program2 {
    public static void main(String[] args) {
        NokiaSeries obj = new NokiaSeries("Fire", 5);
        // System.out.println(obj.model);

        // to fetch values of smartphone 
        // have to use reflection api // can get value and feature  of object a
        Class c = obj.getClass();
        Annotation an = c.getAnnotation(SmartPhone.class);
        SmartPhone s = (SmartPhone)an;
        System.out.println(s.os());


    }
    
}
