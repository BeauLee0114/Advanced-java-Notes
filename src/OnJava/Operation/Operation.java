package OnJava.Operation;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 李博
 * @Description
 * @create 2023/1/5 09:18
 * @Modified By
 */
public interface Operation {
    void execute();
    static void runOps(Operation... ops){
        for (Operation op: ops) {
            op.execute();
        }
    }
        static void show(String msg){
            System.out.println(msg);
        }
}
