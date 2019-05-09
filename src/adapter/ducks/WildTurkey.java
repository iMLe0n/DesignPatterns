package adapter.ducks;

/**
 * @author iMLe0n
 * @version 1.0.0
 * @date 19-5-9 下午10:15
 */
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}
