package CompanyAptitudeQuestions;

public class FindEquilibrium {
    public static void main(String[] args) {

        int arr[]={1,4,2,7,1,6};

        int prev_sum=arr[0];
        int sum=0;
        int next_sum=0;
        for (int i=0; i<arr.length;i++)
        {
            sum+=arr[i];
        }

        for (int i = 1; i < arr.length-1 ; i++)
        {
//            next_sum=(sum-arr[i])-prev_sum;
             next_sum=(sum)-(prev_sum+arr[i]);

            if(next_sum==prev_sum)
            {
                System.out.println("The Equilibrium is " + arr[i]);
            }
            else
            {
                prev_sum+=arr[i];
            }
        }

    }
}
