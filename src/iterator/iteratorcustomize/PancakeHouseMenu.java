package iterator.iteratorcustomize;

import java.util.ArrayList;

/**
 * @author iMLe0n
 * @version 1.0.0
 * @date 19-5-20 下午8:53
 * 煎饼窗口的菜单
 */
public class PancakeHouseMenu {
    /**
     * menuItems 使用 ArrayList 存储菜单的项目，动态数组，使其很容易扩大菜单规模
     */
    private ArrayList<MenuItem> menuItems;

    /**
     * 在构造菜单的时候，把菜单加入到 ArrayList menuItems
     */
    public PancakeHouseMenu() {
        menuItems = new ArrayList<>();
        addItem("K&B's Pancake Breakfast",
                "Pancakes with scrambled eggs, and toast");

        addItem("Regular Pancake Breakfast",
                "Pancakes with fried eggs, sausage");
    }

    public void addItem(String name, String description) {
        MenuItem menuItem = new MenuItem(name, description);
        menuItems.add(menuItem);
    }

   public Iterator createIterator(){
        return new PancakeHouseMenuIterator(menuItems);
   }
}
