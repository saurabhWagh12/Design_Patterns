public class Main{
    // Main-Idea: Every action is converted to a Command and every type of command like save,open etc know to which application they have to talk to for execution,
    public static void main(String[] args) {
        Application app = new Application();
        // Here ctrl_s and saveButton are doing same operation thus if converted to a command Save will help to reduce code duplicacy.
        Command ctrl_s = new Save(app);
        Command saveButton = new Save(app);
        Command open = new Open(app);
        Command delete = new Delete(app);
        
        ctrl_s.execute();
        open.execute();
        delete.execute();
        saveButton.execute();
    }
}