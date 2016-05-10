//import java.util.Arrays;
class Solution{
	public int removeDuplicates(int[] nums) {
        int length = nums.length;
        if(length==0) 
        	return 0;
        int count = 1;
        for(int i=1; i<length; i++){
        	if(nums[i]==nums[i-1]){
        		continue;
        	} else {
        		nums[count]=nums[i];
        		count++;
        	}
        }
        return count;
    }
}
public class RmDupSortedArray {
	public static void main(String[] args) {
		int[] a = {1, 1, 2, 2, 2, 3, 4, 5};
		Solution s1 = new Solution();
		int res = s1.removeDuplicates(a);
		System.out.println("Result is: "+res);
		//System.out.println("array is: "+Arrays.toString(a));
	}
}
