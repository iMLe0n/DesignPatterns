package factory.simpleFactory;

import java.util.ArrayList;

/**
 * @author iMLe0n
 * @version 1.0.0
 * @date 19-4-29 上午11:04
 */
public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList<String> toppings = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void prepare() {
        System.out.println("Preparing " + name);
    }

    public void bake() {
        System.out.println("Baking " + name);
    }

    public void cut() {
        System.out.println("Cutting " + name);
    }

    public void box(){
        System.out.println("Cutting " + name);
    }

    @Override
    public String toString() {
        StringBuffer display = new StringBuffer();
        display.append("---- " + name + " ----\n");
        display.append(dough + "\n");
        display.append(sauce + "\n");
        for (String topping : toppings){
            display.append(topping + "\n");
        }
        return display.toString();
    }
}
