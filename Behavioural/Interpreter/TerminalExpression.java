public class TerminalExpression implements Expression{
    private String data; 
    public TerminalExpression(String s){
        data = s;
    }
    @Override
    public boolean interpret(String context) {
        if(data.contains(context)){
            return true;
        }
        return false;
    }
}
