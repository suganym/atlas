// Remove Duplicates from Sorted Array
/*Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]*/
		
public class RemoveDuplicated {
public static int main(int[] nums) {

	int i = 1;
	int j = 0;

while(i<nums.length){

	if(nums[i]!=nums[j])
	{
		j = j + 1;
	nums[j] = nums[i];
	
}
i++; 
}
return j+1;
}
}

