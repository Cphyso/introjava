import java.util.Arrays;

public class CombineArrays {
    public static void main(String args[]){

        int []arr0 = {11,22,33};
        int []arr1 = {1,2,3} ;

        int[] completeArray = combine(arr0, arr1);

        System.out.println(Arrays.toString(completeArray));

    }
    public static int[] combine(int[] array0, int[] array1){
        int finalLength = array0.length + array1.length;
        int[] combined = new int[finalLength];
        for(int i  = 0; i < finalLength/2; i++){
            combined[2*i] = array0[i];
            combined[2*i+1] = array1[i];
        }
        return combined;
    }
}