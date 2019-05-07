package singleton.doublechecklock;

/**
 * @author iMLe0n
 * @version 1.0.0
 * @date 19-5-7 下午9:17
 */
public class Singleton {
    private static volatile Singleton uniqueInstance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                uniqueInstance = new Singleton();
            }
        }
        return uniqueInstance;
    }

    public String getDescription() {
        return "I'm a double check lock thread safe Singleton!";
    }
}
