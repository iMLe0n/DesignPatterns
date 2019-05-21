package composite.before;

/**
 * @author iMLe0n
 * @version 1.0.0
 * @date 19-5-21 下午9:50
 */
public class MenuTestDrive {
    public static void main(String[] args) {
        // 创建所有的菜单系统，它们本质上都是组合节点——MenuComponent
        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
        MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
        MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert of course!");
        // 创建顶级root节点——allMenus，代表整个菜单系统
        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");
        allMenus.add(pancakeHouseMenu); // 把每个菜单系统，组合到root节点，当做树枝节点
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);
        // 为煎饼屋的菜单系统，增加菜单项
        pancakeHouseMenu.add(new MenuItem(
                "K&B's Pancake Breakfast",
                "Pancakes with scrambled eggs, and toast",false,12.5));// 为餐厅的菜单系统，增加菜单项
        dinerMenu.add(new MenuItem("Vegetarian BLT", "(Fakin') Bacon with lettuce & tomato on whole wheat",true,15.2));
        dinerMenu.add(new MenuItem("BLT", "Bacon with lettuce & tomato on whole wheat",true,14.5));
        // 为餐厅的菜单系统，增加子菜单——这个其实也是菜单项，但是，是树枝，这是一个饭后甜点子菜单
        dinerMenu.add(dessertMenu);
        // 为饭后甜点菜单系统，增加菜单项
        dessertMenu.add(new MenuItem("Apple Pie", "Apple pie with a flakey crust, topped with vanilla icecream",false,12.7));
        dessertMenu.add(new MenuItem("Cheesecake", "Creamy New York cheesecake, with a chocolate graham crust",false,14.5));
        // 为咖啡厅菜单系统，增加菜单项
        cafeMenu.add(new MenuItem(
                "Veggie Burger and Air Fries",
                "Veggie burger on a whole wheat bun, lettuce, tomato, and fries",true,17.2));
        // 把整个菜单传给客户端
        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
    }
}
