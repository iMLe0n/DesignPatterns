package strategy;

/**
 * 绿头鸭
 * @author iMLe0n
 * @version 1.0.0
 * @date 19-4-26 下午2:35
 */
public class MallardDuck extends Duck{

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("外观是绿头");
    }
}
