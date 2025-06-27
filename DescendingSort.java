package CompanyAptitudeQuestions;


import java.util.Scanner;

public class DescendingSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Number of elements
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int sum=0;

        int[] arr = new int[n];

        // Input: Array elements
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Sorting in descending order
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] < arr[j]) { // Swap if the current element is smaller than the next one
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // Output: Sorted array in descending order
        System.out.println("Sorted array in descending order:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        for(int i = 0; i < n/2; i++)
        {
            sum = sum+(arr[i]-arr[n-i-1]);
        }

        System.out.println("Sum"+sum);
        sc.close();
    }
}
