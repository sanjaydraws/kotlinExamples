

public class IntStack{
    private IntStack head ;
    // IntStackNode is the inner class of the class IntStack
    // Each instance of this inner class functions as one link in the
    // Overall stack that it helps to represent
    private static class IntStackNode {
        private int val ;
        private IntStackNode next;
        private IntStackNode(int v, IntStackNode n){
            this.val = v ;
            this.next  = n ;
        }
    }

    public IntStack push(int v){
        head = new IntStackNode(v, head);
        return this ;
    }

    public int pop(){
        int x = head.val ;
        head = head.next;
        return x; 
        
    }
}