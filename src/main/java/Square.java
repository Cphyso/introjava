import java.util.Scanner;

public class Square {

    public static void drawLine(int squareLength) {
        for (int i = 0; i < squareLength; i++) {
            System.out.print("  #");
        }
        System.out.println();
    }
    //create another method that draws the square
    public static void drawSquare(int qLength){
        for(int i = 0; i < qLength; i++){
           drawLine(qLength);
        }
    }
    public static void main(String[] args) {
        Scanner in_put = new Scanner(System.in);
        System.out.println("enter any number");
        int anyNumber = in_put.nextInt();
        drawSquare(anyNumber);
    }
}