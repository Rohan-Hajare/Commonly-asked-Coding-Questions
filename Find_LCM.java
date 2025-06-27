package CompanyAptitudeQuestions;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Find_LCM {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int max=Math.max(n1,n2);
        int lcm=0;

        for(int i=max;i<=n1*n2;i++)
        {
            if(i%n1==0 && i%n2==0)
            {
                lcm=i;
                break;
            }
        }

        System.out.println("The lcm of "+n1 +" and "+n2 +" is: "+lcm);
    }
}
