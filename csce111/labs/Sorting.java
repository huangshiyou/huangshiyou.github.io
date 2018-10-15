import java.util.Arrays;
public class Sorting {
    public static void main(String args[]) {
        int[] arr={2,3,1,7,5,13,140,141,24,2,4};
        
        //option 1: using Arrays.sort()
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        
        //option2: sorting by your self
        for (int i=0; i<arr.length-1; i++) {
            for (int j=i+1; j<arr.length; j++) {
                if(arr[i] > arr[j]) {
                    //swap arr[i] and arr[j]
                    int tmp = arr[j];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}