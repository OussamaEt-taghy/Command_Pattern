import java.util.HashMap;
import java.util.Map;

public class Invocer {

    private Map<String,Command>commands=new HashMap<String,Command>();

    public void addCommand(String commandName,Command command){
        commands.put(commandName,command);
    }

    public void invokeCommand(String commandName){
        Command command=commands.get(commandName);
        if(command!=null) command.execute();
    }
}
