public class LargestElement 
{
  
    public int largestElement(int nums[])
    {
        for(int i=0;i<nums.length;i++)
        {
            boolean isLargest=true;
            for(int j=0;j<nums.length;j++)
            {
                if(nums[j]> nums[i])
                {
                    isLargest=false;
                    break;
                    
                }
            }
            if(isLargest)
            {
                return nums[i];
            }
        }
        return -1;
        
    }
    public static void main(String args[])
    {
        System.out.println("we are here for solving the problem");
        System.out.println("TO FINDING THE LARGEST ELEMENT IN AN ARRAY");
        int arr[]={10,20,30,49,29,50};
        LargestElement obj= new LargestElement();
        int result=obj.largestElement(arr);
        System.out.println("THE LARGEST ELEMENT IN AN ARRAY IS GIVEN BY:"+result);

    }
    
}
