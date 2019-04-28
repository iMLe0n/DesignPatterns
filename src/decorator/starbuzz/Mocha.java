package decorator.starbuzz;

/**
 * @author iMLe0n
 * @version 1.0.0
 * @date 19-4-28 上午11:46
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",Mocha";
    }

    @Override
    public double cost() {
        return .2 + beverage.cost();
    }
}
