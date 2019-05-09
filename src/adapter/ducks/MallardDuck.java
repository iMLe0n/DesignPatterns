package adapter.ducks;

/**
 * @author iMLe0n
 * @version 1.0.0
 * @date 19-5-9 下午10:14
 */
public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
