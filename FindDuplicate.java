package CompanyAptitudeQuestions;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicate {

    public static void main(String[] args) {
        
        int arr[]={2,4,2,6,7,4,8,6};
//        findUsingSet(arr);
        findWithoutSet(arr);
//        System.out.println( Math.abs(8)% arr.length);
//        System.out.println(Math.abs(-2));
    }



    static void findUsingSet(int[] arr) {

        Set<Integer> distinct=new HashSet<>();
        for (int i=0; i<arr.length;i++)
        {
            if(distinct.contains(arr[i]))
            {
                System.out.print(arr[i]+" ");
            }
            else
            {
                distinct.add(arr[i]);
            }
        }
        System.out.println();

    }

    public static void findWithoutSet(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int index = Math.abs(arr[i])% arr.length; // Get absolute value
            if (arr[index] < 0) {
                System.out.print(index + " "); // Duplicate found
            } else {
                arr[index] = -arr[index]; // Mark as visited
            }
        }
    }
}
