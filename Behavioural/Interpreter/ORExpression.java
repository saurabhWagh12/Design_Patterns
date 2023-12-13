public class ORExpression implements Expression{
    private Expression e1=null,e2=null;
    public ORExpression(Expression e1,Expression e2){
        this.e1=e1;
        this.e2=e2;
    }
    @Override
    public boolean interpret(String context) {
        return this.e1.interpret(context) || this.e2.interpret(context);
    }
}
