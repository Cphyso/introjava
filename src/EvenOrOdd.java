import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String args[]){
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter an integer : ");

        System.out.println(kb.nextInt()%2==0? "even" : "odd");
    }
}
