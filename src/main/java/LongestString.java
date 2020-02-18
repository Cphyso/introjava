public class LongestString {

    public static void main(String[] args) {
        String[] textInput = new String[]{"the", "silver", "jumps","over", "th", "fence", "ofdogyuibiubj"};
        LongestString l = new LongestString();
        System.out.println(l.checkString(textInput));
    }
    String checkString(String[] anything) {

        String[] words = anything;
        String x = words[0];
        for (int i = 0; i < words.length; i++) {
            if (x.length() < words[i].length()) {
                x = words[i];
            }
        }
        return x;
    }
}
