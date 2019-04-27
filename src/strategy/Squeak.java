package strategy;

/**
 * 吱吱叫
 * @author iMLe0n
 * @version 1.0.0
 * @date 19-4-26 下午3:29
 */
public class Squeak implements QuackBehavior {
    /**
     * 名为呱呱叫实为吱吱叫
     */
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
