

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("Atomic Habits","James Clear");
        Book b2 = new Book("Rich Dad Poor Dad","Robert Kiyosaki");
        Book b3 = new Book("Rich Dad Poor Dad","Robert ");
        Library library = new Library();
        library.add(b1);
        library.add(b2);
        library.add(b3);
        System.out.println(library.list);

        iterator itr = library.createIterator();
        while(itr.hasnext()){
            Book b = (Book)itr.Next();
            System.out.println(b.author+" "+b.name);
        }
    }
}