package CompanyAptitudeQuestions;

import java.util.Scanner;
import java.util.Vector;

//rotate array by k position
public class RotateArray {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7};
        // 7 6 5 4 3 2 1
        // 5 6 7 4 3 2 1
        // 5 6 7 1 2 3 4

        // 2 3 4 5 6 7 1

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the K th position to rotate from");
        int k=sc.nextInt();

        int[] rotate = rotateWithoutExtraSpace(a, k);

        for(int x:rotate)
        {
            System.out.print(x+" ");
            x++;
        }
        System.out.println();
    }

    // (i+k)%a.length returns the value from 0 to length-1
    // it is to maintain cyclic behaviour
    public static int[] rotateUsingExtraSpace(int[] a,int k)
    {
        int[] temp=new int[a.length];
        for(int i=0;i<a.length;i++)
        {
            temp[(i+k)%a.length]=a[i];
        }
        a=temp;
        return a;
    }



//    Approach :-
//    Reverse the entire array(0 to n-1).
//    Reverse the first k elements(0 to K-1).
//    Reverse the remaining elements(K to n-1).
    public static int[] rotateWithoutExtraSpace(int[] nums, int k) {
        int n=nums.length;
        k%=n;
        Reverse(nums,0,n-1);
        Reverse(nums,0,k-1);
        Reverse(nums,k,n-1);
        return nums;
    }

    public static void Reverse(int[] a,int start,int end)
    {
        while(start<end)
        {
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }
    }
}
