import java.util.*;
class MobilePhoneDetails {
    private
    String model;
    String brand;
    int price;

    public MobilePhoneDetails(String brand,String model,int price){
        this.brand=brand;
        this.model=model;
        this.price=price;
        displayDetails(brand,model,price);
    }

    void displayDetails(String brand,String model,int price){
        System.out.println("Mobile Phone Deatails : "+"\n"+brand+"\n"+model+"\n"+price);
    }
}

public class MobilePhone{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String model=sc.nextLine();
        String brand=sc.nextLine();
        int price=sc.nextInt();
        MobilePhoneDetails mobileOne=new MobilePhoneDetails(brand, model, price);
    }

}