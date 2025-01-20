import java.util.*;
class Item {
    private
    int itemCode;
    String itemName;
    int itemPrice;
    int quantity;

    public Item(int itemCode,String itemName,int itemPrice,int quantity){
        this.itemCode=itemCode;
        this.itemName=itemName;
        this.itemPrice=itemPrice;
        this.quantity=quantity;
        displayDetails(itemCode,itemName,itemPrice,quantity);
    }
    void displayDetails(int itemCode,String itemName,int price,int quantity){
        System.out.println("Display Details :"+"\n"+itemCode+"\n"+itemName+"\n"+itemPrice+"\n"+"Total cost of given quantity : "+"\n"+quantity*itemPrice);
    }
}

public class ItemDetail{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int itemCode=sc.nextInt();
        String abc=sc.nextLine();
        String itemName=sc.nextLine();
        int itemPrice=sc.nextInt();
        int quantity=sc.nextInt();
        Item itemOne=new Item(itemCode,itemName,itemPrice,quantity);
    }
}