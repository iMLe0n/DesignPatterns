package singleton.doublechecklock;

/**
 * @author iMLe0n
 * @version 1.0.0
 * @date 19-5-7 下午9:20
 */
public class SingleClient {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.getDescription());
    }
}
