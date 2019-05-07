package singleton.theadsafe;

/**
 * @author iMLe0n
 * @version 1.0.0
 * @date 19-5-7 下午9:09
 */
public class Singleton {
    private static Singleton uniqueInstance;

    private Singleton() {
    }

    public static synchronized Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    public String getDescription() {
        return "I'm a thread safe Singleton!";
    }
}
