package strategy;

/**
 * 橡皮鸭
 *
 * @author iMLe0n
 * @version 1.0.0
 * @date 19-4-26 下午2:52
 */
public class RubberDuck extends Duck {
    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("I'm a rubber duckie");
    }
}
