package OnJava.functional;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 李博
 * @Description
 * @create 2023/1/4 10:17
 * @Modified By
 */
interface Description{
    String brief();
}
interface Body{
    String detailed(String head);
}

interface Multi{
    String twoArg(String head,Double d);
}


public class LamdaExpressions {
    static Body bod = h->h+"No Parents!";

    static Body bod2 = (h)->h+"More details";

    static Description desc = ()->"Short info";

    static Multi mult = (h,n)->h+n;

    static Description moreLines = ()->{
        System.out.println("morelines()");
        return "from moreLines";
    };

    public static void main(String[] args) {
        System.out.println(bod.detailed("Oh!"));
        System.out.println(bod.detailed("Hi!"));
        System.out.println(desc.brief());
        System.out.println(mult.twoArg("Pi!",3.14159));
        System.out.println(moreLines.brief());

    }
}
