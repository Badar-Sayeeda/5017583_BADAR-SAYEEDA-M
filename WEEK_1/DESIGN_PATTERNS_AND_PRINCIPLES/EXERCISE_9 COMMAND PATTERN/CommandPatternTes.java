package commandpattern;

public class CommandPatternTes{
    public static void main(String[] args) {
        // Create a light
        Light light = new Light();
        
        // Create command objects
        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);
        
        // Create remote control
        RemoteControl remote = new RemoteControl();
        
        // Set command to turn on the light and press the button
        remote.setCommand(lightOn);
        remote.pressButton();
        
        // Set command to turn off the light and press the button
        remote.setCommand(lightOff);
        remote.pressButton();
    }
}
