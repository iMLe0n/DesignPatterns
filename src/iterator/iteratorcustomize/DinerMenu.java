package iterator.iteratorcustomize;

/**
 * @author iMLe0n
 * @version 1.0.0
 * @date 19-5-20 下午8:57
 * 餐厅的菜单
 */
public class DinerMenu {
    private static final int MAX_ITEMS = 6;
    private int numberOfItems = 0;
    //使用了真正的数组实现菜单项的存储
    private MenuItem[] menuItems;

    //实现方式不变
    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("Vegetarian BLT", "(Fakin') Bacon with lettuce & tomato on whole wheat");
        addItem("BLT", "Bacon with lettuce & tomato on whole wheat");
        addItem("Soup of the day", "Soup of the day, with a side of potato salad");
    }

    //实现方式不变
    public void addItem(String name, String description) {
        MenuItem menuItem = new MenuItem(name, description);
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Sorry, menu is full!  Can't add item to menu");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems = numberOfItems + 1;
        }
    }

    // 不需要 getMenuItems 方法，因为它会暴露内部实现，返回的直接是菜单的数据结构
    // 这个新方法代替 getMenuItems，createIterator 返回的是迭代器接口
    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
