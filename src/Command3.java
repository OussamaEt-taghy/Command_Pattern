public class Command3 implements Command {
    private Recepteur2 recepteur2;
    public Command3(Recepteur2 recepteur2) {
        this.recepteur2 = recepteur2;
    }
    @Override
    public void execute() {
         recepteur2.action3();
    }
}
