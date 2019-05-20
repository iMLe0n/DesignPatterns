package iterator.cafeIterator;

import iterator.jdkiterator.Menu;
import iterator.jdkiterator.MenuItem;

import java.util.Iterator;
import java.util.List;

/**
 * @author iMLe0n
 * @version 1.0.0
 * @date 19-5-20 下午10:18
 */
public class Waitress1 {
    /**
     * 把各个菜单系统集中到一个list，充分利用list的迭代器
     * 只需要一个类就搞定，不再每次都add一个菜单类了
     */
    private List<Menu> menus;

    public Waitress1(List<Menu> menus) {
        this.menus = menus;
    }

    public void printMenu() {
        // 取得list的迭代器，直接使用一个迭代器，就能遍历所有菜单，不需要在修改
        Iterator menuIterator = menus.iterator();
        while (menuIterator.hasNext()) {
            Menu menu = (Menu) menuIterator.next();
            printMenu(menu.createIterator());
        }
    }

    // 代码不需要变
    void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.println(menuItem.getDescription());
        }
    }
}
