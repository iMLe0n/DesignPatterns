package strategy;

/**
 * 红头鸭
 *
 * @author iMLe0n
 * @version 1.0.0
 * @date 19-4-26 下午2:41
 */
public class RedheadDuck extends Duck {
    public RedheadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Red Headed duck");
    }
}
