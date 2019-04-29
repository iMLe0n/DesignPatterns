package factory.simpleFactory;

/**
 * @author iMLe0n
 * @version 1.0.0
 * @date 19-4-29 上午11:25
 */
public class ClamPizza extends Pizza {
    public ClamPizza() {
        name = "Clam Pizza";
        dough = "Thin crust";
        sauce = "White garlic sauce";
        toppings.add("Clams");
        toppings.add("Grated parmesan cheese");
    }
}
