package strategy;

/**
 * 不会叫
 * @author iMLe0n
 * @version 1.0.0
 * @date 19-4-26 下午3:32
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<<silence>>");
    }
}
