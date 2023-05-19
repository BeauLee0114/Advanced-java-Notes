package OnJava.functional;

import java.util.function.Function;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 李博
 * @Description
 * @create 2023/1/4 15:28
 * @Modified By
 */
class One{}
class Two{}

public class ConsumeFunction {
    static Two consume(Function<One,Two> onetwo){
        return onetwo.apply(new One());
    }

    public static void main(String[] args) {
        Two two = consume(one->new Two());
    }
}
