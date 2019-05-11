package facade.hometheater;

/**
 * @author iMLe0n
 * @version 1.0.0
 * @date 19-5-11 下午10:29
 */
public class PopcornPopper {
    String description;

    public PopcornPopper(String description) {
        this.description = description;
    }

    public void on() {
        System.out.println(description + " on");
    }

    public void off() {
        System.out.println(description + " off");
    }

    public void pop() {
        System.out.println(description + " popping popcorn!");
    }

    @Override
    public String toString() {
        return "PopcornPopper{" +
                "description='" + description + '\'' +
                '}';
    }
}
