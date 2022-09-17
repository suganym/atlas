/*no of ways to reach the stairs
 * 1. Recursive method
 * 2. Top down Approach
 * 3. Bottom up Approach
 */
public class Stairs {

	 
    public static void main(String[] args) {
      Stairs a = new Stairs();
      int n = 5;
      System.out.println(a.noOfWaysToReachStairs(n));
      int[] arr = new int[n + 1];
      System.out.println(a.noOfWaysToReachStairsTopDown(arr, n));
      System.out.println(a.noOfWaysToReachStairsBottomUp(n));
    }

	
	//Recursive Method
	public int noOfWaysToReachStairs(int n) {
		if(n==0)
			return 1;
		if(n==1)
			return 1;
		if(n==2)
			return 2;
		
		return noOfWaysToReachStairs(n-1) + 
				noOfWaysToReachStairs(n-2) +
				noOfWaysToReachStairs(n-3);
	}

	//Top Down Approach
	public int noOfWaysToReachStairsTopDown(int[] arr, int n) {
		if(n==0)
			return 1;
		if(n==1)
			return 1;
		if(n==2)
			return 2;
		
		if(arr[n] == 0) {
		arr[n] = noOfWaysToReachStairsTopDown(arr, n-1)+
				noOfWaysToReachStairsTopDown(arr, n-2)+
				noOfWaysToReachStairsTopDown(arr, n-3);
 		}
		return arr[n];
	
	}
	//Bottom Up Approach
	public int noOfWaysToReachStairsBottomUp(int n) {
		int[] arr = new int[n+1];
		arr[0] = 1;
		arr[1] = 1;
		arr[2] = 2;
		
		for(int i=3; i<=n; i++) {
			arr[i] = arr[i-1] + arr[i-2] + arr[i-3];
		}
		return arr[n];
	}	
	
		}
	

