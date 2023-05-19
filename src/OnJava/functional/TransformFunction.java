package OnJava.functional;

import java.util.function.Function;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 李博
 * @Description andThen()的默认方法，该方法专门喂操作函数而设计。
 * andThen()会在in函数调用之后调用(还有一个compose方法，它会在in函数之前应用新函数)。要附加上一个andthen()函数，只需要该函数作为参数传递。
 * 从transform（）传出一个新函数，它将in的动作和andThen（）参数结合了起来。
 * @create 2023/1/4 15:30
 * @Modified By
 */

class I{
    @Override
    public String toString(){
        return "I";
    }
}

class O{
    @Override
    public String toString(){
        return "O";
    }
}

public class TransformFunction {
    static Function<I,O> transform(Function<I,O> in ){
        return in.andThen(o->{
            System.out.println(o);
            return o;
        });
    }

    public static void main(String[] args) {
        Function<I,O> f2 = transform(i->{
            System.out.println(i);
            return new O();
        });
        O o = f2.apply(new I());
    }
}
