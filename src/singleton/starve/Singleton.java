package singleton.starve;

/**
 * @author iMLe0n
 * @version 1.0.0
 * @date 19-5-7 下午8:55
 */
public class Singleton {
    private static Singleton uniqueInstance = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance(){
        return uniqueInstance;
    }

    public String getDescription(){
        return "I'm a statically initialized Singleton!";
    }
}
