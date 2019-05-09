package adapter.iterenum;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * @author iMLe0n
 * @version 1.0.0
 * @date 19-5-9 下午10:36
 */
public class EnumerationIterator implements Iterator<Object> {
    Enumeration<?> enumeration;

    public EnumerationIterator(Enumeration<?> enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return enumeration.nextElement();
    }

    @Override
    public void remove(){
        throw new UnsupportedOperationException();
    }
}
