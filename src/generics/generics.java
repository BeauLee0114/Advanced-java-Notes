package generics;

public class generics<T> {
    private T value;

    public generics(T value){
        this.value=value;
    }

    public T getValue(){
        return value;
    }
    public void setValue(T value){
        this.value=value;
    }

    public static void main(String[] args) {
        generics<String> name = new generics<String>(".....");
        System.out.println(name.getValue());
        generics<Integer> number = new generics<Integer>(123);
        System.out.println(number.getValue());


    }


}


