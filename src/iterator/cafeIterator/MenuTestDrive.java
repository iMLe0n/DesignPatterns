package iterator.cafeIterator;

import iterator.jdkiterator.DinerMenu;
import iterator.jdkiterator.Menu;
import iterator.jdkiterator.PancakeHouseMenu;

/**
 * @author iMLe0n
 * @version 1.0.0
 * @date 19-5-20 下午10:17
 */
public class MenuTestDrive {
    public static void main(String args[]) {
        Menu pancakeHouseMenu = new PancakeHouseMenu();
        Menu dinerMenu = new DinerMenu();
        Menu cafeMenu = new CafeMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu, cafeMenu);
        waitress.printMenu();
    }
}
