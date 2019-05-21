package composite.after;

import java.util.Iterator;

/**
 * @author iMLe0n
 * @version 1.0.0
 * @date 19-5-21 下午10:04
 * 先从抽象的组件节点入手，加上迭代器
 */
public abstract class MenuComponent {
    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public MenuComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        throw new UnsupportedOperationException();
    }

    public String getDescription() {
        throw new UnsupportedOperationException();
    }

    public double getPrice() {
        throw new UnsupportedOperationException();
    }

    public boolean isVegetarian() {
        throw new UnsupportedOperationException();
    }

    // 加上迭代器，这里直接使用 JDK 的迭代器
    public abstract Iterator createIterator();

    public void print() {
        throw new UnsupportedOperationException();
    }
}
