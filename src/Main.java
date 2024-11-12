public class Main {

    public static void main(String[] args) {

        Recepteur1  recepteur1 = new Recepteur1();
        Recepteur2  recepteur2 = new Recepteur2();
        Command cmd1= new Command1(recepteur1);
        Command cmd2= new Command2(recepteur1);
        Command cmd3= new Command3(recepteur2);

        Invocer invocer = new Invocer();
        invocer.addCommand("cmd1", cmd1);
        invocer.addCommand("cmd2", cmd2);
        invocer.addCommand("cmd3", cmd3);

        invocer.invokeCommand("cmd1");
        invocer.invokeCommand("cmd2");
        invocer.invokeCommand("cmd3");
        invocer.invokeCommand("cmd4");
    }
}