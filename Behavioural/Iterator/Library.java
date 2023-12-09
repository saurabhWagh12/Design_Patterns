import java.util.ArrayList;
public class Library {
    ArrayList<Book> list;
    public Library(){
        list = new ArrayList<>();
    }
    public void add(Book b){
        list.add(b);
    }
    public iterator createIterator(){
        return new BookIterator(list);
    }
}