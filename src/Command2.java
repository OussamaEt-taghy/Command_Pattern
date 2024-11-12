public class Command2 implements Command {
    private Recepteur1 recepteur1;

    public Command2(Recepteur1 recepteur1) {
        this.recepteur1 = recepteur1;
    }
    @Override
    public void execute() {
     recepteur1.action2();
    }
}
