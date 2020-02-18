import java.util.Scanner;

public class Triangle {


    public static void main(String[] args) {
        Scanner tri_angle = new Scanner(System.in);
        System.out.println("enter any number from 1-9");
        int enteredNumber = tri_angle.nextInt();
        drawLine(enteredNumber);
    }
    public static void drawLine(int oneLine){
        int i;
        for (i = 0; i <= oneLine; i++){
            int j = i +1;
            for(j = 0; j < i; j++){
                System.out.print("# ");
            }
            System.out.println();
        }
    }
}
