package factory.factorymethod;

/**
 * @author iMLe0n
 * @version 1.0.0
 * @date 19-4-30 下午2:57
 */
public class ChicagoStyleVeggiePizza extends Pizza {
    public ChicagoStyleVeggiePizza() {
        name = "Chicago Deep Dish Veggie Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
        toppings.add("Black Olives");
        toppings.add("Spinach");
        toppings.add("Eggplant");
    }

    @Override
    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
