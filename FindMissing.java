package CompanyAptitudeQuestions;

import java.util.Arrays;

public class FindMissing {

    public static void main(String[] args) {
       //find the missing if array is sorted
//        int a[]={0,1,3,4,6,8};
//        int j=0;
//        for(int i=0; i<a.length; i++)
//        {
//            if(a[i]==j)
//            {
//                j++;
//            }
//            else {
//                System.out.println("the missing number is: "+j);
//               j=a[i]+1;
//            }
//        }

        //another way to solve
        // in this case it doesn't matter whether the array is sorted or not'

        int a[]={0,1};

        int missing = FindMissing.findMissing(a, a.length);
//        int missing = missingNum(a,a.length);
        System.out.println(missing);


    }

     static int findMissing(int[] arr,int n)
    {

        int expected_sum=n*(n+1)/2;
        int actual_sum=0;

        for(int i:arr)
        {
            actual_sum+=i;
        }

        int missing_num=expected_sum-actual_sum;
        return missing_num;
    }



    //another way if array not started from 1

    static int missingNum(int[] arr,int n)
    {

        int missing_num=-1;
        Arrays.sort(arr);
        int max=arr[n-1];
        int min=arr[0];
        int exp_sum=((n+1)*(max+min))/2;
        int act_sum=0;
        for(int i:arr)
        {
            act_sum+=i;
        }
        missing_num=exp_sum-act_sum;
        return missing_num;

    }

}
