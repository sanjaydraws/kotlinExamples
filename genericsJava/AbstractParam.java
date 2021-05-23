
// extending generics class 

public abstract class AbstractParam<T>{
    private T value ;
    public T getValue() {
        return value;
    }
    public void setValue(T value) {
        this.value = value;
    }
}

