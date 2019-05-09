package adapter.iterenum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;

/**
 * @author iMLe0n
 * @version 1.0.0
 * @date 19-5-9 下午10:52
 */
public class IteratorEnumerationTestDrive {
    public static void main(String[] args) {
        String[] data = {"iMLe0n","leon","charles"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList(data));
        Enumeration<String> enumeration = new IteratorEnumeration(list.iterator());
        while (enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }
    }
}
