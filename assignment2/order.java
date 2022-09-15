import java.util.Scanner;
 
public class order {

    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        String orderDish = dishList();
        System.out.println(orderDish);

        scan.close();
    }

    static String dishList() {


        System.out.println("Hello, Welcome to ABC Restaurant. Please pick your order ");
        System.out.print("Enter the your name: ");
        String myName = scan.nextLine();
        
        System.out.println("a1 " + " Burger " + " for only " + 99.9f);
        String a1 = "Burger";
        double aPrice = 99.9;

        System.out.println("b1 " + " Fries " + " for only " + 49.9f);
        String b1 = "Fries";
        double bPrice = 49.9;

        System.out.println("c1 " + " Coke " + " for only " + 19.9f);
        String c1 = "Coke";
        double cPrice = 19.9;


        System.out.print("What is your main dish?: ");
        String order1 = scan.nextLine();

        System.out.print("What is your side dish?: ");
        String order2 = scan.nextLine();

        System.out.print("What is your drink?: ");
        String order3 = scan.nextLine();

        return "Hi " + myName + " you ordered " + a1 + " " + b1 + " " + c1 + " amounting " + (aPrice + bPrice + cPrice) + " Thank you ";

    }

    }
