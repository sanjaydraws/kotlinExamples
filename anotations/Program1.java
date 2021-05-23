import java.util.ArrayList;

// anotation it will check on compile time 

// introduce in 1.8 functioninterface  
// if contains only one method 
@FunctionalInterface
 interface Abc {
    // dont use two method 
    void show();
}


class A{
    public void showMyDataFromDataBase(){
        System.out.println("In A");
    }

}
class B extends A{

    // this method available but don't use it 
    // @Deprecated
    // public void show(){

    // }

    @Override 
    @SuppressWarnings("unchecked")
    public void showMyDataFromDataBase(){

        ArrayList<Integer> obj = new ArrayList<>();
        System.out.println("In B");
    }

}

public class Program1 {
    public static void main(String[] args) {
        B obj = new B();
        // obj.show(); 
    }
}
