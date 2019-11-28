public class FrameText {
    public static void main(String[] args) {

        String[] inputs = {"Learn","something","new","every","day"};
        System.out.print("*");
        int maxsize = 0;
        for (String s : inputs) {
            if (s.length() > maxsize) {
                maxsize = s.length();
            }
        }
        for (int i = 0; i <= maxsize + 1; i++) {
            System.out.print("*");
        }
        System.out.print("*");
        System.out.println();
        for (int j = 0; j < inputs.length; j++) {
            System.out.print("* " + inputs[j]);
            for (int i = inputs[j].length(); i <= maxsize-1; i++) {
                System.out.print(" ");
            }
            System.out.print(" *");
            System.out.println(); // row for a word finished
        }System.out.print("*");
        //last line of starts (bottom stars)
        for (int i = 0; i <= maxsize + 1; i++) {
            System.out.print("*");
        }
        System.out.print("*/n");
    }
}
