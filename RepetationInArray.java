/*You are given an integer array containing the IDs of a product.
Write a program to calculate the number of repetitions of the given ID in the array and return the count.*/
import java.util.*;
class RepetationInArray{
    public static int repeat(int arr[], int check){
        int count=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==check){
                count++;
            }
        }
        if(count<=1){
            return 0;
        }
        return count;
    }
	public static void main(String[] args){
	    Scanner sc =new Scanner(System.in);
	    int n=sc.nextInt();
	    int[] arr=new int[n];
	    for(int i=0; i<n; i++){
	        arr[i]=sc.nextInt();
	    }
	    int check=sc.nextInt();
		System.out.println(repeat(arr, check));
	}
}