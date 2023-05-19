package OnJava.interfaces;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 李博
 * @Description
 * @create 2023/1/6 10:32
 * @Modified By
 */
public interface SealedInterface {

    sealed interface Ifc permits Imp1,Imp2{}

    final class Imp1 implements Ifc{}
    final class Imp2 implements Ifc{}

    sealed abstract class AC permits X{}
    final class X extends AC{}
}
