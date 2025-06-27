package CompanyAptitudeQuestions;


import java.util.*;
import java.util.Set;

// remove duplicate and find the sum of all elements

public class SumOfUniqueElements {

    public static void main(String[] args) {

        Map<Integer,Integer> map=new  HashMap<Integer,Integer>();

        Integer[] arr={1,3,2,3,2,4,4};
        int sum=0;

        Set<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            if(set.contains(arr[i]))
            {

            }
            else
            {
                set.add(arr[i]);
            }
        }

        for(int s:set) {
            System.out.println(s);
            sum+=s;
        }

        System.out.println("Sum: "+sum);
    }
}
