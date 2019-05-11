package facade.hometheater;

/**
 * @author iMLe0n
 * @version 1.0.0
 * @date 19-5-11 下午10:28
 */
public class Screen {
    String description;

    public Screen(String description) {
        this.description = description;
    }

    public void up() {
        System.out.println(description + " going up");
    }

    public void down() {
        System.out.println(description + " going down");
    }


    @Override
    public String toString() {
        return "Screen{" +
                "description='" + description + '\'' +
                '}';
    }
}
