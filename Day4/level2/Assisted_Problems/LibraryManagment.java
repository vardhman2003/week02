import java.util.ArrayList;

class Book{
    private String title; 
   private  String author; 
    Book(String title,String authtor){
        this.author=authtor; 
        this.title=title;
    } 
    public String gettitle(){
        return title;
    }
    public String getauthor(){
        return author;
    }
}
class Library{
    private String name; 
    private ArrayList<Book>books; 
    Library(String name){
        this.name=name; 
        this.books=new ArrayList<>();
    } 
    public void addBook(Book book){
        books.add(book);
    } 
    public void showbookDetail(){
        System.out.println("The name of the Library is "+name);
        if(books.isEmpty()){
            System.out.println("The Library is Empty");
        } 
        else{
            for(Book book:books){
                System.out.println("The name of the book is "+book.gettitle());
                System.out.println("The detail of the book is "+book.getauthor()+ " ");
            }
        }
    }
}
public class LibraryManagment{ 
    public static void main(String[] args) {
    Book b1=new Book("Introduction to Java", "James Gosling"); 
    Book b2=new Book("The almanack of naval Ravikant", "Eric Jorgenson");
    Library l1=new Library("Wisdom"); 
    l1.addBook(b1); 
    l1.addBook(b2);
    l1.showbookDetail();
    }
}