package decorator.starbuzz;

/**
 * @author iMLe0n
 * @version 1.0.0
 * @date 19-4-28 上午11:11
 */
public abstract class Beverage {
    String description = "Unknow Beverage";

    public String getDescription() {
        return description;
    }

   public abstract double cost();
}
