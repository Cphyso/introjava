import java.util.Scanner;

public class Hello {
    public static void main(String args[]){
        Scanner name = new Scanner(System.in);
        System.out.println("Enter your name" );

        String yourName = name.nextLine();
        System.out.println("hello " + yourName);
    }

}
