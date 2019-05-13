package templatemethod.simplebarista;

import templatemethod.simplebarista.Coffee;
import templatemethod.simplebarista.Tea;

/**
 * @author iMLe0n
 * @version 1.0.0
 * @date 19-5-13 下午1:45
 */
public class Barista {
    public static void main(String[] args) {
        Tea tea = new Tea();
        Coffee coffee = new Coffee();
        System.out.println("Making tea...");
        tea.prepareRecipe();
        System.out.println("Making coffee...");
        coffee.prepareRecipe();
    }
}
