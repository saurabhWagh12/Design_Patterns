class Application{

    public void execute(Command c){
        if(c instanceof Delete){
            this.Delete();
        }else if(c instanceof Save){
            this.Save();
        }else if(c instanceof Open){
            this.Open();
        }
    }

    private void Save(){
        System.out.println("Saving the Context!!!");
    }

    private void Open(){
        System.out.println("Opening the File");
    }

    private void Delete(){
        System.out.println("Deleting the File");
    }
}