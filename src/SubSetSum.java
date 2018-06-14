import java.util.HashSet;

public class SubSetSum {

	public static void main(String[] args) {
		
		SubSetSum subSetSum=new SubSetSum();
		int[] a= {2,5,11,17,1};
		System.out.println(subSetSum.canPartition(a));
	}
	 public boolean canPartition(int[] nums) {
	        
	        int sum = 0;
	        for(int i = 0 ; i < nums.length; i++)
	            sum+=nums[i];
	        if(sum % 2 == 1)
	            return false;
	        int target = sum/2;
	        HashSet<Integer>  set = new HashSet<>();
	        for(int i = 0; i < nums.length; i++)
	        {
	            
	            HashSet<Integer> mySet= new HashSet<>();
	            if(nums[i] == target )
	                return true;
	             mySet.add(nums[i]);
	            for(int j : set)
	            {
	            	System.out.println(j);
	                int val = j + nums[i];
	                if(val == target)
	                    return true;
	                mySet.add(val);
	            }
	            
	            set.addAll(mySet);
	        }
	        return false;
	    }
}
