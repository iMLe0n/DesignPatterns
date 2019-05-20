package iterator.jdkiterator;

/**
 * @author iMLe0n
 * @version 1.0.0
 * @date 19-5-20 下午9:41
 * 菜单的每项，抽象为类
 */
public class MenuItem {
    private String name;
    private String description;public MenuItem(String name,
                                               String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
