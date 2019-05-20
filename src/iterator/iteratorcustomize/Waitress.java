package iterator.iteratorcustomize;

/**
 * @author iMLe0n
 * @version 1.0.0
 * @date 19-5-20 下午9:23
 */
public class Waitress {
    // 服务员依赖的菜单系统
    private PancakeHouseMenu pancakeHouseMenu;
    private DinerMenu dinerMenu;

    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu(){
        // 把迭代器子类型，传入
        Iterator pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator dinerIterator = dinerMenu.createIterator();
        printMenu(pancakeIterator);
        printMenu(dinerIterator);
    }

    /**
     * 接口的用法，向上转型
     */
    private void printMenu(Iterator iterator){
        // 先判断是否还能继续迭代
        while(iterator.hasNext()){
            // Iterator 接口里 next 返回的是 Object 对象，故需要强制转换
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.println(menuItem.getDescription());
        }
    }
}
