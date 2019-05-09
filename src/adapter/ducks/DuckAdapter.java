package adapter.ducks;

import java.util.Random;

/**
 * @author iMLe0n
 * @version 1.0.0
 * @date 19-5-9 下午10:24
 */
public class DuckAdapter implements Turkey {
    Duck duck;
    Random random;

    public DuckAdapter(Duck duck) {
        this.duck = duck;
        random = new Random();
    }

    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {
        if (random.nextInt(5) == 0){
            duck.fly();
        }
    }
}
