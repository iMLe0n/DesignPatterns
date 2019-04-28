package decorator.starbuzz;

/**
 * @author iMLe0n
 * @version 1.0.0
 * @date 19-4-28 上午11:53
 */
public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", whip";
    }

    @Override
    public double cost() {
        return .1 + beverage.cost();
    }
}
