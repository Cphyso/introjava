
    import java.util.Scanner;

    public class Isoceles {
        public static void isosceles(int n){

            for (int rows=1; rows<=n; rows++) {
                for (int j=n+1; j >=rows; j--) {
                    System.out.print(" ");
                }

                for (int k=1; k<=2*rows - 1; k++) {
                    System.out.print("#");
                }
                System.out.println(" ");
            }
        }
        public  static void main(String args[]) {
            Scanner kb = new Scanner(System.in);
            System.out.print("Enter number to print a right angled triangle : ");
            isosceles(kb.nextInt());
        }
    }


