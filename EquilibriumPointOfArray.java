/*equilibrium point of an array
where sum of elements of the left==sum of elements of the right of that index
if such index does not exist, return -1*/
import java.util.*;
class EquilibriumPointOfArray{
    public static int area(int arr[], int n){
        for(int i=0; i<n; i++){
            int left_sum=0, right_sum=0;
            for(int j=i+1; j<n; j++){
                right_sum+=arr[j];
            }
            for(int k=i-1; k>=0; k--){
                left_sum+=arr[k];
            }
            if(right_sum==left_sum){
                return i+1;
            }
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
		System.out.println(area(arr, n));
	}
}
