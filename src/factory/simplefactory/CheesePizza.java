package factory.simplefactory;

/**
 * @author iMLe0n
 * @version 1.0.0
 * @date 19-4-29 上午11:22
 */
public class CheesePizza extends Pizza {
    public CheesePizza() {
        name = "Cheese Pizza";
        dough = "Regular Crust";
        sauce = "Marinara Pizza Sauce";
        toppings.add("Fresh Mozzarella");
        toppings.add("Parmesan");
    }
}
