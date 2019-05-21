package composite.after;

/**
 * @author iMLe0n
 * @version 1.0.0
 * @date 19-5-21 下午10:17
 */
public class TestCompositeStack {
    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
        // 创建顶级root节点——allMenus，代表整个菜单系统
        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");
        allMenus.add(pancakeHouseMenu); // 把菜单系统，组合到root节点，当做树枝节点

        // 为煎饼小屋的菜单系统，增加菜单项
        pancakeHouseMenu.add(new MenuItem(
                "K&B's Pancake Breakfast",
                "Pancakes with scrambled eggs, and toast",false,12.4));
        pancakeHouseMenu.add(new MenuItem(
                "Regular Pancake Breakfast",
                "Pancakes with fried eggs, sausage",false,15));
        testStack(allMenus);
    }

    public static void testStack(MenuComponent menuComponent) {
        CompositeIterator compositeIterator = new CompositeIterator(menuComponent.createIterator());
        while (compositeIterator.hasNext()) {
            MenuComponent menuComponent1 = (MenuComponent) compositeIterator.next();
        }
    }
}
