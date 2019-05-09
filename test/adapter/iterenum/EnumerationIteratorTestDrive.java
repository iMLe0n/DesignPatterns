package adapter.iterenum;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;

/**
 * @author iMLe0n
 * @version 1.0.0
 * @date 19-5-9 下午10:44
 */
public class EnumerationIteratorTestDrive {
    public static void main(String[] args) {
        String[] data = {"iMLe0n","leon","charles"};
        Vector<String> v = new Vector<String>(Arrays.asList(data));
        Iterator<?> iterator = new EnumerationIterator(v.elements());
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
