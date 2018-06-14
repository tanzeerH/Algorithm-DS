package dp;

public class CombinationSumIV {

	
	public static void main(String[] args) {
		
		int [] a= {2,2,3};
		getSum(a,0,2);
		System.out.println(count);
	}
	 static int count =0;
    private static int getSum(int[] nums, int index, int target)
    {
    	//int c=count;
    	//System.out.println(index+"    "+ target);
        if(target == 0 )
        {
          count++;
         // System.out.println(index+" spc "+count);
          return 1;
        }
    
        if(target < 0)
            return 0;
        if(index >= nums.length)
            return 0;
       
    
       // for(int i = index; i < nums.length && nums[i] <= target; i++)
      //  { 
        //	System.out.println("calling from: "+ index+"    "+ target +"  "+c);
            getSum(nums,index,target - nums[index]);
           // System.out.println("calling from: "+ index+"    "+ target+"  "+c);
            getSum(nums,index+1,target) ;  
     //   }
        
        return 0;
           
    }
}
