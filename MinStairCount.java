/* min no of jumps to reach the nth stair
 * possible steps = {1, 2, 3}
 */

public class MinStairCount {
	
	//Main method
		public static void main(String[] args) {
		MinStairCount a = new MinStairCount();
		int n = 8;
		System.out.println(a.minSteps(n));
		int[] arr = new int[n+1];
		System.out.println(a.minStepsTopDown(arr, n));
		System.out.println(a.minStepsBottomUp(n));
		System.out.println(a.minStepsBottomUpBetter(n));


	}
	
	//Recursive method
public int minSteps(int n) {
	if(n==0)
		return 0;
	if(n==1 || n==2 || n==3)
		return 1;
	
	return 1+ Math.min(Math.min(minSteps(n-1), minSteps(n-2)), minSteps(n-3));
	
	
}
//Top Down approach
public int minStepsTopDown(int[] arr, int n) {
	if(n==0)
		return 0;
	if(n==1 || n==2 || n==3)
		return 1;
	
	if(arr[n] ==0) {
		arr[n] = 1 + Math.min(Math.min(minStepsTopDown(arr, n-1), minStepsTopDown(arr, n-2)), 
				minStepsTopDown(arr, n-3));
	}
	return arr[n];
}
//Bottom Up Approach

public int minStepsBottomUp(int n) {
	int[] arr = new int[n+1];
	arr[0] = 0;
	arr[1] = 1;
	arr[2] = 1;
	
	for(int i=3; i<=n; i++) {
		arr[i] = 1 + Math.min(Math.min(arr[i-1], arr[i-2]), arr[i-3]);
	}

return arr[n];
}

//Better Bottom Up Approach

public int minStepsBottomUpBetter(int n) {
	int a =0;
	int b= 1;
	int c= 1;
	int d;
	
	for(int i=3; i<= n; i++) {
		d = 1 + Math.min(Math.min(a,b), c);
		
		a = b ;
		b= c;
		c=d;
	}
	return c;
}
}

