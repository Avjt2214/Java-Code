/*equilibrium point of an array
where sum of elements of the left==sum of elements of the right of that index
if such index does not exist, return -1*/
import java.util.*;
class EquilibriumPointOfArrayBetter{
    public static int sum(int arr[], int n){
        int total_sum=0, left_sum=0;
        for(int i=0; i<n; i++){
            total_sum+=arr[i];
        }
        for(int i=0; i<n; i++){
            if(left_sum==total_sum-left_sum-arr[i]){
                return i;
            }
            left_sum+=arr[i];
        }
        return -1;
    }
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0; i<n; i++){
		    arr[i]=sc.nextInt();
		}
		System.out.println(sum(arr, n));
	}
}
