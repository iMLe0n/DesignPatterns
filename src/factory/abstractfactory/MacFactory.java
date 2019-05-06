package factory.abstractfactory;

/**
 * @author iMLe0n
 * @version 1.0.0
 * @date 19-5-6 下午4:00
 */
public class MacFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Border createBorder() {
        return new MacBorder();
    }
}
