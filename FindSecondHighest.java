package CompanyAptitudeQuestions;

public class FindSecondHighest {

    public static void main(String[] args) {
        int arr[]={10,52,4,32,51,74,50};
        int highest=arr[0];
        int secondHighest=0;

        for(int i:arr) {

            if(i>highest)
            {
                secondHighest=highest;
                highest=i;
            }
            else if(i>secondHighest)
            {
                secondHighest=i;
            }
        }

        for(int j:arr)
        {
            System.out.print(","+j);
        }
        System.out.println("\n"+highest);
        System.out.println(secondHighest);
    }
}
