package Command_Pattern;

public class Remote {
    private Command command;
    public void setCommand(Command command){
        this.command=command;
    }

    public void pressButton(){
        command.execute();
    }
    public void pressUndo(){
        command.undo();
    }
}
