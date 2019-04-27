package strategy;

/**
 * 火箭驱动飞行
 * @author iMLe0n
 * @version 1.0.0
 * @date 19-4-26 下午3:57
 */
public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket");
    }
}
