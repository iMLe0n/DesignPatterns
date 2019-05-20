package iterator.cafeIterator;

import iterator.jdkiterator.Menu;
import iterator.jdkiterator.MenuItem;

import java.util.Iterator;

/**
 * @author iMLe0n
 * @version 1.0.0
 * @date 19-5-20 下午10:16
 */
public class Waitress {
    private Menu pancakeHouseMenu;
    private Menu dinerMenu;
    // 需要增加 cafeMenu
    private Menu cafeMenu;

    /**
     * 如果，太多的参数，可以使用建造者模式优化构造器
     * 需要增加 cafeMenu 参数
     */
    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu, Menu cafeMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
        this.cafeMenu = cafeMenu;
    }

    /**
     * 需要增加 cafeMenu 的迭代器
     */
    public void printMenu() {
        Iterator pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator dinerIterator = dinerMenu.createIterator();
        Iterator cafeIterator = cafeMenu.createIterator();
        printMenu(pancakeIterator);
        printMenu(dinerIterator);
        printMenu(cafeIterator);
    }

    /**
     * 无需修改
     */
    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.println(menuItem.getDescription());
        }
    }
}
