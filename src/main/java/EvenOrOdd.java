import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class EvenOrOdd {

    public static void main(String[] args) {

        System.out.println("enter any number between 1-9:");
        Scanner input1 = new Scanner(System.in);
        String anyNumber = input1.nextLine();

        Pattern y = Pattern.compile(".*[13579]$");
        Matcher z = y.matcher(anyNumber);

        boolean output = z.matches();
        if (output == true) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}