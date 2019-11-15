
import java.util.Scanner;

public class Square {

    public static void square(int length){
        for (int rows = 0; rows <length; rows++) {
            for (int columns = 0; columns < length; columns++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int number;
        Scanner kb = new Scanner(System.in);   //Scanner object to read the input
        System.out.print("Enter length of the square : ");
        number = kb.nextInt();
        square(number);
    }
}
