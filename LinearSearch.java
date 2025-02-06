/*Linear search*/
import java.util.*;
class Main{
	public static void main(String[] args){
	    int i;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(i=0; i<n; i++){
		    arr[i]=sc.nextInt();
		}
		int item=sc.nextInt();
		for(i=0; i<n; i++){
		    if(arr[i]==item){
		        System.out.println("Item found at index: "+i);
		        break;
		    }
		}
		if(i>=n){
		    System.out.println("Item is not inside the input array");
		}
	}
}
