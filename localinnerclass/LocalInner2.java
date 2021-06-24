// static local inner class not possible 

public class LocalInner2 {
    private int data = 30 ;// instance variable 
    static int s = 20;
    void display(){
         class Local {
            void msg(){
             System.out.println(s);
          }
        }
        Local l=new Local();
        l.msg();
    }
    public static void main(String[] args) {
        LocalInner2 l = new LocalInner2();
        l.display();
    }
}
