// lambdas can only operate with on functional interface 
// functional interface 
// which is an interface with just one abstract method. Functional
// interfaces can have any number of default or static methods. (For this reason, they are sometimes referred to as
// Single Abstract Method Interfaces, or SAM Interfaces)

// default or static method ?? 

interface Foo1{
    void bar();
}
interface Foo2 {
    int bar(boolean baz);
}
interface Foo3{
    String bar (Object baz , int mink);
}
interface Foo4 {
    default String bar(){
        return "baz" ;  // default so not counted
    }
    void quux();

}

@FunctionalInterface 
interface Foo5{
    void bar(); 
}
@FunctionalInterface 
interface BlankFoo1 extends Foo3{
    //// inherits abstract method from Foo3

}
@FunctionalInterface 
interface Foo6{
    void bar();
    @Override
    boolean equals(Object obj); // override one of objects method so not counted 

}

// this is not a functional interface, as it has more than one abstract method
//can't use functional interface 
interface BadFoo {
    void bar();
    void quux(); // <-- Second method prevents lambda: which one should
    // be considered as lambda?
   }

   // can't be functional interface ,doesn't have any methods 
interface BlankFoo2 { }

