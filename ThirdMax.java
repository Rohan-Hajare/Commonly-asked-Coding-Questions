package CompanyAptitudeQuestions;


public class ThirdMax {

        public static int thirdMax(int[] nums) {
            int fMax=nums[0];
            int sMax=Integer.MIN_VALUE;
            int tMax=Integer.MIN_VALUE;

            for(int i=0;i<nums.length;i++)
            {
                if(nums[i]>fMax)
                {
                    tMax=sMax;
                    sMax=fMax;
                    fMax=nums[i];
                }
                else if(nums[i]>sMax && nums[i]<fMax)
                {
                    tMax=sMax;
                    sMax=nums[i];
                }
                else if(nums[i]>tMax && nums[i]<sMax)
                {
                    tMax=nums[i];
                }
            }
            if(nums.length<3)
            {
                return fMax;
            }
            else
            {
                return tMax;
            }

        }

    public static void main(String[] args) {
  int a[]={1,1,2,5,3,7};
        System.out.println(thirdMax(a));
    }
    }

