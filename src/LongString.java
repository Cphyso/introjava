public class LongString {
        //method takes an array as input and returns the length of the longest string
        public static int  longest(String [] words){
            String tmp = "";                          // initial longest string has a length of ZERO
            for (String word : words) {               // if the length of the word is greater  than that of tmp , assign word to tmp
                if (tmp.length() < word.length()) {
                    tmp = word;
                }
            }
            return tmp.length();             //returns the length of the longest word
        }
        public static void main(String args[]){
            /* Its initially hard coded to test out,change the array elements to test out on new words/strings*/

            String[] arr = {"once","upon", "a","time"};

            longest(arr);	// longest word length
            // print out all the words with the same length as value returned by longest() method
            for (String word : arr){
                if (word.length()==longest(arr)){
                    System.out.println(word);
                }
            }
        }
    }

