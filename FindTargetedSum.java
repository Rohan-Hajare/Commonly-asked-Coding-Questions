package CompanyAptitudeQuestions;

import java.util.HashSet;

public class FindTargetedSum {
    public static void main(String[] args) {

       int a[]={2,3,5,7,10,12,15,20};

        int target = 13;
        int l = 0;
        int r = a.length - 1;
        for (int i = 0; i < a.length; i++) {

            if ((a[l] + a[r]) == target) {
                System.out.println("the sum of index " + a[l] + " and " + a[r] + " is " + target);
                break;
            } else if ((a[l] + a[r]) < target) {
                l++;
            } else {
                r--;
            }
        }

        FindTargetedSum.findTargetedSumOfUnsortedArray(a,target);
    }
//  int a[] = {4, 6, 2, 6, 23, 76, 12, 1};
    static boolean findTargetedSumOfUnsortedArray(int[] arr,int target)
    {
        HashSet<Integer> seen=new HashSet<>();

        for(int num:arr)
        {
            int complment=target - num;
            if(seen.contains(complment))
            {
                System.out.println("Pair Found: ("+num+","+complment+")");
                return true;
            }
            seen.add(num);

        }

        return false;

    }
}
