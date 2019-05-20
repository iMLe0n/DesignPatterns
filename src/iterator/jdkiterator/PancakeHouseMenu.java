package iterator.jdkiterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author iMLe0n
 * @version 1.0.0
 * @date 19-5-20 下午9:52
 * 煎饼，不需要再实现迭代器，因为使用的数据结构是JDK的容器，而对于JDK自带的集合容器，不需要自己实现迭代器
 */
public class PancakeHouseMenu implements Menu {
    private List<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<>();
        addItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs, and toast");
    }

    public void addItem(String name, String description) {
        MenuItem menuItem = new MenuItem(name, description);
        menuItems.add(menuItem);
    }

    @Override
    public Iterator createIterator() {
        // 返回 JDK ArrayList 自带的迭代器 iterator() 方法
        return menuItems.iterator();
    }
}
