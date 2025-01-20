import java.util.Scanner;

class Book {
    private
    String title;
    String author;
    int price;

    public Book(String title,String author,int price){
        this.title=title;
        this.author=author;
        this.price=price;
        displayDetails(title,author,price);
    }

    void displayDetails(String title,String author,int price){
        System.out.println("Book Details are : "+"\n" + title+"\n"+author+"\n"+price);
    }

    
}
public class BookMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String title=sc.nextLine();
        String author=sc.nextLine();
        int price=sc.nextInt();
        Book bookOne=new Book(title,author,price);
    }
}