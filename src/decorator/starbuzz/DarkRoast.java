package decorator.starbuzz;

/**
 * @author iMLe0n
 * @version 1.0.0
 * @date 19-4-28 下午12:05
 */
public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    @Override
    public double cost() {
        return .99;
    }
}
