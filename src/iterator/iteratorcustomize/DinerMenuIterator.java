package iterator.iteratorcustomize;

/**
 * @author iMLe0n
 * @version 1.0.0
 * @date 19-5-20 下午9:05
 * 餐厅的迭代器
 */
public class DinerMenuIterator implements Iterator {
    private MenuItem[] items;
    private int position = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return position < items.length && items[position] != null;
    }

    @Override
    public Object next() {
        MenuItem menuItem = items[position];
        position = position + 1;
        return menuItem;
    }
}
