
import java.util.Arrays;

public class Frame {

    static String[] textInput;
    static int topFrameLength;

    public static void main(String[]args){

        textInput = new String[]{"jksfgj", "igsrygfi", "kgfivyegyfvihb", ";hugbd;", "dfghj"};

        topFrame(textInput);
        secondLine(textInput);
        topFrame(textInput);
    }
    static void secondLine(String [] m){

        for(int i = 0; i < m.length; i++){
            System.out.print("*");
            System.out.print(" ");
            System.out.print(m[i]);
            checkDifference(m,topFrameLength,i);
            System.out.print("*");
            System.out.println();
        }
    }
    static void topFrame(String[] a){

        LongestString l = new LongestString();
        String longString = l.checkString(textInput);
        topFrameLength = longString.length() + 4;
        for (int i =0; i < topFrameLength; i++){
            System.out.print("*");
        }
        System.out.println();
    }
    static void checkDifference (String [] n,int topFrameLength, int z){

        int numberOfSpaces = topFrameLength - n[z].length() - 3;
        for(int j = 0; j < numberOfSpaces; j++){
            System.out.print(" ");
        }
    }
}

