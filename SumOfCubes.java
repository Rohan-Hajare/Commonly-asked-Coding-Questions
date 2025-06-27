package CompanyAptitudeQuestions;
import java.util.*;
public class SumOfCubes {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter starting number ");
        int s=sc.nextInt();
        System.out.println("Enter ending number");
        int e=sc.nextInt();
        int sum=0;
        for(int i=s;i<=e;i++)
        {
            sum=sum+(i*i*i);
        }

        System.out.println("Sum :"+sum);
    }
}
