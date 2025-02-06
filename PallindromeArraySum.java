/*Wap to take input of an integer array
Then print the sum of pallindrome nos

Sample input
5
11 3 45 4 77
Output
95*/
import java.util.*;
class PallindromeArraySum{
    public static int sum(int arr[]){
        int sum=0;
        for(int i=0; i<arr.length; i++){
            boolean pallin=true;
            int num=arr[i];
            int rev=0;
            while(num>0){
                rev=rev*10+(num%10);
                num/=10;
            }
            if(rev==arr[i]){
                sum+=arr[i];
            }
        }
        return sum;
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int size=sc.nextInt();
	    int arr[]=new int[size];
	    for(int i=0; i<size; i++){
	        arr[i]=sc.nextInt();
	    }
		System.out.println(sum(arr));
	}
}