package Pattern.Creational.Prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 李博
 * @Description
 * @create 2023/5/6 15:10
 * @Modified By
 */
public class PrototypeRegistry {
    private Map<String,Prototype> prototypes = new HashMap<>();

    public void registerPrototype(String key,Prototype prototype){
        prototypes.put(key,prototype);
    }

    public Prototype getPrototype(String key){
        Prototype prototype = prototypes.get(key);
        return prototype.clone();
    }
}
