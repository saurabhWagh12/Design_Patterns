public class Save implements Command{
    private Application app;
    public Save(Application app){
        this.app = app;
    }
    @Override
    public void execute() {
        app.execute(this);
    }
}
