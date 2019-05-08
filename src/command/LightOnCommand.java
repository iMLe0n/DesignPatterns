package command;

/**
 * @author iMLe0n
 * @version 1.0.0
 * @date 19-5-8 上午11:43
 */
public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
