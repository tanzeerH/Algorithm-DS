package misc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class MonoIncreasing {

	public static void main(String[] args) {
		
		//System.out.println(monotoneIncreasingDigits(1));
		System.out.println(numFriendRequests());
	}
public static int monotoneIncreasingDigits(int N) {
        
        ArrayList<Integer> list = new ArrayList<>();
          
        while( N != 0)
        {
            list.add( N%10 );
            N/=10;
        }
        Collections.reverse(list);
  
      
        for (int i = 0; i<list.size() ; i++)
            for(int j = list.size() - 1 - i; j>=0; j-- )
            {
                if( j > 0 && list.get(list.size()-1-i) < list.get(j-1))
                {
                    list.set(j-1, list.get(j-1)-1);
                    for(int k = j; k<list.size(); k++)
                        list.set(k,9);
                    break;
                    
                }
            }
        int sum = 0;
        for(int i = 0; i <list.size() ; i++)
        {
        	sum=sum*10+ list.get(i);
        }
        return sum;
    }
public static int findLength() {
    
	int[] A = {1,2,3,2,1};
	int[] B = {3,2,1,4,7};
    int[] a = new int[B.length+1];
    int max = 0;
    for (int i = 0; i < A.length; i++ )
        for(int j = 0; j < B.length; j++ )
        {    
        	if( A[i] == B[j] )
        		a[j+1]= a[j]+1;
        	else
        		a[j+1] = 0;
             max = Math.max(max, a[j+1]);
            System.out.println(a[j+1]+"  "+max);
           
        }
    return max;
  }

public static int numFriendRequests() {
	int[] ages= {118,14,7,63,103};
    int [] nums = new int [121];
    int [] sums = new int [121];
    
    for(int i = 0 ; i < ages.length; i++)
        nums[ages[i]]++;
    for(int i = 1 ; i < 121; i++)
    {
        sums[i]=sums[i-1]+nums[i];
    
    }
    int count = 0;
    for (int i = 120; i>=1; i--)
    {
        if( nums[i] > 0)
        {
            int val = (int)( (0.5*i) + 7);
            if(val <= i && sums[i] != sums[val])
            {
              count+=nums[i]*(sums[i]-sums[val]-1);
              System.out.println(i +"   "+count +"  "+ val);
            }
        }
    }
    return count;
}
}
