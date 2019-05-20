package iterator.iteratorcustomize;

/**
 * @author iMLe0n
 * @version 1.0.0
 * @date 19-5-20 下午8:41
 * 餐厅的菜单都是午餐项目，煎饼的菜单，都是早餐项目，但是它们都属于菜单，即：
 * 都有菜品名称，描述
 * 故设计这样一个类作为菜单项目类
 */
public class MenuItem {
    String name;
    String description;

    public MenuItem(String name,
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
