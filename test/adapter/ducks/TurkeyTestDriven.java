package adapter.ducks;

/**
 * @author iMLe0n
 * @version 1.0.0
 * @date 19-5-9 下午10:29
 */
public class TurkeyTestDriven {
    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();
        Turkey duckAdapter = new DuckAdapter(duck);

        for(int i=0;i<10;i++) {
            System.out.println("The DuckAdapter says...");
            duckAdapter.gobble();
            duckAdapter.fly();
        }
    }
}
