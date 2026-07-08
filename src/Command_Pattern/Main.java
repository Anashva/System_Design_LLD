package Command_Pattern;

public class Main {
    public static void main(String[] args) {
        Light light=new Light();
        Command turnon=new TurnOnCommand(light);
        Remote remote=new Remote();
        remote.setCommand(turnon);
        System.out.println("Execute Command");
        remote.pressButton();
        System.out.println();
        System.out.println("Undo Command");
        remote.pressUndo();
    }
}
