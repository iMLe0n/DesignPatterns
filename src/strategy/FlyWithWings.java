package strategy;

/**
 * @author iMLe0n
 * @version 1.0.0
 * @date 19-4-26 下午3:14
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying !!!");
    }
}
