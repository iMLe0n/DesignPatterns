package composite.after;

import java.util.Iterator;
import java.util.Stack;

/**
 * @author iMLe0n
 * @version 1.0.0
 * @date 19-5-21 下午10:07
 */
public class CompositeIterator implements Iterator {

    private Stack<Iterator> stack = new Stack<>();

    // 把要遍历的 Menu 组合的迭代器 iterator 传入，menuComponents.iterator() 被传入一个 stack 中保存位置
    public CompositeIterator(Iterator iterator) {
        stack.push(iterator);
    }

    // 当客户端需要取得下一个元素的时候，先判断是否存在下一个元素
    @Override
    public Object next() {
        if (hasNext()) {
            Iterator iterator = stack.peek(); // 仅查看当前的栈顶元素——迭代器，不出栈
            MenuComponent component = (MenuComponent) iterator.next(); // 使用该栈顶的迭代器，取出要遍历的组合的元素
            if (component instanceof Menu) {
                // 如果取出的元素仍然是菜单，那需要继续遍历它，故要记录它的位置，把它的迭代器取出来
                // 调用 component.createIterator() 返回 CompositeIterator，这个 CompositeIterator 仍然包含一个自己的 stack，继续存入栈中
                stack.push(component.createIterator());
            }

            return component;
        } else {
            return null;
        }
    }

    @Override
    public boolean hasNext() {
        if (stack.empty()) { // 如果栈是空，直接返回 false
            return false;
        } else {
            Iterator iterator = stack.peek(); // 仅查看当前的栈顶元素——迭代器，不出栈
            // 判断当前的顶层元素是否还有下一个元素，如果栈空了，就说明当前顶层元素没有下一个元素，返回 false，此处判断为 true
            if (!iterator.hasNext()) {
                stack.pop(); // 如果当前栈顶元素，没有下一个元素了，就把当前栈顶元素出栈，递归的继续判断下一个元素
                return hasNext();
            } else { // 否则表示还有下一个元素，直接返回 true
                return true;
            }
        }
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}

