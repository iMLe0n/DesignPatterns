package composite.before;

/**
 * @author iMLe0n
 * @version 1.0.0
 * @date 19-5-21 下午9:47
 * 客户端，也就是服务员类，聚合了菜单组件接口（这里是抽象类）控制菜单，解耦合
 */
public class Waitress {
    /**
     * 聚合了菜单组件——这一抽象节点，能兼顾叶子节点和树枝节点
     */
    private MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }
}
