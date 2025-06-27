package CompanyAptitudeQuestions;



import java.util.Scanner;
public class Product {

    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of N ");
        int num=sc.nextInt();
        int price=1;
        while(num>0)
        {
            int rem=num%10;
            price=price*rem;
            num=num/10;
        }

        System.out.println("Price : "+price);
    }
}
