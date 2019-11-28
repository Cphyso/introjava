import java.util.Scanner;

public class Triangle {

    public static void triangle(int n){
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("#"); // print '#' i times
            }
            System.out.println();
        }

    }
    public  static void main(String args[]) {
        Scanner keyBoard = new Scanner(System.in);
        System.out.print("Enter number size (for a right angled triangle) : ");
        triangle(keyBoard.nextInt());
    }

}
