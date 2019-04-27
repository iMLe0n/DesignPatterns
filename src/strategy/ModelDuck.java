package strategy;

/**
 * 模型鸭
 * @author iMLe0n
 * @version 1.0.0
 * @date 19-4-26 下午3:56
 */
public class ModelDuck extends Duck{

    public ModelDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
