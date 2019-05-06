package factory.abstractfactory;

/**
 * @author iMLe0n
 * @version 1.0.0
 * @date 19-5-6 下午3:52
 */
public class WinButton implements Button {
    @Override
    public void getButton() {
        System.out.println("WinButton");
    }
}
