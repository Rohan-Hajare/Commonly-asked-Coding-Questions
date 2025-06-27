package CompanyAptitudeQuestions;

public class RemoveDuplicates {



    public static void main(String[] args) {

        // remove duplicate elements from the array
          int a[]={10,20,10,30,40,30,50};
        int[] r = RemoveDuplicates.removeDuplicateElements(a);
        for(int s:r) {
            System.out.println(s);
        }

        //remove duplicate elements from sorted array
        int b[]={0,0,1,1,1,2,2,3};
        removeFromSorted(b);
        for(int k:b) {
            System.out.print(k);
        }

    }

    static int[] removeDuplicateElements(int[] a)
    {
        int[] distinct = new int[a.length];
         int k=0;

        for (int i =0; i < a.length; i++)
        {
            boolean found = false;
          for(int j =0;j<k;j++)
          {
              if(a[i]==distinct[j])
              {
                 found = true;
                 break;
              }

          }

          if(!found)
          {
              distinct[k++] =a[i];
          }


        }
        int[] result=new int[k];
        for(int r=0;r<k;r++)
        {
            result[r] = distinct[r];
        }
        return result;
    }


    static void removeFromSorted(int[] a)
    {
        int index=1;
        for(int i=index+1;i<a.length;i++)

        {
            if(a[i]!=a[i-1])
            {
                a[index]=a[i];

                index++;
            }

        }
    }

}
//{10,20,10,30,40,30,50}
 // 10,10,30,40,30
