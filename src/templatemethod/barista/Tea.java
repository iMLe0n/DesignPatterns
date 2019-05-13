package templatemethod.barista;

/**
 * @author iMLe0n
 * @version 1.0.0
 * @date 19-5-13 下午1:54
 */
public class Tea extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Lemon");
    }
}
