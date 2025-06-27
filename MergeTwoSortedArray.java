package CompanyAptitudeQuestions;



public class MergeTwoSortedArray {

    public static void main(String[] args) {
        int arr1[]={1,3,5,7,9};
        int arr2[]={2,4,6,8};
        int arr3[]=new int[arr1.length + arr2.length];

        mergeArray(arr1, arr2, arr3);
        displayArray(arr3);
    }

    private static void displayArray(int[] arr) {
        for (int r = 0; r < arr.length; r++) {
            System.out.print(arr[r]+" ");
        }
        System.out.println();
    }

    public static void mergeArray(int[] arr1, int[] arr2, int[] arr3) {
        int n=arr1.length;
        int m=arr2.length;
        int i=0;
        int j=0;
        int k=0;

        while(i<n && j<m) {
            if(arr1[i]<arr2[j])
            {
                arr3[k]=arr1[i];
                k++;
                i++;
            }
            else
            {
                arr3[k]=arr2[j];
                k++;
                j++;
            }

        }

        while(i<n)
        {
            arr3[k++]=arr1[i++];

        }
        while(j<m)
        {
            arr3[k++]=arr2[j++];


        }

    }
}
