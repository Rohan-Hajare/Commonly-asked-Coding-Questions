package CompanyAptitudeQuestions;

import java.util.HashSet;
import java.util.Set;

// {2,3,4,4,5,3,6}
// here 3 and 4 are repeating  values but 3 is first repeat value so the output is 3
public class FindFirstRepeating {
    public static void main(String[] args) {

        int arr[]={2,3,3,4,5,3,2,6};
        Set<Integer> distinct=new HashSet<>();
       int repeat=0;
       int n= arr.length-1;
        for (int i =n; i >=0 ; i--) {
            if(distinct.contains(arr[i]))
            {
                repeat=arr[i];
            }
            else {
                distinct.add(arr[i]);
            }
        }

        System.out.println(repeat);

    }
}
