package factory.abstractfactory;

/**
 * @author iMLe0n
 * @version 1.0.0
 * @date 19-5-6 下午3:54
 */
public class WinBorder implements Border {
    @Override
    public void getBorder() {
        System.out.println("winBorder");
    }
}
