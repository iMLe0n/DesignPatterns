package iterator.jdkiterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @author iMLe0n
 * @version 1.0.0
 * @date 19-5-20 下午9:55
 */
public class MenuTestDrive {
    public static void main(String args[]) {
        /*Menu pancakeHouseMenu = new PancakeHouseMenu();
        Menu dinerMenu = new DinerMenu();
        // 即使具体的菜单实现类修改了名字或者环了实现类，客户端——Waitress 也不需要修改代码，解了耦合
        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
        waitress.printMenu();*/

        /*List<String> list = new ArrayList<>(Arrays.asList("a","b","c","d"));
        for(String s : list){
            if(s.equals("a")){
                list.remove(s);
            }
        }*/

        //会抛出一个ConcurrentModificationException异常,相反下面的显示正常
        List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c", "d"));
        Iterator<String> iter = list.iterator();
        while (iter.hasNext()) {
            String s = iter.next();
            if (s.equals("a")) {
                iter.remove();
            }
        }
// next() 必须在 remove() 之前调用。
// 在 foreach 中，编译器会使 next() 在删除元素之后被调用，因此就会抛出 ConcurrentModificationException 异常
    }
}
