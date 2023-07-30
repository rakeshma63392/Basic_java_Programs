import java.lang.reflect.Array;
import java.util.Arrays;

public class swap {
    public static void main(String[] args) {
        int arr[]= { 45, 30, 78, 7,8};
        int start = 0;
        int end = arr.length-1;

            for (start = 0; start < end;) {
                while (start < end) {
                    int temp = arr[start];
                    arr[start] = arr[end];
                    arr[end] = temp;
                    start++;
                    end--;
                }

            }
       //     for(start=0;start<arr.length;start++){
                System.out.print( Arrays.toString(arr));
            }
        }


