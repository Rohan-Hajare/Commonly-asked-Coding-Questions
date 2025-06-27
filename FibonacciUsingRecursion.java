package CompanyAptitudeQuestions;

public class FibonacciUsingRecursion {
static int a=0;
static int b=1;
static int c;
   static  int total=0;
    public static void main(String[] args) {

        System.out.print(a+" "+b);
        printFibo(7);
        System.out.println("\n"+total);

    }

    static void printFibo(int n)
    {
        if(n-2>0)
        {
            c=a+b;
            System.out.print(" "+c);
            total+=c;
            a=b;
            b=c;
            printFibo(n-1);

        }

         return;

    }

}
