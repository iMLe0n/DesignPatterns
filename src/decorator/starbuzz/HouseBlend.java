package decorator.starbuzz;

/**
 * @author iMLe0n
 * @version 1.0.0
 * @date 19-4-28 上午11:39
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}
