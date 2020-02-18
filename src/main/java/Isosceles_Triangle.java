import java.util.Scanner;

public class Isosceles_Triangle {

    public static void main(String[] args) {

        System.out.println("enter any number between 1-9:");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        leftTriangle(number);
    }
    int i;
    static void leftTriangle(int r) {
        for (int i = 0; i <= r; i++) {
            for (int k = r; k > i; k--) {
                System.out.print("  ");
            }
            middleTriangle(i);
            System.out.println();
        }
    }
    static void middleTriangle(int m){
        int i=m;
        for(int k = 0; k < i+i-1; k++){
            System.out.print("# ");
        }
    }
}
