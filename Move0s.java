package CompanyAptitudeQuestions;

public class Move0s {

    public static void main(String[] args) {


        int a[] = {3,1,0,2,0,1};
//        moveToRight(a);
//        moveToLeft(a);
        anotherWay(a);

        // another way
    }

    public static void  moveToRight(int[] a)
    {
       int i=0;
       for(int j=0;j<a.length;j++)
       {
           if(a[j]!=0)
           {
              int temp=a[i];
               a[i]=a[j];
               a[j]=temp;
               i++;
           }
       }

        for (int k = 0; k < a.length; k++) {
            System.out.print(a[k] + " ");
        }
        System.out.println();

    }
    public static void moveToLeft(int[] a) {
     int temp=0;
     int i=a.length-1;
     for(int j=a.length-1; j >= 0; j--) {
         if(a[j]!=0)
         {
             temp=a[i];
             a[i]=a[j];
             a[j]=temp;
             i--;
         }
     }

        for (int k = 0; k < a.length; k++) {
            System.out.print(a[k] + " ");
        }
        System.out.println();


    }


    static void anotherWay(int[] arr)
    {
        int insertPos=0;

        for(int num:arr)
        {
            if(num!=0) {
                arr[insertPos++] = num;
            }
        }

        while(insertPos<arr.length)
        {
            arr[insertPos++]=0;
        }

        for(int num:arr)
        {
            System.out.print(num+",");
        }
    }
}
