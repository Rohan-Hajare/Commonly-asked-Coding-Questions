package CompanyAptitudeQuestions;

//check if array is sorted and rotated
public class CheckRotated_Sorted {

    public static void main(String[] args) {
        int[] a={3,5,7,2,3};
         // 1 2 3 4 5
        //  4 5 1 2 3 rotated
        //  3 4 5 1 2
        int n=a.length;
        boolean b = checkArray(a, n);
        System.out.println(b);
    }

    public static boolean checkArray(int[] a, int n) {
        int count=0;
        for(int i=1;i<n;i++)
        {
            if(a[i-1]>a[i])
            {
                count++;
            }
            if(a[n-1]>a[0])
            {
                count++;
            }
        }

        return count<=1;
    }
}
