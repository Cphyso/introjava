import java.util.Scanner;

public class Hello {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter name : ");
        String name = input.nextLine();

        System.out.println(hello(name));
    }
    public static String hello(String name){
	String output = "Hello" +" " + name + "!";
	return output;
        }
    }

