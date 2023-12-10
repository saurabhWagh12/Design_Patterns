public class Open implements Command{
    private Application app;
    public Open(Application app){
        this.app = app;
    }
    @Override
    public void execute() {
        app.execute(this);
    }
}
