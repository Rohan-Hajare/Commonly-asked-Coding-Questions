package CompanyAptitudeQuestions;

//find the second largest number from array
public class SecondLargest {

    static int secondLargestElement(int a[])
    {
        int n=a.length;
        int largest=a[0];
        int secondLargest=0;

        for(int i=0; i<n; i++)
        {
            if(largest<a[i])
            {
                largest=a[i];
            }
            if(a[i]>secondLargest && a[i]<largest)
            {
                secondLargest=a[i];
            }
        }
        return secondLargest;

    }
    public static void main(String[] args) {
    int a[]={3,1,8,6,8,4};
        System.out.println(secondLargestElement(a));
    }
}
