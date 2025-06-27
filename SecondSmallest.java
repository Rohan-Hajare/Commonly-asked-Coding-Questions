package CompanyAptitudeQuestions;

public class SecondSmallest {

    static int SecondSmallestElement(int a[])
    {
        int n = a.length;
        int smallest=a[0];
        int secondSmallest=Integer.MAX_VALUE;

        for(int i=0; i<n; i++)
        {
            if(smallest>a[i])
            {
                secondSmallest=smallest;
                smallest=a[i];
            }
            if(a[i]!=smallest && a[i]<secondSmallest)
            {
                secondSmallest=a[i];
            }
        }

        return secondSmallest;
    }
    public static void main(String[] args) {
        int a[]={1,3,8,5,8,4};
        System.out.println(SecondSmallestElement(a));
    }
}
