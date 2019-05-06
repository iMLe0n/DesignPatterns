package factory.abstractfactory;

/**
 * @author iMLe0n
 * @version 1.0.0
 * @date 19-5-6 下午3:58
 */
public class WinFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public Border createBorder() {
        return new WinBorder();
    }
}
