package iterator.cafeIterator;

import iterator.jdkiterator.Menu;
import iterator.jdkiterator.MenuItem;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author iMLe0n
 * @version 1.0.0
 * @date 19-5-20 下午10:15
 * 合并之后的咖啡厅菜单实现类
 * hash表也实现了JDK的迭代器，不需要RD自己实现
 */
public class CafeMenu implements Menu {
    /**
     * 菜单使用了hash表存储，和现有的两个菜单系统实现不一样
     * 实现不变
     */
    private Map<String, MenuItem> menuItems = new HashMap<>();

    // 实现不变
    public CafeMenu() {
        addItem("Veggie Burger and Air Fries",
                "Veggie burger on a whole wheat bun, lettuce, tomato, and fries");
    }

    // 实现不变
    public void addItem(String name, String description) {
        MenuItem menuItem = new MenuItem(name, description);
        menuItems.put(menuItem.getName(), menuItem);
    }

    /**
     * hash表支持JDK自带的迭代器 java.util.Iterator;
     */
    @Override
    public Iterator createIterator() {
        // 返回 java.util.Iterator; 只需要取得 hash 表的 value 集合即可
        return menuItems.values().iterator();
    }
}
