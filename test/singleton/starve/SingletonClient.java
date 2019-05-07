package singleton.starve;

/**
 * @author iMLe0n
 * @version 1.0.0
 * @date 19-5-7 下午9:04
 */
public class SingletonClient {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.getDescription());
    }
}
