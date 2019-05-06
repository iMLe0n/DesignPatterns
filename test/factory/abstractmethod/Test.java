package factory.abstractmethod;

import factory.abstractfactory.GUIFactory;
import factory.abstractfactory.MacFactory;
import factory.abstractfactory.WinFactory;

/**
 * @author iMLe0n
 * @version 1.0.0
 * @date 19-5-6 下午4:01
 */
public class Test {
    public static void main(String[] args) {
        GUIFactory winFactory = new WinFactory();
        winFactory.createButton().getButton();
        winFactory.createBorder().getBorder();

        GUIFactory macFactory = new MacFactory();
        macFactory.createButton().getButton();
        macFactory.createBorder().getBorder();
    }
}
