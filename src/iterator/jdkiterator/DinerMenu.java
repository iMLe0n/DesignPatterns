package iterator.jdkiterator;

import java.util.Iterator;

/**
 * @author iMLe0n
 * @version 1.0.0
 * @date 19-5-20 下午9:50
 * 餐厅菜单系统
 */
public class DinerMenu implements Menu {
    private static final int MAX_ITEMS = 6;
    private int numberOfItems = 0;
    private MenuItem[] menuItems;

    // 实现方式不变
    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("Soup of the day",
                "Soup of the day, with a side of potato salad");
    }

    // 实现方式不变
    public void addItem(String name, String description) {
        MenuItem menuItem = new MenuItem(name, description);
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Sorry, menu is full!  Can't add item to menu");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems = numberOfItems + 1;
        }
    }
    @Override
    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
