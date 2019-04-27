package strategy;

/**
 * @author iMLe0n
 * @version 1.0.0
 * @date 19-4-26 下午3:28
 */
public class Quack implements QuackBehavior {
    /**
     * 真的呱呱叫
     */
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
