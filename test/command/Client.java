package command;

/**
 * @author iMLe0n
 * @version 1.0.0
 * @date 19-5-8 上午11:53
 */
public class Client {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        invoker.setOnCommand(lightOnCommand,0);
        invoker.setOffCommand(lightOffCommand,0);
        invoker.onButtonWasPushed(0);
        invoker.offButtonWasPushed(0);

        invoker.setOnCommand(garageDoorOpenCommand,1);
        invoker.onButtonWasPushed(1);
    }
}
