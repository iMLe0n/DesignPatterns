package factory.simpleFactory;

/**
 * @author iMLe0n
 * @version 1.0.0
 * @date 19-4-29 上午11:34
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {
        SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();
        PizzaStore store = new PizzaStore(simplePizzaFactory);

        Pizza pizza = store.orderPizza("cheese");
        System.out.println("We ordered a " + pizza.getName() + "\n");
        System.out.println(pizza);

        pizza = store.orderPizza("veggie");
        System.out.println("We ordered a " + pizza.getName() + "\n");
        System.out.println(pizza);
    }
}
