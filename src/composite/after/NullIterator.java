package composite.after;

import java.util.Iterator;

/**
 * @author iMLe0n
 * @version 1.0.0
 * @date 19-5-21 下午10:10
 */
public class NullIterator implements Iterator {
    @Override
    public Object next() {
        return null;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
