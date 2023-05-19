package OnJava.reuse;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 李博
 * @Description
 * @create 2022/12/22 15:54
 * @Modified By
 */

class WaterSource{
    private String s;
    WaterSource(){
        System.out.println("WaterSource()");
        s="Constructed";
    }
    @Override
    public String toString() {
        return s;
    }
}

public class SprinklerSystem {
    private String value1,value2,value3,value4;
    private WaterSource source = new WaterSource();
    private int i ;
    private float f ;

    @Override
    public String toString() {
        return "SprinklerSystem{" +
                "value1='" + value1 + '\'' +
                ", value2='" + value2 + '\'' +
                ", value3='" + value3 + '\'' +
                ", value4='" + value4 + '\'' +
                ", source=" + source +
                ", i=" + i +
                ", f=" + f +" "+
                "source="+source;
    }

    public static void main(String[] args) {
        //组合
        SprinklerSystem sprinklerSystem = new SprinklerSystem();
        System.out.println(sprinklerSystem);
    }
}
