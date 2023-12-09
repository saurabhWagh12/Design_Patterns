import java.util.List;
class BookIterator implements iterator{
    public List<Book> list;
    public static int idx;

    public BookIterator(List<Book> l) {
        this.list = l;
        idx = -1;
    }

    @Override
    public boolean hasnext() {
        if(idx<this.list.size()-1){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public Object Next() {
        idx++;
        try {
            return this.list.get(idx);
        } catch (Exception e) {
            return null;
        }
    }
}