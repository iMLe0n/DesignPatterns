package composite.before;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author iMLe0n
 * @version 1.0.0
 * @date 19-5-21 下午9:39
 * 树枝节点，也就是组合节点——代表各个菜单
 */
public class Menu extends MenuComponent {
    private String name;
    private String description;
    /**
     * 依赖了菜单组件，递归的实现
     */
    private List<MenuComponent> menuComponents = new ArrayList<>();

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }
    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return menuComponents.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    /**
     * 因为菜单作为树枝节点，它是一个组合，包含了菜单项和其他的子菜单，所以 print()应该打印出它包含的一切。
     */
    @Override
    public void print() {
        System.out.print("\n" + getName());
        System.out.println(", " + getDescription());
        System.out.println("---------------------");

        // 使用了迭代器（迭代器模式和组合模式的有机结合），遍历菜单的菜单项
        Iterator iterator = menuComponents.iterator();
        while (iterator.hasNext()) {
            // 打印这个节点包含的一切，print 可以兼顾两类节点，这是组合模式的特点
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            menuComponent.print(); // 递归思想的应用
        }
    }
}
