package iterator.jdkiterator;

import java.util.Iterator;

/**
 * @author iMLe0n
 * @version 1.0.0
 * @date 19-5-20 下午9:54
 */
public class Waitress {
    // 服务员依赖的菜单系统——通过接口解耦合
    private Menu pancakeHouseMenu;
    private Menu dinerMenu;

    // 修改为 Menu 接口，向上转型，解耦合
    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    /**
     * 以后修改遍历逻辑，客户端不需要修改
     * // 不用修改
     */
    public void printMenu() {
        // 为每个菜单系统，创建迭代器
        // java.util.Iterator;
        Iterator pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator dinerIterator = dinerMenu.createIterator();
        printMenu(pancakeIterator);
        printMenu(dinerIterator);
    }

    /**
     * 接口的用法，向上转型
     * // 不用修改
     * java.util.Iterator;
     */
    private void printMenu(Iterator iterator) {
        // 先判断是否还能继续迭代
        while (iterator.hasNext()) {
            // Iterator 接口里 next 返回的是 Object 对象，故需要强制转换
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.println(menuItem.getDescription());
        }
    }
}
