package composite.before;

/**
 * @author iMLe0n
 * @version 1.0.0
 * @date 19-5-21 下午9:37
 * 叶子节点，代表菜单里的一项
 * 只复写对其有意义的方法，没有意义的方法，比如获得子节点等，就不理会即可
 */
public class MenuItem extends MenuComponent {
    private String name;
    private String description;
    private boolean vegetarian;
    private double price;

    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public boolean isVegetarian() {
        return vegetarian;
    }

    @Override
    public void print() {
        System.out.print("  " + getName());
        if (isVegetarian()) {
            System.out.print("(v)");
        }

        System.out.println(", " + getPrice());
        System.out.println("     -- " + getDescription());
    }
}
