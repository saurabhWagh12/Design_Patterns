public class Delete implements Command{
    private Application app;
    public Delete(Application app){
        this.app = app;
    }
    @Override
    public void execute() {
        app.execute(this);
    }
}
