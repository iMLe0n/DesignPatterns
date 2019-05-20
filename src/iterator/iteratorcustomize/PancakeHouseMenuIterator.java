package iterator.iteratorcustomize;

import java.util.ArrayList;

/**
 * @author iMLe0n
 * @version 1.0.0
 * @date 19-5-20 下午9:14
 */
public class PancakeHouseMenuIterator implements Iterator {
    private ArrayList<MenuItem> items;
    private int position = 0;

    public PancakeHouseMenuIterator(ArrayList<MenuItem> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.size()) {
            return false;
        }else {
            return true;
        }
    }

    @Override
    public Object next() {
        MenuItem menuItem = items.get(position);
        position = position + 1;
        return menuItem;
    }
}
