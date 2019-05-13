package templatemethod.barista;

/**
 * @author iMLe0n
 * @version 1.0.0
 * @date 19-5-13 下午1:52
 */
public class Coffee extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }
}
