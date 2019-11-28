import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String args[]){
        Scanner keyBoard = new Scanner(System.in);
        System.out.print("Enter an integer : ");

        System.out.println(keyBoard.nextInt()%2==0? "even" : "odd");
    }
}
