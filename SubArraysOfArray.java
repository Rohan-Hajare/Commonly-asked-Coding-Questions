package CompanyAptitudeQuestions;

//0
//0 1
//0 1 2
//0 1 2 3
//1
//1 2
//1 2 3
//2
//2 3
//3


import java.util.ArrayList;
import java.util.List;

public class SubArraysOfArray {
    public static void main(String[] args) {

        int arr[]={0,1,2,3};
        int n=arr.length;
        int maxSum=0;
        for(int srt=0;srt<n;srt++)
        {
            int currCount=0;
            for(int end=srt;end< n;end++)
            {
                currCount+=arr[end];
               for(int i=srt;i<=end;i++)
                {
                    System.out.print(arr[i]+" ");
                }
                System.out.println(" ");
                maxSum=Math.max(maxSum,currCount);
            }

        }
        System.out.println("Max Sum "+maxSum);

        List<List<Integer>> result = findSubArrays(arr);
        for(List<Integer> num:result)
        {
            System.out.println(num);
        }
    }

    public static List<List<Integer>> findSubArrays(int[] arr)
    {

        List<List<Integer>> result=new ArrayList<>();
        List<Integer> subarray=new ArrayList<>();

        for(int s=0;s<arr.length;s++)
        {
            subarray.clear();
            for(int e=s;e<arr.length;e++)
            {
                subarray.add(arr[e]);
//                result.add(new ArrayList<>(subarray));
                System.out.println(subarray);
            }
            System.out.println();
        }
        return result;

    }
}
