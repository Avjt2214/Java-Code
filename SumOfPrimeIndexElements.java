/*Given an array, calculate sum of values of the indexes that are prime(prime index no wala elements der sum*/
import java.util.*;
class SumOfPrimeIndexElements{
    static int sum(int arr[], int n){
        int sum=0;
        for(int i=2; i<n; i++){
            int flag=0;
            for(int j=2; j<=i/2; j++){
                if(i%j==0){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                sum+=arr[i];
            }
        }
        return sum;
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
