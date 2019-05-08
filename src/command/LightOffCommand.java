package command;

/**
 * @author iMLe0n
 * @version 1.0.0
 * @date 19-5-8 上午11:47
 */
public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
