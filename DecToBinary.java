package CompanyAptitudeQuestions;

public class DecToBinary {

    public static void main(String[] args) {

        convertDecimalToBinary(17);

    }
    public static void convertDecimalToBinary(int n)
    {
        int[] binaryNum = new int[1000];
        int i = 0;
        while (n > 0)
        {
            // storing remainder in binary array
            binaryNum[i] = n % 2;
            n = n / 2;
            i++;
        }

        // printing binary array in reverse order
        for (int j = i - 1; j >= 0; j--)
            System.out.print(binaryNum[j]);
    }
}
