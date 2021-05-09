

public class Program2 {
    Foo2 longFoo = new Foo2() {
        @Override
        public int bar(boolean baz) {
        return baz ? 1 : 0;
        }
    };
 
    Foo2 shortFoo = (x) -> { return x ? 1 : 0; };

       
}
