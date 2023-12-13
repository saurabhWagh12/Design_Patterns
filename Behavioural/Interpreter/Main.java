public class Main {
    public static void main(String[] args) {
        TerminalExpression t1 = new TerminalExpression("Saurabh is a Great Programmer");
        TerminalExpression t2 = new TerminalExpression("Saurabh is good in both app and web development");
        
        ANDExpression e = new ANDExpression(t1, t2);
        ORExpression eo = new ORExpression(t1, t2);

        System.out.println(e.interpret("Saurabh"));
        System.out.println(eo.interpret("Programmer"));
    }
}
